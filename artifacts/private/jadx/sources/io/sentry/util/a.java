package io.sentry.util;

import io.sentry.m1;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends ReentrantLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f306938a = -3283069816958445549L;

    /* JADX INFO: renamed from: io.sentry.util.a$a, reason: collision with other inner class name */
    static final class C2234a implements m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ReentrantLock f306939a;

        C2234a(@NotNull ReentrantLock reentrantLock) {
            this.f306939a = reentrantLock;
        }

        @Override // io.sentry.m1, java.lang.AutoCloseable
        public void close() {
            this.f306939a.unlock();
        }
    }

    public m1 a() {
        lock();
        return new C2234a(this);
    }
}
