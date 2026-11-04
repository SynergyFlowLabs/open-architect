package com.devtodev.analytics.internal.services;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class ReportService$sendReports$1$1 extends l0 implements Function0<Unit> {
    final /* synthetic */ ReportService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportService$sendReports$1$1(ReportService reportService) {
        super(0);
        this.this$0 = reportService;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f312394a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.resendWhenFinish = false;
        this.this$0.isSending = false;
    }
}
