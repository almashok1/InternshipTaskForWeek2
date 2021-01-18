package kz.adamant.week2

import java.util.*

class MyQueue() {

    /** Initialize your data structure here. */
    private var stackMain: Stack<Int> = Stack()
    private var stackTemp: Stack<Int> = Stack()

    /** Push element x to the back of queue. */
    fun push(x: Int) {
        stackMain.push(x)
    }

    /** Removes the element from in front of queue and returns that element. */
    fun pop(): Int {
        if (stackMain.isEmpty()) throw Exception("Cannot pop of empty size")

        while (stackMain.size != 1) {
            stackTemp.push(stackMain.pop())
        }

        val result = stackMain.pop()

        // Swap
        while (stackTemp.isNotEmpty()) {
            stackMain.add(stackTemp.pop())
        }

        return result
    }

    /** Get the front element. */
    fun peek(): Int {
        if (stackMain.isEmpty()) throw Exception("Empty size")

        var lastResult: Int? = null
        while (stackMain.size != 0) {
            lastResult = stackMain.pop()
            stackTemp.push(lastResult)
        }

        // Swap
        while (stackTemp.isNotEmpty()) {
            stackMain.add(stackTemp.pop())
        }

        return lastResult!!
    }

    /** Returns whether the queue is empty. */
    fun empty(): Boolean {
        return stackMain.empty()
    }

    override fun toString(): String = stackMain.toString()

}
