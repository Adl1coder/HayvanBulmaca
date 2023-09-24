package com.adilegungor.hayvanbulmaca

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = this.getSharedPreferences(packageName,android.content.Context.MODE_PRIVATE)
        val highestScore: Int = sharedPreferences.getInt("score",0)
        scoreTextView.text = "En yüksek Skor: " + highestScore.toString()
        //new
        startButton.setOnClickListener {
            val intent = Intent(this@MainActivity, GameActivity::class.java)
            startActivity(intent)
        }
    }
}
