package com.ssong_develop.samplesdkapplicationcontext

import android.app.Application
import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import android.util.Log

class SampleSDKInitProvider : ContentProvider() {
    override fun onCreate(): Boolean {
        Log.d("ssong-develop", "SampleSDKInitProvider is initialized")
        val application = context as Application

        // We can initialize about applications

        // initialize sdk library class
        SampleSDK.sdkLibraryConcreteClass = SampleLibConcreteClass(application)

        return true
    }

    override fun query(
        p0: Uri,
        p1: Array<out String>?,
        p2: String?,
        p3: Array<out String>?,
        p4: String?
    ): Cursor = throw IllegalStateException("not support")

    override fun getType(p0: Uri): String? = throw IllegalStateException("not support")

    override fun insert(p0: Uri, p1: ContentValues?): Uri? =
        throw IllegalStateException("not support")

    override fun delete(p0: Uri, p1: String?, p2: Array<out String>?): Int =
        throw IllegalStateException("not support")

    override fun update(p0: Uri, p1: ContentValues?, p2: String?, p3: Array<out String>?): Int =
        throw IllegalStateException("not support")
}