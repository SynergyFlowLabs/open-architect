package org.apache.commons.collections4;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class i {
    private i() {
    }

    public static <E> h<E> a(w0<? super E, ?> w0Var) {
        return org.apache.commons.collections4.functors.w0.c(w0Var);
    }

    public static <E> h<E> b(Collection<? extends h<? super E>> collection) {
        return org.apache.commons.collections4.functors.f.b(collection);
    }

    public static <E> h<E> c(h<? super E>... hVarArr) {
        return org.apache.commons.collections4.functors.f.c(hVarArr);
    }

    public static <E> h<E> d(h<? super E> hVar, l0<? super E> l0Var) {
        return org.apache.commons.collections4.functors.a1.e(l0Var, hVar, true);
    }

    public static <E> h<E> e() {
        return org.apache.commons.collections4.functors.o.b();
    }

    public static <E> h<E> f(int i10, h<? super E> hVar) {
        return org.apache.commons.collections4.functors.u.b(i10, hVar);
    }

    public static <E> h<E> g(l0<? super E> l0Var, h<? super E> hVar) {
        return org.apache.commons.collections4.functors.x.e(l0Var, hVar);
    }

    public static <E> h<E> h(l0<? super E> l0Var, h<? super E> hVar, h<? super E> hVar2) {
        return org.apache.commons.collections4.functors.x.f(l0Var, hVar, hVar2);
    }

    public static <E> h<E> i(String str) {
        return a(org.apache.commons.collections4.functors.c0.b(str));
    }

    public static <E> h<E> j(String str, Class<?>[] clsArr, Object[] objArr) {
        return a(org.apache.commons.collections4.functors.c0.c(str, clsArr, objArr));
    }

    public static <E> h<E> k() {
        return org.apache.commons.collections4.functors.e0.b();
    }

    public static <E> h<E> l(Map<l0<E>, h<E>> map) {
        return org.apache.commons.collections4.functors.t0.e(map);
    }

    public static <E> h<E> m(l0<? super E>[] l0VarArr, h<? super E>[] hVarArr) {
        return org.apache.commons.collections4.functors.t0.f(l0VarArr, hVarArr, null);
    }

    public static <E> h<E> n(l0<? super E>[] l0VarArr, h<? super E>[] hVarArr, h<? super E> hVar) {
        return org.apache.commons.collections4.functors.t0.f(l0VarArr, hVarArr, hVar);
    }

    public static <E> h<E> o(Map<? extends E, h<E>> map) {
        if (map == null) {
            throw new NullPointerException("The object and closure map must not be null");
        }
        h<E> hVarRemove = map.remove(null);
        int size = map.size();
        h[] hVarArr = new h[size];
        l0[] l0VarArr = new l0[size];
        int i10 = 0;
        for (Map.Entry<? extends E, h<E>> entry : map.entrySet()) {
            l0VarArr[i10] = org.apache.commons.collections4.functors.n.c(entry.getKey());
            hVarArr[i10] = entry.getValue();
            i10++;
        }
        return n(l0VarArr, hVarArr, hVarRemove);
    }

    public static <E> h<E> p(l0<? super E> l0Var, h<? super E> hVar) {
        return org.apache.commons.collections4.functors.a1.e(l0Var, hVar, false);
    }
}
