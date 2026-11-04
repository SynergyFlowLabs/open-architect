package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f307001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final w5 f307002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Object f307003c;

    private v5(@NotNull String str, @Nullable w5 w5Var, @Nullable Object obj) {
        this.f307001a = str;
        this.f307002b = w5Var;
        this.f307003c = obj;
    }

    @NotNull
    public static v5 a(@NotNull String str, @Nullable Boolean bool) {
        return new v5(str, w5.BOOLEAN, bool);
    }

    @NotNull
    public static v5 b(@NotNull String str, @Nullable Double d10) {
        return new v5(str, w5.DOUBLE, d10);
    }

    @NotNull
    public static v5 f(@NotNull String str, @Nullable Integer num) {
        return new v5(str, w5.INTEGER, num);
    }

    @NotNull
    public static v5 g(@NotNull String str, @Nullable Object obj) {
        return new v5(str, null, obj);
    }

    @NotNull
    public static v5 h(@NotNull String str, @Nullable String str2) {
        return new v5(str, w5.STRING, str2);
    }

    @NotNull
    public String c() {
        return this.f307001a;
    }

    @Nullable
    public w5 d() {
        return this.f307002b;
    }

    @Nullable
    public Object e() {
        return this.f307003c;
    }
}
