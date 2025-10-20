package com.example.ld_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.launchdarkly.sdk.android.LDConfig
import com.launchdarkly.sdk.android.LDClient
import com.launchdarkly.sdk.android.LDUser

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val config = LDConfig.Builder()
            .mobileKey("mob-3b66fef4-5401-4502-901f-1a85dbde9132")
            .build()
        val user = LDUser.Builder("app-test")
            .build()
        LDClient.init(application, config, user, 5)
    }
}
