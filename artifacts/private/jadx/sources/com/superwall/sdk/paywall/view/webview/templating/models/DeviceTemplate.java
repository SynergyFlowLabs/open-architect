package com.superwall.sdk.paywall.view.webview.templating.models;

import com.superwall.sdk.storage.core_data.ConvertersKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class DeviceTemplate {

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final List<String> activeEntitlements;

    @NotNull
    private final List<Map<String, String>> activeEntitlementsObject;

    @NotNull
    private final List<String> activeProducts;

    @NotNull
    private final List<String> aliases;

    @NotNull
    private final String appBuildString;

    @Nullable
    private final Integer appBuildStringNumber;

    @NotNull
    private final String appInstallDate;

    @NotNull
    private final String appUserId;

    @NotNull
    private final String appVersion;

    @NotNull
    private final String appVersionPadded;

    @NotNull
    private final String bundleId;

    @NotNull
    private final List<String> capabilities;

    @NotNull
    private final JsonElement capabilitiesConfig;
    private final int daysSinceInstall;

    @Nullable
    private final Integer daysSinceLastPaywallView;

    @NotNull
    private final String deviceCurrencyCode;

    @NotNull
    private final String deviceCurrencySymbol;

    @NotNull
    private final String deviceLanguageCode;

    @NotNull
    private final String deviceLocale;

    @NotNull
    private final String deviceModel;

    @NotNull
    private final String deviceTier;

    @NotNull
    private final String interfaceStyle;

    @NotNull
    private final String interfaceStyleMode;
    private final boolean isFirstAppOpen;
    private final boolean isLowPowerModeEnabled;
    private final boolean isMac;

    @NotNull
    private final String isSandbox;

    @NotNull
    private final String localDate;

    @NotNull
    private final String localDateTime;

    @NotNull
    private final String localTime;
    private final int minutesSinceInstall;

    @Nullable
    private final Integer minutesSinceLastPaywallView;

    @NotNull
    private final String osVersion;

    @NotNull
    private final String platform;

    @NotNull
    private final String platformWrapper;

    @NotNull
    private final String platformWrapperVersion;

    @NotNull
    private final String preferredLanguageCode;

    @NotNull
    private final String preferredLocale;

    @NotNull
    private final String preferredRegionCode;

    @NotNull
    private final String publicApiKey;

    @NotNull
    private final String radioType;

    @NotNull
    private final String regionCode;

    @NotNull
    private final String sdkVersion;

    @NotNull
    private final String sdkVersionPadded;

    @Nullable
    private final String subscriptionStatus;
    private final int timezoneOffset;
    private final int totalPaywallViews;

    @NotNull
    private final String utcDate;

    @NotNull
    private final String utcDateTime;

    @NotNull
    private final String utcTime;

    @NotNull
    private final String vendorId;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<DeviceTemplate> serializer() {
            return DeviceTemplate$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        b3 b3Var = b3.f315897a;
        int i10 = 5 & 0;
        int i11 = 3 << 4;
        $childSerializers = new KSerializer[]{null, null, null, new kotlinx.serialization.internal.f(b3Var), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new kotlinx.serialization.internal.f(b3Var), new kotlinx.serialization.internal.f(new e1(b3Var, b3Var)), null, new kotlinx.serialization.internal.f(b3Var), null, null, null, null, null, null, new kotlinx.serialization.internal.f(b3Var), null, null, null, null};
    }

    public /* synthetic */ DeviceTemplate(int i10, int i11, String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i12, String str17, String str18, boolean z10, String str19, String str20, boolean z11, int i13, int i14, Integer num, Integer num2, int i15, String str21, String str22, String str23, String str24, String str25, String str26, String str27, List list2, List list3, String str28, List list4, boolean z12, String str29, String str30, String str31, Integer num3, String str32, List list5, JsonElement jsonElement, String str33, String str34, String str35, v2 v2Var) {
        if ((524287 != (i11 & 524287)) | (-1 != i10)) {
            g2.a(new int[]{i10, i11}, new int[]{-1, 524287}, DeviceTemplate$$serializer.INSTANCE.getDescriptor());
        }
        this.publicApiKey = str;
        this.platform = str2;
        this.appUserId = str3;
        this.aliases = list;
        this.vendorId = str4;
        this.appVersion = str5;
        this.appVersionPadded = str6;
        this.osVersion = str7;
        this.deviceModel = str8;
        this.deviceLocale = str9;
        this.preferredLocale = str10;
        this.deviceLanguageCode = str11;
        this.preferredLanguageCode = str12;
        this.regionCode = str13;
        this.preferredRegionCode = str14;
        this.deviceCurrencyCode = str15;
        this.deviceCurrencySymbol = str16;
        this.timezoneOffset = i12;
        this.radioType = str17;
        this.interfaceStyle = str18;
        this.isLowPowerModeEnabled = z10;
        this.bundleId = str19;
        this.appInstallDate = str20;
        this.isMac = z11;
        this.daysSinceInstall = i13;
        this.minutesSinceInstall = i14;
        this.daysSinceLastPaywallView = num;
        this.minutesSinceLastPaywallView = num2;
        this.totalPaywallViews = i15;
        this.utcDate = str21;
        this.localDate = str22;
        this.utcTime = str23;
        this.localTime = str24;
        this.utcDateTime = str25;
        this.localDateTime = str26;
        this.isSandbox = str27;
        this.activeEntitlements = list2;
        this.activeEntitlementsObject = list3;
        this.subscriptionStatus = str28;
        this.activeProducts = list4;
        this.isFirstAppOpen = z12;
        this.sdkVersion = str29;
        this.sdkVersionPadded = str30;
        this.appBuildString = str31;
        this.appBuildStringNumber = num3;
        this.interfaceStyleMode = str32;
        this.capabilities = list5;
        this.capabilitiesConfig = jsonElement;
        this.platformWrapper = str33;
        this.platformWrapperVersion = str34;
        this.deviceTier = str35;
    }

    @a0("capabilities")
    public static /* synthetic */ void getCapabilities$annotations() {
    }

    @a0("capabilities_config")
    public static /* synthetic */ void getCapabilitiesConfig$annotations() {
    }

    @a0("platform_wrapper")
    public static /* synthetic */ void getPlatformWrapper$annotations() {
    }

    @a0("platform_wrapper_version")
    public static /* synthetic */ void getPlatformWrapperVersion$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(DeviceTemplate deviceTemplate, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeStringElement(serialDescriptor, 0, deviceTemplate.publicApiKey);
        eVar.encodeStringElement(serialDescriptor, 1, deviceTemplate.platform);
        eVar.encodeStringElement(serialDescriptor, 2, deviceTemplate.appUserId);
        eVar.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], deviceTemplate.aliases);
        eVar.encodeStringElement(serialDescriptor, 4, deviceTemplate.vendorId);
        eVar.encodeStringElement(serialDescriptor, 5, deviceTemplate.appVersion);
        eVar.encodeStringElement(serialDescriptor, 6, deviceTemplate.appVersionPadded);
        eVar.encodeStringElement(serialDescriptor, 7, deviceTemplate.osVersion);
        eVar.encodeStringElement(serialDescriptor, 8, deviceTemplate.deviceModel);
        eVar.encodeStringElement(serialDescriptor, 9, deviceTemplate.deviceLocale);
        eVar.encodeStringElement(serialDescriptor, 10, deviceTemplate.preferredLocale);
        eVar.encodeStringElement(serialDescriptor, 11, deviceTemplate.deviceLanguageCode);
        eVar.encodeStringElement(serialDescriptor, 12, deviceTemplate.preferredLanguageCode);
        eVar.encodeStringElement(serialDescriptor, 13, deviceTemplate.regionCode);
        eVar.encodeStringElement(serialDescriptor, 14, deviceTemplate.preferredRegionCode);
        eVar.encodeStringElement(serialDescriptor, 15, deviceTemplate.deviceCurrencyCode);
        eVar.encodeStringElement(serialDescriptor, 16, deviceTemplate.deviceCurrencySymbol);
        eVar.encodeIntElement(serialDescriptor, 17, deviceTemplate.timezoneOffset);
        eVar.encodeStringElement(serialDescriptor, 18, deviceTemplate.radioType);
        eVar.encodeStringElement(serialDescriptor, 19, deviceTemplate.interfaceStyle);
        eVar.encodeBooleanElement(serialDescriptor, 20, deviceTemplate.isLowPowerModeEnabled);
        eVar.encodeStringElement(serialDescriptor, 21, deviceTemplate.bundleId);
        eVar.encodeStringElement(serialDescriptor, 22, deviceTemplate.appInstallDate);
        eVar.encodeBooleanElement(serialDescriptor, 23, deviceTemplate.isMac);
        eVar.encodeIntElement(serialDescriptor, 24, deviceTemplate.daysSinceInstall);
        eVar.encodeIntElement(serialDescriptor, 25, deviceTemplate.minutesSinceInstall);
        y0 y0Var = y0.f316055a;
        eVar.encodeNullableSerializableElement(serialDescriptor, 26, y0Var, deviceTemplate.daysSinceLastPaywallView);
        eVar.encodeNullableSerializableElement(serialDescriptor, 27, y0Var, deviceTemplate.minutesSinceLastPaywallView);
        eVar.encodeIntElement(serialDescriptor, 28, deviceTemplate.totalPaywallViews);
        eVar.encodeStringElement(serialDescriptor, 29, deviceTemplate.utcDate);
        eVar.encodeStringElement(serialDescriptor, 30, deviceTemplate.localDate);
        eVar.encodeStringElement(serialDescriptor, 31, deviceTemplate.utcTime);
        eVar.encodeStringElement(serialDescriptor, 32, deviceTemplate.localTime);
        eVar.encodeStringElement(serialDescriptor, 33, deviceTemplate.utcDateTime);
        eVar.encodeStringElement(serialDescriptor, 34, deviceTemplate.localDateTime);
        eVar.encodeStringElement(serialDescriptor, 35, deviceTemplate.isSandbox);
        eVar.encodeSerializableElement(serialDescriptor, 36, kSerializerArr[36], deviceTemplate.activeEntitlements);
        eVar.encodeSerializableElement(serialDescriptor, 37, kSerializerArr[37], deviceTemplate.activeEntitlementsObject);
        eVar.encodeNullableSerializableElement(serialDescriptor, 38, b3.f315897a, deviceTemplate.subscriptionStatus);
        eVar.encodeSerializableElement(serialDescriptor, 39, kSerializerArr[39], deviceTemplate.activeProducts);
        eVar.encodeBooleanElement(serialDescriptor, 40, deviceTemplate.isFirstAppOpen);
        eVar.encodeStringElement(serialDescriptor, 41, deviceTemplate.sdkVersion);
        eVar.encodeStringElement(serialDescriptor, 42, deviceTemplate.sdkVersionPadded);
        eVar.encodeStringElement(serialDescriptor, 43, deviceTemplate.appBuildString);
        eVar.encodeNullableSerializableElement(serialDescriptor, 44, y0Var, deviceTemplate.appBuildStringNumber);
        eVar.encodeStringElement(serialDescriptor, 45, deviceTemplate.interfaceStyleMode);
        eVar.encodeSerializableElement(serialDescriptor, 46, kSerializerArr[46], deviceTemplate.capabilities);
        eVar.encodeSerializableElement(serialDescriptor, 47, JsonElementSerializer.INSTANCE, deviceTemplate.capabilitiesConfig);
        eVar.encodeStringElement(serialDescriptor, 48, deviceTemplate.platformWrapper);
        eVar.encodeStringElement(serialDescriptor, 49, deviceTemplate.platformWrapperVersion);
        eVar.encodeStringElement(serialDescriptor, 50, deviceTemplate.deviceTier);
    }

    @NotNull
    public final String component1() {
        return this.publicApiKey;
    }

    @NotNull
    public final String component10() {
        return this.deviceLocale;
    }

    @NotNull
    public final String component11() {
        return this.preferredLocale;
    }

    @NotNull
    public final String component12() {
        return this.deviceLanguageCode;
    }

    @NotNull
    public final String component13() {
        return this.preferredLanguageCode;
    }

    @NotNull
    public final String component14() {
        return this.regionCode;
    }

    @NotNull
    public final String component15() {
        return this.preferredRegionCode;
    }

    @NotNull
    public final String component16() {
        return this.deviceCurrencyCode;
    }

    @NotNull
    public final String component17() {
        return this.deviceCurrencySymbol;
    }

    public final int component18() {
        return this.timezoneOffset;
    }

    @NotNull
    public final String component19() {
        return this.radioType;
    }

    @NotNull
    public final String component2() {
        return this.platform;
    }

    @NotNull
    public final String component20() {
        return this.interfaceStyle;
    }

    public final boolean component21() {
        return this.isLowPowerModeEnabled;
    }

    @NotNull
    public final String component22() {
        return this.bundleId;
    }

    @NotNull
    public final String component23() {
        return this.appInstallDate;
    }

    public final boolean component24() {
        return this.isMac;
    }

    public final int component25() {
        return this.daysSinceInstall;
    }

    public final int component26() {
        return this.minutesSinceInstall;
    }

    @Nullable
    public final Integer component27() {
        return this.daysSinceLastPaywallView;
    }

    @Nullable
    public final Integer component28() {
        return this.minutesSinceLastPaywallView;
    }

    public final int component29() {
        return this.totalPaywallViews;
    }

    @NotNull
    public final String component3() {
        return this.appUserId;
    }

    @NotNull
    public final String component30() {
        return this.utcDate;
    }

    @NotNull
    public final String component31() {
        return this.localDate;
    }

    @NotNull
    public final String component32() {
        return this.utcTime;
    }

    @NotNull
    public final String component33() {
        return this.localTime;
    }

    @NotNull
    public final String component34() {
        return this.utcDateTime;
    }

    @NotNull
    public final String component35() {
        return this.localDateTime;
    }

    @NotNull
    public final String component36() {
        return this.isSandbox;
    }

    @NotNull
    public final List<String> component37() {
        return this.activeEntitlements;
    }

    @NotNull
    public final List<Map<String, String>> component38() {
        return this.activeEntitlementsObject;
    }

    @Nullable
    public final String component39() {
        return this.subscriptionStatus;
    }

    @NotNull
    public final List<String> component4() {
        return this.aliases;
    }

    @NotNull
    public final List<String> component40() {
        return this.activeProducts;
    }

    public final boolean component41() {
        return this.isFirstAppOpen;
    }

    @NotNull
    public final String component42() {
        return this.sdkVersion;
    }

    @NotNull
    public final String component43() {
        return this.sdkVersionPadded;
    }

    @NotNull
    public final String component44() {
        return this.appBuildString;
    }

    @Nullable
    public final Integer component45() {
        return this.appBuildStringNumber;
    }

    @NotNull
    public final String component46() {
        return this.interfaceStyleMode;
    }

    @NotNull
    public final List<String> component47() {
        return this.capabilities;
    }

    @NotNull
    public final JsonElement component48() {
        return this.capabilitiesConfig;
    }

    @NotNull
    public final String component49() {
        return this.platformWrapper;
    }

    @NotNull
    public final String component5() {
        return this.vendorId;
    }

    @NotNull
    public final String component50() {
        return this.platformWrapperVersion;
    }

    @NotNull
    public final String component51() {
        return this.deviceTier;
    }

    @NotNull
    public final String component6() {
        return this.appVersion;
    }

    @NotNull
    public final String component7() {
        return this.appVersionPadded;
    }

    @NotNull
    public final String component8() {
        return this.osVersion;
    }

    @NotNull
    public final String component9() {
        return this.deviceModel;
    }

    @NotNull
    public final DeviceTemplate copy(@NotNull String publicApiKey, @NotNull String platform, @NotNull String appUserId, @NotNull List<String> aliases, @NotNull String vendorId, @NotNull String appVersion, @NotNull String appVersionPadded, @NotNull String osVersion, @NotNull String deviceModel, @NotNull String deviceLocale, @NotNull String preferredLocale, @NotNull String deviceLanguageCode, @NotNull String preferredLanguageCode, @NotNull String regionCode, @NotNull String preferredRegionCode, @NotNull String deviceCurrencyCode, @NotNull String deviceCurrencySymbol, int i10, @NotNull String radioType, @NotNull String interfaceStyle, boolean z10, @NotNull String bundleId, @NotNull String appInstallDate, boolean z11, int i11, int i12, @Nullable Integer num, @Nullable Integer num2, int i13, @NotNull String utcDate, @NotNull String localDate, @NotNull String utcTime, @NotNull String localTime, @NotNull String utcDateTime, @NotNull String localDateTime, @NotNull String isSandbox, @NotNull List<String> activeEntitlements, @NotNull List<? extends Map<String, String>> activeEntitlementsObject, @Nullable String str, @NotNull List<String> activeProducts, boolean z12, @NotNull String sdkVersion, @NotNull String sdkVersionPadded, @NotNull String appBuildString, @Nullable Integer num3, @NotNull String interfaceStyleMode, @NotNull List<String> capabilities, @NotNull JsonElement capabilitiesConfig, @NotNull String platformWrapper, @NotNull String platformWrapperVersion, @NotNull String deviceTier) {
        Intrinsics.checkNotNullParameter(publicApiKey, "publicApiKey");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(appUserId, "appUserId");
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        Intrinsics.checkNotNullParameter(vendorId, "vendorId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(appVersionPadded, "appVersionPadded");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceLocale, "deviceLocale");
        Intrinsics.checkNotNullParameter(preferredLocale, "preferredLocale");
        Intrinsics.checkNotNullParameter(deviceLanguageCode, "deviceLanguageCode");
        Intrinsics.checkNotNullParameter(preferredLanguageCode, "preferredLanguageCode");
        Intrinsics.checkNotNullParameter(regionCode, "regionCode");
        Intrinsics.checkNotNullParameter(preferredRegionCode, "preferredRegionCode");
        Intrinsics.checkNotNullParameter(deviceCurrencyCode, "deviceCurrencyCode");
        Intrinsics.checkNotNullParameter(deviceCurrencySymbol, "deviceCurrencySymbol");
        Intrinsics.checkNotNullParameter(radioType, "radioType");
        Intrinsics.checkNotNullParameter(interfaceStyle, "interfaceStyle");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(appInstallDate, "appInstallDate");
        Intrinsics.checkNotNullParameter(utcDate, "utcDate");
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        Intrinsics.checkNotNullParameter(utcTime, "utcTime");
        Intrinsics.checkNotNullParameter(localTime, "localTime");
        Intrinsics.checkNotNullParameter(utcDateTime, "utcDateTime");
        Intrinsics.checkNotNullParameter(localDateTime, "localDateTime");
        Intrinsics.checkNotNullParameter(isSandbox, "isSandbox");
        Intrinsics.checkNotNullParameter(activeEntitlements, "activeEntitlements");
        Intrinsics.checkNotNullParameter(activeEntitlementsObject, "activeEntitlementsObject");
        Intrinsics.checkNotNullParameter(activeProducts, "activeProducts");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sdkVersionPadded, "sdkVersionPadded");
        Intrinsics.checkNotNullParameter(appBuildString, "appBuildString");
        Intrinsics.checkNotNullParameter(interfaceStyleMode, "interfaceStyleMode");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(capabilitiesConfig, "capabilitiesConfig");
        Intrinsics.checkNotNullParameter(platformWrapper, "platformWrapper");
        Intrinsics.checkNotNullParameter(platformWrapperVersion, "platformWrapperVersion");
        Intrinsics.checkNotNullParameter(deviceTier, "deviceTier");
        return new DeviceTemplate(publicApiKey, platform, appUserId, aliases, vendorId, appVersion, appVersionPadded, osVersion, deviceModel, deviceLocale, preferredLocale, deviceLanguageCode, preferredLanguageCode, regionCode, preferredRegionCode, deviceCurrencyCode, deviceCurrencySymbol, i10, radioType, interfaceStyle, z10, bundleId, appInstallDate, z11, i11, i12, num, num2, i13, utcDate, localDate, utcTime, localTime, utcDateTime, localDateTime, isSandbox, activeEntitlements, activeEntitlementsObject, str, activeProducts, z12, sdkVersion, sdkVersionPadded, appBuildString, num3, interfaceStyleMode, capabilities, capabilitiesConfig, platformWrapper, platformWrapperVersion, deviceTier);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceTemplate)) {
            return false;
        }
        DeviceTemplate deviceTemplate = (DeviceTemplate) obj;
        if (Intrinsics.areEqual(this.publicApiKey, deviceTemplate.publicApiKey) && Intrinsics.areEqual(this.platform, deviceTemplate.platform) && Intrinsics.areEqual(this.appUserId, deviceTemplate.appUserId) && Intrinsics.areEqual(this.aliases, deviceTemplate.aliases) && Intrinsics.areEqual(this.vendorId, deviceTemplate.vendorId) && Intrinsics.areEqual(this.appVersion, deviceTemplate.appVersion) && Intrinsics.areEqual(this.appVersionPadded, deviceTemplate.appVersionPadded) && Intrinsics.areEqual(this.osVersion, deviceTemplate.osVersion) && Intrinsics.areEqual(this.deviceModel, deviceTemplate.deviceModel) && Intrinsics.areEqual(this.deviceLocale, deviceTemplate.deviceLocale) && Intrinsics.areEqual(this.preferredLocale, deviceTemplate.preferredLocale) && Intrinsics.areEqual(this.deviceLanguageCode, deviceTemplate.deviceLanguageCode) && Intrinsics.areEqual(this.preferredLanguageCode, deviceTemplate.preferredLanguageCode) && Intrinsics.areEqual(this.regionCode, deviceTemplate.regionCode) && Intrinsics.areEqual(this.preferredRegionCode, deviceTemplate.preferredRegionCode) && Intrinsics.areEqual(this.deviceCurrencyCode, deviceTemplate.deviceCurrencyCode) && Intrinsics.areEqual(this.deviceCurrencySymbol, deviceTemplate.deviceCurrencySymbol) && this.timezoneOffset == deviceTemplate.timezoneOffset && Intrinsics.areEqual(this.radioType, deviceTemplate.radioType) && Intrinsics.areEqual(this.interfaceStyle, deviceTemplate.interfaceStyle) && this.isLowPowerModeEnabled == deviceTemplate.isLowPowerModeEnabled && Intrinsics.areEqual(this.bundleId, deviceTemplate.bundleId) && Intrinsics.areEqual(this.appInstallDate, deviceTemplate.appInstallDate) && this.isMac == deviceTemplate.isMac && this.daysSinceInstall == deviceTemplate.daysSinceInstall && this.minutesSinceInstall == deviceTemplate.minutesSinceInstall && Intrinsics.areEqual(this.daysSinceLastPaywallView, deviceTemplate.daysSinceLastPaywallView) && Intrinsics.areEqual(this.minutesSinceLastPaywallView, deviceTemplate.minutesSinceLastPaywallView) && this.totalPaywallViews == deviceTemplate.totalPaywallViews && Intrinsics.areEqual(this.utcDate, deviceTemplate.utcDate) && Intrinsics.areEqual(this.localDate, deviceTemplate.localDate) && Intrinsics.areEqual(this.utcTime, deviceTemplate.utcTime) && Intrinsics.areEqual(this.localTime, deviceTemplate.localTime) && Intrinsics.areEqual(this.utcDateTime, deviceTemplate.utcDateTime) && Intrinsics.areEqual(this.localDateTime, deviceTemplate.localDateTime) && Intrinsics.areEqual(this.isSandbox, deviceTemplate.isSandbox) && Intrinsics.areEqual(this.activeEntitlements, deviceTemplate.activeEntitlements) && Intrinsics.areEqual(this.activeEntitlementsObject, deviceTemplate.activeEntitlementsObject) && Intrinsics.areEqual(this.subscriptionStatus, deviceTemplate.subscriptionStatus) && Intrinsics.areEqual(this.activeProducts, deviceTemplate.activeProducts) && this.isFirstAppOpen == deviceTemplate.isFirstAppOpen && Intrinsics.areEqual(this.sdkVersion, deviceTemplate.sdkVersion) && Intrinsics.areEqual(this.sdkVersionPadded, deviceTemplate.sdkVersionPadded) && Intrinsics.areEqual(this.appBuildString, deviceTemplate.appBuildString) && Intrinsics.areEqual(this.appBuildStringNumber, deviceTemplate.appBuildStringNumber) && Intrinsics.areEqual(this.interfaceStyleMode, deviceTemplate.interfaceStyleMode) && Intrinsics.areEqual(this.capabilities, deviceTemplate.capabilities) && Intrinsics.areEqual(this.capabilitiesConfig, deviceTemplate.capabilitiesConfig) && Intrinsics.areEqual(this.platformWrapper, deviceTemplate.platformWrapper) && Intrinsics.areEqual(this.platformWrapperVersion, deviceTemplate.platformWrapperVersion) && Intrinsics.areEqual(this.deviceTier, deviceTemplate.deviceTier)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<String> getActiveEntitlements() {
        return this.activeEntitlements;
    }

    @NotNull
    public final List<Map<String, String>> getActiveEntitlementsObject() {
        return this.activeEntitlementsObject;
    }

    @NotNull
    public final List<String> getActiveProducts() {
        return this.activeProducts;
    }

    @NotNull
    public final List<String> getAliases() {
        return this.aliases;
    }

    @NotNull
    public final String getAppBuildString() {
        return this.appBuildString;
    }

    @Nullable
    public final Integer getAppBuildStringNumber() {
        return this.appBuildStringNumber;
    }

    @NotNull
    public final String getAppInstallDate() {
        return this.appInstallDate;
    }

    @NotNull
    public final String getAppUserId() {
        return this.appUserId;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getAppVersionPadded() {
        return this.appVersionPadded;
    }

    @NotNull
    public final String getBundleId() {
        return this.bundleId;
    }

    @NotNull
    public final List<String> getCapabilities() {
        return this.capabilities;
    }

    @NotNull
    public final JsonElement getCapabilitiesConfig() {
        return this.capabilitiesConfig;
    }

    public final int getDaysSinceInstall() {
        return this.daysSinceInstall;
    }

    @Nullable
    public final Integer getDaysSinceLastPaywallView() {
        return this.daysSinceLastPaywallView;
    }

    @NotNull
    public final String getDeviceCurrencyCode() {
        return this.deviceCurrencyCode;
    }

    @NotNull
    public final String getDeviceCurrencySymbol() {
        return this.deviceCurrencySymbol;
    }

    @NotNull
    public final String getDeviceLanguageCode() {
        return this.deviceLanguageCode;
    }

    @NotNull
    public final String getDeviceLocale() {
        return this.deviceLocale;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final String getDeviceTier() {
        return this.deviceTier;
    }

    @NotNull
    public final String getInterfaceStyle() {
        return this.interfaceStyle;
    }

    @NotNull
    public final String getInterfaceStyleMode() {
        return this.interfaceStyleMode;
    }

    @NotNull
    public final String getLocalDate() {
        return this.localDate;
    }

    @NotNull
    public final String getLocalDateTime() {
        return this.localDateTime;
    }

    @NotNull
    public final String getLocalTime() {
        return this.localTime;
    }

    public final int getMinutesSinceInstall() {
        return this.minutesSinceInstall;
    }

    @Nullable
    public final Integer getMinutesSinceLastPaywallView() {
        return this.minutesSinceLastPaywallView;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @NotNull
    public final String getPlatformWrapper() {
        return this.platformWrapper;
    }

    @NotNull
    public final String getPlatformWrapperVersion() {
        return this.platformWrapperVersion;
    }

    @NotNull
    public final String getPreferredLanguageCode() {
        return this.preferredLanguageCode;
    }

    @NotNull
    public final String getPreferredLocale() {
        return this.preferredLocale;
    }

    @NotNull
    public final String getPreferredRegionCode() {
        return this.preferredRegionCode;
    }

    @NotNull
    public final String getPublicApiKey() {
        return this.publicApiKey;
    }

    @NotNull
    public final String getRadioType() {
        return this.radioType;
    }

    @NotNull
    public final String getRegionCode() {
        return this.regionCode;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    public final String getSdkVersionPadded() {
        return this.sdkVersionPadded;
    }

    @Nullable
    public final String getSubscriptionStatus() {
        return this.subscriptionStatus;
    }

    public final int getTimezoneOffset() {
        return this.timezoneOffset;
    }

    public final int getTotalPaywallViews() {
        return this.totalPaywallViews;
    }

    @NotNull
    public final String getUtcDate() {
        return this.utcDate;
    }

    @NotNull
    public final String getUtcDateTime() {
        return this.utcDateTime;
    }

    @NotNull
    public final String getUtcTime() {
        return this.utcTime;
    }

    @NotNull
    public final String getVendorId() {
        return this.vendorId;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((this.publicApiKey.hashCode() * 31) + this.platform.hashCode()) * 31) + this.appUserId.hashCode()) * 31) + this.aliases.hashCode()) * 31) + this.vendorId.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.appVersionPadded.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.deviceLocale.hashCode()) * 31) + this.preferredLocale.hashCode()) * 31) + this.deviceLanguageCode.hashCode()) * 31) + this.preferredLanguageCode.hashCode()) * 31) + this.regionCode.hashCode()) * 31) + this.preferredRegionCode.hashCode()) * 31) + this.deviceCurrencyCode.hashCode()) * 31) + this.deviceCurrencySymbol.hashCode()) * 31) + Integer.hashCode(this.timezoneOffset)) * 31) + this.radioType.hashCode()) * 31) + this.interfaceStyle.hashCode()) * 31) + Boolean.hashCode(this.isLowPowerModeEnabled)) * 31) + this.bundleId.hashCode()) * 31) + this.appInstallDate.hashCode()) * 31) + Boolean.hashCode(this.isMac)) * 31) + Integer.hashCode(this.daysSinceInstall)) * 31) + Integer.hashCode(this.minutesSinceInstall)) * 31;
        Integer num = this.daysSinceLastPaywallView;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minutesSinceLastPaywallView;
        int iHashCode3 = (((((((((((((((((((((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + Integer.hashCode(this.totalPaywallViews)) * 31) + this.utcDate.hashCode()) * 31) + this.localDate.hashCode()) * 31) + this.utcTime.hashCode()) * 31) + this.localTime.hashCode()) * 31) + this.utcDateTime.hashCode()) * 31) + this.localDateTime.hashCode()) * 31) + this.isSandbox.hashCode()) * 31) + this.activeEntitlements.hashCode()) * 31) + this.activeEntitlementsObject.hashCode()) * 31;
        String str = this.subscriptionStatus;
        int iHashCode4 = (((((((((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.activeProducts.hashCode()) * 31) + Boolean.hashCode(this.isFirstAppOpen)) * 31) + this.sdkVersion.hashCode()) * 31) + this.sdkVersionPadded.hashCode()) * 31) + this.appBuildString.hashCode()) * 31;
        Integer num3 = this.appBuildStringNumber;
        return ((((((((((((iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31) + this.interfaceStyleMode.hashCode()) * 31) + this.capabilities.hashCode()) * 31) + this.capabilitiesConfig.hashCode()) * 31) + this.platformWrapper.hashCode()) * 31) + this.platformWrapperVersion.hashCode()) * 31) + this.deviceTier.hashCode();
    }

    public final boolean isFirstAppOpen() {
        return this.isFirstAppOpen;
    }

    public final boolean isLowPowerModeEnabled() {
        return this.isLowPowerModeEnabled;
    }

    public final boolean isMac() {
        return this.isMac;
    }

    @NotNull
    public final String isSandbox() {
        return this.isSandbox;
    }

    @NotNull
    public final Map<String, Object> toDictionary(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return ConvertersKt.toNullableTypedMap(json, json.encodeToString(Companion.serializer(), this));
    }

    @NotNull
    public String toString() {
        return "DeviceTemplate(publicApiKey=" + this.publicApiKey + ", platform=" + this.platform + ", appUserId=" + this.appUserId + ", aliases=" + this.aliases + ", vendorId=" + this.vendorId + ", appVersion=" + this.appVersion + ", appVersionPadded=" + this.appVersionPadded + ", osVersion=" + this.osVersion + ", deviceModel=" + this.deviceModel + ", deviceLocale=" + this.deviceLocale + ", preferredLocale=" + this.preferredLocale + ", deviceLanguageCode=" + this.deviceLanguageCode + ", preferredLanguageCode=" + this.preferredLanguageCode + ", regionCode=" + this.regionCode + ", preferredRegionCode=" + this.preferredRegionCode + ", deviceCurrencyCode=" + this.deviceCurrencyCode + ", deviceCurrencySymbol=" + this.deviceCurrencySymbol + ", timezoneOffset=" + this.timezoneOffset + ", radioType=" + this.radioType + ", interfaceStyle=" + this.interfaceStyle + ", isLowPowerModeEnabled=" + this.isLowPowerModeEnabled + ", bundleId=" + this.bundleId + ", appInstallDate=" + this.appInstallDate + ", isMac=" + this.isMac + ", daysSinceInstall=" + this.daysSinceInstall + ", minutesSinceInstall=" + this.minutesSinceInstall + ", daysSinceLastPaywallView=" + this.daysSinceLastPaywallView + ", minutesSinceLastPaywallView=" + this.minutesSinceLastPaywallView + ", totalPaywallViews=" + this.totalPaywallViews + ", utcDate=" + this.utcDate + ", localDate=" + this.localDate + ", utcTime=" + this.utcTime + ", localTime=" + this.localTime + ", utcDateTime=" + this.utcDateTime + ", localDateTime=" + this.localDateTime + ", isSandbox=" + this.isSandbox + ", activeEntitlements=" + this.activeEntitlements + ", activeEntitlementsObject=" + this.activeEntitlementsObject + ", subscriptionStatus=" + this.subscriptionStatus + ", activeProducts=" + this.activeProducts + ", isFirstAppOpen=" + this.isFirstAppOpen + ", sdkVersion=" + this.sdkVersion + ", sdkVersionPadded=" + this.sdkVersionPadded + ", appBuildString=" + this.appBuildString + ", appBuildStringNumber=" + this.appBuildStringNumber + ", interfaceStyleMode=" + this.interfaceStyleMode + ", capabilities=" + this.capabilities + ", capabilitiesConfig=" + this.capabilitiesConfig + ", platformWrapper=" + this.platformWrapper + ", platformWrapperVersion=" + this.platformWrapperVersion + ", deviceTier=" + this.deviceTier + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceTemplate(@NotNull String publicApiKey, @NotNull String platform, @NotNull String appUserId, @NotNull List<String> aliases, @NotNull String vendorId, @NotNull String appVersion, @NotNull String appVersionPadded, @NotNull String osVersion, @NotNull String deviceModel, @NotNull String deviceLocale, @NotNull String preferredLocale, @NotNull String deviceLanguageCode, @NotNull String preferredLanguageCode, @NotNull String regionCode, @NotNull String preferredRegionCode, @NotNull String deviceCurrencyCode, @NotNull String deviceCurrencySymbol, int i10, @NotNull String radioType, @NotNull String interfaceStyle, boolean z10, @NotNull String bundleId, @NotNull String appInstallDate, boolean z11, int i11, int i12, @Nullable Integer num, @Nullable Integer num2, int i13, @NotNull String utcDate, @NotNull String localDate, @NotNull String utcTime, @NotNull String localTime, @NotNull String utcDateTime, @NotNull String localDateTime, @NotNull String isSandbox, @NotNull List<String> activeEntitlements, @NotNull List<? extends Map<String, String>> activeEntitlementsObject, @Nullable String str, @NotNull List<String> activeProducts, boolean z12, @NotNull String sdkVersion, @NotNull String sdkVersionPadded, @NotNull String appBuildString, @Nullable Integer num3, @NotNull String interfaceStyleMode, @NotNull List<String> capabilities, @NotNull JsonElement capabilitiesConfig, @NotNull String platformWrapper, @NotNull String platformWrapperVersion, @NotNull String deviceTier) {
        Intrinsics.checkNotNullParameter(publicApiKey, "publicApiKey");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(appUserId, "appUserId");
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        Intrinsics.checkNotNullParameter(vendorId, "vendorId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(appVersionPadded, "appVersionPadded");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceLocale, "deviceLocale");
        Intrinsics.checkNotNullParameter(preferredLocale, "preferredLocale");
        Intrinsics.checkNotNullParameter(deviceLanguageCode, "deviceLanguageCode");
        Intrinsics.checkNotNullParameter(preferredLanguageCode, "preferredLanguageCode");
        Intrinsics.checkNotNullParameter(regionCode, "regionCode");
        Intrinsics.checkNotNullParameter(preferredRegionCode, "preferredRegionCode");
        Intrinsics.checkNotNullParameter(deviceCurrencyCode, "deviceCurrencyCode");
        Intrinsics.checkNotNullParameter(deviceCurrencySymbol, "deviceCurrencySymbol");
        Intrinsics.checkNotNullParameter(radioType, "radioType");
        Intrinsics.checkNotNullParameter(interfaceStyle, "interfaceStyle");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(appInstallDate, "appInstallDate");
        Intrinsics.checkNotNullParameter(utcDate, "utcDate");
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        Intrinsics.checkNotNullParameter(utcTime, "utcTime");
        Intrinsics.checkNotNullParameter(localTime, "localTime");
        Intrinsics.checkNotNullParameter(utcDateTime, "utcDateTime");
        Intrinsics.checkNotNullParameter(localDateTime, "localDateTime");
        Intrinsics.checkNotNullParameter(isSandbox, "isSandbox");
        Intrinsics.checkNotNullParameter(activeEntitlements, "activeEntitlements");
        Intrinsics.checkNotNullParameter(activeEntitlementsObject, "activeEntitlementsObject");
        Intrinsics.checkNotNullParameter(activeProducts, "activeProducts");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sdkVersionPadded, "sdkVersionPadded");
        Intrinsics.checkNotNullParameter(appBuildString, "appBuildString");
        Intrinsics.checkNotNullParameter(interfaceStyleMode, "interfaceStyleMode");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(capabilitiesConfig, "capabilitiesConfig");
        Intrinsics.checkNotNullParameter(platformWrapper, "platformWrapper");
        Intrinsics.checkNotNullParameter(platformWrapperVersion, "platformWrapperVersion");
        Intrinsics.checkNotNullParameter(deviceTier, "deviceTier");
        this.publicApiKey = publicApiKey;
        this.platform = platform;
        this.appUserId = appUserId;
        this.aliases = aliases;
        this.vendorId = vendorId;
        this.appVersion = appVersion;
        this.appVersionPadded = appVersionPadded;
        this.osVersion = osVersion;
        this.deviceModel = deviceModel;
        this.deviceLocale = deviceLocale;
        this.preferredLocale = preferredLocale;
        this.deviceLanguageCode = deviceLanguageCode;
        this.preferredLanguageCode = preferredLanguageCode;
        this.regionCode = regionCode;
        this.preferredRegionCode = preferredRegionCode;
        this.deviceCurrencyCode = deviceCurrencyCode;
        this.deviceCurrencySymbol = deviceCurrencySymbol;
        this.timezoneOffset = i10;
        this.radioType = radioType;
        this.interfaceStyle = interfaceStyle;
        this.isLowPowerModeEnabled = z10;
        this.bundleId = bundleId;
        this.appInstallDate = appInstallDate;
        this.isMac = z11;
        this.daysSinceInstall = i11;
        this.minutesSinceInstall = i12;
        this.daysSinceLastPaywallView = num;
        this.minutesSinceLastPaywallView = num2;
        this.totalPaywallViews = i13;
        this.utcDate = utcDate;
        this.localDate = localDate;
        this.utcTime = utcTime;
        this.localTime = localTime;
        this.utcDateTime = utcDateTime;
        this.localDateTime = localDateTime;
        this.isSandbox = isSandbox;
        this.activeEntitlements = activeEntitlements;
        this.activeEntitlementsObject = activeEntitlementsObject;
        this.subscriptionStatus = str;
        this.activeProducts = activeProducts;
        this.isFirstAppOpen = z12;
        this.sdkVersion = sdkVersion;
        this.sdkVersionPadded = sdkVersionPadded;
        this.appBuildString = appBuildString;
        this.appBuildStringNumber = num3;
        this.interfaceStyleMode = interfaceStyleMode;
        this.capabilities = capabilities;
        this.capabilitiesConfig = capabilitiesConfig;
        this.platformWrapper = platformWrapper;
        this.platformWrapperVersion = platformWrapperVersion;
        this.deviceTier = deviceTier;
    }
}
