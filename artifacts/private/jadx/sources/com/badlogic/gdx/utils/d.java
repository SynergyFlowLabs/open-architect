package com.badlogic.gdx.utils;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f95451a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f95452b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReferenceArray<T> f95453c;

    public d(int i10) {
        this.f95453c = new AtomicReferenceArray<>(i10);
    }

    private int a(int i10) {
        return (i10 + 1) % this.f95453c.length();
    }

    public T b() {
        int i10 = this.f95452b.get();
        if (i10 == this.f95451a.get()) {
            return null;
        }
        T t10 = this.f95453c.get(i10);
        this.f95452b.set(a(i10));
        return t10;
    }

    public boolean c(T t10) {
        int i10 = this.f95451a.get();
        int i11 = this.f95452b.get();
        int iA = a(i10);
        if (iA == i11) {
            return false;
        }
        this.f95453c.set(i10, t10);
        this.f95451a.set(iA);
        return true;
    }
}
