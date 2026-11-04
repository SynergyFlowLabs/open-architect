package io.ktor.network.sockets;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface s {

    public static final class a {
        @Nullable
        public static Object a(@NotNull s sVar, @NotNull kotlin.coroutines.d<? super q> dVar) {
            return sVar.a().j(dVar);
        }
    }

    @NotNull
    kotlinx.coroutines.channels.n0<q> a();

    @Nullable
    Object j(@NotNull kotlin.coroutines.d<? super q> dVar);
}
