package com.mexiti.catphotoapp.fake

import com.mexiti.catphotoapp.model.CatPhoto

object FakeDataSource{

    const val idOne = "idCatOne"
    const val idTwo = "idCatTwo"
    const val imgOne = "https://urlOne"
    const val imgTwo = "https://urlTwo"
    const val widthOne= 512
    const val heigtOne = 512
    const val widthTwo= 256
    const val heigtTwo = 256

    val photoList = listOf(
        CatPhoto(
            idOne, imgOne, widthOne, heigtOne
        ),
        CatPhoto(idTwo, imgTwo, widthTwo, heigtTwo)
    )
}