package com.google.android.gms.internal.fido;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class y extends v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f108071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final y f108072i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f108073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f108074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f108075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f108076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f108077g;

    static {
        Object[] objArr = new Object[0];
        f108071h = objArr;
        f108072i = new y(objArr, 0, objArr, 0, 0);
    }

    y(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f108073c = objArr;
        this.f108074d = i10;
        this.f108075e = objArr2;
        this.f108076f = i11;
        this.f108077g = i12;
    }

    @Override // com.google.android.gms.internal.fido.r
    final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f108073c, 0, objArr, 0, this.f108077g);
        return this.f108077g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@fj.a Object obj) {
        Object[] objArr = this.f108075e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iA = q.a(obj.hashCode());
        while (true) {
            int i10 = iA & this.f108076f;
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

    @Override // com.google.android.gms.internal.fido.v, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f108074d;
    }

    @Override // com.google.android.gms.internal.fido.r
    final int i() {
        return this.f108077g;
    }

    @Override // com.google.android.gms.internal.fido.v, com.google.android.gms.internal.fido.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return p().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.r
    final int k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.v, com.google.android.gms.internal.fido.r
    /* JADX INFO: renamed from: l */
    public final a0 iterator() {
        return p().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.r
    final Object[] m() {
        return this.f108073c;
    }

    @Override // com.google.android.gms.internal.fido.v
    final u r() {
        return u.p(this.f108073c, this.f108077g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f108077g;
    }

    @Override // com.google.android.gms.internal.fido.v
    final boolean t() {
        return true;
    }
}
