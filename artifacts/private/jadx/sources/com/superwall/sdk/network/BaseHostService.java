package com.superwall.sdk.network;

import com.superwall.sdk.dependencies.ApiFactory;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.Task_RetryingKt;
import com.superwall.sdk.models.assignment.AssignmentPostback;
import com.superwall.sdk.models.assignment.ConfirmedAssignmentResponse;
import com.superwall.sdk.models.config.Config;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.models.paywall.Paywalls;
import com.superwall.sdk.network.session.CustomHttpUrlConnection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBaseHostService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseHostService.kt\ncom/superwall/sdk/network/BaseHostService\n+ 2 NetworkService.kt\ncom/superwall/sdk/network/NetworkService\n+ 3 CustomURLSession.kt\ncom/superwall/sdk/network/session/CustomHttpUrlConnection\n+ 4 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,79:1\n20#2,8:80\n43#2:98\n20#2,8:99\n43#2:117\n45#2,8:119\n68#2:137\n20#2,8:138\n43#2:156\n20#2,8:157\n43#2:175\n23#3,9:88\n66#3:97\n23#3,9:107\n66#3:116\n23#3,9:127\n66#3:136\n23#3,9:146\n66#3:155\n23#3,9:165\n66#3:174\n113#4:118\n*S KotlinDebug\n*F\n+ 1 BaseHostService.kt\ncom/superwall/sdk/network/BaseHostService\n*L\n27#1:80,8\n27#1:98\n33#1:99,8\n33#1:117\n36#1:119,8\n36#1:137\n41#1:138,8\n41#1:156\n76#1:157,8\n76#1:175\n27#1:88,9\n27#1:97\n33#1:107,9\n33#1:116\n36#1:127,9\n36#1:136\n41#1:146,9\n41#1:155\n76#1:165,9\n76#1:174\n38#1:118\n*E\n"})
public final class BaseHostService extends NetworkService {

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

    public BaseHostService(@NotNull String host, @NotNull String version, @NotNull ApiFactory factory, @NotNull Json json, @NotNull CustomHttpUrlConnection customHttpUrlConnection) {
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

    public static /* synthetic */ Object paywall$default(BaseHostService baseHostService, String str, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return baseHostService.paywall(str, dVar);
    }

    public static /* synthetic */ Object paywalls$default(BaseHostService baseHostService, boolean z10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return baseHostService.paywalls(z10, dVar);
    }

    @Nullable
    public final Object assignments(@NotNull kotlin.coroutines.d<? super Either<ConfirmedAssignmentResponse, NetworkError>> dVar) {
        return Task_RetryingKt.retrying(NetworkConsts.INSTANCE.retryCount(), null, new BaseHostService$assignments$$inlined$get$default$1(getCustomHttpUrlConnection(), null, this, "assignments", null, UUID.randomUUID().toString(), false), dVar);
    }

    @Nullable
    public final Object config(@NotNull String str, @NotNull kotlin.coroutines.d<? super Either<Config, NetworkError>> dVar) {
        return Task_RetryingKt.retrying(NetworkConsts.INSTANCE.retryCount(), null, new BaseHostService$config$$inlined$get$default$1(getCustomHttpUrlConnection(), null, this, "static_config", CollectionsKt.listOf(new URLQueryItem("pk", this.factory.getStorage().getApiKey())), str, false), dVar);
    }

    @Nullable
    public final Object confirmAssignments(@NotNull AssignmentPostback assignmentPostback, @NotNull kotlin.coroutines.d<? super Either<ConfirmedAssignmentResponse, NetworkError>> dVar) {
        Json json = this.json;
        json.getSerializersModule();
        byte[] bytes = json.encodeToString(AssignmentPostback.Companion.serializer(), assignmentPostback).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return Task_RetryingKt.retrying(6, null, new BaseHostService$confirmAssignments$$inlined$post$default$1(getCustomHttpUrlConnection(), null, this, "confirm_assignments", bytes, UUID.randomUUID().toString(), false), dVar);
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
    public final Object paywall(@Nullable String str, @NotNull kotlin.coroutines.d<? super Either<Paywall, NetworkError>> dVar) {
        List listMutableListOf = CollectionsKt.mutableListOf(new URLQueryItem("pk", this.factory.getStorage().getApiKey()));
        Config config = this.factory.getConfigManager().getConfig();
        if (config != null) {
            if (config.getLocales().contains(this.factory.getDeviceHelper().getLocale())) {
                listMutableListOf.add(new URLQueryItem("locale", this.factory.getDeviceHelper().getLocale()));
            } else {
                String str2 = (String) StringsKt.split$default(this.factory.getDeviceHelper().getLocale(), new String[]{"_"}, false, 0, 6, null).get(0);
                if (config.getLocales().contains(str2)) {
                    listMutableListOf.add(new URLQueryItem("locale", str2));
                }
            }
        }
        return Task_RetryingKt.retrying(NetworkConsts.INSTANCE.retryCount(), null, new BaseHostService$paywall$$inlined$get$default$1(getCustomHttpUrlConnection(), null, this, "paywall/" + str, listMutableListOf, UUID.randomUUID().toString(), true), dVar);
    }

    @Nullable
    public final Object paywalls(boolean z10, @NotNull kotlin.coroutines.d<? super Either<Paywalls, NetworkError>> dVar) {
        return Task_RetryingKt.retrying(NetworkConsts.INSTANCE.retryCount(), null, new BaseHostService$paywalls$$inlined$get$default$1(getCustomHttpUrlConnection(), null, this, "paywalls", null, UUID.randomUUID().toString(), z10), dVar);
    }
}
