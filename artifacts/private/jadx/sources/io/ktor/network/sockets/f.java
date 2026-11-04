package io.ktor.network.sockets;

import io.ktor.network.sockets.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface f<S extends d> extends d {

    public static final class a {
        public static <S extends d> void a(@NotNull f<? extends S> fVar) {
            d.a.a(fVar);
        }
    }

    @Nullable
    Object o8(@NotNull kotlin.coroutines.d<? super S> dVar);
}
