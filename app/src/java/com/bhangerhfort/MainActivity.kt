package com.bhangerhfort

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BhangarhGame()
        }
    }
}

@Composable
fun BhangarhGame() {

    var playerX by remember { mutableStateOf(500f) }
    var playerY by remember { mutableStateOf(700f) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

        Canvas(
            modifier = Modifier.fillMaxSize()
        ) {
            // Ground
            drawRect(
                color = Color(45, 50, 32),
                size = size
            )

            // Fort walls
            drawRect(
                color = Color(75, 70, 60),
                topLeft = androidx.compose.ui.geometry.Offset(40f, 120f),
                size = androidx.compose.ui.geometry.Size(
                    size.width - 80f,
                    35f
                )
            )

            drawRect(
                color = Color(75, 70, 60),
                topLeft = androidx.compose.ui.geometry.Offset(40f, 120f),
                size = androidx.compose.ui.geometry.Size(
                    35f,
                    size.height - 250f
                )
            )

            drawRect(
                color = Color(75, 70, 60),
                topLeft = androidx.compose.ui.geometry.Offset(
                    size.width - 75f,
                    120f
                ),
                size = androidx.compose.ui.geometry.Size(
                    35f,
                    size.height - 250f
                )
            )

            // Path
            drawRect(
                color = Color(100, 82, 55),
                topLeft = androidx.compose.ui.geometry.Offset(
                    size.width / 2 - 70f,
                    155f
                ),
                size = androidx.compose.ui.geometry.Size(
                    140f,
                    size.height - 300f
                )
            )

            // Exit
            drawRect(
                color = Color(0, 180, 180),
                topLeft = androidx.compose.ui.geometry.Offset(
                    size.width - 190f,
                    180f
                ),
                size = androidx.compose.ui.geometry.Size(
                    100f,
                    120f
                )
            )

            // Player
            drawCircle(
                color = Color(220, 180, 110),
                radius = 25f,
                center = androidx.compose.ui.geometry.Offset(
                    playerX,
                    playerY
                )
            )

            drawCircle(
                color = Color.Black,
                radius = 9f,
                center = androidx.compose.ui.geometry.Offset(
                    playerX - 8f,
                    playerY - 5f
                )
            )
        }

        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(20.dp)
        ) {
            Text(
                text = "BHANGARH FORT",
                color = Color(230, 190, 100),
                fontSize = 25.sp
            )

            Text(
                text = "Explore the fort and find the exit",
                color = Color.White,
                fontSize = 14.sp
            )