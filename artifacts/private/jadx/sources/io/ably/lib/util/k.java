package io.ably.lib.util;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes13.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f288236a = 99;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f288237b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f288238c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f288239d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f288240e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f288241f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f288242g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f288243h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f288244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static b f288245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String[] f288246k;

    public static class a implements b {
        @Override // io.ably.lib.util.k.b
        public void a(int i10, String str, String str2, Throwable th2) {
            b(System.out, i10, str, str2, th2);
        }

        protected void b(PrintStream printStream, int i10, String str, String str2, Throwable th2) {
            printStream.print("(" + k.f288246k[i10] + "): ");
            if (str != null && str.length() != 0) {
                printStream.print(str + ": ");
            }
            if (str2 != null && str2.length() != 0) {
                printStream.print(str2);
            }
            printStream.println();
            if (th2 != null) {
                th2.printStackTrace(printStream);
            }
        }
    }

    public interface b {
        void a(int i10, String str, String str2, Throwable th2);
    }

    static {
        a aVar = new a();
        f288244i = aVar;
        f288245j = aVar;
        f288246k = new String[]{"", "", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "ASSERT"};
    }

    public static int b(String str, String str2) {
        h(3, str, str2, null);
        return 0;
    }

    public static int c(String str, String str2, Throwable th2) {
        h(3, str, str2, th2);
        return 0;
    }

    public static int d(String str, String str2) {
        h(6, str, str2, null);
        return 0;
    }

    public static int e(String str, String str2, Throwable th2) {
        h(6, str, str2, th2);
        return 0;
    }

    public static int f(String str, String str2) {
        h(4, str, str2, null);
        return 0;
    }

    public static int g(String str, String str2, Throwable th2) {
        h(4, str, str2, th2);
        return 0;
    }

    private static void h(int i10, String str, String str2, Throwable th2) {
        if (i10 >= f288243h) {
            f288245j.a(i10, str, str2, th2);
        }
    }

    public static void i(b bVar) {
        if (bVar == null) {
            bVar = f288244i;
        }
        f288245j = bVar;
    }

    public static void j(int i10) {
        if (i10 == 0) {
            i10 = 5;
        }
        f288243h = i10;
    }

    public static int k(String str, String str2) {
        h(2, str, str2, null);
        return 0;
    }

    public static int l(String str, String str2, Throwable th2) {
        h(2, str, str2, th2);
        return 0;
    }

    public static int m(String str, String str2) {
        h(5, str, str2, null);
        return 0;
    }

    public static int n(String str, String str2, Throwable th2) {
        h(5, str, str2, th2);
        return 0;
    }

    public static int o(String str, Throwable th2) {
        h(5, str, null, th2);
        return 0;
    }
}
