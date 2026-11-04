package com.superwall.sdk.models.triggers;

import hk.a;
import io.ktor.http.t1;
import java.util.List;
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
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class TriggerRule$$serializer implements p0<TriggerRule> {

    @NotNull
    public static final TriggerRule$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        TriggerRule$$serializer triggerRule$$serializer = new TriggerRule$$serializer();
        INSTANCE = triggerRule$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.triggers.TriggerRule", triggerRule$$serializer, 9);
        pluginGeneratedSerialDescriptor.i("experiment_id", false);
        pluginGeneratedSerialDescriptor.i("experiment_group_id", false);
        pluginGeneratedSerialDescriptor.i("variants", false);
        pluginGeneratedSerialDescriptor.i("expression", true);
        pluginGeneratedSerialDescriptor.i("expression_js", true);
        pluginGeneratedSerialDescriptor.i("expression_cel", true);
        pluginGeneratedSerialDescriptor.i("occurrence", true);
        pluginGeneratedSerialDescriptor.i("computed_properties", true);
        pluginGeneratedSerialDescriptor.i(t1.b.f296118f, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TriggerRule$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TriggerRule.$childSerializers;
        b3 b3Var = b3.f315897a;
        boolean z10 = true & false;
        return new KSerializer[]{b3Var, b3Var, kSerializerArr[2], a.v(b3Var), a.v(b3Var), a.v(b3Var), a.v(TriggerRuleOccurrence$$serializer.INSTANCE), kSerializerArr[7], TriggerRule.TriggerPreloadSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final TriggerRule deserialize(@NotNull Decoder decoder) {
        int i10;
        TriggerRule.TriggerPreload triggerPreload;
        TriggerRuleOccurrence triggerRuleOccurrence;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        List list2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TriggerRule.$childSerializers;
        int i11 = 8;
        String strDecodeStringElement = null;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            List list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            b3 b3Var = b3.f315897a;
            String str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b3Var, null);
            String str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, b3Var, null);
            String str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, b3Var, null);
            TriggerRuleOccurrence triggerRuleOccurrence2 = (TriggerRuleOccurrence) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, TriggerRuleOccurrence$$serializer.INSTANCE, null);
            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            str4 = strDecodeStringElement2;
            triggerRuleOccurrence = triggerRuleOccurrence2;
            str = str8;
            str3 = str6;
            triggerPreload = (TriggerRule.TriggerPreload) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, TriggerRule.TriggerPreloadSerializer.INSTANCE, null);
            str2 = str7;
            i10 = 511;
            list2 = list3;
            str5 = strDecodeStringElement3;
        } else {
            int i12 = 2;
            boolean z10 = true;
            int i13 = 0;
            TriggerRule.TriggerPreload triggerPreload2 = null;
            TriggerRuleOccurrence triggerRuleOccurrence3 = null;
            List list4 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String strDecodeStringElement4 = null;
            List list5 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i12 = i12;
                        i11 = 8;
                        break;
                    case 0:
                        i13 |= 1;
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i12 = i12;
                        i11 = 8;
                        break;
                    case 1:
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i13 |= 2;
                        i11 = 8;
                        break;
                    case 2:
                        list5 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i12, kSerializerArr[i12], list5);
                        i13 |= 4;
                        i11 = 8;
                        break;
                    case 3:
                        str11 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b3.f315897a, str11);
                        i13 |= 8;
                        i11 = 8;
                        break;
                    case 4:
                        str10 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, b3.f315897a, str10);
                        i13 |= 16;
                        i11 = 8;
                        break;
                    case 5:
                        str9 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, b3.f315897a, str9);
                        i13 |= 32;
                        i11 = 8;
                        break;
                    case 6:
                        triggerRuleOccurrence3 = (TriggerRuleOccurrence) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, TriggerRuleOccurrence$$serializer.INSTANCE, triggerRuleOccurrence3);
                        i13 |= 64;
                        i11 = 8;
                        break;
                    case 7:
                        list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], list4);
                        i13 |= 128;
                        break;
                    case 8:
                        triggerPreload2 = (TriggerRule.TriggerPreload) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i11, TriggerRule.TriggerPreloadSerializer.INSTANCE, triggerPreload2);
                        i13 |= 256;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            i10 = i13;
            triggerPreload = triggerPreload2;
            triggerRuleOccurrence = triggerRuleOccurrence3;
            list = list4;
            str = str9;
            str2 = str10;
            str3 = str11;
            str4 = strDecodeStringElement;
            str5 = strDecodeStringElement4;
            list2 = list5;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new TriggerRule(i10, str4, str5, list2, str3, str2, str, triggerRuleOccurrence, list, triggerPreload, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull TriggerRule value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        TriggerRule.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
