package com.divazahra0070.asesmen1mobpro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.divazahra0070.asesmen1mobpro.navigation.SetupNavGraph
import com.divazahra0070.asesmen1mobpro.ui.theme.Asesmen1MobproTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Asesmen1MobproTheme {
                SetupNavGraph()
            }
        }
    }
}
