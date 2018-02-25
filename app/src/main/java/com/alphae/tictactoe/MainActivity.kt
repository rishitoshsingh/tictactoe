package com.alphae.tictactoe

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


var board = Array<Int>(9){0}
var player:Int = 1
var blocksOccupied:Int = 0

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        reset.setOnClickListener {
            reset()
        }
    }
    fun pressed(view:View){
        val button:TextView = view as TextView
        if (blocksOccupied == 9) return
        when(button.id){
            zero.id -> {
                if(board[0]==0){
                    blocksOccupied++
                    if(player == 1){
                        zero.text = "X"
                        zero.setBackgroundColor(getResources().getColor(R.color.playerX))
                        board[0] = 1
                        if(winnerCheck(player)) winnerBoard.text = "Player X Wins"
                        updateMessage()
                        player = 2
                    }else{
                        zero.text = "O"
                        zero.setBackgroundColor(getResources().getColor(R.color.playerO))
                        board[0] = 2
                        if(winnerCheck(player)) winnerBoard.text = "Player O Wins"
                        updateMessage()
                        player = 1
                    }
                }
            }
            one.id -> {
                if(board[1]==0){
                    blocksOccupied++
                    if(player == 1){
                        one.text = "X"
                        one.setBackgroundColor(getResources().getColor(R.color.playerX))
                        board[1] = 1
                        if(winnerCheck(player)) winnerBoard.text = "Player X Wins"
                        updateMessage()
                        player = 2
                    }else{
                        one.text = "O"
                        one.setBackgroundColor(getResources().getColor(R.color.playerO))
                        board[1] = 2
                        if(winnerCheck(player)) winnerBoard.text = "Player O Wins"
                        updateMessage()
                        player = 1
                    }
                }
            }
            two.id -> {
                if(board[2]==0){
                    blocksOccupied++
                    if(player == 1){
                        two.text = "X"
                        two.setBackgroundColor(getResources().getColor(R.color.playerX))
                        board[2] = 1
                        if(winnerCheck(player)) winnerBoard.text = "Player X Wins"
                        updateMessage()
                        player = 2
                    }else{
                        two.text = "O"
                        two.setBackgroundColor(getResources().getColor(R.color.playerO))
                        board[2] = 2
                        if(winnerCheck(player)) winnerBoard.text = "Player O Wins"
                        updateMessage()
                        player = 1
                    }
                }
            }
            three.id -> {
                if(board[3]==0){
                    blocksOccupied++
                    if(player == 1){
                        three.text = "X"
                        three.setBackgroundColor(getResources().getColor(R.color.playerX))
                        board[3] = 1
                        if(winnerCheck(player)) winnerBoard.text = "Player X Wins"
                        updateMessage()
                        player = 2
                    }else{
                        three.text = "O"
                        three.setBackgroundColor(getResources().getColor(R.color.playerO))
                        board[3] = 2
                        if(winnerCheck(player)) winnerBoard.text = "Player O Wins"
                        updateMessage()
                        player = 1
                    }
                }
            }
            four.id -> {
                if(board[4]==0){
                    blocksOccupied++
                    if(player == 1){
                        four.text = "X"
                        four.setBackgroundColor(getResources().getColor(R.color.playerX))
                        board[4] = 1
                        if(winnerCheck(player)) winnerBoard.text = "Player X Wins"
                        updateMessage()
                        player = 2
                    }else{
                        four.text = "O"
                        four.setBackgroundColor(getResources().getColor(R.color.playerO))
                        board[4] = 2
                        if(winnerCheck(player)) winnerBoard.text = "Player O Wins"
                        updateMessage()
                        player = 1
                    }
                }
            }
            five.id -> {
                if(board[5]==0){
                    blocksOccupied++
                    if(player == 1){
                        five.text = "X"
                        five.setBackgroundColor(getResources().getColor(R.color.playerX))
                        board[5] = 1
                        if(winnerCheck(player)) winnerBoard.text = "Player X Wins"
                        updateMessage()
                        player = 2
                    }else{
                        five.text = "O"
                        five.setBackgroundColor(getResources().getColor(R.color.playerO))
                        board[5] = 2
                        if(winnerCheck(player)) winnerBoard.text = "Player O Wins"
                        updateMessage()
                        player = 1
                    }
                }
            }
            six.id -> {
                if(board[6]==0){
                    blocksOccupied++
                    if(player == 1){
                        six.text = "X"
                        six.setBackgroundColor(getResources().getColor(R.color.playerX))
                        board[6] = 1
                        if(winnerCheck(player)) winnerBoard.text = "Player X Wins"
                        updateMessage()
                        player = 2
                    }else{
                        six.text = "O"
                        six.setBackgroundColor(getResources().getColor(R.color.playerO))
                        board[6] = 2
                        if(winnerCheck(player)) winnerBoard.text = "Player O Wins"
                        updateMessage()
                        player = 1
                    }
                }
            }
            seven.id -> {
                if(board[7]==0){
                    blocksOccupied++
                    if(player == 1){
                        seven.text = "X"
                        seven.setBackgroundColor(getResources().getColor(R.color.playerX))
                        board[7] = 1
                        if(winnerCheck(player)) winnerBoard.text = "Player X Wins"
                        updateMessage()
                        player = 2
                    }else{
                        seven.text = "O"
                        seven.setBackgroundColor(getResources().getColor(R.color.playerO))
                        board[7] = 2
                        if(winnerCheck(player)) winnerBoard.text = "Player O Wins"
                        updateMessage()
                        player = 1
                    }
                }
            }
            eight.id -> {
                if(board[8]==0){
                    blocksOccupied++
                    if(player == 1){
                        eight.text = "X"
                        eight.setBackgroundColor(getResources().getColor(R.color.playerX))
                        board[8] = 1
                        if(winnerCheck(player)) winnerBoard.text = "Player X Wins"
                        updateMessage()
                        player = 2
                    }else{
                        eight.text = "O"
                        eight.setBackgroundColor(getResources().getColor(R.color.playerO))
                        board[8] = 2
                        if(winnerCheck(player)) winnerBoard.text = "Player O Wins"
                        updateMessage()
                        player = 1
                    }
                }
            }
        } // end of while()
    }// end of fun pressed()


    fun updateMessage(){
        if(player == 1) winnerBoard.text = "Player O's turn" else winnerBoard.text = "Player X's turn"
        if(blocksOccupied==9) {
            reset.setBackgroundColor(getResources().getColor(R.color.playerO))
            reset.setTextColor(getResources().getColor(R.color.white))
        }
    }



    fun reset(){

        for(index in 0..board.size-1 ) board[index] = 0

        blocksOccupied=0
        winnerBoard.text = "Player X's Turn"
        reset.setBackgroundColor(getResources().getColor(R.color.white))
        reset.setTextColor(getResources().getColor(R.color.playerO))
        player = 1
        zero.text = ""
        zero.setBackgroundColor(getResources().getColor(R.color.white))
        one.text = ""
        one.setBackgroundColor(getResources().getColor(R.color.white))
        two.text = ""
        two.setBackgroundColor(getResources().getColor(R.color.white))
        three.text = ""
        three.setBackgroundColor(getResources().getColor(R.color.white))
        four.text = ""
        four.setBackgroundColor(getResources().getColor(R.color.white))
        five.text = ""
        five.setBackgroundColor(getResources().getColor(R.color.white))
        six.text = ""
        six.setBackgroundColor(getResources().getColor(R.color.white))
        seven.text = ""
        seven.setBackgroundColor(getResources().getColor(R.color.white))
        eight.text = ""
        eight.setBackgroundColor(getResources().getColor(R.color.white))
    }
}
fun winnerCheck(checkPlayer:Int): Boolean {
    if (board[0] == checkPlayer && board[1] == checkPlayer && board[2] == checkPlayer) {
        blocksOccupied = 9
        return true
    } else if (board[3] == checkPlayer && board[4] == checkPlayer && board[5] == checkPlayer) {
        blocksOccupied = 9
        return true
    } else if (board[6] == checkPlayer && board[7] == checkPlayer && board[8] == checkPlayer) {
        blocksOccupied = 9
        return true
    } else if (board[0] == checkPlayer && board[3] == checkPlayer && board[6] == checkPlayer) {
        blocksOccupied = 9
        return true
    } else if (board[1] == checkPlayer && board[4] == checkPlayer && board[7] == checkPlayer) {
        blocksOccupied = 9
        return true
    } else if (board[2] == checkPlayer && board[5] == checkPlayer && board[8] == checkPlayer) {
        blocksOccupied = 9
        return true
    } else if (board[0] == checkPlayer && board[4] == checkPlayer && board[8] == checkPlayer) {
        blocksOccupied = 9
        return true
    } else if (board[2] == checkPlayer && board[4] == checkPlayer && board[6] == checkPlayer) {
        blocksOccupied = 9
        return true
    } else return false
}
