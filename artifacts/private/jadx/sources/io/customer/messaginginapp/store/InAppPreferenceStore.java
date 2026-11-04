package io.customer.messaginginapp.store;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface InAppPreferenceStore {
    void clearAll();

    @Nullable
    String getNetworkResponse(@NotNull String str);

    void saveNetworkResponse(@NotNull String str, @NotNull String str2);
}
