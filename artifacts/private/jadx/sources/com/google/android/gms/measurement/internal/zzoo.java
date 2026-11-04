package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "UploadBatchesCriteriaCreator")
public final class zzoo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoo> CREATOR = new zd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 1)
    public final List f110872a;

    @SafeParcelable.b
    zzoo(@SafeParcelable.e(id = 1) List list) {
        this.f110872a = list;
    }

    public static zzoo O1(cb... cbVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(cbVarArr[0].a()));
        return new zzoo(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f110872a;
        int iA = i6.b.a(parcel);
        i6.b.H(parcel, 1, list, false);
        i6.b.b(parcel, iA);
    }
}
