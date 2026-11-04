package com.devtodev.analytics.internal.platform.repository.playservice;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class ReferrerClient$startConnection$1$onInstallReferrerServiceDisconnected$1 extends l0 implements Function0<Unit> {
    final /* synthetic */ IReferrerClientListener $referrerListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferrerClient$startConnection$1$onInstallReferrerServiceDisconnected$1(IReferrerClientListener iReferrerClientListener) {
        super(0);
        this.$referrerListener = iReferrerClientListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f312394a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$referrerListener.onReferrerServiceDisconnected();
    }
}
