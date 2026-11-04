package com.superwall.sdk.network;

import io.sentry.k4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.Network", f = "Network.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 3}, l = {104, 105, com.planner5d.library.engine.input.f.b.f160745y1, 108, androidx.media3.extractor.metadata.dvbsi.b.f67479d}, m = "getEnrichment-exY8QGI$suspendImpl", n = {"$this", "enrichmentRequest", "maxRetry", k4.f305718l3, "$this", "enrichmentRequest", "maxRetry", k4.f305718l3, "$this", "$this"}, s = {"L$0", "L$1", "I$0", "J$0", "L$0", "L$1", "I$0", "J$0", "L$0", "L$0"})
final class Network$getEnrichment$1 extends kotlin.coroutines.jvm.internal.d {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Network this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Network$getEnrichment$1(Network network, kotlin.coroutines.d<? super Network$getEnrichment$1> dVar) {
        super(dVar);
        this.this$0 = network;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        int i10 = 3 ^ 0;
        return Network.m57getEnrichmentexY8QGI$suspendImpl(this.this$0, null, 0, 0L, this);
    }
}
