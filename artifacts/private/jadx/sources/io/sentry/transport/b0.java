package io.sentry.transport;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f306856a;

    private static final class a extends AbstractQueuedSynchronizer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f306857a = 5970133580157457018L;

        a(int i10) {
            setState(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            releaseShared(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int e() {
            return getState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            int state;
            do {
                state = getState();
            } while (!compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int i10) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int i10) {
            int state;
            int i11;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i11 = state - 1;
            } while (!compareAndSetState(state, i11));
            return i11 == 0;
        }
    }

    public b0(int i10) {
        if (i10 >= 0) {
            this.f306856a = new a(i10);
            return;
        }
        throw new IllegalArgumentException("negative initial count '" + i10 + "' is not allowed");
    }

    public void a() {
        this.f306856a.d();
    }

    public int b() {
        return this.f306856a.e();
    }

    public void c() {
        this.f306856a.f();
    }

    public void d() throws InterruptedException {
        this.f306856a.acquireSharedInterruptibly(1);
    }

    public boolean e(long j10, @NotNull TimeUnit timeUnit) throws InterruptedException {
        return this.f306856a.tryAcquireSharedNanos(1, timeUnit.toNanos(j10));
    }

    public b0() {
        this(0);
    }
}
