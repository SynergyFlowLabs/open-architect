package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import io.intercom.android.sdk.utilities.NullSafety;
import u7.d;

/* JADX INFO: loaded from: classes13.dex */
@d
public abstract class Location implements Parcelable {
    public static final Parcelable.Creator<Location> CREATOR = new Parcelable.Creator<Location>() { // from class: io.intercom.android.sdk.models.Location.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Location createFromParcel(Parcel parcel) {
            return Location.create(parcel.readString(), parcel.readString(), parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Location[] newArray(int i10) {
            return new Location[i10];
        }
    };

    public static final class Builder {

        @p0
        String city_name;

        @p0
        String country_name;

        @p0
        Integer timezone_offset;

        public Location build() {
            return Location.create(NullSafety.valueOrEmpty(this.city_name), NullSafety.valueOrEmpty(this.country_name), this.timezone_offset);
        }
    }

    public static Location create(String str, String str2, @p0 Integer num) {
        return new AutoValue_Location(str, str2, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getCityName();

    public abstract String getCountryName();

    @p0
    public abstract Integer getTimezoneOffset();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getCityName());
        parcel.writeString(getCountryName());
        Integer timezoneOffset = getTimezoneOffset();
        if (timezoneOffset == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(timezoneOffset.intValue());
        }
    }
}
