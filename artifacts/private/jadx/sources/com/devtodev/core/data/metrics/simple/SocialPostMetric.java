package com.devtodev.core.data.metrics.simple;

import com.devtodev.core.data.consts.SocialNetwork;
import com.devtodev.core.data.metrics.Metric;

/* JADX INFO: loaded from: classes3.dex */
public final class SocialPostMetric extends Metric {
    private static final long serialVersionUID = -2079591002431573458L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f98142c;

    protected SocialPostMetric() {
        super("Social post", "sp");
    }

    public String getNetworkName() {
        return this.f98142c;
    }

    public SocialPostMetric(SocialNetwork socialNetwork, String str) {
        super("Social post", "sp");
        this.f98142c = socialNetwork.getNetworkName();
        addParameter("socialNetwork", socialNetwork.getNetworkName());
        addParameter("postReason", str);
        putSessionId();
    }
}
