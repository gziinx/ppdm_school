package br.senai.sp.jandira.lionschool.ui.theme.screens

import android.text.Layout
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable

fun homeScreen (){
    Box (
        modifier = Modifier
            .fillMaxSize()
    ){
        Column (
            modifier = Modifier
                .fillMaxHeight()
                .width(300.dp)

                .align(
                    alignment = Alignment.Center
                )
                .padding(top = 50.dp, bottom = 30.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween


        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp
                    ),

                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,




            ) {
                Image(
                    modifier = Modifier
                        .fillMaxHeight()
                        .size(160.dp),
                    painter = painterResource(
                        R.drawable.logoimage
                    ),
                    contentDescription = "",
                )
                Text(
                    text = stringResource(
                        R.string.titulo
                    ),
                    color = colorResource(
                        R.color.bluedark
                    ),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 40.sp,
                    modifier = Modifier




                )
            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                horizontalAlignment = Alignment.CenterHorizontally,


            ){
                    Text(
                        modifier = Modifier
                            .padding(bottom =  5.dp),
                        text = stringResource(
                            R.string.frase1
                        ),
                        color = colorResource(
                            R.color.bluedark
                        ),

                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp

                    )
                    Card(
                        modifier = Modifier
                            .width(60.dp)
                            .height(6.dp),

                        colors = CardDefaults.cardColors(
                            colorResource(
                                R.color.yellow
                            )

                        )
                    ) { }
                    Text(
                        modifier = Modifier
                            .padding(top =  30.dp),
                        text = stringResource(
                            R.string.frase2
                        ),
                        color = colorResource(
                            R.color.cinza
                        ),
                        fontSize = 16.sp,


                    )



            }
            Button(
                onClick = {},
                modifier = Modifier
                    .width(276.dp)
                    .height(48.dp),

                colors = ButtonDefaults.buttonColors(colorResource(R.color.yellow)),
                border = BorderStroke(2.dp, colorResource(R.color.bluedark))
            ) {
                Text(
                    text = stringResource(
                        R.string.button1
                    ),
                    color = colorResource(R.color.bluedark)
                )
            }
            Row (
                modifier = Modifier
                    .width(210.dp)
                    .height(35.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ){
                Image(
                    modifier = Modifier

                        .size(33.dp),
                    painter = painterResource(
                        R.drawable.lion_youtube


                    ),
                    contentDescription = "",
                )
                Image(
                    modifier = Modifier

                        .size(33.dp),
                    painter = painterResource(
                        R.drawable.lion_twitter


                    ),
                    contentDescription = "",
                )
                Image(
                    modifier = Modifier

                        .size(33.dp),
                    painter = painterResource(
                        R.drawable.lion_instagram


                    ),
                    contentDescription = "",
                )
                Image(
                    modifier = Modifier

                        .size(33.dp),
                    painter = painterResource(
                        R.drawable.lion_facebook


                    ),
                    contentDescription = "",
                )

            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    homeScreen()
}