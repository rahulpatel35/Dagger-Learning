package me.rahul.dagger.learning.di.component

import android.content.Context
import dagger.Component
import me.rahul.dagger.learning.MyApplication
import me.rahul.dagger.learning.data.local.DatabaseService
import me.rahul.dagger.learning.data.local.FileStorageServices
import me.rahul.dagger.learning.data.remote.NetworkServices
import me.rahul.dagger.learning.di.ApplicationContext
import me.rahul.dagger.learning.di.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkServices

    fun getDataBaseService(): DatabaseService

    fun getFileStorageServices(): FileStorageServices
}