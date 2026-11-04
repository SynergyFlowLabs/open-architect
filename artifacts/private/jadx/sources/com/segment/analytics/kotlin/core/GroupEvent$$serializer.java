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
public final class GroupEvent$$serializer implements p0<GroupEvent> {

    @NotNull
    public static final GroupEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GroupEvent$$serializer groupEvent$$serializer = new GroupEvent$$serializer();
        INSTANCE = groupEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("group", groupEvent$$serializer, 10);
        pluginGeneratedSerialDescriptor.i("groupId", false);
        pluginGeneratedSerialDescriptor.i("traits", false);
        pluginGeneratedSerialDescriptor.i("type", true);
        pluginGeneratedSerialDescriptor.i("messageId", false);
        pluginGeneratedSerialDescriptor.i("anonymousId", false);
        pluginGeneratedSerialDescriptor.i(io.sentry.protocol.p.b.f306434d, false);
        pluginGeneratedSerialDescriptor.i("context", false);
        pluginGeneratedSerialDescriptor.i("userId", true);
        pluginGeneratedSerialDescriptor.i("_metadata", true);
        pluginGeneratedSerialDescriptor.i("timestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GroupEvent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<EventType> kSerializerSerializer = EventType.Companion.serializer();
        b3 b3Var = b3.f315897a;
        JsonObjectSerializer jsonObjectSerializer = JsonObjectSerializer.INSTANCE;
        return new KSerializer[]{b3Var, jsonObjectSerializer, kSerializerSerializer, b3Var, b3Var, jsonObjectSerializer, jsonObjectSerializer, b3Var, DestinationMetadata$$serializer.INSTANCE, b3Var};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public GroupEvent deserialize(@NotNull Decoder decoder) {
        int i10;
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        Object objDecodeSerializableElement3;
        String str;
        Object objDecodeSerializableElement4;
        Object objDecodeSerializableElement5;
        String str2;
        String str3;
        String str4;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        int i11 = 9;
        int i12 = 7;
        String strDecodeStringElement2 = null;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(descriptor2, 0);
            JsonObjectSerializer jsonObjectSerializer = JsonObjectSerializer.INSTANCE;
            objDecodeSerializableElement4 = dVarBeginStructure.decodeSerializableElement(descriptor2, 1, jsonObjectSerializer, null);
            objDecodeSerializableElement5 = dVarBeginStructure.decodeSerializableElement(descriptor2, 2, EventType.Companion.serializer(), null);
            String strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(descriptor2, 3);
            String strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(descriptor2, 4);
            objDecodeSerializableElement3 = dVarBeginStructure.decodeSerializableElement(descriptor2, 5, jsonObjectSerializer, null);
            objDecodeSerializableElement2 = dVarBeginStructure.decodeSerializableElement(descriptor2, 6, jsonObjectSerializer, null);
            String strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(descriptor2, 7);
            objDecodeSerializableElement = dVarBeginStructure.decodeSerializableElement(descriptor2, 8, DestinationMetadata$$serializer.INSTANCE, null);
            str = strDecodeStringElement3;
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(descriptor2, 9);
            str4 = strDecodeStringElement6;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            i10 = 1023;
        } else {
            boolean z10 = true;
            int i13 = 0;
            Object objDecodeSerializableElement6 = null;
            Object objDecodeSerializableElement7 = null;
            Object objDecodeSerializableElement8 = null;
            Object objDecodeSerializableElement9 = null;
            Object objDecodeSerializableElement10 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i11 = 9;
                        break;
                    case 0:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(descriptor2, 0);
                        i13 |= 1;
                        i11 = 9;
                        i12 = 7;
                        break;
                    case 1:
                        objDecodeSerializableElement9 = dVarBeginStructure.decodeSerializableElement(descriptor2, 1, JsonObjectSerializer.INSTANCE, objDecodeSerializableElement9);
                        i13 |= 2;
                        i11 = 9;
                        i12 = 7;
                        break;
                    case 2:
                        objDecodeSerializableElement10 = dVarBeginStructure.decodeSerializableElement(descriptor2, 2, EventType.Companion.serializer(), objDecodeSerializableElement10);
                        i13 |= 4;
                        i11 = 9;
                        i12 = 7;
                        break;
                    case 3:
                        strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(descriptor2, 3);
                        i13 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement8 = dVarBeginStructure.decodeStringElement(descriptor2, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        objDecodeSerializableElement8 = dVarBeginStructure.decodeSerializableElement(descriptor2, 5, JsonObjectSerializer.INSTANCE, objDecodeSerializableElement8);
                        i13 |= 32;
                        break;
                    case 6:
                        objDecodeSerializableElement7 = dVarBeginStructure.decodeSerializableElement(descriptor2, 6, JsonObjectSerializer.INSTANCE, objDecodeSerializableElement7);
                        i13 |= 64;
                        break;
                    case 7:
                        strDecodeStringElement9 = dVarBeginStructure.decodeStringElement(descriptor2, i12);
                        i13 |= 128;
                        break;
                    case 8:
                        objDecodeSerializableElement6 = dVarBeginStructure.decodeSerializableElement(descriptor2, 8, DestinationMetadata$$serializer.INSTANCE, objDecodeSerializableElement6);
                        i13 |= 256;
                        break;
                    case 9:
                        strDecodeStringElement10 = dVarBeginStructure.decodeStringElement(descriptor2, i11);
                        i13 |= 512;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            i10 = i13;
            objDecodeSerializableElement = objDecodeSerializableElement6;
            objDecodeSerializableElement2 = objDecodeSerializableElement7;
            objDecodeSerializableElement3 = objDecodeSerializableElement8;
            str = strDecodeStringElement2;
            objDecodeSerializableElement4 = objDecodeSerializableElement9;
            objDecodeSerializableElement5 = objDecodeSerializableElement10;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement9;
            strDecodeStringElement = strDecodeStringElement10;
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new GroupEvent(i10, str, (JsonObject) objDecodeSerializableElement4, (EventType) objDecodeSerializableElement5, str2, str3, (JsonObject) objDecodeSerializableElement3, (JsonObject) objDecodeSerializableElement2, str4, (DestinationMetadata) objDecodeSerializableElement, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull GroupEvent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(descriptor2);
        GroupEvent.D(value, eVarBeginStructure, descriptor2);
        eVarBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
