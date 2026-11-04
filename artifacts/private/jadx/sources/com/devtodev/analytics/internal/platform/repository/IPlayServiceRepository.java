package com.devtodev.analytics.internal.platform.repository;

import com.devtodev.analytics.internal.platform.repository.playservice.IInstallReferrerStartConnectionListener;
import com.devtodev.analytics.internal.platform.repository.playservice.IInstallReferrerStopConnectionListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IPlayServiceRepository {
    void startInstallReferrerConnection(@NotNull IInstallReferrerStartConnectionListener iInstallReferrerStartConnectionListener);

    void stopInstallReferrerConnection(@NotNull IInstallReferrerStopConnectionListener iInstallReferrerStopConnectionListener);
}
