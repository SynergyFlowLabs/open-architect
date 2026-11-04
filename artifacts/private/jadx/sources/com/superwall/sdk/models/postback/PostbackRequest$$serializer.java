package com.superwall.sdk.models.postback;

import hk.a;
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
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class PostbackRequest$$serializer implements p0<PostbackRequest> {

    @NotNull
    public static final PostbackRequest$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PostbackRequest$$serializer postbackRequest$$serializer = new PostbackRequest$$serializer();
        INSTANCE = postbackRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.postback.PostbackRequest", postbackRequest$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("products", false);
        pluginGeneratedSerialDescriptor.i("delay", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PostbackRequest$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{PostbackRequest.$childSerializers[0], a.v(y0.f316055a)};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final PostbackRequest deserialize(@NotNull Decoder decoder) {
        List list;
        Integer num;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PostbackRequest.$childSerializers;
        v2 v2Var = null;
        if (dVarBeginStructure.c()) {
            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, y0.f316055a, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list2 = null;
            Integer num2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list2);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    num2 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, y0.f316055a, num2);
                    i11 |= 2;
                }
            }
            list = list2;
            num = num2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new PostbackRequest(i10, list, num, v2Var);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull PostbackRequest value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        PostbackRequest.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
