package com.idk.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Buttons:
            //Numbers:
        val numbers = object {
            val one = findViewById<Button>(R.id.oneButton)
            val two = findViewById<Button>(R.id.twoButton)
            val three = findViewById<Button>(R.id.threeButton)
            val four = findViewById<Button>(R.id.fourButton)
            val five = findViewById<Button>(R.id.fiveButton)
            val six = findViewById<Button>(R.id.sixButton)
            val seven = findViewById<Button>(R.id.sevenButton)
            val eight = findViewById<Button>(R.id.eightButton)
            val nine = findViewById<Button>(R.id.nineButton)
            val zero = findViewById<Button>(R.id.zeroButton)
        }
            //Operators:
        val operators = object {
            val add = findViewById<Button>(R.id.addButton)
            val subtract = findViewById<Button>(R.id.subtractButton)
            val multiply = findViewById<Button>(R.id.multiplyButton)
            val divide = findViewById<Button>(R.id.divideButton)
        }
            //Misc
        val misc = object {
            val percent = findViewById<Button>(R.id.percentButton)
            val decimal = findViewById<Button>(R.id.decimalButton)
            val parentheses = findViewById<Button>(R.id.parenthesesButton)
            val negative = findViewById<Button>(R.id.negativeButton)
            val getResult = findViewById<Button>(R.id.getResult)
            val clear = findViewById<Button>(R.id.clearButton)
        }

        //Output
        val calcOutput = findViewById<TextView>(R.id.calcOutput)

        numbers.one.setOnClickListener {
            calcOutput.append("1")
        }

        numbers.two.setOnClickListener {
            calcOutput.append("2")
        }

        numbers.three.setOnClickListener {
            calcOutput.append("3")
        }

        numbers.four.setOnClickListener {
            calcOutput.append("4")
        }

        numbers.five.setOnClickListener {
            calcOutput.append("5")
        }

        numbers.six.setOnClickListener {
            calcOutput.append("6")
        }

        numbers.seven.setOnClickListener {
            calcOutput.append("7")
        }

        numbers.eight.setOnClickListener {
            calcOutput.append("8")
        }

        numbers.nine.setOnClickListener {
            calcOutput.append("9")
        }

        numbers.zero.setOnClickListener {
            calcOutput.append("0")
        }

        operators.add.setOnClickListener {
            calcOutput.append("+")
        }

        operators.subtract.setOnClickListener {
            calcOutput.append("-")
        }

        operators.multiply.setOnClickListener {
            calcOutput.append("x")
        }

        operators.divide.setOnClickListener {
            calcOutput.append("÷")
        }

        misc.clear.setOnClickListener {
            calcOutput.text = ""
        }

        misc.decimal.setOnClickListener {
            calcOutput.append(".")
        }

        misc.percent.setOnClickListener {
            calcOutput.append("%")
        }

        misc.negative.setOnClickListener {
            calcOutput.append("(-")
        }

        var isParentheses = false
        misc.parentheses.setOnClickListener {
            if (isParentheses) {
                calcOutput.append(")")
                isParentheses = false
            }
            else {
                calcOutput.append("(")
                isParentheses = true
            }
        }
    }
}