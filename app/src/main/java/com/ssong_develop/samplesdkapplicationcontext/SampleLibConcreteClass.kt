package com.ssong_develop.samplesdkapplicationcontext

import android.app.Application
import android.util.Log

class SampleLibConcreteClass(
    private val application: Application
) {
    init {
        Log.d("ssong-develop","${application.applicationContext}")
    }
}