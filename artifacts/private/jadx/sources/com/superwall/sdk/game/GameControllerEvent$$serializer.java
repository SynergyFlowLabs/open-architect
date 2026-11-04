package com.superwall.sdk.game;

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
import kotlinx.serialization.internal.e0;
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class GameControllerEvent$$serializer implements p0<GameControllerEvent> {

    @NotNull
    public static final GameControllerEvent$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        GameControllerEvent$$serializer gameControllerEvent$$serializer = new GameControllerEvent$$serializer();
        INSTANCE = gameControllerEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.game.GameControllerEvent", gameControllerEvent$$serializer, 6);
        pluginGeneratedSerialDescriptor.i("event_name", true);
        pluginGeneratedSerialDescriptor.i("controller_element", false);
        pluginGeneratedSerialDescriptor.i("value", false);
        pluginGeneratedSerialDescriptor.i("x", false);
        pluginGeneratedSerialDescriptor.i("y", false);
        pluginGeneratedSerialDescriptor.i("directional", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GameControllerEvent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        e0 e0Var = e0.f315908a;
        return new KSerializer[]{b3Var, b3Var, e0Var, e0Var, e0Var, i.f315935a};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final GameControllerEvent deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        boolean zDecodeBooleanElement;
        double d10;
        int i10;
        String str;
        double d11;
        double d12;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            double dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 2);
            double dDecodeDoubleElement2 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 3);
            double dDecodeDoubleElement3 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 4);
            zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            d10 = dDecodeDoubleElement3;
            i10 = 63;
            str = strDecodeStringElement2;
            d11 = dDecodeDoubleElement;
            d12 = dDecodeDoubleElement2;
        } else {
            strDecodeStringElement = null;
            String strDecodeStringElement3 = null;
            boolean z10 = true;
            int i11 = 0;
            double dDecodeDoubleElement4 = 0.0d;
            double dDecodeDoubleElement5 = 0.0d;
            boolean zDecodeBooleanElement2 = false;
            double dDecodeDoubleElement6 = 0.0d;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i11 |= 2;
                        break;
                    case 2:
                        dDecodeDoubleElement4 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        dDecodeDoubleElement5 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        dDecodeDoubleElement6 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i11 |= 32;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            d10 = dDecodeDoubleElement6;
            i10 = i11;
            str = strDecodeStringElement3;
            d11 = dDecodeDoubleElement4;
            d12 = dDecodeDoubleElement5;
        }
        String str2 = strDecodeStringElement;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new GameControllerEvent(i10, str2, str, d11, d12, d10, zDecodeBooleanElement, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull GameControllerEvent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        GameControllerEvent.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
