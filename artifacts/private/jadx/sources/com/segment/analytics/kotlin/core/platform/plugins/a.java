package com.segment.analytics.kotlin.core.platform.plugins;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.utilities.o;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nContextPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextPlugin.kt\ncom/segment/analytics/kotlin/core/platform/plugins/ContextPlugin\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,56:1\n28#2,4:57\n28#2,4:61\n*S KotlinDebug\n*F\n+ 1 ContextPlugin.kt\ncom/segment/analytics/kotlin/core/platform/plugins/ContextPlugin\n*L\n34#1:57,4\n41#1:61,4\n*E\n"})
public final class a implements com.segment.analytics.kotlin.core.platform.e {

    @NotNull
    public static final C1866a Companion = new C1866a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f266897e = "library";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f266898f = "name";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f266899g = "version";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f266900h = "instanceId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.platform.e.b f266901a = com.segment.analytics.kotlin.core.platform.e.b.Before;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f266902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JsonObject f266903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f266904d;

    /* JADX INFO: renamed from: com.segment.analytics.kotlin.core.platform.plugins.a$a, reason: collision with other inner class name */
    public static final class C1866a {
        public /* synthetic */ C1866a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1866a() {
        }
    }

    public a() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        this.f266904d = string;
    }

    private final void e(BaseEvent baseEvent) {
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        o.s(jsonObjectBuilder, baseEvent.e());
        JsonObject jsonObject = this.f266903c;
        if (jsonObject == null) {
            Intrinsics.throwUninitializedPropertyAccessException(f266897e);
            jsonObject = null;
        }
        jsonObjectBuilder.put(f266897e, jsonObject);
        JsonElementBuildersKt.put(jsonObjectBuilder, f266900h, this.f266904d);
        baseEvent.n(jsonObjectBuilder.build());
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public BaseEvent a(@NotNull BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e(event);
        return event;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void b(@NotNull com.segment.analytics.kotlin.core.a analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        com.segment.analytics.kotlin.core.platform.e.a.b(this, analytics);
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "name", "analytics-kotlin");
        JsonElementBuildersKt.put(jsonObjectBuilder, "version", "1.19.2");
        this.f266903c = jsonObjectBuilder.build();
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.platform.e.b c() {
        return this.f266901a;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void f(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f266902b = aVar;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void i(@NotNull Settings settings, @NotNull com.segment.analytics.kotlin.core.platform.e.c cVar) {
        com.segment.analytics.kotlin.core.platform.e.a.c(this, settings, cVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.a j() {
        com.segment.analytics.kotlin.core.a aVar = this.f266902b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }
}
