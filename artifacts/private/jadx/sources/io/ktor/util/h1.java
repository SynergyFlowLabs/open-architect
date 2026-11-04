package io.ktor.util;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f296611a = "io.ktor.development";

    @NotNull
    public static final f1 a(@NotNull g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        return f1.c.f296593a;
    }

    public static final boolean b(@NotNull g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        String property = System.getProperty(f296611a);
        return property != null && Boolean.parseBoolean(property);
    }
}
