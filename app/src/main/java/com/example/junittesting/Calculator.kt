package com.example.junittesting

class Calculator<T : Int>() {

        fun add(number1: T, number2: T) : Number{
            return number1 + number2
        }

        fun subtract(number1: T, number2: T) : Number{
            return number1 - number2
        }


}