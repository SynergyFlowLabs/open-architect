package io.customer.datapipelines.extensions;

import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.f;
import com.segment.analytics.kotlin.core.l;
import io.customer.datapipelines.plugins.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAnalyticsExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsExt.kt\nio/customer/datapipelines/extensions/AnalyticsExtKt\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,38:1\n29#2,3:39\n29#2,3:42\n*S KotlinDebug\n*F\n+ 1 AnalyticsExt.kt\nio/customer/datapipelines/extensions/AnalyticsExtKt\n*L\n25#1:39,3\n29#1:42,3\n*E\n"})
public final class b {
    @NotNull
    public static final Function1<f, Unit> b(@NotNull final tg.a moduleConfig, @Nullable final Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(moduleConfig, "moduleConfig");
        return new Function1() { // from class: io.customer.datapipelines.extensions.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.d(moduleConfig, function1, (f) obj);
            }
        };
    }

    public static /* synthetic */ Function1 c(tg.a aVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        return b(aVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x0048  */
    public static final Unit d(tg.a aVar, Function1 function1, f fVar) {
        Settings settings;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        fVar.Q(aVar.g());
        fVar.R(aVar.h());
        fVar.S(aVar.i());
        fVar.L(false);
        Settings settingsX = fVar.x();
        if (settingsX != null) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            jsonObjectBuilder.put(i.f288340a, l.b());
            Unit unit = Unit.f312394a;
            settings = Settings.h(settingsX, jsonObjectBuilder.build(), null, null, null, null, null, 62, null);
            if (settings == null) {
                JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
                jsonObjectBuilder2.put(i.f288340a, l.b());
                settings = new Settings(jsonObjectBuilder2.build(), (JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, 62, (DefaultConstructorMarker) null);
            }
        } else {
            JsonObjectBuilder jsonObjectBuilder3 = new JsonObjectBuilder();
            jsonObjectBuilder3.put(i.f288340a, l.b());
            settings = new Settings(jsonObjectBuilder3.build(), (JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, 62, (DefaultConstructorMarker) null);
        }
        fVar.O(settings);
        fVar.V(aVar.l());
        fVar.J(aVar.a());
        fVar.M(aVar.e());
        fVar.P(function1);
        return Unit.f312394a;
    }
}
