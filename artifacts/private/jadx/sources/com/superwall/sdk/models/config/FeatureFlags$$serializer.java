package com.superwall.sdk.models.config;

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
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class FeatureFlags$$serializer implements p0<FeatureFlags> {

    @NotNull
    public static final FeatureFlags$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FeatureFlags$$serializer featureFlags$$serializer = new FeatureFlags$$serializer();
        INSTANCE = featureFlags$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.config.FeatureFlags", featureFlags$$serializer, 8);
        int i10 = 3 ^ 0;
        pluginGeneratedSerialDescriptor.i("enable_config_refresh_v2", false);
        pluginGeneratedSerialDescriptor.i("enable_session_events", false);
        pluginGeneratedSerialDescriptor.i("enable_postback", false);
        pluginGeneratedSerialDescriptor.i("enable_userid_seed", false);
        pluginGeneratedSerialDescriptor.i("disable_verbose_events", false);
        pluginGeneratedSerialDescriptor.i("enable_multiple_paywall_urls", false);
        pluginGeneratedSerialDescriptor.i("enable_cel_logging", false);
        pluginGeneratedSerialDescriptor.i("web_2_app", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FeatureFlags$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        i iVar = i.f315935a;
        return new KSerializer[]{iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final FeatureFlags deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        boolean zDecodeBooleanElement2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 0;
        if (dVarBeginStructure.c()) {
            zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement3 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement4 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement5 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement6 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement7 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement8 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            i10 = 255;
            zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            z10 = zDecodeBooleanElement8;
            z11 = zDecodeBooleanElement7;
            z12 = zDecodeBooleanElement5;
            z13 = zDecodeBooleanElement6;
            z14 = zDecodeBooleanElement4;
            z15 = zDecodeBooleanElement3;
        } else {
            boolean z16 = true;
            zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement9 = false;
            boolean zDecodeBooleanElement10 = false;
            boolean zDecodeBooleanElement11 = false;
            boolean zDecodeBooleanElement12 = false;
            boolean zDecodeBooleanElement13 = false;
            boolean zDecodeBooleanElement14 = false;
            boolean zDecodeBooleanElement15 = false;
            while (z16) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z16 = false;
                        break;
                    case 0:
                        i10 |= 1;
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        continue;
                    case 1:
                        zDecodeBooleanElement15 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i10 |= 2;
                        continue;
                    case 2:
                        zDecodeBooleanElement14 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i10 |= 4;
                        break;
                    case 3:
                        zDecodeBooleanElement12 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i10 |= 8;
                        break;
                    case 4:
                        zDecodeBooleanElement13 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i10 |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement11 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i10 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement10 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i10 |= 64;
                        break;
                    case 7:
                        zDecodeBooleanElement9 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i10 |= 128;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement2 = zDecodeBooleanElement9;
            z10 = zDecodeBooleanElement10;
            z11 = zDecodeBooleanElement11;
            z12 = zDecodeBooleanElement12;
            z13 = zDecodeBooleanElement13;
            z14 = zDecodeBooleanElement14;
            z15 = zDecodeBooleanElement15;
        }
        boolean z17 = zDecodeBooleanElement;
        int i11 = i10;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new FeatureFlags(i11, z17, z15, z14, z12, z13, z11, z10, zDecodeBooleanElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull FeatureFlags value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        FeatureFlags.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
