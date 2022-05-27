package com.example.saha.page

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.createBitmap


import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.saha.R


@Composable
fun MainPage(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 10.dp), horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold, text = "Sakha Study",
            color = Color.DarkGray
        )

    }
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 10.dp)) {
        Column(
            modifier = Modifier.padding(horizontal = 30.dp, vertical = 110.dp),
            verticalArrangement = Arrangement.spacedBy(225.dp)
        ) {
            Image(painter = painterResource(R.drawable.ellipse_1_2), contentDescription = "Hi", contentScale = ContentScale.FillHeight )

            }
            Column(
                modifier = Modifier.padding(vertical = 170.dp, horizontal = 10.dp),
                verticalArrangement = Arrangement.spacedBy(300.dp)
            ) {
                Image(painter = painterResource(R.drawable.component_1__1_), contentDescription = "Hi", contentScale = ContentScale.FillHeight )
        }
    }
    //Row(modifier = Modifier
    //    .fillMaxWidth().padding(vertical = 390.dp), horizontalArrangement = Arrangement.SpaceBetween) {
    //    Image(painter = painterResource(R.drawable.ellipse_1), contentDescription = "Hi", contentScale = ContentScale.FillHeight )
    //    Button(onClick = { navController.navigate(NavRoute.SecondPage.route) }) {}
    //    Button(onClick = { navController.navigate(NavRoute.SlovaryPage.route) }) {}
    //    Button(onClick = { navController.navigate(NavRoute.ExercisePage.route) }) {}
//
    //}

}











