package com.example.cleanarchitecturepetproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class LetterAdapter : RecyclerView.Adapter<LetterAdapter.LetterViewHolder>() {


    // Generates a [CharRange] from 'A' to 'Z' and converts it to a list
    private val list = ('A').rangeTo('Z').toList()

    /**
     * Provides a reference for the views needed to display items in your list.
     */
    class LetterViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val button = view.findViewById<Button>(R.id.button_item)
    }

    /**
     * Creates new views with R.layout.item_view as its template
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LetterViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_view, parent, false)

        // Setup custom accessibility delegate to set the text read
        layout.accessibilityDelegate = WordAdapter
        return LetterViewHolder(layout)
    }



    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: LetterViewHolder, position: Int) {
        val item = list.get(position)
        holder.button.text = item.toString()

        holder.button.setOnClickListener {
            val action = LetterListFragmentDirections.actionLetterListFragmentToWordListFragment(letter = holder.button.text.toString())
//                LetterListFragmentDirections.actionLetterListFragmentToWordListFragment2(letter = holder.button.text.toString())
            holder.view.findNavController().navigate(action)
        }
    }

//    val action = LetterListFragmentDirections.actionLetterListFragmentToWordListFragment(letter = holder.button.text.toString())


}