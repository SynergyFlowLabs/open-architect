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
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class JsonVariables$$serializer implements p0<JsonVariables> {

    @NotNull
    public static final JsonVariables$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        JsonVariables$$serializer jsonVariables$$serializer = new JsonVariables$$serializer();
        INSTANCE = jsonVariables$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.paywall.view.webview.templating.models.JsonVariables", jsonVariables$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("event_name", false);
        pluginGeneratedSerialDescriptor.i("variables", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private JsonVariables$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{b3.f315897a, Variables$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final JsonVariables deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        Variables variables;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            variables = (Variables) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, Variables$$serializer.INSTANCE, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            strDecodeStringElement = null;
            Variables variables2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    variables2 = (Variables) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, Variables$$serializer.INSTANCE, variables2);
                    i11 |= 2;
                }
            }
            variables = variables2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new JsonVariables(i10, strDecodeStringElement, variables, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull JsonVariables value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        JsonVariables.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
