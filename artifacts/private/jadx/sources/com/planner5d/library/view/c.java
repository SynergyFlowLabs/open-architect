package com.planner5d.library.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f244850a;

    public final void a(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f244850a >= 500) {
            this.f244850a = jCurrentTimeMillis;
            block.invoke();
        }
    }
}
