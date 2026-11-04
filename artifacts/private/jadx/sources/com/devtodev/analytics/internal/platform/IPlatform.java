package com.devtodev.analytics.internal.platform;

import com.devtodev.analytics.internal.platform.repository.playservice.IReferrerStateListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IPlatform {
    @NotNull
    ApplicationData getApplicationData();

    @NotNull
    DeviceConstants getDeviceConstants();

    @NotNull
    DeviceResolution getDeviceResolution();

    @NotNull
    GoogleAdvertisingIdResult getGoogleAdvertisingId();

    @NotNull
    HuaweiTokenData getHuaweiTokenData();

    void getInstallReferrer(@NotNull IReferrerStateListener iReferrerStateListener);
}
