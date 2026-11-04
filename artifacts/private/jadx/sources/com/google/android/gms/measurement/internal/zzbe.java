package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "EventParamsCreator")
@SafeParcelable.g({1})
public final class zzbe extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbe> CREATOR = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "z", id = 2)
    private final Bundle f110857a;

    @SafeParcelable.b
    zzbe(@SafeParcelable.e(id = 2) Bundle bundle) {
        this.f110857a = bundle;
    }

    final Object O1(String str) {
        return this.f110857a.get(str);
    }

    final Long T1(String str) {
        return Long.valueOf(this.f110857a.getLong(str));
    }

    final Double b2(String str) {
        return Double.valueOf(this.f110857a.getDouble("value"));
    }

    final String e2(String str) {
        return this.f110857a.getString(str);
    }

    public final int f2() {
        return this.f110857a.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new c0(this);
    }

    public final Bundle n2() {
        return new Bundle(this.f110857a);
    }

    final /* synthetic */ Bundle p2() {
        return this.f110857a;
    }

    public final String toString() {
        return this.f110857a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        int i11 = 7 << 0;
        i6.b.k(parcel, 2, n2(), false);
        i6.b.b(parcel, iA);
    }
}
