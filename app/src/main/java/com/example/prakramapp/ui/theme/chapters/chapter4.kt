package com.example.prakramapp.ui.theme.chapters





import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.prakramapp.R


@Composable
fun Chapter4(navController: NavHostController) {
    BoxWithConstraints {
        val constraints =
            maxWidth / 2 // set the maximum width of the image to half of the screen width
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        ){
            Image(
                painter = painterResource(id = R.drawable.chapterbackground),
                contentDescription ="background Image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
                    .graphicsLayer(
                        alpha = 0.8f
                    )
            )

            Column(
                Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Text(
                    text = "Chapter 4 - Jnana Karma Sanyasa Yoga",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 35.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "Path of Knowledge and the Disciplines of Action",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "The fourth chapter of the Bhagavad Gita is Jnana Karma Sanyasa Yoga. In this chapter, Krishna glorifies the Karma Yoga and imparts the Transcendental Knowledge (the knowledge of the soul and the Ultimate Truth) to Arjuna. He reveals the reason behind his appearance in this material world. He reveals that even though he is eternal, he reincarnates time after time to re-establish dharma and peace on this Earth. His births and activities are eternal and are never contaminated by material flaws. Those persons who know and understand this Truth engage in his devotion with full faith and eventually attain Him. They do not have to take birth in this world again.\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 22.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
            }
        }
    }
}
//@Preview(showBackground = true)
//@Composable
//fun Chapter2preview(){
//    Chapter2()
//}
