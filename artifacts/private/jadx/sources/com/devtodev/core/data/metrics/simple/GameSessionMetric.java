package com.devtodev.core.data.metrics.simple;

import com.devtodev.core.data.consts.EndSessionEvent;
import com.devtodev.core.data.consts.StartSessionEvent;
import com.devtodev.core.data.metrics.Metric;
import com.devtodev.core.data.metrics.MetricConsts;
import com.devtodev.core.utils.DeviceUtils;
import io.sentry.n7;

/* JADX INFO: loaded from: classes3.dex */
public final class GameSessionMetric extends Metric {
    private static final long serialVersionUID = 3534202138558134410L;

    public GameSessionMetric(long j10, StartSessionEvent startSessionEvent, EndSessionEvent endSessionEvent) {
        this(j10, startSessionEvent, DeviceUtils.getCurrentUnixTimeInMillis(), endSessionEvent, 0L);
    }

    public GameSessionMetric(long j10, StartSessionEvent startSessionEvent, long j11, EndSessionEvent endSessionEvent, long j12) {
        super("Game Session", MetricConsts.GameSession);
        addParameter(n7.b.f305917e, Long.valueOf((j11 - j10) - j12));
        addParameter("startReason", Integer.valueOf(startSessionEvent.getReasonCode()));
        addParameter("endReason", Integer.valueOf(endSessionEvent.getReasonCode()));
    }
}
