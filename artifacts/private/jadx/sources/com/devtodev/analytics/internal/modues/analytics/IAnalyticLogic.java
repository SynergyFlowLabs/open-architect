package com.devtodev.analytics.internal.modues.analytics;

import com.devtodev.analytics.external.analytics.DTDAnalyticsConfiguration;
import com.devtodev.analytics.internal.modues.observers.ILogicBroadcaster;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IAnalyticLogic extends IAnalytics, ILogicBroadcaster {
    void applyAnalyticsConfiguration(@NotNull DTDAnalyticsConfiguration dTDAnalyticsConfiguration);

    void prepareCallBacks();

    void tryStartSDK();
}
