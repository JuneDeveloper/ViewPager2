package com.example.viewpager2

import java.io.Serializable

class Picture(val name:String, val author:String, val imageView:Int):Serializable {

    companion object{
        val PagerList = mutableListOf(
            Picture("Осень в городе","Владимир Черкасов",R.drawable.autum),
            Picture("Балерина","Стефан Пен", R.drawable.balerina),
            Picture("Цитрусовый фреш","Родригес Хосе", R.drawable.citrus),
            Picture("Подруги","Виноградова Анна", R.drawable.girlfriends),
            Picture("Кот на окне","Олег Пятин", R.drawable.kot_na_okne),
            Picture("Павлин","Александр Садовой", R.drawable.pavlin),
            Picture("Гранаты","Евгения Корнеева", R.drawable.grenade),
            Picture("Буря на море","Иван Айвазовский", R.drawable.storm),
            Picture("Мона Лиза","Леонардо да Винчи", R.drawable.mona_lisa),
            Picture("Панда","Неизвестен", R.drawable.pand)
        )
    }
}