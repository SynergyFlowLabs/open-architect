package com.superwall.sdk.storage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface Storage {

    public static final class DefaultImpls {
        public static <T> void delete(@NotNull Storage storage, @NotNull Storable<T> storable) {
            Intrinsics.checkNotNullParameter(storable, "storable");
        }
    }

    void clean();

    <T> void delete(@NotNull Storable<T> storable);

    @Nullable
    <T> T read(@NotNull Storable<T> storable);

    <T> void write(@NotNull Storable<T> storable, @NotNull T t10);
}
