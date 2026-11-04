package com.devtodev.analytics.internal.managers;

import com.devtodev.analytics.internal.backend.ExcludeEvents;
import com.devtodev.analytics.internal.backend.Identifiers;
import com.devtodev.analytics.internal.backend.Versions;
import com.devtodev.analytics.internal.domain.DeviceIdentifiers;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.helpfultools.VersionCompare;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.migrator.IMigration;
import com.devtodev.analytics.internal.platform.AdvertisingIdResult;
import com.devtodev.analytics.internal.platform.ApplicationData;
import com.devtodev.analytics.internal.platform.DeviceConstants;
import com.devtodev.analytics.internal.platform.DeviceResolution;
import com.superwall.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import pj.n;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nStateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateManager.kt\ncom/devtodev/analytics/internal/managers/StateManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n766#2:216\n857#2,2:217\n766#2:219\n857#2,2:220\n1#3:222\n*S KotlinDebug\n*F\n+ 1 StateManager.kt\ncom/devtodev/analytics/internal/managers/StateManager\n*L\n88#1:216\n88#1:217,2\n97#1:219\n97#1:220,2\n*E\n"})
public final class StateManager implements IStateManager {

    @NotNull
    private Project activeProject;

    @NotNull
    private User activeUser;

    @NotNull
    private String appVersion;

    @NotNull
    private CoreManager coreManager;

    @NotNull
    private DeviceIdentifiers deviceIdentifiers;

    @NotNull
    private DeviceManager deviceManager;
    private long sdkVersionCode;

    @NotNull
    private String sdkVersionName;

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.managers.StateManager$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l0 implements n<Long, Long, Long, Unit> {
        public AnonymousClass1() {
            super(3);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Long l10, Long l11, Long l12) {
            invoke2(l10, l11, l12);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Long l10, @Nullable Long l11, @Nullable Long l12) {
            StateManager.this.updateDeviceIdentifiers(l10, l11, l12);
        }
    }

    public StateManager(@NotNull DeviceManager deviceManager, @NotNull CoreManager coreManager, @Nullable String str, @NotNull IMigration migration) throws JSONException {
        Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        Intrinsics.checkNotNullParameter(coreManager, "coreManager");
        Intrinsics.checkNotNullParameter(migration, "migration");
        this.deviceManager = deviceManager;
        this.coreManager = coreManager;
        this.sdkVersionName = deviceManager.getAppVersion().getSdkVersionName();
        this.sdkVersionCode = this.deviceManager.getAppVersion().getSdkVersionCode();
        this.appVersion = this.deviceManager.getAppVersion().getAppVersion();
        this.coreManager.setOnSdkConfigUpdate(new AnonymousClass1());
        this.activeProject = this.coreManager.createOrActivateProject();
        Pair<String, String> pairCheckSdkVersionChanges = this.deviceManager.checkSdkVersionChanges();
        if (pairCheckSdkVersionChanges != null) {
            Logger.debug$default(Logger.INSTANCE, "SDK version updated", null, 2, null);
            migrateExclude(this.activeProject, pairCheckSdkVersionChanges);
        }
        migration.migrateData(this.activeProject);
        DeviceIdentifiers deviceIdentifiersInitializeDeviceId = this.deviceManager.initializeDeviceId(this.activeProject);
        this.deviceIdentifiers = deviceIdentifiersInitializeDeviceId;
        DeviceIdentifiers deviceIdentifiersCheckUnityCustomUUID$DTDAnalytics_androidRelease = this.deviceManager.checkUnityCustomUUID$DTDAnalytics_androidRelease(deviceIdentifiersInitializeDeviceId);
        this.deviceIdentifiers = deviceIdentifiersCheckUnityCustomUUID$DTDAnalytics_androidRelease;
        this.coreManager.checkUnityUserId(deviceIdentifiersCheckUnityCustomUUID$DTDAnalytics_androidRelease.getDeviceIdentifier(), this.activeProject);
        String deviceIdentifier = this.deviceIdentifiers.getDeviceIdentifier();
        this.activeUser = Intrinsics.areEqual(str, "") ? this.coreManager.createOrActivateDefaultUser(deviceIdentifier, this.activeProject) : str != null ? this.coreManager.createOrActivateUser(str, this.activeProject, false) : this.coreManager.createOrActivateUser(deviceIdentifier, this.activeProject, true);
    }

