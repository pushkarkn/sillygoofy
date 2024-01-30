package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
//import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.Purple1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                MyScreen()

            }
        }
    }
}
@Composable
fun MyScreen(){
    Column(
        verticalArrangement= Arrangement.Center,
        horizontalAlignment= Alignment.CenterHorizontally,
        modifier= Modifier.fillMaxSize()
    ) {
        Card(
                modifier= Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .padding(28.dp),
            backgroundColor= Purple1,
            elevation= 10.dp

        ) {
            Column {
                Myrow1()
            }


        }
    }
}
@Composable
fun Myrow1() {
    Row(
        modifier= Modifier.fillMaxWidth()
    ) {

        Text(text = "Hi, My name is \n Pushkar")
    }
}



@Composable
@Preview(showBackground = true)
fun GreetingPreview() {
    MyApplicationTheme {
        MyScreen()
    }
}