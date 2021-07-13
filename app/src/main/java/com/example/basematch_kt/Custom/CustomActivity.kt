package com.example.basematch_kt.Custom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.basematch_kt.TopActivity

open class CustomActivity : AppCompatActivity() {

    // ------------------------ //
    // 様々な関数を定義しておく場所 //
    // ------------------------ //

    // TopActivity へ戻る
    fun backToTop() {
        val intentTop = Intent(this, TopActivity::class.java)
        startActivity(intentTop)
    }
}