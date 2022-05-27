package com.example.saha.page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SlovaryPage (navController: NavController) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray,
            text = "Словарь")
    }

}