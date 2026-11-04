package io.reactivex.subjects;

import androidx.compose.animation.core.z1;
import ej.o;
import io.reactivex.b0;
import io.reactivex.i0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class j<T> extends i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.internal.queue.c<T> f303831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<i0<? super T>> f303832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<Runnable> f303833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f303834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f303835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f303836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Throwable f303837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final AtomicBoolean f303838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final io.reactivex.internal.observers.b<T> f303839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f303840j;

    final class a extends io.reactivex.internal.observers.b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f303841c = 7926949470189395511L;

        a() {
        }

        @Override // ej.o
        public void clear() {
            j.this.f303831a.clear();
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (j.this.f303835e) {
                return;
            }
            j.this.f303835e = true;
            j.this.r8();
            j.this.f303832b.lazySet(null);
            if (j.this.f303839i.getAndIncrement() == 0) {
                j.this.f303832b.lazySet(null);
                j.this.f303831a.clear();
            }
        }

        @Override // ej.o
        public boolean isEmpty() {
            return j.this.f303831a.isEmpty();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return j.this.f303835e;
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            j.this.f303840j = true;
            return 2;
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            return j.this.f303831a.poll();
        }
    }

    j(int i10, boolean z10) {
        this.f303831a = new io.reactivex.internal.queue.c<>(io.reactivex.internal.functions.b.h(i10, "capacityHint"));
        this.f303833c = new AtomicReference<>();
        this.f303834d = z10;
        this.f303832b = new AtomicReference<>();
        this.f303838h = new AtomicBoolean();
        this.f303839i = new a();
    }

    @cj.f
    @cj.d
    public static <T> j<T> m8() {
        return new j<>(b0.T(), true);
    }

    @cj.f
    @cj.d
    public static <T> j<T> n8(int i10) {
        return new j<>(i10, true);
    }

    @cj.f
    @cj.d
    public static <T> j<T> o8(int i10, Runnable runnable) {
        return new j<>(i10, runnable, true);
    }

    @cj.f
    @cj.d
    public static <T> j<T> p8(int i10, Runnable runnable, boolean z10) {
        return new j<>(i10, runnable, z10);
    }

    @cj.f
    @cj.d
    public static <T> j<T> q8(boolean z10) {
        return new j<>(b0.T(), z10);
    }

    @Override // io.reactivex.b0
    protected void H5(i0<? super T> i0Var) {
        if (!this.f303838h.get()) {
            int i10 = 7 >> 1;
            if (this.f303838h.compareAndSet(false, true)) {
                i0Var.d(this.f303839i);
                this.f303832b.lazySet(i0Var);
                if (this.f303835e) {
                    this.f303832b.lazySet(null);
                    return;
                } else {
                    s8();
                    return;
                }
            }
        }
        io.reactivex.internal.disposables.e.l(new IllegalStateException("Only a single observer allowed."), i0Var);
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        if (!this.f303836f && !this.f303835e) {
            return;
        }
        cVar.dispose();
    }

    @Override // io.reactivex.subjects.i
    @cj.g
    public Throwable h8() {
        if (this.f303836f) {
            return this.f303837g;
        }
        return null;
    }

    @Override // io.reactivex.subjects.i
    public boolean i8() {
        return this.f303836f && this.f303837g == null;
    }

    @Override // io.reactivex.subjects.i
    public boolean j8() {
        return this.f303832b.get() != null;
    }

    @Override // io.reactivex.subjects.i
    public boolean k8() {
        return this.f303836f && this.f303837g != null;
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        if (this.f303836f || this.f303835e) {
            return;
        }
        this.f303836f = true;
        r8();
        s8();
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f303836f || this.f303835e) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f303837g = th2;
        this.f303836f = true;
        r8();
        s8();
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        io.reactivex.internal.functions.b.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f303836f && !this.f303835e) {
            this.f303831a.offer(t10);
            s8();
        }
    }

    void r8() {
        Runnable runnable = this.f303833c.get();
        if (runnable != null && z1.a(this.f303833c, runnable, null)) {
            runnable.run();
        }
    }

    void s8() {
        if (this.f303839i.getAndIncrement() == 0) {
            i0<? super T> i0Var = this.f303832b.get();
            int iAddAndGet = 1;
            while (i0Var == null) {
                iAddAndGet = this.f303839i.addAndGet(-iAddAndGet);
                if (iAddAndGet != 0) {
                    i0Var = this.f303832b.get();
                }
            }
            if (this.f303840j) {
                t8(i0Var);
            } else {
                u8(i0Var);
            }
        }
    }

    void t8(i0<? super T> i0Var) {
        io.reactivex.internal.queue.c<T> cVar = this.f303831a;
        boolean z10 = this.f303834d;
        int iAddAndGet = 1;
        while (!this.f303835e) {
            boolean z11 = this.f303836f;
            if (!z10 && z11 && w8(cVar, i0Var)) {
                return;
            }
            i0Var.onNext(null);
            if (z11) {
                v8(i0Var);
                return;
            } else {
                iAddAndGet = this.f303839i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.f303832b.lazySet(null);
        cVar.clear();
    }

    void u8(i0<? super T> i0Var) {
        io.reactivex.internal.queue.c<T> cVar = this.f303831a;
        boolean z10 = this.f303834d;
        boolean z11 = true;
        int iAddAndGet = 1;
        while (!this.f303835e) {
            boolean z12 = this.f303836f;
            T tPoll = this.f303831a.poll();
            boolean z13 = tPoll == null;
            if (z12) {
                if (!z10 && z11) {
                    if (w8(cVar, i0Var)) {
                        return;
                    } else {
                        z11 = false;
                    }
                }
                if (z13) {
                    v8(i0Var);
                    return;
                }
            }
            if (z13) {
                iAddAndGet = this.f303839i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                i0Var.onNext(tPoll);
            }
        }
        this.f303832b.lazySet(null);
        cVar.clear();
    }

    void v8(i0<? super T> i0Var) {
        this.f303832b.lazySet(null);
        Throwable th2 = this.f303837g;
        if (th2 != null) {
            i0Var.onError(th2);
        } else {
            i0Var.onComplete();
        }
    }

    boolean w8(o<T> oVar, i0<? super T> i0Var) {
        Throwable th2 = this.f303837g;
        if (th2 == null) {
            return false;
        }
        this.f303832b.lazySet(null);
        oVar.clear();
        i0Var.onError(th2);
        return true;
    }

    j(int i10, Runnable runnable) {
        this(i10, runnable, true);
    }

    j(int i10, Runnable runnable, boolean z10) {
        this.f303831a = new io.reactivex.internal.queue.c<>(io.reactivex.internal.functions.b.h(i10, "capacityHint"));
        this.f303833c = new AtomicReference<>(io.reactivex.internal.functions.b.g(runnable, "onTerminate"));
        this.f303834d = z10;
        this.f303832b = new AtomicReference<>();
        this.f303838h = new AtomicBoolean();
        this.f303839i = new a();
    }
}
