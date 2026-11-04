package io.reactivex.internal.operators.maybe;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class g<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.y<? extends T>> f300790b;

    static final class a<T> extends AtomicInteger implements io.reactivex.v<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f300791g = 3520831347801429610L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300792a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Iterator<? extends io.reactivex.y<? extends T>> f300796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f300797f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicLong f300793b = new AtomicLong();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f300795d = new io.reactivex.internal.disposables.h();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<Object> f300794c = new AtomicReference<>(io.reactivex.internal.util.q.COMPLETE);

        a(org.reactivestreams.v<? super T> vVar, Iterator<? extends io.reactivex.y<? extends T>> it) {
            this.f300792a = vVar;
            this.f300796e = it;
        }

        void a() {
            if (getAndIncrement() == 0) {
                AtomicReference<Object> atomicReference = this.f300794c;
                org.reactivestreams.v<? super T> vVar = this.f300792a;
                io.reactivex.internal.disposables.h hVar = this.f300795d;
                while (!hVar.k()) {
                    Object obj = atomicReference.get();
                    if (obj != null) {
                        if (obj != io.reactivex.internal.util.q.COMPLETE) {
                            long j10 = this.f300797f;
                            if (j10 != this.f300793b.get()) {
                                this.f300797f = j10 + 1;
                                atomicReference.lazySet(null);
                                vVar.onNext(obj);
                            }
                        } else {
                            atomicReference.lazySet(null);
                        }
                        if (!hVar.k()) {
                            try {
                                if (this.f300796e.hasNext()) {
                                    try {
                                        ((io.reactivex.y) io.reactivex.internal.functions.b.g(this.f300796e.next(), "The source Iterator returned a null MaybeSource")).a(this);
                                    } catch (Throwable th2) {
                                        io.reactivex.exceptions.b.b(th2);
                                        vVar.onError(th2);
                                        return;
                                    }
                                } else {
                                    vVar.onComplete();
                                }
                            } catch (Throwable th3) {
                                io.reactivex.exceptions.b.b(th3);
                                vVar.onError(th3);
                                return;
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                    }
                }
                atomicReference.lazySet(null);
            }
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300794c.lazySet(t10);
            a();
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f300795d.dispose();
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            this.f300795d.a(cVar);
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300794c.lazySet(io.reactivex.internal.util.q.COMPLETE);
            a();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300792a.onError(th2);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f300793b, j10);
                a();
            }
        }
    }

    public g(Iterable<? extends io.reactivex.y<? extends T>> iterable) {
        this.f300790b = iterable;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        try {
            a aVar = new a(vVar, (Iterator) io.reactivex.internal.functions.b.g(this.f300790b.iterator(), "The sources Iterable returned a null Iterator"));
            vVar.l(aVar);
            aVar.a();
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.subscriptions.g.c(th2, vVar);
        }
    }
}
