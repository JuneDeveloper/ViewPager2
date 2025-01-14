package com.example.viewpager2

import java.io.Serializable

class Model(val name:String,val author:String,val imageView:Int):Serializable {

    companion object{
        val PagerList = mutableListOf(
            Model("Осень в городе","Владимир Черкасов",R.drawable.autum),
            Model("Балерина","Стефан Пен", R.drawable.balerina),
            Model("Цитрусовый фреш","Родригес Хосе", R.drawable.citrus),
            Model("Подруги","Виноградова Анна", R.drawable.girlfriends),
            Model("Кот на окне","Олег Пятин", R.drawable.kot_na_okne),
            Model("Павлин","Александр Садовой", R.drawable.pavlin),
            Model("Гранаты","Евгения Корнеева", R.drawable.grenade),
            Model("Буря на море","Иван Айвазовский", R.drawable.storm),
            Model("Мона Лиза","Леонардо да Винчи", R.drawable.mona_lisa),
            Model("Панда","Неизвестен", R.drawable.pand)
        )
    }
}