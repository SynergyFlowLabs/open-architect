package com.planner5d.library.services.utility;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class l2 implements kotlinx.coroutines.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f225323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f225324b;

    public l2(@NotNull kotlinx.coroutines.s0 coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f225323a = coroutineScope;
    }

    public static /* synthetic */ void e(l2 l2Var, CoroutineContext coroutineContext, kotlinx.coroutines.u0 u0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i10 & 2) != 0) {
            u0Var = kotlinx.coroutines.u0.DEFAULT;
        }
        l2Var.c(coroutineContext, u0Var, function2);
    }

    public final void c(@NotNull CoroutineContext context, @NotNull kotlinx.coroutines.u0 start, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlinx.coroutines.p2 p2Var = this.f225324b;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        this.f225324b = kotlinx.coroutines.i.d(this.f225323a, context, start, block);
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f225323a.getCoroutineContext();
    }
}
