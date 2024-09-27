package com.mexiti.catphotoapp.data
import com.mexiti.catphotoapp.network.CatApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer{
    val catPhotoRepository: CatPhotoRepository
}
class DefaultAppContainer: AppContainer{
    private val baseUrl = "https://api.thecatapi.com"
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType())).
            baseUrl(baseUrl).build()
    private val retrofitService: CatApiService by lazy {
        retrofit.create(CatApiService:: class.java)
    }
    override val catPhotoRepository: CatPhotoRepository by lazy{
        NetworkCatPhotoRepository(retrofitService)
    }

}