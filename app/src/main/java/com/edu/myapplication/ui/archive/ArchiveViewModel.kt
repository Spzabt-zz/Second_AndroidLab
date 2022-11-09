package com.edu.myapplication.ui.archive

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ArchiveViewModel : ViewModel() {
    private val _text = MutableLiveData<String>()
    val text: LiveData<String> = _text

    fun initText(string: String){
        _text.value = string
    }
}