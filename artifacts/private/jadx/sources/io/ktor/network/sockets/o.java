package io.ktor.network.sockets;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface o extends d, io.ktor.network.sockets.a, b, t {

    public static final class a {
        public static void a(@NotNull o oVar) {
            d.a.a(oVar);
        }

        @Nullable
        public static Object b(@NotNull o oVar, @NotNull kotlin.coroutines.d<? super q> dVar) {
            return t.a.a(oVar, dVar);
        }

        @Nullable
        public static Object c(@NotNull o oVar, @NotNull q qVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            Object objB = t.a.b(oVar, qVar, dVar);
            return objB == kotlin.coroutines.intrinsics.b.l() ? objB : Unit.f312394a;
        }
    }
}
