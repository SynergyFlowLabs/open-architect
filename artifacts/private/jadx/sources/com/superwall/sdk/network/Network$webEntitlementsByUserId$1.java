package com.superwall.sdk.network;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.Network", f = "Network.kt", i = {}, l = {144}, m = "webEntitlementsByUserId-5PBZuVg$suspendImpl", n = {}, s = {})
final class Network$webEntitlementsByUserId$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Network this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Network$webEntitlementsByUserId$1(Network network, kotlin.coroutines.d<? super Network$webEntitlementsByUserId$1> dVar) {
        super(dVar);
        this.this$0 = network;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return Network.m59webEntitlementsByUserId5PBZuVg$suspendImpl(this.this$0, null, null, this);
    }
}
