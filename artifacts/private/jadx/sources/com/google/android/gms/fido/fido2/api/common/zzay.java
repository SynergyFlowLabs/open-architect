package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.gms.common.internal.a0
public enum zzay implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<zzay> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.a0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return zzay.b(parcel.readString());
            } catch (b0 e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new zzay[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f107308a;

    zzay(String str) {
        this.f107308a = str;
    }

    public static zzay b(String str) throws b0 {
        for (zzay zzayVar : values()) {
            if (str.equals(zzayVar.f107308a)) {
                return zzayVar;
            }
        }
        throw new b0(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f107308a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f107308a);
    }
}
