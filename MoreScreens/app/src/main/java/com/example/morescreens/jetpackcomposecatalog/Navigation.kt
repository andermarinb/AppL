package com.example.morescreens.jetpackcomposecatalog

import androidx.compose.foundation.*
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.morescreens.R

//Componemos varias pantallas para poder navegar entre ellas
@Composable
fun LoginScreen(navController: NavHostController) {
    var pass by remember{ mutableStateOf("")}
    var email by remember{ mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.LightGray)
            .paint(
                painter = painterResource(id = R.drawable.fondoapp),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {


        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //para recordar los cambios

            TextField(value = email, onValueChange = {email = it},label = {Text(text = "Email")},
                modifier = Modifier
                    .background(color = Color.White)
                    .border(5.dp, color = Color.Blue, shape = RoundedCornerShape(3.dp)))

            Spacer(modifier = Modifier.size(20.dp))

            TextField(value = pass, onValueChange = {pass = it},label = {Text(text = "Password")},
                modifier = Modifier
                    .background(color = Color.White)
                    .border(5.dp, color = Color.Blue, shape = RoundedCornerShape(3.dp)))

            Spacer(modifier = Modifier.size(20.dp))
            Button(
                onClick = { navController.navigate("oneScreen") },
                modifier = Modifier
                    .size(250.dp, 100.dp)
            ) {
                Text(
                    text = "Login", modifier = Modifier
                        .scale(1.5f)
                        .align(Alignment.CenterVertically)
                )
            }
            Spacer(modifier = Modifier.size(30.dp))
            Button(
                onClick = { navController.navigate("registerScreen") },
                modifier = Modifier

                    .size(250.dp, 100.dp)
            ) {
                Text(
                    text = "Registro", modifier = Modifier
                        .scale(1.5f)
                        .align(Alignment.CenterVertically)
                )
            }
        }
    }
}

@Composable
fun RegisterScreen(navController: NavHostController) {
    var pass by remember{ mutableStateOf("")}
    var email by remember{ mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.LightGray)
            .paint(
                painter = painterResource(id = R.drawable.fondoapp),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {


        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //para recordar los cambios

            TextField(value = email, onValueChange = {email = it},label = {Text(text = "Email")},
                modifier = Modifier
                    .background(color = Color.White)
                    .border(5.dp, color = Color.Blue, shape = RoundedCornerShape(3.dp)))

            Spacer(modifier = Modifier.size(20.dp))

            TextField(value = pass, onValueChange = {pass = it},label = {Text(text = "Password")},
                modifier = Modifier
                    .background(color = Color.White)
                    .border(5.dp, color = Color.Blue, shape = RoundedCornerShape(3.dp)))

            Spacer(modifier = Modifier.size(20.dp))
            Button(
                onClick = { navController.navigate("loginScreen") },
                modifier = Modifier

                    .size(250.dp, 100.dp)
            ) {
                Text(
                    text = "Registrarse", modifier = Modifier
                        .scale(1.5f)
                        .align(Alignment.CenterVertically)
                )
            }
        }
    }
}

@Composable
fun OneScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.LightGray)
            .paint(
                painter = painterResource(id = R.drawable.fondoapp),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { navController.navigate("twoScreen") },
                modifier = Modifier
                    .size(250.dp, 100.dp)
            ) {
                Text(
                    text = "Empezar a practicar", modifier = Modifier
                        .scale(1.5f)
                        .align(Alignment.CenterVertically)
                )
            }
            Spacer(modifier = Modifier.size(30.dp))
            Button(
                onClick = { navController.navigate("contenido1") },
                modifier = Modifier

                    .size(250.dp, 100.dp)
            ) {
                Text(
                    text = "Contenido de estudios", modifier = Modifier
                        .scale(1.5f)
                        .align(Alignment.CenterVertically)
                )
            }
        }
    }
}

