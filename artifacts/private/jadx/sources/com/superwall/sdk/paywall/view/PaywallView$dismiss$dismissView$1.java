package com.superwall.sdk.paywall.view;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView", f = "PaywallView.kt", i = {0, 0, 0, 1, 1, 1, 1, 2}, l = {402, 411, 421}, m = "dismiss$dismissView", n = {"this$0", "$result", "trackedEvent", "this$0", "$result", "presentationResult", "presentedByPaywallDecline", "this$0"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "Z$0", "L$0"})
final class PaywallView$dismiss$dismissView$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    PaywallView$dismiss$dismissView$1(kotlin.coroutines.d<? super PaywallView$dismiss$dismissView$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PaywallView.dismiss$dismissView(false, false, null, null, this);
    }
}
