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
fun Chapter9(navController: NavHostController) {
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
                    text = "Chapter 9 - Raja Vidya Yoga",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 35.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "Yoga through the King of Sciences",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "The ninth chapter of the Bhagavad Gita is Raja Vidya Yoga. In this chapter, Krishna explains that He is Supreme and how this material existence is created, maintained and destroyed by His Yogmaya and all beings come and go under his supervision. He reveals the Role and the Importance of Bhakti (transcendental devotional service) towards our Spiritual Awakening. In such devotion, one must live for the God, offer everything that he possesses to Him and do everything for Him only. One who follows such devotion becomes free from the bonds of this material world and unites with the Lord.",
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
