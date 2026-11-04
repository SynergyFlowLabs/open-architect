package io.ktor.util.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f296674a;

    public i(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f296674a = symbol;
    }

    @NotNull
    public final String a() {
        return this.f296674a;
    }

    @NotNull
    public String toString() {
        return this.f296674a;
    }
}
