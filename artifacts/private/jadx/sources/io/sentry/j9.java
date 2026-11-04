package io.sentry;

import java.util.concurrent.Callable;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class j9 {
    public static /* synthetic */ void a(i1 i1Var, Runnable runnable) {
        m1 m1VarQ0 = i1Var.q0();
        try {
            runnable.run();
            if (m1VarQ0 != null) {
                m1VarQ0.close();
            }
        } catch (Throwable th2) {
            if (m1VarQ0 != null) {
                try {
                    m1VarQ0.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static /* synthetic */ Object b(i1 i1Var, Supplier supplier) {
        m1 m1VarQ0 = i1Var.q0();
        try {
            Object obj = supplier.get();
            if (m1VarQ0 != null) {
                m1VarQ0.close();
            }
            return obj;
        } catch (Throwable th2) {
            if (m1VarQ0 != null) {
                try {
                    m1VarQ0.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static /* synthetic */ Object c(i1 i1Var, Callable callable) {
        m1 m1VarQ0 = i1Var.q0();
        try {
            Object objCall = callable.call();
            if (m1VarQ0 != null) {
                m1VarQ0.close();
            }
            return objCall;
        } catch (Throwable th2) {
            if (m1VarQ0 != null) {
                try {
                    m1VarQ0.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static <U> Callable<U> d(@NotNull final Callable<U> callable) {
        final i1 i1VarK1 = t5.R().k1("SentryWrapper.wrapCallable");
        return new Callable() { // from class: io.sentry.g9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j9.c(i1VarK1, callable);
            }
        };
    }

    public static Runnable e(@NotNull final Runnable runnable) {
        final i1 i1VarO = t5.O("SentryWrapper.wrapRunnable");
        return new Runnable() { // from class: io.sentry.i9
            @Override // java.lang.Runnable
            public final void run() {
                j9.a(i1VarO, runnable);
            }
        };
    }

    public static <U> Supplier<U> f(@NotNull final Supplier<U> supplier) {
        final i1 i1VarO = t5.O("SentryWrapper.wrapSupplier");
        return new Supplier() { // from class: io.sentry.h9
            @Override // java.util.function.Supplier
            public final Object get() {
                return j9.b(i1VarO, supplier);
            }
        };
    }
}
