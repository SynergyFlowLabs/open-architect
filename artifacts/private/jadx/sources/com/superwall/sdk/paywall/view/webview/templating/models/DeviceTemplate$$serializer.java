package com.superwall.sdk.paywall.view.webview.templating.models;

import androidx.media3.common.j;
import com.google.firebase.remoteconfig.e0;
import hk.a;
import java.util.List;
import kotlin.Unit;
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
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class DeviceTemplate$$serializer implements p0<DeviceTemplate> {

    @NotNull
    public static final DeviceTemplate$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        DeviceTemplate$$serializer deviceTemplate$$serializer = new DeviceTemplate$$serializer();
        INSTANCE = deviceTemplate$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.paywall.view.webview.templating.models.DeviceTemplate", deviceTemplate$$serializer, 51);
        pluginGeneratedSerialDescriptor.i("publicApiKey", false);
        pluginGeneratedSerialDescriptor.i("platform", false);
        pluginGeneratedSerialDescriptor.i("appUserId", false);
        pluginGeneratedSerialDescriptor.i("aliases", false);
        pluginGeneratedSerialDescriptor.i("vendorId", false);
        pluginGeneratedSerialDescriptor.i(e0.b.f124458s2, false);
        pluginGeneratedSerialDescriptor.i("appVersionPadded", false);
        pluginGeneratedSerialDescriptor.i("osVersion", false);
        pluginGeneratedSerialDescriptor.i("deviceModel", false);
        pluginGeneratedSerialDescriptor.i("deviceLocale", false);
        pluginGeneratedSerialDescriptor.i("preferredLocale", false);
        pluginGeneratedSerialDescriptor.i("deviceLanguageCode", false);
        pluginGeneratedSerialDescriptor.i("preferredLanguageCode", false);
        pluginGeneratedSerialDescriptor.i("regionCode", false);
        pluginGeneratedSerialDescriptor.i("preferredRegionCode", false);
        pluginGeneratedSerialDescriptor.i("deviceCurrencyCode", false);
        pluginGeneratedSerialDescriptor.i("deviceCurrencySymbol", false);
        pluginGeneratedSerialDescriptor.i("timezoneOffset", false);
        pluginGeneratedSerialDescriptor.i("radioType", false);
        pluginGeneratedSerialDescriptor.i("interfaceStyle", false);
        pluginGeneratedSerialDescriptor.i("isLowPowerModeEnabled", false);
        pluginGeneratedSerialDescriptor.i("bundleId", false);
        pluginGeneratedSerialDescriptor.i("appInstallDate", false);
        pluginGeneratedSerialDescriptor.i("isMac", false);
        pluginGeneratedSerialDescriptor.i("daysSinceInstall", false);
        pluginGeneratedSerialDescriptor.i("minutesSinceInstall", false);
        pluginGeneratedSerialDescriptor.i("daysSinceLastPaywallView", false);
        pluginGeneratedSerialDescriptor.i("minutesSinceLastPaywallView", false);
        pluginGeneratedSerialDescriptor.i("totalPaywallViews", false);
        pluginGeneratedSerialDescriptor.i("utcDate", false);
        pluginGeneratedSerialDescriptor.i("localDate", false);
        pluginGeneratedSerialDescriptor.i("utcTime", false);
        pluginGeneratedSerialDescriptor.i("localTime", false);
        pluginGeneratedSerialDescriptor.i("utcDateTime", false);
        pluginGeneratedSerialDescriptor.i("localDateTime", false);
        pluginGeneratedSerialDescriptor.i("isSandbox", false);
        pluginGeneratedSerialDescriptor.i("activeEntitlements", false);
        pluginGeneratedSerialDescriptor.i("activeEntitlementsObject", false);
        pluginGeneratedSerialDescriptor.i("subscriptionStatus", false);
        pluginGeneratedSerialDescriptor.i("activeProducts", false);
        pluginGeneratedSerialDescriptor.i("isFirstAppOpen", false);
        pluginGeneratedSerialDescriptor.i(e0.b.f124461v2, false);
        pluginGeneratedSerialDescriptor.i("sdkVersionPadded", false);
        pluginGeneratedSerialDescriptor.i("appBuildString", false);
        pluginGeneratedSerialDescriptor.i("appBuildStringNumber", false);
        pluginGeneratedSerialDescriptor.i("interfaceStyleMode", false);
        pluginGeneratedSerialDescriptor.i("capabilities", false);
        pluginGeneratedSerialDescriptor.i("capabilities_config", false);
        pluginGeneratedSerialDescriptor.i("platform_wrapper", false);
        pluginGeneratedSerialDescriptor.i("platform_wrapper_version", false);
        pluginGeneratedSerialDescriptor.i("deviceTier", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeviceTemplate$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = DeviceTemplate.$childSerializers;
        b3 b3Var = b3.f315897a;
        KSerializer<?> kSerializer = kSerializerArr[3];
        y0 y0Var = y0.f316055a;
        KSerializer<?> kSerializerV = a.v(y0Var);
        KSerializer<?> kSerializerV2 = a.v(y0Var);
        KSerializer<?> kSerializer2 = kSerializerArr[36];
        KSerializer<?> kSerializer3 = kSerializerArr[37];
        KSerializer<?> kSerializerV3 = a.v(b3Var);
        KSerializer<?> kSerializer4 = kSerializerArr[39];
        KSerializer<?> kSerializerV4 = a.v(y0Var);
        KSerializer<?> kSerializer5 = kSerializerArr[46];
        i iVar = i.f315935a;
        return new KSerializer[]{b3Var, b3Var, b3Var, kSerializer, b3Var, b3Var, b3Var, b3Var, b3Var, b3Var, b3Var, b3Var, b3Var, b3Var, b3Var, b3Var, b3Var, y0Var, b3Var, b3Var, iVar, b3Var, b3Var, iVar, y0Var, y0Var, kSerializerV, kSerializerV2, y0Var, b3Var, b3Var, b3Var, b3Var, b3Var, b3Var, b3Var, kSerializer2, kSerializer3, kSerializerV3, kSerializer4, iVar, b3Var, b3Var, b3Var, kSerializerV4, b3Var, kSerializer5, JsonElementSerializer.INSTANCE, b3Var, b3Var, b3Var};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final DeviceTemplate deserialize(@NotNull Decoder decoder) {
        Integer num;
        List list;
        Integer num2;
        int i10;
        int i11;
        JsonElement jsonElement;
        Integer num3;
        List list2;
        String str;
        List list3;
        List list4;
        List list5;
        int i12;
        int i13;
        int i14;
        boolean z10;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        String strDecodeStringElement;
        int i15;
        boolean z11;
        boolean z12;
        int i16;
        int i17;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DeviceTemplate.$childSerializers;
        boolean z13 = false;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
            List list6 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            String strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = dVarBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = dVarBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement11 = dVarBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement12 = dVarBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement13 = dVarBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement14 = dVarBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement15 = dVarBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement16 = dVarBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement17 = dVarBeginStructure.decodeStringElement(serialDescriptor, 16);
            int iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 17);
            String strDecodeStringElement18 = dVarBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement19 = dVarBeginStructure.decodeStringElement(serialDescriptor, 19);
            boolean zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 20);
            String strDecodeStringElement20 = dVarBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement21 = dVarBeginStructure.decodeStringElement(serialDescriptor, 22);
            boolean zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 23);
            int iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 24);
            int iDecodeIntElement3 = dVarBeginStructure.decodeIntElement(serialDescriptor, 25);
            y0 y0Var = y0.f316055a;
            Integer num4 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, y0Var, null);
            Integer num5 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 27, y0Var, null);
            int iDecodeIntElement4 = dVarBeginStructure.decodeIntElement(serialDescriptor, 28);
            String strDecodeStringElement22 = dVarBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement23 = dVarBeginStructure.decodeStringElement(serialDescriptor, 30);
            String strDecodeStringElement24 = dVarBeginStructure.decodeStringElement(serialDescriptor, 31);
            String strDecodeStringElement25 = dVarBeginStructure.decodeStringElement(serialDescriptor, 32);
            String strDecodeStringElement26 = dVarBeginStructure.decodeStringElement(serialDescriptor, 33);
            String strDecodeStringElement27 = dVarBeginStructure.decodeStringElement(serialDescriptor, 34);
            String strDecodeStringElement28 = dVarBeginStructure.decodeStringElement(serialDescriptor, 35);
            List list7 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 36, kSerializerArr[36], null);
            List list8 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 37, kSerializerArr[37], null);
            String str35 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 38, b3.f315897a, null);
            List list9 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 39, kSerializerArr[39], null);
            boolean zDecodeBooleanElement3 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 40);
            String strDecodeStringElement29 = dVarBeginStructure.decodeStringElement(serialDescriptor, 41);
            String strDecodeStringElement30 = dVarBeginStructure.decodeStringElement(serialDescriptor, 42);
            String strDecodeStringElement31 = dVarBeginStructure.decodeStringElement(serialDescriptor, 43);
            Integer num6 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 44, y0Var, null);
            String strDecodeStringElement32 = dVarBeginStructure.decodeStringElement(serialDescriptor, 45);
            List list10 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 46, kSerializerArr[46], null);
            JsonElement jsonElement2 = (JsonElement) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 47, JsonElementSerializer.INSTANCE, null);
            String strDecodeStringElement33 = dVarBeginStructure.decodeStringElement(serialDescriptor, 48);
            String strDecodeStringElement34 = dVarBeginStructure.decodeStringElement(serialDescriptor, 49);
            list3 = list10;
            list2 = list9;
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 50);
            str33 = strDecodeStringElement33;
            z10 = zDecodeBooleanElement3;
            str34 = strDecodeStringElement34;
            str29 = strDecodeStringElement29;
            str13 = strDecodeStringElement13;
            str11 = strDecodeStringElement11;
            str10 = strDecodeStringElement10;
            str8 = strDecodeStringElement8;
            str7 = strDecodeStringElement7;
            str6 = strDecodeStringElement6;
            str9 = strDecodeStringElement9;
            str5 = strDecodeStringElement5;
            str12 = strDecodeStringElement12;
            list4 = list8;
            list = list6;
            str25 = strDecodeStringElement25;
            str17 = strDecodeStringElement17;
            str15 = strDecodeStringElement15;
            str14 = strDecodeStringElement14;
            str16 = strDecodeStringElement16;
            i15 = iDecodeIntElement;
            list5 = list7;
            jsonElement = jsonElement2;
            str18 = strDecodeStringElement18;
            str19 = strDecodeStringElement19;
            z11 = zDecodeBooleanElement;
            str20 = strDecodeStringElement20;
            str21 = strDecodeStringElement21;
            z12 = zDecodeBooleanElement2;
            i12 = iDecodeIntElement2;
            i13 = iDecodeIntElement3;
            str2 = strDecodeStringElement2;
            str4 = strDecodeStringElement4;
            num = num4;
            num2 = num5;
            str22 = strDecodeStringElement22;
            str23 = strDecodeStringElement23;
            str24 = strDecodeStringElement24;
            str26 = strDecodeStringElement26;
            str27 = strDecodeStringElement27;
            i14 = iDecodeIntElement4;
            str28 = strDecodeStringElement28;
            str = str35;
            num3 = num6;
            str30 = strDecodeStringElement30;
            str31 = strDecodeStringElement31;
            str3 = strDecodeStringElement3;
            str32 = strDecodeStringElement32;
            i11 = 524287;
            i10 = -1;
        } else {
            boolean z14 = true;
            boolean zDecodeBooleanElement4 = false;
            int i18 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            boolean zDecodeBooleanElement5 = false;
            int i19 = 0;
            Integer num7 = null;
            Integer num8 = null;
            JsonElement jsonElement3 = null;
            Integer num9 = null;
            List list11 = null;
            String str36 = null;
            List list12 = null;
            List list13 = null;
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            String strDecodeStringElement37 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            String str42 = null;
            String str43 = null;
            String str44 = null;
            String str45 = null;
            String str46 = null;
            String str47 = null;
            String str48 = null;
            String str49 = null;
            String str50 = null;
            String str51 = null;
            String str52 = null;
            String str53 = null;
            String str54 = null;
            String str55 = null;
            String str56 = null;
            String str57 = null;
            String str58 = null;
            String str59 = null;
            String str60 = null;
            String str61 = null;
            String str62 = null;
            String str63 = null;
            String str64 = null;
            String str65 = null;
            String str66 = null;
            String str67 = null;
            int i20 = 3;
            int i21 = 0;
            List list14 = null;
            List list15 = null;
            while (true) {
                boolean z15 = z13;
                if (z14) {
                    int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            i16 = i20;
                            Unit unit = Unit.f312394a;
                            z14 = false;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 0:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            i16 = i20;
                            strDecodeStringElement35 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                            i21 |= 1;
                            Unit unit2 = Unit.f312394a;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 1:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            i16 = i20;
                            strDecodeStringElement36 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i21 |= 2;
                            Unit unit3 = Unit.f312394a;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 2:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            i16 = i20;
                            strDecodeStringElement37 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                            i21 |= 4;
                            Unit unit4 = Unit.f312394a;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 3:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            i16 = i20;
                            list14 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i16, kSerializerArr[i20], list14);
                            i21 |= 8;
                            Unit unit5 = Unit.f312394a;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 4:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement38 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                            i21 |= 16;
                            Unit unit6 = Unit.f312394a;
                            str37 = strDecodeStringElement38;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 5:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement39 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                            i21 |= 32;
                            Unit unit7 = Unit.f312394a;
                            str38 = strDecodeStringElement39;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 6:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement40 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                            i21 |= 64;
                            Unit unit8 = Unit.f312394a;
                            str39 = strDecodeStringElement40;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 7:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement41 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                            i21 |= 128;
                            Unit unit9 = Unit.f312394a;
                            str40 = strDecodeStringElement41;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 8:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement42 = dVarBeginStructure.decodeStringElement(serialDescriptor, 8);
                            i21 |= 256;
                            Unit unit10 = Unit.f312394a;
                            str41 = strDecodeStringElement42;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 9:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement43 = dVarBeginStructure.decodeStringElement(serialDescriptor, 9);
                            i21 |= 512;
                            Unit unit11 = Unit.f312394a;
                            str42 = strDecodeStringElement43;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 10:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement44 = dVarBeginStructure.decodeStringElement(serialDescriptor, 10);
                            i21 |= 1024;
                            Unit unit12 = Unit.f312394a;
                            str43 = strDecodeStringElement44;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 11:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement45 = dVarBeginStructure.decodeStringElement(serialDescriptor, 11);
                            i21 |= 2048;
                            Unit unit13 = Unit.f312394a;
                            str44 = strDecodeStringElement45;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 12:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement46 = dVarBeginStructure.decodeStringElement(serialDescriptor, 12);
                            i21 |= 4096;
                            Unit unit14 = Unit.f312394a;
                            str45 = strDecodeStringElement46;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 13:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement47 = dVarBeginStructure.decodeStringElement(serialDescriptor, 13);
                            i21 |= 8192;
                            Unit unit15 = Unit.f312394a;
                            str46 = strDecodeStringElement47;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 14:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement48 = dVarBeginStructure.decodeStringElement(serialDescriptor, 14);
                            i21 |= 16384;
                            Unit unit16 = Unit.f312394a;
                            str47 = strDecodeStringElement48;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 15:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement49 = dVarBeginStructure.decodeStringElement(serialDescriptor, 15);
                            i21 |= 32768;
                            Unit unit17 = Unit.f312394a;
                            str48 = strDecodeStringElement49;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 16:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement50 = dVarBeginStructure.decodeStringElement(serialDescriptor, 16);
                            i21 |= 65536;
                            Unit unit18 = Unit.f312394a;
                            str49 = strDecodeStringElement50;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 17:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            int iDecodeIntElement8 = dVarBeginStructure.decodeIntElement(serialDescriptor, 17);
                            i21 |= 131072;
                            Unit unit19 = Unit.f312394a;
                            i19 = iDecodeIntElement8;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 18:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement51 = dVarBeginStructure.decodeStringElement(serialDescriptor, 18);
                            i21 |= 262144;
                            Unit unit20 = Unit.f312394a;
                            str50 = strDecodeStringElement51;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 19:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement52 = dVarBeginStructure.decodeStringElement(serialDescriptor, 19);
                            i21 |= 524288;
                            Unit unit21 = Unit.f312394a;
                            str51 = strDecodeStringElement52;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 20:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            boolean zDecodeBooleanElement6 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 20);
                            i21 |= 1048576;
                            Unit unit22 = Unit.f312394a;
                            z15 = zDecodeBooleanElement6;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 21:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement53 = dVarBeginStructure.decodeStringElement(serialDescriptor, 21);
                            i21 |= 2097152;
                            Unit unit23 = Unit.f312394a;
                            str52 = strDecodeStringElement53;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 22:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement54 = dVarBeginStructure.decodeStringElement(serialDescriptor, 22);
                            i21 |= 4194304;
                            Unit unit24 = Unit.f312394a;
                            str53 = strDecodeStringElement54;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 23:
                            zDecodeBooleanElement4 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 23);
                            i21 |= 8388608;
                            Unit unit25 = Unit.f312394a;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 24:
                            iDecodeIntElement5 = dVarBeginStructure.decodeIntElement(serialDescriptor, 24);
                            i17 = 16777216;
                            i21 |= i17;
                            Unit unit26 = Unit.f312394a;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 25:
                            iDecodeIntElement6 = dVarBeginStructure.decodeIntElement(serialDescriptor, 25);
                            i17 = com.google.api.client.googleapis.media.a.f115410j;
                            i21 |= i17;
                            Unit unit27 = Unit.f312394a;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 26:
                            num7 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, y0.f316055a, num7);
                            i17 = 67108864;
                            i21 |= i17;
                            Unit unit28 = Unit.f312394a;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 27:
                            num8 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 27, y0.f316055a, num8);
                            i17 = j.W0;
                            i21 |= i17;
                            Unit unit29 = Unit.f312394a;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 28:
                            iDecodeIntElement7 = dVarBeginStructure.decodeIntElement(serialDescriptor, 28);
                            i17 = 268435456;
                            i21 |= i17;
                            Unit unit210 = Unit.f312394a;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 29:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement55 = dVarBeginStructure.decodeStringElement(serialDescriptor, 29);
                            i21 |= 536870912;
                            Unit unit30 = Unit.f312394a;
                            str54 = strDecodeStringElement55;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 30:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement56 = dVarBeginStructure.decodeStringElement(serialDescriptor, 30);
                            i21 |= 1073741824;
                            Unit unit31 = Unit.f312394a;
                            str55 = strDecodeStringElement56;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 31:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement57 = dVarBeginStructure.decodeStringElement(serialDescriptor, 31);
                            i21 |= Integer.MIN_VALUE;
                            Unit unit32 = Unit.f312394a;
                            str56 = strDecodeStringElement57;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 32:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement58 = dVarBeginStructure.decodeStringElement(serialDescriptor, 32);
                            i18 |= 1;
                            Unit unit33 = Unit.f312394a;
                            str57 = strDecodeStringElement58;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 33:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement59 = dVarBeginStructure.decodeStringElement(serialDescriptor, 33);
                            i18 |= 2;
                            Unit unit34 = Unit.f312394a;
                            str58 = strDecodeStringElement59;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 34:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement60 = dVarBeginStructure.decodeStringElement(serialDescriptor, 34);
                            i18 |= 4;
                            Unit unit35 = Unit.f312394a;
                            str59 = strDecodeStringElement60;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 35:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement61 = dVarBeginStructure.decodeStringElement(serialDescriptor, 35);
                            i18 |= 8;
                            Unit unit36 = Unit.f312394a;
                            str60 = strDecodeStringElement61;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 36:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            List list16 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 36, kSerializerArr[36], list15);
                            i18 |= 16;
                            Unit unit37 = Unit.f312394a;
                            list15 = list16;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 37:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            List list17 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 37, kSerializerArr[37], list13);
                            i18 |= 32;
                            Unit unit38 = Unit.f312394a;
                            list13 = list17;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 38:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String str68 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 38, b3.f315897a, str36);
                            i18 |= 64;
                            Unit unit39 = Unit.f312394a;
                            str36 = str68;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 39:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            List list18 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 39, kSerializerArr[39], list11);
                            i18 |= 128;
                            Unit unit40 = Unit.f312394a;
                            list11 = list18;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 40:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            zDecodeBooleanElement5 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 40);
                            i18 |= 256;
                            Unit unit211 = Unit.f312394a;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 41:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement62 = dVarBeginStructure.decodeStringElement(serialDescriptor, 41);
                            i18 |= 512;
                            Unit unit41 = Unit.f312394a;
                            str61 = strDecodeStringElement62;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 42:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement63 = dVarBeginStructure.decodeStringElement(serialDescriptor, 42);
                            i18 |= 1024;
                            Unit unit42 = Unit.f312394a;
                            str62 = strDecodeStringElement63;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 43:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement64 = dVarBeginStructure.decodeStringElement(serialDescriptor, 43);
                            i18 |= 2048;
                            Unit unit43 = Unit.f312394a;
                            str63 = strDecodeStringElement64;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 44:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            Integer num10 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 44, y0.f316055a, num9);
                            i18 |= 4096;
                            Unit unit44 = Unit.f312394a;
                            num9 = num10;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 45:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            String strDecodeStringElement65 = dVarBeginStructure.decodeStringElement(serialDescriptor, 45);
                            i18 |= 8192;
                            Unit unit45 = Unit.f312394a;
                            str64 = strDecodeStringElement65;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 46:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            List list19 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 46, kSerializerArr[46], list12);
                            i18 |= 16384;
                            Unit unit46 = Unit.f312394a;
                            list12 = list19;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 47:
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            JsonElement jsonElement4 = (JsonElement) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 47, JsonElementSerializer.INSTANCE, jsonElement3);
                            i18 |= 32768;
                            Unit unit47 = Unit.f312394a;
                            jsonElement3 = jsonElement4;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 48:
                            String strDecodeStringElement66 = dVarBeginStructure.decodeStringElement(serialDescriptor, 48);
                            i18 |= 65536;
                            Unit unit48 = Unit.f312394a;
                            str65 = strDecodeStringElement66;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 49:
                            String strDecodeStringElement67 = dVarBeginStructure.decodeStringElement(serialDescriptor, 49);
                            i18 |= 131072;
                            Unit unit49 = Unit.f312394a;
                            str66 = strDecodeStringElement67;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        case 50:
                            String strDecodeStringElement68 = dVarBeginStructure.decodeStringElement(serialDescriptor, 50);
                            i18 |= 262144;
                            Unit unit50 = Unit.f312394a;
                            str67 = strDecodeStringElement68;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            i16 = i20;
                            i20 = i16;
                            z13 = z15;
                            zDecodeBooleanElement4 = zDecodeBooleanElement4;
                            break;
                        default:
                            throw new t0(iDecodeElementIndex);
                    }
                } else {
                    num = num7;
                    list = list14;
                    num2 = num8;
                    i10 = i21;
                    i11 = i18;
                    jsonElement = jsonElement3;
                    num3 = num9;
                    list2 = list11;
                    str = str36;
                    list3 = list12;
                    list4 = list13;
                    list5 = list15;
                    i12 = iDecodeIntElement5;
                    i13 = iDecodeIntElement6;
                    i14 = iDecodeIntElement7;
                    z10 = zDecodeBooleanElement5;
                    str2 = strDecodeStringElement35;
                    str3 = strDecodeStringElement36;
                    str4 = strDecodeStringElement37;
                    str5 = str37;
                    str6 = str38;
                    str7 = str39;
                    str8 = str40;
                    str9 = str41;
                    str10 = str42;
                    str11 = str43;
                    str12 = str44;
                    str13 = str45;
                    str14 = str46;
                    str15 = str47;
                    str16 = str48;
                    str17 = str49;
                    str18 = str50;
                    str19 = str51;
                    str20 = str52;
                    str21 = str53;
                    str22 = str54;
                    str23 = str55;
                    str24 = str56;
                    str25 = str57;
                    str26 = str58;
                    str27 = str59;
                    str28 = str60;
                    str29 = str61;
                    str30 = str62;
                    str31 = str63;
                    str32 = str64;
                    str33 = str65;
                    str34 = str66;
                    strDecodeStringElement = str67;
                    i15 = i19;
                    z11 = z15;
                    z12 = zDecodeBooleanElement4;
                }
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new DeviceTemplate(i10, i11, str2, str3, str4, list, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, i15, str18, str19, z11, str20, str21, z12, i12, i13, num, num2, i14, str22, str23, str24, str25, str26, str27, str28, list5, list4, str, list2, z10, str29, str30, str31, num3, str32, list3, jsonElement, str33, str34, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull DeviceTemplate value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        DeviceTemplate.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
