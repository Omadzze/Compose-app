package com.example.signupcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.signupcompose.ui.theme.SignUpComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignUpComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    WindowCompat.setDecorFitsSystemWindows(window, false)
                    myLayout()
                }
            }
        }
    }
}

@Composable
fun myLayout() {
    SignUpComposeTheme {
        Scaffold(backgroundColor = MaterialTheme.colors.primary) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.image),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.padding(top = 20.dp))

                TextDesign()
                ButtonDesign()
            }
        }
    }
}

@Composable
fun TextDesign() {
    Text(
        text = stringResource(id = R.string.welcome),
        style = MaterialTheme.typography.h4,
        color = Color.Black
    )
    Text(
        text = stringResource(id = R.string.dummy_text),
        modifier = Modifier.padding(
            top = 12.dp, start = 80.dp, end = 80.dp
        ),
        style = MaterialTheme.typography.subtitle2,
        textAlign = TextAlign.Center,
        color = Color(0xFFAEAFBA)
    )
}

@Composable
fun myButton(
    onClick: () -> Unit = { },
    color: Color,
    content: @Composable () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        shape = RoundedCornerShape(25.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = color)
    ) {
        content()
    }
}

@Composable
fun ButtonDesign() {
    Column(
        Modifier
            .padding(top = 20.dp, start = 20.dp, end = 20.dp)
            .fillMaxWidth()
    ) {
        myButton(
            color = MaterialTheme.colors.secondary,
            onClick = { }
        ) {
            Text(text = "Login", style = MaterialTheme.typography.button, color = Color.White)
        }

        Spacer(modifier = Modifier.padding(top = 15.dp))

        myButton(
            color = Color.White,
            onClick = { }
        ) {
            Text(text = "Sign Up", color = Color.Black, style = MaterialTheme.typography.button)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SignUpComposeTheme {
        myLayout()
    }
}