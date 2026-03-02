package com.aulasandroid.componenteestado



import android.os.Bundle
import android.util.Log
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Label
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
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
                   //BasicComponentsScreen(modifier = Modifier.padding(innerPadding))
                    ComponentesEstadosScreen(modifier = Modifier.padding(innerPadding))
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

@Composable
fun ComponentesEstadosScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val valorNome = remember {
            mutableStateOf("")
        }
        TextField(
            value = valorNome.value,
            onValueChange = { novoValor ->
                valorNome.value = novoValor
            },
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words
            ),
            placeholder = {
                Text(text = "Digite seu nome ")
            },
            label = {
                Text(text = "Nome e Sobrenome ")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Icone Pessoa",
                    tint = Color(8, 68, 166, 255)
                )
            }
        )
        val valorIdade = remember {
            mutableStateOf("")
        }
        TextField(
            value = valorIdade.value,
            onValueChange = { novoValor ->
                valorIdade.value = novoValor
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = {
                Text(text = "Digite sua idade")
            },
            label = {
                Text(text = "Idade")
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = "Icone Pessoa",
                    tint = Color(8, 68, 166, 255)
                )

            }
        )
    }
}

