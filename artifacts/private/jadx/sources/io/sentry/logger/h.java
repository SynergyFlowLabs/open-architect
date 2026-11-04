package io.sentry.logger;

import io.sentry.e6;
import io.sentry.p9;
import io.sentry.x5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private e6 f305863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private x5 f305864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f305865c = p9.f306037s;

    @NotNull
    public static h a(@Nullable x5 x5Var) {
        return b(null, x5Var);
    }

    @NotNull
    public static h b(@Nullable e6 e6Var, @Nullable x5 x5Var) {
        h hVar = new h();
        hVar.h(e6Var);
        hVar.f(x5Var);
        return hVar;
    }

    @Nullable
    public x5 c() {
        return this.f305864b;
    }

    @NotNull
    public String d() {
        return this.f305865c;
    }

    @Nullable
    public e6 e() {
        return this.f305863a;
    }

    public void f(@Nullable x5 x5Var) {
        this.f305864b = x5Var;
    }

    public void g(@NotNull String str) {
        this.f305865c = str;
    }

    public void h(@Nullable e6 e6Var) {
        this.f305863a = e6Var;
    }
}
