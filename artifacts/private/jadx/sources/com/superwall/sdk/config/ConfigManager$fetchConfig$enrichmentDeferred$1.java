package com.superwall.sdk.config;

import com.superwall.sdk.misc.Either;
import com.superwall.sdk.models.enrichment.Enrichment;
import com.superwall.sdk.network.NetworkError;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$enrichmentDeferred$1", f = "ConfigManager.kt", i = {0, 1}, l = {184, 185, 201}, m = "invokeSuspend", n = {"cached", "cached"}, s = {"L$0", "L$0"})
final class ConfigManager$fetchConfig$enrichmentDeferred$1 extends o implements Function2<s0, kotlin.coroutines.d<? super Either<? extends Enrichment, NetworkError>>, Object> {
    final /* synthetic */ i1.a $isEnrichmentFromCache;
    Object L$0;
    int label;
    final /* synthetic */ ConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigManager$fetchConfig$enrichmentDeferred$1(ConfigManager configManager, i1.a aVar, kotlin.coroutines.d<? super ConfigManager$fetchConfig$enrichmentDeferred$1> dVar) {
        super(2, dVar);
        this.this$0 = configManager;
        this.$isEnrichmentFromCache = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new ConfigManager$fetchConfig$enrichmentDeferred$1(this.this$0, this.$isEnrichmentFromCache, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super Either<? extends Enrichment, NetworkError>> dVar) {
        return invoke2(s0Var, (kotlin.coroutines.d<? super Either<Enrichment, NetworkError>>) dVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d0, code lost:
    
        if (r11 == r0) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.config.ConfigManager$fetchConfig$enrichmentDeferred$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super Either<Enrichment, NetworkError>> dVar) {
        return ((ConfigManager$fetchConfig$enrichmentDeferred$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
