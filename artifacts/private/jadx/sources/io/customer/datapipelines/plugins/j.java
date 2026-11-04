package io.customer.datapipelines.plugins;

import com.segment.analytics.kotlin.core.BaseEvent;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonPrimitive;
import net.openid.appauth.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nContextPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextPlugin.kt\nio/customer/datapipelines/plugins/DefaultContextPluginEventProcessor\n+ 2 EventManipulationFunctions.kt\ncom/segment/analytics/kotlin/core/utilities/EventTransformer\n*L\n1#1,61:1\n111#2:62\n*S KotlinDebug\n*F\n+ 1 ContextPlugin.kt\nio/customer/datapipelines/plugins/DefaultContextPluginEventProcessor\n*L\n55#1:62\n*E\n"})
public final class j implements g {
    @Override // io.customer.datapipelines.plugins.g
    @NotNull
    public BaseEvent a(@NotNull BaseEvent event, @NotNull io.customer.sdk.data.store.h deviceStore, @NotNull Function0<String> deviceTokenProvider) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(deviceStore, "deviceStore");
        Intrinsics.checkNotNullParameter(deviceTokenProvider, "deviceTokenProvider");
        com.segment.analytics.kotlin.core.utilities.g.k(event, com.segment.analytics.kotlin.android.plugins.a.f266537j, deviceStore.a());
        com.segment.analytics.kotlin.core.utilities.g.s(event, com.segment.analytics.kotlin.core.platform.plugins.a.f266897e);
        JsonPrimitive jsonPrimitive = (JsonPrimitive) CollectionsKt.firstOrNull((List) k.c(event, "device.token"));
        if (jsonPrimitive != null && jsonPrimitive.getContent() != null) {
            return event;
        }
        String strInvoke = deviceTokenProvider.invoke();
        if (strInvoke != null) {
            Json.Default.getSerializersModule();
            com.segment.analytics.kotlin.core.utilities.g.n(event, "device", x.f333313b, strInvoke, b3.f315897a);
        }
        return event;
    }
}
