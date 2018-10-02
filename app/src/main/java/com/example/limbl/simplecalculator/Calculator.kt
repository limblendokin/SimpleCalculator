package com.example.limbl.simplecalculator


class Calculator{
    private var acc : Double = 0.0
    private var prevOp:((Double)->Double)? = null

    fun addition(value:Double):Double{
        return acc+value
    }
    fun multiplication(value:Double):Double{
        return acc*value
    }
    fun division(value:Double):Double{
        return acc/value
    }
    fun substraction(value:Double):Double{
        return acc-value
    }
    fun setAcc(acc:Double, func:(Double)->Double){
        prevOp = func
        this.acc = acc
    }
    fun invokeFunc(value:Double):Double{
        prevOp?.let { return it.invoke(value) }
        return 0.0
    }
}