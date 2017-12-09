package julius.barde.com.recipelist

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by JBluee on 12/8/2017.
 */
data class Recipe(var name:String, var description:String, var photo: Int,var ingredients: String ,var procedures:String) :Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(description)
        parcel.writeInt(photo)
        parcel.writeString(ingredients)
        parcel.writeString(procedures)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Recipe> {
        override fun createFromParcel(parcel: Parcel): Recipe {
            return Recipe(parcel)
        }

        override fun newArray(size: Int): Array<Recipe?> {
            return arrayOfNulls(size)
        }
    }
}