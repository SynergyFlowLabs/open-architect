package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Url;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final f f294575b = new f();

    private f() {
    }

    @Override // io.ktor.client.plugins.cache.storage.b
    @Nullable
    public Object a(@NotNull Url url, @NotNull c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return Unit.f312394a;
    }

    @Override // io.ktor.client.plugins.cache.storage.b
    @Nullable
    public Object b(@NotNull Url url, @NotNull Map<String, String> map, @NotNull kotlin.coroutines.d<? super c> dVar) {
        return null;
    }

    @Override // io.ktor.client.plugins.cache.storage.b
    @Nullable
    public Object c(@NotNull Url url, @NotNull kotlin.coroutines.d<? super Set<c>> dVar) {
        return SetsKt.emptySet();
    }
}
