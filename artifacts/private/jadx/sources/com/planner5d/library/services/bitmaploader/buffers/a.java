package com.planner5d.library.services.bitmaploader.buffers;

import androidx.annotation.NonNull;
import com.planner5d.library.services.rx.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import rx.Subscriber;
import rx.subjects.PublishSubject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a<T, D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<T> f224096a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<T> f224097b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f224098c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f224099d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Semaphore f224100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f224101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final PublishSubject<Integer> f224102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f224103h;

    /* JADX INFO: renamed from: com.planner5d.library.services.bitmaploader.buffers.a$a, reason: collision with other inner class name */
    class C1662a extends e<Integer> {
        C1662a() {
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Integer value) {
            if (value.intValue() == a.this.f224103h) {
                a.this.c();
            }
        }
    }

    public a(int buffers) {
        PublishSubject<Integer> publishSubjectCreate = PublishSubject.create();
        this.f224102g = publishSubjectCreate;
        this.f224103h = 0;
        this.f224100e = new Semaphore(buffers);
        this.f224101f = buffers;
        publishSubjectCreate.delay(6L, TimeUnit.SECONDS).subscribe((Subscriber<? super Integer>) new C1662a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f224099d) {
            try {
                if (this.f224100e.availablePermits() == this.f224101f) {
                    Iterator<T> it = this.f224096a.iterator();
                    while (it.hasNext()) {
                        f(it.next());
                    }
                    this.f224096a.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void d() {
        PublishSubject<Integer> publishSubject = this.f224102g;
        int i10 = this.f224103h + 1;
        this.f224103h = i10;
        publishSubject.onNext(Integer.valueOf(i10));
    }

    protected abstract T e(T old, D data);

    protected abstract void f(@NonNull T buffer);

    public T g(D d10) {
        T tRemove;
        T tE;
        synchronized (this.f224099d) {
            try {
                this.f224100e.acquireUninterruptibly();
                synchronized (this.f224098c) {
                    try {
                        tRemove = !this.f224096a.isEmpty() ? this.f224096a.remove(0) : null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                tE = e(tRemove, d10);
                synchronized (this.f224098c) {
                    try {
                        this.f224097b.add(tE);
                        if (tRemove != null && tRemove != tE) {
                            f(tRemove);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return tE;
    }

    public void h(T buffer) {
        synchronized (this.f224099d) {
            if (buffer != null) {
                try {
                    synchronized (this.f224098c) {
                        try {
                            if (!this.f224097b.contains(buffer)) {
                                throw new RuntimeException("Unmanaged buffer");
                            }
                            this.f224096a.add(buffer);
                            this.f224097b.remove(buffer);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    this.f224100e.release();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        d();
    }
}
