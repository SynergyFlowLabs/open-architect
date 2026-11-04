package com.superwall.sdk.analytics.internal.trackable;

import com.superwall.sdk.analytics.superwall.SuperwallEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface TrackableSuperwallEvent extends Trackable {
    @NotNull
    SuperwallEvent getSuperwallPlacement();
}
