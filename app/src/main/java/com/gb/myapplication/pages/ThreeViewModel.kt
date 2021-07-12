package com.gb.myapplication.pages

import android.os.Build
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gb.myapplication.BuildConfig
import com.gb.myapplication.network.NasaApi
import com.gb.myapplication.network.NasaProperty
import com.gb.myapplication.util.convertDayToString
import kotlinx.coroutines.launch
import java.time.LocalDate

class ThreeViewModel : ViewModel() {
    private val _response = MutableLiveData<NasaProperty>()
    val response: LiveData<NasaProperty>
        get() = _response

    init {
        getNasaFotoPrevPrevDay()
    }

    private fun getNasaFotoPrevPrevDay() {
        viewModelScope.launch {
            try {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    _response.value = NasaApi.retrofitService.requestFotoDay(
                        convertDayToString(LocalDate.now().plusDays(-2)),
                        BuildConfig.NASA_API_KEY
                    )
                }
            } catch (e: Exception) {
                Log.e("Foto_NASA", e.message.toString())
            }
        }
    }
}