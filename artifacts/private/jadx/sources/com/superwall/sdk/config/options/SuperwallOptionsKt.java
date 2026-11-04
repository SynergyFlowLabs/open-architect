package com.superwall.sdk.config.options;

import com.rabbitmq.client.s;
import com.superwall.sdk.logger.LogScope;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSuperwallOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuperwallOptions.kt\ncom/superwall/sdk/config/options/SuperwallOptionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n1#2:138\n1557#3:139\n1628#3,3:140\n*S KotlinDebug\n*F\n+ 1 SuperwallOptions.kt\ncom/superwall/sdk/config/options/SuperwallOptionsKt\n*L\n125#1:139\n125#1:140,3\n*E\n"})
public final class SuperwallOptionsKt {
    @NotNull
    public static final Map<String, Object> toMap(@NotNull SuperwallOptions.NetworkEnvironment networkEnvironment) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "<this>");
        Pair pair = TuplesKt.to("host_domain", networkEnvironment.getHostDomain());
        Pair pair2 = TuplesKt.to("base_host", networkEnvironment.getBaseHost());
        Pair pair3 = TuplesKt.to("collector_host", networkEnvironment.getCollectorHost());
        Pair pair4 = TuplesKt.to("scheme", networkEnvironment.getScheme());
        Integer port = networkEnvironment.getPort();
        return MapsKt.toMap(CollectionsKt.listOfNotNull((Object[]) new Pair[]{pair, pair2, pair3, pair4, port != null ? TuplesKt.to(s.f266031f, Integer.valueOf(port.intValue())) : null}));
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull SuperwallOptions.Logging logging) {
        Intrinsics.checkNotNullParameter(logging, "<this>");
        Pair pair = TuplesKt.to("level", logging.getLevel().toString());
        EnumSet<LogScope> scopes = logging.getScopes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(scopes, 10));
        Iterator<T> it = scopes.iterator();
        while (it.hasNext()) {
            arrayList.add(((LogScope) it.next()).toString());
        }
        return MapsKt.mapOf(pair, TuplesKt.to("scopes", arrayList));
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull SuperwallOptions superwallOptions) {
        Intrinsics.checkNotNullParameter(superwallOptions, "<this>");
        Pair pair = TuplesKt.to("paywalls", PaywallOptionsKt.toMap(superwallOptions.getPaywalls()));
        Pair pair2 = TuplesKt.to("network_environment", toMap(superwallOptions.getNetworkEnvironment()));
        Pair pair3 = TuplesKt.to("is_external_data_collection_enabled", Boolean.valueOf(superwallOptions.isExternalDataCollectionEnabled()));
        String localeIdentifier = superwallOptions.getLocaleIdentifier();
        return MapsKt.toMap(CollectionsKt.listOfNotNull((Object[]) new Pair[]{pair, pair2, pair3, localeIdentifier != null ? TuplesKt.to("locale_identifier", localeIdentifier) : null, TuplesKt.to("is_game_controller_enabled", Boolean.valueOf(superwallOptions.isGameControllerEnabled())), TuplesKt.to("logging", toMap(superwallOptions.getLogging()))}));
    }
}
