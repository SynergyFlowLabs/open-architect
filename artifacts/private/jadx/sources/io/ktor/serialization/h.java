package io.ktor.serialization;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface h {

    public static final class a {
        @Nullable
        public static Object a(@NotNull h hVar, @NotNull Charset charset, @NotNull ri.b bVar, @Nullable Object obj, @NotNull kotlin.coroutines.d<? super io.ktor.websocket.e> dVar) {
            Intrinsics.checkNotNull(obj);
            return hVar.c(charset, bVar, obj, dVar);
        }
    }

    @Nullable
    Object a(@NotNull Charset charset, @NotNull ri.b bVar, @NotNull io.ktor.websocket.e eVar, @NotNull kotlin.coroutines.d<Object> dVar);

    boolean b(@NotNull io.ktor.websocket.e eVar);

    @Nullable
    Object c(@NotNull Charset charset, @NotNull ri.b bVar, @Nullable Object obj, @NotNull kotlin.coroutines.d<? super io.ktor.websocket.e> dVar);
}
