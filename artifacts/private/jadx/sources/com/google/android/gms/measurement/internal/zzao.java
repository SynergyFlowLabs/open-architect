package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ConsentParcelCreator")
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 1)
    public final Bundle f110856a;

    @SafeParcelable.b
    public zzao(@SafeParcelable.e(id = 1) Bundle bundle) {
        this.f110856a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f110856a;
        int iA = i6.b.a(parcel);
        i6.b.k(parcel, 1, bundle, false);
        i6.b.b(parcel, iA);
    }
}
