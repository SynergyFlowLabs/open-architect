package com.devtodev.core.data.metrics.simple;

import com.devtodev.analytics.internal.storage.sqlite.TutorialMarkEntry;
import com.devtodev.core.data.metrics.Metric;

/* JADX INFO: loaded from: classes3.dex */
public final class TutorialMetric extends Metric {
    private static final long serialVersionUID = 3534202138558134410L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f98143c;

    public TutorialMetric(int i10) {
        super("Tutorial", "tr");
        this.f98143c = i10;
        addParameter(TutorialMarkEntry.step, Integer.valueOf(i10));
        putSessionId();
    }

    public int getStep() {
        return this.f98143c;
    }
}
