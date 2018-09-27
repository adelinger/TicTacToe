package com.delinger.antun.tictactoeapp
import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import android.widget.Button
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.twoplayer.*
import kotlinx.android.synthetic.main.twoplayer.view.*
import android.content.DialogInterface
import android.support.v7.app.AlertDialog


class twoPlayerGame : AppCompatActivity() {

    var result1 = 0
    var result2 = 0

    var X_turn = true
    var O_turn = false

    lateinit var firstPlayer  : String
    lateinit var secondPlayer : String
    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.twoplayer)

        var fieldOne   = findViewById<Button>(R.id.field1)
        var fieldTwo   = findViewById<Button>(R.id.field2)
        var fieldThree = findViewById<Button>(R.id.field3)
        var fieldFour  = findViewById<Button>(R.id.field4)
        var fieldFive  = findViewById<Button>(R.id.field5)
        var fieldSix   = findViewById<Button>(R.id.field6)
        var fieldSeven = findViewById<Button>(R.id.field7)
        var fieldEight = findViewById<Button>(R.id.field8)
        var fieldNine  = findViewById<Button>(R.id.field9)

        firstPlayer  = intent.getStringExtra("firstPlayer")
        secondPlayer = intent.getStringExtra("secondPlayer")

        playerIndicator.text = "Na potezu je: " + firstPlayer

        player1.text = firstPlayer  + ":" +" " + "0"
        player2.text = secondPlayer + ":" + " "+ "0"

        MobileAds.initialize(this, "ca-app-pub-5385963311823976/4451400341")

        mAdView = findViewById(R.id.adViewTwo)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        setToZero.setOnClickListener {

            AlertDialog.Builder(this)
                    .setTitle("Reset")
                    .setMessage("Jeste li sigurni da želite postaviti rezultat na 0?")
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setPositiveButton(android.R.string.yes, DialogInterface.OnClickListener
                    { dialog, whichButton ->
                        X_turn = true
                        O_turn = false
                        result1 = 0
                        result2 = 0

                        player1.text = firstPlayer  + ":" +" " + "0"
                        player2.text = secondPlayer + ":" + " "+ "0"

                        startNewRound()
                    })
                    .setNegativeButton(android.R.string.no, null).show()
        }

        fieldOne.setOnClickListener {
            if (X_turn) {
                fieldOne.text = "X"
                X_turn = false
                O_turn = true
                playerIndicator.text = "Na potezu je: " + secondPlayer
            } else {
                fieldOne.text = "O"
                X_turn = true
                O_turn = false
                playerIndicator.text = "Na potezu je: " + firstPlayer
            }
            fieldOne.isEnabled = false
            checkIfMatchIsDone()
        }
        fieldTwo.setOnClickListener {
            if (X_turn) {
                fieldTwo.text = "X"
                X_turn = false
                O_turn = true
                playerIndicator.text = "Na potezu je: " + secondPlayer
            } else {
                fieldTwo.text = "O"
                X_turn = true
                O_turn = false
                playerIndicator.text = "Na potezu je: " + firstPlayer
            }
            fieldTwo.isEnabled = false
            checkIfMatchIsDone()
        }
        fieldThree.setOnClickListener {
            if (X_turn) {
                fieldThree.text = "X"
                X_turn = false
                O_turn = true
                playerIndicator.text = "Na potezu je: " + secondPlayer
            } else {
                fieldThree.text = "O"
                X_turn = true
                O_turn = false
                playerIndicator.text = "Na potezu je: " + firstPlayer
            }
            fieldThree.isEnabled = false
            checkIfMatchIsDone()
        }
        fieldFour.setOnClickListener {
            if (X_turn) {
                fieldFour.text = "X"
                X_turn = false
                O_turn = true
                playerIndicator.text = "Na potezu je: " + secondPlayer
            } else {
                fieldFour.text = "O"
                X_turn = true
                O_turn = false
                playerIndicator.text = "Na potezu je: " + firstPlayer
            }
            fieldFour.isEnabled = false
            checkIfMatchIsDone()
        }
        fieldFive.setOnClickListener {
            if (X_turn) {
                fieldFive.text = "X"
                X_turn = false
                O_turn = true
                playerIndicator.text = "Na potezu je: " + secondPlayer
            } else {
                fieldFive.text = "O"
                X_turn = true
                O_turn = false
                playerIndicator.text = "Na potezu je: " + firstPlayer
            }
            fieldFive.isEnabled = false
            checkIfMatchIsDone()
        }
        fieldSix.setOnClickListener {
            if (X_turn) {
                fieldSix.text = "X"
                X_turn = false
                O_turn = true
                playerIndicator.text = "Na potezu je: " + secondPlayer
            } else {
                fieldSix.text = "O"
                X_turn = true
                O_turn = false
                playerIndicator.text = "Na potezu je: " + firstPlayer
            }
            fieldSix.isEnabled = false
            checkIfMatchIsDone()
        }
        fieldSeven.setOnClickListener {
            if (X_turn) {
                fieldSeven.text = "X"
                X_turn = false
                O_turn = true
                playerIndicator.text = "Na potezu je: " + secondPlayer
            } else {
                fieldSeven.text = "O"
                X_turn = true
                O_turn = false
                playerIndicator.text = "Na potezu je: " + firstPlayer
            }
            fieldSeven.isEnabled = false
            checkIfMatchIsDone()
        }
        fieldEight.setOnClickListener {
            if (X_turn) {
                fieldEight.text = "X"
                X_turn = false
                O_turn = true
                playerIndicator.text = "Na potezu je: " + secondPlayer
            } else {
                fieldEight.text = "O"
                X_turn = true
                O_turn = false
                playerIndicator.text = "Na potezu je: " + firstPlayer
            }
            fieldEight.isEnabled = false
            checkIfMatchIsDone()
        }
        fieldNine.setOnClickListener {
            if (X_turn) {
                fieldNine.text = "X"
                X_turn = false
                O_turn = true
                playerIndicator.text = "Na potezu je: " + secondPlayer
            } else {
                fieldNine.text = "O"
                X_turn = true
                O_turn = false
                playerIndicator.text = "Na potezu je: " + firstPlayer
            }
            fieldNine.isEnabled = false
            checkIfMatchIsDone()
        }
        resetButton.setOnClickListener {
            startNewRound()
        }
    }

    fun checkIfMatchIsDone() {

        if (field1.text == field2.text && field2.text == field3.text && !field1.isEnabled) {
            showWinnerMessage(field1.text.toString())
            changeTileColor(field1, field2, field3)
            addResult(field1)
            disableAllFields()
            return
        }
        if (field4.text == field5.text && field5.text == field6.text && !field4.isEnabled) {
            showWinnerMessage(field4.text.toString())
            changeTileColor(field4, field5, field6)
            addResult(field4)
            disableAllFields()
            return
        }
        if (field7.text == field8.text && field8.text == field9.text && !field7.isEnabled) {
            showWinnerMessage(field7.text.toString())
            changeTileColor(field7, field8, field9)
            addResult(field7)
            disableAllFields()
            return
        }
        if (field1.text == field4.text && field4.text == field7.text && !field1.isEnabled)
        {
            showWinnerMessage(field1.text.toString())
            changeTileColor(field1, field4, field7)
            addResult(field1)
            disableAllFields()
            return
        }
        if (field3.text == field6.text && field6.text == field9.text && !field6.isEnabled)
        {
            showWinnerMessage(field3.text.toString())
            changeTileColor(field3, field6, field9)
            addResult(field3)
            disableAllFields()
        }

        if (field1.text == field5.text && field5.text == field9.text && !field1.isEnabled) {
            showWinnerMessage(field1.text.toString())
            changeTileColor(field1, field5, field9)
            addResult(field1)
            disableAllFields()
            return
        }
        if (field3.text == field5.text && field5.text == field7.text && !field3.isEnabled) {
            showWinnerMessage(field3.text.toString())
            changeTileColor(field3, field5, field7)
            addResult(field3)
            disableAllFields()
            return
        }
        if (field2.text == field5.text && field5.text == field8.text && !field2.isEnabled)
        {
            showWinnerMessage(field2.text.toString())
            changeTileColor(field2, field5, field8)
            addResult(field2)
            disableAllFields()
            return
        }
        if (!field1.isEnabled && !field2.isEnabled && !field3.isEnabled && !field4.isEnabled  &&
            !field5.isEnabled && !field6.isEnabled && !field7.isEnabled && !field8.isEnabled  && !field9.isEnabled)
        {
            showWinnerMessage("")
            return
        }
    }

    fun showWinnerMessage(winner: String) {
        if (winner == "X") {
           playerIndicator.text = "Pobjednik je: " + firstPlayer
        }
        if (winner == "O") {
            playerIndicator.text = "Pobjednik je: " + secondPlayer
        }
        if(winner == "") {
            playerIndicator.text = "Neriješno!"
        }
    }

    fun changeTileColor(tile1: Button, tile2: Button, tile3: Button) {
        tile1.setBackgroundColor(Color.rgb(155, 89, 182))
        tile2.setBackgroundColor(Color.rgb(155, 89, 182))
        tile3.setBackgroundColor(Color.rgb(155, 89, 182))
    }

    fun disableAllFields() {
        field1.isEnabled = false
        field2.isEnabled = false
        field3.isEnabled = false
        field3.isEnabled = false
        field4.isEnabled = false
        field5.isEnabled = false
        field6.isEnabled = false
        field7.isEnabled = false
        field8.isEnabled = false
        field9.isEnabled = false

        X_turn = true
        O_turn = false
    }

    fun startNewRound() {
        field1.isEnabled = true; field1.text = ""; field1.setBackgroundColor(Color.rgb(52,152,219))
        field2.isEnabled = true; field2.text = ""; field2.setBackgroundColor(Color.rgb(52,152,219))
        field3.isEnabled = true; field3.text = ""; field3.setBackgroundColor(Color.rgb(52,152,219))
        field4.isEnabled = true; field4.text = ""; field4.setBackgroundColor(Color.rgb(52,152,219))
        field5.isEnabled = true; field5.text = ""; field5.setBackgroundColor(Color.rgb(52,152,219))
        field6.isEnabled = true; field6.text = ""; field6.setBackgroundColor(Color.rgb(52,152,219))
        field7.isEnabled = true; field7.text = ""; field7.setBackgroundColor(Color.rgb(52,152,219))
        field8.isEnabled = true; field8.text = ""; field8.setBackgroundColor(Color.rgb(52,152,219))
        field9.isEnabled = true; field9.text = ""; field9.setBackgroundColor(Color.rgb(52,152,219))
        playerIndicator.text = "Na potezu je: " + firstPlayer
    }
    fun addResult (field:Button)
    {
        if(field.text  == "X") result1++
        if(field.text  == "O") result2++

        player1.text = firstPlayer  + " " + result1.toString()
        player2.text = secondPlayer + " " + result2.toString()
    }

}
