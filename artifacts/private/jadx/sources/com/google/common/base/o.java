package com.google.common.base;

import java.lang.ref.PhantomReference;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@k
public abstract class o<T> extends PhantomReference<T> implements p {
    protected o(@fj.a T referent, q queue) {
        super(referent, queue.f116655a);
        queue.b();
    }
}
