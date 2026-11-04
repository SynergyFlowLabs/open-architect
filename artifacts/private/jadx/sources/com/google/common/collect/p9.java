package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
final class p9<E> extends z6<E> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object[] f117959n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final p9<Object> f117960o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.google.common.annotations.e
    final transient Object[] f117961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient int f117962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @com.google.common.annotations.e
    final transient Object[] f117963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final transient int f117964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final transient int f117965m;

    static {
        Object[] objArr = new Object[0];
        f117959n = objArr;
        f117960o = new p9<>(objArr, 0, objArr, 0, 0);
    }

    p9(Object[] elements, int hashCode, Object[] table, int mask, int size) {
        this.f117961i = elements;
        this.f117962j = hashCode;
        this.f117963k = table;
        this.f117964l = mask;
        this.f117965m = size;
    }

    @Override // com.google.common.collect.z6
    l6<E> D() {
        return l6.r(this.f117961i, this.f117965m);
    }

    @Override // com.google.common.collect.z6
    boolean F() {
        return true;
    }

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object target) {
        Object[] objArr = this.f117963k;
        if (target != null && objArr.length != 0) {
            int iD = c6.d(target);
            while (true) {
                int i10 = iD & this.f117964l;
                Object obj = objArr[i10];
                if (obj == null) {
                    return false;
                }
                if (obj.equals(target)) {
                    return true;
                }
                iD = i10 + 1;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.h6
    int d(Object[] dst, int offset) {
        System.arraycopy(this.f117961i, 0, dst, offset, this.f117965m);
        return offset + this.f117965m;
    }

    @Override // com.google.common.collect.z6, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f117962j;
    }

    @Override // com.google.common.collect.h6
    Object[] i() {
        return this.f117961i;
    }

    @Override // com.google.common.collect.h6
    int k() {
        return this.f117965m;
    }

    @Override // com.google.common.collect.h6
    int l() {
        return 0;
    }

    @Override // com.google.common.collect.h6
    boolean m() {
        return false;
    }

    @Override // com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public nb<E> iterator() {
        return c().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f117965m;
    }

    @Override // com.google.common.collect.z6, com.google.common.collect.h6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return super.writeReplace();
    }
}
