package com.mexiti.catphotoapp.fake

import com.mexiti.catphotoapp.data.NetworkCatPhotoRepository
import kotlinx.coroutines.test.runTest
import org.junit.Test;
import org.junit.Assert.*

 class NetworkCatPhotoRepositoryTest {
    @Test
    fun networkCatPhotoRepository_getCatPhotos_verifyPhotplist(){
    runTest { //sirve para probar las corrutines
        val repository = NetworkCatPhotoRepository(
            catApiService = FakeCatApiService()
        )
        assertEquals(FakeDataSource.photoList, repository.getCatPhoto())
    }


    }
}