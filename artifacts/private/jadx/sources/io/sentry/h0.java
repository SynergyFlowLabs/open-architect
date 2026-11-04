package io.sentry;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class h0 extends y implements y0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final i1 f305520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n1 f305521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final ILogger f305522h;

    public h0(@NotNull i1 i1Var, @NotNull n1 n1Var, @NotNull ILogger iLogger, long j10, int i10) {
        super(i1Var, iLogger, j10, i10);
        this.f305520f = (i1) io.sentry.util.y.c(i1Var, "Scopes are required.");
        this.f305521g = (n1) io.sentry.util.y.c(n1Var, "Serializer is required.");
        this.f305522h = (ILogger) io.sentry.util.y.c(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void f(h0 h0Var, io.sentry.hints.i iVar) {
        h0Var.getClass();
        if (!iVar.h()) {
            h0Var.f305522h.c(y7.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
        }
    }

    public static /* synthetic */ void g(h0 h0Var, File file, io.sentry.hints.k kVar) {
        h0Var.getClass();
        if (kVar.c()) {
            h0Var.f305522h.c(y7.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        } else {
            h0Var.i(file, "after trying to capture it");
            h0Var.f305522h.c(y7.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        }
    }

    public static /* synthetic */ void h(h0 h0Var, Throwable th2, File file, io.sentry.hints.k kVar) {
        h0Var.getClass();
        kVar.e(false);
        h0Var.f305522h.b(y7.INFO, th2, "File '%s' won't retry.", file.getAbsolutePath());
    }

    private void i(@NotNull File file, @NotNull String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.f305522h.c(y7.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th2) {
            this.f305522h.b(y7.ERROR, th2, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.y0
    public void a(@NotNull String str, @NotNull n0 n0Var) {
        io.sentry.util.y.c(str, "Path is required.");
        e(new File(str), n0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.y
    public boolean c(@NotNull String str) {
        return str.endsWith(io.sentry.cache.f.f305177j);
    }

    @Override // io.sentry.y
    public /* bridge */ /* synthetic */ void d(@NotNull File file) {
        super.d(file);
    }

    @Override // io.sentry.y
    protected void e(@NotNull final File file, @NotNull n0 n0Var) {
        ILogger iLogger;
        io.sentry.util.n.a aVar;
        if (!file.isFile()) {
            this.f305522h.c(y7.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!c(file.getName())) {
            this.f305522h.c(y7.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.f305522h.c(y7.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        g6 g6VarE = this.f305521g.e(bufferedInputStream);
                        if (g6VarE == null) {
                            this.f305522h.c(y7.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.f305520f.s0(g6VarE, n0Var);
                        }
                        io.sentry.util.n.m(n0Var, io.sentry.hints.i.class, this.f305522h, new io.sentry.util.n.a() { // from class: io.sentry.e0
                            @Override // io.sentry.util.n.a
                            public final void accept(Object obj) {
                                h0.f(this.f305383a, (io.sentry.hints.i) obj);
                            }
                        });
                        bufferedInputStream.close();
                        io.sentry.util.n.m(n0Var, io.sentry.hints.k.class, this.f305522h, new io.sentry.util.n.a() { // from class: io.sentry.f0
                            @Override // io.sentry.util.n.a
                            public final void accept(Object obj) {
                                h0.g(this.f305419a, file, (io.sentry.hints.k) obj);
                            }
                        });
                    } catch (Throwable th2) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e10) {
                    this.f305522h.b(y7.ERROR, e10, "I/O on file '%s' failed.", file.getAbsolutePath());
                    iLogger = this.f305522h;
                    aVar = new io.sentry.util.n.a() { // from class: io.sentry.f0
                        @Override // io.sentry.util.n.a
                        public final void accept(Object obj) {
                            h0.g(this.f305419a, file, (io.sentry.hints.k) obj);
                        }
                    };
                    io.sentry.util.n.m(n0Var, io.sentry.hints.k.class, iLogger, aVar);
                }
            } catch (FileNotFoundException e11) {
                this.f305522h.b(y7.ERROR, e11, "File '%s' cannot be found.", file.getAbsolutePath());
                iLogger = this.f305522h;
                aVar = new io.sentry.util.n.a() { // from class: io.sentry.f0
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        h0.g(this.f305419a, file, (io.sentry.hints.k) obj);
                    }
                };
                io.sentry.util.n.m(n0Var, io.sentry.hints.k.class, iLogger, aVar);
            } catch (Throwable th4) {
                this.f305522h.b(y7.ERROR, th4, "Failed to capture cached envelope %s", file.getAbsolutePath());
                io.sentry.util.n.m(n0Var, io.sentry.hints.k.class, this.f305522h, new io.sentry.util.n.a() { // from class: io.sentry.g0
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        h0.h(this.f305446a, th4, file, (io.sentry.hints.k) obj);
                    }
                });
                iLogger = this.f305522h;
                aVar = new io.sentry.util.n.a() { // from class: io.sentry.f0
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        h0.g(this.f305419a, file, (io.sentry.hints.k) obj);
                    }
                };
                io.sentry.util.n.m(n0Var, io.sentry.hints.k.class, iLogger, aVar);
            }
        } catch (Throwable th5) {
            io.sentry.util.n.m(n0Var, io.sentry.hints.k.class, this.f305522h, new io.sentry.util.n.a() { // from class: io.sentry.f0
                @Override // io.sentry.util.n.a
                public final void accept(Object obj) {
                    h0.g(this.f305419a, file, (io.sentry.hints.k) obj);
                }
            });
            throw th5;
        }
    }
}
