package com.example.cleanarchitecturepetproject.views

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.cleanarchitecturepetproject.models.Hero

@StateStrategyType(value = AddToEndSingleStrategy::class)
interface HeroListView : MvpView {
    fun showHeroes(data: List<Hero>)
    fun showLoading()
}