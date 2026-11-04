package io.intercom.android.sdk.helpcenter.collections;

import androidx.compose.runtime.internal.w0;
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
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
@w0(parameters = 0)
public /* synthetic */ class HelpCenterCollection$$serializer implements p0<HelpCenterCollection> {
    public static final int $stable;

    @NotNull
    public static final HelpCenterCollection$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        HelpCenterCollection$$serializer helpCenterCollection$$serializer = new HelpCenterCollection$$serializer();
        INSTANCE = helpCenterCollection$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection", helpCenterCollection$$serializer, 5);
        pluginGeneratedSerialDescriptor.i("description", true);
        pluginGeneratedSerialDescriptor.i("id", false);
        pluginGeneratedSerialDescriptor.i("name", true);
        pluginGeneratedSerialDescriptor.i("article_count", true);
        pluginGeneratedSerialDescriptor.i("collection_count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HelpCenterCollection$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        y0 y0Var = y0.f316055a;
        return new KSerializer[]{b3Var, b3Var, b3Var, y0Var, y0Var};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final HelpCenterCollection deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int iDecodeIntElement;
        int iDecodeIntElement2;
        String str;
        String str2;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
            iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
            iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            i10 = 31;
        } else {
            strDecodeStringElement = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            boolean z10 = true;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            int i11 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i11 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    iDecodeIntElement3 = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
                    i11 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new t0(iDecodeElementIndex);
                    }
                    iDecodeIntElement4 = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                    i11 |= 16;
                }
            }
            iDecodeIntElement = iDecodeIntElement3;
            iDecodeIntElement2 = iDecodeIntElement4;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            i10 = i11;
        }
        String str3 = strDecodeStringElement;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new HelpCenterCollection(i10, str3, str2, str, iDecodeIntElement, iDecodeIntElement2, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull HelpCenterCollection value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        HelpCenterCollection.write$Self$intercom_sdk_base_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
