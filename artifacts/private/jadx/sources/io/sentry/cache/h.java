package io.sentry.cache;

import io.sentry.a1;
import io.sentry.a2;
import io.sentry.n8;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f305188b = ".options-cache";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f305189c = "release.json";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f305190d = "proguard-uuid.json";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f305191e = "sdk-version.json";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f305192f = "environment.json";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f305193g = "dist.json";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f305194h = "tags.json";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f305195i = "replay-error-sample-rate.json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f305196a;

    public h(@NotNull n8 n8Var) {
        this.f305196a = n8Var;
    }

    private void a(@NotNull String str) {
        d.a(this.f305196a, f305188b, str);
    }

    @Nullable
    public static <T> T i(@NotNull n8 n8Var, @NotNull String str, @NotNull Class<T> cls) {
        return (T) j(n8Var, str, cls, null);
    }

    @Nullable
    public static <T, R> T j(@NotNull n8 n8Var, @NotNull String str, @NotNull Class<T> cls, @Nullable a2<R> a2Var) {
        return (T) d.c(n8Var, f305188b, str, cls, a2Var);
    }

    private <T> void k(@NotNull T t10, @NotNull String str) {
        d.d(this.f305196a, t10, f305188b, str);
    }

    @Override // io.sentry.a1
    public void b(@NotNull Map<String, String> map) {
        k(map, "tags.json");
    }

    @Override // io.sentry.a1
    public void c(@Nullable String str) {
        if (str == null) {
            a(f305193g);
        } else {
            k(str, f305193g);
        }
    }

    @Override // io.sentry.a1
    public void d(@Nullable String str) {
        if (str == null) {
            a(f305192f);
        } else {
            k(str, f305192f);
        }
    }

    @Override // io.sentry.a1
    public void e(@Nullable String str) {
        if (str == null) {
            a(f305190d);
        } else {
            k(str, f305190d);
        }
    }

    @Override // io.sentry.a1
    public void f(@Nullable io.sentry.protocol.p pVar) {
        if (pVar == null) {
            a(f305191e);
        } else {
            k(pVar, f305191e);
        }
    }

    @Override // io.sentry.a1
    public void g(@Nullable Double d10) {
        if (d10 == null) {
            a(f305195i);
        } else {
            k(d10.toString(), f305195i);
        }
    }

    @Override // io.sentry.a1
    public void h(@Nullable String str) {
        if (str == null) {
            a(f305189c);
        } else {
            k(str, f305189c);
        }
    }
}
