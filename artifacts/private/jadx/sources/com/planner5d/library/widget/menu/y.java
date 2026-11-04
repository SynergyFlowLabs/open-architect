package com.planner5d.library.widget.menu;

import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f258401c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f258402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f258403b;

    public y(@f1 int i10, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f258402a = i10;
        this.f258403b = action;
    }

    @NotNull
    public final Function0<Unit> a() {
        return this.f258403b;
    }

    public final int b() {
        return this.f258402a;
    }
}
