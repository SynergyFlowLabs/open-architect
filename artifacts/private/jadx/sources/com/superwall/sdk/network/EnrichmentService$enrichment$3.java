package com.superwall.sdk.network;

import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.Task_RetryingKt;
import com.superwall.sdk.models.enrichment.Enrichment;
import com.superwall.sdk.models.enrichment.EnrichmentRequest;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.EnrichmentService$enrichment$3", f = "EnrichmentService.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nEnrichmentService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnrichmentService.kt\ncom/superwall/sdk/network/EnrichmentService$enrichment$3\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 NetworkService.kt\ncom/superwall/sdk/network/NetworkService\n+ 4 CustomURLSession.kt\ncom/superwall/sdk/network/session/CustomHttpUrlConnection\n*L\n1#1,35:1\n113#2:36\n45#3,8:37\n68#3:55\n23#4,9:45\n66#4:54\n*S KotlinDebug\n*F\n+ 1 EnrichmentService.kt\ncom/superwall/sdk/network/EnrichmentService$enrichment$3\n*L\n31#1:36\n28#1:37,8\n28#1:55\n28#1:45,9\n28#1:54\n*E\n"})
final class EnrichmentService$enrichment$3 extends o implements Function1<kotlin.coroutines.d<? super Either<? extends Enrichment, NetworkError>>, Object> {
    final /* synthetic */ EnrichmentRequest $enrichmentRequest;
    final /* synthetic */ int $maxRetry;
    int label;
    final /* synthetic */ EnrichmentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnrichmentService$enrichment$3(EnrichmentService enrichmentService, EnrichmentRequest enrichmentRequest, int i10, kotlin.coroutines.d<? super EnrichmentService$enrichment$3> dVar) {
        super(1, dVar);
        this.this$0 = enrichmentService;
        this.$enrichmentRequest = enrichmentRequest;
        this.$maxRetry = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new EnrichmentService$enrichment$3(this.this$0, this.$enrichmentRequest, this.$maxRetry, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.d<? super Either<? extends Enrichment, NetworkError>> dVar) {
        return invoke2((kotlin.coroutines.d<? super Either<Enrichment, NetworkError>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return obj;
        }
        ResultKt.m(obj);
        Json json = this.this$0.getFactory().json();
        EnrichmentRequest enrichmentRequest = this.$enrichmentRequest;
        json.getSerializersModule();
        byte[] bytes = json.encodeToString(EnrichmentRequest.Companion.serializer(), enrichmentRequest).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        EnrichmentService enrichmentService = this.this$0;
        int i11 = this.$maxRetry;
        EnrichmentService$enrichment$3$invokeSuspend$$inlined$post$default$1 enrichmentService$enrichment$3$invokeSuspend$$inlined$post$default$1 = new EnrichmentService$enrichment$3$invokeSuspend$$inlined$post$default$1(enrichmentService.getCustomHttpUrlConnection(), null, enrichmentService, "enrich", bytes, UUID.randomUUID().toString(), false);
        this.label = 1;
        Object objRetrying = Task_RetryingKt.retrying(i11, null, enrichmentService$enrichment$3$invokeSuspend$$inlined$post$default$1, this);
        return objRetrying == objL ? objL : objRetrying;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(kotlin.coroutines.d<? super Either<Enrichment, NetworkError>> dVar) {
        return ((EnrichmentService$enrichment$3) create(dVar)).invokeSuspend(Unit.f312394a);
    }
}
