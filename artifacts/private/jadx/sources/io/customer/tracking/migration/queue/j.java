package io.customer.tracking.migration.queue;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public interface j {
    boolean a(@NotNull String str);

    @NotNull
    List<JSONObject> b();

    @Nullable
    JSONObject get(@NotNull String str);
}
