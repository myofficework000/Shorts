package task.code4galaxy.shorts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import task.code4galaxy.shorts.navigation.NavController
import task.code4galaxy.shorts.ui.theme.ShortsCloneTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShortsCloneTheme {
                val navController = rememberNavController()
                    NavController(navController)

//            ShortsUI()
//                AllShorts()
            }
        }
    }
}
