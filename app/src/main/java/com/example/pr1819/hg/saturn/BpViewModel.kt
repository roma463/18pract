package com.example.ivanov_pr1819_mobil.ui.bp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BpViewModel : ViewModel(){
    private val _text = MutableLiveData<String>().apply {
        value = " Каждый год противостояние происходит на две недели позже, чем в предыдущий. Но, кроме изменений в склонении, другие перемены незаметны. В течение периода обращения Сатурна вокруг Солнца меняется угол раскрытия колец, дважды они видны с рёбра и дважды максимально раскрыты до угла в 27 градусов"

    }
    val text: LiveData<String> = _text
}