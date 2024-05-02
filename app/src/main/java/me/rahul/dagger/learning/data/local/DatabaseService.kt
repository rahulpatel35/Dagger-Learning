package me.rahul.dagger.learning.data.local

import android.content.Context
import me.rahul.dagger.learning.di.ApplicationContext
import me.rahul.dagger.learning.di.DatabaseName
import me.rahul.dagger.learning.di.DatabaseVersion
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseService @Inject constructor(
    @ApplicationContext private var context: Context,
    @DatabaseName private val databaseName: String,
    @DatabaseVersion private val databaseVersion: Int
) {
    fun getDummyData(): String {
        return "DATABASE_DUMMY_DATA"
    }
}