package com.example.swoosh

import android.content.DialogInterface.OnClickListener
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseAcitivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    getStartedBtn.setOnClickListener {
        val leagueIntent = Intent(this, League::class.java)
        startActivity(leagueIntent)

    }
    }
}