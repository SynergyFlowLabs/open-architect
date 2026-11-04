package io.ktor.util;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
abstract class c implements b {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.b
    public final <T> void a(@NotNull a<T> key, @NotNull T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        j().put(key, value);
    }

    @Override // io.ktor.util.b
    @NotNull
    public final List<a<?>> b() {
        return CollectionsKt.toList(j().keySet());
    }

    @Override // io.ktor.util.b
    public final <T> void c(@NotNull a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        j().remove(key);
    }

    @Override // io.ktor.util.b
    public final boolean d(@NotNull a<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return j().containsKey(key);
    }

    @Override // io.ktor.util.b
    @Nullable
    public final <T> T e(@NotNull a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) j().get(key);
    }

    @Override // io.ktor.util.b
    @NotNull
    public <T> T f(@NotNull a<T> aVar) {
        return (T) b.a.a(this, aVar);
    }

    @Override // io.ktor.util.b
    @NotNull
    public <T> T g(@NotNull a<T> aVar) {
        return (T) b.a.b(this, aVar);
    }

    @Override // io.ktor.util.b
    @Nullable
    public <T> T h(@NotNull a<T> aVar) {
        return (T) b.a.c(this, aVar);
    }

    @NotNull
    protected abstract Map<a<?>, Object> j();
}
