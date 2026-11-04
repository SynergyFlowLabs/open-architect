package org.apache.commons.collections4.functors;

/* JADX INFO: loaded from: classes14.dex */
public class a1<E> implements org.apache.commons.collections4.h<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.l0<? super E> f335656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.apache.commons.collections4.h<? super E> f335657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f335658c;

    public a1(org.apache.commons.collections4.l0<? super E> l0Var, org.apache.commons.collections4.h<? super E> hVar, boolean z10) {
        this.f335656a = l0Var;
        this.f335657b = hVar;
        this.f335658c = z10;
    }

    public static <E> org.apache.commons.collections4.h<E> e(org.apache.commons.collections4.l0<? super E> l0Var, org.apache.commons.collections4.h<? super E> hVar, boolean z10) {
        if (l0Var == null) {
            throw new NullPointerException("Predicate must not be null");
        }
        if (hVar != null) {
            return new a1(l0Var, hVar, z10);
        }
        throw new NullPointerException("Closure must not be null");
    }

    @Override // org.apache.commons.collections4.h
    public void a(E e10) {
        if (this.f335658c) {
            this.f335657b.a(e10);
        }
        while (this.f335656a.a(e10)) {
            this.f335657b.a(e10);
        }
    }

    public org.apache.commons.collections4.h<? super E> b() {
        return this.f335657b;
    }

    public org.apache.commons.collections4.l0<? super E> c() {
        return this.f335656a;
    }

    public boolean d() {
        return this.f335658c;
    }
}
