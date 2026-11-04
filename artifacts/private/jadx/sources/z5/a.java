package z5;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f400220a = "TRuntime.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f400221b = 23;

    private a() {
    }

    private static String a(String str, String str2) {
        String strSubstring = str + str2;
        if (strSubstring.length() > 23) {
            strSubstring = strSubstring.substring(0, 23);
        }
        return strSubstring;
    }

    public static void b(String str, String str2) {
        g(str);
    }

    public static void c(String str, String str2, Object obj) {
        if (Log.isLoggable(g(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (Log.isLoggable(g(str), 3)) {
            String.format(str2, obj, obj2);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (Log.isLoggable(g(str), 3)) {
            String.format(str2, objArr);
        }
    }

    public static void f(String str, String str2, Throwable th2) {
        g(str);
    }

    private static String g(String str) {
        return f400220a + str;
    }

    public static void h(String str, String str2, Object obj) {
        if (Log.isLoggable(g(str), 4)) {
            String.format(str2, obj);
        }
    }

    public static void i(String str, String str2, Object obj) {
        if (Log.isLoggable(g(str), 5)) {
            String.format(str2, obj);
        }
    }
}
