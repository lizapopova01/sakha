package com.example.saha.page

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
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
fun Grammas(navController: NavController){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp), horizontalArrangement = Arrangement.Center
    )
    {
        Text(
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold, text = "Алфавит",
            color = Color.DarkGray
        )

    }
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 50.dp, horizontal = 10.dp)
        .verticalScroll(ScrollState(1))) {
        Text(text = "Современный якутский алфавит состоит из 40 букв: 33 знака представляют собой" +
                "буквы русского языка, а остальные 7 букв введены дополнительно для обозначения " +
                "специфических звуков якутского языка.")
        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 10.dp), horizontalArrangement = Arrangement.Center) {
            Text(text = "Аа, Бб, Вв, Гг, Дд, Ее, Ёё, Жж, Зз, Ии, " +
                    "Йй, Кк, Лл, Мм, Нн, НГнг, Ньнь, Оо, Оюою, Пп, Рр, Сс," +
                    "hh, Тт, Уу, Yy, Фф, Хх, Цц, Чч, Шш, Щщ, ъ, Ыы, ь, Ээ, Юю, Яя")
        }
        Text(text = "Эти же буквы используются для обозначания долгих гласных (аа, ии, оо и т.д.), дифтонгов( ыа, иэ, уо, уою)," +
                "удвоенных согласных ( кк, пп, тт, и т.п.)")
        Row(modifier = Modifier.padding(vertical = 20.dp)) {
            Text(text = "С точки зрения употребления и произнешения юуквы якутского алфавита можно поделить на следующие группы:" +
                    "1) буквы, которые обозначают звуки, однаковые в русском и якутском языках; 2) буквы, которым соответствуют звуки, произносимые" +
                    "несколько иначе по сравнению с руским языком; 3) юуквы, употребляемые только в заимствованных словах, принятых в русском написании;" +
                    " 4) буквы, употребляемые только в коренных якутских словах.")
        }
        Row(modifier = Modifier.padding(vertical = 10.dp)) {
            Text(text = "К первой группе относяться буквы: а, б, в, г, д, и (й), к, л, м, н, п, р, с, т, у, (х), ч, ы, (ь)")
        }
        Row(modifier = Modifier.padding(vertical = 10.dp)) {
            Text(text = "Ко второй группе относясться буквы: о и э")
        }
        Row(modifier = Modifier.padding(vertical = 10.dp)) {
            Text(text = "Третью группу состовляют: в, е, ё, ж, з, ф, ц, ш, щ, ъ, ю, я")
        }
        Row(modifier = Modifier.padding(vertical = 10.dp)) {
            Text(text = "К четвёртой группе относяться буквы: 5, дь, нг, ою, h, y")
        }

    }

}