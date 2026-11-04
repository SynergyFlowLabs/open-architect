package io.intercom.android.sdk.helpcenter.search;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly")
@w0(parameters = 0)
public /* synthetic */ class HelpCenterArticleSearchResponse$$serializer implements p0<HelpCenterArticleSearchResponse> {
    public static final int $stable;

    @NotNull
    public static final HelpCenterArticleSearchResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        HelpCenterArticleSearchResponse$$serializer helpCenterArticleSearchResponse$$serializer = new HelpCenterArticleSearchResponse$$serializer();
        INSTANCE = helpCenterArticleSearchResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse", helpCenterArticleSearchResponse$$serializer, 5);
        pluginGeneratedSerialDescriptor.i("id", false);
        pluginGeneratedSerialDescriptor.i("summary", true);
        pluginGeneratedSerialDescriptor.i("title", true);
        pluginGeneratedSerialDescriptor.i("url", true);
        pluginGeneratedSerialDescriptor.i("highlight", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HelpCenterArticleSearchResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{b3Var, b3Var, b3Var, b3Var, HelpCenterArticleSearchResponse$Highlight$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final HelpCenterArticleSearchResponse deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        String str2;
        String str3;
        String strDecodeStringElement;
        HelpCenterArticleSearchResponse.Highlight highlight;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement2 = null;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
            str = strDecodeStringElement3;
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
            highlight = (HelpCenterArticleSearchResponse.Highlight) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, HelpCenterArticleSearchResponse$Highlight$$serializer.INSTANCE, null);
            str3 = strDecodeStringElement5;
            str2 = strDecodeStringElement4;
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            HelpCenterArticleSearchResponse.Highlight highlight2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i11 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    strDecodeStringElement8 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i11 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new t0(iDecodeElementIndex);
                    }
                    highlight2 = (HelpCenterArticleSearchResponse.Highlight) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, HelpCenterArticleSearchResponse$Highlight$$serializer.INSTANCE, highlight2);
                    i11 |= 16;
                }
            }
            i10 = i11;
            str = strDecodeStringElement2;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            strDecodeStringElement = strDecodeStringElement8;
            highlight = highlight2;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new HelpCenterArticleSearchResponse(i10, str, str2, str3, strDecodeStringElement, highlight, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull HelpCenterArticleSearchResponse value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        HelpCenterArticleSearchResponse.write$Self$intercom_sdk_base_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
