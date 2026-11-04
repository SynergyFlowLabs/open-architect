package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "CableAuthenticationDataCreator")
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getVersion", id = 1)
    private final long f107313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getClientEid", id = 2)
    private final byte[] f107314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getAuthenticatorEid", id = 3)
    private final byte[] f107315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getSessionPreKey", id = 4)
    private final byte[] f107316d;

    @SafeParcelable.b
    zzq(@SafeParcelable.e(id = 1) long j10, @NonNull @SafeParcelable.e(id = 2) byte[] bArr, @NonNull @SafeParcelable.e(id = 3) byte[] bArr2, @NonNull @SafeParcelable.e(id = 4) byte[] bArr3) {
        this.f107313a = j10;
        this.f107314b = (byte[]) com.google.android.gms.common.internal.w.r(bArr);
        this.f107315c = (byte[]) com.google.android.gms.common.internal.w.r(bArr2);
        this.f107316d = (byte[]) com.google.android.gms.common.internal.w.r(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.f107313a == zzqVar.f107313a && Arrays.equals(this.f107314b, zzqVar.f107314b) && Arrays.equals(this.f107315c, zzqVar.f107315c) && Arrays.equals(this.f107316d, zzqVar.f107316d);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(Long.valueOf(this.f107313a), this.f107314b, this.f107315c, this.f107316d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.K(parcel, 1, this.f107313a);
        i6.b.m(parcel, 2, this.f107314b, false);
        i6.b.m(parcel, 3, this.f107315c, false);
        i6.b.m(parcel, 4, this.f107316d, false);
        i6.b.b(parcel, iA);
    }
}
