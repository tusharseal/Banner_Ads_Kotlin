package com.example.banneradskotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class MainActivity : AppCompatActivity() {

    private lateinit var adView: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adView = findViewById(R.id.adView)

        //Step 1
        MobileAds.initialize(this)

        //Step 2
        val adRequest = AdRequest.Builder().build()

        //Step 3
        adView.loadAd(adRequest)
    }
}