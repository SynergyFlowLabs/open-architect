package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class c<T> extends nb<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f117205a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private T f117206b;

    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected c() {
    }

    private boolean d() {
        this.f117205a = a.FAILED;
        this.f117206b = b();
        if (this.f117205a == a.DONE) {
            return false;
        }
        this.f117205a = a.READY;
        return true;
    }

    @fj.a
    protected abstract T b();

    @z7.a
    @fj.a
    protected final T c() {
        this.f117205a = a.DONE;
        int i10 = 6 << 0;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.google.common.base.j0.g0(this.f117205a != a.FAILED);
        int iOrdinal = this.f117205a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return d();
        }
        return false;
    }

    @Override // java.util.Iterator
    @z7.a
    @b9
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f117205a = a.NOT_READY;
        T t10 = (T) u8.a(this.f117206b);
        this.f117206b = null;
        return t10;
    }

    @b9
    public final T peek() {
        if (hasNext()) {
            return (T) u8.a(this.f117206b);
        }
        throw new NoSuchElementException();
    }
}
