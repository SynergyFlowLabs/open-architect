package com.devtodev.analytics.internal.services.abtests;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface ICustomTimerTask {
    double getHoldUpTime();

    boolean isTimeoutValid();

    void launchTask(@NotNull Function0<Unit> function0);

    void stopTask();
}
