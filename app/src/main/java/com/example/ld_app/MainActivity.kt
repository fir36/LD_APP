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
            .mobileKey("YOUR_MOBILE_KEY")
            .build()
        val user = LDUser.Builder("example-user-key")
            .build()
        LDClient.init(application, config, user, 5)
    }
}
