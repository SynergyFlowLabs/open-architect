package com.devtodev.analytics.internal.validator;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IBounder {
    @NotNull
    String maxNotNullStringLength(@NotNull String str, @NotNull String str2, @NotNull String str3, int i10);

    @Nullable
    String maxStringLength(@NotNull String str, @NotNull String str2, @Nullable String str3, int i10);
}
