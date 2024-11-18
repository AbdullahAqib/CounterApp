package com.example.counterapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _counterRepository = CounterRepository()
    private val _count = mutableStateOf(_counterRepository.getCounter().count)
    val count: State<Int> = _count

    fun increment() {
        _counterRepository.increment()
        _count.value = _counterRepository.getCounter().count
    }

    fun decrement() {
        _counterRepository.decrement()
        _count.value = _counterRepository.getCounter().count
    }

}