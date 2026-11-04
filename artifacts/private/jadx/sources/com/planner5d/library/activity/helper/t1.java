package com.planner5d.library.activity.helper;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t1 f137123a = new t1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f137124b = 0;

    private t1() {
    }

    @oj.n
    public static final void a(@NotNull Window window, int i10) {
        Intrinsics.checkNotNullParameter(window, "window");
        View viewFindViewById = window.findViewById(com.planner5d.library.f.j.Ke);
        if (viewFindViewById != null) {
            viewFindViewById.setFitsSystemWindows(false);
        }
        com.planner5d.library.application.b.f142455c.a().U().d(i10);
    }
}
