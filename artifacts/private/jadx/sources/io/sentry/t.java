package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class t implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ThreadLocal<i1> f306785a = new ThreadLocal<>();

    static final class a implements m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final i1 f306786a;

        a(@Nullable i1 i1Var) {
            this.f306786a = i1Var;
        }

        @Override // io.sentry.m1, java.lang.AutoCloseable
        public void close() {
            t.f306785a.set(this.f306786a);
        }
    }

    @Override // io.sentry.j1
    public m1 a(@Nullable i1 i1Var) {
        i1 i1Var2 = get();
        f306785a.set(i1Var);
        return new a(i1Var2);
    }

    @Override // io.sentry.j1
    public void close() {
        f306785a.remove();
    }

    @Override // io.sentry.j1
    @Nullable
    public i1 get() {
        return f306785a.get();
    }

    @Override // io.sentry.j1
    public void r() {
    }
}
