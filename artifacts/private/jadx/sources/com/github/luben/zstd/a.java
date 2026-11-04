package com.github.luben.zstd;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
abstract class a implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater<a> f103011b = AtomicIntegerFieldUpdater.newUpdater(a.class, androidx.media3.exoplayer.upstream.h.f65998l);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f103012c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f103013a;

    a() {
    }

    void a() {
        int i10;
        do {
            i10 = this.f103013a;
            if (i10 < 0) {
                throw new IllegalStateException("Closed");
            }
            if (i10 == Integer.MAX_VALUE) {
                throw new IllegalStateException("Shared lock overflow");
            }
        } while (!f103011b.compareAndSet(this, i10, i10 + 1));
    }

    abstract void b();

    void c() {
        int i10;
        do {
            i10 = this.f103013a;
            if (i10 < 0) {
                throw new IllegalStateException("Closed");
            }
            if (i10 == 0) {
                throw new IllegalStateException("Shared lock underflow");
            }
        } while (!f103011b.compareAndSet(this, i10, i10 - 1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f103013a == -1) {
                    return;
                }
                if (!f103011b.compareAndSet(this, 0, -1)) {
                    throw new IllegalStateException("Attempt to close while in use");
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void d() {
        this.f103013a = 0;
    }
}
