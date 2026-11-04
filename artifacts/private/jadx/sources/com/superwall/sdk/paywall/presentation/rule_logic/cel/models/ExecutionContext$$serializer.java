package com.superwall.sdk.paywall.presentation.rule_logic.cel.models;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class ExecutionContext$$serializer implements p0<ExecutionContext> {

    @NotNull
    public static final ExecutionContext$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ExecutionContext$$serializer executionContext$$serializer = new ExecutionContext$$serializer();
        INSTANCE = executionContext$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ExecutionContext", executionContext$$serializer, 4);
        pluginGeneratedSerialDescriptor.i("variables", false);
        pluginGeneratedSerialDescriptor.i("expression", false);
        pluginGeneratedSerialDescriptor.i("computed", false);
        pluginGeneratedSerialDescriptor.i("device", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ExecutionContext$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ExecutionContext.$childSerializers;
        return new KSerializer[]{PassableMap$$serializer.INSTANCE, b3.f315897a, kSerializerArr[2], kSerializerArr[3]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final ExecutionContext deserialize(@NotNull Decoder decoder) {
        int i10;
        PassableMap passableMap;
        String str;
        Map map;
        Map map2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ExecutionContext.$childSerializers;
        PassableMap passableMap2 = null;
        if (dVarBeginStructure.c()) {
            PassableMap passableMap3 = (PassableMap) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, PassableMap$$serializer.INSTANCE, null);
            String strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            Map map3 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            map2 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            passableMap = passableMap3;
            i10 = 15;
            map = map3;
            str = strDecodeStringElement;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strDecodeStringElement2 = null;
            Map map4 = null;
            Map map5 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    passableMap2 = (PassableMap) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, PassableMap$$serializer.INSTANCE, passableMap2);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    map4 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], map4);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new t0(iDecodeElementIndex);
                    }
                    map5 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], map5);
                    i11 |= 8;
                }
            }
            i10 = i11;
            passableMap = passableMap2;
            str = strDecodeStringElement2;
            map = map4;
            map2 = map5;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new ExecutionContext(i10, passableMap, str, map, map2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull ExecutionContext value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        ExecutionContext.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
