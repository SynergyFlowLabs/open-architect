package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ConnectionInfoCreator")
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new c2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 1)
    Bundle f106694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    Feature[] f106695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = com.facebook.appevents.p.f99189d0, id = 3)
    int f106696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(id = 4)
    @androidx.annotation.p0
    ConnectionTelemetryConfiguration f106697d;

    public zzk() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.k(parcel, 1, this.f106694a, false);
        int i11 = 6 ^ 2;
        i6.b.c0(parcel, 2, this.f106695b, i10, false);
        i6.b.F(parcel, 3, this.f106696c);
        i6.b.S(parcel, 4, this.f106697d, i10, false);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    zzk(@SafeParcelable.e(id = 1) Bundle bundle, @SafeParcelable.e(id = 2) Feature[] featureArr, @SafeParcelable.e(id = 3) int i10, @SafeParcelable.e(id = 4) @androidx.annotation.p0 ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f106694a = bundle;
        this.f106695b = featureArr;
        this.f106696c = i10;
        this.f106697d = connectionTelemetryConfiguration;
    }
}
