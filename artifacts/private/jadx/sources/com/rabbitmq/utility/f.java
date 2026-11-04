package com.rabbitmq.utility;

import com.rabbitmq.utility.d;
import java.lang.Throwable;

/* JADX INFO: loaded from: classes13.dex */
public class f<V, E extends Throwable & d<E>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f266137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V f266138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f266139c;

    private f(V v10, E e10, boolean z10) {
        this.f266137a = z10;
        if (z10) {
            this.f266138b = v10;
            this.f266139c = null;
        } else {
            this.f266138b = null;
            this.f266139c = e10;
        }
    }

    public static <V, E extends Throwable & d<E>> f<V, E> b(E e10) {
        return new f<>(null, e10, false);
    }

    public static <V, E extends Throwable & d<E>> f<V, E> c(V v10) {
        return new f<>(v10, null, true);
    }

    public V a() throws Throwable {
        if (this.f266137a) {
            return this.f266138b;
        }
        throw e.c(this.f266139c);
    }
}
