package com.devtodev.analytics.internal.network.request.platform;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IUrlBuilder extends IUrl {
    void appendSegment(@NotNull String str);

    void setQueryParam(@NotNull String str, @NotNull String str2);
}
