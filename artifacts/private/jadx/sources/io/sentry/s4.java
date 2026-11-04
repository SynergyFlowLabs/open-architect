package io.sentry;

import java.util.Collections;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ga f306772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final n f306773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Double f306774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f306775d;

    @Deprecated
    public s4(@NotNull ga gaVar, @Nullable n nVar) {
        this(gaVar, nVar, Double.valueOf(io.sentry.util.f0.a().g()), null);
    }

    @Nullable
    public Object a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.f306775d.get(str);
    }

    @Nullable
    public n b() {
        return this.f306773b;
    }

    @NotNull
    public Double c() {
        return this.f306774c;
    }

    @NotNull
    public ga d() {
        return this.f306772a;
    }

    @lm.a.c
    public s4(@NotNull ga gaVar, @Nullable n nVar, @NotNull Double d10, @Nullable Map<String, Object> map) {
        this.f306772a = (ga) io.sentry.util.y.c(gaVar, "transactionContexts is required");
        this.f306773b = nVar;
        this.f306774c = d10;
        this.f306775d = map == null ? Collections.EMPTY_MAP : map;
    }
}
