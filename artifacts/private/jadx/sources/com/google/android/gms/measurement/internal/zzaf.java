package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "BatchUploadStatusParcelCreator")
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 1)
    public final long f110842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    public final int f110843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    public final long f110844c;

    @SafeParcelable.b
    zzaf(@SafeParcelable.e(id = 1) long j10, @SafeParcelable.e(id = 2) int i10, @SafeParcelable.e(id = 3) long j11) {
        this.f110842a = j10;
        this.f110843b = i10;
        this.f110844c = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f110842a;
        int iA = i6.b.a(parcel);
        i6.b.K(parcel, 1, j10);
        i6.b.F(parcel, 2, this.f110843b);
        i6.b.K(parcel, 3, this.f110844c);
        i6.b.b(parcel, iA);
    }
}
