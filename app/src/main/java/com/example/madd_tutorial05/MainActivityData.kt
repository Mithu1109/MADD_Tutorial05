package com.example.madd_tutorial05

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityData : ViewModel() {
    val accelerometerData: MutableLiveData<String> = MutableLiveData()
    val proximityData: MutableLiveData<String> = MutableLiveData()
    val lightData: MutableLiveData<String> = MutableLiveData()

    fun updateAccelerometerData(data: String) {
        accelerometerData.value = data
    }

    fun updateProximityData(data: String) {
        proximityData.value = data
    }

    fun updateLightData(data: String) {
        lightData.value = data
    }
}