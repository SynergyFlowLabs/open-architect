package com.superwall.sdk.models.paywall;

import com.superwall.sdk.config.models.OnDeviceCaching;
import com.superwall.sdk.config.models.OnDeviceCachingSerializer;
import com.superwall.sdk.models.config.FeatureGatingBehavior;
import com.superwall.sdk.models.config.FeatureGatingBehaviorSerializer;
import com.superwall.sdk.models.product.ProductItemsDeserializer;
import hk.a;
import io.sentry.k4;
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
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.k1;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class Paywall$$serializer implements p0<Paywall> {

    @NotNull
    public static final Paywall$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Paywall$$serializer paywall$$serializer = new Paywall$$serializer();
        INSTANCE = paywall$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.paywall.Paywall", paywall$$serializer, 25);
        pluginGeneratedSerialDescriptor.i("id", false);
        pluginGeneratedSerialDescriptor.i("identifier", false);
        pluginGeneratedSerialDescriptor.i("name", false);
        pluginGeneratedSerialDescriptor.i("url", false);
        pluginGeneratedSerialDescriptor.i("paywalljs_event", false);
        pluginGeneratedSerialDescriptor.i("presentation_style_v2", false);
        pluginGeneratedSerialDescriptor.i("presentation_delay", false);
        pluginGeneratedSerialDescriptor.i("presentation_condition", false);
        pluginGeneratedSerialDescriptor.i("background_color_hex", false);
        boolean z10 = !true;
        pluginGeneratedSerialDescriptor.i("dark_background_color_hex", true);
        pluginGeneratedSerialDescriptor.i("products_v2", false);
        pluginGeneratedSerialDescriptor.i("productVariables", true);
        pluginGeneratedSerialDescriptor.i("swProductVariablesTemplate", true);
        pluginGeneratedSerialDescriptor.i("paywalljsVersion", true);
        pluginGeneratedSerialDescriptor.i("isFreeTrialAvailable", true);
        pluginGeneratedSerialDescriptor.i("presentationSourceType", true);
        pluginGeneratedSerialDescriptor.i("feature_gating", true);
        pluginGeneratedSerialDescriptor.i("computed_properties", true);
        pluginGeneratedSerialDescriptor.i("local_notifications", true);
        pluginGeneratedSerialDescriptor.i("on_device_cache", true);
        pluginGeneratedSerialDescriptor.i("url_config", true);
        pluginGeneratedSerialDescriptor.i("cache_key", false);
        pluginGeneratedSerialDescriptor.i(k4.c.f305757m, false);
        pluginGeneratedSerialDescriptor.i("surveys", true);
        pluginGeneratedSerialDescriptor.i("is_scroll_enabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Paywall$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = Paywall.$childSerializers;
        b3 b3Var = b3.f315897a;
        KSerializer<?> kSerializerV = a.v(b3Var);
        KSerializer<?> kSerializerV2 = a.v(kSerializerArr[11]);
        KSerializer<?> kSerializerV3 = a.v(kSerializerArr[12]);
        KSerializer<?> kSerializerV4 = a.v(b3Var);
        i iVar = i.f315935a;
        return new KSerializer[]{b3Var, b3Var, b3Var, PaywallURL$$serializer.INSTANCE, b3Var, b3Var, k1.f315958a, b3Var, b3Var, kSerializerV, ProductItemsDeserializer.INSTANCE, kSerializerV2, kSerializerV3, kSerializerV4, iVar, a.v(b3Var), FeatureGatingBehaviorSerializer.INSTANCE, kSerializerArr[17], kSerializerArr[18], OnDeviceCachingSerializer.INSTANCE, a.v(PaywallWebviewUrl$Config$$serializer.INSTANCE), b3Var, b3Var, kSerializerArr[23], a.v(iVar)};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final Paywall deserialize(@NotNull Decoder decoder) {
        PaywallWebviewUrl.Config config;
        String str;
        List list;
        List list2;
        String str2;
        int i10;
        Boolean bool;
        List list3;
        OnDeviceCaching onDeviceCaching;
        List list4;
        List list5;
        String str3;
        boolean z10;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        List list6;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        long j10;
        FeatureGatingBehavior featureGatingBehavior;
        int i11;
        int i12;
        String str14;
        String str15;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Paywall.$childSerializers;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
            PaywallURL paywallURL = (PaywallURL) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, PaywallURL$$serializer.INSTANCE, null);
            String strM52unboximpl = paywallURL != null ? paywallURL.m52unboximpl() : null;
            String strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
            long jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 6);
            String strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(serialDescriptor, 8);
            b3 b3Var = b3.f315897a;
            String str16 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, b3Var, null);
            List list7 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, ProductItemsDeserializer.INSTANCE, null);
            List list8 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], null);
            List list9 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], null);
            String str17 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, b3Var, null);
            boolean zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            String str18 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, b3Var, null);
            FeatureGatingBehavior featureGatingBehavior2 = (FeatureGatingBehavior) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 16, FeatureGatingBehaviorSerializer.INSTANCE, null);
            List list10 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], null);
            List list11 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], null);
            OnDeviceCaching onDeviceCaching2 = (OnDeviceCaching) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 19, OnDeviceCachingSerializer.INSTANCE, null);
            PaywallWebviewUrl.Config config2 = (PaywallWebviewUrl.Config) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, PaywallWebviewUrl$Config$$serializer.INSTANCE, null);
            String strDecodeStringElement8 = dVarBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement9 = dVarBeginStructure.decodeStringElement(serialDescriptor, 22);
            List list12 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 23, kSerializerArr[23], null);
            onDeviceCaching = onDeviceCaching2;
            featureGatingBehavior = featureGatingBehavior2;
            bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, i.f315935a, null);
            i10 = 33554431;
            str5 = strDecodeStringElement4;
            str7 = strDecodeStringElement9;
            str8 = strDecodeStringElement3;
            list5 = list7;
            str3 = str16;
            str9 = strDecodeStringElement6;
            str10 = strDecodeStringElement7;
            str11 = strDecodeStringElement5;
            str12 = strM52unboximpl;
            str13 = strDecodeStringElement8;
            str2 = str17;
            str = str18;
            str6 = strDecodeStringElement2;
            list4 = list11;
            list2 = list10;
            z10 = zDecodeBooleanElement;
            list = list9;
            str4 = strDecodeStringElement;
            list6 = list8;
            j10 = jDecodeLongElement;
            list3 = list12;
            config = config2;
        } else {
            String str19 = null;
            int i13 = 0;
            boolean zDecodeBooleanElement2 = false;
            FeatureGatingBehavior featureGatingBehavior3 = null;
            List list13 = null;
            PaywallWebviewUrl.Config config3 = null;
            List list14 = null;
            String str20 = null;
            Boolean bool2 = null;
            List list15 = null;
            OnDeviceCaching onDeviceCaching3 = null;
            List list16 = null;
            List list17 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String str21 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strM52unboximpl2 = null;
            String strDecodeStringElement18 = null;
            boolean z11 = true;
            long jDecodeLongElement2 = 0;
            List list18 = null;
            while (z11) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        featureGatingBehavior3 = featureGatingBehavior3;
                        str14 = str21;
                        z11 = false;
                        featureGatingBehavior3 = featureGatingBehavior3;
                        str21 = str14;
                        break;
                    case 0:
                        str14 = str21;
                        strDecodeStringElement10 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i13 |= 1;
                        list13 = list13;
                        featureGatingBehavior3 = featureGatingBehavior3;
                        str21 = str14;
                        break;
                    case 1:
                        str14 = str21;
                        strDecodeStringElement12 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i13 |= 2;
                        list13 = list13;
                        featureGatingBehavior3 = featureGatingBehavior3;
                        str21 = str14;
                        break;
                    case 2:
                        str14 = str21;
                        strDecodeStringElement14 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i13 |= 4;
                        list13 = list13;
                        featureGatingBehavior3 = featureGatingBehavior3;
                        str21 = str14;
                        break;
                    case 3:
                        str14 = str21;
                        PaywallURL paywallURL2 = (PaywallURL) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, PaywallURL$$serializer.INSTANCE, strM52unboximpl2 != null ? PaywallURL.m46boximpl(strM52unboximpl2) : null);
                        strM52unboximpl2 = paywallURL2 != null ? paywallURL2.m52unboximpl() : null;
                        i13 |= 8;
                        list13 = list13;
                        featureGatingBehavior3 = featureGatingBehavior3;
                        str21 = str14;
                        break;
                    case 4:
                        str15 = str21;
                        strDecodeStringElement11 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i13 |= 16;
                        list13 = list13;
                        str21 = str15;
                        featureGatingBehavior3 = featureGatingBehavior3;
                        break;
                    case 5:
                        str15 = str21;
                        strDecodeStringElement17 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i13 |= 32;
                        list13 = list13;
                        str21 = str15;
                        featureGatingBehavior3 = featureGatingBehavior3;
                        break;
                    case 6:
                        str15 = str21;
                        jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i13 |= 64;
                        list13 = list13;
                        str21 = str15;
                        featureGatingBehavior3 = featureGatingBehavior3;
                        break;
                    case 7:
                        str15 = str21;
                        strDecodeStringElement15 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i13 |= 128;
                        list13 = list13;
                        str21 = str15;
                        featureGatingBehavior3 = featureGatingBehavior3;
                        break;
                    case 8:
                        str15 = str21;
                        strDecodeStringElement16 = dVarBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i13 |= 256;
                        list13 = list13;
                        str21 = str15;
                        featureGatingBehavior3 = featureGatingBehavior3;
                        break;
                    case 9:
                        str15 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, b3.f315897a, str21);
                        i13 |= 512;
                        list13 = list13;
                        str21 = str15;
                        featureGatingBehavior3 = featureGatingBehavior3;
                        break;
                    case 10:
                        featureGatingBehavior3 = featureGatingBehavior3;
                        list17 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, ProductItemsDeserializer.INSTANCE, list17);
                        i13 |= 1024;
                        featureGatingBehavior3 = featureGatingBehavior3;
                        break;
                    case 11:
                        list17 = list17;
                        list13 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], list13);
                        i13 |= 2048;
                        list17 = list17;
                        break;
                    case 12:
                        list17 = list17;
                        list14 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], list14);
                        i13 |= 4096;
                        list17 = list17;
                        break;
                    case 13:
                        list17 = list17;
                        str20 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, b3.f315897a, str20);
                        i13 |= 8192;
                        list17 = list17;
                        break;
                    case 14:
                        list17 = list17;
                        zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                        i13 |= 16384;
                        list17 = list17;
                        break;
                    case 15:
                        str19 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, b3.f315897a, str19);
                        i11 = 32768;
                        i13 |= i11;
                        list17 = list17;
                        break;
                    case 16:
                        featureGatingBehavior3 = (FeatureGatingBehavior) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 16, FeatureGatingBehaviorSerializer.INSTANCE, featureGatingBehavior3);
                        i11 = 65536;
                        i13 |= i11;
                        list17 = list17;
                        break;
                    case 17:
                        list18 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], list18);
                        i11 = 131072;
                        i13 |= i11;
                        list17 = list17;
                        break;
                    case 18:
                        list16 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], list16);
                        i12 = 262144;
                        i13 |= i12;
                        list17 = list17;
                        break;
                    case 19:
                        onDeviceCaching3 = (OnDeviceCaching) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 19, OnDeviceCachingSerializer.INSTANCE, onDeviceCaching3);
                        i11 = 524288;
                        i13 |= i11;
                        list17 = list17;
                        break;
                    case 20:
                        config3 = (PaywallWebviewUrl.Config) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, PaywallWebviewUrl$Config$$serializer.INSTANCE, config3);
                        i11 = 1048576;
                        i13 |= i11;
                        list17 = list17;
                        break;
                    case 21:
                        strDecodeStringElement18 = dVarBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i12 = 2097152;
                        i13 |= i12;
                        list17 = list17;
                        break;
                    case 22:
                        strDecodeStringElement13 = dVarBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i12 = 4194304;
                        i13 |= i12;
                        list17 = list17;
                        break;
                    case 23:
                        list15 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 23, kSerializerArr[23], list15);
                        i12 = 8388608;
                        i13 |= i12;
                        list17 = list17;
                        break;
                    case 24:
                        bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, i.f315935a, bool2);
                        i11 = 16777216;
                        i13 |= i11;
                        list17 = list17;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            config = config3;
            str = str19;
            list = list14;
            list2 = list18;
            str2 = str20;
            i10 = i13;
            bool = bool2;
            list3 = list15;
            onDeviceCaching = onDeviceCaching3;
            list4 = list16;
            list5 = list17;
            str3 = str21;
            z10 = zDecodeBooleanElement2;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement11;
            str6 = strDecodeStringElement12;
            str7 = strDecodeStringElement13;
            str8 = strDecodeStringElement14;
            list6 = list13;
            str9 = strDecodeStringElement15;
            str10 = strDecodeStringElement16;
            str11 = strDecodeStringElement17;
            str12 = strM52unboximpl2;
            str13 = strDecodeStringElement18;
            j10 = jDecodeLongElement2;
            featureGatingBehavior = featureGatingBehavior3;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new Paywall(i10, str4, str6, str8, str12, str5, str11, j10, str9, str10, str3, list5, list6, list, str2, z10, str, featureGatingBehavior, list2, list4, onDeviceCaching, config, str13, str7, list3, bool, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull Paywall value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        Paywall.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
