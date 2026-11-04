package io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b<T> extends AtomicInteger implements ej.j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f298743a = -1001730202384742097L;

    @Override // ej.o
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // ej.o
    public final boolean r(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
