package com.example.limbl.simplecalculator

import android.view.View
import android.widget.TextView

class InputHandler(val screenText: TextView){
    private val length : Int = 10
    private var text : String = ""
    private var isIntegral : Boolean = true
    fun addDigit(digit: Char){
        if(text.length < length)
            text += digit
        updateTextView()
    }
    fun clear(){
        text = ""
        isIntegral = true
        updateTextView()
    }
    fun updateTextView(){
        screenText.setText(text)
    }
    fun updateTextView(value:Double){
        screenText.setText(value.toString())
    }
    fun addDot(){
        if(isIntegral){
            text+='.'
            isIntegral = false
            updateTextView()
        }
    }
    fun getDoubleValue():Double{
        var output = text.toDouble()
        text = ""
        return output
    }
}