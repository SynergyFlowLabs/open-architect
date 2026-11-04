package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Url;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final e f294574d = new e();

    private e() {
    }

    @Override // io.ktor.client.plugins.cache.storage.l
    @Nullable
    public io.ktor.client.plugins.cache.c e(@NotNull Url url, @NotNull Map<String, String> varyKeys) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(varyKeys, "varyKeys");
        return null;
    }

    @Override // io.ktor.client.plugins.cache.storage.l
    @NotNull
    public Set<io.ktor.client.plugins.cache.c> f(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return SetsKt.emptySet();
    }

    @Override // io.ktor.client.plugins.cache.storage.l
    public void g(@NotNull Url url, @NotNull io.ktor.client.plugins.cache.c value) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
