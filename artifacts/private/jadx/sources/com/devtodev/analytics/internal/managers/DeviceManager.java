package com.devtodev.analytics.internal.managers;

import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.DevToDevUuid;
import com.devtodev.analytics.internal.domain.DeviceIdentifiers;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.SdkTools;
import com.devtodev.analytics.internal.domain.ToolsKeys;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.platform.AdvertisingIdResult;
import com.devtodev.analytics.internal.platform.ApplicationData;
import com.devtodev.analytics.internal.platform.DeviceConstants;
import com.devtodev.analytics.internal.platform.DeviceResolution;
import com.devtodev.analytics.internal.platform.GoogleAdvertisingIdResult;
import com.devtodev.analytics.internal.platform.HuaweiTokenData;
import com.devtodev.analytics.internal.platform.IPlatform;
import com.devtodev.analytics.internal.platform.repository.playservice.IReferrerStateListener;
import com.devtodev.analytics.internal.platform.repository.playservice.ReferrerState;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import com.devtodev.analytics.internal.utils.StringExtentionsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDeviceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManager.kt\ncom/devtodev/analytics/internal/managers/DeviceManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,326:1\n288#2,2:327\n288#2,2:329\n1#3:331\n*S KotlinDebug\n*F\n+ 1 DeviceManager.kt\ncom/devtodev/analytics/internal/managers/DeviceManager\n*L\n91#1:327,2\n208#1:329,2\n*E\n"})
public final class DeviceManager implements IDeviceManager {

    @NotNull
    private final IRepository devToDevUuidRepository;

    @NotNull
    private final String googleSpace;

    @NotNull
    private final String huaweiSpace;

    @NotNull
    private final IRepository identifiersRepository;

    @NotNull
    private final String installreferrer;

    @NotNull
    private final IPlatform platform;

    @NotNull
    private DTDPlatformOwner platformOwner;

