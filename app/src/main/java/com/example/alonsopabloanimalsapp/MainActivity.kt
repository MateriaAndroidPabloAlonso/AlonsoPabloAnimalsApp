package com.example.alonsopabloanimalsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.alonsopabloanimalsapp.screens.AnimalListScreen
import com.example.alonsopabloanimalsapp.screens.EnvironmentListScreen
import com.example.alonsopabloanimalsapp.ui.theme.AlonsoPabloAnimalsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AlonsoPabloAnimalsAppTheme {
                var selectedScreen by remember {
                    mutableStateOf("animal-list")
                }
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                        .background(Color(0xFF0C3611)),
                    contentColor = Color.Transparent,
                    containerColor = Color.Transparent,
                    bottomBar = {
                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 50.dp).padding(horizontal = 40.dp)
                                .background(Color(0xFFAEB044), shape = RoundedCornerShape(40.dp))

                        ) {
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.Absolute.SpaceBetween
                            ) {
                                NavigationBarItem(
                                    selected = selectedScreen == "animal-list",
                                    onClick = {
                                        selectedScreen = "animal-list"
                                        navController.navigate("animal-list")
                                    },
                                    icon = {
                                        Row (
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.pets_24dp_e3e3e3_fill0_wght400_grad0_opsz24),
                                                contentDescription = "Animals",
                                                modifier = Modifier.padding(end = 8.dp).size(32.dp),
                                                colorFilter = ColorFilter.tint(Color.Black)
                                            )
                                            Text(
                                                text = "Inicio",
                                                color = Color.Black,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    },
                                    colors = NavigationBarItemDefaults.colors(
                                        indicatorColor = Color.Transparent
                                    )
                                )
                                NavigationBarItem(
                                    selected = selectedScreen == "environment-list",
                                    onClick = {
                                        selectedScreen = "environment-list"
                                        navController.navigate("environment-list")
                                    },
                                    icon = {
                                        Row (
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.environmentnav),
                                                contentDescription = "Environments",
                                                modifier = Modifier.padding(end = 8.dp).size(32.dp),
                                                colorFilter = ColorFilter.tint(Color.Black)
                                            )
                                            Text(
                                                text = "Ambientes",
                                                color = Color.Black,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    },
                                    colors = NavigationBarItemDefaults.colors(
                                        indicatorColor = Color.Transparent
                                    )
                                )
                            }
                        }

                    }

                ) { innerPadding ->
                    NavHost(
                        navController = navController, startDestination = "animal-list"
                    ) {
                        composable(route = "animal-list") {
                            AnimalListScreen(
                                innerPadding = innerPadding, navController = navController
                            )
                        }
                        composable(route = "environment-list") {
                            EnvironmentListScreen(
                                innerPadding = innerPadding, navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

