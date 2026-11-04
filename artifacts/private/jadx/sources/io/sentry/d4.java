package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class d4 extends y implements y0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Charset f305326j = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final i1 f305327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0 f305328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final n1 f305329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final ILogger f305330i;

    public d4(@NotNull i1 i1Var, @NotNull x0 x0Var, @NotNull n1 n1Var, @NotNull ILogger iLogger, long j10, int i10) {
        super(i1Var, iLogger, j10, i10);
        this.f305327f = (i1) io.sentry.util.y.c(i1Var, "Scopes are required.");
        this.f305328g = (x0) io.sentry.util.y.c(x0Var, "Envelope reader is required.");
        this.f305329h = (n1) io.sentry.util.y.c(n1Var, "Serializer is required.");
        this.f305330i = (ILogger) io.sentry.util.y.c(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void f(d4 d4Var, File file, io.sentry.hints.k kVar) {
        d4Var.getClass();
        if (kVar.c()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            d4Var.f305330i.c(y7.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e10) {
            d4Var.f305330i.b(y7.ERROR, e10, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @NotNull
    private fa h(@Nullable da daVar) {
        String strF;
        if (daVar != null && (strF = daVar.f()) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(strF));
                if (io.sentry.util.d0.h(dValueOf, false)) {
                    String strE = daVar.e();
                    if (strE != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(strE));
                        if (io.sentry.util.d0.h(dValueOf2, false)) {
                            return new fa(Boolean.TRUE, dValueOf, dValueOf2);
                        }
                    }
                    return io.sentry.util.d0.a(new fa(Boolean.TRUE, dValueOf));
                }
                this.f305330i.c(y7.ERROR, "Invalid sample rate parsed from TraceContext: %s", strF);
            } catch (Exception unused) {
                this.f305330i.c(y7.ERROR, "Unable to parse sample rate from TraceContext: %s", strF);
            }
        }
        return new fa(Boolean.TRUE);
    }

    private void i(@NotNull m7 m7Var, int i10) {
        this.f305330i.c(y7.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i10), m7Var.S().f());
    }

    private void j(int i10) {
        this.f305330i.c(y7.DEBUG, "Item %d is being captured.", Integer.valueOf(i10));
    }

    private void k(@Nullable io.sentry.protocol.v vVar) {
        this.f305330i.c(y7.WARNING, "Timed out waiting for event id submission: %s", vVar);
    }

    private void l(@NotNull g6 g6Var, @Nullable io.sentry.protocol.v vVar, int i10) {
        this.f305330i.c(y7.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i10), g6Var.d().a(), vVar);
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0241  */
    private void m(@NotNull g6 g6Var, @NotNull n0 n0Var) throws IOException {
        Object objG;
        this.f305330i.c(y7.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(io.sentry.util.d.i(g6Var.e())));
        int i10 = 0;
        for (m7 m7Var : g6Var.e()) {
            i10++;
            if (m7Var.S() == null) {
                this.f305330i.c(y7.ERROR, "Item %d has no header", Integer.valueOf(i10));
            } else if (x7.Event.equals(m7Var.S().f())) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m7Var.Q()), f305326j));
                    try {
                        o7 o7Var = (o7) this.f305329h.c(bufferedReader, o7.class);
                        if (o7Var == null) {
                            i(m7Var, i10);
                        } else {
                            if (o7Var.O() != null) {
                                io.sentry.util.n.o(n0Var, o7Var.O().f());
                            }
                            if (g6Var.d().a() == null || g6Var.d().a().equals(o7Var.I())) {
                                this.f305327f.o0(o7Var, n0Var);
                                j(i10);
                                if (!n(n0Var)) {
                                    k(o7Var.I());
                                    bufferedReader.close();
                                    break;
                                }
                            } else {
                                l(g6Var, o7Var.I(), i10);
                                bufferedReader.close();
                            }
                        }
                        bufferedReader.close();
                        objG = io.sentry.util.n.g(n0Var);
                        if (!(objG instanceof io.sentry.hints.p) && !((io.sentry.hints.p) objG).b()) {
                            this.f305330i.c(y7.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i10));
                            break;
                        }
                        io.sentry.util.n.k(n0Var, io.sentry.hints.j.class, new io.sentry.util.n.a() { // from class: io.sentry.b4
                            @Override // io.sentry.util.n.a
                            public final void accept(Object obj) {
                                ((io.sentry.hints.j) obj).reset();
                            }
                        });
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    this.f305330i.a(y7.ERROR, "Item failed to process.", th4);
                }
            } else if (x7.Transaction.equals(m7Var.S().f())) {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m7Var.Q()), f305326j));
                    try {
                        io.sentry.protocol.c0 c0Var = (io.sentry.protocol.c0) this.f305329h.c(bufferedReader2, io.sentry.protocol.c0.class);
                        if (c0Var == null) {
                            i(m7Var, i10);
                        } else if (g6Var.d().a() == null || g6Var.d().a().equals(c0Var.I())) {
                            da daVarD = g6Var.d().d();
                            if (c0Var.E().o() != null) {
                                c0Var.E().o().y(h(daVarD));
                            }
                            this.f305327f.S0(c0Var, daVarD, n0Var);
                            j(i10);
                            if (!n(n0Var)) {
                                k(c0Var.I());
                                bufferedReader2.close();
                                break;
                            }
                        } else {
                            l(g6Var, c0Var.I(), i10);
                            bufferedReader2.close();
                        }
                        bufferedReader2.close();
                    } catch (Throwable th5) {
                        try {
                            bufferedReader2.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    this.f305330i.a(y7.ERROR, "Item failed to process.", th7);
                }
                objG = io.sentry.util.n.g(n0Var);
                if (!(objG instanceof io.sentry.hints.p)) {
                }
                io.sentry.util.n.k(n0Var, io.sentry.hints.j.class, new io.sentry.util.n.a() { // from class: io.sentry.b4
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.j) obj).reset();
                    }
                });
            } else {
                this.f305327f.s0(new g6(g6Var.d().a(), g6Var.d().b(), m7Var), n0Var);
                this.f305330i.c(y7.DEBUG, "%s item %d is being captured.", m7Var.S().f().getItemType(), Integer.valueOf(i10));
                if (!n(n0Var)) {
                    this.f305330i.c(y7.WARNING, "Timed out waiting for item type submission: %s", m7Var.S().f().getItemType());
                    break;
                } else {
                    objG = io.sentry.util.n.g(n0Var);
                    if (!(objG instanceof io.sentry.hints.p)) {
                    }
                    io.sentry.util.n.k(n0Var, io.sentry.hints.j.class, new io.sentry.util.n.a() { // from class: io.sentry.b4
                        @Override // io.sentry.util.n.a
                        public final void accept(Object obj) {
                            ((io.sentry.hints.j) obj).reset();
                        }
                    });
                }
            }
        }
    }

    private boolean n(@NotNull n0 n0Var) {
        Object objG = io.sentry.util.n.g(n0Var);
        if (objG instanceof io.sentry.hints.i) {
            return ((io.sentry.hints.i) objG).h();
        }
        io.sentry.util.v.a(io.sentry.hints.i.class, objG, this.f305330i);
        return true;
    }

    @Override // io.sentry.y0
    public void a(@NotNull String str, @NotNull n0 n0Var) {
        io.sentry.util.y.c(str, "Path is required.");
        e(new File(str), n0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.y
    public boolean c(@Nullable String str) {
        return (str == null || str.startsWith(io.sentry.cache.f.f305178k) || str.startsWith(io.sentry.cache.f.f305179l) || str.startsWith(io.sentry.cache.f.f305183s)) ? false : true;
    }

    @Override // io.sentry.y
    public /* bridge */ /* synthetic */ void d(@NotNull File file) {
        super.d(file);
    }

    @Override // io.sentry.y
    protected void e(@NotNull final File file, @NotNull n0 n0Var) {
        io.sentry.util.y.c(file, "File is required.");
        try {
            if (!c(file.getName())) {
                this.f305330i.c(y7.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    g6 g6VarA = this.f305328g.a(bufferedInputStream);
                    if (g6VarA == null) {
                        this.f305330i.c(y7.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        m(g6VarA, n0Var);
                        this.f305330i.c(y7.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    io.sentry.util.n.m(n0Var, io.sentry.hints.k.class, this.f305330i, new io.sentry.util.n.a() { // from class: io.sentry.c4
                        @Override // io.sentry.util.n.a
                        public final void accept(Object obj) {
                            d4.f(this.f305156a, file, (io.sentry.hints.k) obj);
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
                this.f305330i.a(y7.ERROR, "Error processing envelope.", e10);
                io.sentry.util.n.m(n0Var, io.sentry.hints.k.class, this.f305330i, new io.sentry.util.n.a() { // from class: io.sentry.c4
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        d4.f(this.f305156a, file, (io.sentry.hints.k) obj);
                    }
                });
            }
        } catch (Throwable th4) {
            io.sentry.util.n.m(n0Var, io.sentry.hints.k.class, this.f305330i, new io.sentry.util.n.a() { // from class: io.sentry.c4
                @Override // io.sentry.util.n.a
                public final void accept(Object obj) {
                    d4.f(this.f305156a, file, (io.sentry.hints.k) obj);
                }
            });
            throw th4;
        }
    }
}
