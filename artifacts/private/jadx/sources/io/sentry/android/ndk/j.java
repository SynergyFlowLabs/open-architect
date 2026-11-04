package io.sentry.android.ndk;

import io.sentry.g1;
import io.sentry.n8;
import io.sentry.ndk.NativeScope;
import io.sentry.p;
import io.sentry.p9;
import io.sentry.protocol.g0;
import io.sentry.util.y;
import io.sentry.w4;
import io.sentry.y7;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class j extends w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f304654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.ndk.b f304655b;

    public j(@NotNull n8 n8Var) {
        this(n8Var, new NativeScope());
    }

    public static /* synthetic */ void o(j jVar, g0 g0Var) {
        if (g0Var == null) {
            jVar.f304655b.b();
        } else {
            jVar.f304655b.h(g0Var.l(), g0Var.j(), g0Var.m(), g0Var.o());
        }
    }

    public static /* synthetic */ void s(j jVar, io.sentry.f fVar) {
        jVar.getClass();
        String strF = null;
        String lowerCase = fVar.t() != null ? fVar.t().name().toLowerCase(Locale.ROOT) : null;
        String strH = p.h(fVar.x());
        try {
            Map<String, Object> mapS = fVar.s();
            if (!mapS.isEmpty()) {
                strF = jVar.f304654a.getSerializer().f(mapS);
            }
        } catch (Throwable th2) {
            jVar.f304654a.getLogger().b(y7.ERROR, th2, "Breadcrumb data is not serializable.", new Object[0]);
        }
        jVar.f304655b.g(lowerCase, fVar.v(), fVar.q(), fVar.z(), strH, strF);
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void a(@NotNull final String str, @NotNull final String str2) {
        try {
            this.f304654a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f304647a.f304655b.a(str, str2);
                }
            });
        } catch (Throwable th2) {
            this.f304654a.getLogger().b(y7.ERROR, th2, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void c(@NotNull final String str) {
        try {
            this.f304654a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f304650a.f304655b.c(str);
                }
            });
        } catch (Throwable th2) {
            this.f304654a.getLogger().b(y7.ERROR, th2, "Scope sync removeExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void d(@NotNull final String str, @NotNull final String str2) {
        try {
            this.f304654a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f304642a.f304655b.d(str, str2);
                }
            });
        } catch (Throwable th2) {
            this.f304654a.getLogger().b(y7.ERROR, th2, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void f(@NotNull final String str) {
        try {
            this.f304654a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f304645a.f304655b.f(str);
                }
            });
        } catch (Throwable th2) {
            this.f304654a.getLogger().b(y7.ERROR, th2, "Scope sync removeTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void j(@Nullable final g0 g0Var) {
        try {
            this.f304654a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.o(this.f304652a, g0Var);
                }
            });
        } catch (Throwable th2) {
            this.f304654a.getLogger().b(y7.ERROR, th2, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void k(@NotNull final io.sentry.f fVar) {
        try {
            this.f304654a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.d
                @Override // java.lang.Runnable
                public final void run() {
                    j.s(this.f304640a, fVar);
                }
            });
        } catch (Throwable th2) {
            this.f304654a.getLogger().b(y7.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void n(@Nullable final p9 p9Var, @NotNull g1 g1Var) {
        if (p9Var == null) {
            return;
        }
        try {
            this.f304654a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.c
                @Override // java.lang.Runnable
                public final void run() {
                    j jVar = this.f304638a;
                    p9 p9Var2 = p9Var;
                    jVar.f304655b.e(p9Var2.p().toString(), p9Var2.m().toString());
                }
            });
        } catch (Throwable th2) {
            this.f304654a.getLogger().b(y7.ERROR, th2, "Scope sync setTrace failed.", new Object[0]);
        }
    }

    j(@NotNull n8 n8Var, @NotNull io.sentry.ndk.b bVar) {
        this.f304654a = (n8) y.c(n8Var, "The SentryOptions object is required.");
        this.f304655b = (io.sentry.ndk.b) y.c(bVar, "The NativeScope object is required.");
    }
}
