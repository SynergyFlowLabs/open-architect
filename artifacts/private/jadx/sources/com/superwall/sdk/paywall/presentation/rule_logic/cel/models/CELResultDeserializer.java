package com.superwall.sdk.paywall.presentation.rule_logic.cel.models;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPassableValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PassableValues.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/models/CELResultDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Json.kt\nkotlinx/serialization/json/JsonKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,154:1\n1#2:155\n309#3:156\n315#4,8:157\n315#4,8:165\n*S KotlinDebug\n*F\n+ 1 PassableValues.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/models/CELResultDeserializer\n*L\n121#1:156\n110#1:157,8\n111#1:165,8\n*E\n"})
public final class CELResultDeserializer implements KSerializer<CELResult> {

    @NotNull
    public static final CELResultDeserializer INSTANCE = new CELResultDeserializer();

    @NotNull
    private static final SerialDescriptor descriptor = k.e("CELResult", new SerialDescriptor[0], new Function1() { // from class: com.superwall.sdk.paywall.presentation.rule_logic.cel.models.a
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return CELResultDeserializer.descriptor$lambda$0((kotlinx.serialization.descriptors.a) obj);
        }
    });

    private CELResultDeserializer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit descriptor$lambda$0(kotlinx.serialization.descriptors.a buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        List<? extends Annotation> listEmptyList = CollectionsKt.emptyList();
        JsonElement.Companion companion = JsonElement.Companion;
        buildClassSerialDescriptor.a("Ok", companion.serializer().getDescriptor(), listEmptyList, false);
        buildClassSerialDescriptor.a("Err", companion.serializer().getDescriptor(), CollectionsKt.emptyList(), false);
        return Unit.f312394a;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public CELResult deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof JsonDecoder)) {
            throw new IllegalArgumentException("This deserializer can be used only with Json format");
        }
        JsonDecoder jsonDecoder = (JsonDecoder) decoder;
        JsonElement jsonElementDecodeJsonElement = jsonDecoder.decodeJsonElement();
        if (!JsonElementKt.getJsonObject(jsonElementDecodeJsonElement).containsKey((Object) "Ok")) {
            if (!JsonElementKt.getJsonObject(jsonElementDecodeJsonElement).containsKey((Object) "Err")) {
                throw new c0("Unknown result type");
            }
            Object obj = JsonElementKt.getJsonObject(jsonElementDecodeJsonElement).get((Object) "Err");
            Intrinsics.checkNotNull(obj);
            return new CELResult.Err(JsonElementKt.getJsonPrimitive((JsonElement) obj).getContent());
        }
        Object obj2 = JsonElementKt.getJsonObject(jsonElementDecodeJsonElement).get((Object) "Ok");
        Intrinsics.checkNotNull(obj2);
        Json json = jsonDecoder.getJson();
        json.getSerializersModule();
        return new CELResult.Ok((PassableValue) json.decodeFromJsonElement(PassableValue.Companion.serializer(), (JsonElement) obj2));
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull CELResult value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new l0("An operation is not implemented: Serialization not needed");
    }
}
