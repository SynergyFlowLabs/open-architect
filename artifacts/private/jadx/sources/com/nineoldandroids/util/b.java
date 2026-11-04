package com.nineoldandroids.util;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b<T> extends d<T, Integer> {
    public b(String str) {
        super(Integer.class, str);
    }

    @Override // com.nineoldandroids.util.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void f(T t10, Integer num) {
        num.intValue();
        f(t10, num);
    }

    public abstract void h(T t10, int i10);
}
