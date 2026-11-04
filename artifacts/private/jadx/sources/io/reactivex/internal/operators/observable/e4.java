package io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class e4<T> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.b0<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f301519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f301520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f301521d;

    static final class a<T> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f301522h = -7481782523886138128L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super io.reactivex.b0<T>> f301523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f301524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f301525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f301526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.c f301527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.subjects.j<T> f301528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f301529g;

        a(io.reactivex.i0<? super io.reactivex.b0<T>> i0Var, long j10, int i10) {
            this.f301523a = i0Var;
            this.f301524b = j10;
            this.f301525c = i10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301527e, cVar)) {
                this.f301527e = cVar;
                this.f301523a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301529g = true;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301529g;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            io.reactivex.subjects.j<T> jVar = this.f301528f;
            if (jVar != null) {
                this.f301528f = null;
                jVar.onComplete();
            }
            this.f301523a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            io.reactivex.subjects.j<T> jVar = this.f301528f;
            if (jVar != null) {
                this.f301528f = null;
                jVar.onError(th2);
            }
            this.f301523a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            io.reactivex.subjects.j<T> jVarO8 = this.f301528f;
            if (jVarO8 == null && !this.f301529g) {
                jVarO8 = io.reactivex.subjects.j.o8(this.f301525c, this);
                this.f301528f = jVarO8;
                this.f301523a.onNext(jVarO8);
            }
            if (jVarO8 != null) {
                jVarO8.onNext(t10);
                long j10 = this.f301526d + 1;
                this.f301526d = j10;
                if (j10 >= this.f301524b) {
                    this.f301526d = 0L;
                    this.f301528f = null;
                    jVarO8.onComplete();
                    if (this.f301529g) {
                        this.f301527e.dispose();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f301529g) {
                this.f301527e.dispose();
            }
        }
    }

    static final class b<T> extends AtomicBoolean implements io.reactivex.i0<T>, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f301530k = 3366976432059579510L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super io.reactivex.b0<T>> f301531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f301532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f301533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f301534d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f301536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f301537g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f301538h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.disposables.c f301539i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicInteger f301540j = new AtomicInteger();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final ArrayDeque<io.reactivex.subjects.j<T>> f301535e = new ArrayDeque<>();

        b(io.reactivex.i0<? super io.reactivex.b0<T>> i0Var, long j10, long j11, int i10) {
            this.f301531a = i0Var;
            this.f301532b = j10;
            this.f301533c = j11;
            this.f301534d = i10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301539i, cVar)) {
                this.f301539i = cVar;
                this.f301531a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301537g = true;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301537g;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            ArrayDeque<io.reactivex.subjects.j<T>> arrayDeque = this.f301535e;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.f301531a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            ArrayDeque<io.reactivex.subjects.j<T>> arrayDeque = this.f301535e;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th2);
            }
            this.f301531a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            ArrayDeque<io.reactivex.subjects.j<T>> arrayDeque = this.f301535e;
            long j10 = this.f301536f;
            long j11 = this.f301533c;
            if (j10 % j11 == 0 && !this.f301537g) {
                this.f301540j.getAndIncrement();
                io.reactivex.subjects.j<T> jVarO8 = io.reactivex.subjects.j.o8(this.f301534d, this);
                arrayDeque.offer(jVarO8);
                this.f301531a.onNext(jVarO8);
            }
            long j12 = this.f301538h + 1;
            Iterator<io.reactivex.subjects.j<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t10);
            }
            if (j12 >= this.f301532b) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.f301537g) {
                    this.f301539i.dispose();
                    return;
                }
                this.f301538h = j12 - j11;
            } else {
                this.f301538h = j12;
            }
            this.f301536f = j10 + 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f301540j.decrementAndGet() == 0 && this.f301537g) {
                this.f301539i.dispose();
            }
        }
    }

    public e4(io.reactivex.g0<T> g0Var, long j10, long j11, int i10) {
        super(g0Var);
        this.f301519b = j10;
        this.f301520c = j11;
        this.f301521d = i10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super io.reactivex.b0<T>> i0Var) {
        if (this.f301519b == this.f301520c) {
            this.f301291a.a(new a(i0Var, this.f301519b, this.f301521d));
        } else {
            this.f301291a.a(new b(i0Var, this.f301519b, this.f301520c, this.f301521d));
        }
    }
}