    @NotNull
    private final IRepository toolsStorage;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DTDPlatformOwner.values().length];
            try {
                iArr[DTDPlatformOwner.Google.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DTDPlatformOwner.Huawei.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DTDPlatformOwner.Other.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DeviceManager(@NotNull IPlatform platform, @NotNull IRepository identifiersRepository, @NotNull IRepository devToDevUuidRepository, @NotNull IRepository toolsStorage, boolean z10) throws Exception {
        DTDPlatformOwner dTDPlatformOwner;
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(identifiersRepository, "identifiersRepository");
        Intrinsics.checkNotNullParameter(devToDevUuidRepository, "devToDevUuidRepository");
        Intrinsics.checkNotNullParameter(toolsStorage, "toolsStorage");
        this.platform = platform;
        this.identifiersRepository = identifiersRepository;
        this.devToDevUuidRepository = devToDevUuidRepository;
        this.toolsStorage = toolsStorage;
        this.googleSpace = "com.devtodev.google.GoogleAdvertising";
        this.huaweiSpace = "com.devtodev.huawei.Huawei";
        this.installreferrer = "com.android.installreferrer.api.InstallReferrerClient";
        if (z10) {
            dTDPlatformOwner = DTDPlatformOwner.Other;
        } else if (definition("com.devtodev.google.GoogleAdvertising")) {
            dTDPlatformOwner = DTDPlatformOwner.Google;
        } else {
            if (!definition("com.devtodev.huawei.Huawei")) {
                throw new Exception("Missing dependency com.devtodev:android-google or com.devtodev:android-huawei.\nPossibly incorrect implementation of COPPA control.\nSee documentation: https://docs.devtodev.com/integration/integration-of-sdk-v2/sdk-integration/android");
            }
            dTDPlatformOwner = DTDPlatformOwner.Huawei;
        }
        this.platformOwner = dTDPlatformOwner;
    }

    private final boolean definition(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final String getAdvertisingToken() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.platformOwner.ordinal()];
        if (i10 == 1) {
            return getGoogleAdvertisingToken();
        }
        if (i10 == 2) {
            return getHuaweiIdentifier();
        }
        if (i10 == 3) {
            return null;
        }
        throw new k0();
    }

    private final String getDevToDevUUID() {
        List<DbModel> all = this.devToDevUuidRepository.getAll(DevToDevUuid.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.DevToDevUuid>");
        DevToDevUuid devToDevUuid = (DevToDevUuid) CollectionsKt.firstOrNull((List) all);
        if (devToDevUuid != null) {
            return devToDevUuid.getDevToDevUUID();
        }
        DevToDevUuid devToDevUuid2 = new DevToDevUuid(0L, this.platform.getDeviceConstants().getDevtodevUDID(), 1, null);
        this.devToDevUuidRepository.insert(devToDevUuid2);
        return devToDevUuid2.getDevToDevUUID();
    }

    private final String getGoogleAdvertisingToken() {
        GoogleAdvertisingIdResult googleAdvertisingId = this.platform.getGoogleAdvertisingId();
        if (googleAdvertisingId instanceof GoogleAdvertisingIdResult.AdvertisingId) {
            return ((GoogleAdvertisingIdResult.AdvertisingId) googleAdvertisingId).getToken();
        }
        if (!(googleAdvertisingId instanceof GoogleAdvertisingIdResult.ExceptionData)) {
            throw new k0();
        }
        Logger.warning$default(Logger.INSTANCE, ((GoogleAdvertisingIdResult.ExceptionData) googleAdvertisingId).getMessage(), null, 2, null);
        return null;
    }

    private final String getHuaweiIdentifier() {
        HuaweiTokenData huaweiTokenData = this.platform.getHuaweiTokenData();
        String exception = huaweiTokenData.getException();
        if (exception != null) {
            Logger.warning$default(Logger.INSTANCE, exception, null, 2, null);
        }
        return huaweiTokenData.getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String parseInstallReferrer(String str) {
        Object next;
        Iterator it = StringsKt.split$default(str, new String[]{"&"}, false, 0, 6, null).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt.V2((String) next, "utm_content", false, 2, null));
        String str2 = (String) next;
        if (str2 != null) {
            return str2;
        }
        Logger.warning$default(Logger.INSTANCE, "[Referrer State] encrypted facebook referrer data is not found", null, 2, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String referrerStateHandling(ReferrerState referrerState) {
        if (referrerState instanceof ReferrerState.ReferrerData) {
            String installReferrer = ((ReferrerState.ReferrerData) referrerState).getInstallReferrer();
            Logger.info$default(Logger.INSTANCE, "[Referrer State] installReferrer is " + installReferrer, null, 2, null);
            return installReferrer;
        }
        if (referrerState instanceof ReferrerState.ReceiveStateFail) {
            Logger.warning$default(Logger.INSTANCE, "[Referrer State] receive state fail", null, 2, null);
        } else if (referrerState instanceof ReferrerState.BindNotAllowed) {
            Logger.warning$default(Logger.INSTANCE, "[Referrer State] bind not allowed", null, 2, null);
        } else if (referrerState instanceof ReferrerState.FeatureNotSupported) {
            Logger.warning$default(Logger.INSTANCE, "[Referrer State] feature not supported", null, 2, null);
        } else if (referrerState instanceof ReferrerState.NoInstallReferrerImplementation) {
            Logger.warning$default(Logger.INSTANCE, "[Referrer State] no install referrer implementation", null, 2, null);
        } else if (referrerState instanceof ReferrerState.ServiceDisconnected) {
            Logger.warning$default(Logger.INSTANCE, "[Referrer State] service disconnected", null, 2, null);
        } else if (referrerState instanceof ReferrerState.ServiceUnavailable) {
            Logger.warning$default(Logger.INSTANCE, "[Referrer State] service unavailable", null, 2, null);
        }
        return null;
    }

    @Override // com.devtodev.analytics.internal.managers.IDeviceManager
    @Nullable
    public Pair<String, String> checkSdkVersionChanges() throws JSONException {
        String sdkVersionName = this.platform.getApplicationData().getSdkVersionName();
        List<DbModel> all = this.toolsStorage.getAll(SdkTools.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.SdkTools>");
        SdkTools sdkTools = (SdkTools) CollectionsKt.firstOrNull((List) all);
        if (sdkTools == null) {
            String string = new JSONArray().put(new JSONObject().accumulate(ToolsKeys.SdkVersion.getValue(), sdkVersionName)).toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONArray().put(it).toString()");
            this.toolsStorage.insert(new SdkTools(0L, string, 1, null));
            return null;
        }
        ToolsKeys toolsKeys = ToolsKeys.SdkVersion;
        String metadataByKey = sdkTools.getMetadataByKey(toolsKeys);
        if (Intrinsics.areEqual(metadataByKey, sdkVersionName)) {
            return null;
        }
        sdkTools.updateMetadataByKey(toolsKeys, sdkVersionName);
        this.toolsStorage.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(sdkTools.getIdKey()))), sdkTools);
        return new Pair<>(metadataByKey, sdkVersionName);
    }

    @NotNull
    public final DeviceIdentifiers checkUnityCustomUUID$DTDAnalytics_androidRelease(@NotNull DeviceIdentifiers identifiers) {
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        if (StringExtentionsKt.isInvalidAdvertisingId(identifiers.getUuid())) {
            List<DbModel> all = this.devToDevUuidRepository.getAll(DevToDevUuid.Companion.getColumnsTypes());
            Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.DevToDevUuid>");
            DevToDevUuid devToDevUuid = (DevToDevUuid) CollectionsKt.firstOrNull((List) all);
            if (devToDevUuid != null) {
                int i10 = 0 >> 0;
                DevToDevUuid devToDevUuid2 = new DevToDevUuid(0L, this.platform.getDeviceConstants().getDevtodevUDID(), 1, null);
                devToDevUuid.setDevToDevUUID(devToDevUuid2.getDevToDevUUID());
                this.devToDevUuidRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(devToDevUuid.getIdKey()))), devToDevUuid);
                identifiers.setDeviceIdentifier(devToDevUuid2.getDevToDevUUID());
                identifiers.setUuid(devToDevUuid2.getDevToDevUUID());
                identifiers.setPreviousDeviceIdentifier(null);
                identifiers.setDevtodevId(null);
                identifiers.setCrossPlatformDevtodevId(null);
                identifiers.setDevtodevIdTimestamp(null);
                this.identifiersRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(identifiers.getIdKey()))), identifiers);
            }
        }
        return identifiers;
    }

    @Override // com.devtodev.analytics.internal.managers.IDeviceManager
    @NotNull
    public AdvertisingIdResult getAdvertisingId() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.platformOwner.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                HuaweiTokenData huaweiTokenData = this.platform.getHuaweiTokenData();
                return new AdvertisingIdResult.AdvertisingId(huaweiTokenData.getToken(), huaweiTokenData.isLimitAdTrackingEnabled());
            }
            if (i10 == 3) {
                return new AdvertisingIdResult.ExceptionData("");
            }
            throw new k0();
        }
        GoogleAdvertisingIdResult googleAdvertisingId = this.platform.getGoogleAdvertisingId();
        if (googleAdvertisingId instanceof GoogleAdvertisingIdResult.AdvertisingId) {
            GoogleAdvertisingIdResult.AdvertisingId advertisingId = (GoogleAdvertisingIdResult.AdvertisingId) googleAdvertisingId;
            return new AdvertisingIdResult.AdvertisingId(advertisingId.getToken(), advertisingId.isLimitAdTrackingEnabled());
        }
        if (googleAdvertisingId instanceof GoogleAdvertisingIdResult.ExceptionData) {
            return new AdvertisingIdResult.ExceptionData(((GoogleAdvertisingIdResult.ExceptionData) googleAdvertisingId).getMessage());
        }
        throw new k0();
    }

    @Override // com.devtodev.analytics.internal.managers.IDeviceManager
    @NotNull
    public ApplicationData getAppVersion() {
        return this.platform.getApplicationData();
    }

    @Override // com.devtodev.analytics.internal.managers.IDeviceManager
    @NotNull
    public DeviceConstants getDeviceConstants() {
        return this.platform.getDeviceConstants();
    }

    @Override // com.devtodev.analytics.internal.managers.IDeviceManager
    @NotNull
    public DeviceResolution getDeviceResolution() {
        return this.platform.getDeviceResolution();
    }

    @Override // com.devtodev.analytics.internal.managers.IDeviceManager
    @NotNull
    public DTDPlatformOwner getDeviseOwner() {
        return this.platformOwner;
    }

    @Override // com.devtodev.analytics.internal.managers.IDeviceManager
    public void getReferrer(@NotNull final Function1<? super String, Unit> installReferrer) {
        Intrinsics.checkNotNullParameter(installReferrer, "installReferrer");
        if (definition(this.installreferrer)) {
            this.platform.getInstallReferrer(new IReferrerStateListener() { // from class: com.devtodev.analytics.internal.managers.DeviceManager.getReferrer.1
                @Override // com.devtodev.analytics.internal.platform.repository.playservice.IReferrerStateListener
                public void onReferrerState(@NotNull ReferrerState referrerState) {
                    Intrinsics.checkNotNullParameter(referrerState, "referrerState");
                    String strReferrerStateHandling = DeviceManager.this.referrerStateHandling(referrerState);
                    if (strReferrerStateHandling != null) {
                        DeviceManager deviceManager = DeviceManager.this;
                        Function1<String, Unit> function1 = installReferrer;
                        String installReferrer2 = deviceManager.parseInstallReferrer(strReferrerStateHandling);
                        if (installReferrer2 != null) {
                            function1.invoke(installReferrer2);
                        }
                    }
                }

                @Override // com.devtodev.analytics.internal.platform.repository.playservice.IReferrerStateListener
                public void onReferrerStateClose(@NotNull ReferrerState referrerState) {
                    Intrinsics.checkNotNullParameter(referrerState, "referrerState");
                    Logger.info$default(Logger.INSTANCE, "[Referrer State] service connection ended", null, 2, null);
                }
            });
        }
    }

    @Override // com.devtodev.analytics.internal.managers.IDeviceManager
    @NotNull
    public DeviceIdentifiers initializeDeviceId(@NotNull Project project) {
        Object next;
        Intrinsics.checkNotNullParameter(project, "project");
        List<DbModel> all = this.identifiersRepository.getAll(DeviceIdentifiers.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.DeviceIdentifiers>");
        Iterator<T> it = all.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((DeviceIdentifiers) next).getProjectId() != project.getIdKey());
        DeviceIdentifiers deviceIdentifiers = (DeviceIdentifiers) next;
        String advertisingToken = getAdvertisingToken();
        if (advertisingToken == null || StringExtentionsKt.isInvalidAdvertisingId(advertisingToken)) {
            advertisingToken = getDevToDevUUID();
        }
        String str = advertisingToken;
        if (deviceIdentifiers == null) {
            DeviceIdentifiers deviceIdentifiers2 = new DeviceIdentifiers(0L, project.getIdKey(), str, null, null, null, null, getDevToDevUUID(), false, 377, null);
            this.identifiersRepository.insert(deviceIdentifiers2);
            return deviceIdentifiers2;
        }
        if (!Intrinsics.areEqual(deviceIdentifiers.getDeviceIdentifier(), str)) {
            deviceIdentifiers.setPreviousDeviceIdentifier(deviceIdentifiers.getDeviceIdentifier());
            deviceIdentifiers.setDeviceIdentifier(str);
            deviceIdentifiers.setDevtodevId(null);
            deviceIdentifiers.setCrossPlatformDevtodevId(null);
            deviceIdentifiers.setDevtodevIdTimestamp(null);
            this.identifiersRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(deviceIdentifiers.getIdKey()))), deviceIdentifiers);
        }
        return deviceIdentifiers;
    }

    @Override // com.devtodev.analytics.internal.managers.IDeviceManager
    public void updateIdentifiersRepository(@NotNull DeviceIdentifiers deviceIdentifiers, @NotNull Project project) {
        Intrinsics.checkNotNullParameter(deviceIdentifiers, "deviceIdentifiers");
        Intrinsics.checkNotNullParameter(project, "project");
        this.identifiersRepository.update(CollectionsKt.listOf((Object[]) new EventParam[]{new EventParam("_id", new SqlValue.Long(project.getIdKey())), new EventParam("_id", new SqlValue.Long(deviceIdentifiers.getIdKey()))}), deviceIdentifiers);
    }
}
