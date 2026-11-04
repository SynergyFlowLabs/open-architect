package com.planner5d.library.services.utility;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f225293a;

    public k0(@NotNull kotlinx.coroutines.s0 delegateCoroutineScope) {
        Intrinsics.checkNotNullParameter(delegateCoroutineScope, "delegateCoroutineScope");
        this.f225293a = delegateCoroutineScope;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f225293a.getCoroutineContext();
    }
}
