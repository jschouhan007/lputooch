package com.example

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.*
import kotlinx.coroutines.launch

@OptIn(ExperimentalLayoutApi::class, ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: androidx.navigation.NavController, modifier: Modifier = Modifier) {
    var selectedTab by remember { mutableStateOf(0) }
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            DashboardDrawerContent(navController, drawerState, scope)
        }
    ) {
        Scaffold(
            modifier = modifier.fillMaxSize(),
            topBar = { DashboardTopAppBar(onMenuClick = { scope.launch { drawerState.open() } }) },
            bottomBar = { DashboardBottomNavBar(selectedTab = selectedTab, onTabSelected = { selectedTab = it }) },
            containerColor = BackgroundWhite
        ) { innerPadding ->
        if (selectedTab == 0) {
            LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            item {
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Today's Timetable",
                        fontSize = 22.sp,
                        color = TextDarkGray
                    )
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(containerColor = SecondaryYellow),
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
                        modifier = Modifier.height(36.dp)
                    ) {
                        Text("Your Dost", color = TextDarkGray, fontSize = 14.sp)
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
            }

            item {
                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(listOf("07-08 PM", "08-09 PM")) { time ->
                        TimetableCard(time)
                    }
                }
                Spacer(modifier = Modifier.height(24.dp))
            }

            item {
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(
                                Brush.horizontalGradient(
                                    colors = listOf(PrimaryOrange, SecondaryYellow)
                                )
                            )
                            .padding(horizontal = 16.dp, vertical = 10.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            "PEP Class Undertaking",
                            color = TextDarkGray,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
                Spacer(modifier = Modifier.height(32.dp))
            }

            item {
                Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                    Text(
                        text = "Add More Tiles",
                        fontSize = 22.sp,
                        color = TextDarkGray
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Click on the plus button to add menu grids.",
                        fontSize = 14.sp,
                        color = TextDarkGray
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }

            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    val tileWidth = (androidx.compose.ui.platform.LocalConfiguration.current.screenWidthDp.dp - 32.dp - 32.dp) / 3
                    
                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        DashboardTile(title = "Announce", badge = "4", badgeStyle = "number", width = tileWidth, iconRes = R.drawable.ic_announce)
                        DashboardTile(title = "Edu\nRevolution", badge = "", badgeStyle = "none", width = tileWidth, iconRes = R.drawable.ic_edu_revolution)
                        DashboardTile(title = "Fee\nStatement", badge = "", badgeStyle = "none", width = tileWidth, iconRes = R.drawable.ic_fee_statement)
                    }
                    
                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        Spacer(modifier = Modifier.width(tileWidth))
                        Spacer(modifier = Modifier.width(tileWidth))
                        DashboardTile(title = "Attendance", badge = "91 %", badgeStyle = "percent", width = tileWidth, iconRes = R.drawable.ic_attendance)
                    }

                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        DashboardTile(title = "Assignment", badge = "23", badgeStyle = "number", width = tileWidth, iconRes = R.drawable.ic_assignment)
                        DashboardTile(title = "Results", badge = "8.27", badgeStyle = "number", width = tileWidth, iconRes = R.drawable.ic_results)
                        DashboardTile(title = "Exams", badge = "0", badgeStyle = "number", width = tileWidth, iconRes = R.drawable.ic_exams)
                    }

                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        Spacer(modifier = Modifier.width(tileWidth))
                        DashboardTile(title = "RMS\nStatus", badge = "", badgeStyle = "none", width = tileWidth, iconRes = R.drawable.ic_rms_status)
                        DashboardTile(title = "Events", badge = "", badgeStyle = "none", width = tileWidth, iconRes = R.drawable.ic_events)
                    }

                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        Spacer(modifier = Modifier.width(tileWidth))
                        Spacer(modifier = Modifier.width(tileWidth))
                        DashboardTile(title = "View\nMarks", badge = "X", badgeStyle = "x", width = tileWidth, iconRes = R.drawable.ic_view_marks)
                    }

                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        DashboardTile(title = "Hostel\nLeave Slip", badge = "X", badgeStyle = "x", width = tileWidth, iconRes = R.drawable.ic_view_marks)
                        DashboardTile(title = "Make Up\nAdjustment", badge = "X", badgeStyle = "x", width = tileWidth, iconRes = R.drawable.ic_view_marks)
                        DashboardTile(
                            title = "Mess Food\nScanner", 
                            badge = "X", 
                            badgeStyle = "x", 
                            width = tileWidth, 
                            iconRes = R.drawable.ic_view_marks,
                            onClick = { navController.navigate("mess_food_scanner") }
                        )
                    }

                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        DashboardTile(title = "RMS Request\nStatus", badge = "X", badgeStyle = "x", width = tileWidth, iconRes = R.drawable.ic_view_marks)
                        DashboardTile(title = "Teacher\non Leave", badge = "X", badgeStyle = "x", width = tileWidth, iconRes = R.drawable.ic_view_marks)
                        Spacer(modifier = Modifier.width(tileWidth))
                    }
                }
                Spacer(modifier = Modifier.height(32.dp))
            }
        }
        } else {
            Box(modifier = Modifier.fillMaxSize().padding(innerPadding), contentAlignment = Alignment.Center) {
                Text("Content for Tab $selectedTab", color = TextDarkGray)
            }
        }
        }
    }
}

