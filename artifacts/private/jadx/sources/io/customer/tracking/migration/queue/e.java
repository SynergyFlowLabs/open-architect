package io.customer.tracking.migration.queue;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ih.e f288647a;

    public e(@NotNull ih.e logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f288647a = logger;
    }

    @Override // io.customer.tracking.migration.queue.d
    @Nullable
    public JSONObject a(@NotNull List<? extends JSONObject> queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        if (queue.isEmpty()) {
            return null;
        }
        ih.e.a.a(this.f288647a, "queue querying next task", null, 2, null);
        return (JSONObject) CollectionsKt.firstOrNull((List) queue);
    }
}
