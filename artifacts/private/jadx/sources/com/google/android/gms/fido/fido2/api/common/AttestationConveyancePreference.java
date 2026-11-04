package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public enum AttestationConveyancePreference implements Parcelable {
    NONE("none"),
    INDIRECT(b.f107261p1),
    DIRECT(b.f107262q1);


    @NonNull
    public static final Parcelable.Creator<AttestationConveyancePreference> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.d0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return AttestationConveyancePreference.b(parcel.readString());
            } catch (AttestationConveyancePreference.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new AttestationConveyancePreference[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f107087a;

    public static class a extends Exception {
        public a(@NonNull String str) {
            super(String.format("Attestation conveyance preference %s not supported", str));
        }
    }

    AttestationConveyancePreference(String str) {
        this.f107087a = str;
    }

    @NonNull
    public static AttestationConveyancePreference b(@NonNull String str) throws a {
        for (AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (str.equals(attestationConveyancePreference.f107087a)) {
                return attestationConveyancePreference;
            }
        }
        throw new a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f107087a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f107087a);
    }
}
