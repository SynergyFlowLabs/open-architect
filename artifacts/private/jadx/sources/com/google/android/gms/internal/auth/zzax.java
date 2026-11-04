package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "RetrieveDataRequestCreator")
public final class zzax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzax> CREATOR = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f107914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    public final String f107915b;

    @SafeParcelable.b
    zzax(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str) {
        this.f107914a = 1;
        this.f107915b = (String) com.google.android.gms.common.internal.w.r(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f107914a);
        i6.b.Y(parcel, 2, this.f107915b, false);
        i6.b.b(parcel, iA);
    }

    public zzax(String str) {
        this(1, str);
    }
}
