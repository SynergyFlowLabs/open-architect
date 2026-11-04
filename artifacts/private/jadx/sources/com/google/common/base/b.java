package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b
@k
abstract class b<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f116433a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private T f116434b;

    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean d() {
        this.f116433a = a.FAILED;
        this.f116434b = b();
        if (this.f116433a == a.DONE) {
            return false;
        }
        this.f116433a = a.READY;
        return true;
    }

    @fj.a
    protected abstract T b();

    @z7.a
    @fj.a
    protected final T c() {
        this.f116433a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        j0.g0(this.f116433a != a.FAILED);
        int iOrdinal = this.f116433a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return d();
        }
        return false;
    }

    @Override // java.util.Iterator
    @g0
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f116433a = a.NOT_READY;
        T t10 = (T) c0.a(this.f116434b);
        this.f116434b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
