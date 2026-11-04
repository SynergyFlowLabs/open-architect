package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class u2 extends y1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f109344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final u2 f109345i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f109346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f109347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f109348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f109349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f109350g;

    static {
        Object[] objArr = new Object[0];
        f109344h = objArr;
        f109345i = new u2(objArr, 0, objArr, 0, 0);
    }

    u2(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f109346c = objArr;
        this.f109347d = i10;
        this.f109348e = objArr2;
        this.f109349f = i11;
        this.f109350g = i12;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f109346c, 0, objArr, 0, this.f109350g);
        return this.f109350g;
    }

    @Override // com.google.android.gms.internal.play_billing.m1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@fj.a Object obj) {
        if (obj != null) {
            Object[] objArr = this.f109348e;
            if (objArr.length != 0) {
                int iA = j1.a(obj.hashCode());
                while (true) {
                    int i10 = iA & this.f109349f;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iA = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.y1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f109347d;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final int i() {
        return this.f109350g;
    }

    @Override // com.google.android.gms.internal.play_billing.y1, com.google.android.gms.internal.play_billing.m1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final int k() {
        return 0;
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

    @Override // com.google.android.gms.internal.play_billing.m1
    final Object[] p() {
        return this.f109346c;
    }

    @Override // com.google.android.gms.internal.play_billing.y1
    final r1 s() {
        return r1.t(this.f109346c, this.f109350g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f109350g;
    }

    @Override // com.google.android.gms.internal.play_billing.y1
    final boolean u() {
        return true;
    }
}
