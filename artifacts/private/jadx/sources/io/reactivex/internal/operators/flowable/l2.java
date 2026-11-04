package io.reactivex.internal.operators.flowable;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class l2<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f299672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.a f299673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.a f299674e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f299675a;

        static {
            int[] iArr = new int[io.reactivex.a.values().length];
            f299675a = iArr;
            try {
                iArr[io.reactivex.a.DROP_LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f299675a[io.reactivex.a.DROP_OLDEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static final class b<T> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f299676k = 3240706908776709697L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.a f299678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.a f299679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f299680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f299681e = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Deque<T> f299682f = new ArrayDeque();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        org.reactivestreams.w f299683g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f299684h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f299685i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Throwable f299686j;

        b(org.reactivestreams.v<? super T> vVar, dj.a aVar, io.reactivex.a aVar2, long j10) {
            this.f299677a = vVar;
            this.f299678b = aVar;
            this.f299679c = aVar2;
            this.f299680d = j10;
        }

        void a(Deque<T> deque) {
            synchronized (deque) {
                try {
                    deque.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b() {
            boolean zIsEmpty;
            T tPoll;
            if (getAndIncrement() == 0) {
                Deque<T> deque = this.f299682f;
                org.reactivestreams.v<? super T> vVar = this.f299677a;
                int iAddAndGet = 1;
                do {
                    long j10 = this.f299681e.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        if (this.f299684h) {
                            a(deque);
                            return;
                        }
                        boolean z10 = this.f299685i;
                        synchronized (deque) {
                            tPoll = deque.poll();
                        }
                        boolean z11 = tPoll == null;
                        if (z10) {
                            Throwable th2 = this.f299686j;
                            if (th2 != null) {
                                a(deque);
                                vVar.onError(th2);
                                return;
                            } else if (z11) {
                                vVar.onComplete();
                                return;
                            }
                        }
                        if (z11) {
                            break;
                        }
                        vVar.onNext(tPoll);
                        j11++;
                    }
                    if (j11 == j10) {
                        if (this.f299684h) {
                            a(deque);
                            return;
                        }
                        boolean z12 = this.f299685i;
                        synchronized (deque) {
                            zIsEmpty = deque.isEmpty();
                        }
                        if (z12) {
                            Throwable th3 = this.f299686j;
                            if (th3 != null) {
                                a(deque);
                                vVar.onError(th3);
                                return;
                            } else if (zIsEmpty) {
                                vVar.onComplete();
                                return;
                            }
                        }
                    }
                    if (j11 != 0) {
                        io.reactivex.internal.util.d.e(this.f299681e, j11);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299684h = true;
            this.f299683g.cancel();
            if (getAndIncrement() == 0) {
                a(this.f299682f);
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299683g, wVar)) {
                this.f299683g = wVar;
                this.f299677a.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299685i = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299685i) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299686j = th2;
            this.f299685i = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            boolean z10;
            boolean z11;
            if (this.f299685i) {
                return;
            }
            Deque<T> deque = this.f299682f;
            synchronized (deque) {
                try {
                    z10 = false;
                    if (deque.size() == this.f299680d) {
                        int i10 = a.f299675a[this.f299679c.ordinal()];
                        z11 = true;
                        if (i10 == 1) {
                            deque.pollLast();
                            deque.offer(t10);
                        } else if (i10 == 2) {
                            deque.poll();
                            deque.offer(t10);
                        }
                        z11 = false;
                        z10 = true;
                    } else {
                        deque.offer(t10);
                        z11 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z10) {
                if (!z11) {
                    b();
                    return;
                } else {
                    this.f299683g.cancel();
                    onError(new io.reactivex.exceptions.c());
                    return;
                }
            }
            dj.a aVar = this.f299678b;
            if (aVar != null) {
                try {
                    aVar.run();
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    this.f299683g.cancel();
                    onError(th3);
                }
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f299681e, j10);
                b();
            }
        }
    }

    public l2(io.reactivex.l<T> lVar, long j10, dj.a aVar, io.reactivex.a aVar2) {
        super(lVar);
        this.f299672c = j10;
        this.f299673d = aVar;
        this.f299674e = aVar2;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new b(vVar, this.f299673d, this.f299674e, this.f299672c));
    }
}
