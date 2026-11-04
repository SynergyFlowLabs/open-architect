package com.rabbitmq.utility;

import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes13.dex */
public class a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f266127c = 1000000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f266128d = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f266129a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f266130b;

    public synchronized T a() throws InterruptedException {
        while (!this.f266129a) {
            try {
                wait();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f266130b;
    }

    public synchronized T b(long j10) throws InterruptedException, TimeoutException {
        try {
            if (j10 == -1) {
                return a();
            }
            if (j10 < 0) {
                throw new IllegalArgumentException("Timeout cannot be less than zero");
            }
            long jNanoTime = (System.nanoTime() / 1000000) + j10;
            while (!this.f266129a) {
                long jNanoTime2 = System.nanoTime() / 1000000;
                if (jNanoTime2 >= jNanoTime) {
                    break;
                }
                wait(jNanoTime - jNanoTime2);
            }
            if (!this.f266129a) {
                throw new TimeoutException();
            }
            return this.f266130b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c(T t10) {
        try {
            if (this.f266129a) {
                throw new IllegalStateException("BlockingCell can only be set once");
            }
            this.f266130b = t10;
            this.f266129a = true;
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean d(T t10) {
        try {
            if (this.f266129a) {
                return false;
            }
            c(t10);
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized T e() {
        T tA;
        boolean z10 = false;
        while (true) {
            try {
                tA = a();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return tA;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0002, B:10:0x001a, B:29:0x004e, B:30:0x0056, B:24:0x003c, B:25:0x0048, B:7:0x0012), top: B:34:0x0002, inners: #3, #4 }] */
    public synchronized T f(int i10) throws TimeoutException {
        T tB;
        try {
            long jNanoTime = System.nanoTime() / 1000000;
            long j10 = i10;
            long j11 = jNanoTime + j10;
            boolean z10 = false;
            while (true) {
                try {
                    tB = b(j11 - jNanoTime);
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                } catch (InterruptedException unused) {
                    if (j10 != -1) {
                        try {
                            jNanoTime = System.nanoTime() / 1000000;
                            if (jNanoTime >= j11) {
                                Thread.currentThread().interrupt();
                                throw new TimeoutException();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = true;
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                    z10 = true;
                } catch (Throwable th3) {
                    th = th3;
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return tB;
    }
}
