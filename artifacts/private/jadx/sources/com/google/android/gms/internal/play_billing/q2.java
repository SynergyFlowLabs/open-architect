package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class q2 extends y1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient u1 f109264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f109265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f109266e;

    q2(u1 u1Var, Object[] objArr, int i10, int i11) {
        this.f109264c = u1Var;
        this.f109265d = objArr;
        this.f109266e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final int c(Object[] objArr, int i10) {
        return l().c(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.m1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@fj.a Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f109264c.get(key))) {
                boolean z10 = true | true;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.y1, com.google.android.gms.internal.play_billing.m1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.y1, com.google.android.gms.internal.play_billing.m1
    /* JADX INFO: renamed from: m */
    public final a3 iterator() {
        return l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final boolean n() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.y1
    final r1 s() {
        return new p2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f109266e;
    }
}
