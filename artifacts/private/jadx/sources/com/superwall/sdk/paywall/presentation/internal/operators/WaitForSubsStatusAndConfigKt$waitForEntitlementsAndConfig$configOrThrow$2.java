package com.superwall.sdk.paywall.presentation.internal.operators;

import com.superwall.sdk.config.models.ConfigState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$configOrThrow$2", f = "WaitForSubsStatusAndConfig.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$configOrThrow$2 extends o implements Function2<ConfigState, d<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$configOrThrow$2(d<? super WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$configOrThrow$2> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$configOrThrow$2 waitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$configOrThrow$2 = new WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$configOrThrow$2(dVar);
        waitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$configOrThrow$2.L$0 = obj;
        return waitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$configOrThrow$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ConfigState configState, d<? super Boolean> dVar) {
        return ((WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$configOrThrow$2) create(configState, dVar)).invokeSuspend(Unit.f312394a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        ConfigState configState = (ConfigState) this.L$0;
        if (configState instanceof ConfigState.Failed) {
            throw ((ConfigState.Failed) configState).getThrowable();
        }
        return kotlin.coroutines.jvm.internal.b.a(configState instanceof ConfigState.Retrieved);
    }
}
