package io.sentry.android.replay;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class z {
    public static final void a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(g.a.f304902a, "mask");
    }

    public static final void b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(g.a.f304902a, "unmask");
    }
}
