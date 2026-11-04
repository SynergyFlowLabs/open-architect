package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlinx.serialization.c0;
import kotlinx.serialization.d0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.internal.a1;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.q;
import kotlinx.serialization.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPolymorphic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n*L\n1#1,109:1\n1#2:110\n270#3,8:111\n*S KotlinDebug\n*F\n+ 1 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n*L\n83#1:111,8\n*E\n"})
public final class PolymorphicKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClassDiscriminatorMode.values().length];
            try {
                iArr[ClassDiscriminatorMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void checkKind(@NotNull l kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind instanceof l.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof kotlinx.serialization.descriptors.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    @NotNull
    public static final String classDiscriminator(@NotNull SerialDescriptor serialDescriptor, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof JsonClassDiscriminator) {
                return ((JsonClassDiscriminator) annotation).discriminator();
            }
        }
        return json.getConfiguration().getClassDiscriminator();
    }

    public static final <T> T decodeSerializableValuePolymorphic(@NotNull JsonDecoder jsonDecoder, @NotNull kotlinx.serialization.e<? extends T> deserializer, @NotNull Function0<String> path) {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(jsonDecoder, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(path, "path");
        if (!(deserializer instanceof kotlinx.serialization.internal.b) || jsonDecoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            return deserializer.deserialize(jsonDecoder);
        }
        kotlinx.serialization.internal.b bVar = (kotlinx.serialization.internal.b) deserializer;
        String strClassDiscriminator = classDiscriminator(bVar.getDescriptor(), jsonDecoder.getJson());
        JsonElement jsonElementDecodeJsonElement = jsonDecoder.decodeJsonElement();
        String serialName = bVar.getDescriptor().getSerialName();
        if (jsonElementDecodeJsonElement instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonElementDecodeJsonElement;
            JsonElement jsonElement = (JsonElement) jsonObject.get((Object) strClassDiscriminator);
            try {
                kotlinx.serialization.e eVarA = q.a((kotlinx.serialization.internal.b) deserializer, jsonDecoder, (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive));
                Intrinsics.checkNotNull(eVarA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return (T) TreeJsonDecoderKt.readPolymorphicJson(jsonDecoder.getJson(), strClassDiscriminator, jsonObject, eVarA);
            } catch (c0 e10) {
                String message = e10.getMessage();
                Intrinsics.checkNotNull(message);
                throw JsonExceptionsKt.JsonDecodingException(-1, message, jsonObject.toString());
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonObject.class).Q() + ", but had " + j1.d(jsonElementDecodeJsonElement.getClass()).Q() + " as the serialized body of " + serialName + " at element: " + path.invoke(), jsonElementDecodeJsonElement.toString());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void encodePolymorphically(@NotNull JsonEncoder jsonEncoder, @NotNull d0<? super T> serializer, T t10, @NotNull Function2<? super String, ? super String, Unit> ifPolymorphic) {
        String strClassDiscriminator;
        Intrinsics.checkNotNullParameter(jsonEncoder, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(ifPolymorphic, "ifPolymorphic");
        if (jsonEncoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(jsonEncoder, t10);
            return;
        }
        boolean z10 = serializer instanceof kotlinx.serialization.internal.b;
        if (!z10) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[jsonEncoder.getJson().getConfiguration().getClassDiscriminatorMode().ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    throw new k0();
                }
                l kind = serializer.getDescriptor().getKind();
                strClassDiscriminator = (Intrinsics.areEqual(kind, m.a.f315861a) || Intrinsics.areEqual(kind, m.d.f315864a)) ? classDiscriminator(serializer.getDescriptor(), jsonEncoder.getJson()) : null;
            }
        } else if (jsonEncoder.getJson().getConfiguration().getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE) {
        }
        if (z10) {
            kotlinx.serialization.internal.b bVar = (kotlinx.serialization.internal.b) serializer;
            if (t10 == 0) {
                throw new IllegalArgumentException(("Value for serializer " + bVar.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            d0<? super T> d0VarB = q.b(bVar, jsonEncoder, t10);
            if (strClassDiscriminator != null) {
                validateIfSealed(serializer, d0VarB, strClassDiscriminator);
                checkKind(d0VarB.getDescriptor().getKind());
            }
            Intrinsics.checkNotNull(d0VarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = d0VarB;
        }
        if (strClassDiscriminator != null) {
            ifPolymorphic.invoke(strClassDiscriminator, serializer.getDescriptor().getSerialName());
        }
        serializer.serialize(jsonEncoder, t10);
    }

    @NotNull
    public static final Void throwJsonElementPolymorphicException(@Nullable String str, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new JsonEncodingException("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + j1.d(element.getClass()).Q() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateIfSealed(d0<?> d0Var, d0<?> d0Var2, String str) {
        if ((d0Var instanceof v) && a1.a(d0Var2.getDescriptor()).contains(str)) {
            String serialName = ((v) d0Var).getDescriptor().getSerialName();
            throw new IllegalStateException(("Sealed class '" + d0Var2.getDescriptor().getSerialName() + "' cannot be serialized as base class '" + serialName + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
