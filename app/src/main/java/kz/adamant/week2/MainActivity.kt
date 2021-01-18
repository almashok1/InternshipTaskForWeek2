package kz.adamant.week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    companion object {
        val TAG = MainActivity::class.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myStack = MyStack().apply {
            push(1)
            Log.d("$TAG MyStack = ", "$this")
            push(3)
            Log.d("$TAG MyStack = ", "$this")
            push(-2)
            Log.d("$TAG MyStack = ", "$this")
            push(5)
            Log.d("$TAG MyStack = ", "$this")
            pop()
            Log.d("$TAG MyStack = ", "$this")
            val topValue = top()
            Log.d("$TAG MyStack TopValue: ", "$topValue")
            Log.d("$TAG MyStack = ", "$this")
        }

        val myQueue = MyQueue().apply {
            push(1)
            Log.d("$TAG MyQueue = ", "$this")
            push(3)
            Log.d("$TAG MyQueue = ", "$this")
            push(-2)
            Log.d("$TAG MyQueue = ", "$this")
            push(5)
            Log.d("$TAG MyQueue = ", "$this")
            pop()
            Log.d("$TAG MyQueue =", "$this")
            val peekedValue = peek()
            Log.d("$TAG MyQueue PeekedValue: ", "$peekedValue")
            Log.d("$TAG MyQueue = ", "$this")
        }

    }
}