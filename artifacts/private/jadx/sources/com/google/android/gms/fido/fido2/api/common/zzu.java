package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "DevicePublicKeyExtensionCreator")
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getDevicePublicKey", id = 1)
    private final boolean f107318a;

    @SafeParcelable.b
    public zzu(@NonNull @SafeParcelable.e(id = 1) boolean z10) {
        this.f107318a = ((Boolean) com.google.android.gms.common.internal.w.r(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        return (obj instanceof zzu) && this.f107318a == ((zzu) obj).f107318a;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(Boolean.valueOf(this.f107318a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.g(parcel, 1, this.f107318a);
        i6.b.b(parcel, iA);
    }
}