@Composable
fun TwoScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.LightGray)
            .paint(
                painter = painterResource(id = R.drawable.fondoapp),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "PRIMERA ACTIVIDAD", modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .scale(2f),
                color = Color.White
            )
            Spacer(modifier = Modifier.size(100.dp))
            Box(
                modifier = Modifier
                    .size(2000.dp, 100.dp)
                    .background(Color.White)
            ) {
                Column() {
                    Text(
                        text = "Elige la opcion correcta dado el siguiente código:"
                    )
                    Spacer(
                        modifier = Modifier
                            .padding(7.dp)
                    )

                    Text(
                        text = "String nombre = pepe;"
                    )
                    Spacer(modifier = Modifier.padding(7.dp))


                    Text(
                        text = "System.out.println(Bienvenido + nombre);"
                    )
                }
            }
            Spacer(modifier = Modifier.size(30.dp))
            Column() {
                Button(
                    onClick = { navController.navigate("threeScreen") },
                    modifier = Modifier
                        .size(300.dp, 80.dp)
                ) {
                    Text(
                        text = "Esta mal escrito", modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .scale(1.8f)
                    )
                }
                Spacer(modifier = Modifier.size(30.dp))
                Button(
                    onClick = { navController.navigate("errorScreen") },
                    modifier = Modifier

                        .size(300.dp, 80.dp)
                ) {
                    Text(
                        text = "Bienvenido pepe", modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .scale(1.6f)
                    )
                }
                Spacer(modifier = Modifier.size(30.dp))
                Button(
                    onClick = { navController.navigate("errorScreen") },
                    modifier = Modifier

                        .size(300.dp, 80.dp)
                ) {
                    Text(
                        text = "Bienvenido + pepe", modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .scale(1.6f)
                    )
                }
            }
        }
    }
}

@Composable
fun ThreeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.LightGray)
            .paint(
                painter = painterResource(id = R.drawable.fondoapp),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "SEGUNDA ACTIVIDAD", modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .scale(2f),
                color = Color.White
            )
            Spacer(modifier = Modifier.size(100.dp))
            Box(
                modifier = Modifier
                    .size(2000.dp, 150.dp)
                    .background(Color.White)
            ) {
                Column() {
                    Text(
                        text = "Elige la opcion correcta dado el siguiente código:"
                    )
                    Spacer(
                        modifier = Modifier
                            .padding(7.dp)
                    )

                    Text(
                        text = "int x = 2;"
                    )
                    Spacer(modifier = Modifier.padding(7.dp))

                    Text(
                        text = "int y = 5;"
                    )
                    Spacer(modifier = Modifier.padding(7.dp))

                    Text(
                        text = "System.out.println(y + x)"
                    )
                }
            }
            Spacer(modifier = Modifier.size(30.dp))
            Column() {
                Button(
                    onClick = { navController.navigate("errorScreen") },
                    modifier = Modifier
                        .size(300.dp, 50.dp)
                ) {
                    Text(
                        text = "8", modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .scale(1.8f)
                    )
                }
                Spacer(modifier = Modifier.size(30.dp))
                Button(
                    onClick = { navController.navigate("fourScreen") },
                    modifier = Modifier

                        .size(300.dp, 50.dp)
                ) {
                    Text(
                        text = "7", modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .scale(1.6f)
                    )
                }
                Spacer(modifier = Modifier.size(30.dp))
                Button(
                    onClick = { navController.navigate("errorScreen") },
                    modifier = Modifier

                        .size(300.dp, 50.dp)
                ) {
                    Text(
                        text = "3", modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .scale(1.6f)
                    )
                }
            }
        }
    }
}

