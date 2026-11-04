package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "FieldMapPairCreator")
@a0
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f106878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    final String f106879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    final FastJsonResponse.Field f106880c;

    @SafeParcelable.b
    zam(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) FastJsonResponse.Field field) {
        this.f106878a = i10;
        this.f106879b = str;
        this.f106880c = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f106878a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.Y(parcel, 2, this.f106879b, false);
        i6.b.S(parcel, 3, this.f106880c, i10, false);
        i6.b.b(parcel, iA);
    }

    zam(String str, FastJsonResponse.Field field) {
        this.f106878a = 1;
        this.f106879b = str;
        this.f106880c = field;
    }
}
