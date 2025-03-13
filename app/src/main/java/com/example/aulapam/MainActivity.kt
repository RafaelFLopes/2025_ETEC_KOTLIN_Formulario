package com.example.aulapam

import androidx.compose.runtime.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aulapam.ui.theme.AulaPamTheme
import com.example.aulapam.ui.theme.Black

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AulaPamTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    produtoItem()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun produtoItem() {

    var nome by remember { mutableStateOf("")}
    var sobrenome by remember { mutableStateOf("")}
    var cpf by remember { mutableStateOf("")}
    var cep by remember { mutableStateOf("")}
    var telefone by remember { mutableStateOf("")}

    Column(){
        Box(
            modifier = Modifier
                .height(100.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Black, Black
                        )
                    )
                )

                .fillMaxWidth()
        ){
            Image(
                painter = painterResource(id = R.drawable.fotoperfilkotlin),
                contentDescription = "Descrição da imagem",
                modifier = Modifier
                    .offset(y = (50).dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.BottomCenter)
            )
        }

                Spacer(modifier = Modifier.height(50.dp))

        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
            )
        {
            Text(
                text = "Cadastre-se",
                fontSize = 18.sp, fontWeight = FontWeight(800),
                maxLines = 2,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Para mais informações é necessário um cadastro",
                fontSize = 14.sp,
                color = Color(0xFF737373),
                fontWeight = FontWeight(500)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                modifier = Modifier.align(Alignment.Start),
                text = "Nome",
                fontSize = 16.sp,
                color = Color(0xFF000000),
                fontWeight = FontWeight(400)
            )


            TextField(
                value = nome,
                onValueChange = { nome = it },
                placeholder = { Text("Nome") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                modifier = Modifier.align(Alignment.Start),
                text = "Sobrenome",
                fontSize = 16.sp,
                color = Color(0xFF000000),
                fontWeight = FontWeight(400)
            )
            TextField(
                value = sobrenome,
                onValueChange = {sobrenome = it},
                placeholder = { Text("Sobrenome") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                modifier = Modifier.align(Alignment.Start),
                text = "CPF",
                fontSize = 16.sp,
                color = Color(0xFF000000),
                fontWeight = FontWeight(400)
            )
            TextField(
                value = cpf,
                onValueChange = {cpf = it},
                placeholder = { Text("CPF") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                modifier = Modifier.align(Alignment.Start),
                text = "CEP",
                fontSize = 16.sp,
                color = Color(0xFF000000),
                fontWeight = FontWeight(400)
            )
            TextField(
                value = cep,
                onValueChange = {cep = it},
                placeholder = { Text("CEP") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(12.dp))

            Text(
                modifier = Modifier.align(Alignment.Start),
                text = "Telefone",
                fontSize = 16.sp,
                color = Color(0xFF000000),
                fontWeight = FontWeight(400)
            )
            TextField(
                value = telefone,
                onValueChange = { telefone = it },
                placeholder = { Text("Telefone") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                        colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black, // Cor de fundo do botão
                        contentColor = Color.White
                        )
            ) {
                Text(
                    text = "Cadastrar",
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700)

                )
            }
        }

    }
}


