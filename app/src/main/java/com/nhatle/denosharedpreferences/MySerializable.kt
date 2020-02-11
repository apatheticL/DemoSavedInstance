package com.nhatle.denosharedpreferences

import android.preference.TwoStatePreference
import java.io.Serializable

class MySerializable(private val twoSerializable: String) :Serializable {


    override fun toString(): String {
        return twoSerializable
    }
}