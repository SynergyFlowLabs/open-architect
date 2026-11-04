package com.devtodev.core.data.metrics.simple;

import com.devtodev.analytics.internal.domain.events.TrackingStatusKt;
import com.devtodev.core.data.metrics.Metric;

/* JADX INFO: loaded from: classes3.dex */
public class TrackingStatus extends Metric {
    public TrackingStatus(boolean z10) {
        super("Tracking Status", TrackingStatusKt.TRACKING_CODE);
        addParameter("isTrackingAllowed", Boolean.valueOf(z10));
    }
}
