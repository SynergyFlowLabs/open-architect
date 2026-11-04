package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class o extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final m f107983f = new o(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f107984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f107985e;

    static {
        int i10 = 3 | 0;
    }

    o(Object[] objArr, int i10) {
        this.f107984d = objArr;
        this.f107985e = i10;
    }

    @Override // com.google.android.gms.internal.common.m, com.google.android.gms.internal.common.h
    final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f107984d, 0, objArr, 0, this.f107985e);
        return this.f107985e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        l0.a(i10, this.f107985e, FirebaseAnalytics.d.f120644b0);
        Object obj = this.f107984d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.common.h
    final int i() {
        return this.f107985e;
    }

    @Override // com.google.android.gms.internal.common.h
    final int k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.h
    final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.h
    final Object[] p() {
        return this.f107984d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f107985e;
    }
}
