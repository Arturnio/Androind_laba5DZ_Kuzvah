package com.arlina.android_laba5dz_kuzvah

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arlina.android_laba5dz_kuzvah.ui.theme.Android_Laba5DZ_KuzvahTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun TitleBlock() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Пример Compose-приложения", fontSize = 8.sp, color = Color(0xFF555555))
        Text(text = "Row,Column,Size,ARGB", fontSize = 8.sp, color = Color(0xFF555555))
    }
}


@Composable
fun ColorBox(color: Color) {
    Box(
        modifier = Modifier
            .size(80.dp)
            .background(color)
    )
}


@Composable
fun ColorRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ColorBox(color = Color(0xFFFF0000))
        ColorBox(color = Color(0x8000FF00))
        ColorBox(color = Color(0xFF0000FF))
    }
}


@Composable
fun CombinedBlock() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFC4C1C1))
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Левая колонка \n текст 1", fontSize = 8.sp, color = Color.Black)
            Text(text = "Правая колонка \n текст 2", fontSize = 8.sp, color = Color.Black)
        }
    }
}


@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(100.dp)
    ) {
        TitleBlock()
        ColorRow()
        CombinedBlock()
    }
}