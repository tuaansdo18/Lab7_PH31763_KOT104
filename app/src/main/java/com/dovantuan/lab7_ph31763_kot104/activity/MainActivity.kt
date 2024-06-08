package com.dovantuan.lab7_ph31763_kot104.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.dovantuan.lab7_ph31763_kot104.BaiTap.ScreenNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            Bai1()
//            Bai2()
            ScreenNavigation()
        }
    }
}