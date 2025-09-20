package com.example.profilapp_235150201111029brandon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import com.example.profilapp_235150201111029brandon.ui.theme.ProfilApp_235150201111029BrandonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfilApp_235150201111029BrandonTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfileScreen(
                        nama = "Brandon Geraldo Adji",
                        nim = "235150201111029",
                        deskripsi = "Mahasiswa Teknik Informatika"
                    )
                }
            }
        }
    }
}

@Composable
fun ProfileScreen(
    nama: String,
    nim: String,
    deskripsi: String
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F6FA))
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .background(Color(0xFFE8E9FF), RoundedCornerShape(16.dp))
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.foto),
                contentDescription = "Foto Profil",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text("Nama: $nama", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("NIM: $nim", fontSize = 16.sp)
            Text(deskripsi, fontSize = 14.sp)

            Spacer(modifier = Modifier.height(12.dp))

            FollowButtons()
        }
    }
}

@Composable
fun FollowButtons() {
    var isFollowed by remember { mutableStateOf(false) }
    Button(onClick = { isFollowed = !isFollowed }) {
        Text(if (isFollowed) "Unfollow" else "Follow")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfileScreen() {
    ProfilApp_235150201111029BrandonTheme {
        ProfileScreen(
            nama = "Brandon Geraldo Adji",
            nim = "235150201111029",
            deskripsi = "Mahasiswa Teknik Informatika"
        )
    }
}
