package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AuthenticationExtensionsDevicePublicKeyOutputsCreator")
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSignature", id = 1)
    @androidx.annotation.p0
    private final byte[] f107309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAuthenticatorOutput", id = 2)
    @androidx.annotation.p0
    private final byte[] f107310b;

    @SafeParcelable.b
    public zzf(@SafeParcelable.e(id = 1) @androidx.annotation.p0 byte[] bArr, @SafeParcelable.e(id = 2) @androidx.annotation.p0 byte[] bArr2) {
        this.f107309a = bArr;
        this.f107310b = bArr2;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return Arrays.equals(this.f107309a, zzfVar.f107309a) && Arrays.equals(this.f107310b, zzfVar.f107310b);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107309a, this.f107310b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.m(parcel, 1, this.f107309a, false);
        i6.b.m(parcel, 2, this.f107310b, false);
        i6.b.b(parcel, iA);
    }
}
