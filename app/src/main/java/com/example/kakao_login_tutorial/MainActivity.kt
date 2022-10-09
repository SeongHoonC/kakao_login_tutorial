package com.example.kakao_login_tutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kakao_login_tutorial.ui.theme.Kakao_login_tutorialTheme

class MainActivity : ComponentActivity() {

    private val kakaoAuthViewModel:KakaoAuthViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kakao_login_tutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    KakaoLoginView(kakaoAuthViewModel)
                }
            }
        }
    }
}
@Composable
fun KakaoLoginView(viewModel: KakaoAuthViewModel){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.spacedBy(20.dp)
        ){
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {}){
            viewModel.handleKakaoLogin()
            Text(text = "카카오 로그인하기")
        }

        Button(onClick = {}){
            Text(text = "카카오 로그아웃하기")
        }

        Text(text = "카카오 로그인 여부", textAlign = TextAlign.Center, fontSize = 20.sp)
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Kakao_login_tutorialTheme {
        Greeting("Android")
    }
}