package uf;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDeepLinkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeepLinkUtils.kt\ncom/segment/analytics/kotlin/android/utilities/DeepLinkUtils\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,58:1\n28#2,4:59\n*S KotlinDebug\n*F\n+ 1 DeepLinkUtils.kt\ncom/segment/analytics/kotlin/android/utilities/DeepLinkUtils\n*L\n38#1:59,4\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.a f381251a;

    public b(@NotNull com.segment.analytics.kotlin.core.a analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f381251a = analytics;
    }

    @NotNull
    public final JsonObject a(@Nullable String str, @Nullable Uri uri) {
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        if (str != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "referrer", str);
        }
        if (uri != null) {
            if (uri.isHierarchical()) {
                for (String parameter : uri.getQueryParameterNames()) {
                    String queryParameter = uri.getQueryParameter(parameter);
                    if (queryParameter != null && StringsKt.E5(queryParameter).toString().length() > 0) {
                        Intrinsics.checkNotNullExpressionValue(parameter, "parameter");
                        JsonElementBuildersKt.put(jsonObjectBuilder, parameter, queryParameter);
                    }
                }
            }
            JsonElementBuildersKt.put(jsonObjectBuilder, "url", uri.toString());
        }
        return jsonObjectBuilder.build();
    }

    @NotNull
    public final com.segment.analytics.kotlin.core.a b() {
        return this.f381251a;
    }

    public final void c(@Nullable String str, @Nullable Intent intent) {
        if (intent != null && intent.getData() != null) {
            com.segment.analytics.kotlin.core.a.z0(this.f381251a, "Deep Link Opened", a(str, intent.getData()), null, 4, null);
        }
    }
}
