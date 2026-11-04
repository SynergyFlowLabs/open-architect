package com.superwall.sdk.dependencies;

import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface ConfigAttributesFactory {
    @NotNull
    InternalSuperwallEvent.ConfigAttributes makeConfigAttributes();
}