@Composable
fun DashboardTile(
    title: String, 
    badge: String, 
    badgeStyle: String, 
    width: androidx.compose.ui.unit.Dp, 
    iconVector: androidx.compose.ui.graphics.vector.ImageVector? = null,
    iconRes: Int? = null,
    onClick: () -> Unit = {}
) {
    Box(modifier = Modifier.width(width).padding(top = 8.dp, end = 8.dp).clickable { onClick() }) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart)
                .shadow(1.dp, RoundedCornerShape(8.dp))
                .background(TileBackground, RoundedCornerShape(8.dp))
                .border(width = 1.dp, color = OutlineColor, shape = RoundedCornerShape(8.dp))
                .clip(RoundedCornerShape(8.dp)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            if (iconRes != null) {
                androidx.compose.foundation.Image(
                    painter = painterResource(id = iconRes),
                    contentDescription = title,
                    modifier = Modifier.size(36.dp)
                )
            } else if (iconVector != null) {
                Icon(
                    imageVector = iconVector,
                    contentDescription = title,
                    tint = Color(0xFF4A4A4A),
                    modifier = Modifier.size(36.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(TileLabelBackground)
                    .padding(vertical = 6.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = title,
                    fontSize = 12.sp,
                    color = TextDarkGray,
                    textAlign = TextAlign.Center,
                    lineHeight = 14.sp
                )
            }
        }
        
        if (badgeStyle != "none") {
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .offset(x = 6.dp, y = (-6).dp)
                    .background(BadgeOrange, RoundedCornerShape(4.dp))
                    .padding(horizontal = 6.dp, vertical = 2.dp)
            ) {
                Text(text = badge, fontSize = 12.sp, color = TextDarkGray, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun TimetableCard(timeString: String) {
    Card(
        modifier = Modifier
            .width(260.dp)
            .height(130.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(
                        Brush.horizontalGradient(
                            colors = listOf(PrimaryOrange, SecondaryYellow)
                        )
                    )
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("PETV71", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = TextDarkGray)
                    Text("Assignment-1", fontSize = 14.sp, color = TextDarkGray)
                    Spacer(modifier = Modifier.weight(1f))
                    Row(
                        modifier = Modifier
                            .background(UpcomingChipBg, RoundedCornerShape(16.dp))
                            .padding(horizontal = 8.dp, vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(modifier = Modifier
                            .size(8.dp)
                            .background(UpcomingDot, androidx.compose.foundation.shape.CircleShape))
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("Upcoming", fontSize = 12.sp, color = TextDarkGray)
                    }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(DarkGreyBanner)
                    .padding(vertical = 8.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(timeString, color = BackgroundWhite, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardTopAppBar(onMenuClick: () -> Unit) {
    TopAppBar(
        title = {
            Text(
                "Dashboard",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold
            )
        },
        navigationIcon = {
            IconButton(onClick = onMenuClick) {
                Icon(
                    CustomIcons.MenuThreeLines,
                    contentDescription = "Menu",
                    tint = Color.Unspecified
                )
            }
        },
        actions = {
            Box(modifier = Modifier.padding(end = 16.dp)) {
                Icon(
                    CustomIcons.NotificationBell,
                    contentDescription = "Notifications",
                    tint = Color.Unspecified
                )
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .offset(x = 6.dp, y = (-4).dp)
                        .background(
                            Brush.linearGradient(
                                colors = listOf(PrimaryOrange, Color(0xFFFFB74D))
                            ), RoundedCornerShape(4.dp)
                        )
                        .padding(horizontal = 4.dp, vertical = 2.dp)
                ) {
                    Text("27", fontSize = 10.sp, color = Color.Black, fontWeight = FontWeight.Bold)
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = BackgroundWhite)
    )
}

@Composable
fun DashboardBottomNavBar(selectedTab: Int, onTabSelected: (Int) -> Unit) {
    NavigationBar(
        containerColor = BackgroundWhite,
        tonalElevation = 0.dp // To ensure no greyish tint
    ) {
        NavigationBarItem(
            selected = selectedTab == 0,
            onClick = { onTabSelected(0) },
            icon = { Icon(CustomIcons.NavDashboard, contentDescription = null, tint = if (selectedTab == 0) SelectedOrangeText else PaleGreyIcon) },
            label = { Text("Dashboard", color = if (selectedTab == 0) SelectedOrangeText else PaleGreyIcon) },
            colors = NavigationBarItemDefaults.colors(indicatorColor = Color.Transparent)
        )
        NavigationBarItem(
            selected = selectedTab == 1,
            onClick = { onTabSelected(1) },
            icon = { Icon(CustomIcons.NavHappenings, contentDescription = null, tint = if (selectedTab == 1) SelectedOrangeText else PaleGreyIcon) },
            label = { Text("Happenings", color = if (selectedTab == 1) SelectedOrangeText else PaleGreyIcon) },
            colors = NavigationBarItemDefaults.colors(indicatorColor = Color.Transparent)
        )
        NavigationBarItem(
            selected = selectedTab == 2,
            onClick = { onTabSelected(2) },
            icon = { Icon(CustomIcons.NavRMS, contentDescription = null, tint = if (selectedTab == 2) SelectedOrangeText else PaleGreyIcon) },
            label = { Text("RMS", color = if (selectedTab == 2) SelectedOrangeText else PaleGreyIcon) },
            colors = NavigationBarItemDefaults.colors(indicatorColor = Color.Transparent)
        )
        NavigationBarItem(
            selected = selectedTab == 3,
            onClick = { onTabSelected(3) },
            icon = { Icon(CustomIcons.NavViewMarks, contentDescription = null, tint = if (selectedTab == 3) SelectedOrangeText else PaleGreyIcon) },
            label = { Text("View Marks", color = if (selectedTab == 3) SelectedOrangeText else PaleGreyIcon) },
            colors = NavigationBarItemDefaults.colors(indicatorColor = Color.Transparent)
        )
    }
}
