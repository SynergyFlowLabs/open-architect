package com.devtodev.core.data.metrics.simple;

import com.devtodev.core.data.consts.SocialNetwork;
import com.devtodev.core.data.metrics.Metric;

/* JADX INFO: loaded from: classes3.dex */
public final class SocialConnectMetric extends Metric {
    private static final long serialVersionUID = 2933114927260304069L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f98141c;

    public SocialConnectMetric(SocialNetwork socialNetwork) {
        super("Social connect", "sc");
        this.f98141c = socialNetwork.getNetworkName();
        addParameter("socialNetwork", socialNetwork.getNetworkName());
        putSessionId();
    }

    public String getNetworkName() {
        return this.f98141c;
    }
}
