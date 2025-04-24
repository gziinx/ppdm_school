package br.senai.sp.jandira.lionschool.ui.theme.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable

fun cursoScreen () {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(40.dp)
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()


        ) {
            Row (
                    modifier = Modifier
                        .height(70.dp)
                        .fillMaxWidth()

            ) {
                Image(
                    modifier = Modifier
                        .size(65.dp),
                    painter = painterResource(
                        R.drawable.logoimage
                    ),
                    contentDescription = "",
                )
                    Text(
                        text = stringResource(
                            R.string.titulo2
                        ),
                        color = colorResource(
                            R.color.bluedark
                        ),
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )

            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(color = colorResource(R.color.yellow))
            )
            Column(
                modifier = Modifier
                    .height(60.dp)
            ) {
                OutlinedTextField(
                    value = "",
                    onValueChange = {

                    },
                    modifier = Modifier
                        .fillMaxWidth(),


                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "",
                            tint = Color(0xFF3F2621)

                        )
                    },
                    label = {
                        Text(
                            text = stringResource(
                                R.string.field
                            ),
                        )
                    },

                )
            }
            Column (

            ) {
                Row(
                    modifier = Modifier
                        .height(36.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier

                            .size(36.dp),
                        painter = painterResource(
                            R.drawable.lion_list


                        ),
                        contentDescription = "",
                    )
                    Text(
                        text = stringResource(
                            R.string.curso
                        ),
                        color = colorResource(
                            R.color.bluedark
                        ),
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(190.dp)
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(
                                    colorResource(R.color.bluedark),
                                    colorResource(R.color.degrade1)
                                )
                            ),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .border(1.dp, colorResource(R.color.yellow), shape = RoundedCornerShape(16.dp))
                ){
                    Column(
                    ){
                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp)
                                .height(80.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                modifier = Modifier
                                    .padding(start = 10.dp)
                                    .size(101.dp),
                                painter = painterResource(
                                    R.drawable.programming1


                                ),
                                contentDescription = ""
                            )
                            Text(
                                modifier = Modifier
                                ,
                                color = colorResource(
                                    R.color.yellow
                                ),
                                fontWeight = FontWeight.ExtraBold ,
                                fontSize = 76.sp,
                                text = stringResource(
                                    R.string.ds
                                )
                            )
                        }
                        Column (modifier = Modifier
                            .padding(start = 25.dp)
                        ) {
                            Text(
                                modifier = Modifier
                                ,
                                color = (
                                        Color.White
                                        ),
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp,
                                text = stringResource(
                                    R.string.frase3
                                )
                            )
                            Text(
                                modifier = Modifier
                                ,
                                color = (
                                        Color.White
                                        ),

                                fontSize = 12.sp,
                                text = stringResource(
                                    R.string.frase4
                                )
                            )
                            Row (
                                modifier = Modifier
                                    .height(45.dp),
                                verticalAlignment = Alignment.Bottom) {
                                Image(
                                    modifier = Modifier

                                        .size(16.dp),
                                    painter = painterResource(
                                        R.drawable.watchlater
                                    ),
                                    contentDescription = ""
                                )
                                Text(
                                    modifier = Modifier
                                    ,
                                    color = (
                                            Color.White
                                            ),

                                    fontSize = 12.sp,
                                    text = stringResource(
                                        R.string.semestres
                                    )
                                )
                            }
                        }
                    }

                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(190.dp)
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(
                                    colorResource(R.color.bluedark),
                                    colorResource(R.color.degrade2)
                                )
                            ),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .border(1.dp, colorResource(R.color.yellow), shape = RoundedCornerShape(16.dp))
                ){
                    Column(){
                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp)
                                .height(80.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                modifier = Modifier
                                    .padding(start = 10.dp)
                                    .size(101.dp),
                                painter = painterResource(
                                    R.drawable.internet1


                                ),
                                contentDescription = ""
                            )
                            Text(
                                modifier = Modifier
                                ,
                                color = colorResource(
                                    R.color.yellow
                                ),
                                fontWeight = FontWeight.ExtraBold ,
                                fontSize = 76.sp,
                                text = stringResource(
                                    R.string.rds
                                )
                            )
                        }
                        Column (modifier = Modifier
                            .padding(start = 25.dp)
                        ) {
                            Text(
                                modifier = Modifier
                                ,
                                color = (
                                        Color.White
                                        ),
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp,
                                text = stringResource(
                                    R.string.frase3
                                )
                            )
                            Text(
                                modifier = Modifier
                                ,
                                color = (
                                        Color.White
                                        ),

                                fontSize = 12.sp,
                                text = stringResource(
                                    R.string.frase4
                                )
                            )
                            Row (
                                modifier = Modifier
                                    .height(45.dp),
                                verticalAlignment = Alignment.Bottom) {
                                Image(
                                    modifier = Modifier

                                        .size(16.dp),
                                    painter = painterResource(
                                        R.drawable.watchlater
                                    ),
                                    contentDescription = ""
                                )
                                Text(
                                    modifier = Modifier
                                    ,
                                    color = (
                                            Color.White
                                            ),

                                    fontSize = 12.sp,
                                    text = stringResource(
                                        R.string.semestres
                                    )
                                )
                            }
                        }
                    }

                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(190.dp)
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(
                                    colorResource(R.color.degrade3),
                                    colorResource(R.color.degrade1)
                                )
                            ),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .border(1.dp, colorResource(R.color.yellow), shape = RoundedCornerShape(16.dp))
                ){
                    Column(){
                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp)
                                .height(80.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                modifier = Modifier
                                    .padding(start = 10.dp)
                                    .size(101.dp),
                                painter = painterResource(
                                    R.drawable.lion_chip1


                                ),
                                contentDescription = ""
                            )
                            Text(
                                modifier = Modifier
                                ,
                                color = colorResource(
                                    R.color.yellow
                                ),
                                fontWeight = FontWeight.ExtraBold ,
                                fontSize = 76.sp,
                                text = stringResource(
                                    R.string.ele
                                )
                            )
                        }
                        Column (modifier = Modifier
                            .padding(start = 25.dp)
                        ) {
                            Text(
                                modifier = Modifier
                                ,
                                color = (
                                        Color.White
                                        ),
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp,
                                text = stringResource(
                                    R.string.frase3
                                )
                            )
                            Text(
                                modifier = Modifier
                                ,
                                color = (
                                        Color.White
                                        ),

                                fontSize = 12.sp,
                                text = stringResource(
                                    R.string.frase4
                                )
                            )
                            Row (
                                modifier = Modifier
                                    .height(45.dp),
                                verticalAlignment = Alignment.Bottom) {
                                Image(
                                    modifier = Modifier

                                        .size(16.dp),
                                    painter = painterResource(
                                        R.drawable.watchlater
                                    ),
                                    contentDescription = ""
                                )
                                Text(
                                    modifier = Modifier
                                    ,
                                    color = (
                                            Color.White
                                            ),

                                    fontSize = 12.sp,
                                    text = stringResource(
                                        R.string.semestres
                                    )
                                )
                            }
                        }
                    }

                }


            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    cursoScreen()
}