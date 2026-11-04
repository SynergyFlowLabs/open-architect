package com.superwall.sdk.dependencies;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface WebToAppFactory {
    boolean isWebToAppEnabled();

    @NotNull
    String restoreUrl();
}
