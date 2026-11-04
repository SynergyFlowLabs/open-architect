package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class o2<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    static final class a<T> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f299948h = 163080509307634843L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.reactivestreams.w f299950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f299951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Throwable f299952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f299953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f299954f = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<T> f299955g = new AtomicReference<>();

        a(org.reactivestreams.v<? super T> vVar) {
            this.f299949a = vVar;
        }

        boolean a(boolean z10, boolean z11, org.reactivestreams.v<?> vVar, AtomicReference<T> atomicReference) {
            if (this.f299953e) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z10) {
                Throwable th2 = this.f299952d;
                if (th2 != null) {
                    atomicReference.lazySet(null);
                    vVar.onError(th2);
                    return true;
                }
                if (z11) {
                    vVar.onComplete();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005b  */
        /* JADX WARN: Code duplicated, block: B:29:0x0060  */
        void b() {
            if (getAndIncrement() == 0) {
                org.reactivestreams.v<? super T> vVar = this.f299949a;
                AtomicLong atomicLong = this.f299954f;
                AtomicReference<T> atomicReference = this.f299955g;
                int iAddAndGet = 1;
                loop0: do {
                    long j10 = 0;
                    while (true) {
                        if (j10 == atomicLong.get()) {
                            break;
                        }
                        boolean z10 = this.f299951c;
                        T andSet = atomicReference.getAndSet(null);
                        boolean z11 = andSet == null;
                        if (a(z10, z11, vVar, atomicReference)) {
                            break loop0;
                        }
                        if (z11) {
                            break;
                        }
                        vVar.onNext(andSet);
                        j10++;
                    }
                    if (j10 == atomicLong.get()) {
                        if (a(this.f299951c, atomicReference.get() == null, vVar, atomicReference)) {
                            break;
                        }
                        if (j10 != 0) {
                            io.reactivex.internal.util.d.e(atomicLong, j10);
                        }
                        iAddAndGet = addAndGet(-iAddAndGet);
                    } else {
                        if (j10 != 0) {
                            io.reactivex.internal.util.d.e(atomicLong, j10);
                        }
                        iAddAndGet = addAndGet(-iAddAndGet);
                    }
                } while (iAddAndGet != 0);
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f299953e) {
                return;
            }
            this.f299953e = true;
            this.f299950b.cancel();
            if (getAndIncrement() == 0) {
                this.f299955g.lazySet(null);
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299950b, wVar)) {
                this.f299950b = wVar;
                this.f299949a.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299951c = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299952d = th2;
            this.f299951c = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f299955g.lazySet(t10);
            b();
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f299954f, j10);
                b();
            }
        }
    }

    public o2(io.reactivex.l<T> lVar) {
        super(lVar);
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar));
    }
}
