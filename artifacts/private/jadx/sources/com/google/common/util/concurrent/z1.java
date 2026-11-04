package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f120389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReentrantLock f120390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a8.a(io.sentry.protocol.z.b.f306551r)
    @fj.a
    private a f120391c;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @r9.m
        final z1 f120392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Condition f120393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @a8.a("monitor.lock")
        int f120394c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @a8.a("monitor.lock")
        @fj.a
        a f120395d;

        protected a(z1 monitor) {
            this.f120392a = (z1) com.google.common.base.j0.F(monitor, "monitor");
            this.f120393b = monitor.f120390b.newCondition();
        }

        public abstract boolean a();
    }

    public z1() {
        this(false);
    }

    @a8.a(io.sentry.protocol.z.b.f306551r)
    private boolean C(a guard) {
        try {
            return guard.a();
        } catch (Throwable th2) {
            F();
            throw th2;
        }
    }

    private static long E(long startTime, long timeoutNanos) {
        if (timeoutNanos <= 0) {
            return 0L;
        }
        return timeoutNanos - (System.nanoTime() - startTime);
    }

    @a8.a(io.sentry.protocol.z.b.f306551r)
    private void F() {
        for (a aVar = this.f120391c; aVar != null; aVar = aVar.f120395d) {
            aVar.f120393b.signalAll();
        }
    }

    @a8.a(io.sentry.protocol.z.b.f306551r)
    private void G() {
        for (a aVar = this.f120391c; aVar != null; aVar = aVar.f120395d) {
            if (C(aVar)) {
                aVar.f120393b.signal();
                return;
            }
        }
    }

    private static long H(long time, TimeUnit unit) {
        return com.google.common.primitives.n.g(unit.toNanos(time), 0L, 6917529027641081853L);
    }

    @a8.a(io.sentry.protocol.z.b.f306551r)
    private void b(a guard, boolean signalBeforeWaiting) throws InterruptedException {
        if (signalBeforeWaiting) {
            G();
        }
        e(guard);
        do {
            try {
                guard.f120393b.await();
            } catch (Throwable th2) {
                f(guard);
                throw th2;
            }
        } while (!guard.a());
        f(guard);
    }

    @a8.a(io.sentry.protocol.z.b.f306551r)
    private boolean c(a guard, long nanos, boolean signalBeforeWaiting) throws InterruptedException {
        boolean z10 = true;
        while (nanos > 0) {
            if (z10) {
                if (signalBeforeWaiting) {
                    try {
                        G();
                    } catch (Throwable th2) {
                        if (!z10) {
                            f(guard);
                        }
                        throw th2;
                    }
                }
                e(guard);
                z10 = false;
            }
            nanos = guard.f120393b.awaitNanos(nanos);
            if (guard.a()) {
                if (!z10) {
                    f(guard);
                }
                return true;
            }
        }
        if (!z10) {
            f(guard);
        }
        return false;
    }

    @a8.a(io.sentry.protocol.z.b.f306551r)
    private void d(a guard, boolean signalBeforeWaiting) {
        if (signalBeforeWaiting) {
            G();
        }
        e(guard);
        do {
            try {
                guard.f120393b.awaitUninterruptibly();
            } finally {
                f(guard);
            }
        } while (!guard.a());
    }

    @a8.a(io.sentry.protocol.z.b.f306551r)
    private void e(a guard) {
        int i10 = guard.f120394c;
        guard.f120394c = i10 + 1;
        if (i10 == 0) {
            guard.f120395d = this.f120391c;
            this.f120391c = guard;
        }
    }

    @a8.a(io.sentry.protocol.z.b.f306551r)
    private void f(a guard) {
        int i10 = guard.f120394c - 1;
        guard.f120394c = i10;
        if (i10 == 0) {
            a aVar = this.f120391c;
            a aVar2 = null;
            while (aVar != guard) {
                aVar2 = aVar;
                aVar = aVar.f120395d;
            }
            if (aVar2 == null) {
                this.f120391c = aVar.f120395d;
            } else {
                aVar2.f120395d = aVar.f120395d;
            }
            aVar.f120395d = null;
        }
    }

    private static long y(long timeoutNanos) {
        if (timeoutNanos <= 0) {
            return 0L;
        }
        long jNanoTime = System.nanoTime();
        if (jNanoTime == 0) {
            return 1L;
        }
        return jNanoTime;
    }

    public boolean A() {
        return this.f120390b.isLocked();
    }

    public boolean B() {
        return this.f120390b.isHeldByCurrentThread();
    }

    public void D() {
        ReentrantLock reentrantLock = this.f120390b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                G();
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public boolean I() {
        return this.f120390b.tryLock();
    }

    public boolean J(a guard) {
        if (guard.f120392a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f120390b;
        if (!reentrantLock.tryLock()) {
            return false;
        }
        try {
            boolean zA = guard.a();
            if (!zA) {
                reentrantLock.unlock();
            }
            return zA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void K(a guard) throws InterruptedException {
        if (guard.f120392a != this || !this.f120390b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.a()) {
            return;
        }
        b(guard, true);
    }

    public boolean L(a guard, long time, TimeUnit unit) throws InterruptedException {
        long jH = H(time, unit);
        if (guard.f120392a != this || !this.f120390b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.a()) {
            return true;
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return c(guard, jH, true);
    }

    public void M(a guard) {
        if (guard.f120392a != this || !this.f120390b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (!guard.a()) {
            d(guard, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    public boolean N(a guard, long time, TimeUnit unit) throws Throwable {
        long jH = H(time, unit);
        if (guard.f120392a != this || !this.f120390b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        boolean z10 = true;
        if (guard.a()) {
            return true;
        }
        long jY = y(jH);
        boolean zInterrupted = Thread.interrupted();
        long jE = jH;
        boolean z11 = true;
        while (true) {
            try {
                try {
                    boolean zC = this.c(guard, jE, z11);
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    return zC;
                } catch (Throwable th2) {
                    th = th2;
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (InterruptedException unused) {
                if (guard.a()) {
                    Thread.currentThread().interrupt();
                    return true;
                }
                jE = E(jY, jH);
                z11 = false;
                zInterrupted = true;
            } catch (Throwable th3) {
                th = th3;
                z10 = zInterrupted;
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    public void g() {
        this.f120390b.lock();
    }

    public boolean h(long time, TimeUnit unit) throws Throwable {
        boolean zTryLock;
        long jH = H(time, unit);
        ReentrantLock reentrantLock = this.f120390b;
        boolean z10 = true;
        if (!this.f120389a && reentrantLock.tryLock()) {
            return true;
        }
        boolean zInterrupted = Thread.interrupted();
        try {
            long jNanoTime = System.nanoTime();
            long jE = jH;
            while (true) {
                try {
                    try {
                        zTryLock = reentrantLock.tryLock(jE, TimeUnit.NANOSECONDS);
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        if (z10) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    jE = E(jNanoTime, jH);
                    zInterrupted = true;
                }
            }
            if (zInterrupted) {
                Thread.currentThread().interrupt();
            }
            return zTryLock;
        } catch (Throwable th3) {
            th = th3;
            z10 = zInterrupted;
        }
    }

    public boolean i(a guard) {
        if (guard.f120392a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f120390b;
        reentrantLock.lock();
        try {
            boolean zA = guard.a();
            if (!zA) {
                reentrantLock.unlock();
            }
            return zA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public boolean j(a guard, long time, TimeUnit unit) {
        if (guard.f120392a != this) {
            throw new IllegalMonitorStateException();
        }
        if (!h(time, unit)) {
            return false;
        }
        try {
            boolean zA = guard.a();
            if (!zA) {
                this.f120390b.unlock();
            }
            return zA;
        } catch (Throwable th2) {
            this.f120390b.unlock();
            throw th2;
        }
    }

    public boolean k(a guard) throws InterruptedException {
        if (guard.f120392a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f120390b;
        reentrantLock.lockInterruptibly();
        try {
            boolean zA = guard.a();
            if (!zA) {
                reentrantLock.unlock();
            }
            return zA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public boolean l(a guard, long time, TimeUnit unit) throws InterruptedException {
        if (guard.f120392a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f120390b;
        if (!reentrantLock.tryLock(time, unit)) {
            return false;
        }
        try {
            boolean zA = guard.a();
            if (!zA) {
                reentrantLock.unlock();
            }
            return zA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void m() throws InterruptedException {
        this.f120390b.lockInterruptibly();
    }

    public boolean n(long time, TimeUnit unit) throws InterruptedException {
        return this.f120390b.tryLock(time, unit);
    }

    public void o(a guard) throws InterruptedException {
        if (guard.f120392a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f120390b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lockInterruptibly();
        try {
            if (guard.a()) {
                return;
            }
            b(guard, zIsHeldByCurrentThread);
        } catch (Throwable th2) {
            D();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    public boolean p(a guard, long time, TimeUnit unit) throws InterruptedException {
        long jY;
        boolean z10;
        long jH = H(time, unit);
        if (guard.f120392a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f120390b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        if (this.f120389a) {
            jY = y(jH);
            if (!reentrantLock.tryLock(time, unit)) {
                return false;
            }
        } else {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (reentrantLock.tryLock()) {
                jY = 0;
            } else {
                jY = y(jH);
                if (!reentrantLock.tryLock(time, unit)) {
                    return false;
                }
            }
        }
        try {
            if (!guard.a()) {
                if (jY != 0) {
                    jH = E(jY, jH);
                }
                z10 = c(guard, jH, zIsHeldByCurrentThread);
            }
            if (!z10) {
                reentrantLock.unlock();
            }
            return z10;
        } catch (Throwable th2) {
            if (!zIsHeldByCurrentThread) {
                try {
                    G();
                } finally {
                    reentrantLock.unlock();
                }
            }
            throw th2;
        }
    }

    public void q(a guard) {
        if (guard.f120392a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f120390b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        try {
            if (guard.a()) {
                return;
            }
            d(guard, zIsHeldByCurrentThread);
        } catch (Throwable th2) {
            D();
            throw th2;
        }
    }

    public boolean r(a guard, long time, TimeUnit unit) throws Throwable {
        long jY;
        long jE;
        long jH = H(time, unit);
        if (guard.f120392a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f120390b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        boolean zInterrupted = Thread.interrupted();
        try {
            boolean zC = true;
            if (this.f120389a || !reentrantLock.tryLock()) {
                jY = y(jH);
                long jE2 = jH;
                while (true) {
                    try {
                        try {
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            zInterrupted = true;
                            if (zInterrupted) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        jE2 = E(jY, jH);
                        zInterrupted = true;
                    }
                }
                if (!reentrantLock.tryLock(jE2, TimeUnit.NANOSECONDS)) {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    return false;
                }
            } else {
                jY = 0;
            }
            while (!guard.a()) {
                try {
                    if (jY == 0) {
                        jY = y(jH);
                        jE = jH;
                    } else {
                        jE = E(jY, jH);
                    }
                    zC = c(guard, jE, zIsHeldByCurrentThread);
                } catch (InterruptedException unused2) {
                    zIsHeldByCurrentThread = false;
                    zInterrupted = zC;
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            }
            if (!zC) {
                reentrantLock.unlock();
            }
            if (zInterrupted) {
                Thread.currentThread().interrupt();
            }
            return zC;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public int s() {
        return this.f120390b.getHoldCount();
    }

    public int t() {
        return this.f120390b.getQueueLength();
    }

    public int u(a guard) {
        if (guard.f120392a != this) {
            throw new IllegalMonitorStateException();
        }
        this.f120390b.lock();
        try {
            int i10 = guard.f120394c;
            ReentrantLock reentrantLock = this.f120390b;
            return i10;
        } finally {
            this.f120390b.unlock();
        }
    }

    public boolean v(Thread thread) {
        return this.f120390b.hasQueuedThread(thread);
    }

    public boolean w() {
        return this.f120390b.hasQueuedThreads();
    }

    public boolean x(a guard) {
        return u(guard) > 0;
    }

    public boolean z() {
        return this.f120389a;
    }

    public z1(boolean fair) {
        this.f120391c = null;
        this.f120389a = fair;
        this.f120390b = new ReentrantLock(fair);
    }
}
