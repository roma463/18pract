package com.example.ivanov_pr1819_mobil.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeVievModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "        Плане́та (др.-греч. πλανήτης, альтернати́вная фо́рма др.-греч. πλάνης — «странник») — небесное тело, вращающееся по орбите вокруг звезды или её остатков, достаточно массивное, чтобы стать округлым под действием собственной гравитации, но недостаточно массивное для начала термоядерной реакции, и сумевшее очистить окрестности своей орбиты от планетезималей."
    }
    val text: LiveData<String> = _text

    /*private  val _image = MutableLiveData<Image>().apply {
        value = R.id.

    }*/

    /*private var _wallpaper = MutableLiveData<Drawable>()
    val wallpaper: LiveData<Drawable>
        get() = _wallpaper

    fun updateWallPaper() {
        val file = appCtx.getWallpaperFile()
        if(file.exists()) {
            _wallpaper.value = BitmapDrawable(R.drawable.campic, BitmapFactory.decodeFile(file.absolutePath))
        }
    }*/

}