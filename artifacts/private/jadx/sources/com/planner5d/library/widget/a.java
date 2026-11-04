package com.planner5d.library.widget;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f249573a = 0;

    public final void a(@NotNull View view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        com.google.android.material.appbar.AppBarLayout.e eVar = layoutParams instanceof com.google.android.material.appbar.AppBarLayout.e ? (com.google.android.material.appbar.AppBarLayout.e) layoutParams : null;
        if (eVar == null) {
            return;
        }
        int i10 = z10 ? 5 : 0;
        if (eVar.c() == i10) {
            return;
        }
        eVar.h(i10);
        view.setLayoutParams(eVar);
    }
}
