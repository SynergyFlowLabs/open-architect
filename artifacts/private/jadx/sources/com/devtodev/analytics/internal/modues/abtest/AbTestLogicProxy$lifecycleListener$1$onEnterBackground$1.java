package com.devtodev.analytics.internal.modues.abtest;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class AbTestLogicProxy$lifecycleListener$1$onEnterBackground$1 extends l0 implements Function0<Unit> {
    final /* synthetic */ AbTestLogicProxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbTestLogicProxy$lifecycleListener$1$onEnterBackground$1(AbTestLogicProxy abTestLogicProxy) {
        super(0);
        this.this$0 = abTestLogicProxy;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f312394a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IAbTestLogic abTestLogic = this.this$0.getAbTestLogic();
        if (abTestLogic != null) {
            abTestLogic.stopActivity();
        }
    }
}
