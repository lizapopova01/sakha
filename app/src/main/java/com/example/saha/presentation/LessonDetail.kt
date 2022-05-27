package com.example.saha.presentation

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.saha.database.Lesson
import com.example.saha.database.LessonService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Composable
fun LessonDetail(lessonId: String?) {
    val lesson: MutableState<Lesson?> = remember {
        mutableStateOf(null)
    }
    Scaffold(
        modifier = Modifier.fillMaxWidth(),
        topBar = {
            TopAppBar(
                elevation = 2.dp,
                backgroundColor = Color.Transparent
            ) {
                Text(
                    text = "Урок $lessonId",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                val retrofit: Retrofit =
                    Retrofit
                        .Builder()
                        .baseUrl("https://itcube.goykt.ru/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                CoroutineScope(Dispatchers.IO).launch {
                    val lessons =
                        retrofit.create(LessonService::class.java).detailLesson(lessonId).execute()
                    val result: Lesson = lessons.body() as Lesson
                    lesson.value = result
                }

            }) {
                Text(text = "Получить информацию об уроке")
            }
            Column(
                modifier = Modifier
                    .padding(10.dp, 10.dp)
                    .fillMaxSize()
                    .verticalScroll(
                        ScrollState(1)
                    ), verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                lesson.value?.let { Text(text = it.title, fontWeight = FontWeight.Bold, fontSize = 21.sp) }
                Text(text = "  ", fontSize = 5.sp)
                lesson.value?.let { Text(text = it.text) }
            }


        }
    }
}