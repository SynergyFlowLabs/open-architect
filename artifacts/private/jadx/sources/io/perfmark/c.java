package io.perfmark;

import z7.q;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f298629a;

    static {
        Object obj;
        Class<?> cls;
        a aVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th2) {
            obj = th2;
            cls = null;
        }
        if (cls != null) {
            try {
                aVar = (a) cls.asSubclass(a.class).getConstructor(e.class).newInstance(a.f298626d);
            } catch (Throwable th3) {
                obj = th3;
                aVar = null;
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            f298629a = aVar;
        } else {
            f298629a = new a(a.f298626d);
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, c.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private c() {
    }

    public static void a(e eVar) {
        f298629a.a(eVar);
    }

    public static void b(String str, long j10) {
        f298629a.b(str, j10);
    }

    public static void c(String str, long j10, long j11) {
        f298629a.c(str, j10, j11);
    }

    public static <T> void d(String str, T t10, d<? super T> dVar) {
        f298629a.d(str, t10, dVar);
    }

    public static void e(String str, String str2) {
        f298629a.e(str, str2);
    }

    public static e f() {
        return a.f298626d;
    }

    public static e g(long j10) {
        return f298629a.f("", j10);
    }

    public static e h(String str) {
        return f298629a.f(str, Long.MIN_VALUE);
    }

    public static e i(String str, long j10) {
        return f298629a.f(str, j10);
    }

    public static void j(String str) {
        f298629a.g(str);
    }

    public static void k(String str, e eVar) {
        f298629a.h(str, eVar);
    }

    public static void l(String str, String str2) {
        f298629a.i(str, str2);
    }

    @z7.e
    @Deprecated
    public static b m() {
        return a.f298627e;
    }

    public static void n(b bVar) {
        f298629a.j(bVar);
    }

    public static b o() {
        return f298629a.k();
    }

    @z7.a
    public static boolean p(boolean z10) {
        return f298629a.o(z10, false);
    }

    public static <T> void q(T t10, d<? super T> dVar) {
        f298629a.p(t10, dVar);
    }

    public static void r(String str) {
        f298629a.q(str);
    }

    public static void s(String str, e eVar) {
        f298629a.r(str, eVar);
    }

    public static void t(String str, String str2) {
        f298629a.s(str, str2);
    }

    public static void u() {
        f298629a.t();
    }

    public static void v(String str) {
        f298629a.u(str);
    }

    public static void w(String str, e eVar) {
        f298629a.v(str, eVar);
    }

    public static void x(String str, String str2) {
        f298629a.w(str, str2);
    }

    @q
    public static <T> f y(T t10, d<? super T> dVar) {
        f298629a.p(t10, dVar);
        return f.f298632a;
    }

    @q
    public static f z(String str) {
        f298629a.q(str);
        return f.f298632a;
    }
}
