package com.aulasandroid.componenteestado



import android.R.attr.label
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.LineHeightStyle
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
    var corFundo by remember {
        mutableStateOf(Color(247, 139, 18, 255))
    }
    Column(
        modifier = modifier
            .background(corFundo)
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        var valorNome by remember {
            mutableStateOf("")
        }
        var valorIdade by remember {
            mutableStateOf("")
        }
        var email by remember {
            mutableStateOf("")
        }
        var jCompose by remember {
            mutableStateOf(false)
        }
        var xml by remember {
            mutableStateOf(false)
        }
//        var ios by remember {
//            mutableStateOf(false)
//        }
//        var android by remember {
//            mutableStateOf(false)
//        }
//        var wPhone by remember {
//            mutableStateOf(false)
//        }
        var sOperacionais by remember {
            mutableStateOf("")
        }

        var favoritado by remember {
            mutableStateOf(false)
        }



        TextField(
            value = valorNome,
            onValueChange = { novoValor ->
                valorNome = novoValor
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

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = valorIdade,
            onValueChange = { novoValor ->
                valorIdade = novoValor
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

            },
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Magenta,
                unfocusedTextColor = Color.Blue,
                focusedPlaceholderColor = Color.Red,
                focusedTrailingIconColor = Color.Yellow
            )
        )

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            singleLine = true,
            label = {
                Text(text = "Email")
            },
            shape = RoundedCornerShape(topStart = 20.dp, bottomEnd = 20.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Magenta,
                unfocusedTextColor = Color.Blue,
                focusedPlaceholderColor = Color.Red,
                focusedTrailingIconColor = Color.Yellow,
                focusedBorderColor = Color.Green,
                unfocusedBorderColor = Color.White
            )
        )
        Row( modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Checkbox(
                checked = jCompose,
                onCheckedChange = {jCompose = it},
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Green,
                    uncheckedColor = Color.Red
                )
            )
            Text(text = "Jetpack Compose")
        }
        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Checkbox(
                checked = xml,
                onCheckedChange = {xml = it},
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Green,
                    uncheckedColor = Color.Red
                )
            )
            Text(text = "XML")
        }
        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
        RadioButton(
            selected = sOperacionais == "ios",
            onClick = {
//                ios = true
//                android = false
//                wPhone = false
                sOperacionais = "ios"
            },

        )
            Text(text = "IOS")
        }
        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
        RadioButton(
            selected = sOperacionais == "android",
            onClick = {
//                ios = false
//                wPhone = false
//                android = true
                sOperacionais = "android"
            },

            )
        Text(text = "ANDROID")
        }
        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            RadioButton(
                selected = sOperacionais == "wPhone",
                onClick = {
//                    ios = false
//                    wPhone = true
//                    android = false
                    sOperacionais = "wPhone"
                },

                )
            Text(text = "Windows Phone")
        }

        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                onClick = {
                    corFundo = Color.Cyan
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.Black

                ),
                border = BorderStroke(width = 4.dp, Color.Cyan),
                shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp)
            ) {
                Text(text = "Clique Aqui")
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "Star icon",
                )
            }
            OutlinedButton(
                onClick = {
                    corFundo = Color.Yellow
                }
            ) {
                Text(text = "Não, clique aqui!")
            }
        }
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            if (favoritado){
                Icon(
                    modifier = Modifier.size(40.dp)
                        .clickable{
                            favoritado = false
                        },
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Favorite icon"
                )
            } else {
                Icon(
                    modifier = Modifier.size(40.dp)
                        .clickable{
                            favoritado = true
                        },
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "Favorite border icon"
                )
            }
        }

    }
}


