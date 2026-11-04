package io.ktor.util;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i1 {
    public static final boolean a(@NotNull kotlin.ranges.n nVar, @NotNull kotlin.ranges.n other) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return other.l() >= nVar.u().longValue() && other.m() <= nVar.i().longValue();
    }
}
