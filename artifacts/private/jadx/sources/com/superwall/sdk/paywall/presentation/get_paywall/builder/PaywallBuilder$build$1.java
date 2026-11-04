package com.superwall.sdk.paywall.presentation.get_paywall.builder;

import kotlin.Result;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.paywall.presentation.get_paywall.builder.PaywallBuilder", f = "PaywallBuilder.kt", i = {0}, l = {90}, m = "build-IoAF18A", n = {"this"}, s = {"L$0"})
final class PaywallBuilder$build$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaywallBuilder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallBuilder$build$1(PaywallBuilder paywallBuilder, kotlin.coroutines.d<? super PaywallBuilder$build$1> dVar) {
        super(dVar);
        this.this$0 = paywallBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM70buildIoAF18A = this.this$0.m70buildIoAF18A(this);
        return objM70buildIoAF18A == b.l() ? objM70buildIoAF18A : Result.a(objM70buildIoAF18A);
    }
}
