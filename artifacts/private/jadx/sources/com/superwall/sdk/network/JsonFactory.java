package com.superwall.sdk.network;

import com.superwall.sdk.models.paywall.LocalNotificationType;
import com.superwall.sdk.models.paywall.LocalNotificationTypeSerializer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonNamingStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface JsonFactory {

    @SourceDebugExtension({"SMAP\nJsonFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonFactory.kt\ncom/superwall/sdk/network/JsonFactory$DefaultImpls\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,20:1\n21#2:21\n*S KotlinDebug\n*F\n+ 1 JsonFactory.kt\ncom/superwall/sdk/network/JsonFactory$DefaultImpls\n*L\n15#1:21\n*E\n"})
    public static final class DefaultImpls {
        @NotNull
        public static Json json(@NotNull JsonFactory jsonFactory) {
            return JsonKt.Json$default(null, new Function1() { // from class: com.superwall.sdk.network.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return JsonFactory.DefaultImpls.json$lambda$0((JsonBuilder) obj);
                }
            }, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit json$lambda$0(JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setEncodeDefaults(true);
            Json.setNamingStrategy(JsonNamingStrategy.Builtins.getSnakeCase());
            Json.setSerializersModule(kotlinx.serialization.modules.h.f(j1.d(LocalNotificationType.class), LocalNotificationTypeSerializer.INSTANCE));
            return Unit.f312394a;
        }
    }

    @NotNull
    Json json();
}
