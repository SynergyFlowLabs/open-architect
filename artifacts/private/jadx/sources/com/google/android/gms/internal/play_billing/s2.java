package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class s2 extends r1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f109323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f109324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f109325f;

    s2(Object[] objArr, int i10, int i11) {
        this.f109323d = objArr;
        this.f109324e = i10;
        this.f109325f = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        g0.a(i10, this.f109325f, FirebaseAnalytics.d.f120644b0);
        Object obj = this.f109323d[i10 + i10 + this.f109324e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f109325f;
    }
}
