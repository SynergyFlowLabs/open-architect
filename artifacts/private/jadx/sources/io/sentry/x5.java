package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, v5> f307121a;

    private x5(@NotNull Map<String, v5> map) {
        this.f307121a = map;
    }

    @NotNull
    public static x5 b(@Nullable Map<String, Object> map) {
        if (map == null) {
            return new x5(new ConcurrentHashMap());
        }
        x5 x5Var = new x5(new ConcurrentHashMap(map.size()));
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                x5Var.a(v5.g(key, entry.getValue()));
            }
        }
        return x5Var;
    }

    @NotNull
    public static x5 d(@Nullable v5... v5VarArr) {
        if (v5VarArr == null) {
            return new x5(new ConcurrentHashMap());
        }
        x5 x5Var = new x5(new ConcurrentHashMap(v5VarArr.length));
        for (v5 v5Var : v5VarArr) {
            x5Var.a(v5Var);
        }
        return x5Var;
    }

    public void a(@Nullable v5 v5Var) {
        if (v5Var == null) {
            return;
        }
        this.f307121a.put(v5Var.c(), v5Var);
    }

    @NotNull
    public Map<String, v5> c() {
        return this.f307121a;
    }
}
