package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "GetServiceRequestCreator")
@SafeParcelable.g({9})
@g6.a
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new e2();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final Scope[] f106469o = new Scope[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final Feature[] f106470s = new Feature[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f106471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    final int f106472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    final int f106473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(id = 4)
    String f106474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(id = 5)
    @androidx.annotation.p0
    IBinder f106475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", id = 6)
    Scope[] f106476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "new android.os.Bundle()", id = 7)
    Bundle f106477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(id = 8)
    @androidx.annotation.p0
    Account f106478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 10)
    Feature[] f106479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 11)
    Feature[] f106480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SafeParcelable.c(id = 12)
    final boolean f106481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = com.facebook.appevents.p.f99189d0, id = 13)
    final int f106482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SafeParcelable.c(getter = "isRequestingTelemetryConfiguration", id = 14)
    boolean f106483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAttributionTag", id = 15)
    @androidx.annotation.p0
    private final String f106484n;

    @SafeParcelable.b
    GetServiceRequest(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) int i12, @SafeParcelable.e(id = 4) String str, @SafeParcelable.e(id = 5) @androidx.annotation.p0 IBinder iBinder, @SafeParcelable.e(id = 6) Scope[] scopeArr, @SafeParcelable.e(id = 7) Bundle bundle, @SafeParcelable.e(id = 8) @androidx.annotation.p0 Account account, @SafeParcelable.e(id = 10) Feature[] featureArr, @SafeParcelable.e(id = 11) Feature[] featureArr2, @SafeParcelable.e(id = 12) boolean z10, @SafeParcelable.e(id = 13) int i13, @SafeParcelable.e(id = 14) boolean z11, @SafeParcelable.e(id = 15) @androidx.annotation.p0 String str2) {
        scopeArr = scopeArr == null ? f106469o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f106470s : featureArr;
        featureArr2 = featureArr2 == null ? f106470s : featureArr2;
        this.f106471a = i10;
        this.f106472b = i11;
        this.f106473c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f106474d = "com.google.android.gms";
        } else {
            this.f106474d = str;
        }
        if (i10 < 2) {
            this.f106478h = iBinder != null ? a.n(o.a.k(iBinder)) : null;
        } else {
            this.f106475e = iBinder;
            this.f106478h = account;
        }
        this.f106476f = scopeArr;
        this.f106477g = bundle;
        this.f106479i = featureArr;
        this.f106480j = featureArr2;
        this.f106481k = z10;
        this.f106482l = i13;
        this.f106483m = z11;
        this.f106484n = str2;
    }

    @androidx.annotation.p0
    @g6.a
    public String O1() {
        return this.f106484n;
    }

    @NonNull
    @g6.a
    public String T1() {
        return this.f106474d;
    }

    @NonNull
    @g6.a
    public Feature[] b2() {
        return this.f106480j;
    }

    @g6.a
    public int e2() {
        return this.f106473c;
    }

    @NonNull
    @g6.a
    public Bundle f2() {
        return this.f106477g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        e2.a(this, parcel, i10);
    }
}
