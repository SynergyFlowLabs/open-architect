package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.backend.ConfigEntry;
import com.devtodev.analytics.internal.backend.ExcludeEvents;
import com.devtodev.analytics.internal.domain.DeviceIdentifiers;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.correncyPayment.Transaction;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.DTDPlatformOwner;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.platform.AdvertisingIdResult;
import com.devtodev.analytics.internal.platform.ApplicationData;
import com.devtodev.analytics.internal.platform.DeviceConstants;
import com.devtodev.analytics.internal.platform.DeviceResolution;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.sqlite.ProjectEntry;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import com.devtodev.analytics.internal.utils.JsonPretty;
import com.devtodev.analytics.internal.utils.StringExtentionsKt;
import com.devtodev.analytics.internal.validator.Validator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nProjectService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectService.kt\ncom/devtodev/analytics/internal/services/ProjectService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n1855#2:206\n288#2,2:207\n1856#2:209\n*S KotlinDebug\n*F\n+ 1 ProjectService.kt\ncom/devtodev/analytics/internal/services/ProjectService\n*L\n178#1:206\n181#1:207,2\n178#1:209\n*E\n"})
public final class ProjectService implements IProjectService {

    @NotNull
    private final IRepository projectRepository;

    @NotNull
    private final IStateManager stateManager;

