package com.mexiti.catphotoapp.fake

import com.mexiti.catphotoapp.data.CatPhotoRepository
import com.mexiti.catphotoapp.model.CatPhoto
import kotlinx.coroutines.test.runTest

class FakeNetworkCatPhotoRepository: CatPhotoRepository {
    override suspend fun getCatPhoto(): List<CatPhoto> {
        return FakeDataSource.photoList
    }
}