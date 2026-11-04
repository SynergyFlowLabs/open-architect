package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class r2 extends y1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient u1 f109297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient r1 f109298d;

    r2(u1 u1Var, r1 r1Var) {
        this.f109297c = u1Var;
        this.f109298d = r1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final int c(Object[] objArr, int i10) {
        return this.f109298d.c(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.m1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@fj.a Object obj) {
        return this.f109297c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.y1, com.google.android.gms.internal.play_billing.m1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f109298d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.y1, com.google.android.gms.internal.play_billing.m1
    public final r1 l() {
        return this.f109298d;
    }

    @Override // com.google.android.gms.internal.play_billing.y1, com.google.android.gms.internal.play_billing.m1
    /* JADX INFO: renamed from: m */
    public final a3 iterator() {
        return this.f109298d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final boolean n() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f109297c.size();
    }
}
