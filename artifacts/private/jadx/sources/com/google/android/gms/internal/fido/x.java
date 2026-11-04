package com.google.android.gms.internal.fido;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes4.dex */
final class x extends u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final u f108068f = new x(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f108069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f108070e;

    x(Object[] objArr, int i10) {
        this.f108069d = objArr;
        this.f108070e = i10;
    }

    @Override // com.google.android.gms.internal.fido.u, com.google.android.gms.internal.fido.r
    final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f108069d, 0, objArr, 0, this.f108070e);
        return this.f108070e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        n.a(i10, this.f108070e, FirebaseAnalytics.d.f120644b0);
        Object obj = this.f108069d[i10];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.fido.r
    final int i() {
        return this.f108070e;
    }

    @Override // com.google.android.gms.internal.fido.r
    final int k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.r
    final Object[] m() {
        return this.f108069d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f108070e;
    }
}
