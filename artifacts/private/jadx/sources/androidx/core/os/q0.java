package androidx.core.os;

import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48080a = "TraceCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f48081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f48082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f48083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f48084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Method f48085f;

    @w0(29)
    static class a {
        private a() {
        }

        static void a(String str, int i10) {
            Trace.beginAsyncSection(str, i10);
        }

        static void b(String str, int i10) {
            Trace.endAsyncSection(str, i10);
        }

        static boolean c() {
            return Trace.isEnabled();
        }

        static void d(String str, long j10) {
            Trace.setCounter(str, j10);
        }
    }

    private q0() {
    }

    public static void a(@NonNull String str, int i10) {
        a.a(str, i10);
    }

    public static void b(@NonNull String str) {
        Trace.beginSection(str);
    }

    public static void c(@NonNull String str, int i10) {
        a.b(str, i10);
    }

    public static void d() {
        Trace.endSection();
    }

    public static boolean e() {
        return a.c();
    }

    public static void f(@NonNull String str, int i10) {
        a.d(str, i10);
    }
}
