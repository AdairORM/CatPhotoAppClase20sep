package com.mexiti.catphotoapp.fake

import com.mexiti.catphotoapp.model.CatPhoto
import com.mexiti.catphotoapp.network.CatApiService

class FakeCatApiService: CatApiService {
    override suspend fun getPhotos(): List<CatPhoto> {
       return FakeDataSource.photoList
    }
}