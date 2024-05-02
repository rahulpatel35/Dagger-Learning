package me.rahul.dagger.learning

import android.app.Application
import me.rahul.dagger.learning.di.component.ApplicationComponent
import me.rahul.dagger.learning.di.component.DaggerApplicationComponent
import me.rahul.dagger.learning.di.module.ApplicationModule

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }

    private fun getDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this)) // this application module not created whenever
            // we are create provide context in application module and get context in application component
            .build()
        applicationComponent.inject(this)
    }
}