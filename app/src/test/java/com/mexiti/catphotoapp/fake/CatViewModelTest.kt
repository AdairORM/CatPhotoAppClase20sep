package com.mexiti.catphotoapp.fake

import com.mexiti.catphotoapp.viewmodel.CatUiState
import com.mexiti.catphotoapp.viewmodel.CatViewModel
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.Assert.*
import org.junit.Rule
import com.mexiti.catphotoapp.rules.TestDispatcherRule

class CatViewModelTest {
    @get:Rule
    val testDispatcher = TestDispatcherRule()
    @Test
    fun CatViewModel_getCatPhotos_verifyCatUiStateSucces(){


        runTest {
            val catViewModel = CatViewModel(
                catPhotoRepository = FakeNetworkCatPhotoRepository()
            )
            assertEquals(CatUiState.Success(FakeDataSource.photoList),catViewModel.catUiState)

        }


    }

}


