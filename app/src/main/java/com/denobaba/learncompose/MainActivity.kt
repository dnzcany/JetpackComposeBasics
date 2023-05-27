package com.denobaba.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.denobaba.learncompose.ui.theme.LearnComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable

fun MainScreen(){

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Blue),
    verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally



    ) {
        TextHere1(text = "DCY")
        Spacer(modifier = Modifier.padding(5.dp))
        TextHere1(text = "House")

    }

}


@Composable

fun TextHere1(text: String){
    Text(modifier = Modifier

        .clickable {
            println("Welcome To DCY HOUSE")

        }
        .background(color = Color.Black)
        .padding(
            top = 10.dp, start = 10.dp,
            end = 1.dp, bottom = 10.dp
        )
        //.fillMaxSize(0.5f)
        .width(150.dp)
        ,text = text,
        color = Color.Green,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center


    )



}





@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}