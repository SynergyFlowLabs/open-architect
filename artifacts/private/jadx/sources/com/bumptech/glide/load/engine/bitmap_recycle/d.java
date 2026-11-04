package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.m;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
abstract class d<T extends m> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f96390b = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<T> f96391a = com.bumptech.glide.util.m.f(20);

    d() {
    }

    abstract T a();

    T b() {
        T tPoll = this.f96391a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void c(T t10) {
        if (this.f96391a.size() < 20) {
            this.f96391a.offer(t10);
        }
    }
}
