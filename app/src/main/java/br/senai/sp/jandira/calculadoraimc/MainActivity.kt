package br.senai.sp.jandira.calculadoraimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadoraimc.ui.theme.CalculadoraImcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraImcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Calculadora()
                }
            }
        }
    }
}

@Composable
fun Calculadora() {
    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color(0xFFFD286B)),
            verticalArrangement = Arrangement.Top, Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logotipo da aplicacão",
                modifier = Modifier.size(
                    height = 85.dp,
                    width = 200.dp)
                    .padding(10.dp)
            )
            Text(
                modifier = Modifier,
                text = "Calculadora IMC",
                fontSize = 25.sp,
                color = Color(0xFFFFFBFD),
                fontFamily = FontFamily.Serif
            )
        }
        Card(
            modifier = Modifier
                .width(270.dp)
                .height(350.dp)
                .padding(8.dp),
            colors = CardDefaults
                .cardColors(containerColor = Color(0xC9E4E2E2)),

        ) {
            Column (
                modifier = Modifier.padding(8.dp),
                verticalArrangement = Arrangement.Top, Alignment.CenterHorizontally
            ){
                Text(
                    modifier = Modifier,
                    text = "Seus dados",
                    fontSize = 25.sp,
                    color = Color(0xFFFD286B),
                    fontFamily = FontFamily.Serif
                )
                Text(
                    modifier = Modifier,
                    text = "Seu peso:",
                    fontSize = 15.sp,
                    color = Color(0xFFFD286B),
                    fontFamily = FontFamily.Serif
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    placeholder =  {
                        Text(text = "Seu peso em Kg")
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            unfocusedBorderColor = Color(0xFF383D32),
                            focusedBorderColor = Color(0xFF586648)
                        )
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    modifier = Modifier,
                    text = "Sua altura:",
                    fontSize = 15.sp,
                    color = Color(0xFFFD286B),
                    fontFamily = FontFamily.Serif
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    placeholder =  {
                        Text(text = "Sua altura em cm")
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            unfocusedBorderColor = Color(0xFF383D32),
                            focusedBorderColor = Color(0xFF586648)
                        )
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CalculadoraImcTheme {
        Calculadora()
    }
}