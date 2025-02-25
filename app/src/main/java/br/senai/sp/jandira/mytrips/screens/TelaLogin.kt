package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R


@Composable
fun TelaLogin(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )

    ) {
        Card(
            modifier = Modifier
                .width(100.dp)
                .height(50.dp)
                .align(alignment = Alignment.TopEnd),
            shape = RoundedCornerShape(
                bottomStart = 10.dp

            ),
            colors = CardDefaults.cardColors(
                Color(color = 0xffA020F0)
            )
        ) {


        }
        Card(
            modifier = Modifier
                .width(100.dp)
                .height(50.dp)
                .align(alignment = Alignment.BottomStart),
            shape = RoundedCornerShape(
                topEnd = 10.dp

            ),
            colors = CardDefaults.cardColors(
                Color(color = 0xffA020F0)
            )
        ) {

        }
        Column(
            modifier = Modifier
                .padding(32.dp)
                .align(Alignment.Center),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Column(
                modifier = Modifier
                    .padding(bottom = 50.dp)
            ){
                Text(
                    text = stringResource(R.string.login),
                    fontSize = 40.sp,
                    color = Color(color = 0xffA020F0),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.pls_sign_to_continue),
                    fontSize = 16.sp,
                    color = Color.Gray

                )
            }
            Column {


                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "",
                            tint = Color(color = 0xffA020F0)
                        )
                    },
                    label = {
                        Text(text = stringResource(R.string.type_email))
                    }
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 8.dp
                        ),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "",
                            tint = Color(color = 0xffA020F0)
                        )
                    },
                    label = {
                        Text(text = stringResource(R.string.type_password))
                    }
                )
                Button(
                    onClick = {},
                    modifier = Modifier
                        .padding(bottom = 50.dp)
                        .align(alignment = Alignment.End),
                    colors = ButtonDefaults.buttonColors(
                        Color(color = 0xffA020F0)
                    ),


                ) {
                    Text(
                        text = stringResource(R.string.sign_in),
                        fontWeight = FontWeight.Bold

                    )
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = ""
                    )
                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ){
                    Text(
                        text = stringResource(R.string.sign_up),
                        fontSize = 13.sp,
                        color = Color.Gray

                    )
                    Text(
                        text = stringResource(R.string.sign),
                        fontSize = 13.sp,
                        color = Color(color = 0xffA020F0),
                        fontWeight = FontWeight.Bold
                    )
                }

            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun TelaLoginPreview() {
    TelaLogin()
}