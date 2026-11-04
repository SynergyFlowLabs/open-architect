package com.devtodev.analytics.internal.network;

import com.devtodev.analytics.internal.backend.repository.contentbuilder.IRequestContent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IRequestBuilder {
    void appendPathSegment(@NotNull String str);

    @NotNull
    IRequest build();

    void setContent(@NotNull IRequestContent iRequestContent);

    void setQueryParam(@NotNull String str, @NotNull String str2);

    void setRequestIdentifier(@NotNull String str);
}
