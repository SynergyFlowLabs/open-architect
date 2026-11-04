package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class COSEAlgorithmIdentifier implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final com.google.android.gms.fido.fido2.api.common.a f107146a;

    public static class a extends Exception {
        public a(int i10) {
            super("Algorithm with COSE value " + i10 + " not supported");
        }
    }

    COSEAlgorithmIdentifier(@NonNull com.google.android.gms.fido.fido2.api.common.a aVar) {
        this.f107146a = (com.google.android.gms.fido.fido2.api.common.a) com.google.android.gms.common.internal.w.r(aVar);
    }

    @NonNull
    public static COSEAlgorithmIdentifier a(int i10) throws a {
        com.google.android.gms.fido.fido2.api.common.a aVar;
        if (i10 != f.LEGACY_RS1.k()) {
            for (f fVar : f.values()) {
                if (fVar.k() == i10) {
                    aVar = fVar;
                }
            }
            for (c cVar : c.values()) {
                if (cVar.k() == i10) {
                    aVar = cVar;
                }
            }
            throw new a(i10);
        }
        aVar = f.RS1;
        return new COSEAlgorithmIdentifier(aVar);
    }

    public int b() {
        return this.f107146a.k();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@NonNull Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.f107146a.k() == ((COSEAlgorithmIdentifier) obj).f107146a.k();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107146a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f107146a.k());
    }
}
