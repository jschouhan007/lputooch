package com.example

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MealHistoryScreen(navController: NavController) {
    var isLoading by remember { mutableStateOf(true) }

    LaunchedEffect(Unit) {
        delay(1500)
        isLoading = false
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(modifier = Modifier.fillMaxWidth().padding(end = 48.dp), contentAlignment = Alignment.Center) {
                        Text(
                            text = "Meal History",
                            color = Color(0xFFAAAAAA),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = Color(0xFFAAAAAA)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF2C2C2C))
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(if (isLoading) Color(0xFF888888) else Color(0xFFFAFAFA)),
            contentAlignment = Alignment.Center
        ) {
            if (isLoading) {
                LpuLogoLoader()
            }
        }
    }
}

@Composable
fun LpuLogoLoader(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(64.dp)
            .background(Color.White, CircleShape),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(2.dp)) {
            val centerPoint = Offset(size.width / 2, size.height / 2)
            val radius = size.minDimension / 2
            
            drawCircle(
                color = Color.Black,
                radius = radius,
                style = androidx.compose.ui.graphics.drawscope.Stroke(width = 1.dp.toPx())
            )
            
            drawCircle(
                color = Color(0xFFF07041),
                radius = radius * 0.70f
            )
            
            drawCircle(
                color = Color.Black,
                radius = radius * 0.70f,
                style = androidx.compose.ui.graphics.drawscope.Stroke(width = 1.dp.toPx())
            )

            val startP = Offset(centerPoint.x - radius * 0.4f, centerPoint.y + radius * 0.4f)
            
            drawLine(
                color = Color.Black,
                start = startP,
                end = Offset(centerPoint.x + radius * 0.1f, centerPoint.y - radius * 0.6f),
                strokeWidth = 5.dp.toPx(),
                cap = StrokeCap.Round
            )
            
            drawLine(
                color = Color.Black,
                start = startP,
                end = Offset(centerPoint.x + radius * 0.5f, centerPoint.y - radius * 0.25f),
                strokeWidth = 5.dp.toPx(),
                cap = StrokeCap.Round
            )
            
            drawLine(
                color = Color.Black,
                start = startP,
                end = Offset(centerPoint.x + radius * 0.6f, centerPoint.y + radius * 0.25f),
                strokeWidth = 5.dp.toPx(),
                cap = StrokeCap.Round
            )
        }
    }
}
