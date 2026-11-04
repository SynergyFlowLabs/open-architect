package com.facebook.appevents;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private d0 f98863b = d0.SUCCESS;

    public final int a() {
        return this.f98862a;
    }

    @NotNull
    public final d0 b() {
        return this.f98863b;
    }

    public final void c(int i10) {
        this.f98862a = i10;
    }

    public final void d(@NotNull d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<set-?>");
        this.f98863b = d0Var;
    }
}
