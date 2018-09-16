package com.delinger.antun.tictactoeapp

import android.app.Fragment
import android.app.FragmentManager
import android.app.FragmentTransaction
import android.content.Intent
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.title = "Iks oks";

        var onePlayersGame = findViewById<Button>(R.id.onePlayerButton);
        var twoPlayersGame = findViewById<Button>(R.id.twoPlayersButton);

       twoPlayersGame.setOnClickListener{
         //  val intent = Intent(this, twoPlayerGame::class.java)
          // startActivity(intent);
           val fragment = addPlayers()
           fragment.arguments = intent.extras
           val transaction = supportFragmentManager.beginTransaction()
           transaction.replace(R.id.nFragment, fragment)
           transaction.commit()

       }
    }
}