@Composable
fun FourScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.LightGray)
            .paint(
                painter = painterResource(id = R.drawable.fondoapp),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "TERCERA ACTIVIDAD", modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .scale(2f),
                color = Color.White
            )
            Spacer(modifier = Modifier.size(100.dp))
            Box(
                modifier = Modifier
                    .size(2000.dp, 150.dp)
                    .background(Color.White)
            ) {
                Column() {
                    Text(
                        text = "Indica cual de las variables son validas:"
                    )
                    Spacer(modifier = Modifier.padding(7.dp))

                    Text(
                        text = "a) while;"
                    )
                    Spacer(modifier = Modifier.padding(7.dp))

                    Text(
                        text = "b) x;"
                    )
                    Spacer(modifier = Modifier.padding(7.dp))

                    Text(
                        text = "c) nombre y apellidos"
                    )
                }
            }
            Spacer(modifier = Modifier.size(30.dp))
            Column() {
                Button(
                    onClick = { navController.navigate("errorScreen") },
                    modifier = Modifier
                        .size(300.dp, 50.dp)
                ) {
                    Text(
                        text = "A)", modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .scale(1.8f)
                    )
                }
                Spacer(modifier = Modifier.size(30.dp))
                Button(
                    onClick = { navController.navigate("oneScreen") },
                    modifier = Modifier

                        .size(300.dp, 50.dp)
                ) {
                    Text(
                        text = "B)", modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .scale(1.6f)
                    )
                }
                Spacer(modifier = Modifier.size(30.dp))
                Button(
                    onClick = { navController.navigate("errorScreen") },
                    modifier = Modifier

                        .size(300.dp, 50.dp)
                ) {
                    Text(
                        text = "C)", modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .scale(1.6f)
                    )
                }
            }
        }
    }
}

@Composable
fun ErrorScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.LightGray)
            .paint(
                painter = painterResource(id = R.drawable.error),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {

        Button(
            onClick = { navController.navigate("oneScreen") },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
            modifier = Modifier
                .size(350.dp, 55.dp)
                .fillMaxSize()
                .border(8.dp, color = Color.Black, shape = RoundedCornerShape(7.dp))
        ) {
            Text(
                text = "Error, inténtalo de nuevo", modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .scale(1.6f)
            )
        }
    }
}

@Composable
fun Contenido1(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.LightGray)
            .verticalScroll(rememberScrollState())
            .paint(
                painter = painterResource(id = R.drawable.fondoapp),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.padding(5.dp))
        Box(
            modifier = Modifier
                .background(Color.LightGray)
        )
        {
            Text(
                text = "Hay muchos tipos de datos, los enteros (int) que son para trabajar con números " +
                        "enteros, los flotantes (float) que son números decimales, los booleanos (boolean) " +
                        "que devuelven verdadero o falso y tambien de texto (String,char,etc.) que manipulan" +
                        " cadenas,(varios caracteres, incluidos espacios y caracteres especiales) o caracteres " +
                        "(un solo caracter). "
            )
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Box(
            modifier = Modifier
                .background(Color.LightGray)
        )
        {
            Text(
                text = "+ Suma. Los operandos pueden ser enteros o reales. \n" +
                        "- Resta. Los operandos pueden ser enteros o reales.\n" +
                        "* Multiplicación. Los operandos pueden ser enteros o reales.\n" +
                        "/ División. Los operandos pueden ser enteros o reales. Si ambos son enteros\n" +
                        "el resultado es entero. En cualquier otro caso el resultado es real. \n" +
                        "% Resto de la división. Los números pueden ser enteros o reales."
            )
        }
        Spacer(modifier = Modifier.padding(10.dp))

        Box(
            modifier = Modifier
                .background(Color.LightGray)
        )
        {
            Text(
                text = "Las palabras reservadas son identificadores predefinidos que tienen un significado para el\n" +
                        "compilador y por tanto no pueden usarse como identificadores creados por el usuario en los\n" +
                        "programas."
            )

        }
        Spacer(modifier = Modifier.padding(10.dp))
        Box(
            modifier = Modifier
                .background(Color.LightGray)
        )
        {
            val palabrasRes = painterResource(R.drawable.reservadas)
            Image(
                painter = palabrasRes, contentDescription = null, modifier = Modifier
                    .fillMaxWidth()
            )
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Box(
            modifier = Modifier
                .background(Color.LightGray)
        )
        {
            Text(
                text = "Las palabras reservadas son identificadores predefinidos que tienen un significado para el\n" +
                        "compilador y por tanto no pueden usarse como identificadores creados por el usuario en los\n" +
                        "programas."
            )
        }
    }
}
