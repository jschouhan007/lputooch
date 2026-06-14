package com.example

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

data class DrawerMenuItem(val title: String, val icon: ImageVector, val route: String?)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardDrawerContent(
    navController: androidx.navigation.NavController,
    drawerState: DrawerState,
    scope: CoroutineScope
) {
    val menuItems = listOf(
        DrawerMenuItem("Attendance", CustomIcons.Attendance, null),
        DrawerMenuItem("Placement Barcode Scanner", CustomIcons.QrScanner, null),
        DrawerMenuItem("Book Appointment", CustomIcons.DeskPerson, null),
        DrawerMenuItem("Transport Preference", CustomIcons.Checklist, null),
        DrawerMenuItem("Change UMS Password", CustomIcons.ChangePassword, null),
        DrawerMenuItem("View Marks", CustomIcons.Checklist, null),
        DrawerMenuItem("Event Attendance", CustomIcons.Newspaper, null),
        DrawerMenuItem("Doctor Appointment", CustomIcons.Stethoscope, null),
        DrawerMenuItem("Document Upload", Icons.Default.UploadFile, null),
        DrawerMenuItem("Placement Drive", Icons.Default.Work, null),
        DrawerMenuItem("Elective Polling", Icons.Default.HowToVote, null),
        DrawerMenuItem("Fee Payment Schedule", Icons.Default.Schedule, null),
        DrawerMenuItem("Fee Statement", Icons.Default.Receipt, null),
        DrawerMenuItem("Guest Lecture/Workshop Feedback", Icons.Default.Feedback, null),
        DrawerMenuItem("List of Holidays", Icons.Default.EventBusy, null),
        DrawerMenuItem("Fee Payment", Icons.Default.Payment, null),
        DrawerMenuItem("App Feedback", Icons.Default.Feedback, null),
        DrawerMenuItem("Virtual Tour", Icons.Default.Explore, null),
        DrawerMenuItem("Library Search", Icons.Default.MenuBook, null),
        DrawerMenuItem("Summer Term Registration", Icons.Default.DateRange, null),
        DrawerMenuItem("Hostel Leave Slip", Icons.Default.DirectionsWalk, null),
        DrawerMenuItem("Residential Reporting Slip", Icons.Default.Assignment, null),
        DrawerMenuItem("Special Food Services", Icons.Default.Restaurant, null),
        DrawerMenuItem("Uni Hospital Help Line", Icons.Default.HeadsetMic, null),
        DrawerMenuItem("Inventory", Icons.Default.Inventory, null),
        DrawerMenuItem("Library Resource Feedback", Icons.Default.Feedback, null),
        DrawerMenuItem("Lab Resource Feedback", Icons.Default.Feedback, null),
        DrawerMenuItem("Make Up Adjustment", Icons.Default.Build, null),
        DrawerMenuItem("Mentor Meeting Details", Icons.Default.Groups, null),
        DrawerMenuItem("Feedback on Mentor Meeting", Icons.Default.Feedback, null),
        DrawerMenuItem("Mess Food Scanner", Icons.Default.RestaurantMenu, "mess_food_scanner"),
        DrawerMenuItem("PEP Activities", Icons.Default.SportsBasketball, null),
        DrawerMenuItem("Placement Drive Summary", Icons.Default.WorkHistory, null),
        DrawerMenuItem("RMS Request Status", Icons.Default.Sync, null),
        DrawerMenuItem("RMS Scanner", Icons.Default.QrCodeScanner, null),
        DrawerMenuItem("Skill Development Feedback", Icons.Default.Feedback, null),
        DrawerMenuItem("Student Class Feedback", Icons.Default.Feedback, null),
        DrawerMenuItem("Event QR Scanner/Tier Request", Icons.Default.QrCode, null),
        DrawerMenuItem("Exam Attendance", Icons.Default.AssignmentInd, null),
        DrawerMenuItem("Laundry", Icons.Default.LocalLaundryService, null),
        DrawerMenuItem("Open Minor Area Preference", Icons.Default.PieChart, null),
        DrawerMenuItem("Report Card", Icons.Default.Article, null),
        DrawerMenuItem("Teacher on Leave", Icons.Default.PersonOff, null),
        DrawerMenuItem("Lecture Feedback", Icons.Default.Feedback, null),
        DrawerMenuItem("Time table", Icons.Default.DateRange, null),
        DrawerMenuItem("Railway Concession Form", Icons.Default.Train, null),
        DrawerMenuItem("Entry Exit Logs", Icons.Default.List, null),
        DrawerMenuItem("Vendor Facility Search", Icons.Default.Search, null),
        DrawerMenuItem("Food Shops", Icons.Default.Store, null)
    )

    ModalDrawerSheet(
        drawerContainerColor = Color.White,
        modifier = Modifier.fillMaxHeight().width(320.dp),
        drawerShape = RoundedCornerShape(0.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // Header Gradient
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.linearGradient(
                            colors = listOf(Color(0xFFFA8170), Color(0xFFFAD16B))
                        )
                    )
                    .padding(vertical = 24.dp, horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .size(96.dp)
                        .background(Color.LightGray, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile Picture",
                        tint = Color.White,
                        modifier = Modifier.size(64.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Jaideep Singh Chouhan",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "12408451",
                    color = Color.Black,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "P132:B.Tech. (Computer Science\nand Engineering)(2024)",
                    color = Color.Black,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
            }

            // Search Bar
            var searchQuery by remember { mutableStateOf("") }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .background(Color(0xFFF0F0F0), RoundedCornerShape(8.dp))
                    .padding(horizontal = 12.dp, vertical = 12.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        tint = Color.Gray,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Q Search",
                        color = Color.Gray,
                        fontSize = 18.sp
                    )
                }
            }

            // Menu Items
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                items(menuItems) { item ->
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                scope.launch { drawerState.close() }
                                if (item.route != null) {
                                    navController.navigate(item.route)
                                }
                            }
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp, vertical = 14.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.title,
                                tint = Color(0xFF666666),
                                modifier = Modifier.size(24.dp)
                            )
                            Spacer(modifier = Modifier.width(24.dp))
                            Text(
                                text = item.title,
                                color = Color(0xFF444444),
                                fontSize = 18.sp
                            )
                        }
                        HorizontalDivider(thickness = 0.5.dp, color = Color(0xFFE0E0E0))
                    }
                }
            }

            // Logout Button
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .shadow(4.dp, RoundedCornerShape(24.dp))
                        .background(
                            Brush.linearGradient(
                                colors = listOf(Color(0xFFFA8170), Color(0xFFFAD16B))
                            ),
                            shape = RoundedCornerShape(24.dp)
                        )
                        .clickable { scope.launch { drawerState.close() } }
                        .padding(vertical = 12.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "LOGOUT",
                            color = Color.Black,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ExitToApp,
                            contentDescription = "Logout",
                            tint = Color.Black,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
        }
    }
}
