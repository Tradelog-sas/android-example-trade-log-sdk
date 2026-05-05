package com.example.myapplication

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.tradelog.android_sdk.ui.compose.TradeLogComposeContainer

class ComposeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        TradeLogSampleSdk.initialize(applicationContext, "Compose Demo")

        setContent {
            Surface(modifier = Modifier.fillMaxSize()) {
                TradeLogComposeContainer(
                    modifier = Modifier.fillMaxSize(),
                    onCloseRequested = { finish() },
                    onBackButtonRequested = { finish() },
                )
            }
        }
    }

    override fun onDestroy() {
        if (isFinishing) {
            TradeLogSampleSdk.dispose()
        }
        super.onDestroy()
    }
}
