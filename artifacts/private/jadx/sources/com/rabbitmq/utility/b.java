package com.rabbitmq.utility;

import com.rabbitmq.utility.d;
import java.lang.Throwable;

/* JADX INFO: loaded from: classes13.dex */
public class b<V, E extends Throwable & d<E>> extends a<f<V, E>> {
    public void g(E e10) {
        super.c(f.b(e10));
    }

    public void h(V v10) {
        super.c(f.c(v10));
    }

    public V i() throws Throwable {
        return (V) e().a();
    }

    public V j(int i10) throws Throwable {
        return (V) f(i10).a();
    }
}
