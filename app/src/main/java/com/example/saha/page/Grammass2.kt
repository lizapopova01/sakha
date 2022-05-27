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
fun Grammass2(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp)
            .verticalScroll(ScrollState(1)), horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold, text = "Мангнайгы уруок ( первый урок )",
            color = Color.DarkGray
        )
        Text(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold, text = "Тыллар ( слова )",
            color = Color.DarkGray
        )
        //Row(modifier = Modifier
            //.fillMaxWidth()
            //.padding(horizontal = 10.dp)) {
            //Column(modifier = Modifier
            //    .padding(vertical = 10.dp)){
             //   Row() { Text(text = "бу - это, этот, эта, вот", fontWeight = FontWeight.Bold) }
            //    Row() { Text(text = "ол - то, тот, та; вон", fontWeight = FontWeight.Bold) }
            //    Row() { Text(text = "манна - здесь, сюда, тут", fontWeight = FontWeight.Bold) }
            //    Row() { Text(text = "онно - там, туда", fontWeight = FontWeight.Bold) }
             //   Row() { Text(text = "ханна - где, куда", fontWeight = FontWeight.Bold) }
           //     Row() { Text(text = "ким - кто туох - что тугуй - что", fontWeight = FontWeight.Bold) }
            //    Row() { Text(text = "", fontWeight = FontWeight.Bold) }
           //     Row() { Text(text = "", fontWeight = FontWeight.Bold) }
            ///    Row() { Text(text = "дуо - ли суох - нет, отсутствует баар - есть, имеется, находится кылаас - класс", fontWeight = FontWeight.Bold) }
            //    Row() { Text(text = "", fontWeight = FontWeight.Bold) }
            //    Row() { Text(text = "", fontWeight = FontWeight.Bold) }
            //    Row() { Text(text = "", fontWeight = FontWeight.Bold) }
            //}
            //Column(modifier = Modifier
            //    .padding(horizontal = 10.dp)) {
            //    Row() { Text(text = "остуол - стол олоппос - стул ыскамыайка - скамейка", fontWeight = FontWeight.Bold) }
            //    Row() { Text(text = "", fontWeight = FontWeight.Bold) }
           //     Row() { Text(text = "", fontWeight = FontWeight.Bold) }
            //    Row() { Text(text = "тyннyк - окно оhох - печка аан - дверь тур - стой, встань", fontWeight = FontWeight.Bold) }
            //    Row() { Text(text = "", fontWeight = FontWeight.Bold) }
            //    Row() { Text(text = "", fontWeight = FontWeight.Bold) }
           ////     Row() { Text(text = "", fontWeight = FontWeight.Bold) }
             //   Row() { Text(text = "турар - стоит, встаёт бар - уходи, иди ( туда ) кэл - приходи, иди ( сюда ) олор - садись, сиди; живи олорор - сидит; живёт", fontWeight = FontWeight.Bold) }
            ///    Row() { Text(text = "", fontWeight = FontWeight.Bold) }
            //   Row() { Text(text = ", fontWeight = FontWeight.Bold) }
            //    Row() { Text(text = "", fontWeight = FontWeight.Bold) }
            //    Row() { Text(text = "", fontWeight = FontWeight.Bold) }
           // }


            Column(
                modifier = Modifier
                   .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold, text = "Читайте и переведите",
                    color = Color.DarkGray
                )}
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding( horizontal = 10.dp)) {
                Text(text = "Бу кылаас. Манна остуол, олоппос, ыскамыайка баар. Онно оhох турар. Бу аан баар. Бу" +
                        " Сергей олорор. Онно Семён олорор. Ол Иван турар. Иван кэл, манна олор. Миахил, бар, онно тур." +
                        "Бу тугуй? Ол тyннyк. Аан ханна баар? Аан бу баар. Манна ким олорор? Манна Сергей олорор. Лиха ханна олорор?" +
                       " Лиза онно олорор. Иван олорор дуо? Суох, Иван турар. Ол ким турар? Ол Иван турар. Манна Пётр баар дуо? Суох, манна Пётр суох.")
                }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp), horizontalAlignment = Alignment.CenterHorizontally)
            {
                Text(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold, text = "Сведения из грамматики",
                    color = Color.DarkGray
                )}
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp, horizontal = 10.dp)) {
                Text(text = "1. В предложении сказуемое обычно ставиться на последнее место. В вопросительном предложении" +
                        " частица дуо ставиться после сказуемого.")
                Text(text = "2. Якутский язык не различает граматического рода: бу означает <<это, этот, эта>>, ол означает <<то, тот, та>>.")
                Text(text = "3. Собственный имена и терминыЮ взятые из русского языка, пишутся по-русски.")
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp), horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold, text = "Переведите на якутский язык",
                    color = Color.DarkGray
                )}

            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp, horizontal = 10.dp)) {
                Text(text = "Это что? Это печка. Там что стоит? Там стоит стол. Там кто сидит? Там сиди Сергей." +
                       " Где находиться Семён? Сеиён стоит там. Здесь ли ( имеетсяя ли здесь ) Лиза? Нет, Лизы здесь нет." +
                       "Здесь ли Пётр? Пётр сидит там. Там кто стоит? Там стоит Василий. Василий, иди, садись там. Иди, Пётр, садись сюда.")
            }



    }

}