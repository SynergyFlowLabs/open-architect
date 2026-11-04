package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ConverterWrapperCreator")
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f106832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStringToIntConverter", id = 2)
    private final StringToIntConverter f106833b;

    @SafeParcelable.b
    zaa(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) StringToIntConverter stringToIntConverter) {
        this.f106832a = i10;
        this.f106833b = stringToIntConverter;
    }

    public static zaa O1(FastJsonResponse.a aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final FastJsonResponse.a T1() {
        StringToIntConverter stringToIntConverter = this.f106833b;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f106832a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.S(parcel, 2, this.f106833b, i10, false);
        i6.b.b(parcel, iA);
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f106832a = 1;
        this.f106833b = stringToIntConverter;
    }
}
