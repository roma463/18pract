package com.example.ivanov_pr1819_mobil.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "    Планету можно наблюдать до четырёх часов в тёмное время суток. Примерно в течение полугодия планета видна утром или вечером, но огромная яркость делает возможным наблюдение её практически в течение всего года. Рекомендуемая апертура — 75 мм. Сама поверхность планеты скрыта под плотной облачностью; основной интерес представляет сама атмосфера и перемены в ней. Отражающая способность атмосферы Венера так велика, что для безопасных наблюдений рекомендуется применять «нейтральный» фильтр. А при применении синего или фиолетового фильтра неоднородности в облачном слое лучше заметны"
    }
    val text: LiveData<String> = _text
}