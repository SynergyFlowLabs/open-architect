package com.segment.analytics.kotlin.core.utilities;

import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface p {

    public static final class a {
        @kotlin.l(message = "Deprecated in favor of `get`", replaceWith = @b1(expression = "get(key, defaultVal)", imports = {}))
        public static int a(@NotNull p pVar, @NotNull String key, int i10) {
            Intrinsics.checkNotNullParameter(key, "key");
            return pVar.c(key, i10);
        }

        @kotlin.l(message = "Deprecated in favor of `put`", replaceWith = @b1(expression = "put(key, value)", imports = {}))
        public static boolean b(@NotNull p pVar, @NotNull String key, int i10) {
            Intrinsics.checkNotNullParameter(key, "key");
            return pVar.d(key, i10);
        }
    }

    boolean a(@NotNull String str, @NotNull String str2);

    @Nullable
    String b(@NotNull String str, @Nullable String str2);

    int c(@NotNull String str, int i10);

    boolean contains(@NotNull String str);

    boolean d(@NotNull String str, int i10);

    @kotlin.l(message = "Deprecated in favor of `get`", replaceWith = @b1(expression = "get(key, defaultVal)", imports = {}))
    int getInt(@NotNull String str, int i10);

    @kotlin.l(message = "Deprecated in favor of `put`", replaceWith = @b1(expression = "put(key, value)", imports = {}))
    boolean putInt(@NotNull String str, int i10);

    boolean remove(@NotNull String str);
}
