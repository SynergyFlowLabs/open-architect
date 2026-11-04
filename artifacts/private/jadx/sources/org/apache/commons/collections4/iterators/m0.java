package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class m0<I, O> implements Iterator<O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<? extends I> f335836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w0<? super I, ? extends O> f335837b;

    public m0() {
    }

    public Iterator<? extends I> b() {
        return this.f335836a;
    }

    public w0<? super I, ? extends O> c() {
        return this.f335837b;
    }

    public void d(Iterator<? extends I> it) {
        this.f335836a = it;
    }

    public void e(w0<? super I, ? extends O> w0Var) {
        this.f335837b = w0Var;
    }

    protected O f(I i10) {
        return this.f335837b.a(i10);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335836a.hasNext();
    }

    @Override // java.util.Iterator
    public O next() {
        return f(this.f335836a.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f335836a.remove();
    }

    public m0(Iterator<? extends I> it) {
        this.f335836a = it;
    }

    public m0(Iterator<? extends I> it, w0<? super I, ? extends O> w0Var) {
        this.f335836a = it;
        this.f335837b = w0Var;
    }
}
