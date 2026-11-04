package io.ktor.network.sockets;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface z {

    public static final class a {
        @Nullable
        public static Object a(@NotNull z zVar, @NotNull q qVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            Object objG = zVar.b().G(qVar, dVar);
            return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
        }
    }

    @NotNull
    kotlinx.coroutines.channels.o0<q> b();

    @Nullable
    Object f(@NotNull q qVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
