package com.superwall.sdk.billing;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;

/* JADX INFO: loaded from: classes13.dex */
/* synthetic */ class GoogleBillingWrapper$queryProductDetailsAsync$useCase$1 extends g0 implements Function1<Function1<? super com.android.billingclient.api.h, ? extends Unit>, Unit> {
    GoogleBillingWrapper$queryProductDetailsAsync$useCase$1(Object obj) {
        super(1, obj, GoogleBillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Function1<? super com.android.billingclient.api.h, ? extends Unit> function1) {
        invoke2((Function1<? super com.android.billingclient.api.h, Unit>) function1);
        return Unit.f312394a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Function1<? super com.android.billingclient.api.h, Unit> p10) {
        Intrinsics.checkNotNullParameter(p10, "p0");
        ((GoogleBillingWrapper) this.receiver).withConnectedClient(p10);
    }
}
