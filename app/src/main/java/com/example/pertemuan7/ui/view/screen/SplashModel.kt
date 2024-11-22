package com.example.pertemuan7.ui.view.screen

import android.window.SplashScreenView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.pertemuan7.R

@Composable
fun SplashScreenView(
    onMulaiButton: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = colorResource(
                    id = R.color.primary
                )
            ),
        verticalArrangement = Arrangement.CenterVertically,
        horizontalAlignment = Alignment.CenterVertically
    )
    Spacer(modifier = Modifier.padding(16.dp))
    {
        Text
    }
    }
