package com.ssong_develop.samplesdkapplicationcontext

internal object SampleSDK {

    var sdkLibraryConcreteClass: SampleLibConcreteClass? = null

    fun getInstance() =
        sdkLibraryConcreteClass ?: throw NullPointerException("[SampleSDK] : sdkLibclass is null")
}