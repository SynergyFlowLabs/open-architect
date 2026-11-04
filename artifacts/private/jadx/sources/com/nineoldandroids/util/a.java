package com.nineoldandroids.util;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a<T> extends d<T, Float> {
    public a(String str) {
        super(Float.class, str);
    }

    @Override // com.nineoldandroids.util.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void f(T t10, Float f10) {
        h(t10, f10.floatValue());
    }

    public abstract void h(T t10, float f10);
}
