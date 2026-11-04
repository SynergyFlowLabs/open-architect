package com.devtodev.analytics.internal.backend.repository.contentbuilder;

import com.devtodev.analytics.internal.backend.Identifiers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IContentBuilder {
    @NotNull
    IRequestContent getContent(@NotNull String str, @NotNull Identifiers identifiers);
}
