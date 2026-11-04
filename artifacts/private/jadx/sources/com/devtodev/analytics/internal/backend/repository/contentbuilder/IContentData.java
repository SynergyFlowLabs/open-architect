package com.devtodev.analytics.internal.backend.repository.contentbuilder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IContentData {
    @NotNull
    IContentData getCompressedContent();

    @NotNull
    String getContentType();

    @NotNull
    byte[] getData();

    @NotNull
    IContentData getEncryptionContent();

    @Nullable
    String getExceptionMessage();

    void setContentType(@NotNull String str);

    void setData(@NotNull byte[] bArr);
}
