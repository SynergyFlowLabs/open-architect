package com.superwall.sdk.network;

import com.superwall.sdk.dependencies.ApiFactory;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.EitherKt;
import com.superwall.sdk.models.enrichment.Enrichment;
import com.superwall.sdk.models.enrichment.EnrichmentRequest;
import com.superwall.sdk.network.session.CustomHttpUrlConnection;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class EnrichmentService extends NetworkService {

    @NotNull
    private final CustomHttpUrlConnection customHttpUrlConnection;

    @NotNull
    private final ApiFactory factory;

    @NotNull
    private final String host;

    @NotNull
    private final String version;

    public EnrichmentService(@NotNull String host, @NotNull String version, @NotNull ApiFactory factory, @NotNull CustomHttpUrlConnection customHttpUrlConnection) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(customHttpUrlConnection, "customHttpUrlConnection");
        this.host = host;
        this.version = version;
        this.factory = factory;
        this.customHttpUrlConnection = customHttpUrlConnection;
    }

    /* JADX INFO: renamed from: enrichment-exY8QGI$default, reason: not valid java name */
    public static /* synthetic */ Object m55enrichmentexY8QGI$default(EnrichmentService enrichmentService, EnrichmentRequest enrichmentRequest, int i10, long j10, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            kotlin.time.c.a aVar = kotlin.time.c.f313406b;
            j10 = kotlin.time.e.m0(1, kotlin.time.f.SECONDS);
        }
        return enrichmentService.m56enrichmentexY8QGI(enrichmentRequest, i12, j10, dVar);
    }

    @Nullable
    /* JADX INFO: renamed from: enrichment-exY8QGI, reason: not valid java name */
    public final Object m56enrichmentexY8QGI(@NotNull EnrichmentRequest enrichmentRequest, int i10, long j10, @NotNull kotlin.coroutines.d<? super Either<Enrichment, NetworkError>> dVar) {
        return EitherKt.m26eitherWithTimeoutrnQQ1Ag(j10, new Function0() { // from class: com.superwall.sdk.network.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NetworkError.Timeout.INSTANCE;
            }
        }, new EnrichmentService$enrichment$3(this, enrichmentRequest, i10, null), dVar);
    }

    @Override // com.superwall.sdk.network.NetworkService
    @NotNull
    public CustomHttpUrlConnection getCustomHttpUrlConnection() {
        return this.customHttpUrlConnection;
    }

    @NotNull
    public final ApiFactory getFactory() {
        return this.factory;
    }

    @Override // com.superwall.sdk.network.NetworkService
    @NotNull
    public String getHost() {
        return this.host;
    }

    @Override // com.superwall.sdk.network.NetworkService
    @NotNull
    public String getVersion() {
        return this.version;
    }

    @Override // com.superwall.sdk.network.NetworkService
    @Nullable
    public Object makeHeaders(boolean z10, @NotNull String str, @NotNull kotlin.coroutines.d<? super Map<String, String>> dVar) {
        return this.factory.makeHeaders(z10, str, dVar);
    }
}
