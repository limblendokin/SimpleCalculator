package com.example.limbl.simplecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var inputHandler: InputHandler
    private var calculator:Calculator = Calculator()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        inputHandler = InputHandler(textView)
        val button0 = findViewById<Button>(R.id.button0)
        button0.setOnClickListener{
            inputHandler.addDigit('0')
        }
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            inputHandler.addDigit('1')
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            inputHandler.addDigit('2')
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            inputHandler.addDigit('3')
        }
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener{
            inputHandler.addDigit('4')
        }
        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener{
            inputHandler.addDigit('5')
        }
        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener{
            inputHandler.addDigit('6')
        }
        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener{
            inputHandler.addDigit('7')
        }
        val button8 = findViewById<Button>(R.id.button8)
        button8.setOnClickListener{
            inputHandler.addDigit('8')
        }
        val button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener{
            inputHandler.addDigit('9')
        }
        val buttonCancel = findViewById<Button>(R.id.buttonCancel)
        buttonCancel.setOnClickListener{
            inputHandler.clear()
        }
        val buttonDot = findViewById<Button>(R.id.buttonDot)
        buttonDot.setOnClickListener{
            inputHandler.addDot()
        }
        val buttonPlus = findViewById<Button>(R.id.buttonPlus)
        buttonPlus.setOnClickListener{
            var value = inputHandler.getDoubleValue()
            calculator.setAcc(value, calculator::addition)
        }
        val buttonMinus = findViewById<Button>(R.id.buttonMinus)
        buttonMinus.setOnClickListener{
            var value = inputHandler.getDoubleValue()
            calculator.setAcc(value, calculator::substraction)
        }
        val buttonEqual = findViewById<Button>(R.id.buttonEqual)
        buttonEqual.setOnClickListener{
            var value = inputHandler.getDoubleValue()
            inputHandler.updateTextView(calculator.invokeFunc(value))
        }
    }
}
