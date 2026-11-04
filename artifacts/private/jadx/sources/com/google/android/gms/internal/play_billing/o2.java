package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class o2 extends r1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final r1 f109239f = new o2(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f109240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f109241e;

    o2(Object[] objArr, int i10) {
        this.f109240d = objArr;
        this.f109241e = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.r1, com.google.android.gms.internal.play_billing.m1
    final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f109240d, 0, objArr, 0, this.f109241e);
        return this.f109241e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        g0.a(i10, this.f109241e, FirebaseAnalytics.d.f120644b0);
        Object obj = this.f109240d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final int i() {
        return this.f109241e;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final int k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final Object[] p() {
        return this.f109240d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f109241e;
    }
}
