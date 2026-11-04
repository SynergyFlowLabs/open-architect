package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class oa {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f306000d = "traceparent";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.v f306001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v9 f306002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Boolean f306003c;

    public oa(@NotNull io.sentry.protocol.v vVar, @NotNull v9 v9Var, @Nullable Boolean bool) {
        this.f306001a = vVar;
        this.f306002b = v9Var;
        this.f306003c = bool;
    }

    @NotNull
    public String a() {
        return f306000d;
    }

    @NotNull
    public String b() {
        Boolean bool = this.f306003c;
        return String.format("00-%s-%s-%s", this.f306001a, this.f306002b, (bool == null || !bool.booleanValue()) ? "00" : "01");
    }
}
