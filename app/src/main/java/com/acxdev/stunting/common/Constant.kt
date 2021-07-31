package com.acxdev.stunting.common

import com.acxdev.stunting.R
import com.acxdev.stunting.model.Menu
import com.acxdev.stunting.model.Video

object Constant {
    const val BASE_URL = "https://stunting-5596f-default-rtdb.firebaseio.com/"
    const val DATA = "data"
    const val LOGGED = "logged"
    const val USER = "User"
    const val PREFERENCE = "prefs"
    const val USERNAME = "username"
    const val ROLE = "role"
    const val GENDER = "gender"

    fun menu(): MutableList<Menu> {
        val list = mutableListOf<Menu>()
        list.add(Menu("Video\nEdukasi Gizi", R.drawable.ic_10))
        list.add(Menu("Resep\nMakanan", R.drawable.ic_11))
        list.add(Menu("Video\nPengolahan\nPangan", R.drawable.ic_12))
        list.add(Menu("Pengukuran\nStatus Gizi", R.drawable.ic_13))
        return list
    }

    fun videoList(): MutableList<Video> {
        val list = mutableListOf<Video>()
        list.add(Video("Apa itu Stunting","https://youtu.be/Wh9f5Dlqixg"))
        list.add(Video("Pencegahan Stunting","https://youtu.be/LXwUvY4QQ4U"))
        list.add(Video("Gejala dan dampak Stunting","https://youtu.be/TtNpeLL6jgc"))
        list.add(Video("Gizi pra-kehamilan","https://youtu.be/EyHq0Pn9RTg"))
        list.add(Video("Asupan gizi balita","https://youtu.be/7-f749KvyVk"))
        list.add(Video("Gizi ibu hamil","https://youtu.be/RwF2bwH6SII"))
        list.add(Video("Suplemen ibu hamil","https://youtu.be/PHGB7CGBtN0"))
        list.add(Video("Aktivitas ibu hamil","https://youtu.be/5W2ZgMxpJa8"))
        return list
    }

    fun pengolahanPanganList(): MutableList<Video> {
        val list = mutableListOf<Video>()
        list.add(Video("Cara memilih dan mengolah ayam","https://youtu.be/3Q1GYKaemGk"))
        list.add(Video("Cara memilih dan mengolalh cumi","https://youtu.be/pRwxQvQoqpE"))
        list.add(Video("Cara memilih dan mengolah daging","https://youtu.be/DMCNo4b059A"))
        list.add(Video("Cara memilih dan mengolah ikan","https://youtu.be/YtDOhw3JbdI"))
        list.add(Video("Cara memilih dan mengolah telur","https://youtu.be/N7x9VK0cmdw"))
        list.add(Video("Cara memilih dan mengolah udang","https://youtu.be/3SbCb0-EUGc"))
        list.add(Video("Cara mengolah kacang-kacangan","https://youtu.be/AIvetsmQsBs"))
        list.add(Video("Cara mengolah sayuran","https://youtu.be/C0cAAqvsNSc"))
        list.add(Video("Penyimpanan Makanan","https://youtu.be/08_JkddKDnc"))
        list.add(Video("Cara mencuci beras yang benar","https://youtu.be/EGojdxBO1GY"))
        list.add(Video("Kesalahan dalam baking","https://youtu.be/rGrilymyC68"))
        list.add(Video("Kesalahan dalam mengolah pasta","https://youtu.be/qg_bOqMt2RM"))
        list.add(Video("Makan mi instan pakai nasi","https://youtu.be/hEtcEETINMY"))
        list.add(Video("Jangan makan ini berlebihan","https://youtu.be/2Pqf7kVPVoQ"))
        list.add(Video("Nasi merah vs nasi putih","https://youtu.be/NBIRH9scSwE"))
        list.add(Video("Seputar Telur","https://youtu.be/u-qDd2p4t3k"))
        return list
    }

    fun mpasi6to8month(): MutableList<String>{
        val list = mutableListOf<String>()
        list.add("Bubur Kentang Hati Ayam")
        list.add("Bubur Gurih Merah")
        list.add("Bubur Labu Ayam")
        list.add("Bubur Telur Tempe Kembang Kol")
        list.add("Bubur Daging Sapi")
        list.add("Bubur Jagung Ikan")
        list.add("Bubur Kacang Hijau")
        return list
    }

    fun mpasi9to11month(): MutableList<String>{
        val list = mutableListOf<String>()
        list.add("Tim Ayam Gurih")
        list.add("Bola-bola Kentang Daging Sayur dan Pepaya")
        list.add("Nasi Tim Tomat, Fuyunghai Mini dan Puding Cokelat")
        list.add("Nasi Tim Sayur Pepes Hati Ayam")
        list.add("Nasi Tim Udang")
        list.add("Nasi Tim Kuning Semur Hati Ayam")
        list.add("Nasi Tim Ayam Lodeh")
        return list
    }

    fun mpasi12to13month(): MutableList<String>{
        val list = mutableListOf<String>()
        list.add("Nasi Bakar Teri + Biskuit + Susu")
        list.add("Schotel Singkong + Risoles + Semangka + Susu")
        list.add("Macaroni Schotel Kukus")
        list.add("Roti Susu Kubus")
        list.add("Roti Pisang Telur")
        list.add("Puding Alpukat")
        return list
    }
}