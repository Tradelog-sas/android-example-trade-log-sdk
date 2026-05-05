package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.tradelog.android_sdk.ui.xml.TradeLogXml

class XmlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_xml)

        TradeLogSampleSdk.initialize(applicationContext, "XML Demo")
        TradeLogXml.mountChat(
            activity = this,
            containerId = R.id.tradelog_container,
            onCloseRequested = {
                finish() },
            onBackButtonRequested = {
                finish() },
        )
    }

    override fun onDestroy() {
        if (isFinishing) {
            TradeLogXml.unmountChat(this)
            TradeLogSampleSdk.dispose()
        }
        super.onDestroy()
    }
}
