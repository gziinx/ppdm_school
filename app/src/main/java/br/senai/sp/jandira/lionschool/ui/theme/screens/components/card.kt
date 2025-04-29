
    package br.senai.sp.jandira.bmi.screens.components


    import android.media.Image
    import android.provider.ContactsContract.RawContacts.Data
    import androidx.compose.foundation.BorderStroke
    import androidx.compose.foundation.Image
    import androidx.compose.foundation.background
    import androidx.compose.foundation.border
    import androidx.compose.foundation.layout.Arrangement
    import androidx.compose.foundation.layout.Box
    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.layout.Row
    import androidx.compose.foundation.layout.Spacer
    import androidx.compose.foundation.layout.fillMaxHeight
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.fillMaxWidth
    import androidx.compose.foundation.layout.height
    import androidx.compose.foundation.layout.padding
    import androidx.compose.foundation.layout.size
    import androidx.compose.foundation.layout.width
    import androidx.compose.foundation.shape.CircleShape
    import androidx.compose.foundation.shape.RoundedCornerShape
    import androidx.compose.material3.Card
    import androidx.compose.material3.CardDefaults
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.graphics.painter.Painter
    import androidx.compose.ui.res.colorResource
    import androidx.compose.ui.res.painterResource
    import androidx.compose.ui.res.stringResource
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.tooling.preview.Preview
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import br.senai.sp.jandira.lionschool.R

    @Composable
    fun BmiLevel(
        Image: Painter?,
        nomeTexto: String = "",
        dataTexto: String = "",
        colorLetra: Color?
    ){


            Box(
                modifier = Modifier
                    .width(320.dp)
                    .height(78.dp)

                    .background(color = colorResource(
                        R.color.degrade1
                    ),
                        shape = RoundedCornerShape(8.dp),
                    )



                ){
                Spacer(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(12.dp)
                        .background(color = colorResource(R.color.yellow),
                            shape = RoundedCornerShape(topStart = 8.dp, bottomStart = 8.dp))

                )


                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxSize(),

                ){
                    Spacer(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(12.dp)
                            )
                    Image(
                        modifier = Modifier
                            .size(65.dp),
                        painter = painterResource(
                            R.drawable.logoimage,
                        ),
                        contentDescription = "",
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(bottom = 5.dp),
                            color = (
                                    Color.White
                                    ),
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 12.sp,
                            text = nomeTexto,
                        )
                        Row {
                            Image(
                                modifier = Modifier

                                    .size(12.dp),
                                painter = painterResource(
                                    R.drawable.sa


                                ),
                                contentDescription = "",
                            )
                            Text(
                                modifier = Modifier
                                ,
                                color = (
                                        Color.White
                                        ),
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 10.sp,
                                text = dataTexto,
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .fillMaxWidth(),
                                verticalAlignment = Alignment.Bottom,
                                horizontalArrangement = Arrangement.End

                            ) {
                                Image(
                                    modifier = Modifier
                                        .size(12.dp),
                                    painter = painterResource(
                                        R.drawable.sector


                                    ),
                                    contentDescription = "",
                                )
                                Text(

                                        modifier = Modifier
                                            .padding(start = 2.dp),
                                        color = colorLetra
                                                ,
                                        fontWeight = FontWeight.ExtraBold,
                                        fontSize = 10.sp,
                                        text = stringResource(
                                            R.string.frase3
                                        ),
                                )

                            }
                        }
                    }
                }

        }
    }

    @Preview
    @Composable
    private fun BmiLevelPreview(){
        BmiLevel(
        )
    }
