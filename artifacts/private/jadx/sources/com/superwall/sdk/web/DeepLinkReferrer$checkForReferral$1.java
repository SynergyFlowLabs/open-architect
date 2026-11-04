package com.superwall.sdk.web;

import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.web.DeepLinkReferrer", f = "DeepLinkReferrer.kt", i = {0}, l = {96}, m = "checkForReferral-IoAF18A", n = {"this"}, s = {"L$0"})
final class DeepLinkReferrer$checkForReferral$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeepLinkReferrer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeepLinkReferrer$checkForReferral$1(DeepLinkReferrer deepLinkReferrer, kotlin.coroutines.d<? super DeepLinkReferrer$checkForReferral$1> dVar) {
        super(dVar);
        this.this$0 = deepLinkReferrer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo80checkForReferralIoAF18A = this.this$0.mo80checkForReferralIoAF18A(this);
        return objMo80checkForReferralIoAF18A == kotlin.coroutines.intrinsics.b.l() ? objMo80checkForReferralIoAF18A : Result.a(objMo80checkForReferralIoAF18A);
    }
}
