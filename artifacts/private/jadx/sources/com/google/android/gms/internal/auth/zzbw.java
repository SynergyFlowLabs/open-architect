package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ClearTokenRequestCreator")
@com.google.android.gms.common.internal.a0
public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbw> CREATOR = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f107922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    String f107923b;

    public zzbw() {
        this.f107922a = 1;
    }

    public final zzbw O1(String str) {
        this.f107923b = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f107922a);
        i6.b.Y(parcel, 2, this.f107923b, false);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    zzbw(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str) {
        this.f107922a = i10;
        this.f107923b = str;
    }
}
