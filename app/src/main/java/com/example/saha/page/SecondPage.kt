package com.example.saha.page

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SecondPage(navController: NavController) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 10.dp), horizontalArrangement = Arrangement.Center) {
        Text(
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            text = "Теория",
        color = Color.DarkGray)
        //val items = listOf("Фонетика", "Использование подлежащих", "Конструкции");
        //var number = remember { mutableStateOf(0) }
        //var idit = number.value;   ,modifier = Modifier.clickable { number.value=1 }

        }
    Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp)) {
        Column( modifier = Modifier.padding(horizontal = 60.dp, vertical = 110.dp)) {
            //Button(onClick = {navController.navigate(NavRoute.GrammassPage.route)})
            {}

        }
        Column(modifier = Modifier.padding(vertical = 170.dp, horizontal = 60.dp)) {
            //Button(onClick = {navController.navigate(NavRoute.Grammass2Page.route)})
            {}
        }
    }



}