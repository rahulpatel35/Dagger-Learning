package me.rahul.dagger.learning.ui.home

import me.rahul.dagger.learning.data.local.DatabaseService
import me.rahul.dagger.learning.data.local.FileStorageServices
import me.rahul.dagger.learning.data.remote.NetworkServices
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkServices: NetworkServices,
    private val fileStorageServices1: FileStorageServices,
    private val fileStorageServices2: FileStorageServices
) {
    fun getSomeData(): String {
        return "DatabaseServices :" + databaseService.getDummyData() + "\n" +
                "DatabaseServicesHashcode : " + databaseService.hashCode() + "\n" +
                "NetworkServices : " + networkServices.getDummyData() + "\n" +
                "NetworkServicesHashcode : " + networkServices.hashCode() + "\n" +
                "FileStorageService1HashCode : " + fileStorageServices1.hashCode() + "\n" +
                "FileStorageService2HashCode : " + fileStorageServices2.hashCode() + "\n"
    }
}