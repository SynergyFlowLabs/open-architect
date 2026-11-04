package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f303269b = -6120223772001106981L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f303270c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Object f303271d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Object f303272e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Object f303273f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f303274g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f303275h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f303276i = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f303277a;

    public n(Runnable runnable, io.reactivex.internal.disposables.c cVar) {
        super(3);
        this.f303277a = runnable;
        lazySet(0, cVar);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f303273f) {
                return;
            }
            if (obj == f303271d) {
                future.cancel(false);
                return;
            } else if (obj == f303272e) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            int i10 = 2 << 0;
            if (obj5 == f303273f || obj5 == (obj3 = f303271d) || obj5 == (obj4 = f303272e)) {
                break;
            }
            boolean z10 = get(2) != Thread.currentThread();
            if (z10) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 == null) {
                    break;
                }
                ((Future) obj5).cancel(z10);
                break;
            }
        }
        do {
            obj = get(0);
            if (obj == f303273f || obj == (obj2 = f303270c) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((io.reactivex.internal.disposables.c) obj).b(this);
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        Object obj = get(0);
        return obj == f303270c || obj == f303273f;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        lazySet(2, Thread.currentThread());
        try {
            this.f303277a.run();
        } catch (Throwable th2) {
            try {
                io.reactivex.plugins.a.Y(th2);
            } finally {
                lazySet(2, null);
                Object obj2 = get(0);
                if (obj2 != f303270c && compareAndSet(0, obj2, f303273f) && obj2 != null) {
                    ((io.reactivex.internal.disposables.c) obj2).b(this);
                }
                do {
                    obj = get(1);
                    if (obj == f303271d || obj == f303272e) {
                        break;
                    }
                } while (!compareAndSet(1, obj, f303273f));
            }
        }
        lazySet(2, null);
        Object obj3 = get(0);
        if (obj3 != f303270c && compareAndSet(0, obj3, f303273f) && obj3 != null) {
            ((io.reactivex.internal.disposables.c) obj3).b(this);
        }
        do {
            obj = get(1);
            Object obj4 = f303271d;
            if (obj == obj4) {
                return;
            }
            Object obj5 = f303272e;
            if (obj == obj5) {
                return;
            }
        } while (!compareAndSet(1, obj, f303273f));
    }
}
