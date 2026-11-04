package org.apache.commons.collections4.bag;

import java.util.Comparator;
import org.apache.commons.collections4.l0;
import org.apache.commons.collections4.t0;

/* JADX INFO: loaded from: classes14.dex */
public class h<E> extends g<E> implements t0<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f335510f = 3448581314086406616L;

    protected h(t0<E> t0Var, l0<? super E> l0Var) {
        super(t0Var, l0Var);
    }

    public static <E> h<E> s(t0<E> t0Var, l0<? super E> l0Var) {
        return new h<>(t0Var, l0Var);
    }

    @Override // org.apache.commons.collections4.t0
    public Comparator<? super E> comparator() {
        return c().comparator();
    }

    @Override // org.apache.commons.collections4.t0
    public E first() {
        return c().first();
    }

    @Override // org.apache.commons.collections4.t0
    public E last() {
        return c().last();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.bag.g
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public t0<E> c() {
        return (t0) super.c();
    }
}
