package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b(serializable = true)
@k
final class f0<E, T extends E> extends m<Iterable<T>> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f116536b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final m<E> f116537a;

    f0(m<E> elementEquivalence) {
        this.f116537a = (m) j0.E(elementEquivalence);
    }

    public boolean equals(@fj.a Object object) {
        if (object instanceof f0) {
            return this.f116537a.equals(((f0) object).f116537a);
        }
        return false;
    }

    public int hashCode() {
        return this.f116537a.hashCode() ^ 1185147655;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean a(Iterable<T> iterableA, Iterable<T> iterableB) {
        Iterator<T> it = iterableA.iterator();
        Iterator<T> it2 = iterableB.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.f116537a.d(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int b(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        int iF = 78721;
        while (it.hasNext()) {
            iF = (iF * 24943) + this.f116537a.f(it.next());
        }
        return iF;
    }

    public String toString() {
        return this.f116537a + ".pairwise()";
    }
}
