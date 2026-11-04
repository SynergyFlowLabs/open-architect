package com.planner5d.library.model.manager;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public final class u0 implements x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f222250c = 1;

    @ij.a
    public u0() {
    }

    public final boolean a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return view.performHapticFeedback(1, this.f222250c);
    }
}
