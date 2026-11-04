package com.devtodev.analytics.internal.services.abtests;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface ITaskService {
    @NotNull
    ICustomTimerTask getActivationTask();

    @NotNull
    ICustomTimerTask getConfigTask();

    void setConfigTask(@NotNull ICustomTimerTask iCustomTimerTask);
}
