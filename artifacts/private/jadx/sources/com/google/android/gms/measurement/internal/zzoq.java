package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "UploadBatchesParcelCreator")
public final class zzoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoq> CREATOR = new ae();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 1)
    public final List f110873a;

    @SafeParcelable.b
    zzoq(@SafeParcelable.e(id = 1) List list) {
        this.f110873a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f110873a;
        int iA = i6.b.a(parcel);
        i6.b.d0(parcel, 1, list, false);
        i6.b.b(parcel, iA);
    }
}
