package com.khoazero123.ocr.billing

import android.app.Activity
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.khoazero123.ocr.billing.cache.AugmentedSkuDetails

class BillingViewModel(application: Application) : AndroidViewModel(application) {

    val inAppSkuDetailsListLiveData: LiveData<List<AugmentedSkuDetails>> = MutableLiveData(emptyList())

    val multiScanEnabled: LiveData<Boolean> = MutableLiveData(true)

    fun startBillingFlow(activity: Activity, sku: String) {
        throw NotImplementedError()
    }
}