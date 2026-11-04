package io.reactivex.internal.operators.flowable;

import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class j1<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterable<? extends T> f299570b;

    static abstract class a<T> extends io.reactivex.internal.subscriptions.d<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f299571e = -2252972430506210021L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Iterator<? extends T> f299572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f299573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f299574d;

        a(Iterator<? extends T> it) {
            this.f299572b = it;
        }

        abstract void a();

        abstract void b(long j10);

        @Override // org.reactivestreams.w
        public final void cancel() {
            this.f299573c = true;
        }

        @Override // ej.o
        public final void clear() {
            this.f299572b = null;
        }

        @Override // ej.o
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f299572b;
            if (it != null && it.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // ej.k
        public final int p(int i10) {
            return i10 & 1;
        }

        @Override // ej.o
        @cj.g
        public final T poll() {
            Iterator<? extends T> it = this.f299572b;
            if (it == null) {
                return null;
            }
            if (!this.f299574d) {
                this.f299574d = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) io.reactivex.internal.functions.b.g(this.f299572b.next(), "Iterator.next() returned a null value");
        }

        @Override // org.reactivestreams.w
        public final void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10) && io.reactivex.internal.util.d.a(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j10);
                }
            }
        }
    }

    static final class b<T> extends a<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f299575g = -6022804456014692607L;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final ej.a<? super T> f299576f;

        b(ej.a<? super T> aVar, Iterator<? extends T> it) {
            super(it);
            this.f299576f = aVar;
        }

        @Override // io.reactivex.internal.operators.flowable.j1.a
        void a() {
            Iterator<? extends T> it = this.f299572b;
            ej.a<? super T> aVar = this.f299576f;
            while (!this.f299573c) {
                try {
                    T next = it.next();
                    if (this.f299573c) {
                        break;
                    }
                    if (next == null) {
                        aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    aVar.L(next);
                    if (this.f299573c) {
                        break;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (!this.f299573c) {
                                aVar.onComplete();
                                break;
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        aVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    aVar.onError(th3);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.j1.a
        void b(long j10) {
            Iterator<? extends T> it = this.f299572b;
            ej.a<? super T> aVar = this.f299576f;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        j10 = get();
                        if (j11 == j10) {
                            break;
                        }
                    } else {
                        if (this.f299573c) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.f299573c) {
                                return;
                            }
                            if (next == null) {
                                aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zL = aVar.L(next);
                            if (this.f299573c) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f299573c) {
                                        return;
                                    }
                                    aVar.onComplete();
                                    return;
                                } else if (zL) {
                                    j11++;
                                }
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                aVar.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.b.b(th3);
                            aVar.onError(th3);
                            return;
                        }
                    }
                }
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    static final class c<T> extends a<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f299577g = -6022804456014692607L;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299578f;

        c(org.reactivestreams.v<? super T> vVar, Iterator<? extends T> it) {
            super(it);
            this.f299578f = vVar;
        }

        @Override // io.reactivex.internal.operators.flowable.j1.a
        void a() {
            Iterator<? extends T> it = this.f299572b;
            org.reactivestreams.v<? super T> vVar = this.f299578f;
            while (!this.f299573c) {
                try {
                    T next = it.next();
                    if (this.f299573c) {
                        return;
                    }
                    if (next == null) {
                        vVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    vVar.onNext(next);
                    if (this.f299573c) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f299573c) {
                                return;
                            }
                            vVar.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        vVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    vVar.onError(th3);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.j1.a
        void b(long j10) {
            Iterator<? extends T> it = this.f299572b;
            org.reactivestreams.v<? super T> vVar = this.f299578f;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        j10 = get();
                        if (j11 == j10) {
                            break;
                        }
                    } else {
                        if (this.f299573c) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.f299573c) {
                                return;
                            }
                            if (next == null) {
                                vVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            vVar.onNext(next);
                            if (this.f299573c) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f299573c) {
                                        return;
                                    }
                                    vVar.onComplete();
                                    return;
                                }
                                j11++;
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                vVar.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.b.b(th3);
                            vVar.onError(th3);
                            return;
                        }
                    }
                }
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public j1(Iterable<? extends T> iterable) {
        this.f299570b = iterable;
    }

    public static <T> void M8(org.reactivestreams.v<? super T> vVar, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                io.reactivex.internal.subscriptions.g.b(vVar);
            } else if (vVar instanceof ej.a) {
                vVar.l(new b((ej.a) vVar, it));
            } else {
                vVar.l(new c(vVar, it));
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.subscriptions.g.c(th2, vVar);
        }
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        try {
            M8(vVar, this.f299570b.iterator());
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.subscriptions.g.c(th2, vVar);
        }
    }
}
