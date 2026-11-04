package androidx.media3.common.util;

import android.text.TextUtils;
import android.util.Log;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f61701a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f61702b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f61703c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f61704d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f61705e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private static int f61707g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private static boolean f61708h = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f61706f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private static b f61709i = b.f61710a;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f61710a = new a();

        class a implements b {
            a() {
            }

            @Override // androidx.media3.common.util.z.b
            public void a(String str, String str2, @androidx.annotation.p0 Throwable th2) {
                z.a(str2, th2);
            }

            @Override // androidx.media3.common.util.z.b
            public void b(String str, String str2, @androidx.annotation.p0 Throwable th2) {
                z.a(str2, th2);
            }

            @Override // androidx.media3.common.util.z.b
            public void c(String str, String str2, @androidx.annotation.p0 Throwable th2) {
                z.a(str2, th2);
            }

            @Override // androidx.media3.common.util.z.b
            public void d(String str, String str2, @androidx.annotation.p0 Throwable th2) {
                z.a(str2, th2);
            }
        }

        void a(String str, String str2, @androidx.annotation.p0 Throwable th2);

        void b(String str, String str2, @androidx.annotation.p0 Throwable th2);

        void c(String str, String str2, @androidx.annotation.p0 Throwable th2);

        void d(String str, String str2, @androidx.annotation.p0 Throwable th2);
    }

    private z() {
    }

    @xl.d
    public static String a(String str, @androidx.annotation.p0 Throwable th2) {
        String strG = g(th2);
        if (!TextUtils.isEmpty(strG)) {
            str = str + "\n  " + strG.replace("\n", "\n  ") + '\n';
        }
        return str;
    }

    @xl.d
    public static void b(@androidx.annotation.d1(max = 23) String str, String str2) {
        synchronized (f61706f) {
            try {
                if (f61707g == 0) {
                    f61709i.b(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @xl.d
    public static void c(@androidx.annotation.d1(max = 23) String str, String str2, @androidx.annotation.p0 Throwable th2) {
        synchronized (f61706f) {
            try {
                if (f61707g == 0) {
                    f61709i.b(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @xl.d
    public static void d(@androidx.annotation.d1(max = 23) String str, String str2) {
        synchronized (f61706f) {
            try {
                if (f61707g <= 3) {
                    f61709i.c(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @xl.d
    public static void e(@androidx.annotation.d1(max = 23) String str, String str2, @androidx.annotation.p0 Throwable th2) {
        synchronized (f61706f) {
            try {
                if (f61707g <= 3) {
                    f61709i.c(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @xl.d
    public static int f() {
        int i10;
        synchronized (f61706f) {
            i10 = f61707g;
        }
        return i10;
    }

    @androidx.annotation.p0
    @xl.d
    public static String g(@androidx.annotation.p0 Throwable th2) {
        if (th2 == null) {
            return null;
        }
        synchronized (f61706f) {
            try {
                if (j(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (f61708h) {
                    return Log.getStackTraceString(th2).trim().replace("\t", "    ");
                }
                return th2.getMessage();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @xl.d
    public static void h(@androidx.annotation.d1(max = 23) String str, String str2) {
        synchronized (f61706f) {
            try {
                if (f61707g <= 1) {
                    f61709i.d(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @xl.d
    public static void i(@androidx.annotation.d1(max = 23) String str, String str2, @androidx.annotation.p0 Throwable th2) {
        synchronized (f61706f) {
            try {
                if (f61707g <= 1) {
                    f61709i.d(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @xl.d
    private static boolean j(@androidx.annotation.p0 Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void k(int i10) {
        synchronized (f61706f) {
            try {
                f61707g = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void l(boolean z10) {
        synchronized (f61706f) {
            try {
                f61708h = z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void m(b bVar) {
        synchronized (f61706f) {
            f61709i = bVar;
        }
    }

    @xl.d
    public static void n(@androidx.annotation.d1(max = 23) String str, String str2) {
        synchronized (f61706f) {
            try {
                if (f61707g <= 2) {
                    int i10 = 4 ^ 0;
                    f61709i.a(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @xl.d
    public static void o(@androidx.annotation.d1(max = 23) String str, String str2, @androidx.annotation.p0 Throwable th2) {
        synchronized (f61706f) {
            try {
                if (f61707g <= 2) {
                    f61709i.a(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
