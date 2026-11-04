package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "UploadBatchParcelCreator")
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new yd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 1)
    public final long f110865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    public byte[] f110866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    public final String f110867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(id = 4)
    public final Bundle f110868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(id = 5)
    public final int f110869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(id = 6)
    public final long f110870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(id = 7)
    public String f110871g;

    @SafeParcelable.b
    zzom(@SafeParcelable.e(id = 1) long j10, @SafeParcelable.e(id = 2) byte[] bArr, @SafeParcelable.e(id = 3) String str, @SafeParcelable.e(id = 4) Bundle bundle, @SafeParcelable.e(id = 5) int i10, @SafeParcelable.e(id = 6) long j11, @SafeParcelable.e(id = 7) String str2) {
        this.f110865a = j10;
        this.f110866b = bArr;
        this.f110867c = str;
        this.f110868d = bundle;
        this.f110869e = i10;
        this.f110870f = j11;
        this.f110871g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f110865a;
        int iA = i6.b.a(parcel);
        i6.b.K(parcel, 1, j10);
        i6.b.m(parcel, 2, this.f110866b, false);
        i6.b.Y(parcel, 3, this.f110867c, false);
        i6.b.k(parcel, 4, this.f110868d, false);
        i6.b.F(parcel, 5, this.f110869e);
        i6.b.K(parcel, 6, this.f110870f);
        int i11 = 6 >> 7;
        i6.b.Y(parcel, 7, this.f110871g, false);
        i6.b.b(parcel, iA);
    }
}
