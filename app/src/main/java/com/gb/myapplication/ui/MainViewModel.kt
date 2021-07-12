package com.gb.myapplication.ui

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

class MainViewModel : ViewModel() {

}
