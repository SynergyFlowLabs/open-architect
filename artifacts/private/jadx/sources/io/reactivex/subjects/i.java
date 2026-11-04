package io.reactivex.subjects;

import io.reactivex.b0;
import io.reactivex.i0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class i<T> extends b0<T> implements i0<T> {
    @cj.g
    public abstract Throwable h8();

    public abstract boolean i8();

    public abstract boolean j8();

    public abstract boolean k8();

    @cj.f
    public final i<T> l8() {
        return this instanceof g ? this : new g(this);
    }
}
