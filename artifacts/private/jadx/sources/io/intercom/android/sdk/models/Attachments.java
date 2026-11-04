package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import io.intercom.android.sdk.utilities.NullSafety;
import u7.d;

/* JADX INFO: loaded from: classes13.dex */
@d
public abstract class Attachments implements Parcelable {
    public static final Parcelable.Creator<Attachments> CREATOR = new Parcelable.Creator<Attachments>() { // from class: io.intercom.android.sdk.models.Attachments.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Attachments createFromParcel(Parcel parcel) {
            return Attachments.create(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Attachments[] newArray(int i10) {
            return new Attachments[i10];
        }
    };

    public static final class Builder {

        @p0
        String content_type;

        @p0
        String human_file_size;

        @p0
        String name;

        @p0
        String url;

        public Attachments build() {
            return Attachments.create(NullSafety.valueOrEmpty(this.name), NullSafety.valueOrEmpty(this.url), NullSafety.valueOrEmpty(this.content_type), NullSafety.valueOrEmpty(this.human_file_size));
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }
    }

    static Attachments create(String str, String str2, String str3, String str4) {
        return new AutoValue_Attachments(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getContentType();

    public abstract String getHumanFileSize();

    public abstract String getName();

    public abstract String getUrl();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getName());
        parcel.writeString(getUrl());
        parcel.writeString(getContentType());
        parcel.writeString(getHumanFileSize());
    }
}
