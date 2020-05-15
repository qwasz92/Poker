package com.example.poker

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.card.view.*
import kotlin.time.measureTimedValue

class PokerCard(context: Context,attrs:AttributeSet):ConstraintLayout(context,attrs) {
//    呼叫建構值Context&屬性值AttributeSet，繼承ConstraintLayout
    init {
        View.inflate(context,R.layout.card,this)
    }
    var value:Int? = null
//    牌值value是數字null
    set(value){
//    一個固定的值
    field = value
//    一個區域變數=value值
    val ponit = value?.run { value.rem(13)+1 }
//    定義ponit是一個value null.並執行value的餘數13(這裡指的是52張牌的每個數字)
    val cordType = value?.run { value/13 }
//    定義cordType是一個value null.並執行value/13(這裡指的是撲克牌的四個顏色)
    type.setImageResource(
        when(cordType){
            0-> R.drawable.clover
            1->R.drawable.brick
            2->R.drawable.heart
            else -> R.drawable.spades
        }
    )
    ponit?.run {
        point_left_top.text = this.toString()
        point_right_bottom.text = this.toString()
    }
}
}