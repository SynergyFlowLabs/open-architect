package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "FieldMappingDictionaryEntryCreator")
@a0
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f106875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    final String f106876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    @p0
    final ArrayList f106877c;

    @SafeParcelable.b
    zal(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) ArrayList arrayList) {
        this.f106875a = i10;
        this.f106876b = str;
        this.f106877c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f106875a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        int i12 = 5 >> 0;
        i6.b.Y(parcel, 2, this.f106876b, false);
        i6.b.d0(parcel, 3, this.f106877c, false);
        i6.b.b(parcel, iA);
    }

    zal(String str, Map map) {
        ArrayList arrayList;
        this.f106875a = 1;
        this.f106876b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.f106877c = arrayList;
    }
}
