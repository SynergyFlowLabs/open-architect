package com.devtodev.analytics.internal.modues.observers;

import com.devtodev.analytics.external.analytics.DTDIdentifiersListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IAnalyticsObserver {
    void addIdentifiersListener(@Nullable DTDIdentifiersListener dTDIdentifiersListener);

    void addLogicReceiver(@NotNull ILogicBroadcaster iLogicBroadcaster);

    void finishInitialization();

    void setInitializationCallBack(@Nullable Function0<Unit> function0);
}
