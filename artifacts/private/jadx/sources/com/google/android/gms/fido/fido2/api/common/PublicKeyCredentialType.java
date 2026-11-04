package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public enum PublicKeyCredentialType implements Parcelable {
    PUBLIC_KEY("public-key");


    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialType> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.u
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return PublicKeyCredentialType.b(parcel.readString());
            } catch (PublicKeyCredentialType.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new PublicKeyCredentialType[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f107232a = "public-key";

    public static class a extends Exception {
        public a(@NonNull String str) {
            super(str);
        }
    }

    PublicKeyCredentialType(String str) {
    }

    @NonNull
    public static PublicKeyCredentialType b(@NonNull String str) throws a {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            if (str.equals(publicKeyCredentialType.f107232a)) {
                return publicKeyCredentialType;
            }
        }
        throw new a(String.format("PublicKeyCredentialType %s not supported", str));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f107232a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f107232a);
    }
}
