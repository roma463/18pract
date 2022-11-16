package com.example.ivanov_pr1819_mobil.ui.case

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CaseViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = " Противостояния каждый год происходят на два дня позже, чем в предыдущий, при этом возрастает склонение, и условия видимости для северного полушария улучшаются (до 2060-х годов). Детали поверхности не видны, но при увеличении от 120х можно увидеть маленький диск планеты."
    }
    val text: LiveData<String> = _text
}