package com.example

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ui.theme.*
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MessFoodScannerScreen(navController: NavController) {
    var isLoading by remember { mutableStateOf(true) }
    var showFeedbackSheet by remember { mutableStateOf(false) }
    var showThankYouDialog by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(1000)
        isLoading = false
    }

    Scaffold(
        containerColor = Color.Transparent,
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(end = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Spacer(modifier = Modifier.weight(0.2f))
                        Text(
                            text = "Mess Coupon",
                            color = Color(0xFFE0E0E0),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.weight(1f),
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = "Meal History",
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.clickable { navController.navigate("meal_history") }
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF2C2C2C))
            )
        }
    ) { innerPadding ->
        if (isLoading) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                // Gradient Section
                GradientProfileDetails()
                
                // Darkened Overlay
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0x99000000)),
                    contentAlignment = Alignment.Center
                ) {
                    LogoLoader()
                }
            }
        } else {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .background(Color.White)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                GradientProfileDetails()

                // Bottom actions section
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(bottom = 32.dp, top = 32.dp, start = 24.dp, end = 24.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Tap on the meal name to\nscan and avail food.",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            lineHeight = 32.sp
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Box(
                            modifier = Modifier
                                .border(1.dp, Color(0xFF6B1818), RoundedCornerShape(4.dp))
                                .clickable { showFeedbackSheet = true }
                                .padding(horizontal = 12.dp, vertical = 4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "Star",
                                    tint = Color(0xFFEDB041),
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "RATE US",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black,
                                    fontSize = 14.sp
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(32.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            MealButton(text = "Lunch", modifier = Modifier.weight(1f))
                            MealButton(text = "Dinner", modifier = Modifier.weight(1f))
                        }
                    }
                }
            }
        }
    }

    if (showFeedbackSheet) {
        FeedbackBottomSheet(
            onDismissRequest = { showFeedbackSheet = false },
            onSubmit = {
                showFeedbackSheet = false
                showThankYouDialog = true
            }
        )
    }

    if (showThankYouDialog) {
        AlertDialog(
            onDismissRequest = { showThankYouDialog = false },
            title = {
                Text(
                    text = "Message",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            },
            text = {
                Text(
                    text = "Thank you for your feedback!\nYour input helps improve the mess service.",
                    color = Color.Black,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            },
            confirmButton = {
                TextButton(onClick = { showThankYouDialog = false }, modifier = Modifier.fillMaxWidth()) {
                    Text("OK", color = Color(0xFFF07041), fontWeight = FontWeight.Bold, fontSize = 16.sp)
                }
            },
            containerColor = Color.White
        )
    }
}

@Composable
fun GradientProfileDetails() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Brush.linearGradient(
                    colors = listOf(Color(0xFFFA8170), Color(0xFFFAD16B))
                )
            )
            .padding(top = 24.dp, bottom = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Profile Image Placeholder
        Box(
            modifier = Modifier
                .size(110.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFF222222))
        ) {
            Image(
                painter = painterResource(id = android.R.drawable.ic_menu_gallery),
                contentDescription = "Profile",
                modifier = Modifier.align(Alignment.Center).size(64.dp),
                contentScale = ContentScale.Crop
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Jaideep Singh Chouhan",
            fontSize = 16.sp,
            color = Color(0xFF333333),
            fontWeight = FontWeight.Medium
        )

        Spacer(modifier = Modifier.height(24.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            ProfileField("Father's Name", "Dule Singh Chouhan (8223067963)")
            ProfileField("Mother's Name", "Anita Chouhan (+91-8223055624)")
            ProfileField("Program Name", "P132:B.Tech. (Computer Science and\nEngineering)(2024)")
            ProfileField("Hostel", "Boys Hostel-07- 701-Bed D (Standard Air\nCooled 5 Seater)")
        }
    }
}

@Composable
fun LogoLoader(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(72.dp)
            .background(Color.White, CircleShape)
            .border(2.dp, Color.Black, CircleShape),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawCircle(color = Color(0xFFED8F2D), radius = size.minDimension / 2 - 8f)
            drawLine(color = Color.Black, start = center, end = androidx.compose.ui.geometry.Offset(size.width, size.height), strokeWidth = 4f)
            drawLine(color = Color.Black, start = center, end = androidx.compose.ui.geometry.Offset(0f, 0f), strokeWidth = 4f)
            drawLine(color = Color.Black, start = center, end = androidx.compose.ui.geometry.Offset(0f, size.height), strokeWidth = 4f)
        }
    }
}

@Composable
fun ProfileField(label: String, value: String) {
    Column(modifier = Modifier.padding(bottom = 12.dp).fillMaxWidth()) {
        Text(
            text = label,
            fontSize = 16.sp,
            color = Color(0xFF222222),
            fontWeight = FontWeight.Medium
        )
        Text(
            text = value,
            fontSize = 16.sp,
            color = Color(0xFF444444)
        )
    }
}

