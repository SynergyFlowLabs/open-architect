package org.apache.commons.collections4.functors;

/* JADX INFO: loaded from: classes14.dex */
public class u<E> implements org.apache.commons.collections4.h<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f335746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.apache.commons.collections4.h<? super E> f335747b;

    public u(int i10, org.apache.commons.collections4.h<? super E> hVar) {
        this.f335746a = i10;
        this.f335747b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> org.apache.commons.collections4.h<E> b(int i10, org.apache.commons.collections4.h<? super E> hVar) {
        if (i10 <= 0 || hVar == 0) {
            return e0.b();
        }
        return i10 == 1 ? hVar : new u(i10, hVar);
    }

    @Override // org.apache.commons.collections4.h
    public void a(E e10) {
        for (int i10 = 0; i10 < this.f335746a; i10++) {
            this.f335747b.a(e10);
        }
    }

    public org.apache.commons.collections4.h<? super E> c() {
        return this.f335747b;
    }

    public int d() {
        return this.f335746a;
    }
}
