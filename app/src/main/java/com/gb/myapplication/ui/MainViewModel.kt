package com.gb.myapplication.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gb.myapplication.BuildConfig
import com.gb.myapplication.network.NasaApi
import com.gb.myapplication.network.NasaProperty
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _response = MutableLiveData<NasaProperty>()
    val response: LiveData<NasaProperty>
        get() = _response

    init {
        getNasaProperties()
    }

    private fun getNasaProperties() {
        viewModelScope.launch {
            try {

                _response.value = NasaApi.retrofitService.requestFotoDay(
                    BuildConfig.NASA_API_KEY
                )
            } catch (e: Exception) {
                Log.e("Foto_NASA", e.message.toString())
            }
        }
    }
}
