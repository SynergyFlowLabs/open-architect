package io.sentry.util;

import io.sentry.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class s<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a<T> f306988b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private volatile T f306987a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f306989c = new io.sentry.util.a();

    public interface a<T> {
        @NotNull
        T a();
    }

    public s(@NotNull a<T> aVar) {
        this.f306988b = aVar;
    }

    @NotNull
    public T a() {
        if (this.f306987a == null) {
            m1 m1VarA = this.f306989c.a();
            try {
                if (this.f306987a == null) {
                    this.f306987a = this.f306988b.a();
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
        return this.f306987a;
    }

    public void b() {
        m1 m1VarA = this.f306989c.a();
        try {
            this.f306987a = null;
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

    public void c(@Nullable T t10) {
        m1 m1VarA = this.f306989c.a();
        try {
            this.f306987a = t10;
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
