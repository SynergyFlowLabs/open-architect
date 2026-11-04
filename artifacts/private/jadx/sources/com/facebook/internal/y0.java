package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y0 f100264a = new y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final ConcurrentHashMap<String, JSONObject> f100265b = new ConcurrentHashMap<>();

    private y0() {
    }

    @oj.n
    @Nullable
    public static final JSONObject a(@NotNull String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return f100265b.get(accessToken);
    }

    @oj.n
    public static final void b(@NotNull String key, @NotNull JSONObject value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        f100265b.put(key, value);
    }
}
