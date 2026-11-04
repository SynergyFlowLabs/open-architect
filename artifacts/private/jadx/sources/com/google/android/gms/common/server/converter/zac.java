package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "StringToIntConverterEntryCreator")
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f106834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    final String f106835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    final int f106836c;

    @SafeParcelable.b
    zac(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) int i11) {
        this.f106834a = i10;
        this.f106835b = str;
        this.f106836c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f106834a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.Y(parcel, 2, this.f106835b, false);
        i6.b.F(parcel, 3, this.f106836c);
        i6.b.b(parcel, iA);
    }

    zac(String str, int i10) {
        this.f106834a = 1;
        this.f106835b = str;
        this.f106836c = i10;
    }
}
