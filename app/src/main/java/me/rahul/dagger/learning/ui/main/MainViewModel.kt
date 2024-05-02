package me.rahul.dagger.learning.ui.main

import me.rahul.dagger.learning.data.local.DatabaseService
import me.rahul.dagger.learning.data.remote.NetworkServices
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkServices: NetworkServices
) {
    fun getSomeData(): String {
        return "database hashcode : " + databaseService.hashCode() + "/n" + "network hashcode" + networkServices.hashCode()
    }
}