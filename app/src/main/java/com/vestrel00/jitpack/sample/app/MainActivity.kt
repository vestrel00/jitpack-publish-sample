package com.vestrel00.jitpack.sample.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.vestrel00.jitpack.sample.module1.module1String
import com.vestrel00.jitpack.sample.module2.module2String

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TextView(this).apply {
            text = """
                Hey there! Let's do some math!
                 $module1String
                 $module2String
            """.trimIndent()
        })
    }
}