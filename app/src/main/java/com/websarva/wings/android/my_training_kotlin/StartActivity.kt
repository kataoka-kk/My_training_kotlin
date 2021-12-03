package com.websarva.wings.android.my_training_kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.websarva.wings.android.my_training_kotlin.screens.LotteryActivity

class StartActivity : AppCompatActivity() {

    private lateinit var lotteryButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val clickListener = ClickListener()

        lotteryButton = findViewById(R.id.move_lottery_button)

        lotteryButton.setOnClickListener(clickListener)
    }

    private inner class ClickListener : View.OnClickListener {
        override fun onClick(v: View?) {
            when (v?.id) {
                R.id.move_lottery_button -> {
                    val intent = Intent(this@StartActivity, LotteryActivity::class.java)
                    startActivity(intent)
                }
            }
        }

    }
}