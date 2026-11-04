package io.sentry.cache;

import io.sentry.g1;
import io.sentry.n8;
import io.sentry.p9;
import io.sentry.protocol.g0;
import io.sentry.w4;
import io.sentry.y7;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class w extends w4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f305255c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f305256d = ".scope-cache";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f305257e = "user.json";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f305258f = "breadcrumbs.json";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f305259g = "tags.json";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f305260h = "extras.json";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f305261i = "contexts.json";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f305262j = "request.json";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f305263k = "level.json";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f305264l = "fingerprint.json";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f305265m = "transaction.json";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f305266n = "trace.json";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f305267o = "replay.json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private n8 f305268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.s<io.sentry.cache.tape.c<io.sentry.f>> f305269b = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.cache.p
        @Override // io.sentry.util.s.a
        public final Object a() {
            return w.y(this.f305211a);
        }
    });

    class a implements io.sentry.cache.tape.c.a<io.sentry.f> {
        a() {
        }

        @Override // io.sentry.cache.tape.c.a
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public io.sentry.f b(byte[] bArr) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), w.f305255c));
                try {
                    io.sentry.f fVar = (io.sentry.f) w.this.f305268a.getSerializer().c(bufferedReader, io.sentry.f.class);
                    bufferedReader.close();
                    return fVar;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                w.this.f305268a.getLogger().b(y7.ERROR, th4, "Error reading entity from scope cache", new Object[0]);
                return null;
            }
        }

        @Override // io.sentry.cache.tape.c.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(io.sentry.f fVar, OutputStream outputStream) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, w.f305255c));
            try {
                w.this.f305268a.getSerializer().a(fVar, bufferedWriter);
                bufferedWriter.close();
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public w(@NotNull n8 n8Var) {
        this.f305268a = n8Var;
    }

    public static /* synthetic */ void B(w wVar, Runnable runnable) {
        wVar.getClass();
        try {
            runnable.run();
        } catch (Throwable th2) {
            wVar.f305268a.getLogger().a(y7.ERROR, "Serialization task failed", th2);
        }
    }

    public static /* synthetic */ void D(w wVar, io.sentry.f fVar) {
        wVar.getClass();
        try {
            wVar.f305269b.a().c(fVar);
        } catch (IOException e10) {
            wVar.f305268a.getLogger().a(y7.ERROR, "Failed to add breadcrumb to file queue", e10);
        }
    }

    private void G(@NotNull String str) {
        d.a(this.f305268a, f305256d, str);
    }

    private void J(@NotNull final Runnable runnable) {
        if (this.f305268a.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    this.f305268a.getLogger().a(y7.ERROR, "Serialization task failed", th2);
                    return;
                }
            }
            try {
                this.f305268a.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.B(this.f305214a, runnable);
                    }
                });
            } catch (Throwable th3) {
                this.f305268a.getLogger().a(y7.ERROR, "Serialization task could not be scheduled", th3);
            }
        }
    }

    public static <T> void K(@NotNull n8 n8Var, @NotNull T t10, @NotNull String str) {
        d.d(n8Var, t10, f305256d, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void L(@NotNull T t10, @NotNull String str) {
        K(this.f305268a, t10, str);
    }

    public static /* synthetic */ void p(w wVar, p9 p9Var, g1 g1Var) {
        if (p9Var != null) {
            wVar.L(p9Var, f305266n);
        } else {
            wVar.getClass();
            wVar.L(g1Var.c0().o(), f305266n);
        }
    }

    public static /* synthetic */ void q(w wVar, g0 g0Var) {
        if (g0Var == null) {
            wVar.G(f305257e);
        } else {
            wVar.L(g0Var, f305257e);
        }
    }

    public static /* synthetic */ void v(w wVar) {
        wVar.getClass();
        try {
            wVar.f305269b.a().clear();
        } catch (IOException e10) {
            wVar.f305268a.getLogger().a(y7.ERROR, "Failed to clear breadcrumbs from file queue", e10);
        }
    }

    public static /* synthetic */ void w(w wVar, String str) {
        if (str == null) {
            wVar.G(f305265m);
        } else {
            wVar.L(str, f305265m);
        }
    }

    public static /* synthetic */ void x(w wVar, io.sentry.protocol.m mVar) {
        if (mVar == null) {
            wVar.G(f305262j);
        } else {
            wVar.L(mVar, f305262j);
        }
    }

    public static /* synthetic */ io.sentry.cache.tape.c y(w wVar) {
        io.sentry.cache.tape.d dVarA;
        File fileB = d.b(wVar.f305268a, f305256d);
        if (fileB == null) {
            wVar.f305268a.getLogger().c(y7.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return io.sentry.cache.tape.c.r();
        }
        File file = new File(fileB, f305258f);
        try {
            try {
                dVarA = new io.sentry.cache.tape.d.a(file).b(wVar.f305268a.getMaxBreadcrumbs()).a();
            } catch (IOException e10) {
                wVar.f305268a.getLogger().a(y7.ERROR, "Failed to create breadcrumbs queue", e10);
                return io.sentry.cache.tape.c.r();
            }
        } catch (IOException unused) {
            file.delete();
            dVarA = new io.sentry.cache.tape.d.a(file).b(wVar.f305268a.getMaxBreadcrumbs()).a();
        }
        return io.sentry.cache.tape.c.m(dVarA, wVar.new a());
    }

    public static /* synthetic */ void z(w wVar, y7 y7Var) {
        if (y7Var == null) {
            wVar.G(f305263k);
        } else {
            wVar.L(y7Var, f305263k);
        }
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void A(@NotNull final io.sentry.protocol.v vVar) {
        J(new Runnable() { // from class: io.sentry.cache.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f305197a.L(vVar, w.f305267o);
            }
        });
    }

    @Nullable
    public <T> T H(@NotNull n8 n8Var, @NotNull String str, @NotNull Class<T> cls) {
        if (!str.equals(f305258f)) {
            return (T) d.c(n8Var, f305256d, str, cls, null);
        }
        try {
            return cls.cast(this.f305269b.a().l());
        } catch (IOException unused) {
            n8Var.getLogger().c(y7.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public void I() {
        try {
            this.f305269b.a().clear();
        } catch (IOException e10) {
            this.f305268a.getLogger().a(y7.ERROR, "Failed to clear breadcrumbs from file queue", e10);
        }
        G(f305257e);
        G(f305263k);
        G(f305262j);
        G(f305264l);
        G(f305261i);
        G(f305260h);
        G("tags.json");
        G(f305266n);
        G(f305265m);
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void b(@NotNull final Map<String, String> map) {
        J(new Runnable() { // from class: io.sentry.cache.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f305216a.L(map, "tags.json");
            }
        });
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void e(@NotNull Collection<io.sentry.f> collection) {
        if (collection.isEmpty()) {
            J(new Runnable() { // from class: io.sentry.cache.m
                @Override // java.lang.Runnable
                public final void run() {
                    w.v(this.f305206a);
                }
            });
        }
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void g(@NotNull final io.sentry.protocol.c cVar) {
        J(new Runnable() { // from class: io.sentry.cache.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f305199a.L(cVar, w.f305261i);
            }
        });
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void h(@Nullable final y7 y7Var) {
        J(new Runnable() { // from class: io.sentry.cache.q
            @Override // java.lang.Runnable
            public final void run() {
                w.z(this.f305212a, y7Var);
            }
        });
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void i(@NotNull final Map<String, Object> map) {
        J(new Runnable() { // from class: io.sentry.cache.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f305201a.L(map, w.f305260h);
            }
        });
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void j(@Nullable final g0 g0Var) {
        J(new Runnable() { // from class: io.sentry.cache.o
            @Override // java.lang.Runnable
            public final void run() {
                w.q(this.f305209a, g0Var);
            }
        });
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void k(@NotNull final io.sentry.f fVar) {
        J(new Runnable() { // from class: io.sentry.cache.v
            @Override // java.lang.Runnable
            public final void run() {
                w.D(this.f305253a, fVar);
            }
        });
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void l(@Nullable final String str) {
        J(new Runnable() { // from class: io.sentry.cache.n
            @Override // java.lang.Runnable
            public final void run() {
                w.w(this.f305207a, str);
            }
        });
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void m(@NotNull final Collection<String> collection) {
        J(new Runnable() { // from class: io.sentry.cache.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f305251a.L(collection, w.f305264l);
            }
        });
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void n(@Nullable final p9 p9Var, @NotNull final g1 g1Var) {
        J(new Runnable() { // from class: io.sentry.cache.l
            @Override // java.lang.Runnable
            public final void run() {
                w.p(this.f305203a, p9Var, g1Var);
            }
        });
    }

    @Override // io.sentry.w4, io.sentry.h1
    public void r(@Nullable final io.sentry.protocol.m mVar) {
        J(new Runnable() { // from class: io.sentry.cache.t
            @Override // java.lang.Runnable
            public final void run() {
                w.x(this.f305218a, mVar);
            }
        });
    }
}
