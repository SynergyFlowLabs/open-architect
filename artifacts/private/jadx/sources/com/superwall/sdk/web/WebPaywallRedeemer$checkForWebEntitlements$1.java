package com.superwall.sdk.web;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.web.WebPaywallRedeemer", f = "WebPaywallRedeemer.kt", i = {}, l = {257, 259}, m = "checkForWebEntitlements-AKGx8qU", n = {}, s = {})
final class WebPaywallRedeemer$checkForWebEntitlements$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebPaywallRedeemer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebPaywallRedeemer$checkForWebEntitlements$1(WebPaywallRedeemer webPaywallRedeemer, kotlin.coroutines.d<? super WebPaywallRedeemer$checkForWebEntitlements$1> dVar) {
        super(dVar);
        this.this$0 = webPaywallRedeemer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m82checkForWebEntitlementsAKGx8qU(null, null, this);
    }
}
