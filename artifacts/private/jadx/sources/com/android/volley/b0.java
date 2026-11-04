package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f89375a = "Volley";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f89376b = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f89377c = b0.class.getName();

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final boolean f89378c = b0.f89376b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f89379d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C0830a> f89380a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f89381b = false;

        /* JADX INFO: renamed from: com.android.volley.b0$a$a, reason: collision with other inner class name */
        private static class C0830a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f89382a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f89383b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f89384c;

            public C0830a(String str, long j10, long j11) {
                this.f89382a = str;
                this.f89383b = j10;
                this.f89384c = j11;
            }
        }

        a() {
        }

        private long c() {
            if (this.f89380a.size() == 0) {
                return 0L;
            }
            long j10 = this.f89380a.get(0).f89384c;
            List<C0830a> list = this.f89380a;
            return list.get(list.size() - 1).f89384c - j10;
        }

        public synchronized void a(String str, long j10) {
            try {
                if (this.f89381b) {
                    throw new IllegalStateException("Marker added to finished log");
                }
                this.f89380a.add(new C0830a(str, j10, SystemClock.elapsedRealtime()));
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void b(String str) {
            try {
                this.f89381b = true;
                long jC = c();
                if (jC <= 0) {
                    return;
                }
                long j10 = this.f89380a.get(0).f89384c;
                b0.b("(%-4d ms) %s", Long.valueOf(jC), str);
                for (C0830a c0830a : this.f89380a) {
                    long j11 = c0830a.f89384c;
                    b0.b("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(c0830a.f89383b), c0830a.f89382a);
                    j10 = j11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        protected void finalize() throws Throwable {
            if (this.f89381b) {
                return;
            }
            b("Request on the loose");
            b0.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i10 = 2; i10 < stackTrace.length; i10++) {
            if (!stackTrace[i10].getClassName().equals(f89377c)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i10].getMethodName();
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
            }
        }
        str2 = "<unknown>";
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void b(String str, Object... objArr) {
        a(str, objArr);
    }

    public static void c(String str, Object... objArr) {
        a(str, objArr);
    }

    public static void d(Throwable th2, String str, Object... objArr) {
        a(str, objArr);
    }

    public static void e(String str) {
        b("Changing log tag to %s", str);
        f89375a = str;
        f89376b = Log.isLoggable(str, 2);
    }

    public static void f(String str, Object... objArr) {
        if (f89376b) {
            a(str, objArr);
        }
    }

    public static void g(String str, Object... objArr) {
        Log.wtf(f89375a, a(str, objArr));
    }

    public static void h(Throwable th2, String str, Object... objArr) {
        Log.wtf(f89375a, a(str, objArr), th2);
    }
}
