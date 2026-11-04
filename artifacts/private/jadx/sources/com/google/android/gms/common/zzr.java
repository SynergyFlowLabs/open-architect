package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ClientSourceStampRequestCreator")
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getDarkLaunch", id = 1)
    private final boolean f106996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRunSourceStampChecks", id = 2)
    private final boolean f106997b;

    @SafeParcelable.b
    zzr(@SafeParcelable.e(id = 1) boolean z10, @SafeParcelable.e(id = 2) boolean z11) {
        this.f106996a = z10;
        this.f106997b = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.g(parcel, 1, this.f106996a);
        i6.b.g(parcel, 2, this.f106997b);
        i6.b.b(parcel, iA);
    }
}
