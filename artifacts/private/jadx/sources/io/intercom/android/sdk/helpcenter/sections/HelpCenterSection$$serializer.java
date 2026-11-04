package io.intercom.android.sdk.helpcenter.sections;

import androidx.compose.runtime.internal.w0;
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
@w0(parameters = 0)
public /* synthetic */ class HelpCenterSection$$serializer implements p0<HelpCenterSection> {
    public static final int $stable;

    @NotNull
    public static final HelpCenterSection$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        HelpCenterSection$$serializer helpCenterSection$$serializer = new HelpCenterSection$$serializer();
        INSTANCE = helpCenterSection$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.intercom.android.sdk.helpcenter.sections.HelpCenterSection", helpCenterSection$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("articles", true);
        pluginGeneratedSerialDescriptor.i("name", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HelpCenterSection$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{HelpCenterSection.$childSerializers[0], b3.f315897a};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final HelpCenterSection deserialize(@NotNull Decoder decoder) {
        List list;
        String strDecodeStringElement;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = HelpCenterSection.$childSerializers;
        v2 v2Var = null;
        if (dVarBeginStructure.c()) {
            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
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
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list2);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i11 |= 2;
                }
            }
            list = list2;
            strDecodeStringElement = strDecodeStringElement2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new HelpCenterSection(i10, list, strDecodeStringElement, v2Var);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull HelpCenterSection value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        HelpCenterSection.write$Self$intercom_sdk_base_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
