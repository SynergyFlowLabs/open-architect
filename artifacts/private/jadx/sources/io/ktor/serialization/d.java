package io.ktor.serialization;

import io.ktor.http.content.w;
import io.ktor.http.m;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface d {
    @Nullable
    Object a(@NotNull Charset charset, @NotNull ri.b bVar, @NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<Object> dVar);

    @Nullable
    Object b(@NotNull m mVar, @NotNull Charset charset, @NotNull ri.b bVar, @Nullable Object obj, @NotNull kotlin.coroutines.d<? super w> dVar);
}
