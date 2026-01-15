package com.catata.splashscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.catata.splashscreen.navigation.Navigation
import com.catata.splashscreen.ui.theme.SplashScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //In newer versions we don't need install SplashScreen

        /*val splashScreen = installSplashScreen()
        splashScreen.setOnExitAnimationListener { splashScreenView ->
            splashScreenView.remove()
            // Se vuelve a asignar el tema ya que al eliminar la Splash Screen se elimina el tema
            setTheme(R.style.Theme_SplashScreen)
            // Volver a crear la actividad para aplicar el nuevo tema
            recreate()
        }
        splashScreen.setKeepOnScreenCondition { false }*/
        enableEdgeToEdge()
        setContent {
            SplashScreenTheme {
                Navigation()
            }
        }
    }
}