package com.devtodev.analytics.internal.services.abtests;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TaskService implements ITaskService {

    @NotNull
    private ICustomTimerTask activationTask;

    @NotNull
    private ICustomTimerTask configTask;

    public TaskService(double d10, double d11) {
        this.configTask = new CustomTimerTask(d10);
        this.activationTask = new CustomTimerTask(d11);
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ITaskService
    @NotNull
    public ICustomTimerTask getActivationTask() {
        return this.activationTask;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ITaskService
    @NotNull
    public ICustomTimerTask getConfigTask() {
        return this.configTask;
    }

    public void setActivationTask(@NotNull ICustomTimerTask iCustomTimerTask) {
        Intrinsics.checkNotNullParameter(iCustomTimerTask, "<set-?>");
        this.activationTask = iCustomTimerTask;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ITaskService
    public void setConfigTask(@NotNull ICustomTimerTask iCustomTimerTask) {
        Intrinsics.checkNotNullParameter(iCustomTimerTask, "<set-?>");
        this.configTask = iCustomTimerTask;
    }
}
