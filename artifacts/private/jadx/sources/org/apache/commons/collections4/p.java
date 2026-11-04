package org.apache.commons.collections4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class p<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable<E> f336234a;

    p() {
        this.f336234a = this;
    }

    public static <T> p<T> A(Iterable<T> iterable) {
        v.g(iterable);
        return iterable instanceof p ? (p) iterable : new p<>(iterable);
    }

    public static <T> p<T> B(T t10) {
        return A(w.n(new org.apache.commons.collections4.iterators.j0(t10, false)));
    }

    public static <T> p<T> C(T... tArr) {
        return A(Arrays.asList(tArr));
    }

    public static <T> p<T> r() {
        return v.f336382a;
    }

    public p<E> D() {
        return A(v.F(this.f336234a));
    }

    public p<E> F(long j10) {
        return A(v.H(this.f336234a, j10));
    }

    public E[] G(Class<E> cls) {
        return (E[]) w.d0(iterator(), cls);
    }

    public List<E> J() {
        return v.I(this.f336234a);
    }

    public <O> p<O> K(w0<? super E, ? extends O> w0Var) {
        return A(v.M(this.f336234a, w0Var));
    }

    public p<E> L() {
        return A(v.N(this.f336234a));
    }

    public p<E> M() {
        return A(v.O(this.f336234a));
    }

    public p<E> N(Iterable<? extends E> iterable) {
        return A(v.P(this.f336234a, iterable));
    }

    public p<E> O(Iterable<? extends E>... iterableArr) {
        return A(v.Q(this.f336234a, iterableArr));
    }

    public boolean c(l0<? super E> l0Var) {
        return v.A(this.f336234a, l0Var);
    }

    public boolean contains(Object obj) {
        return v.k(this.f336234a, obj);
    }

    public boolean d(l0<? super E> l0Var) {
        return v.B(this.f336234a, l0Var);
    }

    public E get(int i10) {
        return (E) v.w(this.f336234a, i10);
    }

    public p<E> i(Iterable<? extends E> iterable) {
        return A(v.c(this.f336234a, iterable));
    }

    public boolean isEmpty() {
        return v.y(this.f336234a);
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f336234a.iterator();
    }

    public p<E> k(E... eArr) {
        return i(Arrays.asList(eArr));
    }

    public Enumeration<E> l() {
        return w.m(iterator());
    }

    public p<E> m(Iterable<? extends E> iterable) {
        return A(v.i(this.f336234a, iterable));
    }

    public p<E> n(Iterable<? extends E> iterable, Comparator<? super E> comparator) {
        return A(v.j(comparator, this.f336234a, iterable));
    }

    public void p(Collection<? super E> collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null");
        }
        j.a(collection, this.f336234a);
    }

    public p<E> s() {
        return A(J());
    }

    public int size() {
        return v.G(this.f336234a);
    }

    public p<E> t(l0<? super E> l0Var) {
        return A(v.q(this.f336234a, l0Var));
    }

    public String toString() {
        return v.J(this.f336234a);
    }

    public void u(h<? super E> hVar) {
        v.t(this.f336234a, hVar);
    }

    public p<E> v(long j10) {
        return A(v.b(this.f336234a, j10));
    }

    public p<E> w() {
        return A(v.z(this.f336234a));
    }

    private p(Iterable<E> iterable) {
        this.f336234a = iterable;
    }
}
