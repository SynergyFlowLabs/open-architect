package io.reactivex.observers;

import androidx.compose.animation.core.z1;
import io.reactivex.i0;
import io.reactivex.n0;
import io.reactivex.v;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public class n<T> extends io.reactivex.observers.a<T, n<T>> implements i0<T>, io.reactivex.disposables.c, v<T>, n0<T>, io.reactivex.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i0<? super T> f303573k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicReference<io.reactivex.disposables.c> f303574l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ej.j<T> f303575m;

    enum a implements i0<Object> {
        INSTANCE;

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
        }

        @Override // io.reactivex.i0
        public void onComplete() {
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
        }

        @Override // io.reactivex.i0
        public void onNext(Object obj) {
        }
    }

    public n() {
        this(a.INSTANCE);
    }

    public static <T> n<T> m0() {
        return new n<>();
    }

    public static <T> n<T> n0(i0<? super T> i0Var) {
        return new n<>(i0Var);
    }

    static String o0(int i10) {
        if (i10 == 0) {
            return "NONE";
        }
        if (i10 == 1) {
            return com.google.api.client.googleapis.notifications.c.f115468a;
        }
        if (i10 == 2) {
            return "ASYNC";
        }
        return "Unknown(" + i10 + ")";
    }

    @Override // io.reactivex.v
    public void b(T t10) {
        onNext(t10);
        onComplete();
    }

    public final void cancel() {
        dispose();
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        this.f303537e = Thread.currentThread();
        if (cVar == null) {
            this.f303535c.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!z1.a(this.f303574l, null, cVar)) {
            cVar.dispose();
            if (this.f303574l.get() != io.reactivex.internal.disposables.d.DISPOSED) {
                this.f303535c.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + cVar));
            }
            return;
        }
        int i10 = this.f303539g;
        if (i10 != 0 && (cVar instanceof ej.j)) {
            ej.j<T> jVar = (ej.j) cVar;
            this.f303575m = jVar;
            int iP = jVar.p(i10);
            this.f303540h = iP;
            if (iP == 1) {
                this.f303538f = true;
                this.f303537e = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f303575m.poll();
                        if (tPoll == null) {
                            this.f303536d++;
                            this.f303574l.lazySet(io.reactivex.internal.disposables.d.DISPOSED);
                            return;
                        }
                        this.f303534b.add(tPoll);
                    } catch (Throwable th2) {
                        this.f303535c.add(th2);
                        return;
                    }
                }
            }
        }
        this.f303573k.d(cVar);
    }

    @Override // io.reactivex.disposables.c
    public final void dispose() {
        io.reactivex.internal.disposables.d.b(this.f303574l);
    }

    final n<T> g0() {
        if (this.f303575m != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    final n<T> h0(int i10) {
        int i11 = this.f303540h;
        if (i11 == i10) {
            return this;
        }
        if (this.f303575m == null) {
            throw X("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + o0(i10) + ", actual: " + o0(i11));
    }

    final n<T> i0() {
        if (this.f303575m == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    @Override // io.reactivex.observers.a
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final n<T> t() {
        if (this.f303574l.get() != null) {
            throw X("Subscribed!");
        }
        if (this.f303535c.isEmpty()) {
            return this;
        }
        throw X("Not subscribed but errors found");
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        return io.reactivex.internal.disposables.d.c(this.f303574l.get());
    }

    public final n<T> k0(dj.g<? super n<T>> gVar) {
        try {
            gVar.accept(this);
            return this;
        } catch (Throwable th2) {
            throw io.reactivex.internal.util.k.f(th2);
        }
    }

    @Override // io.reactivex.observers.a
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final n<T> w() {
        if (this.f303574l.get() != null) {
            return this;
        }
        throw X("Not subscribed!");
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        if (!this.f303538f) {
            this.f303538f = true;
            if (this.f303574l.get() == null) {
                this.f303535c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f303537e = Thread.currentThread();
            this.f303536d++;
            this.f303573k.onComplete();
            this.f303533a.countDown();
        } catch (Throwable th2) {
            this.f303533a.countDown();
            throw th2;
        }
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        if (!this.f303538f) {
            this.f303538f = true;
            if (this.f303574l.get() == null) {
                this.f303535c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f303537e = Thread.currentThread();
            if (th2 == null) {
                this.f303535c.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f303535c.add(th2);
            }
            this.f303573k.onError(th2);
        } finally {
            this.f303533a.countDown();
        }
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        if (!this.f303538f) {
            this.f303538f = true;
            if (this.f303574l.get() == null) {
                this.f303535c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f303537e = Thread.currentThread();
        if (this.f303540h != 2) {
            this.f303534b.add(t10);
            if (t10 == null) {
                this.f303535c.add(new NullPointerException("onNext received a null value"));
            }
            this.f303573k.onNext(t10);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f303575m.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.f303534b.add(tPoll);
                }
            } catch (Throwable th2) {
                this.f303535c.add(th2);
                this.f303575m.dispose();
                return;
            }
        }
    }

    public final boolean p0() {
        return this.f303574l.get() != null;
    }

    public final boolean q0() {
        return k();
    }

    final n<T> r0(int i10) {
        this.f303539g = i10;
        return this;
    }

    public n(i0<? super T> i0Var) {
        this.f303574l = new AtomicReference<>();
        this.f303573k = i0Var;
    }
}
