package com.example.alonsopabloanimalsapp.screens

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.alonsopabloanimalsapp.models.Environment
import com.example.alonsopabloanimalsapp.services.AnimalService
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Composable
fun EnvironmentDetailScreen(
    innerPadding : PaddingValues,
    environmentId: String,
    navController : NavController
) {
    var BASE_URL = "https://animals.juanfrausto.com/api/"
    val scope = rememberCoroutineScope()
    var environment by remember {
        mutableStateOf<Environment?>(null)
    }
    var isLoading by remember {
        mutableStateOf(false)
    }

    LaunchedEffect(key1 = true) {
        scope.launch {
            try {
                val retrofitBuilder = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                val animalService = retrofitBuilder.create(AnimalService::class.java)
                environment = animalService.getEnvironmentById(environmentId)
                isLoading = false
                Log.i("Environment Detail Screen", environment.toString())
            }
            catch (e: Exception) {
                Log.e("ERROR", e.toString())
            }
        }
    }


    if (isLoading) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
    } else {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(vertical = 20.dp)
        ) {
            Text(
                text = environmentId,
                color = Color.White
            )

        }
    }
}