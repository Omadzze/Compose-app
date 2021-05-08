package com.example.signupcompose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.signupcompose.R

private val Sfpro = FontFamily(
    Font(R.font.sfprodisplay_regular),
    Font(R.font.sfpro_semibold, FontWeight.W500),
    Font(R.font.sfprodisplay_bold, FontWeight.W600)
)

val Typography = Typography(
    h4 = TextStyle(
        fontFamily = Sfpro,
        fontWeight = FontWeight.W600,
        fontSize = 28.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = Sfpro,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontFamily = Sfpro,
        fontWeight = FontWeight.W500,
        fontSize = 12.sp
    )
)