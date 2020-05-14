package com.example.poker

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class PokerCard(context: Context,attrs:AttributeSet):ConstraintLayout(context,attrs) {
//    呼叫建構值Context&屬性值AttributeSet，繼承ConstraintLayout
    init {
        View.inflate(context,R.layout.card,this)
    }
}