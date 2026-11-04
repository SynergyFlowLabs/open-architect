package com.devtodev.analytics.internal.platform.repository;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IDeviceRepository {
    @NotNull
    String getAndroidId();

    int getDeviceType();

    @NotNull
    String getDeviceVersionKey();

    @NotNull
    String getDevtodevUDID();

    @NotNull
    String getLanguage();

    @NotNull
    String getMacAddress();

    @NotNull
    String getManufacturer();

    @NotNull
    String getModel();

    @NotNull
    String getODIN();

    @NotNull
    String getOsKey();

    int getScreenDPI();

    double getScreenInches();

    @NotNull
    String getScreenResolution();

    int getTimezoneOffset();

    @NotNull
    String getUserAgent();

    boolean isRooted();
}
