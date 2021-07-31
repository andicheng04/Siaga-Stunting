package com.acxdev.stunting.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acxdev.stunting.R
import com.acxdev.stunting.common.Constant
import com.acxdev.stunting.databinding.ActivityMenuBinding

class ActivityMenu : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra(Constant.DATA)

        binding.title.text = title

        binding.recipe.setImageResource(
            when (title) {
                Constant.mpasi6to8month()[0] -> R.drawable.ic_bubur_kentang_hati_ayam
                Constant.mpasi6to8month()[1] -> R.drawable.ic_bubur_gurih_merah
                Constant.mpasi6to8month()[2] -> R.drawable.ic_bubur_labu_ayam
                Constant.mpasi6to8month()[3] -> R.drawable.ic_bubur_telur_tempe_kembang_kol
                Constant.mpasi6to8month()[4] -> R.drawable.ic_bubur_daging_sapi
                Constant.mpasi6to8month()[5] -> R.drawable.ic_bubur_jagung_ikan
                Constant.mpasi6to8month()[6] -> R.drawable.ic_bubur_kacang_hijau

                Constant.mpasi9to11month()[0] -> R.drawable.ic_tim_ayam_gurih
                Constant.mpasi9to11month()[1] -> R.drawable.ic_bola2_kentang_daging_sayur_dan_pepaya
                Constant.mpasi9to11month()[2] -> R.drawable.ic_nasi_tim_tomat_fuyunghai_mini_dan_puding_cokelat
                Constant.mpasi9to11month()[3] -> R.drawable.ic_nasi_tim_sayur_pepes_hati_ayam
                Constant.mpasi9to11month()[4] -> R.drawable.ic_nasi_tim_udang
                Constant.mpasi9to11month()[5] -> R.drawable.ic_tim_kuning_semur_hati_ayam
                Constant.mpasi9to11month()[6] -> R.drawable.ic_tim_ayam_lodeh

                Constant.mpasi12to13month()[0] -> R.drawable.ic_nasi_bakar_teri_biskuit_susu
                Constant.mpasi12to13month()[1] -> R.drawable.ic_schotel_singkong_risoles_semangka_susu
                Constant.mpasi12to13month()[2] -> R.drawable.ic_macaroni_schotel_kukus
                Constant.mpasi12to13month()[3] -> R.drawable.ic_roti_susu_kubus
                Constant.mpasi12to13month()[4] -> R.drawable.ic_roti_pisang_telur
                else -> R.drawable.ic_puding_alpukat
            }
        )
    }
}