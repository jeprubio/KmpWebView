package com.telefonica.kmpwebview

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.telefonica.kmpwebview.presentation.screen.Samples
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Navigator(
            Samples()
        )
    }
}

