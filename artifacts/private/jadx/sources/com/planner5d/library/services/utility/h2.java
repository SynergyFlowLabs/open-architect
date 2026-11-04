package com.planner5d.library.services.utility;

import android.app.Activity;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h2 f225257a = new h2();

    private h2() {
    }

    @oj.n
    @NotNull
    public static final Activity a(@Nullable Activity activity) {
        if (activity != null) {
            return activity;
        }
        throw new RuntimeException("Activity is empty");
    }

    @oj.n
    @NotNull
    public static final View b(@Nullable View view) {
        if (view != null) {
            return view;
        }
        throw new RuntimeException("Empty view");
    }

    @Nullable
    public final <T> T c(@Nullable Object obj, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (obj == null) {
            return block.invoke();
        }
        return null;
    }
}
