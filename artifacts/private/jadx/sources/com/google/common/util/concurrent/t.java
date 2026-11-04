package com.google.common.util.concurrent;

import com.google.common.collect.h6;
import com.google.common.collect.nb;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b
abstract class t<InputT, OutputT> extends u<OutputT> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final s1 f120325s = new s1(t.class);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @a8.b
    @fj.a
    private h6<? extends t1<? extends InputT>> f120326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f120327n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f120328o;

    enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    t(h6<? extends t1<? extends InputT>> futures, boolean allMustSucceed, boolean collectsValues) {
        super(futures.size());
        this.f120326m = (h6) com.google.common.base.j0.E(futures);
        this.f120327n = allMustSucceed;
        this.f120328o = collectsValues;
    }

    private static boolean O(Set<Throwable> seen, Throwable param) {
        while (param != null) {
            if (!seen.add(param)) {
                return false;
            }
            param = param.getCause();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Q(int index, Future<? extends InputT> future) {
        try {
            P(index, f3.f(future));
        } catch (ExecutionException e10) {
            T(e10.getCause());
        } catch (Throwable th2) {
            T(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(@fj.a h6<? extends Future<? extends InputT>> futuresIfNeedToCollectAtCompletion) {
        int iK = K();
        com.google.common.base.j0.h0(iK >= 0, "Less than 0 remaining futures");
        if (iK == 0) {
            X(futuresIfNeedToCollectAtCompletion);
        }
    }

    private void T(Throwable throwable) {
        com.google.common.base.j0.E(throwable);
        if (this.f120327n && !C(throwable) && O(L(), throwable)) {
            V(throwable);
        } else {
            if (throwable instanceof Error) {
                V(throwable);
            }
        }
    }

    private static void V(Throwable throwable) {
        f120325s.a().log(Level.SEVERE, throwable instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int index, t1<? extends InputT> future) {
        try {
            if (future.isCancelled()) {
                this.f120326m = null;
                cancel(false);
            } else {
                Q(index, future);
            }
        } finally {
            R(null);
        }
    }

    private void X(@fj.a h6<? extends Future<? extends InputT>> futuresIfNeedToCollectAtCompletion) {
        if (futuresIfNeedToCollectAtCompletion != null) {
            nb<? extends Future<? extends InputT>> it = futuresIfNeedToCollectAtCompletion.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    Q(i10, next);
                }
                i10++;
            }
        }
        J();
        S();
        Y(a.ALL_INPUT_FUTURES_PROCESSED);
    }

    @Override // com.google.common.util.concurrent.u
    final void I(Set<Throwable> seen) {
        com.google.common.base.j0.E(seen);
        if (!isCancelled()) {
            Throwable thA = a();
            Objects.requireNonNull(thA);
            O(seen, thA);
        }
    }

    abstract void P(int index, @d2 InputT returnValue);

    abstract void S();

    final void U() {
        Objects.requireNonNull(this.f120326m);
        if (this.f120326m.isEmpty()) {
            S();
            return;
        }
        if (!this.f120327n) {
            final h6<? extends t1<? extends InputT>> h6Var = this.f120328o ? this.f120326m : null;
            Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120301a.R(h6Var);
                }
            };
            nb<? extends t1<? extends InputT>> it = this.f120326m.iterator();
            while (it.hasNext()) {
                t1<? extends InputT> next = it.next();
                if (next.isDone()) {
                    R(h6Var);
                } else {
                    next.m0(runnable, a2.c());
                }
            }
            return;
        }
        nb<? extends t1<? extends InputT>> it2 = this.f120326m.iterator();
        final int i10 = 0;
        while (it2.hasNext()) {
            final t1<? extends InputT> next2 = it2.next();
            int i11 = i10 + 1;
            if (next2.isDone()) {
                W(i10, next2);
            } else {
                next2.m0(new Runnable() { // from class: com.google.common.util.concurrent.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f120287a.W(i10, next2);
                    }
                }, a2.c());
            }
            i10 = i11;
        }
    }

    @z7.g
    @z7.s
    void Y(a reason) {
        com.google.common.base.j0.E(reason);
        this.f120326m = null;
    }

    @Override // com.google.common.util.concurrent.f
    protected final void m() {
        super.m();
        h6<? extends t1<? extends InputT>> h6Var = this.f120326m;
        Y(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() & (h6Var != null)) {
            boolean zE = E();
            nb<? extends t1<? extends InputT>> it = h6Var.iterator();
            while (it.hasNext()) {
                it.next().cancel(zE);
            }
        }
    }

    @Override // com.google.common.util.concurrent.f
    @fj.a
    protected final String y() {
        h6<? extends t1<? extends InputT>> h6Var = this.f120326m;
        if (h6Var == null) {
            return super.y();
        }
        return "futures=" + h6Var;
    }
}
