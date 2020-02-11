package com.nhatle.denosharedpreferences

import android.os.Parcel
import android.os.Parcelable

class MyParcelable( var onData: Int) : Parcelable {

    constructor(parcel: Parcel) : this(onData = parcel.readInt()) {
    }
    // ghi doi tuong nay trong parcel
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(onData)
    }
//Mô tả các loại đối tượng đặc biệt có trong  thu tu khoi tạo của Parcelable
    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MyParcelable> {
        override fun createFromParcel(parcel: Parcel): MyParcelable {
            return MyParcelable(parcel)
        }

        override fun newArray(size: Int): Array<MyParcelable?> {
            return arrayOfNulls(size)
        }
    }

    override fun toString(): String {
        return onData.toString()
    }
}