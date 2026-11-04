package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class ac implements l4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f109043d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f109044e = Logger.getLogger(ac.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final r4 f109045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f109046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f109047h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    volatile Object f109048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    volatile v8 f109049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    volatile yb f109050c;

    static {
        r4 xbVar;
        try {
            xbVar = new xa(AtomicReferenceFieldUpdater.newUpdater(yb.class, Thread.class, androidx.media3.exoplayer.upstream.h.f65998l), AtomicReferenceFieldUpdater.newUpdater(yb.class, yb.class, "b"), AtomicReferenceFieldUpdater.newUpdater(ac.class, yb.class, "c"), AtomicReferenceFieldUpdater.newUpdater(ac.class, v8.class, "b"), AtomicReferenceFieldUpdater.newUpdater(ac.class, Object.class, androidx.media3.exoplayer.upstream.h.f65998l));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            xbVar = new xb();
        }
        Throwable th3 = th;
        f109045f = xbVar;
        if (th3 != null) {
            f109044e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f109046g = new Object();
    }

    protected ac() {
    }

    static void b(ac acVar) {
        yb ybVar;
        v8 v8Var;
        do {
            ybVar = acVar.f109050c;
        } while (!f109045f.e(acVar, ybVar, yb.f109452c));
        while (ybVar != null) {
            Thread thread = ybVar.f109453a;
            if (thread != null) {
                ybVar.f109453a = null;
                LockSupport.unpark(thread);
            }
            ybVar = ybVar.f109454b;
        }
        do {
            v8Var = acVar.f109049b;
        } while (!f109045f.c(acVar, v8Var, v8.f109368d));
        v8 v8Var2 = null;
        while (v8Var != null) {
            v8 v8Var3 = v8Var.f109371c;
            v8Var.f109371c = v8Var2;
            v8Var2 = v8Var;
            v8Var = v8Var3;
        }
        while (v8Var2 != null) {
            Runnable runnable = v8Var2.f109369a;
            v8 v8Var4 = v8Var2.f109371c;
            if (runnable instanceof wb) {
                ac acVar2 = ((wb) runnable).f109424a;
                throw null;
            }
            e(runnable, v8Var2.f109370b);
            v8Var2 = v8Var4;
        }
    }

    private final void d(StringBuilder sb2) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    v10 = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e11.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(v10 == this ? "this future" : String.valueOf(v10));
        sb2.append("]");
    }

    private static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f109044e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    private final void f(yb ybVar) {
        ybVar.f109453a = null;
        while (true) {
            yb ybVar2 = this.f109050c;
            if (ybVar2 != yb.f109452c) {
                yb ybVar3 = null;
                while (ybVar2 != null) {
                    yb ybVar4 = ybVar2.f109454b;
                    if (ybVar2.f109453a != null) {
                        ybVar3 = ybVar2;
                    } else if (ybVar3 != null) {
                        ybVar3.f109454b = ybVar4;
                        if (ybVar3.f109453a == null) {
                        }
                    } else if (!f109045f.e(this, ybVar2, ybVar4)) {
                    }
                    ybVar2 = ybVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object g(Object obj) throws ExecutionException {
        if (obj instanceof s5) {
            Throwable th2 = ((s5) obj).f109329a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof u7) {
            throw new ExecutionException(((u7) obj).f109357a);
        }
        if (obj == f109046g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.p0
    protected String a() {
        Object obj = this.f109048a;
        if (obj instanceof wb) {
            l4 l4Var = ((wb) obj).f109425b;
            return "setFuture=[null]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean c(@androidx.annotation.p0 Object obj) {
        if (obj == null) {
            obj = f109046g;
        }
        if (!f109045f.d(this, null, obj)) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        s5 s5Var;
        Object obj = this.f109048a;
        if ((obj instanceof wb) | (obj == null)) {
            if (f109043d) {
                s5Var = new s5(z10, new CancellationException("Future.cancel() was called."));
            } else {
                s5Var = z10 ? s5.f109327b : s5.f109328c;
            }
            while (!f109045f.d(this, obj, s5Var)) {
                obj = this.f109048a;
                if (!(obj instanceof wb)) {
                }
            }
            b(this);
            if (!(obj instanceof wb)) {
                return true;
            }
            l4 l4Var = ((wb) obj).f109425b;
            throw null;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f109048a;
        if ((obj2 != null) && (!(obj2 instanceof wb))) {
            return g(obj2);
        }
        yb ybVar = this.f109050c;
        if (ybVar != yb.f109452c) {
            yb ybVar2 = new yb();
            do {
                r4 r4Var = f109045f;
                r4Var.a(ybVar2, ybVar);
                if (r4Var.e(this, ybVar, ybVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            f(ybVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f109048a;
                    } while (!((obj != null) & (!(obj instanceof wb))));
                    return g(obj);
                }
                ybVar = this.f109050c;
            } while (ybVar != yb.f109452c);
        }
        return g(this.f109048a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f109048a instanceof s5;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f109048a;
        return (obj != null) & (!(obj instanceof wb));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f109048a instanceof s5) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            d(sb2);
        } else {
            try {
                strConcat = a();
            } catch (RuntimeException e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strConcat);
                sb2.append("]");
            } else if (isDone()) {
                d(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void u0(Runnable runnable, Executor executor) {
        executor.getClass();
        v8 v8Var = this.f109049b;
        if (v8Var != v8.f109368d) {
            v8 v8Var2 = new v8(runnable, executor);
            do {
                v8Var2.f109371c = v8Var;
                if (f109045f.c(this, v8Var, v8Var2)) {
                    return;
                } else {
                    v8Var = this.f109049b;
                }
            } while (v8Var != v8.f109368d);
        }
        e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f109048a;
            boolean z10 = true;
            if ((obj != null) & (!(obj instanceof wb))) {
                return g(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                yb ybVar = this.f109050c;
                if (ybVar != yb.f109452c) {
                    yb ybVar2 = new yb();
                    while (true) {
                        r4 r4Var = f109045f;
                        r4Var.a(ybVar2, ybVar);
                        if (r4Var.e(this, ybVar, ybVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f109048a;
                                    if ((obj2 != null) & (!(obj2 instanceof wb))) {
                                        return g(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    f(ybVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(ybVar2);
                            break;
                        }
                        ybVar = this.f109050c;
                        if (ybVar == yb.f109452c) {
                        }
                    }
                }
                return g(this.f109048a);
            }
            while (nanos > 0) {
                Object obj3 = this.f109048a;
                if ((obj3 != null) & (!(obj3 instanceof wb))) {
                    return g(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j11 = -nanos;
                long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z10 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z10) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z10) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(strConcat + " for " + string);
        }
        throw new InterruptedException();
    }
}
