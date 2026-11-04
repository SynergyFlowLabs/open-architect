package com.superwall.sdk.billing;

import com.devtodev.core.data.metrics.MetricConsts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.billing.GoogleBillingWrapper", f = "GoogleBillingWrapper.kt", i = {0, 1, 1, 1}, l = {616, 620}, m = "latestPurchase$superwall_release", n = {"this", "this", "destination$iv$iv", MetricConsts.Install}, s = {"L$0", "L$0", "L$1", "L$3"})
final class GoogleBillingWrapper$latestPurchase$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GoogleBillingWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleBillingWrapper$latestPurchase$1(GoogleBillingWrapper googleBillingWrapper, kotlin.coroutines.d<? super GoogleBillingWrapper$latestPurchase$1> dVar) {
        super(dVar);
        this.this$0 = googleBillingWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.latestPurchase$superwall_release(this);
    }
}
