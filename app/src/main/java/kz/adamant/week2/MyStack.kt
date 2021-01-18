package kz.adamant.week2

import java.util.*


class MyStack() {

    /** Initialize your data structure here. */
    private var queueMain: Queue<Int> = LinkedList()
    private var queueTemp: Queue<Int> = LinkedList()

    /** Push element x onto stack. */
    fun push(x: Int) {
        queueMain.add(x)
    }

    /** Removes the element on top of the stack and returns that element. */
    fun pop(): Int {
        if (queueMain.isEmpty()) throw Exception("Cannot pop of empty size")

        while (queueMain.size != 1) {
            queueTemp.add(queueMain.poll())
        }

        val result = queueMain.poll()

        // Swap queues
        val temp = queueMain
        queueMain = queueTemp
        queueTemp = temp

        return result!!
    }

    /** Get the top element. */
    fun top(): Int {
        if (queueMain.isEmpty()) throw IndexOutOfBoundsException("Empty size")

        var lastResult: Int? = null
        while (queueMain.size != 0) {
            lastResult = queueMain.poll()
            queueTemp.add(lastResult)
        }

        // Swap queues
        val temp = queueMain
        queueMain = queueTemp
        queueTemp = temp

        return lastResult!!
    }

    /** Returns whether the stack is empty. */
    fun empty(): Boolean {
        return queueMain.isEmpty()
    }

    override fun toString(): String = queueMain.toString()

}