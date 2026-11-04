package com.superwall.sdk.paywall.view.webview.templating.models;

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
public /* synthetic */ class ExperimentTemplate$$serializer implements p0<ExperimentTemplate> {

    @NotNull
    public static final ExperimentTemplate$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ExperimentTemplate$$serializer experimentTemplate$$serializer = new ExperimentTemplate$$serializer();
        INSTANCE = experimentTemplate$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.paywall.view.webview.templating.models.ExperimentTemplate", experimentTemplate$$serializer, 4);
        pluginGeneratedSerialDescriptor.i("eventName", true);
        pluginGeneratedSerialDescriptor.i("experimentId", false);
        pluginGeneratedSerialDescriptor.i("variantId", false);
        pluginGeneratedSerialDescriptor.i("campaignId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ExperimentTemplate$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        int i10 = 5 | 1;
        return new KSerializer[]{b3Var, b3Var, b3Var, b3Var};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final ExperimentTemplate deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String str;
        String str2;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            i10 = 15;
        } else {
            strDecodeStringElement = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new t0(iDecodeElementIndex);
                    }
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i11 |= 8;
                }
            }
            strDecodeStringElement2 = strDecodeStringElement5;
            str = strDecodeStringElement6;
            str2 = strDecodeStringElement7;
            i10 = i11;
        }
        String str3 = strDecodeStringElement;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new ExperimentTemplate(i10, str3, str2, str, strDecodeStringElement2, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentTemplate value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        ExperimentTemplate.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
