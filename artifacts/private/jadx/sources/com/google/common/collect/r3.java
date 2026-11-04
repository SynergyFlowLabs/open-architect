package com.google.common.collect;

import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
final class r3<T> extends c<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<T> f118007c;

    r3(Queue<T> queue) {
        this.f118007c = (Queue) com.google.common.base.j0.E(queue);
    }

    @Override // com.google.common.collect.c
    @fj.a
    protected T b() {
        return this.f118007c.isEmpty() ? c() : this.f118007c.remove();
    }
}
