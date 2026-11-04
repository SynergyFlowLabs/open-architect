package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AuthAccountResultCreator")
public final class zaa extends AbstractSafeParcelable implements v {
    public static final Parcelable.Creator<zaa> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f110938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getConnectionResultCode", id = 2)
    private int f110939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRawAuthResolutionIntent", id = 3)
    @p0
    private Intent f110940c;

    public zaa() {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.v
    public final Status t() {
        return this.f110939b == 0 ? Status.f105886f : Status.f105890j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f110938a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.F(parcel, 2, this.f110939b);
        i6.b.S(parcel, 3, this.f110940c, i10, false);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    zaa(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) @p0 Intent intent) {
        this.f110938a = i10;
        this.f110939b = i11;
        this.f110940c = intent;
    }
}
