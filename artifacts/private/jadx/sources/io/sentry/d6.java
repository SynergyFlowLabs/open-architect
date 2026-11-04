package io.sentry;

import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class d6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d6 f305332d = new d6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f305333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Boolean f305334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f305335c = new io.sentry.util.a();

    private d6() {
    }

    public static d6 a() {
        return f305332d;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    @Nullable
    public Boolean b(@Nullable String str, boolean z10) {
        m1 m1VarA = this.f305335c.a();
        try {
            if (this.f305333a) {
                Boolean bool = this.f305334b;
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return bool;
            }
            if (str == null) {
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return null;
            }
            boolean z11 = true;
            this.f305333a = true;
            File file = new File(str, io.sentry.cache.f.f305181n);
            File file2 = new File(str, io.sentry.cache.f.f305182o);
            try {
                try {
                    if (!file.exists()) {
                        if (!file2.exists()) {
                            z11 = false;
                        } else if (z10) {
                            file2.delete();
                        }
                        this.f305334b = Boolean.valueOf(z11);
                        if (m1VarA != null) {
                            m1VarA.close();
                        }
                        return this.f305334b;
                    }
                    file.delete();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            this.f305334b = Boolean.valueOf(z11);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return this.f305334b;
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
    public void c() {
        m1 m1VarA = this.f305335c.a();
        try {
            this.f305333a = false;
            this.f305334b = null;
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

    public void d(boolean z10) {
        m1 m1VarA = this.f305335c.a();
        try {
            if (!this.f305333a) {
                this.f305334b = Boolean.valueOf(z10);
                this.f305333a = true;
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
}
