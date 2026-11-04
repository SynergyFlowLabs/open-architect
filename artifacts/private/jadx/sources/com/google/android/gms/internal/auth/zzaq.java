package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "DeviceMetaDataRequestCreator")
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f107909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    public final String f107910b;

    @SafeParcelable.b
    zzaq(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str) {
        this.f107909a = 1;
        this.f107910b = (String) com.google.android.gms.common.internal.w.r(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f107909a);
        i6.b.Y(parcel, 2, this.f107910b, false);
        i6.b.b(parcel, iA);
    }

    public zzaq(String str) {
        this(1, str);
    }
}
