package io.reactivex.internal.subscriptions;

import ej.l;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d<T> extends AtomicLong implements l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f303439a = -6671519529404341862L;

    @Override // ej.o
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // ej.o
    public final boolean r(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
