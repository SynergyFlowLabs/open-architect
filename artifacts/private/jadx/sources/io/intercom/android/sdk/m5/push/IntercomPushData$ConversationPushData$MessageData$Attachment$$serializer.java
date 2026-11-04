package io.intercom.android.sdk.m5.push;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
@w0(parameters = 0)
public /* synthetic */ class IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer implements p0<IntercomPushData.ConversationPushData.MessageData.Attachment> {
    public static final int $stable;

    @NotNull
    public static final IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer intercomPushData$ConversationPushData$MessageData$Attachment$$serializer = new IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer();
        INSTANCE = intercomPushData$ConversationPushData$MessageData$Attachment$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("attachment", intercomPushData$ConversationPushData$MessageData$Attachment$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("title", false);
        pluginGeneratedSerialDescriptor.i("url", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{b3Var, b3Var};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final IntercomPushData.ConversationPushData.MessageData.Attachment deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            strDecodeStringElement = null;
            String strDecodeStringElement3 = null;
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
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i11 |= 2;
                }
            }
            strDecodeStringElement2 = strDecodeStringElement3;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new IntercomPushData.ConversationPushData.MessageData.Attachment(i10, strDecodeStringElement, strDecodeStringElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull IntercomPushData.ConversationPushData.MessageData.Attachment value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        IntercomPushData.ConversationPushData.MessageData.Attachment.write$Self$intercom_sdk_base_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
