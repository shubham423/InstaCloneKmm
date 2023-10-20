package com.example.instaclonekmm.android

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.instaclonekmm.android.auth.NavGraphs
import com.ramcosta.composedestinations.DestinationsNavHost

@Composable
fun InstaApp() {
    val navHostController = rememberNavController()
    DestinationsNavHost(navGraph = NavGraphs.root, navController = navHostController)
}