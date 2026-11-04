package io.intercom.android.sdk.helpcenter.sections;

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
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
@w0(parameters = 0)
public /* synthetic */ class Author$$serializer implements p0<Author> {
    public static final int $stable;

    @NotNull
    public static final Author$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Author$$serializer author$$serializer = new Author$$serializer();
        INSTANCE = author$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.intercom.android.sdk.helpcenter.sections.Author", author$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("id", false);
        pluginGeneratedSerialDescriptor.i("display_name", true);
        pluginGeneratedSerialDescriptor.i("avatar", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Author$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{b3Var, b3Var, Avatar$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final Author deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        String str2;
        Avatar avatar;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            str = strDecodeStringElement2;
            avatar = (Avatar) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, Avatar$$serializer.INSTANCE, null);
            str2 = strDecodeStringElement3;
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strDecodeStringElement4 = null;
            Avatar avatar2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new t0(iDecodeElementIndex);
                    }
                    avatar2 = (Avatar) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, Avatar$$serializer.INSTANCE, avatar2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement4;
            avatar = avatar2;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new Author(i10, str, str2, avatar, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull Author value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        Author.write$Self$intercom_sdk_base_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
