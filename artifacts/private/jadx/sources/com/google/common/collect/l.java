package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class l<T> extends nb<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.a
    private T f117597a;

    protected l(@fj.a T firstOrNull) {
        this.f117597a = firstOrNull;
    }

    @fj.a
    protected abstract T b(T previous);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f117597a != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t10 = this.f117597a;
        if (t10 == null) {
            throw new NoSuchElementException();
        }
        this.f117597a = b(t10);
        return t10;
    }
}
