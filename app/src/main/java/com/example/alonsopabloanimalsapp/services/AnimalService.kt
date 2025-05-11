package com.example.alonsopabloanimalsapp.services

import com.example.alonsopabloanimalsapp.models.Animal
import com.example.alonsopabloanimalsapp.models.Environment
import retrofit2.http.GET
import retrofit2.http.Path

interface AnimalService {

    @GET("animals")
    suspend fun getAnimals(): List<Animal>

    @GET("animals/{id}")
    suspend fun getAnimalById( @Path("id") id:String) : Animal

    @GET("environments")
    suspend fun getEnvironments(): List<Environment>

    @GET("environments/{id}")
    suspend fun getEnvironmentById ( @Path("id") id: String) : Environment
}