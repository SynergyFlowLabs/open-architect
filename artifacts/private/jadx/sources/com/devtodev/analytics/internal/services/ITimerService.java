package com.devtodev.analytics.internal.services;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface ITimerService {
    @Nullable
    Function0<Unit> getOnActivityTimerTick();

    @Nullable
    Function0<Unit> getOnAliveTimerTick();

    @Nullable
    Function0<Unit> getOnCurrencyAccrualTimerTick();

    @Nullable
    Function0<Unit> getOnRequestTimerTick();

    void resetAliveTimer();

    void resetRequestTimer();

    void resetTimers();

    void setOnActivityTimerTick(@Nullable Function0<Unit> function0);

    void setOnAliveTimerTick(@Nullable Function0<Unit> function0);

    void setOnCurrencyAccrualTimerTick(@Nullable Function0<Unit> function0);

    void setOnRequestTimerTick(@Nullable Function0<Unit> function0);

    void startTimers();

    void stopTimers();
}
