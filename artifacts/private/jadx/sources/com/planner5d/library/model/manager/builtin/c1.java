package com.planner5d.library.model.manager.builtin;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class c1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f180955d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public final boolean f180956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public final boolean f180957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String[] f180958c;

    public c1(boolean z10, boolean z11, @NotNull String[] freeModels) {
        Intrinsics.checkNotNullParameter(freeModels, "freeModels");
        this.f180956a = z10;
        this.f180957b = z11;
        this.f180958c = freeModels;
    }
}
