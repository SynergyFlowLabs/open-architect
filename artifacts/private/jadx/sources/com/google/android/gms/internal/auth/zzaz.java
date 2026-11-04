package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SendDataRequestCreator")
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f107916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    public final String f107917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    public final byte[] f107918c;

    @SafeParcelable.b
    zzaz(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) byte[] bArr) {
        this.f107916a = 1;
        this.f107917b = (String) com.google.android.gms.common.internal.w.r(str);
        this.f107918c = (byte[]) com.google.android.gms.common.internal.w.r(bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f107916a);
        i6.b.Y(parcel, 2, this.f107917b, false);
        i6.b.m(parcel, 3, this.f107918c, false);
        i6.b.b(parcel, iA);
    }

    public zzaz(String str, byte[] bArr) {
        this(1, str, bArr);
    }
}
