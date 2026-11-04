package com.superwall.sdk.network;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class NetworkConsts {

    @NotNull
    public static final NetworkConsts INSTANCE = new NetworkConsts();

    private NetworkConsts() {
    }

    public final int retryCount() {
        return 6;
    }
}
