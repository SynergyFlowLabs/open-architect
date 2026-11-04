package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
@KeepName
@g6.a
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.v> extends com.google.android.gms.common.api.p<R> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final ThreadLocal f105940p = new u3();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f105941q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f105942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    protected final a f105943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    protected final WeakReference f105944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CountDownLatch f105945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f105946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.gms.common.api.w f105947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f105948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.gms.common.api.v f105949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Status f105950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f105951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f105952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f105953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.gms.common.internal.p f105954m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile e3 f105955n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f105956o;

    @KeepName
    private v3 resultGuardian;

    @Deprecated
    BasePendingResult() {
        this.f105942a = new Object();
        this.f105945d = new CountDownLatch(1);
        this.f105946e = new ArrayList();
        this.f105948g = new AtomicReference();
        this.f105956o = false;
        this.f105943b = new a(Looper.getMainLooper());
        this.f105944c = new WeakReference(null);
    }

    private final com.google.android.gms.common.api.v p() {
        com.google.android.gms.common.api.v vVar;
        synchronized (this.f105942a) {
            com.google.android.gms.common.internal.w.y(!this.f105951j, "Result has already been consumed.");
            com.google.android.gms.common.internal.w.y(m(), "Result is not ready.");
            vVar = this.f105949h;
            this.f105949h = null;
            this.f105947f = null;
            this.f105951j = true;
        }
        f3 f3Var = (f3) this.f105948g.getAndSet(null);
        if (f3Var != null) {
            f3Var.f106024a.f106033a.remove(this);
        }
        return (com.google.android.gms.common.api.v) com.google.android.gms.common.internal.w.r(vVar);
    }

    private final void q(com.google.android.gms.common.api.v vVar) {
        this.f105949h = vVar;
        this.f105950i = vVar.t();
        w3 w3Var = null;
        this.f105954m = null;
        this.f105945d.countDown();
        if (this.f105952k) {
            this.f105947f = null;
        } else {
            com.google.android.gms.common.api.w wVar = this.f105947f;
            if (wVar != null) {
                this.f105943b.removeMessages(2);
                this.f105943b.a(wVar, p());
            } else if (this.f105949h instanceof com.google.android.gms.common.api.r) {
                this.resultGuardian = new v3(this, w3Var);
            }
        }
        ArrayList arrayList = this.f105946e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.google.android.gms.common.api.p.a) arrayList.get(i10)).a(this.f105950i);
        }
        this.f105946e.clear();
    }

    public static void t(@androidx.annotation.p0 com.google.android.gms.common.api.v vVar) {
        if (vVar instanceof com.google.android.gms.common.api.r) {
            try {
                ((com.google.android.gms.common.api.r) vVar).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(vVar));
            }
        }
    }

    @Override // com.google.android.gms.common.api.p
    public final void c(@NonNull com.google.android.gms.common.api.p.a aVar) {
        boolean z10;
        if (aVar != null) {
            z10 = true;
            boolean z11 = true | true;
        } else {
            z10 = false;
        }
        com.google.android.gms.common.internal.w.b(z10, "Callback cannot be null.");
        synchronized (this.f105942a) {
            try {
                if (m()) {
                    aVar.a(this.f105950i);
                } else {
                    this.f105946e.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.p
    @NonNull
    public final R d() {
        com.google.android.gms.common.internal.w.q("await must not be called on the UI thread");
        boolean z10 = true | true;
        com.google.android.gms.common.internal.w.y(!this.f105951j, "Result has already been consumed");
        com.google.android.gms.common.internal.w.y(this.f105955n == null, "Cannot await if then() has been called.");
        try {
            this.f105945d.await();
        } catch (InterruptedException unused) {
            l(Status.f105887g);
        }
        com.google.android.gms.common.internal.w.y(m(), "Result is not ready.");
        return (R) p();
    }

    @Override // com.google.android.gms.common.api.p
    @NonNull
    public final R e(long j10, @NonNull TimeUnit timeUnit) {
        if (j10 > 0) {
            com.google.android.gms.common.internal.w.q("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.w.y(!this.f105951j, "Result has already been consumed.");
        com.google.android.gms.common.internal.w.y(this.f105955n == null, "Cannot await if then() has been called.");
        try {
            if (!this.f105945d.await(j10, timeUnit)) {
                l(Status.f105889i);
            }
        } catch (InterruptedException unused) {
            l(Status.f105887g);
        }
        com.google.android.gms.common.internal.w.y(m(), "Result is not ready.");
        return (R) p();
    }

    @Override // com.google.android.gms.common.api.p
    @g6.a
    public void f() {
        synchronized (this.f105942a) {
            if (!this.f105952k && !this.f105951j) {
                com.google.android.gms.common.internal.p pVar = this.f105954m;
                if (pVar != null) {
                    try {
                        pVar.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                t(this.f105949h);
                this.f105952k = true;
                q(k(Status.f105890j));
            }
        }
    }

    @Override // com.google.android.gms.common.api.p
    public final boolean g() {
        boolean z10;
        synchronized (this.f105942a) {
            try {
                z10 = this.f105952k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.common.api.p
    @g6.a
    public final void h(@androidx.annotation.p0 com.google.android.gms.common.api.w<? super R> wVar) {
        synchronized (this.f105942a) {
            try {
                if (wVar == null) {
                    this.f105947f = null;
                    return;
                }
                boolean z10 = true;
                com.google.android.gms.common.internal.w.y(!this.f105951j, "Result has already been consumed.");
                if (this.f105955n != null) {
                    z10 = false;
                }
                com.google.android.gms.common.internal.w.y(z10, "Cannot set callbacks if then() has been called.");
                if (g()) {
                    return;
                }
                if (m()) {
                    this.f105943b.a(wVar, p());
                } else {
                    this.f105947f = wVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.p
    @g6.a
    public final void i(@NonNull com.google.android.gms.common.api.w<? super R> wVar, long j10, @NonNull TimeUnit timeUnit) {
        synchronized (this.f105942a) {
            try {
                if (wVar == null) {
                    this.f105947f = null;
                    return;
                }
                boolean z10 = true;
                com.google.android.gms.common.internal.w.y(!this.f105951j, "Result has already been consumed.");
                if (this.f105955n != null) {
                    z10 = false;
                }
                com.google.android.gms.common.internal.w.y(z10, "Cannot set callbacks if then() has been called.");
                if (g()) {
                    return;
                }
                if (m()) {
                    this.f105943b.a(wVar, p());
                } else {
                    this.f105947f = wVar;
                    a aVar = this.f105943b;
                    aVar.sendMessageDelayed(aVar.obtainMessage(2, this), timeUnit.toMillis(j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.p
    @NonNull
    public final <S extends com.google.android.gms.common.api.v> com.google.android.gms.common.api.z<S> j(@NonNull com.google.android.gms.common.api.y<? super R, ? extends S> yVar) {
        com.google.android.gms.common.api.z<S> zVarC;
        com.google.android.gms.common.internal.w.y(!this.f105951j, "Result has already been consumed.");
        synchronized (this.f105942a) {
            try {
                com.google.android.gms.common.internal.w.y(this.f105955n == null, "Cannot call then() twice.");
                com.google.android.gms.common.internal.w.y(this.f105947f == null, "Cannot call then() if callbacks are set.");
                com.google.android.gms.common.internal.w.y(!this.f105952k, "Cannot call then() if result was canceled.");
                this.f105956o = true;
                this.f105955n = new e3(this.f105944c);
                zVarC = this.f105955n.c(yVar);
                if (m()) {
                    this.f105943b.a(this.f105955n, p());
                } else {
                    this.f105947f = this.f105955n;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zVarC;
    }

    @NonNull
    @g6.a
    protected abstract R k(@NonNull Status status);

    @g6.a
    @Deprecated
    public final void l(@NonNull Status status) {
        synchronized (this.f105942a) {
            try {
                if (!m()) {
                    o(k(status));
                    this.f105953l = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @g6.a
    public final boolean m() {
        return this.f105945d.getCount() == 0;
    }

    @g6.a
    protected final void n(@NonNull com.google.android.gms.common.internal.p pVar) {
        synchronized (this.f105942a) {
            this.f105954m = pVar;
        }
    }

    @g6.a
    public final void o(@NonNull R r10) {
        synchronized (this.f105942a) {
            try {
                if (this.f105953l || this.f105952k) {
                    t(r10);
                    return;
                }
                m();
                com.google.android.gms.common.internal.w.y(!m(), "Results have already been set");
                com.google.android.gms.common.internal.w.y(!this.f105951j, "Result has already been consumed");
                q(r10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s() {
        boolean z10 = true;
        if (!this.f105956o && !((Boolean) f105940p.get()).booleanValue()) {
            z10 = false;
        }
        this.f105956o = z10;
    }

    public final boolean u() {
        boolean zG;
        synchronized (this.f105942a) {
            try {
                if (((com.google.android.gms.common.api.l) this.f105944c.get()) == null || !this.f105956o) {
                    f();
                }
                zG = g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zG;
    }

    public final void v(@androidx.annotation.p0 f3 f3Var) {
        this.f105948g.set(f3Var);
    }

    @androidx.annotation.l1
    public static class a<R extends com.google.android.gms.common.api.v> extends com.google.android.gms.internal.base.q {
        public a() {
            super(Looper.getMainLooper());
        }

        public final void a(@NonNull com.google.android.gms.common.api.w wVar, @NonNull com.google.android.gms.common.api.v vVar) {
            int i10 = BasePendingResult.f105941q;
            sendMessage(obtainMessage(1, new Pair((com.google.android.gms.common.api.w) com.google.android.gms.common.internal.w.r(wVar), vVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((BasePendingResult) message.obj).l(Status.f105889i);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            com.google.android.gms.common.api.w wVar = (com.google.android.gms.common.api.w) pair.first;
            com.google.android.gms.common.api.v vVar = (com.google.android.gms.common.api.v) pair.second;
            try {
                wVar.a(vVar);
            } catch (RuntimeException e10) {
                BasePendingResult.t(vVar);
                throw e10;
            }
        }

        public a(@NonNull Looper looper) {
            super(looper);
        }
    }

    @g6.a
    @Deprecated
    protected BasePendingResult(@NonNull Looper looper) {
        this.f105942a = new Object();
        this.f105945d = new CountDownLatch(1);
        this.f105946e = new ArrayList();
        this.f105948g = new AtomicReference();
        this.f105956o = false;
        this.f105943b = new a(looper);
        this.f105944c = new WeakReference(null);
    }

    @g6.a
    protected BasePendingResult(@androidx.annotation.p0 com.google.android.gms.common.api.l lVar) {
        this.f105942a = new Object();
        this.f105945d = new CountDownLatch(1);
        this.f105946e = new ArrayList();
        this.f105948g = new AtomicReference();
        this.f105956o = false;
        this.f105943b = new a(lVar != null ? lVar.r() : Looper.getMainLooper());
        this.f105944c = new WeakReference(lVar);
    }

    @androidx.annotation.l1
    @g6.a
    protected BasePendingResult(@NonNull a<R> aVar) {
        this.f105942a = new Object();
        this.f105945d = new CountDownLatch(1);
        this.f105946e = new ArrayList();
        this.f105948g = new AtomicReference();
        this.f105956o = false;
        this.f105943b = (a) com.google.android.gms.common.internal.w.s(aVar, "CallbackHandler must not be null");
        this.f105944c = new WeakReference(null);
    }
}