    private final void migrateExclude(Project project, Pair<String, String> pair) {
        Integer numCompare = VersionCompare.Companion.compare(pair.getFirst(), BuildConfig.SDK_VERSION);
        if (numCompare == null || numCompare.intValue() != -1) {
            return;
        }
        ExcludeEvents exclude = project.getConfiguration().getExclude();
        project.getConfiguration().setExclude(new ExcludeEvents(null, exclude != null ? exclude.getAll() : null, exclude != null ? exclude.getExcludeEvents() : null));
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    public void activateUser(@NotNull String userId) {
        User userCreateOrActivateUser;
        Intrinsics.checkNotNullParameter(userId, "userId");
        if (Intrinsics.areEqual(userId, "")) {
            userCreateOrActivateUser = this.coreManager.createOrActivateDefaultUser(this.deviceIdentifiers.getDeviceIdentifier(), this.activeProject);
        } else {
            userCreateOrActivateUser = this.coreManager.createOrActivateUser(userId, this.activeProject, false);
        }
        this.activeUser = userCreateOrActivateUser;
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    public void changeValidStateOfDeviceIdentifiers(boolean z10) {
        DeviceIdentifiers deviceIdentifiersInitializeDeviceId = this.deviceManager.initializeDeviceId(this.activeProject);
        deviceIdentifiersInitializeDeviceId.setValid(z10);
        this.deviceManager.updateIdentifiersRepository(deviceIdentifiersInitializeDeviceId, this.activeProject);
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    @NotNull
    public DeviceIdentifiers getActiveDeviceIdentifiers() {
        DeviceIdentifiers deviceIdentifiersInitializeDeviceId = this.deviceManager.initializeDeviceId(this.activeProject);
        this.deviceIdentifiers = deviceIdentifiersInitializeDeviceId;
        return deviceIdentifiersInitializeDeviceId;
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    @NotNull
    public Project getActiveProject() {
        return this.activeProject;
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    @NotNull
    public User getActiveUser() {
        return this.activeUser;
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    @NotNull
    public AdvertisingIdResult getAdvertisingId() {
        return this.deviceManager.getAdvertisingId();
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    @NotNull
    public Identifiers getAllIdentifiers(@NotNull User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        return new Identifiers(this.deviceIdentifiers.getDeviceIdentifier(), this.deviceIdentifiers.getPreviousDeviceIdentifier(), user.getUserId(), user.getPreviousUserId(), this.deviceIdentifiers.getDevtodevId(), this.deviceIdentifiers.getCrossPlatformDevtodevId(), this.deviceIdentifiers.getDevtodevIdTimestamp(), this.deviceIdentifiers.isValid());
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    @NotNull
    public List<User> getAllUsers() {
        List<User> allUsers = this.coreManager.getAllUsers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allUsers) {
            if (((User) obj).getProjectId() == this.activeProject.getIdKey()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    @NotNull
    public ApplicationData getApplicationData() {
        return this.deviceManager.getAppVersion();
    }

    @NotNull
    public final CoreManager getCoreManager() {
        return this.coreManager;
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    @NotNull
    public DeviceConstants getDeviceConstants() {
        return this.deviceManager.getDeviceConstants();
    }

    @NotNull
    public final DeviceManager getDeviceManager() {
        return this.deviceManager;
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    @NotNull
    public DeviceResolution getDeviceResolution() {
        return this.deviceManager.getDeviceResolution();
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    @NotNull
    public DTDPlatformOwner getDeviseOwner() {
        return this.deviceManager.getDeviseOwner();
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    @NotNull
    public Identifiers getIdentifiers(@NotNull User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        boolean zIsValid = this.deviceIdentifiers.isValid();
        return new Identifiers(this.deviceIdentifiers.getDeviceIdentifier(), this.deviceIdentifiers.getPreviousDeviceIdentifier(), user.getUserId(), user.getPreviousUserId(), zIsValid ? this.deviceIdentifiers.getDevtodevId() : null, zIsValid ? this.deviceIdentifiers.getCrossPlatformDevtodevId() : null, zIsValid ? this.deviceIdentifiers.getDevtodevIdTimestamp() : null, zIsValid);
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    @NotNull
    public List<User> getInactiveUser() {
        List<User> allUsers = getAllUsers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allUsers) {
            User user = (User) obj;
            if (user.getIdKey() != this.activeUser.getIdKey() && user.getProjectId() == this.activeProject.getIdKey()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    public void getReferrerData(@NotNull Function1<? super String, Unit> installReferrer) {
        Intrinsics.checkNotNullParameter(installReferrer, "installReferrer");
        this.deviceManager.getReferrer(installReferrer);
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    @NotNull
    public Versions getVersion() {
        Project activeProject = getActiveProject();
        String str = this.sdkVersionName;
        long j10 = this.sdkVersionCode;
        String applicationBuildVersion = activeProject.getApplicationBuildVersion();
        ExcludeEvents exclude = activeProject.getConfiguration().getExclude();
        Long version = exclude != null ? exclude.getVersion() : null;
        Versions versions = new Versions(str, j10, this.appVersion, null, null, activeProject.getConfiguration().getSbsConfigVersion(), 0L, 88, null);
        if (applicationBuildVersion != null) {
            versions.setAppBuildVersion(applicationBuildVersion);
        }
        if (version != null) {
            versions.setExcludeVersion(Long.valueOf(version.longValue()));
        }
        return versions;
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    public void replaceUserId(@NotNull User user, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(userId, "userId");
        User userReplaceUserId = this.coreManager.replaceUserId(user, userId);
        if (userReplaceUserId.getIdKey() == getActiveUser().getIdKey()) {
            this.activeUser = userReplaceUserId;
            updateDeviceIdentifiers(null, null, null);
        }
    }

    public final void setCoreManager(@NotNull CoreManager coreManager) {
        Intrinsics.checkNotNullParameter(coreManager, "<set-?>");
        this.coreManager = coreManager;
    }

    public final void setDeviceManager(@NotNull DeviceManager deviceManager) {
        Intrinsics.checkNotNullParameter(deviceManager, "<set-?>");
        this.deviceManager = deviceManager;
    }

    @Override // com.devtodev.analytics.internal.managers.IStateManager
    public void updateDeviceIdentifiers(@Nullable Long l10, @Nullable Long l11, @Nullable Long l12) {
        this.deviceIdentifiers.setDevtodevId(l10);
        this.deviceIdentifiers.setCrossPlatformDevtodevId(l11);
        this.deviceIdentifiers.setDevtodevIdTimestamp(l12);
        this.deviceManager.updateIdentifiersRepository(this.deviceIdentifiers, getActiveProject());
    }
}
