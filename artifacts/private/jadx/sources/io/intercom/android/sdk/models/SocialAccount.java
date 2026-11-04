package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import io.intercom.android.sdk.utilities.NullSafety;
import u7.d;

/* JADX INFO: loaded from: classes13.dex */
@d
public abstract class SocialAccount implements Parcelable {
    public static final SocialAccount NULL = create("", "");
    public static final Parcelable.Creator<SocialAccount> CREATOR = new Parcelable.Creator<SocialAccount>() { // from class: io.intercom.android.sdk.models.SocialAccount.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SocialAccount createFromParcel(Parcel parcel) {
            return SocialAccount.create(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SocialAccount[] newArray(int i10) {
            return new SocialAccount[i10];
        }
    };

    public static final class Builder {

        @p0
        String profile_url;

        @p0
        String provider;

        public SocialAccount build() {
            return SocialAccount.create(NullSafety.valueOrEmpty(this.provider), NullSafety.valueOrEmpty(this.profile_url));
        }
    }

    public static SocialAccount create(String str, String str2) {
        return new AutoValue_SocialAccount(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getProfileUrl();

    public abstract String getProvider();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getProvider());
        parcel.writeString(getProfileUrl());
    }
}
