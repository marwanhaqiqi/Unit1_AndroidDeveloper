package com.example.createabusinesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color.Companion.Black

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardApp()
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD5E8D4)), // Light green background color
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Logo Section
        Image(
            painter = painterResource(id = R.drawable.android_logo), // Replace with your logo
            contentDescription = "Android Logo",
            modifier = Modifier.size(100.dp)
        )

        // Name and Title
        Text(
            text = "Jennifer Doe",
            style = TextStyle(
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Black
            )
        )
        Text(
            text = "Android Developer Extraordinaire",
            style = TextStyle(
                fontSize = 18.sp,
                color = Color(0xFF388E3C), // Dark green color for the title
                fontWeight = FontWeight.SemiBold
            )
        )

        Spacer(modifier = Modifier.height(24.dp)) // Space between title and contact info

        // Contact Information Section
        ContactInfo(
            iconId = R.drawable.ic_phone,
            info = "+11 (123) 444 555 666"
        )
        ContactInfo(
            iconId = R.drawable.ic_share,
            info = "@AndroidDev"
        )
        ContactInfo(
            iconId = R.drawable.ic_email,
            info = "jen.doe@android.com"
        )
    }
}

@Composable
fun ContactInfo(iconId: Int, info: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = iconId),
            contentDescription = null,
            modifier = Modifier.size(24.dp).padding(end = 8.dp)
        )
        Text(
            text = info,
            style = TextStyle(
                fontSize = 16.sp,
                color = Black
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview() {
    BusinessCardApp()
}
