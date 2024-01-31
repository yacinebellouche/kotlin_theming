package com.example.theming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.theming.ui.theme.ThemingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThemingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Test_UI()
                }
            }
        }
    }
}

@Composable
fun Test_UI() {
    val appModifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text(
            text = "My Title",
            modifier = appModifier,
            style = MaterialTheme.typography.titleLarge
        )
        OutlinedTextField(value = "", onValueChange = {}, modifier = appModifier)
        Button(onClick = { }, modifier = appModifier, shape = MaterialTheme.shapes.small) {
            Text(text = "Submit")
        }
    }


}

@Preview(showBackground = true)
@Composable
fun Test_UIPreview() {
    ThemingTheme {
        Test_UI()
    }
}