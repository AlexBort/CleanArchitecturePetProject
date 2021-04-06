package com.example.cleanarchitecturepetproject.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanarchitecturepetproject.R
import com.example.cleanarchitecturepetproject.models.Hero
import java.util.*
import kotlin.collections.HashSet

class HeroAdapter : RecyclerView.Adapter<HeroAdapter.ViewHolder>() {

    private val mHeroList: MutableList<Hero> = LinkedList()
    private val listSet: HashSet<Hero> = HashSet() // unique elements

    fun setDataToCollectionSet(newSet: HashSet<Hero>) {
        listSet.addAll(newSet)
        notifyDataSetChanged()
    }

    fun setData(newHeroes: List<Hero>) {
        mHeroList.clear()
        mHeroList.addAll(newHeroes)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) { // it's showed one view-element

        private val txtTitle: TextView = itemView.findViewById(R.id.txtTitle)
        private val txtAttackType: TextView = itemView.findViewById(R.id.txtAttackType)
        private val imgAvatar: ImageView = itemView.findViewById(R.id.imgAvatar)


        fun bind(hero: Hero) {
            txtTitle.text = hero.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.cell_hero, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(hero = mHeroList[position])
    }

    override fun getItemCount(): Int {
        return mHeroList.size
    }

}