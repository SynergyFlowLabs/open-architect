package io.sentry.android.core;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.ILogger;
import io.sentry.c3;
import io.sentry.n8;
import io.sentry.y7;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class s0 implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static s0 f304498e = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile b f304500b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304499a = new io.sentry.util.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v1 f304501c = new v1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private volatile Boolean f304502d = null;

    public interface a {
        void a();

        void b();
    }

    @lm.a.c
    public final class b implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<a> f304503a = new a();

        class a extends CopyOnWriteArrayList<a> {
            a() {
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public boolean add(a aVar) {
                boolean zAdd = super.add(aVar);
                if (Boolean.FALSE.equals(s0.this.f304502d)) {
                    aVar.a();
                    return zAdd;
                }
                if (Boolean.TRUE.equals(s0.this.f304502d)) {
                    aVar.b();
                }
                return zAdd;
            }
        }

        public b() {
        }

        @lm.a.c
        @lm.n
        public List<a> a() {
            return this.f304503a;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(@NonNull androidx.lifecycle.o0 o0Var) {
            s0.this.t(false);
            Iterator<a> it = this.f304503a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(@NonNull androidx.lifecycle.o0 o0Var) {
            s0.this.t(true);
            Iterator<a> it = this.f304503a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    private s0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(@NotNull ILogger iLogger) {
        b bVar = this.f304500b;
        if (bVar != null) {
            try {
                ProcessLifecycleOwner.l().getLifecycle().c(bVar);
            } catch (Throwable th2) {
                this.f304500b = null;
                iLogger.a(y7.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th2);
            }
        }
    }

    private void f(@NotNull final ILogger iLogger) {
        if (this.f304500b == null) {
            try {
                Class.forName("androidx.lifecycle.ProcessLifecycleOwner");
                this.f304500b = new b();
                if (io.sentry.android.core.internal.util.h.h().a()) {
                    e(iLogger);
                } else {
                    this.f304501c.b(new Runnable() { // from class: io.sentry.android.core.q0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f304473a.e(iLogger);
                        }
                    });
                }
            } catch (ClassNotFoundException unused) {
                iLogger.c(y7.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
            } catch (Throwable th2) {
                iLogger.a(y7.ERROR, "AppState could not register lifecycle observer", th2);
            }
        }
    }

    @NotNull
    public static s0 g() {
        return f304498e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(@Nullable b bVar) {
        if (bVar != null) {
            ProcessLifecycleOwner.l().getLifecycle().g(bVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        x();
    }

    public void d(@NotNull a aVar) {
        io.sentry.m1 m1VarA = this.f304499a.a();
        try {
            f(c3.e());
            if (this.f304500b != null) {
                this.f304500b.f304503a.add(aVar);
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @lm.a.c
    @lm.n
    public b h() {
        return this.f304500b;
    }

    @Nullable
    public Boolean j() {
        return this.f304502d;
    }

    @lm.a.c
    public void l(@Nullable n8 n8Var) {
        if (this.f304500b != null) {
            return;
        }
        io.sentry.m1 m1VarA = this.f304499a.a();
        try {
            f(n8Var != null ? n8Var.getLogger() : c3.e());
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void m(@NotNull a aVar) {
        io.sentry.m1 m1VarA = this.f304499a.a();
        try {
            if (this.f304500b != null) {
                this.f304500b.f304503a.remove(aVar);
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @lm.a.c
    @lm.n
    public void q() {
        f304498e = new s0();
    }

    @lm.n
    void r(@NotNull v1 v1Var) {
        this.f304501c = v1Var;
    }

    void t(boolean z10) {
        this.f304502d = Boolean.valueOf(z10);
    }

    @lm.a.c
    public void x() {
        if (this.f304500b == null) {
            return;
        }
        io.sentry.m1 m1VarA = this.f304499a.a();
        try {
            final b bVar = this.f304500b;
            this.f304500b.f304503a.clear();
            this.f304500b = null;
            if (m1VarA != null) {
                m1VarA.close();
            }
            if (io.sentry.android.core.internal.util.h.h().a()) {
                o(bVar);
            } else {
                this.f304501c.b(new Runnable() { // from class: io.sentry.android.core.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f304478a.o(bVar);
                    }
                });
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
