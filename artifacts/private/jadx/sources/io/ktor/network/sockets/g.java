package io.ktor.network.sockets;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface g extends d, io.ktor.network.sockets.a, t {

    public static final class a {
        public static void a(@NotNull g gVar) {
            d.a.a(gVar);
        }

        @Nullable
        public static Object b(@NotNull g gVar, @NotNull kotlin.coroutines.d<? super q> dVar) {
            return t.a.a(gVar, dVar);
        }

        @Nullable
        public static Object c(@NotNull g gVar, @NotNull q qVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            Object objB = t.a.b(gVar, qVar, dVar);
            return objB == kotlin.coroutines.intrinsics.b.l() ? objB : Unit.f312394a;
        }
    }
}
