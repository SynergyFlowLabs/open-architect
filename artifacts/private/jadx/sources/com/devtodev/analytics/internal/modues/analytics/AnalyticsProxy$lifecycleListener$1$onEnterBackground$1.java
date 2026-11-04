package com.devtodev.analytics.internal.modues.analytics;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsProxy$lifecycleListener$1$onEnterBackground$1 extends l0 implements Function0<Unit> {
    final /* synthetic */ AnalyticsProxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsProxy$lifecycleListener$1$onEnterBackground$1(AnalyticsProxy analyticsProxy) {
        super(0);
        this.this$0 = analyticsProxy;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f312394a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IAnalytics iAnalytics = this.this$0.analyticsLogic;
        if (iAnalytics != null) {
            iAnalytics.stopActivity();
        }
    }
}
