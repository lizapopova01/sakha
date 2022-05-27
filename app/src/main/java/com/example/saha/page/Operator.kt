package com.example.saha.page

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.saha.presentation.LessonDetail
import com.example.saha.presentation.LessonsList

@Composable
fun Operator() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "LessonsList") {
        composable("LessonsList") { LessonsList(navController) }
        composable("LessonDetail/{lessonId}") { backStackEntry ->
            LessonDetail(backStackEntry.arguments?.getString("lessonId"))
        }
    }
}