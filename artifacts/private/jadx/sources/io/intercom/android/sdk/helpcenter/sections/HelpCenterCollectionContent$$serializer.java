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
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
@w0(parameters = 0)
public /* synthetic */ class HelpCenterCollectionContent$$serializer implements p0<HelpCenterCollectionContent> {
    public static final int $stable;

    @NotNull
    public static final HelpCenterCollectionContent$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        HelpCenterCollectionContent$$serializer helpCenterCollectionContent$$serializer = new HelpCenterCollectionContent$$serializer();
        INSTANCE = helpCenterCollectionContent$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent", helpCenterCollectionContent$$serializer, 8);
        pluginGeneratedSerialDescriptor.i("id", false);
        pluginGeneratedSerialDescriptor.i("name", true);
        pluginGeneratedSerialDescriptor.i("description", true);
        pluginGeneratedSerialDescriptor.i("articles", true);
        pluginGeneratedSerialDescriptor.i("sections", true);
        pluginGeneratedSerialDescriptor.i("collections", true);
        pluginGeneratedSerialDescriptor.i("article_count", false);
        pluginGeneratedSerialDescriptor.i("authors", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HelpCenterCollectionContent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = HelpCenterCollectionContent.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[3];
        KSerializer<?> kSerializer2 = kSerializerArr[4];
        KSerializer<?> kSerializer3 = kSerializerArr[5];
        KSerializer<?> kSerializer4 = kSerializerArr[7];
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{b3Var, b3Var, b3Var, kSerializer, kSerializer2, kSerializer3, y0.f316055a, kSerializer4};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final HelpCenterCollectionContent deserialize(@NotNull Decoder decoder) {
        int i10;
        List list;
        List list2;
        List list3;
        List list4;
        int i11;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = HelpCenterCollectionContent.$childSerializers;
        int i12 = 6;
        int i13 = 4;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
            List list5 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            List list6 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            List list7 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            int iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 6);
            list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            str = strDecodeStringElement;
            i10 = iDecodeIntElement;
            str3 = strDecodeStringElement3;
            i11 = 255;
            list = list7;
            list4 = list5;
            list3 = list6;
            str2 = strDecodeStringElement2;
        } else {
            int i14 = 3;
            boolean z10 = true;
            int iDecodeIntElement2 = 0;
            List list8 = null;
            List list9 = null;
            List list10 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int i15 = 0;
            List list11 = null;
            while (z10) {
                int i16 = i13;
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i13 = 4;
                        i14 = i14;
                        i12 = 6;
                        break;
                    case 0:
                        i15 |= 1;
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i13 = 4;
                        i14 = i14;
                        i12 = 6;
                        break;
                    case 1:
                        i15 |= 2;
                        strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i12 = 6;
                        i13 = 4;
                        break;
                    case 2:
                        strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i15 |= 4;
                        i12 = 6;
                        i13 = 4;
                        break;
                    case 3:
                        list11 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i14, kSerializerArr[i14], list11);
                        i15 |= 8;
                        i12 = 6;
                        i13 = 4;
                        break;
                    case 4:
                        list10 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i16, kSerializerArr[i16], list10);
                        i15 |= 16;
                        i13 = i16;
                        i12 = 6;
                        break;
                    case 5:
                        list8 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], list8);
                        i15 |= 32;
                        i13 = i16;
                        break;
                    case 6:
                        iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, i12);
                        i15 |= 64;
                        i13 = i16;
                        break;
                    case 7:
                        list9 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], list9);
                        i15 |= 128;
                        i13 = i16;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            i10 = iDecodeIntElement2;
            list = list8;
            list2 = list9;
            list3 = list10;
            list4 = list11;
            i11 = i15;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new HelpCenterCollectionContent(i11, str, str2, str3, list4, list3, list, i10, list2, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull HelpCenterCollectionContent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        HelpCenterCollectionContent.write$Self$intercom_sdk_base_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
