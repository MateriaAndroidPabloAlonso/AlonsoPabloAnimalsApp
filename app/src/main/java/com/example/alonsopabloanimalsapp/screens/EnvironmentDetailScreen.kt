package com.example.alonsopabloanimalsapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.alonsopabloanimalsapp.models.Environment

@Composable
fun EnvironmentDetailScreen(
    innerPadding : PaddingValues,
    environmentId: String
) {
    Column (
        modifier = Modifier
            .padding(innerPadding)
    ){
        Text(text = environmentId)
    }
}