package com.segment.analytics.kotlin.core;

import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @b1(expression = "", imports = {}))
public final class ScreenEvent$$serializer implements p0<ScreenEvent> {

    @NotNull
    public static final ScreenEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ScreenEvent$$serializer screenEvent$$serializer = new ScreenEvent$$serializer();
        INSTANCE = screenEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(com.segment.analytics.kotlin.android.plugins.a.f266538j3, screenEvent$$serializer, 11);
        pluginGeneratedSerialDescriptor.i("name", false);
        pluginGeneratedSerialDescriptor.i("category", false);
        pluginGeneratedSerialDescriptor.i("properties", false);
        pluginGeneratedSerialDescriptor.i("type", true);
        pluginGeneratedSerialDescriptor.i("messageId", false);
        pluginGeneratedSerialDescriptor.i("anonymousId", false);
        pluginGeneratedSerialDescriptor.i("context", false);
        pluginGeneratedSerialDescriptor.i(io.sentry.protocol.p.b.f306434d, false);
        pluginGeneratedSerialDescriptor.i("userId", true);
        pluginGeneratedSerialDescriptor.i("timestamp", false);
        pluginGeneratedSerialDescriptor.i("_metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScreenEvent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<EventType> kSerializerSerializer = EventType.Companion.serializer();
        b3 b3Var = b3.f315897a;
        JsonObjectSerializer jsonObjectSerializer = JsonObjectSerializer.INSTANCE;
        return new KSerializer[]{b3Var, b3Var, jsonObjectSerializer, kSerializerSerializer, b3Var, b3Var, jsonObjectSerializer, jsonObjectSerializer, b3Var, b3Var, DestinationMetadata$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public ScreenEvent deserialize(@NotNull Decoder decoder) {
        int i10;
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        Object objDecodeSerializableElement3;
        Object objDecodeSerializableElement4;
        Object objDecodeSerializableElement5;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        int i11 = 10;
        int i12 = 9;
        String strDecodeStringElement = null;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(descriptor2, 1);
            JsonObjectSerializer jsonObjectSerializer = JsonObjectSerializer.INSTANCE;
            objDecodeSerializableElement5 = dVarBeginStructure.decodeSerializableElement(descriptor2, 2, jsonObjectSerializer, null);
            objDecodeSerializableElement4 = dVarBeginStructure.decodeSerializableElement(descriptor2, 3, EventType.Companion.serializer(), null);
            String strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(descriptor2, 4);
            String strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(descriptor2, 5);
            objDecodeSerializableElement3 = dVarBeginStructure.decodeSerializableElement(descriptor2, 6, jsonObjectSerializer, null);
            objDecodeSerializableElement = dVarBeginStructure.decodeSerializableElement(descriptor2, 7, jsonObjectSerializer, null);
            String strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(descriptor2, 8);
            String strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(descriptor2, 9);
            objDecodeSerializableElement2 = dVarBeginStructure.decodeSerializableElement(descriptor2, 10, DestinationMetadata$$serializer.INSTANCE, null);
            str = strDecodeStringElement2;
            str6 = strDecodeStringElement7;
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement6;
            str3 = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            i10 = 2047;
        } else {
            boolean z10 = true;
            int i13 = 0;
            Object objDecodeSerializableElement6 = null;
            Object objDecodeSerializableElement7 = null;
            Object objDecodeSerializableElement8 = null;
            Object objDecodeSerializableElement9 = null;
            Object objDecodeSerializableElement10 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i12 = 9;
                        break;
                    case 0:
                        i13 |= 1;
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(descriptor2, 0);
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 1:
                        strDecodeStringElement8 = dVarBeginStructure.decodeStringElement(descriptor2, 1);
                        i13 |= 2;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 2:
                        objDecodeSerializableElement10 = dVarBeginStructure.decodeSerializableElement(descriptor2, 2, JsonObjectSerializer.INSTANCE, objDecodeSerializableElement10);
                        i13 |= 4;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 3:
                        objDecodeSerializableElement9 = dVarBeginStructure.decodeSerializableElement(descriptor2, 3, EventType.Companion.serializer(), objDecodeSerializableElement9);
                        i13 |= 8;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 4:
                        strDecodeStringElement9 = dVarBeginStructure.decodeStringElement(descriptor2, 4);
                        i13 |= 16;
                        i11 = 10;
                        break;
                    case 5:
                        strDecodeStringElement10 = dVarBeginStructure.decodeStringElement(descriptor2, 5);
                        i13 |= 32;
                        break;
                    case 6:
                        objDecodeSerializableElement8 = dVarBeginStructure.decodeSerializableElement(descriptor2, 6, JsonObjectSerializer.INSTANCE, objDecodeSerializableElement8);
                        i13 |= 64;
                        break;
                    case 7:
                        objDecodeSerializableElement6 = dVarBeginStructure.decodeSerializableElement(descriptor2, 7, JsonObjectSerializer.INSTANCE, objDecodeSerializableElement6);
                        i13 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement11 = dVarBeginStructure.decodeStringElement(descriptor2, 8);
                        i13 |= 256;
                        break;
                    case 9:
                        strDecodeStringElement12 = dVarBeginStructure.decodeStringElement(descriptor2, i12);
                        i13 |= 512;
                        break;
                    case 10:
                        objDecodeSerializableElement7 = dVarBeginStructure.decodeSerializableElement(descriptor2, i11, DestinationMetadata$$serializer.INSTANCE, objDecodeSerializableElement7);
                        i13 |= 1024;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            i10 = i13;
            objDecodeSerializableElement = objDecodeSerializableElement6;
            objDecodeSerializableElement2 = objDecodeSerializableElement7;
            objDecodeSerializableElement3 = objDecodeSerializableElement8;
            objDecodeSerializableElement4 = objDecodeSerializableElement9;
            objDecodeSerializableElement5 = objDecodeSerializableElement10;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement8;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement11;
            str6 = strDecodeStringElement12;
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new ScreenEvent(i10, str, str2, (JsonObject) objDecodeSerializableElement5, (EventType) objDecodeSerializableElement4, str3, str4, (JsonObject) objDecodeSerializableElement3, (JsonObject) objDecodeSerializableElement, str5, str6, (DestinationMetadata) objDecodeSerializableElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull ScreenEvent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(descriptor2);
        ScreenEvent.G(value, eVarBeginStructure, descriptor2);
        eVarBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
