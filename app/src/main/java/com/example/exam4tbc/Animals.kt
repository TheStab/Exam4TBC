package com.example.exam4tbc

import android.os.Parcel
import android.os.Parcelable

data class Animals(val image:Int, ) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Animals> {
        override fun createFromParcel(parcel: Parcel): Animals {
            return Animals(parcel)
        }

        override fun newArray(size: Int): Array<Animals?> {
            return arrayOfNulls(size)
        }
    }
}
