package me.rahul.dagger.learning.di.component

import dagger.Component
import me.rahul.dagger.learning.ui.main.MainActivity
import me.rahul.dagger.learning.di.ActivityScope
import me.rahul.dagger.learning.di.module.ActivityModule

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

}
