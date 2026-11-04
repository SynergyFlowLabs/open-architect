package com.devtodev.analytics.internal.managers;

import com.devtodev.analytics.internal.backend.Identifiers;
import com.devtodev.analytics.internal.backend.Versions;
import com.devtodev.analytics.internal.domain.DeviceIdentifiers;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.platform.AdvertisingIdResult;
import com.devtodev.analytics.internal.platform.ApplicationData;
import com.devtodev.analytics.internal.platform.DeviceConstants;
import com.devtodev.analytics.internal.platform.DeviceResolution;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IStateManager {
    void activateUser(@NotNull String str);

    void changeValidStateOfDeviceIdentifiers(boolean z10);

    @NotNull
    DeviceIdentifiers getActiveDeviceIdentifiers();

    @NotNull
    Project getActiveProject();

    @NotNull
    User getActiveUser();

    @NotNull
    AdvertisingIdResult getAdvertisingId();

    @NotNull
    Identifiers getAllIdentifiers(@NotNull User user);

    @NotNull
    List<User> getAllUsers();

    @NotNull
    ApplicationData getApplicationData();

    @NotNull
    DeviceConstants getDeviceConstants();

    @NotNull
    DeviceResolution getDeviceResolution();

    @NotNull
    DTDPlatformOwner getDeviseOwner();

    @NotNull
    Identifiers getIdentifiers(@NotNull User user);

    @NotNull
    List<User> getInactiveUser();

    void getReferrerData(@NotNull Function1<? super String, Unit> function1);

    @NotNull
    Versions getVersion();

    void replaceUserId(@NotNull User user, @NotNull String str);

    void updateDeviceIdentifiers(@Nullable Long l10, @Nullable Long l11, @Nullable Long l12);
}
