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
public /* synthetic */ class IntercomPushData$ConversationPushData$MessageData$Text$$serializer implements p0<IntercomPushData.ConversationPushData.MessageData.Text> {
    public static final int $stable;

    @NotNull
    public static final IntercomPushData$ConversationPushData$MessageData$Text$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        IntercomPushData$ConversationPushData$MessageData$Text$$serializer intercomPushData$ConversationPushData$MessageData$Text$$serializer = new IntercomPushData$ConversationPushData$MessageData$Text$$serializer();
        INSTANCE = intercomPushData$ConversationPushData$MessageData$Text$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("text", intercomPushData$ConversationPushData$MessageData$Text$$serializer, 1);
        pluginGeneratedSerialDescriptor.i("message", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IntercomPushData$ConversationPushData$MessageData$Text$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{b3.f315897a};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final IntercomPushData.ConversationPushData.MessageData.Text deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 1;
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
        } else {
            boolean z10 = true;
            int i11 = 0;
            strDecodeStringElement = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new t0(iDecodeElementIndex);
                    }
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 = 1;
                }
            }
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new IntercomPushData.ConversationPushData.MessageData.Text(i10, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull IntercomPushData.ConversationPushData.MessageData.Text value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        eVarBeginStructure.encodeStringElement(serialDescriptor, 0, value.message);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
