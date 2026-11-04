package com.google.android.gms.internal.location;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class x3 extends w3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final w3 f108216e = new x3(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f108217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f108218d;

    x3(Object[] objArr, int i10) {
        this.f108217c = objArr;
        this.f108218d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        q3.c(i10, this.f108218d, FirebaseAnalytics.d.f120644b0);
        Object obj = this.f108217c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.location.t3
    final Object[] i() {
        return this.f108217c;
    }

    @Override // com.google.android.gms.internal.location.t3
    final int k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.location.t3
    final int l() {
        return this.f108218d;
    }

    @Override // com.google.android.gms.internal.location.t3
    final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.location.w3, com.google.android.gms.internal.location.t3
    final int p(Object[] objArr, int i10) {
        System.arraycopy(this.f108217c, 0, objArr, 0, this.f108218d);
        return this.f108218d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f108218d;
    }
}
