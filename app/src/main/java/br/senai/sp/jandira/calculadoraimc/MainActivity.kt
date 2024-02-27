package br.senai.sp.jandira.calculadoraimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadoraimc.ui.theme.CalculadoraImcTheme
import br.senai.sp.jandira.calculadoraimc.ui.theme.Poppins

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
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(225.dp)
                .background(Color(0xFFED145B),),
            verticalArrangement = Arrangement.Top, Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logotipo da aplicacão",
                modifier = Modifier
                    .size(
                        height = 85.dp,
                        width = 200.dp
                    )
                    .padding(10.dp)
                    .offset(y = 10.dp)
            )
            Text(
                modifier = Modifier.offset(y = 15.dp),
                text = "Calculadora IMC",
                fontSize = 30.sp,
                color = Color(0xFFFFFBFD),
                fontWeight = FontWeight.Bold,
                fontFamily = Poppins
            )
        }
        Card(
            modifier = Modifier
                .width(340.dp)
                .height(400.dp)
                .offset(y = -60.dp)
                .padding(8.dp),
            colors = CardDefaults
                .cardColors(containerColor = Color(0xFFF1F0F0)),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)

        ) {
            Column (
                modifier = Modifier.padding(23.dp),
            ){
                Text(
                    modifier = Modifier
                        .padding(bottom = 18.dp)
                        .fillMaxWidth(),
                    text = "Seus dados",
                    fontSize = 25.sp,
                    color = Color(0xFFED145B),
                    fontFamily = Poppins,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold

                )
                Text(
                    modifier = Modifier.padding(vertical = 5.dp),
                    text = "Seu peso:",
                    fontSize = 15.sp,
                    color = Color(0xFFED145B),
                    fontFamily = Poppins
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp),
                    placeholder =  {
                        Text(
                            text = "Seu peso em Kg",
                            color = Color(0xFFAFA9A9),
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 10.dp),
                            fontFamily = Poppins
                        )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            unfocusedBorderColor = Color(0xFFED145B),
                            unfocusedContainerColor = Color(0xFFFFFFFF),
                            focusedBorderColor = Color(0xFFFAFAFA)
                        ),
                            shape = RoundedCornerShape(12.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    modifier = Modifier.padding(vertical = 7.dp),
                    text = "Sua altura:",
                    fontSize = 15.sp,
                    color = Color(0xFFFD286B),
                    fontFamily = Poppins
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp),
                    placeholder =  {
                        Text(
                            modifier = Modifier.padding(start = 10.dp),
                            text = "Sua altura em cm",
                            color = Color(0xFFAFA9A9),
                            fontSize = 15.sp,
                            fontFamily = Poppins
                        )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            unfocusedBorderColor = Color(0xFFED145B),
                            unfocusedContainerColor = Color(0xFFFFFFFF),
                            focusedBorderColor = Color(0xFFED145B)
                        ),
                    shape = RoundedCornerShape(12.dp)
                )

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(285.dp)
                        .height(100.dp)
                        .padding(top = 30.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFED145B)),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(
                        text = "CALCULAR",
                        fontSize = 17.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }
        Card(
                modifier = Modifier
                    .width(340.dp)
                    .height(130.dp)
                    .offset(y = -40.dp)
                    .padding(8.dp),
                colors = CardDefaults
                    .cardColors(containerColor = Color(0xFF329F6B)),
                border = BorderStroke(1.dp, color = Color(0xFFED145B))
        ){
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 20.dp)
            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(5.dp)
                ){
                    Text(
                        modifier = Modifier
                            .padding(start = 30.dp),
                        text = "Resultado",
                        color = Color(0xFFFFFFFF),
                        fontFamily = Poppins
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 30.dp),
                        text = "Peso Ideal",
                        fontSize = 23.sp,
                        color = Color(0xFFFFFFFF),
                        fontFamily = Poppins
                    )
                }
                Text(
                    modifier = Modifier
                        .padding(start = 40.dp),
                    text = "21.3",
                    fontSize = 43.sp,
                    color = Color(0xFFFFFFFF),
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold
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