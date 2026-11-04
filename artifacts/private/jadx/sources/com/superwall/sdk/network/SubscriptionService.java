package com.superwall.sdk.network;

import com.superwall.sdk.dependencies.ApiFactory;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.Task_RetryingKt;
import com.superwall.sdk.models.entitlements.RedeemRequest;
import com.superwall.sdk.models.entitlements.Redeemable;
import com.superwall.sdk.models.entitlements.TransactionReceipt;
import com.superwall.sdk.models.entitlements.WebEntitlements;
import com.superwall.sdk.models.internal.DeviceVendorId;
import com.superwall.sdk.models.internal.WebRedemptionResponse;
import com.superwall.sdk.network.session.CustomHttpUrlConnection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSubscriptionService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionService.kt\ncom/superwall/sdk/network/SubscriptionService\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 NetworkService.kt\ncom/superwall/sdk/network/NetworkService\n+ 4 CustomURLSession.kt\ncom/superwall/sdk/network/session/CustomHttpUrlConnection\n*L\n1#1,72:1\n113#2:73\n45#3,8:74\n68#3:92\n20#3,8:93\n43#3:111\n20#3,8:112\n43#3:130\n23#4,9:82\n66#4:91\n23#4,9:101\n66#4:110\n23#4,9:120\n66#4:129\n*S KotlinDebug\n*F\n+ 1 SubscriptionService.kt\ncom/superwall/sdk/network/SubscriptionService\n*L\n46#1:73\n41#1:74,8\n41#1:92\n61#1:93,8\n61#1:111\n67#1:112,8\n67#1:130\n41#1:82,9\n41#1:91\n61#1:101,9\n61#1:110\n67#1:120,9\n67#1:129\n*E\n"})
public final class SubscriptionService extends NetworkService {

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

    public SubscriptionService(@NotNull String host, @NotNull String version, @NotNull ApiFactory factory, @NotNull Json json, @NotNull CustomHttpUrlConnection customHttpUrlConnection) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(customHttpUrlConnection, "customHttpUrlConnection");
        this.host = host;
        this.version = version;
        this.factory = factory;
        this.customHttpUrlConnection = customHttpUrlConnection;
        this.json = JsonKt.Json(json, new Function1() { // from class: com.superwall.sdk.network.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubscriptionService.json$lambda$0((JsonBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setNamingStrategy(null);
        Json.setExplicitNulls(false);
        Json.setIgnoreUnknownKeys(true);
        return Unit.f312394a;
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

    @Nullable
    /* JADX INFO: renamed from: redeemToken-mylZ20U, reason: not valid java name */
    public final Object m63redeemTokenmylZ20U(@NotNull List<Redeemable> list, @Nullable String str, @Nullable String str2, @NotNull DeviceVendorId deviceVendorId, @NotNull List<TransactionReceipt> list2, @NotNull String str3, @NotNull kotlin.coroutines.d<? super Either<WebRedemptionResponse, NetworkError>> dVar) {
        Json json = this.json;
        RedeemRequest redeemRequest = new RedeemRequest(deviceVendorId.getValue(), str == null ? null : str, str2, list, list2, str3);
        json.getSerializersModule();
        byte[] bytes = json.encodeToString(RedeemRequest.Companion.serializer(), redeemRequest).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return Task_RetryingKt.retrying(0, null, new SubscriptionService$redeemTokenmylZ20U$$inlined$post$default$1(getCustomHttpUrlConnection(), null, this, "redeem", bytes, UUID.randomUUID().toString(), false), dVar);
    }

    @Nullable
    public final Object webEntitlementsByDeviceId(@NotNull DeviceVendorId deviceVendorId, @NotNull kotlin.coroutines.d<? super Either<WebEntitlements, NetworkError>> dVar) {
        return Task_RetryingKt.retrying(NetworkConsts.INSTANCE.retryCount(), null, new SubscriptionService$webEntitlementsByDeviceId$$inlined$get$default$1(getCustomHttpUrlConnection(), null, this, "users/" + deviceVendorId.getValue() + "/entitlements", CollectionsKt.listOf(new URLQueryItem("deviceId", deviceVendorId.getValue())), UUID.randomUUID().toString(), false), dVar);
    }

    @Nullable
    /* JADX INFO: renamed from: webEntitlementsByUserId-AKGx8qU, reason: not valid java name */
    public final Object m64webEntitlementsByUserIdAKGx8qU(@Nullable String str, @NotNull DeviceVendorId deviceVendorId, @NotNull kotlin.coroutines.d<? super Either<WebEntitlements, NetworkError>> dVar) {
        if (str == null) {
            str = deviceVendorId.getValue();
        }
        int i10 = 5 | 0;
        return Task_RetryingKt.retrying(NetworkConsts.INSTANCE.retryCount(), null, new SubscriptionService$webEntitlementsByUserIdAKGx8qU$$inlined$get$default$1(getCustomHttpUrlConnection(), null, this, "users/" + str + "/entitlements", CollectionsKt.listOf(new URLQueryItem("deviceId", deviceVendorId.getValue())), UUID.randomUUID().toString(), false), dVar);
    }
}
