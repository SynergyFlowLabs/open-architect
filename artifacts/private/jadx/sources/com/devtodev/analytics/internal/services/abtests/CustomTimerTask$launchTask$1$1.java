package com.devtodev.analytics.internal.services.abtests;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomTimerTask$launchTask$1$1 extends l0 implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $stopTimer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTimerTask$launchTask$1$1(Function0<Unit> function0) {
        super(0);
        this.$stopTimer = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f312394a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$stopTimer.invoke();
    }
}
