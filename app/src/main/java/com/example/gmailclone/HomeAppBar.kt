package com.example.gmailclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gmailclone.ui.theme.GmailCloneTheme

@Composable
fun HomeAppBar() {
    Box(modifier = Modifier.padding(10.dp)) {
        Card(
            modifier = Modifier.requiredHeight(50.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
            Row(modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
                ) {
                Icon(Icons.Default.Menu, contentDescription = "Menu")
                Text(text = "Search in emails", modifier = Modifier.weight(2.0f))
                Image(painter = painterResource(id = R.drawable.image),
                    contentDescription = "Profile",
                    modifier = Modifier.size(30.dp).clip(CircleShape))
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview(){
    GmailCloneTheme {
        GmailApp()
    }
}
