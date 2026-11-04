package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.backend.ConfigEntry;
import com.devtodev.analytics.internal.domain.DeviceIdentifiers;
import com.devtodev.analytics.internal.domain.events.correncyPayment.Transaction;
import com.devtodev.analytics.internal.managers.DTDPlatformOwner;
import com.devtodev.analytics.internal.platform.AdvertisingIdResult;
import com.devtodev.analytics.internal.platform.ApplicationData;
import com.devtodev.analytics.internal.platform.DeviceConstants;
import com.devtodev.analytics.internal.platform.DeviceResolution;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface IProjectService {
    void applyConfig(@NotNull ConfigEntry configEntry);

    boolean checkIfNeedRemoveUsersData();

    @NotNull
    List<Transaction> gerActualPurchaseList(@NotNull List<? extends JSONObject> list);

    @NotNull
    AdvertisingIdResult getAdvertisingId();

    @NotNull
    ApplicationData getAppData();

    @NotNull
    DeviceConstants getDeviceConstants();

    @NotNull
    DeviceIdentifiers getDeviceIdentifiers();

    @NotNull
    DeviceResolution getDeviceResolution();

    @NotNull
    DTDPlatformOwner getDeviseOwner();

    long getNumberOfCurrencies();

    @NotNull
    String getObfuscatedAccountId();

    void getReferrerData(@NotNull Function1<? super String, Unit> function1);

    @NotNull
    String getSDKVersion();

    boolean getTrackingAvailable();

    long getUserCardKeysCount();

    boolean isRefererSent();

    boolean isUserCounting();

    int paramsCount();

    void setRefererSent(boolean z10);

    void setTrackingAvailable(boolean z10);

    void updateValidator();
}
