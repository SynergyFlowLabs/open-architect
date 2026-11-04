package com.devtodev.analytics.internal.managers;

import com.devtodev.analytics.internal.domain.DeviceIdentifiers;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.platform.AdvertisingIdResult;
import com.devtodev.analytics.internal.platform.ApplicationData;
import com.devtodev.analytics.internal.platform.DeviceConstants;
import com.devtodev.analytics.internal.platform.DeviceResolution;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IDeviceManager {
    @Nullable
    Pair<String, String> checkSdkVersionChanges();

    @NotNull
    AdvertisingIdResult getAdvertisingId();

    @NotNull
    ApplicationData getAppVersion();

    @NotNull
    DeviceConstants getDeviceConstants();

    @NotNull
    DeviceResolution getDeviceResolution();

    @NotNull
    DTDPlatformOwner getDeviseOwner();

    void getReferrer(@NotNull Function1<? super String, Unit> function1);

    @NotNull
    DeviceIdentifiers initializeDeviceId(@NotNull Project project);

    void updateIdentifiersRepository(@NotNull DeviceIdentifiers deviceIdentifiers, @NotNull Project project);
}
