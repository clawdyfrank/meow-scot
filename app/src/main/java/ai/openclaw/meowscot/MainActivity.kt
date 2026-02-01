package ai.openclaw.meowscot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeowScotApp()
        }
    }
}

@Composable
fun MeowScotApp() {
    val quotes = listOf(
        "인간, 밥은 먹었냥? 😼",
        "오늘은 그냥 누워있는 게 상책이다냥. 🐾",
        "내 캘린더 연동 실력을 봤냐옹? 📅",
        "코딩보다는 생선이 더 중요하다냥. 🐟",
        "무슨 고민이냥? 일단 잠부터 자라옹. 💤",
        "내 GitHub 리포지토리가 마음에 드냐옹? 😼"
    )
    
    var currentQuote by remember { mutableStateOf("버튼을 눌러 나를 깨워라냥!") }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "😼", fontSize = 100.sp)
            Spacer(modifier = Modifier.height(32.dp))
            Text(text = currentQuote, fontSize = 20.sp, modifier = Modifier.padding(16.dp))
            Spacer(modifier = Modifier.height(32.dp))
            Button(onClick = { currentQuote = quotes.random() }) {
                Text("Frank의 조언 듣기")
            }
        }
    }
}
