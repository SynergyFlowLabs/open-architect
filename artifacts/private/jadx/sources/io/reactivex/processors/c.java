package io.reactivex.processors;

import io.reactivex.l;
import io.reactivex.q;
import org.reactivestreams.t;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c<T> extends l<T> implements t<T, T>, q<T> {
    @cj.g
    public abstract Throwable M8();

    public abstract boolean N8();

    public abstract boolean O8();

    public abstract boolean P8();

    @cj.f
    @cj.d
    public final c<T> Q8() {
        return this instanceof g ? this : new g(this);
    }
}
