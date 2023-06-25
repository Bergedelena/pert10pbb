package com.example.pertemuan9.network

import com.example.pertemuan9.model.request.Mahasiswa
import com.example.pertemuan9.model.response.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    @GET("datamahasiswa/")
    fun getDataMahasiswa() : Call<ResponseDataMahasiswa>

    @GET("datamahasiswa/{nim}")
    fun getDetailMahasiswa(@Path("nim") nim : String ) : Call<ResponseDetailMahasiswa>

    @POST("datamahasiswa/")
    fun addDataMahasiswa(@Body data : Mahasiswa) : Call<ResponseAddMahasiswa>

    @POST("datamahasiswa/{nim}")
    fun updateDataMahasiswa(@Path("nim") nim : String, @Body data : Mahasiswa) : Call<ResponseUpdateMahasiswa>

    @DELETE("datamahasiswa/{nim}")
    fun deleteDataMahasiswa(@Path("nim") nim : String) : Call<ResponseDeleteMahasiswa>
}