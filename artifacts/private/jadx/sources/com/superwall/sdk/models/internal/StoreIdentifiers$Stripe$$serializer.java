package com.superwall.sdk.models.internal;

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
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class StoreIdentifiers$Stripe$$serializer implements p0<StoreIdentifiers.Stripe> {

    @NotNull
    public static final StoreIdentifiers$Stripe$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        StoreIdentifiers$Stripe$$serializer storeIdentifiers$Stripe$$serializer = new StoreIdentifiers$Stripe$$serializer();
        INSTANCE = storeIdentifiers$Stripe$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("STRIPE", storeIdentifiers$Stripe$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("stripeCustomerId", false);
        pluginGeneratedSerialDescriptor.i("stripeSubscriptionIds", false);
        pluginGeneratedSerialDescriptor.q(new RedemptionResult$Error$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("store"));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StoreIdentifiers$Stripe$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{b3.f315897a, StoreIdentifiers.Stripe.$childSerializers[1]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final StoreIdentifiers.Stripe deserialize(@NotNull Decoder decoder) {
        List list;
        String strDecodeStringElement;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = StoreIdentifiers.Stripe.$childSerializers;
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list2 = null;
            String strDecodeStringElement2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], list2);
                    i11 |= 2;
                }
            }
            list = list2;
            strDecodeStringElement = strDecodeStringElement2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new StoreIdentifiers.Stripe(i10, strDecodeStringElement, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull StoreIdentifiers.Stripe value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        StoreIdentifiers.Stripe.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
