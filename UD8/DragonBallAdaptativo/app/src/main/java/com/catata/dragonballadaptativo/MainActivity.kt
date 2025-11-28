package com.catata.dragonballadaptativo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.catata.dragonballadaptativo.navigation.Navigation
import com.catata.dragonballadaptativo.ui.theme.DragonBallAdaptativoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DragonBallAdaptativoTheme {
                Navigation()
            }
        }
    }
}
