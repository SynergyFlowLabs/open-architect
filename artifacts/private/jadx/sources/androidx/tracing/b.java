package androidx.tracing;

import android.os.Build;
import android.os.Trace;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f75476a = "Trace";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f75477b = 127;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f75478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f75479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f75480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Method f75481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Method f75482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f75483h;

    private b() {
    }

    public static void a(@NonNull String str, int i10) {
        d.a(m(str), i10);
    }

    private static void b(@NonNull String str, int i10) {
        try {
            if (f75480e == null) {
                f75480e = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f75480e.invoke(null, Long.valueOf(f75478c), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            h("asyncTraceBegin", e10);
        }
    }

    public static void c(@NonNull String str) {
        c.a(m(str));
    }

    public static void d(@NonNull String str, int i10) {
        d.b(m(str), i10);
    }

    private static void e(@NonNull String str, int i10) {
        try {
            if (f75481f == null) {
                f75481f = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f75481f.invoke(null, Long.valueOf(f75478c), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            h("asyncTraceEnd", e10);
        }
    }

    public static void f() {
        c.b();
    }

    public static void g() {
        if (Build.VERSION.SDK_INT < 31) {
            try {
                if (f75483h) {
                    return;
                }
                f75483h = true;
                Trace.class.getMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, Boolean.TRUE);
            } catch (Exception e10) {
                h("setAppTracingAllowed", e10);
            }
        }
    }

    private static void h(@NonNull String str, @NonNull Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean i() {
        return d.c();
    }

    private static boolean j() {
        try {
            if (f75479d == null) {
                f75478c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f75479d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f75479d.invoke(null, Long.valueOf(f75478c))).booleanValue();
        } catch (Exception e10) {
            h("isTagEnabled", e10);
            return false;
        }
    }

    public static void k(@NonNull String str, int i10) {
        d.d(m(str), i10);
    }

    private static void l(@NonNull String str, int i10) {
        try {
            if (f75482g == null) {
                f75482g = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f75482g.invoke(null, Long.valueOf(f75478c), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            h("traceCounter", e10);
        }
    }

    @NonNull
    private static String m(@NonNull String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
