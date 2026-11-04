package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@k2
public interface c1 {

    @SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,159:1\n426#2,11:160\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n*L\n27#1:160,11\n*E\n"})
    public static final class a {
        @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @Nullable
        public static Object a(@NotNull c1 c1Var, long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            if (j10 <= 0) {
                return Unit.f312394a;
            }
            p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            pVar.p0();
            c1Var.b(j10, pVar);
            Object objU = pVar.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
        }

        @NotNull
        public static o1 b(@NotNull c1 c1Var, long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
            return z0.a().d(j10, runnable, coroutineContext);
        }
    }

    void b(long j10, @NotNull n<? super Unit> nVar);

    @NotNull
    o1 d(long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext);

    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    Object g(long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
