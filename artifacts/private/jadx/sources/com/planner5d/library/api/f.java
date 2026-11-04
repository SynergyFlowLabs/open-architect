package com.planner5d.library.api;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f142260a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f142261b = "planner5d.com";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static g f142262c = new g(f142261b, f142261b);

    private f() {
    }

    @oj.n
    @NotNull
    public static final g a() {
        return f142262c;
    }

    public final void b(@NotNull String domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        f142262c = new g(domain, f142261b);
    }
}
