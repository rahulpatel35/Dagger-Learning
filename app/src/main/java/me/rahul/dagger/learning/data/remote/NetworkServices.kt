package me.rahul.dagger.learning.data.remote

import android.content.Context
import me.rahul.dagger.learning.di.ApplicationContext
import me.rahul.dagger.learning.di.NetworkApiKey
import javax.inject.Inject

class NetworkServices @Inject constructor(
    private var httpClient: HttpClient,
    @ApplicationContext private val context: Context,
    @NetworkApiKey private val apiKey: String
) {
    fun getDummyData(): String {
        return "Network Dummy Data"
    }
}