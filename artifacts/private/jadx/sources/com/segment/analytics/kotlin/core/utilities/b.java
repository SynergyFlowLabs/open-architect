package com.segment.analytics.kotlin.core.utilities;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.l0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Json f266980a = JsonKt.Json$default(null, a.f266981a, 1, null);

    @SourceDebugExtension({"SMAP\nAnySerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnySerializer.kt\ncom/segment/analytics/kotlin/core/utilities/AnySerializerKt$JsonAnySerializer$1\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,33:1\n31#2,3:34\n*S KotlinDebug\n*F\n+ 1 AnySerializer.kt\ncom/segment/analytics/kotlin/core/utilities/AnySerializerKt$JsonAnySerializer$1\n*L\n30#1:34,3\n*E\n"})
    static final class a extends l0 implements Function1<JsonBuilder, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f266981a = new a();

        /* JADX INFO: renamed from: com.segment.analytics.kotlin.core.utilities.b$a$a, reason: collision with other inner class name */
        static final class C1869a extends l0 implements Function1<List<? extends KSerializer<?>>, KSerializer<?>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1869a f266982a = new C1869a();

            C1869a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final KSerializer<?> invoke(@NotNull List<? extends KSerializer<?>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return com.segment.analytics.kotlin.core.utilities.a.f266978a;
            }
        }

        a() {
            super(1);
        }

        public final void c(@NotNull JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            kotlinx.serialization.modules.g gVar = new kotlinx.serialization.modules.g();
            gVar.contextual(j1.d(Object.class), C1869a.f266982a);
            Json.setSerializersModule(gVar.g());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            c(jsonBuilder);
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final Json a() {
        return f266980a;
    }
}
