package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.b
public final class la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f305842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f305843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f305844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f305845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f305846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f305847f;

    public la(@NotNull String str, @NotNull String str2, int i10, @NotNull String str3, @NotNull String str4, @Nullable String str5) {
        this.f305842a = str;
        this.f305843b = str2;
        this.f305844c = i10;
        this.f305845d = str3;
        this.f305846e = str4;
        this.f305847f = str5;
    }

    @NotNull
    public String a() {
        return this.f305846e;
    }

    public int b() {
        return this.f305844c;
    }

    @NotNull
    public String c() {
        return this.f305843b;
    }

    @Nullable
    public String d() {
        return this.f305847f;
    }

    @NotNull
    public String e() {
        return this.f305845d;
    }

    @NotNull
    public String f() {
        return this.f305842a;
    }
}
