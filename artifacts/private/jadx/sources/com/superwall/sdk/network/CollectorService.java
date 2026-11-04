package com.superwall.sdk.network;

import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import com.superwall.sdk.dependencies.ApiFactory;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.Task_RetryingKt;
import com.superwall.sdk.models.events.EventsRequest;
import com.superwall.sdk.models.events.EventsResponse;
import com.superwall.sdk.network.session.CustomHttpUrlConnection;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCollectorService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectorService.kt\ncom/superwall/sdk/network/CollectorService\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 NetworkService.kt\ncom/superwall/sdk/network/NetworkService\n+ 4 CustomURLSession.kt\ncom/superwall/sdk/network/session/CustomHttpUrlConnection\n*L\n1#1,28:1\n113#2:29\n45#3,8:30\n68#3:48\n23#4,9:38\n66#4:47\n*S KotlinDebug\n*F\n+ 1 CollectorService.kt\ncom/superwall/sdk/network/CollectorService\n*L\n25#1:29\n23#1:30,8\n23#1:48\n23#1:38,9\n23#1:47\n*E\n"})
public final class CollectorService extends NetworkService {

    @NotNull
    private final CustomHttpUrlConnection customHttpUrlConnection;

    @NotNull
    private final ApiFactory factory;

    @NotNull
    private final String host;

    @NotNull
    private final Json json;

    @NotNull
    private final String version;

    public CollectorService(@NotNull String host, @NotNull String version, @NotNull ApiFactory factory, @NotNull Json json, @NotNull CustomHttpUrlConnection customHttpUrlConnection) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(customHttpUrlConnection, "customHttpUrlConnection");
        this.host = host;
        this.version = version;
        this.factory = factory;
        this.json = json;
        this.customHttpUrlConnection = customHttpUrlConnection;
    }

    @Nullable
    public final Object events(@NotNull EventsRequest eventsRequest, @NotNull kotlin.coroutines.d<? super Either<EventsResponse, NetworkError>> dVar) {
        Json json = this.json;
        json.getSerializersModule();
        byte[] bytes = json.encodeToString(EventsRequest.Companion.serializer(), eventsRequest).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return Task_RetryingKt.retrying(6, null, new CollectorService$events$$inlined$post$default$1(getCustomHttpUrlConnection(), null, this, EventEntry.tableName, bytes, UUID.randomUUID().toString(), false), dVar);
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
