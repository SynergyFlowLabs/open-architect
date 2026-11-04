package com.superwall.sdk.network;

import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.dependencies.ApiFactory;
import com.superwall.sdk.models.enrichment.Enrichment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.Network$getEnrichment$2", f = "Network.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
final class Network$getEnrichment$2 extends o implements Function2<Enrichment, kotlin.coroutines.d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Network this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Network$getEnrichment$2(Network network, kotlin.coroutines.d<? super Network$getEnrichment$2> dVar) {
        super(2, dVar);
        this.this$0 = network;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        Network$getEnrichment$2 network$getEnrichment$2 = new Network$getEnrichment$2(this.this$0, dVar);
        network$getEnrichment$2.L$0 = obj;
        return network$getEnrichment$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Enrichment enrichment, kotlin.coroutines.d<? super Unit> dVar) {
        return ((Network$getEnrichment$2) create(enrichment, dVar)).invokeSuspend(Unit.f312394a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            Enrichment enrichment = (Enrichment) this.L$0;
            ApiFactory apiFactory = this.this$0.factory;
            InternalSuperwallEvent.EnrichmentLoad enrichmentLoad = new InternalSuperwallEvent.EnrichmentLoad(new InternalSuperwallEvent.EnrichmentLoad.State.Complete(enrichment));
            this.label = 1;
            if (apiFactory.track(enrichmentLoad, this) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return Unit.f312394a;
    }
}
