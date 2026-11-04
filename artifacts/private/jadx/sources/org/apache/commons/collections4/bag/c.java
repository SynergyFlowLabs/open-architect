package org.apache.commons.collections4.bag;

import java.util.Comparator;
import org.apache.commons.collections4.t0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c<E> extends a<E> implements t0<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f335505d = -8223473624050467718L;

    protected c() {
    }

    @Override // org.apache.commons.collections4.t0
    public Comparator<? super E> comparator() {
        return c().comparator();
    }

    @Override // org.apache.commons.collections4.t0
    public E first() {
        return c().first();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.bag.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public t0<E> c() {
        return (t0) super.c();
    }

    @Override // org.apache.commons.collections4.t0
    public E last() {
        return c().last();
    }

    protected c(t0<E> t0Var) {
        super(t0Var);
    }
}
