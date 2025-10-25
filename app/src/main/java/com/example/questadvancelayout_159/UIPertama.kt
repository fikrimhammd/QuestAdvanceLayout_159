package com.example.questadvancelayout_159

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfilScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.foto_saya),
            contentDescription = "Profile Photo",
            modifier = Modifier
                .size(115.dp)
                .clip(CircleShape)
                .border(3.dp, Color.Gray, CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(14.dp))

        Text(
            text = "Muhammad Dzulfikri",
            color = Color.White,
            fontSize = 20.sp
        )

        Text(
            text = "@Dzulfikri08",
            color = Color.Gray,
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Saya seorang Mahasiswa Teknologi Informasi",
            color = Color.White,
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            SocialIcon(R.drawable.logo_instagram, "https://instagram.com/")
            Spacer(Modifier.width(18.dp))
            SocialIcon(R.drawable.logo_facebook, "https://facebook.com/")
            Spacer(Modifier.width(18.dp))
            SocialIcon(R.drawable.logo_whatsapp, "https://wa.me/6281234567890")
            Spacer(Modifier.width(18.dp))
            SocialIcon(R.drawable.logo_linkedin, "https://linkedin.com/")
        }

        Spacer(modifier = Modifier.height(30.dp))

        MenuItem(Icons.Default.Lock, "Privacy")
        Spacer(modifier = Modifier.height(12.dp))
        MenuItem(Icons.Default.Description, "Riwayat Transaksi")
        Spacer(modifier = Modifier.height(12.dp))
        MenuItem(Icons.Default.Settings, "Pengaturan")

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "copyright, 2025",
            color = Color.Gray,
            fontSize = 12.sp,
            modifier = Modifier.padding(bottom = 12.dp)
        )
    }
}

@Composable
fun MenuItem(icon: ImageVector, title: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF222222))
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(icon, contentDescription = title, tint = Color.White)
            Spacer(modifier = Modifier.width(12.dp))
            Text(title, color = Color.White, fontSize = 16.sp)
        }
    }
}

@Composable
fun SocialIcon(icon: Int, url: String) {
    val context = LocalContext.current
    IconButton(onClick = {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        context.startActivity(intent)
    }) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier.size(28.dp)
        )
    }
}
