package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "StringToIntConverterCreator")
@g6.a
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.a<String, Integer> {

    @NonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f106829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f106830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f106831c;

    @g6.a
    public StringToIntConverter() {
        this.f106829a = 1;
        this.f106830b = new HashMap();
        this.f106831c = new SparseArray();
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.a
    @NonNull
    public final /* bridge */ /* synthetic */ Object H0(@NonNull Object obj) {
        String str = (String) this.f106831c.get(((Integer) obj).intValue());
        return (str == null && this.f106830b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @NonNull
    @g6.a
    public StringToIntConverter O1(@NonNull String str, int i10) {
        this.f106830b.put(str, Integer.valueOf(i10));
        this.f106831c.put(i10, str);
        return this;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.a
    public final int c() {
        return 7;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.a
    public final int l() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.a
    @p0
    public final /* bridge */ /* synthetic */ Object o1(@NonNull Object obj) {
        Integer num = (Integer) this.f106830b.get((String) obj);
        return num == null ? (Integer) this.f106830b.get("gms_unknown") : num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f106829a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f106830b.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.f106830b.get(str)).intValue()));
        }
        i6.b.d0(parcel, 2, arrayList, false);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    StringToIntConverter(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) ArrayList arrayList) {
        this.f106829a = i10;
        this.f106830b = new HashMap();
        this.f106831c = new SparseArray();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zac zacVar = (zac) arrayList.get(i11);
            O1(zacVar.f106835b, zacVar.f106836c);
        }
    }
}
