package com.nhatle.denosharedpreferences

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
private class MyParcelableOne (private val string: String) : Parcelable {
}