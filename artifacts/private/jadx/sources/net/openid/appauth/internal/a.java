package net.openid.appauth.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import net.openid.appauth.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l1
    static final String f333064c = "AppAuth";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private static a f333065d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final b f333066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f333067b;

    /* JADX INFO: renamed from: net.openid.appauth.internal.a$a, reason: collision with other inner class name */
    private static final class C2341a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C2341a f333068a = new C2341a();

        private C2341a() {
        }

        @Override // net.openid.appauth.internal.a.b
        public boolean a(String str, int i10) {
            return Log.isLoggable(str, i10);
        }

        @Override // net.openid.appauth.internal.a.b
        public void b(int i10, String str, String str2) {
            Log.println(i10, str, str2);
        }

        @Override // net.openid.appauth.internal.a.b
        public String c(Throwable th2) {
            return Log.getStackTraceString(th2);
        }
    }

    @l1
    public interface b {
        boolean a(String str, int i10);

        void b(int i10, String str, String str2);

        String c(Throwable th2);
    }

    @l1
    a(b bVar) {
        this.f333066a = (b) t.f(bVar);
        int i10 = 7;
        while (i10 >= 2 && this.f333066a.a(f333064c, i10)) {
            i10--;
        }
        this.f333067b = i10 + 1;
    }

    public static void a(String str, Object... objArr) {
        e().h(3, null, str, objArr);
    }

    public static void b(Throwable th2, String str, Object... objArr) {
        e().h(3, th2, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        e().h(6, null, str, objArr);
    }

    public static void d(Throwable th2, String str, Object... objArr) {
        e().h(6, th2, str, objArr);
    }

    public static synchronized a e() {
        try {
            if (f333065d == null) {
                f333065d = new a(C2341a.f333068a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f333065d;
    }

    public static void f(String str, Object... objArr) {
        e().h(4, null, str, objArr);
    }

    public static void g(Throwable th2, String str, Object... objArr) {
        e().h(4, th2, str, objArr);
    }

    @l1
    public static synchronized void i(a aVar) {
        f333065d = aVar;
    }

    public static void j(String str, Object... objArr) {
        e().h(2, null, str, objArr);
    }

    public static void k(Throwable th2, String str, Object... objArr) {
        e().h(2, th2, str, objArr);
    }

    public static void l(String str, Object... objArr) {
        e().h(5, null, str, objArr);
    }

    public static void m(Throwable th2, String str, Object... objArr) {
        e().h(5, th2, str, objArr);
    }

    public void h(int i10, Throwable th2, String str, Object... objArr) {
        if (this.f333067b > i10) {
            return;
        }
        if (objArr != null && objArr.length >= 1) {
            str = String.format(str, objArr);
        }
        if (th2 != null) {
            str = str + "\n" + this.f333066a.c(th2);
        }
        this.f333066a.b(i10, f333064c, str);
    }
}
