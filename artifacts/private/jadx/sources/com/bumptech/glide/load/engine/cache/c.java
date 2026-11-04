package com.bumptech.glide.load.engine.cache;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f96455a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f96456b = new b();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Lock f96457a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f96458b;

        a() {
        }
    }

    private static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f96459b = 10;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<a> f96460a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVarPoll;
            synchronized (this.f96460a) {
                try {
                    aVarPoll = this.f96460a.poll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return aVarPoll == null ? new a() : aVarPoll;
        }

        void b(a aVar) {
            synchronized (this.f96460a) {
                try {
                    if (this.f96460a.size() < 10) {
                        this.f96460a.offer(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                aVarA = this.f96455a.get(str);
                if (aVarA == null) {
                    aVarA = this.f96456b.a();
                    this.f96455a.put(str, aVarA);
                }
                aVarA.f96458b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVarA.f96457a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) com.bumptech.glide.util.k.d(this.f96455a.get(str));
                int i10 = aVar.f96458b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f96458b);
                }
                int i11 = i10 - 1;
                aVar.f96458b = i11;
                if (i11 == 0) {
                    a aVarRemove = this.f96455a.remove(str);
                    if (!aVarRemove.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                    }
                    this.f96456b.b(aVarRemove);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f96457a.unlock();
    }
}
