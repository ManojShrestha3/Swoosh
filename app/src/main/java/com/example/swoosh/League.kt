package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class League : BaseAcitivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league4)
    }
    fun leagueClicked(view: View){
        val skillAcitivity = Intent(this, SkillActivity::class.java)
        startActivity(skillAcitivity)

    }
}