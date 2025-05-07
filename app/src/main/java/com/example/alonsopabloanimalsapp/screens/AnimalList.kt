package com.example.alonsopabloanimalsapp.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.alonsopabloanimalsapp.ui.theme.AlonsoPabloAnimalsAppTheme

@Composable
fun AnimalListScreen(paddingValues: PaddingValues) {

}

@Preview
@Composable
fun AnimalListPreview() {
    AlonsoPabloAnimalsAppTheme {
        AnimalListScreen(paddingValues = PaddingValues(10.dp))
    }
}