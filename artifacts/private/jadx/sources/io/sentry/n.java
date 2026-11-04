package io.sentry;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f305889a = new HashMap();

    @Nullable
    public Object a(@NotNull String str) {
        io.sentry.util.y.c(str, "key is required");
        return this.f305889a.get(str);
    }

    @NotNull
    public Map<String, Object> b() {
        return this.f305889a;
    }

    public void c(@NotNull String str, @Nullable Object obj) {
        io.sentry.util.y.c(str, "key is required");
        this.f305889a.put(str, obj);
    }
}
