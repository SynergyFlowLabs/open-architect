package com.segment.analytics.kotlin.core.utilities;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAnySerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnySerializer.kt\ncom/segment/analytics/kotlin/core/utilities/AnySerializer\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,33:1\n26#2:34\n*S KotlinDebug\n*F\n+ 1 AnySerializer.kt\ncom/segment/analytics/kotlin/core/utilities/AnySerializer\n*L\n18#1:34\n*E\n"})
public final class a implements KSerializer<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f266978a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f266979b = new kotlinx.serialization.d(j1.d(Object.class), null, new KSerializer[0]).getDescriptor();

    private a() {
    }

    public static /* synthetic */ void b() {
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public Object deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return "not-implemented";
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f266979b;
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        JsonElement jsonElementF = o.F(value);
        Json.Default.getSerializersModule();
        encoder.encodeSerializableValue(JsonElement.Companion.serializer(), jsonElementF);
    }
}
