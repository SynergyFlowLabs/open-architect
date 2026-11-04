package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f121197a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f121198b = new AtomicInteger();

    public int a() {
        return this.f121198b.get();
    }

    public int b() {
        return this.f121197a.get();
    }

    public void c() {
        this.f121198b.getAndIncrement();
    }

    public void d() {
        this.f121197a.getAndIncrement();
    }

    public void e() {
        this.f121198b.set(0);
    }
}
