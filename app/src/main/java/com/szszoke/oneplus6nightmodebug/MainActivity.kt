package com.szszoke.oneplus6nightmodebug

import android.content.Intent
import android.content.pm.ActivityInfo.COLOR_MODE_DEFAULT
import android.content.pm.ActivityInfo.COLOR_MODE_WIDE_COLOR_GAMUT
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_wide_color_gamut_activity.setOnClickListener {
            Intent(this, WideColorGamutActivity::class.java).also { intent ->
                startActivity(intent)
            }
        }

        enable_wide_color_gamut_mode.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                window.colorMode = COLOR_MODE_WIDE_COLOR_GAMUT
            }
        }

        disable_wide_color_gamut_mode.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                window.colorMode = COLOR_MODE_DEFAULT
            }
        }
    }
}
