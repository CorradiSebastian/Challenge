package com.sebastiancorradi.challenge.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity
class Cat(
    @PrimaryKey(autoGenerate = true)
    val internalId: Int = 0,
    @SerializedName("_id")
    val id: String= "",
): Parcelable {}