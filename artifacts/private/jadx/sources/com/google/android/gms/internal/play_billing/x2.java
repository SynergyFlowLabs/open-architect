package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class x2 extends y1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object f109427c;

    x2(Object obj) {
        obj.getClass();
        this.f109427c = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final int c(Object[] objArr, int i10) {
        objArr[0] = this.f109427c;
        return 1;
    }

    @Override // com.google.android.gms.internal.play_billing.m1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@fj.a Object obj) {
        return this.f109427c.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.y1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f109427c.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.y1, com.google.android.gms.internal.play_billing.m1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new c2(this.f109427c);
    }

    @Override // com.google.android.gms.internal.play_billing.y1, com.google.android.gms.internal.play_billing.m1
    public final r1 l() {
        return r1.w(this.f109427c);
    }

    @Override // com.google.android.gms.internal.play_billing.y1, com.google.android.gms.internal.play_billing.m1
    /* JADX INFO: renamed from: m */
    public final a3 iterator() {
        return new c2(this.f109427c);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final boolean n() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f109427c.toString() + "]";
    }
}
