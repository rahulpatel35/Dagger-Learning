package me.rahul.dagger.learning.di.module

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import me.rahul.dagger.learning.di.ActivityContext

@Module
class ActivityModule(var activity: Activity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return activity
    }

}
