package com.google.common.base;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@k
public abstract class r<T> extends SoftReference<T> implements p {
    protected r(@fj.a T referent, q queue) {
        super(referent, queue.f116655a);
        queue.b();
    }
}
