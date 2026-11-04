package com.devtodev.analytics.internal.platform;

import android.content.Context;
import com.devtodev.analytics.internal.platform.gateway.PlatformGateway;
import com.devtodev.analytics.internal.platform.repository.playservice.IReferrerStateListener;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Platform implements IPlatform {

    @NotNull
    private final Context context;

    @NotNull
    private final f0 platformGateway$delegate;

    public Platform(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.platformGateway$delegate = g0.c(new Platform$platformGateway$2(this));
    }

    private final PlatformGateway getPlatformGateway() {
        return (PlatformGateway) this.platformGateway$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.platform.IPlatform
    @NotNull
    public ApplicationData getApplicationData() {
        return getPlatformGateway().getApplicationData();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.devtodev.analytics.internal.platform.IPlatform
    @NotNull
    public DeviceConstants getDeviceConstants() {
        return getPlatformGateway().getDeviceConstants();
    }

    @Override // com.devtodev.analytics.internal.platform.IPlatform
    @NotNull
    public DeviceResolution getDeviceResolution() {
        return getPlatformGateway().getDeviceResolution();
    }

    @Override // com.devtodev.analytics.internal.platform.IPlatform
    @NotNull
    public GoogleAdvertisingIdResult getGoogleAdvertisingId() {
        return getPlatformGateway().getGoogleAdvertisingIdResult();
    }

    @Override // com.devtodev.analytics.internal.platform.IPlatform
    @NotNull
    public HuaweiTokenData getHuaweiTokenData() {
        return getPlatformGateway().getHuaweiAdvertisingIdResult();
    }

    @Override // com.devtodev.analytics.internal.platform.IPlatform
    public void getInstallReferrer(@NotNull IReferrerStateListener referrerStateListener) {
        Intrinsics.checkNotNullParameter(referrerStateListener, "referrerStateListener");
        getPlatformGateway().getInstallReferrer(referrerStateListener);
    }
}
