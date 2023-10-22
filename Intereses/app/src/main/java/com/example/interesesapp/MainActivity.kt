package com.example.interesesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.interesesapp.ui.theme.InteresesAppTheme
import com.example.interesesapp.viewmodels.PrestamoViewModel
import com.example.interesesapp.views.HomeView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: PrestamoViewModel by viewModels()
        setContent {
            InteresesAppTheme (darkTheme = true){

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeView(viewModel)
                }
            }
        }
    }
}
