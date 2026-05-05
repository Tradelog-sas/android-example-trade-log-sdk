package com.example.myapplication

import android.content.Context
import android.util.Log
import com.tradelog.android_sdk.TradeLogEnvironment
import com.tradelog.android_sdk.TradeLogHostDataProvider
import com.tradelog.android_sdk.TradeLogHostDataResponse
import com.tradelog.android_sdk.TradeLogHostDataResponseStatus
import com.tradelog.android_sdk.TradeLogOfficialModule
import com.tradelog.android_sdk.TradeLogSdk
import com.tradelog.android_sdk.TradeLogSdkOptions

object TradeLogSampleSdk {
    fun initialize(context: Context, customerName: String) {
        TradeLogSdk.initialize(
            context = context,
            options = TradeLogSdkOptions(
                apiKey = "", // TODO: Add your API key here
                tenantId = "", // TODO: Add your tenant ID here
                environment = TradeLogEnvironment.development,
                enableLogs = true,
                officialModules = setOf(
                    TradeLogOfficialModule.logger,
                    TradeLogOfficialModule.userInfo,
                ),
                initialCustomerData = "demo@tradelog.com",
                initialCustomerName = customerName,
                onCloseRequested = {
                    Log.e("Example", "onCloseRequested")
                },
                onBackButtonRequested = {
                    Log.e("Example", "onBackButtonRequested")
                },
                hostDataProvider = TradeLogHostDataProvider { request, completion ->
                    Log.e("Example", request.toString())

                    completion(
                        TradeLogHostDataResponse(
                            status = TradeLogHostDataResponseStatus.success,
                            data =  mapOf("orderId" to "T00092")
                        )
                    )
                }
            ),
        )
    }

    fun dispose() {
        TradeLogSdk.dispose()
    }
}
