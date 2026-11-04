package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AuthenticationExtensionsPrfOutputsCreator")
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSupported", id = 1)
    private final boolean f107311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getOutputs", id = 2)
    @androidx.annotation.p0
    private final byte[] f107312b;

    @SafeParcelable.b
    public zzh(@NonNull @SafeParcelable.e(id = 1) boolean z10, @SafeParcelable.e(id = 2) @androidx.annotation.p0 byte[] bArr) {
        this.f107311a = z10;
        this.f107312b = bArr;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.f107311a == zzhVar.f107311a && Arrays.equals(this.f107312b, zzhVar.f107312b);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(Boolean.valueOf(this.f107311a), this.f107312b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.g(parcel, 1, this.f107311a);
        i6.b.m(parcel, 2, this.f107312b, false);
        i6.b.b(parcel, iA);
    }
}
