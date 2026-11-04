package com.google.common.base;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@k
public abstract class s<T> extends WeakReference<T> implements p {
    protected s(@fj.a T referent, q queue) {
        super(referent, queue.f116655a);
        queue.b();
    }
}
