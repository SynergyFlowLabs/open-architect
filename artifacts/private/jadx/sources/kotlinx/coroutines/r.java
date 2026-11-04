package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nCancellableContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,498:1\n1#2:499\n*E\n"})
public final class r {
    @k2
    public static final void a(@NotNull n<?> nVar, @NotNull o1 o1Var) {
        c(nVar, new p1(o1Var));
    }

    @NotNull
    public static final <T> p<T> b(@NotNull kotlin.coroutines.d<? super T> dVar) {
        if (!(dVar instanceof kotlinx.coroutines.internal.m)) {
            return new p<>(dVar, 1);
        }
        p<T> pVarJ = ((kotlinx.coroutines.internal.m) dVar).j();
        if (pVarJ != null) {
            if (!pVarJ.S()) {
                pVarJ = null;
            }
            if (pVarJ != null) {
                return pVarJ;
            }
        }
        return new p<>(dVar, 2);
    }

    public static final <T> void c(@NotNull n<? super T> nVar, @NotNull m mVar) {
        if (!(nVar instanceof p)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((p) nVar).G(mVar);
    }

    @Nullable
    public static final <T> Object d(@NotNull Function1<? super n<? super T>, Unit> function1, @NotNull kotlin.coroutines.d<? super T> dVar) {
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        function1.invoke(pVar);
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    private static final <T> Object e(Function1<? super n<? super T>, Unit> function1, kotlin.coroutines.d<? super T> dVar) {
        kotlin.jvm.internal.h0.e(0);
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        function1.invoke(pVar);
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        kotlin.jvm.internal.h0.e(1);
        return objU;
    }

    @Nullable
    public static final <T> Object f(@NotNull Function1<? super p<? super T>, Unit> function1, @NotNull kotlin.coroutines.d<? super T> dVar) {
        p pVarB = b(kotlin.coroutines.intrinsics.b.e(dVar));
        try {
            function1.invoke(pVarB);
            Object objU = pVarB.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objU;
        } finally {
            pVarB.R();
        }
    }

    private static final <T> Object g(Function1<? super p<? super T>, Unit> function1, kotlin.coroutines.d<? super T> dVar) {
        kotlin.jvm.internal.h0.e(0);
        p pVarB = b(kotlin.coroutines.intrinsics.b.e(dVar));
        try {
            function1.invoke(pVarB);
            Object objU = pVarB.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            kotlin.jvm.internal.h0.e(1);
            return objU;
        } catch (Throwable th2) {
            pVarB.R();
            throw th2;
        }
    }
}
