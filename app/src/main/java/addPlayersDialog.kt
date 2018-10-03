package com.delinger.antun.tictactoeapp

import android.app.DialogFragment
import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.add_players_dialog_layout.*
import kotlinx.android.synthetic.main.add_players_dialog_layout.view.*

public class addPlayersDialog : DialogFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var newView = inflater.inflate(R.layout.add_players_dialog_layout, container, false)

        var startButton = newView.findViewById<Button>(R.id.startGameButton)

        startButton.setOnClickListener {newView ->
            if (playerOneText.text.toString() == "" || playerTwoText.text.toString() == "") {
                Toast.makeText(newView.context, "Morate dodati ime oba igrača da biste nastavili!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            var intent = Intent(newView.context, twoPlayerGame::class.java)
            intent.putExtra("firstPlayer", playerOneText.text.toString())
            intent.putExtra("secondPlayer", playerTwoText.text.toString())
            startActivity(intent)
        }

        return newView
    }
}

public class OnGameStartedArgs constructor (firstPlayer: String, secondPlayer: String) {

    var FirstPlayer  : String = firstPlayer
    var SecondPlayer : String = secondPlayer
}