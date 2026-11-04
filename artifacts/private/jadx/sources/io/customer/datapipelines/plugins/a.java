package io.customer.datapipelines.plugins;

import com.devtodev.core.data.metrics.MetricConsts;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.TrackEvent;
import com.segment.analytics.kotlin.core.utilities.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAutoTrackDeviceAttributesPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoTrackDeviceAttributesPlugin.kt\nio/customer/datapipelines/plugins/AutoTrackDeviceAttributesPlugin\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n29#2,2:49\n31#2:52\n1#3:51\n*S KotlinDebug\n*F\n+ 1 AutoTrackDeviceAttributesPlugin.kt\nio/customer/datapipelines/plugins/AutoTrackDeviceAttributesPlugin\n*L\n30#1:49,2\n30#1:52\n*E\n"})
public final class a implements com.segment.analytics.kotlin.core.platform.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.platform.e.b f288317a = com.segment.analytics.kotlin.core.platform.e.b.Before;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f288318b;

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public BaseEvent a(@NotNull BaseEvent event) {
        JsonObject jsonObject;
        JsonObject jsonObject2;
        Intrinsics.checkNotNullParameter(event, "event");
        TrackEvent trackEvent = event instanceof TrackEvent ? (TrackEvent) event : null;
        if (!Intrinsics.areEqual(trackEvent != null ? trackEvent.z() : null, mh.a.f332663b)) {
            return event;
        }
        TrackEvent trackEvent2 = (TrackEvent) event;
        JsonObject jsonObjectE = trackEvent2.e();
        JsonObject jsonObjectA = trackEvent2.A();
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        o.s(jsonObjectBuilder, jsonObjectA);
        JsonElement jsonElement = (JsonElement) jsonObjectE.get((Object) com.segment.analytics.kotlin.android.plugins.a.f266547p0);
        if (jsonElement != null && (jsonObject2 = JsonElementKt.getJsonObject(jsonElement)) != null) {
            JsonElement jsonElement2 = (JsonElement) jsonObject2.get((Object) com.segment.analytics.kotlin.android.plugins.a.f266548p1);
            if (jsonElement2 != null) {
                jsonObjectBuilder.put("network_bluetooth", jsonElement2);
            }
            JsonElement jsonElement3 = (JsonElement) jsonObject2.get((Object) com.segment.analytics.kotlin.android.plugins.a.H1);
            if (jsonElement3 != null) {
                jsonObjectBuilder.put("network_cellular", jsonElement3);
            }
            JsonElement jsonElement4 = (JsonElement) jsonObject2.get((Object) com.segment.analytics.kotlin.android.plugins.a.f266549p2);
            if (jsonElement4 != null) {
                jsonObjectBuilder.put("network_wifi", jsonElement4);
            }
        }
        JsonElement jsonElement5 = (JsonElement) jsonObjectE.get((Object) com.segment.analytics.kotlin.android.plugins.a.f266538j3);
        if (jsonElement5 != null && (jsonObject = JsonElementKt.getJsonObject(jsonElement5)) != null) {
            JsonElement jsonElement6 = (JsonElement) jsonObject.get((Object) "width");
            if (jsonElement6 != null) {
                jsonObjectBuilder.put("screen_width", jsonElement6);
            }
            JsonElement jsonElement7 = (JsonElement) jsonObject.get((Object) "height");
            if (jsonElement7 != null) {
                jsonObjectBuilder.put("screen_height", jsonElement7);
            }
        }
        JsonElement jsonElement8 = (JsonElement) jsonObjectE.get((Object) MetricConsts.InGamePurchase);
        if (jsonElement8 != null) {
            jsonObjectBuilder.put(MetricConsts.InGamePurchase, jsonElement8);
        }
        JsonElement jsonElement9 = (JsonElement) jsonObjectE.get((Object) "timezone");
        if (jsonElement9 != null) {
            jsonObjectBuilder.put("timezone", jsonElement9);
        }
        trackEvent2.C(jsonObjectBuilder.build());
        return event;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void b(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        com.segment.analytics.kotlin.core.platform.e.a.b(this, aVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.platform.e.b c() {
        return this.f288317a;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void f(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f288318b = aVar;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void i(@NotNull Settings settings, @NotNull com.segment.analytics.kotlin.core.platform.e.c cVar) {
        com.segment.analytics.kotlin.core.platform.e.a.c(this, settings, cVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.a j() {
        com.segment.analytics.kotlin.core.a aVar = this.f288318b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }
}
