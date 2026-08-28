package com.bhangerhfort

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BhangarhFortGame()
        }
    }
}

@Composable
fun BhangarhFortGame() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(15, 11, 8)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Text(
                text = "BHANGARH",
                color = Color(220, 190, 130),
                fontSize = 52.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "THE FORGOTTEN FORT",
                color = Color(180, 170, 150),
                fontSize = 18.sp
            )

            Button(
                onClick = {
                    // Game screen will be added next.
                },
                modifier = Modifier.padding(top = 24.dp)
            ) {
                Text(
                    text = "PLAY",
                    fontSize = 20.sp
                )
            }

            Text(
                text = "Explore • Discover • Escape",
                color = Color(150, 145, 135),
                fontSize = 15.sp
            )
        }
    }
}