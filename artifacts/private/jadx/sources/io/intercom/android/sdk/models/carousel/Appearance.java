package io.intercom.android.sdk.models.carousel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import io.intercom.android.sdk.utilities.NullSafety;
import u7.d;

/* JADX INFO: loaded from: classes13.dex */
@d
public abstract class Appearance implements Parcelable {
    public static Appearance NULL = new Builder().build();
    public static final Parcelable.Creator<Appearance> CREATOR = new Parcelable.Creator<Appearance>() { // from class: io.intercom.android.sdk.models.carousel.Appearance.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Appearance createFromParcel(Parcel parcel) {
            return Appearance.create(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Appearance[] newArray(int i10) {
            return new Appearance[i10];
        }
    };

    public static final class Builder {

        @p0
        String alignment;

        @p0
        String text_color;

        @p0
        String type;

        public Appearance build() {
            return Appearance.create(NullSafety.valueOrEmpty(this.type), NullSafety.valueOrEmpty(this.alignment), NullSafety.valueOrEmpty(this.text_color));
        }

        public Builder withTextAlignment(String str) {
            this.alignment = str;
            return this;
        }

        public Builder withTextColor(String str) {
            this.text_color = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }
    }

    static Appearance create(String str, String str2, String str3) {
        return new AutoValue_Appearance(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getAlignment();

    public abstract String getTextColor();

    public abstract String getType();

    public Builder toBuilder() {
        return new Builder().withType(getType()).withTextAlignment(getAlignment()).withTextColor(getTextColor());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getType());
        parcel.writeString(getAlignment());
        parcel.writeString(getTextColor());
    }
}
