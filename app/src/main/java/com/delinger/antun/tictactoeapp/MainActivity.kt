package com.delinger.antun.tictactoeapp
import com.google.android.gms.ads.MobileAds
import android.app.Fragment
import android.app.FragmentManager
import android.app.FragmentTransaction
import android.content.Intent
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.title = "Iks oks"

        MobileAds.initialize(this, "ca-app-pub-5385963311823976/4451400341")

        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        var twoPlayersGame = findViewById<Button>(R.id.twoPlayersButton)


       twoPlayersGame.setOnClickListener{

           var addPlayers = addPlayersDialog()

           addPlayers.show(fragmentManager.beginTransaction(), "")

       }
    }
}
