package me.rahul.dagger.learning.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import me.rahul.dagger.learning.MyApplication
import me.rahul.dagger.learning.data.local.FileStorageServices
import me.rahul.dagger.learning.data.remote.HttpClient
import me.rahul.dagger.learning.di.ApplicationContext
import me.rahul.dagger.learning.di.DatabaseName
import me.rahul.dagger.learning.di.DatabaseVersion
import me.rahul.dagger.learning.di.NetworkApiKey
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context {
        return application
    }

    @Singleton
    @Provides
    fun provideHttpClient(): HttpClient {
        return HttpClient()
    }

    @Provides
    @DatabaseName
    fun provideDatabaseName(): String = "dummy_db"

    @Provides
    @DatabaseVersion
    fun provideDatabaseVersion(): Int = 1

    @Provides
    @NetworkApiKey
    fun provideNetworkKey(): String = "some_api_key"

    @Singleton
    @Provides
    fun provideFileStorageService(): FileStorageServices {
        return FileStorageServices()
    }

}