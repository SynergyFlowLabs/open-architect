package com.segment.analytics.kotlin.core.utilities;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, Object> f267011a = new ConcurrentHashMap<>();

    @Override // com.segment.analytics.kotlin.core.utilities.p
    public boolean a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f267011a.put(key, value);
        return true;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    @Nullable
    public String b(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(this.f267011a.get(key) instanceof String)) {
            return str;
        }
        Object obj = this.f267011a.get(key);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        return (String) obj;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    public int c(@NotNull String key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(this.f267011a.get(key) instanceof Integer)) {
            return i10;
        }
        Object obj = this.f267011a.get(key);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) obj).intValue();
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    public boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f267011a.containsKey(key);
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    public boolean d(@NotNull String key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f267011a.put(key, Integer.valueOf(i10));
        return true;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    @kotlin.l(message = "Deprecated in favor of `get`", replaceWith = @b1(expression = "get(key, defaultVal)", imports = {}))
    public int getInt(@NotNull String str, int i10) {
        return p.a.a(this, str, i10);
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    @kotlin.l(message = "Deprecated in favor of `put`", replaceWith = @b1(expression = "put(key, value)", imports = {}))
    public boolean putInt(@NotNull String str, int i10) {
        return p.a.b(this, str, i10);
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    public boolean remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f267011a.remove(key);
        return true;
    }
}
