package io.sentry.android.replay;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 {
    @Nullable
    public static final Window a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        d0 d0Var = d0.f304894a;
        View rootView = view.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
        return d0Var.d(rootView);
    }
}
