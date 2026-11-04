package io.sentry;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class w7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile w7 f307102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f307103d = new io.sentry.util.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private static volatile Boolean f307104e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f307105f = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f307106a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<io.sentry.protocol.w> f307107b = new CopyOnWriteArraySet();

    private w7() {
    }

    @NotNull
    public static w7 e() {
        if (f307102c == null) {
            m1 m1VarA = f307103d.a();
            try {
                if (f307102c == null) {
                    f307102c = new w7();
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
        return f307102c;
    }

    public void a(@NotNull String str) {
        io.sentry.util.y.c(str, "integration is required.");
        this.f307106a.add(str);
    }

    public void b(@NotNull String str, @NotNull String str2) {
        io.sentry.util.y.c(str, "name is required.");
        io.sentry.util.y.c(str2, "version is required.");
        this.f307107b.add(new io.sentry.protocol.w(str, str2));
        m1 m1VarA = f307105f.a();
        int i10 = 3 >> 0;
        try {
            f307104e = null;
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

    public boolean c(@NotNull ILogger iLogger) {
        Boolean bool = f307104e;
        if (bool != null) {
            return bool.booleanValue();
        }
        m1 m1VarA = f307105f.a();
        try {
            boolean z10 = false;
            for (io.sentry.protocol.w wVar : this.f307107b) {
                if (wVar.a().startsWith("maven:io.sentry:") && !"8.23.0".equalsIgnoreCase(wVar.b())) {
                    iLogger.c(y7.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", wVar.a(), "8.23.0", wVar.b());
                    z10 = true;
                }
            }
            if (z10) {
                y7 y7Var = y7.ERROR;
                iLogger.c(y7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(y7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(y7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(y7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            f307104e = Boolean.valueOf(z10);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return z10;
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

    @lm.n
    public void d() {
        this.f307106a.clear();
        this.f307107b.clear();
    }

    @NotNull
    public Set<String> f() {
        return this.f307106a;
    }

    @NotNull
    public Set<io.sentry.protocol.w> g() {
        return this.f307107b;
    }
}
