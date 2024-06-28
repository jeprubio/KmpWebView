package com.telefonica.kmpwebview.presentation.screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

class Samples : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        LazyColumn(
            Modifier.fillMaxSize()
                .padding(16.dp)
        ) {
            item {
                Text("Samples", style = MaterialTheme.typography.h4)
            }
            item {
                Spacer(Modifier.height(8.dp))
            }
            item {
                Button(onClick = { navigator.push(ExternalWebViewSample()) }) {
                    Text("Webview external url")
                }
            }
            item {
                Spacer(Modifier.height(8.dp))
            }
            item {
                Button(onClick = { navigator.push(ExternalWebViewWithJavascriptSample()) }) {
                    Text("Webview external url + javascript")
                }
            }
            item {
                Spacer(Modifier.height(8.dp))
            }
            item {
                Button(onClick = { navigator.push(LocalHtmlSample()) }) {
                    Text("Webview local html")
                }
            }
        }
    }
}
