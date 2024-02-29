package br.senai.sp.jandira.calculadora_imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadora_imc.ui.theme.Calculadora_imcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calculadora_imcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Row (modifier = Modifier
            .fillMaxWidth()
            .height(240.dp)
            .background(color = Color(0xFFEA1450))
            .padding(20.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){

            Column (modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally){
                Card (shape = CircleShape,
                    modifier = Modifier.size(width = 100.dp, height = 100.dp)){
                    Image(
                        painter = painterResource(id = R.drawable.imc),
                        contentDescription = " Calculadora de IMC ",
                        contentScale = ContentScale.FillBounds
                    )
                }
                Text(text = " calculadora IMC",
                    color = Color.White,
                    fontWeight = FontWeight.Black,
                    fontSize = 30.sp
                )
            }
        }

        Column (modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Card (modifier = Modifier
                .offset(y = (-30).dp)
                .padding(horizontal = 50.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFF9F6F6))){
                Column (modifier = Modifier
                    .height(350.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly

                ) {
                    Text(text = "Seus dados",
                        color = Color(0xFFEA1450),
                        fontWeight = FontWeight.Black,
                        fontSize = 25.sp
                    )
                    Column {
                        Text(text = "seu peso:",
                            color = Color(0xFFEA1450),
                        )
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            placeholder = {
                                Text(text = "seu peso em KG",
                                    color = Color(0xFFAFA9A9)
                                )
                            },
                            shape = RoundedCornerShape(8.dp),
                            colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = Color(0xFFAFA9A9))
                            )

                        Text(text = "sua altura:",
                            color = Color(0xFFEA1450),
                        )
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            placeholder = {
                                Text(text = "sua altura em cm",
                                    color = Color(0xFFAFA9A9)
                                )
                            },
                            shape = RoundedCornerShape(8.dp),
                            colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = Color(0xFFAFA9A9)
                                )
                            )
                    }


                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(horizontal = 24.dp)
                            .width(250.dp)
                            .height(60.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFFEA1450))) {
                        Text(text = "Calcular",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Black)
                    }

                }

            }

            Card (modifier = Modifier
                .width(300.dp)
                .height(110.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF329F6B)
                )
            ){
                Row (verticalAlignment = Alignment.CenterVertically){
                    Column (modifier = Modifier.padding(30.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Resultado",
                            color = Color.White,
                        )
                        Text(text = "Peso Ideal",
                            color = Color.White,
                            fontSize = 23.sp
                        )
                    }

                    Text(text = "21.3",
                        color = Color.White,
                        fontSize = 40.sp,
                        fontWeight = FontWeight(700)
                    )
                }
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Calculadora_imcTheme {
        Greeting()
    }
}