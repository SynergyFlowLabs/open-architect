package org.apache.commons.collections4;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class x0 {
    private x0() {
    }

    public static <T> w0<T, T> a(h<? super T> hVar) {
        return org.apache.commons.collections4.functors.i.b(hVar);
    }

    public static <I, O> w0<I, O> b(n<? extends O> nVar) {
        return org.apache.commons.collections4.functors.s.b(nVar);
    }

    public static <T> w0<T, Boolean> c(l0<? super T> l0Var) {
        return org.apache.commons.collections4.functors.q0.c(l0Var);
    }

    public static <T> w0<T, T> d(Collection<? extends w0<? super T, ? extends T>> collection) {
        return org.apache.commons.collections4.functors.g.b(collection);
    }

    public static <T> w0<T, T> e(w0<? super T, ? extends T>... w0VarArr) {
        return org.apache.commons.collections4.functors.g.c(w0VarArr);
    }

    public static <T> w0<T, T> f() {
        return org.apache.commons.collections4.functors.h.b();
    }

    public static <I, O> w0<I, O> g(O o10) {
        return org.apache.commons.collections4.functors.l.b(o10);
    }

    public static <I, O> w0<I, O> h() {
        return org.apache.commons.collections4.functors.r.b();
    }

    public static <T> w0<T, T> i(l0<? super T> l0Var, w0<? super T, ? extends T> w0Var) {
        return org.apache.commons.collections4.functors.y.e(l0Var, w0Var);
    }

    public static <I, O> w0<I, O> j(l0<? super I> l0Var, w0<? super I, ? extends O> w0Var, w0<? super I, ? extends O> w0Var2) {
        return org.apache.commons.collections4.functors.y.f(l0Var, w0Var, w0Var2);
    }

    public static <T> w0<Class<? extends T>, T> k() {
        return org.apache.commons.collections4.functors.b0.b();
    }

    public static <T> w0<Class<? extends T>, T> l(Class<?>[] clsArr, Object[] objArr) {
        return org.apache.commons.collections4.functors.b0.c(clsArr, objArr);
    }

    public static <I, O> w0<I, O> m(String str) {
        return org.apache.commons.collections4.functors.c0.c(str, null, null);
    }

    public static <I, O> w0<I, O> n(String str, Class<?>[] clsArr, Object[] objArr) {
        return org.apache.commons.collections4.functors.c0.c(str, clsArr, objArr);
    }

    public static <I, O> w0<I, O> o(Map<? super I, ? extends O> map) {
        return org.apache.commons.collections4.functors.d0.c(map);
    }

    public static <T> w0<T, T> p() {
        return org.apache.commons.collections4.functors.f0.b();
    }

    public static <I, O> w0<I, O> q() {
        return org.apache.commons.collections4.functors.l.d();
    }

    public static <T> w0<T, String> r() {
        return org.apache.commons.collections4.functors.s0.b();
    }

    public static <I, O> w0<I, O> s(Map<I, w0<I, O>> map) {
        if (map == null) {
            throw new NullPointerException("The object and transformer map must not be null");
        }
        w0<I, O> w0VarRemove = map.remove(null);
        int size = map.size();
        w0[] w0VarArr = new w0[size];
        l0[] l0VarArr = new l0[size];
        int i10 = 0;
        for (Map.Entry<I, w0<I, O>> entry : map.entrySet()) {
            l0VarArr[i10] = org.apache.commons.collections4.functors.n.c(entry.getKey());
            w0VarArr[i10] = entry.getValue();
            i10++;
        }
        return w(l0VarArr, w0VarArr, w0VarRemove);
    }

    public static <I, O> w0<I, O> t(Map<l0<I>, w0<I, O>> map) {
        return org.apache.commons.collections4.functors.u0.e(map);
    }

    @Deprecated
    public static <I, O> w0<I, O> u(l0<? super I> l0Var, w0<? super I, ? extends O> w0Var, w0<? super I, ? extends O> w0Var2) {
        return org.apache.commons.collections4.functors.u0.f(new l0[]{l0Var}, new w0[]{w0Var}, w0Var2);
    }

    public static <I, O> w0<I, O> v(l0<? super I>[] l0VarArr, w0<? super I, ? extends O>[] w0VarArr) {
        return org.apache.commons.collections4.functors.u0.f(l0VarArr, w0VarArr, null);
    }

    public static <I, O> w0<I, O> w(l0<? super I>[] l0VarArr, w0<? super I, ? extends O>[] w0VarArr, w0<? super I, ? extends O> w0Var) {
        return org.apache.commons.collections4.functors.u0.f(l0VarArr, w0VarArr, w0Var);
    }
}
