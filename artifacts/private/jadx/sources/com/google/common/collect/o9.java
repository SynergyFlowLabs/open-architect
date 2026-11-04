package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
class o9<E> extends t6<E> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final o9<Object> f117913j = new o9<>(y8.c());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final transient y8<E> f117914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient int f117915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient z6<E> f117916i;

    private final class b extends l7<E> {
        private b() {
        }

        @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object object) {
            return o9.this.contains(object);
        }

        @Override // com.google.common.collect.l7
        E get(int index) {
            return o9.this.f117914g.j(index);
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return o9.this.f117914g.D();
        }

        @Override // com.google.common.collect.l7, com.google.common.collect.z6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    @com.google.common.annotations.c
    private static class c implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f117918c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object[] f117919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int[] f117920b;

        c(q8<? extends Object> multiset) {
            int size = multiset.entrySet().size();
            this.f117919a = new Object[size];
            this.f117920b = new int[size];
            int i10 = 0;
            for (q8.a<? extends Object> aVar : multiset.entrySet()) {
                this.f117919a[i10] = aVar.X0();
                this.f117920b[i10] = aVar.getCount();
                i10++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            t6.b bVar = new t6.b(this.f117919a.length);
            int i10 = 0;
            while (true) {
                Object[] objArr = this.f117919a;
                if (i10 >= objArr.length) {
                    return bVar.e();
                }
                bVar.k(objArr[i10], this.f117920b[i10]);
                i10++;
            }
        }
    }

    o9(y8<E> contents) {
        this.f117914g = contents;
        long jL = 0;
        for (int i10 = 0; i10 < contents.D(); i10++) {
            jL += (long) contents.l(i10);
        }
        this.f117915h = com.google.common.primitives.l.A(jL);
    }

    @Override // com.google.common.collect.t6, com.google.common.collect.q8
    /* JADX INFO: renamed from: B */
    public z6<E> o() {
        z6<E> z6Var = this.f117916i;
        if (z6Var != null) {
            return z6Var;
        }
        b bVar = new b();
        this.f117916i = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.t6
    q8.a<E> D(int index) {
        return this.f117914g.h(index);
    }

    @Override // com.google.common.collect.q8
    public int P3(@fj.a Object element) {
        return this.f117914g.g(element);
    }

    @Override // com.google.common.collect.h6
    boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
    public int size() {
        return this.f117915h;
    }

    @Override // com.google.common.collect.t6, com.google.common.collect.h6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return new c(this);
    }
}
