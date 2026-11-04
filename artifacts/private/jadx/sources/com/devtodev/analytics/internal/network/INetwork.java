package com.devtodev.analytics.internal.network;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface INetwork {
    @NotNull
    IRequestBuilder get(@NotNull String str);

    @NotNull
    IRequestBuilder post(@NotNull String str);
}
