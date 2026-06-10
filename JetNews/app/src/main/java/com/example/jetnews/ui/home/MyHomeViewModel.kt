package com.example.jetnews.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyHomeViewModel: ViewModel() {

    private val _name: MutableLiveData<String> = MutableLiveData("")
    val name: LiveData<String> = _name


    fun onNameChange(newName: String) {
        _name.value = newName
    }
}