package com.devtodev.analytics.internal.platform.gateway;

import com.devtodev.analytics.internal.platform.ApplicationData;
import com.devtodev.analytics.internal.platform.DeviceConstants;
import com.devtodev.analytics.internal.platform.DeviceResolution;
import com.devtodev.analytics.internal.platform.GoogleAdvertisingIdResult;
import com.devtodev.analytics.internal.platform.HuaweiTokenData;
import com.devtodev.analytics.internal.platform.repository.playservice.IReferrerStateListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IApplicationGateway {
    @NotNull
    ApplicationData getApplicationData();

    @NotNull
    DeviceConstants getDeviceConstants();

    @NotNull
    DeviceResolution getDeviceResolution();

    @NotNull
    GoogleAdvertisingIdResult getGoogleAdvertisingIdResult();

    @NotNull
    HuaweiTokenData getHuaweiAdvertisingIdResult();

    void getInstallReferrer(@NotNull IReferrerStateListener iReferrerStateListener);
}
