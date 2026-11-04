package io.customer.sdk.data.store;

import io.customer.sdk.data.model.Settings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface j {
    @Nullable
    String b();

    void c();

    void clear(@NotNull String str);

    void clearAll();

    void d(@NotNull String str);

    @Nullable
    Settings e();

    void h(@NotNull Settings settings);
}
