package com.devtodev.analytics.internal.platform.gateway;

import com.devtodev.analytics.internal.platform.ApplicationData;
import com.devtodev.analytics.internal.platform.DeviceConstants;
import com.devtodev.analytics.internal.platform.DeviceResolution;
import com.devtodev.analytics.internal.platform.GoogleAdvertisingIdResult;
import com.devtodev.analytics.internal.platform.HuaweiTokenData;
import com.devtodev.analytics.internal.platform.repository.RepositoryDI;
import com.devtodev.analytics.internal.platform.repository.playservice.IReferrerStateListener;
import com.devtodev.analytics.internal.platform.repository.playservice.PlayServiceWrapper;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PlatformGateway implements IApplicationGateway {

    @NotNull
    private final f0 applicationData$delegate;

    @NotNull
    private final f0 deviceConstants$delegate;

    @NotNull
    private final f0 deviceResolution$delegate;

    @NotNull
    private final f0 googleAdvertisingIdResult$delegate;

    @NotNull
    private final f0 huaweiAdvertisingIdResult$delegate;

    @NotNull
    private final RepositoryDI repositoryDI;

    public PlatformGateway(@NotNull RepositoryDI repositoryDI) {
        Intrinsics.checkNotNullParameter(repositoryDI, "repositoryDI");
        this.repositoryDI = repositoryDI;
        this.applicationData$delegate = g0.c(new PlatformGateway$applicationData$2(this));
        this.deviceConstants$delegate = g0.c(new PlatformGateway$deviceConstants$2(this));
        this.deviceResolution$delegate = g0.c(new PlatformGateway$deviceResolution$2(this));
        this.googleAdvertisingIdResult$delegate = g0.c(new PlatformGateway$googleAdvertisingIdResult$2(this));
        this.huaweiAdvertisingIdResult$delegate = g0.c(new PlatformGateway$huaweiAdvertisingIdResult$2(this));
    }

    @Override // com.devtodev.analytics.internal.platform.gateway.IApplicationGateway
    @NotNull
    public ApplicationData getApplicationData() {
        return (ApplicationData) this.applicationData$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.platform.gateway.IApplicationGateway
    @NotNull
    public DeviceConstants getDeviceConstants() {
        return (DeviceConstants) this.deviceConstants$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.platform.gateway.IApplicationGateway
    @NotNull
    public DeviceResolution getDeviceResolution() {
        return (DeviceResolution) this.deviceResolution$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.platform.gateway.IApplicationGateway
    @NotNull
    public GoogleAdvertisingIdResult getGoogleAdvertisingIdResult() {
        return (GoogleAdvertisingIdResult) this.googleAdvertisingIdResult$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.platform.gateway.IApplicationGateway
    @NotNull
    public HuaweiTokenData getHuaweiAdvertisingIdResult() {
        return (HuaweiTokenData) this.huaweiAdvertisingIdResult$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.platform.gateway.IApplicationGateway
    public void getInstallReferrer(@NotNull IReferrerStateListener referrerStateListener) {
        Intrinsics.checkNotNullParameter(referrerStateListener, "referrerStateListener");
        new PlayServiceWrapper(this.repositoryDI.getPlayServiceRepository$DTDAnalytics_androidRelease()).getInstallReferrer(referrerStateListener);
    }
}
