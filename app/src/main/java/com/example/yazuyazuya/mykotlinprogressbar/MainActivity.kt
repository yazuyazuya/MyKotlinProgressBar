package com.example.yazuyazuya.mykotlinprogressbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var progressBar = findViewById<ProgressBar>(R.id.progressBar)
        var button = findViewById<Button>(R.id.button)
        var text = findViewById<TextView>(R.id.textView)

        // 水平プログレスバーの最大値を設定します
        progressBar.max = 100

        var value = 0

        button.setOnClickListener {
            value += 10

            if (value > 100) {
                value = 0
                text.text = "ダウンロード中..."
            }

            // progress
            progressBar.progress = value

            // セカンダリ値
            if (value <= 20) {
                progressBar.secondaryProgress = 70
            } else if (value <= 30) {
                progressBar.secondaryProgress = 80
            } else if (value <= 40) {
                progressBar.secondaryProgress = 90
            } else if (value <= 100) {
                progressBar.secondaryProgress = 100
            }

            if (value == 100) {
                text.text = "ダウンロード完了！"
            }

        }

    }
}
