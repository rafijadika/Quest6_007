package com.example.pertemuan7.ui.view.screen

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.pertemuan7.Modell.Mahasiswa
import com.example.pertemuan7.R

@Composable
fun MahasiswaFormView(
    modifier: Modifier,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
) {
    var nama by remember {
        var nama by remember {
            mutableStateOf("")
        }
        var nim by remember {
            mutableStateOf("")
        }
        var email by remember {
            mutableStateOf("")
        }

        val listData: MutableList<String> = mutableListOf(
            nama, nim, email

        Column (
                    Column (modifier = modifier
                        .fillMaxSize()
                        .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
        ){
                        Spacer(modifier = Modifier.padding(16.dp))
                        Row (
                            verticalAlignment = Alignment.CenterVertically,
                        ){
                            Image(
                                painter = painterResource(
                                    id = R.drawable.logoumy
                                ),
                                contentDescription = "",
                                modifier = Modifier.size(45.dp)
                            )
                            Spacer(modifier = Modifier.padding(start = 16.dp))
                            Column {
                                Text(
                                    text = "Universitas Muhammadiyah Yogyakarta",
                                    color = Color.LightGray,
                                    fontSize = 15.dp,
                                    fontWeight = FontWeight.Bold
                                    )

                                Spacer(modifier = Modifier.padding(top = 16.dp))
                                Box(
                                    modifier = Modifier
                                        .background(
                                            color = Color.White,
                                            shape = RoundedCornerShape(
                                                topStart = 15.dp,
                                                topEnd = 15.dp
                                            )
                                        )
                                        .fillMaxSize(),
                                ){
                                    Column(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .padding(),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Text(
                                            text = "isi sesuai data",
                                            fontWeight = FontWeight.Light
                                        )
                                        Spacer(modifier = Modifier.padding(8.dp))
                                        OutlinedTextField(
                                            modifier = Modifier.fillMaxSize(),
                                            value = nim,
                                            onValueChange = { nim = it},
                                            label = { Text(text = "NIM")},
                                            leadingicon = {
                                                icon()
                                            }


                                        )
                                    }
                                }

                            )
                            }
                        }
                    }
    }
}