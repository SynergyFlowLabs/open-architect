package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "TriggerUriParcelCreator")
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new ud();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 1)
    public final String f110862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    public final long f110863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    public final int f110864c;

    @SafeParcelable.b
    zzoh(@SafeParcelable.e(id = 1) String str, @SafeParcelable.e(id = 2) long j10, @SafeParcelable.e(id = 3) int i10) {
        this.f110862a = str;
        this.f110863b = j10;
        this.f110864c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f110862a;
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 1, str, false);
        i6.b.K(parcel, 2, this.f110863b);
        i6.b.F(parcel, 3, this.f110864c);
        i6.b.b(parcel, iA);
    }
}
