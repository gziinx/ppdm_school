package br.senai.sp.jandira.lionschool.ui.theme.screens



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

fun listScreen () {
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
                Spacer(modifier = Modifier.width(120.dp))
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .background(Color(0xFFFFC700), shape = CircleShape),
                    contentAlignment = Alignment.Center,

                ) {
                    Text(
                        text = stringResource(
                            R.string.ds
                            ),
                        color = colorResource(R.color.bluedark),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

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
                    shape = RoundedCornerShape(5.dp),


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
                        .height(40.dp)
                        .width(322.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .height(36.dp)
                            .width(77.dp)
                            .padding(top = 5.dp)
                            .background(color = colorResource(R.color.bluedark), shape = RoundedCornerShape(24.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(
                                R.string.todos
                            ),
                            color = colorResource(
                                R.color.white
                            ),
                            fontWeight = FontWeight.Normal,
                            fontSize = 13.sp

                        )
                    }
                    Box(
                        modifier = Modifier
                            .height(36.dp)
                            .width(97.dp)
                            .padding(top = 5.dp, start = 5.dp )
                            .background(color = colorResource(R.color.yellow), shape = RoundedCornerShape(24.dp))
                                ,contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(
                                R.string.cursando
                            ),
                            color = colorResource(
                                R.color.white
                            ),
                            fontWeight = FontWeight.Normal,
                            fontSize = 13.sp

                        )
                    }
                    Box(
                        modifier = Modifier
                            .height(36.dp)
                            .width(100.dp)
                            .padding(top = 5.dp, start = 5.dp   )
                            .background(color = colorResource(R.color.yellow), shape = RoundedCornerShape(24.dp))
                             ,   contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(
                                R.string.finalizado
                            ),
                            color = colorResource(
                                R.color.white
                            ),
                            fontWeight = FontWeight.Normal,
                            fontSize = 13.sp

                        )
                    }

                }
                Row(
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .height(50.dp),
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
                            R.string.stu
                        ),
                        color = colorResource(
                            R.color.bluedark
                        ),
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 24.sp,
                    )
                }

                }



        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    listScreen()
}