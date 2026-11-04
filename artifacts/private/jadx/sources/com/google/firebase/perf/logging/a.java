package com.google.firebase.perf.logging;

import androidx.annotation.l1;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f123958c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f123959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f123960b;

    @l1
    public a(c cVar) {
        this.f123960b = false;
        this.f123959a = cVar == null ? c.c() : cVar;
    }

    public static a e() {
        if (f123958c == null) {
            synchronized (a.class) {
                try {
                    if (f123958c == null) {
                        f123958c = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f123958c;
    }

    public void a(String str) {
        if (this.f123960b) {
            this.f123959a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f123960b) {
            this.f123959a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f123960b) {
            this.f123959a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f123960b) {
            this.f123959a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f123960b) {
            this.f123959a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f123960b) {
            this.f123959a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f123960b;
    }

    public void i(boolean z10) {
        this.f123960b = z10;
    }

    public void j(String str) {
        if (this.f123960b) {
            this.f123959a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f123960b) {
            this.f123959a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void l(String str) {
        if (this.f123960b) {
            this.f123959a.f(str);
        }
    }

    public void m(String str, Object... objArr) {
        if (this.f123960b) {
            this.f123959a.f(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private a() {
        this(null);
    }
}
