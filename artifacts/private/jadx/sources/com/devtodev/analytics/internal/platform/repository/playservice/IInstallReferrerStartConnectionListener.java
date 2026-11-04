package com.devtodev.analytics.internal.platform.repository.playservice;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IInstallReferrerStartConnectionListener {
    void referrerServiceDisconnected();

    void referrerServiceNoDefinition();

    void referrerSetupFinished(@NotNull InstallReferrerState installReferrerState);
}