@Composable
fun MealButton(text: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .shadow(2.dp, RoundedCornerShape(6.dp))
            .background(
                Brush.horizontalGradient(
                    colors = listOf(Color(0xFFFA8170), Color(0xFFFAD16B))
                ),
                shape = RoundedCornerShape(6.dp)
            )
            .height(52.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = text,
                color = Color(0xFF222222),
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.width(4.dp))
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = "Forward",
                tint = Color(0xFF222222),
                modifier = Modifier.size(16.dp)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FeedbackBottomSheet(
    onDismissRequest: () -> Unit,
    onSubmit: () -> Unit
) {
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
    
    ModalBottomSheet(
        onDismissRequest = onDismissRequest,
        sheetState = sheetState,
        dragHandle = null,
        containerColor = Color.White,
        shape = RectangleShape,
        contentWindowInsets = { WindowInsets(0,0,0,0) }
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().verticalScroll(rememberScrollState())
        ) {
            // Header
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF2C2C2C))
                    .padding(top = 8.dp, bottom = 12.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .width(32.dp)
                            .height(3.dp)
                            .background(Color.Gray, RoundedCornerShape(1.5.dp))
                    )
                }
                Spacer(modifier = Modifier.height(12.dp))
                Box(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Feedback",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.align(Alignment.Center)
                    )
                    IconButton(
                        onClick = onDismissRequest,
                        modifier = Modifier
                            .align(Alignment.CenterEnd)
                            .padding(end = 8.dp)
                            .size(24.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Close",
                            tint = Color.White
                        )
                    }
                }
            }
            // Content
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Mess Feedback",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Tell us how we did!",
                    fontSize = 18.sp,
                    color = Color(0xFF222222)
                )
                Spacer(modifier = Modifier.height(16.dp))
                
                // Stars
                var rating by remember { mutableStateOf(0) }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    for (i in 1..5) {
                        Icon(
                            imageVector = if (i <= rating) Icons.Default.Star else Icons.Default.StarBorder,
                            contentDescription = "Star $i",
                            modifier = Modifier.size(36.dp).clickable { rating = i },
                            tint = Color(0xFFFFC107) // Yellow color
                        )
                    }
                }
                
                Spacer(modifier = Modifier.height(32.dp))
                
                Text(
                    text = "Tap to select meal type",
                    fontSize = 16.sp,
                    color = Color.Black,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Start
                )
                Spacer(modifier = Modifier.height(12.dp))
                
                var selectedMeal by remember { mutableStateOf<String?>("Lunch") }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    val meals = listOf("Breakfast", "Lunch", "Tea", "Dinner")
                    meals.forEach { meal ->
                        val isSelected = selectedMeal == meal
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .border(
                                    width = if (isSelected) 2.dp else 1.dp,
                                    color = if (isSelected) Color(0xFFFF8A65) else Color.Black,
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .background(if (isSelected) Color(0xFFFFE0B2).copy(alpha = 0.3f) else Color.Transparent, RoundedCornerShape(8.dp))
                                .clickable { selectedMeal = meal }
                                .padding(vertical = 8.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = meal,
                                color = Color.Black,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }
                
                Spacer(modifier = Modifier.height(24.dp))
                FeedbackCategory("Service/Staff", listOf("Food served late", "Staff not polite"))
                Spacer(modifier = Modifier.height(24.dp))
                FeedbackCategory("Quantity", listOf("Refills not available", "Less food"))
                Spacer(modifier = Modifier.height(24.dp))
                FeedbackCategory("Hygiene", listOf("Staff not hygienic", "Utensils dirty", "Mess not clean"))
                Spacer(modifier = Modifier.height(24.dp))
                FeedbackCategory("Food Quality", listOf("Not fresh", "Undercooked / overcooked", "Too oily/greasy"))
                
                Spacer(modifier = Modifier.height(24.dp))
                
                Text(
                    text = "Remarks (If Any)",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF444444),
                    textDecoration = TextDecoration.Underline,
                    modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
                    textAlign = TextAlign.Start
                )
                
                var remarks by remember { mutableStateOf("") }
                OutlinedTextField(
                    value = remarks,
                    onValueChange = { remarks = it },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(4.dp),
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFDDDDDD),
                        unfocusedBorderColor = Color(0xFFDDDDDD)
                    )
                )
                
                Spacer(modifier = Modifier.height(32.dp))
                
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .height(48.dp)
                        .shadow(4.dp, RoundedCornerShape(6.dp))
                        .background(
                            Brush.linearGradient(
                                colors = listOf(Color(0xFFFA8170), Color(0xFFFAD16B))
                            ),
                            shape = RoundedCornerShape(6.dp)
                        )
                        .clickable { onSubmit() },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Submit",
                        color = Color(0xFF222222),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
                
                Spacer(modifier = Modifier.height(32.dp))
            }
        }
    }
}

@Composable
fun FeedbackCategory(title: String, options: List<String>) {
    Column(modifier = Modifier.fillMaxWidth()) {
         Text(
            text = title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF444444),
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
         )
         Spacer(modifier = Modifier.height(16.dp))
         
         options.forEachIndexed { index, option ->
             var isChecked by remember { mutableStateOf(false) }
             Row(
                 modifier = Modifier
                     .fillMaxWidth()
                     .background(Color.White)
                     .clickable { isChecked = !isChecked }
                     .padding(vertical = 12.dp, horizontal = 16.dp),
                 verticalAlignment = Alignment.CenterVertically,
                 horizontalArrangement = Arrangement.SpaceBetween
             ) {
                 Text(
                     text = option,
                     fontSize = 16.sp,
                     color = Color.Black
                 )
                 
                 Box(
                     modifier = Modifier
                         .size(20.dp)
                         .background(if (isChecked) Color(0xFFF98E2A) else Color.Transparent, RoundedCornerShape(2.dp))
                         .border(if (isChecked) 0.dp else 1.dp, if (isChecked) Color.Transparent else Color.Gray, RoundedCornerShape(2.dp)),
                     contentAlignment = Alignment.Center
                 ) {
                     if (isChecked) {
                         Icon(
                             imageVector = Icons.Default.Check,
                             contentDescription = "Checked",
                             tint = Color.White,
                             modifier = Modifier.size(16.dp)
                         )
                     }
                 }
             }
             if (index < options.size - 1) {
                 HorizontalDivider(thickness = 0.5.dp, color = Color(0xFFE0E0E0))
             }
         }
    }
}