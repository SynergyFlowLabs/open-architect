package com.devtodev.analytics.internal.network;

import com.devtodev.analytics.internal.network.request.RequestBuilder;
import com.devtodev.analytics.internal.network.request.RequestType;
import com.devtodev.analytics.internal.network.request.platform.UrlBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Network implements INetwork {
    @Override // com.devtodev.analytics.internal.network.INetwork
    @NotNull
    public IRequestBuilder get(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return new RequestBuilder(RequestType.GET, new UrlBuilder(host));
    }

    @Override // com.devtodev.analytics.internal.network.INetwork
    @NotNull
    public IRequestBuilder post(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return new RequestBuilder(RequestType.POST, new UrlBuilder(host));
    }
}
