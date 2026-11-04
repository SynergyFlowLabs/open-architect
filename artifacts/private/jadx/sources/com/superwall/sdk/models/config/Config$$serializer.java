package com.superwall.sdk.models.config;

import com.superwall.sdk.models.postback.PostbackRequest;
import com.superwall.sdk.models.postback.PostbackRequest$$serializer;
import hk.a;
import io.sentry.k4;
import java.util.List;
import java.util.Set;
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
import kotlinx.serialization.internal.k1;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class Config$$serializer implements p0<Config> {

    @NotNull
    public static final Config$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Config$$serializer config$$serializer = new Config$$serializer();
        INSTANCE = config$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.config.Config", config$$serializer, 13);
        pluginGeneratedSerialDescriptor.i("triggerOptions", false);
        pluginGeneratedSerialDescriptor.i("paywallResponses", false);
        pluginGeneratedSerialDescriptor.i("logLevel", false);
        pluginGeneratedSerialDescriptor.i("postback", false);
        pluginGeneratedSerialDescriptor.i("appSessionTimeoutMs", false);
        pluginGeneratedSerialDescriptor.i("toggles", false);
        pluginGeneratedSerialDescriptor.i("products", false);
        pluginGeneratedSerialDescriptor.i("disablePreload", false);
        pluginGeneratedSerialDescriptor.i("localization", false);
        pluginGeneratedSerialDescriptor.i("requestId", true);
        pluginGeneratedSerialDescriptor.i("locales", true);
        pluginGeneratedSerialDescriptor.i("web2app_config", true);
        pluginGeneratedSerialDescriptor.i(k4.c.f305757m, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Config$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = Config.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[0];
        KSerializer<?> kSerializer2 = kSerializerArr[1];
        KSerializer<?> kSerializer3 = kSerializerArr[5];
        KSerializer<?> kSerializer4 = kSerializerArr[6];
        b3 b3Var = b3.f315897a;
        int i10 = 2 | 2;
        return new KSerializer[]{kSerializer, kSerializer2, y0.f316055a, PostbackRequest$$serializer.INSTANCE, k1.f315958a, kSerializer3, kSerializer4, PreloadingDisabled$$serializer.INSTANCE, LocalizationConfig$$serializer.INSTANCE, a.v(b3Var), kSerializerArr[10], a.v(WebToAppConfig$$serializer.INSTANCE), b3Var};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final Config deserialize(@NotNull Decoder decoder) {
        List list;
        Set set;
        int i10;
        Set set2;
        List list2;
        WebToAppConfig webToAppConfig;
        PreloadingDisabled preloadingDisabled;
        List list3;
        String str;
        LocalizationConfig localizationConfig;
        PostbackRequest postbackRequest;
        String strDecodeStringElement;
        int i11;
        long j10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Config.$childSerializers;
        int i12 = 10;
        Set set3 = null;
        if (dVarBeginStructure.c()) {
            Set set4 = (Set) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            int iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
            PostbackRequest postbackRequest2 = (PostbackRequest) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, PostbackRequest$$serializer.INSTANCE, null);
            long jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 4);
            List list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            List list5 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            PreloadingDisabled preloadingDisabled2 = (PreloadingDisabled) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, PreloadingDisabled$$serializer.INSTANCE, null);
            LocalizationConfig localizationConfig2 = (LocalizationConfig) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, LocalizationConfig$$serializer.INSTANCE, null);
            String str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, b3.f315897a, null);
            set2 = (Set) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            set = set4;
            webToAppConfig = (WebToAppConfig) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, WebToAppConfig$$serializer.INSTANCE, null);
            str = str2;
            preloadingDisabled = preloadingDisabled2;
            postbackRequest = postbackRequest2;
            localizationConfig = localizationConfig2;
            list3 = list4;
            i11 = iDecodeIntElement;
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 12);
            list2 = list5;
            i10 = 8191;
            j10 = jDecodeLongElement;
        } else {
            int i13 = 12;
            int i14 = 0;
            int iDecodeIntElement2 = 0;
            list = null;
            Set set5 = null;
            List list6 = null;
            WebToAppConfig webToAppConfig2 = null;
            PreloadingDisabled preloadingDisabled3 = null;
            List list7 = null;
            String strDecodeStringElement2 = null;
            int i15 = 6;
            int i16 = 5;
            boolean z10 = true;
            long jDecodeLongElement2 = 0;
            String str3 = null;
            LocalizationConfig localizationConfig3 = null;
            PostbackRequest postbackRequest3 = null;
            int i17 = 1;
            while (z10) {
                int i18 = i12;
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i12 = 10;
                        i17 = 1;
                        i16 = 5;
                        i15 = 6;
                        break;
                    case 0:
                        set3 = (Set) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], set3);
                        i14 |= 1;
                        i13 = 12;
                        i12 = 10;
                        i17 = 1;
                        i16 = 5;
                        i15 = 6;
                        break;
                    case 1:
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i17, kSerializerArr[i17], list);
                        i14 |= 2;
                        i13 = 12;
                        i12 = 10;
                        i16 = 5;
                        i15 = 6;
                        break;
                    case 2:
                        iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i14 |= 4;
                        i13 = 12;
                        i12 = 10;
                        i16 = 5;
                        i15 = 6;
                        break;
                    case 3:
                        postbackRequest3 = (PostbackRequest) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, PostbackRequest$$serializer.INSTANCE, postbackRequest3);
                        i14 |= 8;
                        i13 = 12;
                        i12 = 10;
                        i16 = 5;
                        i15 = 6;
                        break;
                    case 4:
                        jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i14 |= 16;
                        i13 = 12;
                        i12 = 10;
                        i15 = 6;
                        break;
                    case 5:
                        list7 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i16, kSerializerArr[i16], list7);
                        i14 |= 32;
                        i13 = 12;
                        i12 = 10;
                        i15 = 6;
                        break;
                    case 6:
                        list6 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i15, kSerializerArr[i15], list6);
                        i14 |= 64;
                        i13 = 12;
                        i12 = 10;
                        break;
                    case 7:
                        preloadingDisabled3 = (PreloadingDisabled) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, PreloadingDisabled$$serializer.INSTANCE, preloadingDisabled3);
                        i14 |= 128;
                        i13 = 12;
                        i12 = 10;
                        break;
                    case 8:
                        localizationConfig3 = (LocalizationConfig) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, LocalizationConfig$$serializer.INSTANCE, localizationConfig3);
                        i14 |= 256;
                        i13 = 12;
                        i12 = 10;
                        break;
                    case 9:
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, b3.f315897a, str3);
                        i14 |= 512;
                        i13 = 12;
                        i12 = 10;
                        break;
                    case 10:
                        set5 = (Set) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i18, kSerializerArr[i18], set5);
                        i14 |= 1024;
                        i12 = i18;
                        i13 = 12;
                        break;
                    case 11:
                        webToAppConfig2 = (WebToAppConfig) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, WebToAppConfig$$serializer.INSTANCE, webToAppConfig2);
                        i14 |= 2048;
                        i12 = i18;
                        i13 = 12;
                        break;
                    case 12:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, i13);
                        i14 |= 4096;
                        i12 = i18;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            set = set3;
            i10 = i14;
            set2 = set5;
            list2 = list6;
            webToAppConfig = webToAppConfig2;
            preloadingDisabled = preloadingDisabled3;
            list3 = list7;
            str = str3;
            localizationConfig = localizationConfig3;
            postbackRequest = postbackRequest3;
            strDecodeStringElement = strDecodeStringElement2;
            i11 = iDecodeIntElement2;
            j10 = jDecodeLongElement2;
        }
        List list8 = list;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new Config(i10, set, list8, i11, postbackRequest, j10, list3, list2, preloadingDisabled, localizationConfig, str, set2, webToAppConfig, strDecodeStringElement, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull Config value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        Config.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
