package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public final class c3 {

    @com.google.common.annotations.e
    static final class a implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final s1 f119951b = new s1(a.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runtime f119952a;

        a(Runtime runtime) {
            this.f119952a = runtime;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread t10, Throwable e10) {
            try {
                f119951b.a().log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", t10), e10);
            } catch (Throwable th2) {
                try {
                    System.err.println(e10.getMessage());
                    System.err.println(th2.getMessage());
                } finally {
                    this.f119952a.exit(1);
                }
            }
            Runtime runtime = this.f119952a;
        }
    }

    private c3() {
    }

    public static Thread.UncaughtExceptionHandler a() {
        return new a(Runtime.getRuntime());
    }
}