    public ProjectService(@NotNull IStateManager stateManager, @NotNull IRepository projectRepository) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(projectRepository, "projectRepository");
        this.stateManager = stateManager;
        this.projectRepository = projectRepository;
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    public void applyConfig(@NotNull ConfigEntry config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Project activeProject = this.stateManager.getActiveProject();
        ExcludeEvents exclude = activeProject.getConfiguration().getExclude();
        Long version = exclude != null ? exclude.getVersion() : null;
        ExcludeEvents exclude2 = config.getExclude();
        if (Intrinsics.areEqual(version, exclude2 != null ? exclude2.getVersion() : null)) {
            config.setExclude(activeProject.getConfiguration().getExclude());
        }
        activeProject.setConfiguration(config);
        this.projectRepository.update(CollectionsKt.listOf(new EventParam(ProjectEntry.applicationKey, new SqlValue.String(activeProject.getApplicationKey()))), activeProject);
        Logger.INSTANCE.debug("The SDK analytics configuration has been received: " + JsonPretty.INSTANCE.toPrettyJson(activeProject.getConfiguration().getJson()), null);
        updateValidator();
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    public boolean checkIfNeedRemoveUsersData() {
        return !this.stateManager.getActiveProject().getConfiguration().getUserCounting();
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    @NotNull
    public List<Transaction> gerActualPurchaseList(@NotNull List<? extends JSONObject> list) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        try {
            for (JSONObject jSONObject : list) {
                String productId = jSONObject.getString("productId");
                Object orderId = jSONObject.get("orderId");
                int size = arrayList.size();
                int i10 = 0;
                do {
                    if (i10 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i10);
                    i10++;
                } while (!Intrinsics.areEqual(((Transaction) obj).getProductID(), productId));
                Transaction transaction = (Transaction) obj;
                if (transaction == null) {
                    if (orderId instanceof JSONArray) {
                        Intrinsics.checkNotNullExpressionValue(productId, "productId");
                        Intrinsics.checkNotNullExpressionValue(orderId, "orderId");
                        arrayList.add(new Transaction(productId, (JSONArray) orderId));
                    } else if (orderId instanceof String) {
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(orderId);
                        Intrinsics.checkNotNullExpressionValue(productId, "productId");
                        arrayList.add(new Transaction(productId, jSONArray));
                    }
                } else if (orderId instanceof JSONArray) {
                    int length = ((JSONArray) orderId).length();
                    for (int i11 = 0; i11 < length; i11++) {
                        transaction.getTransactionIds().put(((JSONArray) orderId).get(i11));
                    }
                } else if (orderId instanceof String) {
                    transaction.getTransactionIds().put(orderId);
                }
            }
            return arrayList;
        } catch (JSONException e10) {
            Logger.INSTANCE.error("gerActualPurchaseList err:", e10);
            return arrayList;
        }
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    @NotNull
    public AdvertisingIdResult getAdvertisingId() {
        return this.stateManager.getAdvertisingId();
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    @NotNull
    public ApplicationData getAppData() {
        return this.stateManager.getApplicationData();
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    @NotNull
    public DeviceConstants getDeviceConstants() {
        return this.stateManager.getDeviceConstants();
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    @NotNull
    public DeviceIdentifiers getDeviceIdentifiers() {
        return this.stateManager.getActiveDeviceIdentifiers();
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    @NotNull
    public DeviceResolution getDeviceResolution() {
        return this.stateManager.getDeviceResolution();
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    @NotNull
    public DTDPlatformOwner getDeviseOwner() {
        return this.stateManager.getDeviseOwner();
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    public long getNumberOfCurrencies() {
        return this.stateManager.getActiveProject().getConfiguration().getNumberOfCurrencies();
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    @NotNull
    public String getObfuscatedAccountId() {
        String strOffsetCharacterByOne;
        Long devtodevId = this.stateManager.getActiveDeviceIdentifiers().getDevtodevId();
        if (devtodevId != null) {
            return "d:" + devtodevId;
        }
        User activeUser = this.stateManager.getActiveUser();
        if (activeUser.isDefaultUser()) {
            return StringExtentionsKt.offsetCharacterByOne(this.stateManager.getActiveDeviceIdentifiers().getDeviceIdentifier());
        }
        String userId = activeUser.getUserId();
        return (userId == null || (strOffsetCharacterByOne = StringExtentionsKt.offsetCharacterByOne(userId)) == null) ? "" : strOffsetCharacterByOne;
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    public void getReferrerData(@NotNull Function1<? super String, Unit> installReferrer) {
        Intrinsics.checkNotNullParameter(installReferrer, "installReferrer");
        this.stateManager.getReferrerData(installReferrer);
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    @NotNull
    public String getSDKVersion() {
        return this.stateManager.getApplicationData().getSdkVersionName();
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    public boolean getTrackingAvailable() {
        return this.stateManager.getActiveProject().getTrackingAvailable();
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    public long getUserCardKeysCount() {
        return this.stateManager.getActiveProject().getConfiguration().getUserCardKeysCount();
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    public boolean isRefererSent() {
        return this.stateManager.getActiveProject().isReferralSent();
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    public boolean isUserCounting() {
        return this.stateManager.getActiveProject().getConfiguration().getUserCounting();
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    public int paramsCount() {
        return this.stateManager.getActiveProject().getConfiguration().getEventParamsCount();
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    public void setRefererSent(boolean z10) {
        Project activeProject = this.stateManager.getActiveProject();
        if (activeProject.getTrackingAvailable()) {
            activeProject.setReferralSent(z10);
            this.projectRepository.update(CollectionsKt.listOf(new EventParam(ProjectEntry.applicationKey, new SqlValue.String(activeProject.getApplicationKey()))), activeProject);
        }
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    public void setTrackingAvailable(boolean z10) {
        Project activeProject = this.stateManager.getActiveProject();
        activeProject.setTrackingAvailable(z10);
        this.projectRepository.update(CollectionsKt.listOf(new EventParam(ProjectEntry.applicationKey, new SqlValue.String(activeProject.getApplicationKey()))), activeProject);
        Logger.info$default(Logger.INSTANCE, "Tracking status is " + (z10 ? "Enable" : "Disable"), null, 2, null);
    }

    @Override // com.devtodev.analytics.internal.services.IProjectService
    public void updateValidator() {
        Project activeProject = this.stateManager.getActiveProject();
        Validator validator = Validator.INSTANCE;
        ExcludeEvents exclude = activeProject.getConfiguration().getExclude();
        validator.setExcludedOptions(exclude != null ? exclude.getExcludeEvents() : null);
        validator.setNumberOfCurrencies(Long.valueOf(activeProject.getConfiguration().getNumberOfCurrencies()));
    }
}
