package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n3<V> extends a5 implements l4<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f109229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final k4 f109230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c3 f109231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f109232g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.a
    private volatile Object f109233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private volatile f3 f109234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.a
    private volatile m3 f109235c;

    static {
        boolean z10;
        Throwable th2;
        Throwable th3;
        c3 i3Var;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f109229d = z10;
        f109230e = new k4(n3.class);
        s3 s3Var = null;
        try {
            i3Var = new l3(s3Var);
            th3 = null;
            th2 = null;
        } catch (Error | Exception e10) {
            try {
                th2 = e10;
                i3Var = new g3(AtomicReferenceFieldUpdater.newUpdater(m3.class, Thread.class, androidx.media3.exoplayer.upstream.h.f65998l), AtomicReferenceFieldUpdater.newUpdater(m3.class, m3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(n3.class, m3.class, "c"), AtomicReferenceFieldUpdater.newUpdater(n3.class, f3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(n3.class, Object.class, androidx.media3.exoplayer.upstream.h.f65998l));
                th3 = null;
            } catch (Error | Exception e11) {
                th2 = e10;
                th3 = e11;
                i3Var = new i3(s3Var);
            }
        }
        f109231f = i3Var;
        if (th3 != null) {
            k4 k4Var = f109230e;
            Logger loggerA = k4Var.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            k4Var.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f109232g = new Object();
    }

    protected n3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object q(l4 l4Var) {
        Throwable thA;
        if (l4Var instanceof j3) {
            Object d3Var = ((n3) l4Var).f109233a;
            if (d3Var instanceof d3) {
                d3 d3Var2 = (d3) d3Var;
                if (d3Var2.f109100a) {
                    Throwable th2 = d3Var2.f109101b;
                    d3Var = th2 != null ? new d3(false, th2) : d3.f109099d;
                }
            }
            Objects.requireNonNull(d3Var);
            return d3Var;
        }
        if ((l4Var instanceof a5) && (thA = ((a5) l4Var).a()) != null) {
            return new e3(thA);
        }
        boolean zIsCancelled = l4Var.isCancelled();
        if ((!f109229d) && zIsCancelled) {
            d3 d3Var3 = d3.f109099d;
            Objects.requireNonNull(d3Var3);
            return d3Var3;
        }
        try {
            Object objR = r(l4Var);
            if (!zIsCancelled) {
                return objR == null ? f109232g : objR;
            }
            return new d3(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(l4Var)));
        } catch (Error | Exception e10) {
            return new e3(e10);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new e3(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(l4Var)), e11)) : new d3(false, e11);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new d3(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(l4Var)), e12)) : new e3(e12.getCause());
        }
    }

    private static Object r(Future future) throws ExecutionException {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void s(StringBuilder sb2) {
        try {
            Object objR = r(this);
            sb2.append("SUCCESS, result=[");
            if (objR == null) {
                sb2.append(AbstractJsonLexerKt.NULL);
            } else if (objR == this) {
                sb2.append("this future");
            } else {
                sb2.append(objR.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objR)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private final void t(StringBuilder sb2) {
        String strConcat;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f109233a;
        if (obj instanceof h3) {
            sb2.append(", setFuture=[");
            u(sb2, ((h3) obj).f109143b);
            sb2.append("]");
        } else {
            try {
                strConcat = g();
                if (strConcat == null || strConcat.isEmpty()) {
                    strConcat = null;
                }
            } catch (Exception | StackOverflowError e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null) {
                sb2.append(", info=[");
                sb2.append(strConcat);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            s(sb2);
        }
    }

    private final void u(StringBuilder sb2, @fj.a Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (Exception | StackOverflowError e10) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e10.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v(n3 n3Var, boolean z10) {
        f3 f3Var = null;
        while (true) {
            for (m3 m3VarB = f109231f.b(n3Var, m3.f109202c); m3VarB != null; m3VarB = m3VarB.f109204b) {
                Thread thread = m3VarB.f109203a;
                if (thread != null) {
                    m3VarB.f109203a = null;
                    LockSupport.unpark(thread);
                }
            }
            n3Var.l();
            f3 f3Var2 = f3Var;
            f3 f3VarA = f109231f.a(n3Var, f3.f109114d);
            f3 f3Var3 = f3Var2;
            while (f3VarA != null) {
                f3 f3Var4 = f3VarA.f109117c;
                f3VarA.f109117c = f3Var3;
                f3Var3 = f3VarA;
                f3VarA = f3Var4;
            }
            while (f3Var3 != null) {
                Runnable runnable = f3Var3.f109115a;
                f3 f3Var5 = f3Var3.f109117c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof h3) {
                    h3 h3Var = (h3) runnable2;
                    n3Var = h3Var.f109142a;
                    if (n3Var.f109233a == h3Var) {
                        if (f109231f.f(n3Var, h3Var, q(h3Var.f109143b))) {
                            f3Var = f3Var5;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = f3Var3.f109116b;
                    Objects.requireNonNull(executor);
                    w(runnable2, executor);
                }
                f3Var3 = f3Var5;
            }
            return;
        }
    }

    private static void w(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f109230e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    private final void x(m3 m3Var) {
        m3Var.f109203a = null;
        while (true) {
            m3 m3Var2 = this.f109235c;
            if (m3Var2 != m3.f109202c) {
                m3 m3Var3 = null;
                while (m3Var2 != null) {
                    m3 m3Var4 = m3Var2.f109204b;
                    if (m3Var2.f109203a != null) {
                        m3Var3 = m3Var2;
                    } else if (m3Var3 != null) {
                        m3Var3.f109204b = m3Var4;
                        if (m3Var3.f109203a == null) {
                        }
                    } else if (!f109231f.g(this, m3Var2, m3Var4)) {
                    }
                    m3Var2 = m3Var4;
                }
                return;
            }
            return;
        }
    }

    private static final Object y(Object obj) throws ExecutionException {
        if (obj instanceof d3) {
            Throwable th2 = ((d3) obj).f109101b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof e3) {
            throw new ExecutionException(((e3) obj).f109108a);
        }
        if (obj == f109232g) {
            obj = null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.a5
    @fj.a
    protected final Throwable a() {
        if (this instanceof j3) {
            Object obj = this.f109233a;
            if (obj instanceof e3) {
                return ((e3) obj).f109108a;
            }
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        d3 d3Var;
        Object obj = this.f109233a;
        if (!(obj instanceof h3) && !(obj == null)) {
            return false;
        }
        if (f109229d) {
            d3Var = new d3(z10, new CancellationException("Future.cancel() was called."));
        } else {
            d3Var = z10 ? d3.f109098c : d3.f109099d;
            Objects.requireNonNull(d3Var);
        }
        boolean z11 = false;
        while (true) {
            if (f109231f.f(this, obj, d3Var)) {
                v(this, z10);
                if (obj instanceof h3) {
                    l4<? extends V> l4Var = ((h3) obj).f109143b;
                    if (l4Var instanceof j3) {
                        this = (n3) l4Var;
                        obj = this.f109233a;
                        if (!(obj == null) && !(obj instanceof h3)) {
                            return true;
                        }
                        z11 = true;
                    } else {
                        l4Var.cancel(z10);
                    }
                }
                return true;
            }
            obj = this.f109233a;
            if (!(obj instanceof h3)) {
                return z11;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fj.a
    protected String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f109233a;
        if ((obj2 != null) && (!(obj2 instanceof h3))) {
            return y(obj2);
        }
        m3 m3Var = this.f109235c;
        if (m3Var != m3.f109202c) {
            m3 m3Var2 = new m3();
            do {
                c3 c3Var = f109231f;
                c3Var.c(m3Var2, m3Var);
                if (c3Var.g(this, m3Var, m3Var2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            x(m3Var2);
                            throw new InterruptedException();
                        }
                        obj = this.f109233a;
                    } while (!((obj != null) & (!(obj instanceof h3))));
                    return y(obj);
                }
                m3Var = this.f109235c;
            } while (m3Var != m3.f109202c);
        }
        Object obj3 = this.f109233a;
        Objects.requireNonNull(obj3);
        return y(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f109233a instanceof d3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f109233a;
        return (obj != null) & (!(obj instanceof h3));
    }

    protected void l() {
    }

    protected final boolean m(Object obj) {
        if (obj == null) {
            obj = f109232g;
        }
        if (!f109231f.f(this, null, obj)) {
            return false;
        }
        v(this, false);
        return true;
    }

    protected final boolean n(Throwable th2) {
        if (!f109231f.f(this, null, new e3(th2))) {
            return false;
        }
        v(this, false);
        return true;
    }

    protected final boolean o(l4 l4Var) {
        e3 e3Var;
        Object obj = this.f109233a;
        if (obj == null) {
            if (l4Var.isDone()) {
                if (!f109231f.f(this, null, q(l4Var))) {
                    return false;
                }
                v(this, false);
                return true;
            }
            h3 h3Var = new h3(this, l4Var);
            if (f109231f.f(this, null, h3Var)) {
                try {
                    l4Var.u0(h3Var, u3.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        e3Var = new e3(th2);
                    } catch (Error | Exception unused) {
                        e3Var = e3.f109107b;
                    }
                    f109231f.f(this, h3Var, e3Var);
                }
                return true;
            }
            obj = this.f109233a;
        }
        if (obj instanceof d3) {
            l4Var.cancel(((d3) obj).f109100a);
        }
        return false;
    }

    protected final boolean p() {
        Object obj = this.f109233a;
        if (!(obj instanceof d3) || !((d3) obj).f109100a) {
            return false;
        }
        boolean z10 = !true;
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.f109233a instanceof d3) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            s(sb2);
        } else {
            t(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void u0(Runnable runnable, Executor executor) {
        f3 f3Var;
        g0.c(executor, "Executor was null.");
        if (!isDone() && (f3Var = this.f109234b) != f3.f109114d) {
            f3 f3Var2 = new f3(runnable, executor);
            do {
                f3Var2.f109117c = f3Var;
                if (f109231f.e(this, f3Var, f3Var2)) {
                    return;
                } else {
                    f3Var = this.f109234b;
                }
            } while (f3Var != f3.f109114d);
        }
        w(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f109233a;
            boolean z10 = true;
            if ((obj != null) & (!(obj instanceof h3))) {
                return y(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                m3 m3Var = this.f109235c;
                if (m3Var != m3.f109202c) {
                    m3 m3Var2 = new m3();
                    while (true) {
                        c3 c3Var = f109231f;
                        c3Var.c(m3Var2, m3Var);
                        if (c3Var.g(this, m3Var, m3Var2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f109233a;
                                    if ((obj2 != null) & (!(obj2 instanceof h3))) {
                                        return y(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    x(m3Var2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            x(m3Var2);
                            break;
                        }
                        m3Var = this.f109235c;
                        if (m3Var == m3.f109202c) {
                        }
                    }
                }
                Object obj3 = this.f109233a;
                Objects.requireNonNull(obj3);
                return y(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f109233a;
                if ((obj4 != null) & (!(obj4 instanceof h3))) {
                    return y(obj4);
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
