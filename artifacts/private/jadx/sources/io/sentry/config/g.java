package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface g {
    @Nullable
    default Double a(@NotNull String str) {
        String property = getProperty(str);
        if (property == null) {
            return null;
        }
        try {
            return Double.valueOf(property);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @NotNull
    default List<String> b(@NotNull String str) {
        String property = getProperty(str);
        return property != null ? Arrays.asList(property.split(",")) : Collections.EMPTY_LIST;
    }

    @Nullable
    default Boolean c(@NotNull String str) {
        String property = getProperty(str);
        if (property != null) {
            return Boolean.valueOf(property);
        }
        return null;
    }

    @Nullable
    default List<String> d(@NotNull String str) {
        String property = getProperty(str);
        if (property != null) {
            return Arrays.asList(property.split(","));
        }
        return null;
    }

    @NotNull
    Map<String, String> e(@NotNull String str);

    @Nullable
    default Long f(@NotNull String str) {
        String property = getProperty(str);
        if (property != null) {
            try {
                return Long.valueOf(property);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @NotNull
    default String g(@NotNull String str, @NotNull String str2) {
        String property = getProperty(str);
        return property != null ? property : str2;
    }

    @Nullable
    String getProperty(@NotNull String str);
}
