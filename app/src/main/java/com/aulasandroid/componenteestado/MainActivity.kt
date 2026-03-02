package com.aulasandroid.componenteestado



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.componenteestado.ui.theme.ComponenteEstadoTheme

val Righteus = FontFamily(
    Font(R.font.righteous_regular)
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComponenteEstadoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   BasicComponentsScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
// Construir uma tela com componentes basicos
fun BasicComponentsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(247, 139, 18, 255))
    )
    {
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "Aulas Android",
            fontSize = 32.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3DDC84),
            textAlign = TextAlign.End,
            letterSpacing = 4.sp
        )
        Text(
            modifier =
                Modifier.align(Alignment.CenterHorizontally),
            text = "com JetpackCompose",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = Righteus,
            color = Color(66, 133, 244)
        )
    }

}


