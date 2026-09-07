package com.example.dibujo_ascii

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.dibujo_ascii.ui.theme.DibujoASCIITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DibujoASCIITheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color.Black
                ) { innerPadding ->
                    DibujoPacman(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun DibujoPacman(modifier: Modifier = Modifier) {
    val pacman = """
        /////       
    ///////////     
  ///////////////   
 ///////////        
 ///////////        
  ///////////////   
    ///////////     
        /////       
    """.trimIndent()


    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = pacman,
            color = Color.White,
            fontFamily = FontFamily.Monospace,
            fontSize = 28.sp,
            lineHeight = 32.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DibujoPacmanPreview() {
    DibujoASCIITheme {
        Scaffold(containerColor = Color.Black) { innerPadding ->
            DibujoPacman(modifier = Modifier.padding(innerPadding))
        }
    }
}