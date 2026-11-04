package com.superwall.sdk.config;

import com.superwall.sdk.models.enrichment.Enrichment;
import com.superwall.sdk.storage.LatestEnrichment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$enrichmentDeferred$1$res$1", f = "ConfigManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class ConfigManager$fetchConfig$enrichmentDeferred$1$res$1 extends o implements Function2<Enrichment, kotlin.coroutines.d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigManager$fetchConfig$enrichmentDeferred$1$res$1(ConfigManager configManager, kotlin.coroutines.d<? super ConfigManager$fetchConfig$enrichmentDeferred$1$res$1> dVar) {
        super(2, dVar);
        this.this$0 = configManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        ConfigManager$fetchConfig$enrichmentDeferred$1$res$1 configManager$fetchConfig$enrichmentDeferred$1$res$1 = new ConfigManager$fetchConfig$enrichmentDeferred$1$res$1(this.this$0, dVar);
        configManager$fetchConfig$enrichmentDeferred$1$res$1.L$0 = obj;
        return configManager$fetchConfig$enrichmentDeferred$1$res$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Enrichment enrichment, kotlin.coroutines.d<? super Unit> dVar) {
        return ((ConfigManager$fetchConfig$enrichmentDeferred$1$res$1) create(enrichment, dVar)).invokeSuspend(Unit.f312394a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.this$0.storage.write(LatestEnrichment.INSTANCE, (Enrichment) this.L$0);
        return Unit.f312394a;
    }
}
