package me.rahul.dagger.learning.di.component

import dagger.Component
import me.rahul.dagger.learning.di.FragmentScope
import me.rahul.dagger.learning.di.module.FragmentModule
import me.rahul.dagger.learning.ui.home.HomeFragment

@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])

interface FragmentComponent {
    fun inject(fragment: HomeFragment)
}