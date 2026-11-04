package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SignInRequestCreator")
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f110943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getResolveAccountRequest", id = 2)
    final zat f110944b;

    @SafeParcelable.b
    zai(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) zat zatVar) {
        this.f110943a = i10;
        this.f110944b = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f110943a);
        i6.b.S(parcel, 2, this.f110944b, i10, false);
        i6.b.b(parcel, iA);
    }
}
