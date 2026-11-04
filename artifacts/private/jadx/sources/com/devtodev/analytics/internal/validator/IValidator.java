package com.devtodev.analytics.internal.validator;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IValidator {
    boolean equalStringLength(@NotNull String str, @NotNull String str2, @Nullable String str3, int i10);

    @Nullable
    Map<String, List<Object>> getExcludedOptions();

    @Nullable
    Long getNumberOfCurrencies();

    boolean inInterval(@NotNull String str, @NotNull String str2, @NotNull Number number, @NotNull Number number2, @NotNull Number number3);

    boolean isAllExcluded(@Nullable Boolean bool);

    boolean isExcluded(@NotNull String str, @Nullable Object obj);

    <T> boolean notNull(@NotNull String str, @NotNull String str2, @Nullable T t10);

    boolean notNullOrEmpty(@NotNull String str, @NotNull String str2, @Nullable String str3);

    boolean notNullOrEmpty(@NotNull String str, @NotNull String str2, @Nullable Map<String, ? extends Object> map);

    <T> boolean validType(@NotNull String str, @NotNull String str2, @Nullable T t10);

    boolean validateDoubleNAN(@NotNull String str, @NotNull String str2, double d10);
}
