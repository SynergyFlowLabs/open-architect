package com.segment.analytics.kotlin.core.platform.plugins;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.json.Json;
import net.openid.appauth.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDeviceToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceToken.kt\ncom/segment/analytics/kotlin/core/platform/plugins/DeviceToken\n+ 2 EventManipulationFunctions.kt\ncom/segment/analytics/kotlin/core/utilities/EventTransformer\n*L\n1#1,34:1\n111#2:35\n*S KotlinDebug\n*F\n+ 1 DeviceToken.kt\ncom/segment/analytics/kotlin/core/platform/plugins/DeviceToken\n*L\n16#1:35\n*E\n"})
public final class c implements com.segment.analytics.kotlin.core.platform.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f266908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private com.segment.analytics.kotlin.core.platform.e.b f266909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f266910c;

    public c(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f266908a = token;
        this.f266909b = com.segment.analytics.kotlin.core.platform.e.b.Before;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public BaseEvent a(@NotNull BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = this.f266908a;
        Json.Default.getSerializersModule();
        com.segment.analytics.kotlin.core.utilities.g.n(event, "device", x.f333313b, str, b3.f315897a);
        return event;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void b(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        com.segment.analytics.kotlin.core.platform.e.a.b(this, aVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.platform.e.b c() {
        return this.f266909b;
    }

    @NotNull
    public final String e() {
        return this.f266908a;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void f(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f266910c = aVar;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void i(@NotNull Settings settings, @NotNull com.segment.analytics.kotlin.core.platform.e.c cVar) {
        com.segment.analytics.kotlin.core.platform.e.a.c(this, settings, cVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.a j() {
        com.segment.analytics.kotlin.core.a aVar = this.f266910c;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void m(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266908a = str;
    }

    public void n(@NotNull com.segment.analytics.kotlin.core.platform.e.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f266909b = bVar;
    }
}
