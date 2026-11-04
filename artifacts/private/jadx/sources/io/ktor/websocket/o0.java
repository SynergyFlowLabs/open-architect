package io.ktor.websocket;

import java.util.List;
import kotlin.Unit;
import kotlin.b1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface o0 extends s0 {

    public static final class a {
        @Nullable
        public static Object a(@NotNull o0 o0Var, @NotNull e eVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            Object objG = o0Var.b().G(eVar, dVar);
            return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
        }
    }

    @NotNull
    List<e0<?>> O0();

    void R0(long j10);

    long T();

    void Y(boolean z10);

    @NotNull
    kotlinx.coroutines.channels.n0<e> a();

    @NotNull
    kotlinx.coroutines.channels.o0<e> b();

    @Nullable
    Object d(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Object g1(@NotNull e eVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @kotlin.l(level = kotlin.n.ERROR, message = "Use cancel() instead.", replaceWith = @b1(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    void o0();

    boolean o1();
}
