package io.reactivex.subscribers;

import androidx.compose.animation.core.z1;
import dj.g;
import ej.l;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.k;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public class f<T> extends io.reactivex.observers.a<T, f<T>> implements q<T>, w, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final v<? super T> f303858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f303859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicReference<w> f303860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicLong f303861n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l<T> f303862o;

    enum a implements q<Object> {
        INSTANCE;

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
        }

        @Override // org.reactivestreams.v
        public void onNext(Object obj) {
        }
    }

    public f() {
        this(a.INSTANCE, Long.MAX_VALUE);
    }

    public static <T> f<T> m0() {
        return new f<>();
    }

    public static <T> f<T> n0(long j10) {
        return new f<>(j10);
    }

    public static <T> f<T> o0(v<? super T> vVar) {
        return new f<>(vVar);
    }

    static String p0(int i10) {
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

    @Override // org.reactivestreams.w
    public final void cancel() {
        if (this.f303859l) {
            return;
        }
        this.f303859l = true;
        j.b(this.f303860m);
    }

    @Override // io.reactivex.disposables.c
    public final void dispose() {
        cancel();
    }

    final f<T> g0() {
        if (this.f303862o != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    final f<T> h0(int i10) {
        int i11 = this.f303540h;
        if (i11 == i10) {
            return this;
        }
        if (this.f303862o == null) {
            throw X("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + p0(i10) + ", actual: " + p0(i11));
    }

    final f<T> i0() {
        if (this.f303862o == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    @Override // io.reactivex.observers.a
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final f<T> t() {
        if (this.f303860m.get() != null) {
            throw X("Subscribed!");
        }
        if (this.f303535c.isEmpty()) {
            return this;
        }
        throw X("Not subscribed but errors found");
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        return this.f303859l;
    }

    public final f<T> k0(g<? super f<T>> gVar) {
        try {
            gVar.accept(this);
            return this;
        } catch (Throwable th2) {
            throw k.f(th2);
        }
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public void l(w wVar) {
        this.f303537e = Thread.currentThread();
        if (wVar == null) {
            this.f303535c.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!z1.a(this.f303860m, null, wVar)) {
            wVar.cancel();
            if (this.f303860m.get() != j.CANCELLED) {
                this.f303535c.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + wVar));
            }
            return;
        }
        int i10 = this.f303539g;
        if (i10 != 0 && (wVar instanceof l)) {
            l<T> lVar = (l) wVar;
            this.f303862o = lVar;
            int iP = lVar.p(i10);
            this.f303540h = iP;
            if (iP == 1) {
                this.f303538f = true;
                this.f303537e = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f303862o.poll();
                        if (tPoll == null) {
                            this.f303536d++;
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
        this.f303858k.l(wVar);
        long andSet = this.f303861n.getAndSet(0L);
        if (andSet != 0) {
            wVar.request(andSet);
        }
        s0();
    }

    @Override // io.reactivex.observers.a
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final f<T> w() {
        if (this.f303860m.get() != null) {
            return this;
        }
        throw X("Not subscribed!");
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        if (!this.f303538f) {
            this.f303538f = true;
            if (this.f303860m.get() == null) {
                this.f303535c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f303537e = Thread.currentThread();
            this.f303536d++;
            this.f303858k.onComplete();
        } finally {
            this.f303533a.countDown();
        }
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        if (!this.f303538f) {
            this.f303538f = true;
            if (this.f303860m.get() == null) {
                this.f303535c.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f303537e = Thread.currentThread();
            this.f303535c.add(th2);
            if (th2 == null) {
                this.f303535c.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.f303858k.onError(th2);
            this.f303533a.countDown();
        } catch (Throwable th3) {
            this.f303533a.countDown();
            throw th3;
        }
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        if (!this.f303538f) {
            this.f303538f = true;
            if (this.f303860m.get() == null) {
                this.f303535c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f303537e = Thread.currentThread();
        if (this.f303540h != 2) {
            this.f303534b.add(t10);
            if (t10 == null) {
                this.f303535c.add(new NullPointerException("onNext received a null value"));
            }
            this.f303858k.onNext(t10);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f303862o.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.f303534b.add(tPoll);
                }
            } catch (Throwable th2) {
                this.f303535c.add(th2);
                this.f303862o.cancel();
                return;
            }
        }
    }

    public final boolean q0() {
        return this.f303860m.get() != null;
    }

    public final boolean r0() {
        return this.f303859l;
    }

    @Override // org.reactivestreams.w
    public final void request(long j10) {
        j.c(this.f303860m, this.f303861n, j10);
    }

    protected void s0() {
    }

    public final f<T> t0(long j10) {
        request(j10);
        return this;
    }

    final f<T> u0(int i10) {
        this.f303539g = i10;
        return this;
    }

    public f(long j10) {
        this(a.INSTANCE, j10);
    }

    public f(v<? super T> vVar) {
        this(vVar, Long.MAX_VALUE);
    }

    public f(v<? super T> vVar, long j10) {
        if (j10 >= 0) {
            this.f303858k = vVar;
            this.f303860m = new AtomicReference<>();
            this.f303861n = new AtomicLong(j10);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }
}
