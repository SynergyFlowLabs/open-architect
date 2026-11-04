package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "InitializationParamsCreator")
@SafeParcelable.g({4, 5, 6})
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new h2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 1)
    public final long f109030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    public final long f109031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    public final boolean f109032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(id = 7)
    @androidx.annotation.p0
    public final Bundle f109033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(id = 8)
    @androidx.annotation.p0
    public final String f109034e;

    @SafeParcelable.b
    public zzdd(@SafeParcelable.e(id = 1) long j10, @SafeParcelable.e(id = 2) long j11, @SafeParcelable.e(id = 3) boolean z10, @SafeParcelable.e(id = 7) @androidx.annotation.p0 Bundle bundle, @SafeParcelable.e(id = 8) @androidx.annotation.p0 String str) {
        this.f109030a = j10;
        this.f109031b = j11;
        this.f109032c = z10;
        this.f109033d = bundle;
        this.f109034e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f109030a;
        int iA = i6.b.a(parcel);
        i6.b.K(parcel, 1, j10);
        i6.b.K(parcel, 2, this.f109031b);
        i6.b.g(parcel, 3, this.f109032c);
        i6.b.k(parcel, 7, this.f109033d, false);
        i6.b.Y(parcel, 8, this.f109034e, false);
        i6.b.b(parcel, iA);
    }
}
