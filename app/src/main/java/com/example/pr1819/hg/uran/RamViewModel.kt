package com.example.ivanov_pr1819_mobil.ui.ram

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RamViewModel: ViewModel()  {
    private val _text = MutableLiveData<String>().apply {
        value = "  Противостояния каждый год происходят на четыре-пять дней позже, чем в предыдущий, при этом возрастает склонение, и условия видимости для северного полушария улучшаются (до 2030-х годов). При апертуре в 75 мм и при увеличении более 80х будет заметен маленький тусклый диск. А при апертуре 300 мм станут заметны крайне малоконтрастные детали, но вероятность их наблюдения даже с таким инструментом довольно мала "
    }
    val text: LiveData<String> = _text
}