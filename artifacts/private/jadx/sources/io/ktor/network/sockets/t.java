package io.ktor.network.sockets;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface t extends s, z {

    public static final class a {
        @Nullable
        public static Object a(@NotNull t tVar, @NotNull kotlin.coroutines.d<? super q> dVar) {
            return s.a.a(tVar, dVar);
        }

        @Nullable
        public static Object b(@NotNull t tVar, @NotNull q qVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            Object objA = z.a.a(tVar, qVar, dVar);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
        }
    }
}
