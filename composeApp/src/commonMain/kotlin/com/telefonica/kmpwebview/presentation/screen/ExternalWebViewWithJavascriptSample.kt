package com.telefonica.kmpwebview.presentation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import com.multiplatform.webview.web.WebView
import com.multiplatform.webview.web.rememberWebViewState

class ExternalWebViewWithJavascriptSample : Screen {
    @Composable
    override fun Content() {
        val webViewState =
            rememberWebViewState("https://www.whatismybrowser.com/detect/is-javascript-enabled/")
        DisposableEffect(Unit) {
            webViewState.webSettings.apply {
                isJavaScriptEnabled = true
            }
            onDispose { }
        }
        Column(Modifier.fillMaxSize()) {
            val text = webViewState.let {
                "${it.pageTitle ?: ""} ${it.loadingState} ${it.lastLoadedUrl ?: ""}"
            }
            Text(text)
            WebView(
                state = webViewState,
                modifier = Modifier.fillMaxSize(),
            )
        }
    }
}
