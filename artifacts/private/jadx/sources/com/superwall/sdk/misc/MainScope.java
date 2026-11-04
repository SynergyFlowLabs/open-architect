package com.superwall.sdk.misc;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class MainScope implements s0, SuperwallScope {

    @NotNull
    private final CoroutineContext coroutineContext;

    /* JADX WARN: Multi-variable type inference failed */
    public MainScope() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // com.superwall.sdk.misc.SuperwallScope
    @NotNull
    public o0 getExceptionHandler() {
        return SuperwallScope.DefaultImpls.getExceptionHandler(this);
    }

    public MainScope(@NotNull CoroutineContext overrideWithContext) {
        Intrinsics.checkNotNullParameter(overrideWithContext, "overrideWithContext");
        this.coroutineContext = overrideWithContext.plus(getExceptionHandler());
    }

    public /* synthetic */ MainScope(CoroutineContext coroutineContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? l1.e() : coroutineContext);
    }
}
