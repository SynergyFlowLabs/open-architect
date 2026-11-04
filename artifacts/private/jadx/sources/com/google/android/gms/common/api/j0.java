package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class j0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j0 f106293b = new j0(new k0());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Parcelable.Creator f106294a;

    private j0(Parcelable.Creator creator) {
        this.f106294a = creator;
    }

    public static j0 a() {
        return f106293b;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return k0.a(parcel);
        }
        parcel.setDataPosition(iDataPosition - 4);
        return ApiMetadata.T1();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new ApiMetadata[i10];
    }
}
