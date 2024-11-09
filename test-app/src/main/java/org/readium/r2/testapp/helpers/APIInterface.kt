package org.readium.r2.testapp.helpers

import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {

    @GET("posts")
    fun getData():Call<List<APIDataItem>>
}