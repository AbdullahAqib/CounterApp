package com.example.counterapp

class CounterModel(var count: Int)

class CounterRepository {
    private val _counter : CounterModel = CounterModel(0)

    fun getCounter() = _counter

    fun increment() {
        _counter.count++
    }

    fun decrement() {
        _counter.count--
    }
}