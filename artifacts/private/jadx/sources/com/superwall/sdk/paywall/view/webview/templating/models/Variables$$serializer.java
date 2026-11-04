package com.superwall.sdk.paywall.view.webview.templating.models;

import java.util.List;
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
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class Variables$$serializer implements p0<Variables> {

    @NotNull
    public static final Variables$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Variables$$serializer variables$$serializer = new Variables$$serializer();
        INSTANCE = variables$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.paywall.view.webview.templating.models.Variables", variables$$serializer, 7);
        pluginGeneratedSerialDescriptor.i("user", false);
        pluginGeneratedSerialDescriptor.i("device", false);
        pluginGeneratedSerialDescriptor.i("params", false);
        pluginGeneratedSerialDescriptor.i("products", true);
        pluginGeneratedSerialDescriptor.i("primary", true);
        pluginGeneratedSerialDescriptor.i("secondary", true);
        pluginGeneratedSerialDescriptor.i("tertiary", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Variables$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = Variables.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2], kSerializerArr[3], kSerializerArr[4], kSerializerArr[5], kSerializerArr[6]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final Variables deserialize(@NotNull Decoder decoder) {
        int i10;
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        List list;
        Map map6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Variables.$childSerializers;
        int i11 = 6;
        int i12 = 2;
        Map map7 = null;
        if (dVarBeginStructure.c()) {
            Map map8 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            Map map9 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            Map map10 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            List list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            Map map11 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            Map map12 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            map3 = map8;
            i10 = 127;
            map2 = map12;
            list = list2;
            map6 = map11;
            map5 = map10;
            map4 = map9;
        } else {
            int i13 = 1;
            boolean z10 = true;
            int i14 = 0;
            Map map13 = null;
            Map map14 = null;
            Map map15 = null;
            Map map16 = null;
            List list3 = null;
            Map map17 = null;
            while (z10) {
                int i15 = i12;
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i13 = 1;
                        i11 = 6;
                        i12 = 2;
                        break;
                    case 0:
                        map7 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], map7);
                        i14 |= 1;
                        i13 = 1;
                        i11 = 6;
                        i12 = 2;
                        break;
                    case 1:
                        map15 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i13, kSerializerArr[i13], map15);
                        i14 |= 2;
                        i11 = 6;
                        i12 = 2;
                        break;
                    case 2:
                        map16 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i15, kSerializerArr[i15], map16);
                        i14 |= 4;
                        i12 = i15;
                        i11 = 6;
                        break;
                    case 3:
                        list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list3);
                        i14 |= 8;
                        i12 = i15;
                        break;
                    case 4:
                        map17 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], map17);
                        i14 |= 16;
                        i12 = i15;
                        break;
                    case 5:
                        map14 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], map14);
                        i14 |= 32;
                        i12 = i15;
                        break;
                    case 6:
                        map13 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i11, kSerializerArr[i11], map13);
                        i14 |= 64;
                        i12 = i15;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            i10 = i14;
            map = map13;
            map2 = map14;
            map3 = map7;
            map4 = map15;
            map5 = map16;
            list = list3;
            map6 = map17;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new Variables(i10, map3, map4, map5, list, map6, map2, map, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull Variables value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        Variables.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
