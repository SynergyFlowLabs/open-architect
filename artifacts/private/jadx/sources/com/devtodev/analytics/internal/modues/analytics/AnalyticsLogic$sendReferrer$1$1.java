package com.devtodev.analytics.internal.modues.analytics;

import com.devtodev.analytics.internal.domain.events.Referral;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsLogic$sendReferrer$1$1 extends l0 implements Function1<String, Unit> {
    final /* synthetic */ long $sessionId;
    final /* synthetic */ AnalyticsLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsLogic$sendReferrer$1$1(long j10, AnalyticsLogic analyticsLogic) {
        super(1);
        this.$sessionId = j10;
        this.this$0 = analyticsLogic;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f312394a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String encryptedSource) {
        Intrinsics.checkNotNullParameter(encryptedSource, "encryptedSource");
        this.this$0.eventsService.addEvent(new Referral(this.$sessionId, null, encryptedSource, null, null, null, null, null, 250, null));
        this.this$0.reportService.sendBufferedEvents();
        this.this$0.projectService.setRefererSent(true);
    }
}
