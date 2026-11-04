package com.devtodev.core.data.metrics.simple;

import com.devtodev.core.data.metrics.Metric;
import io.sentry.n7;

/* JADX INFO: loaded from: classes3.dex */
public class UserEngagement extends Metric {
    public UserEngagement(long j10) {
        super("UserEngagement", "ue");
        putSessionId();
        addParameter(n7.b.f305917e, Long.valueOf(j10));
    }
}
