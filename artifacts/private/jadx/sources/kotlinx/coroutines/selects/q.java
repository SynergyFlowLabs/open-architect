package kotlinx.coroutines.selects;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class q {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void c(kotlinx.coroutines.n<? super T> nVar, T t10) {
        n0 n0Var = (n0) nVar.getContext().get(n0.f315180a);
        if (n0Var != null) {
            nVar.n0(n0Var, t10);
        } else {
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(t10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(kotlinx.coroutines.n<?> nVar, Throwable th2) {
        n0 n0Var = (n0) nVar.getContext().get(n0.f315180a);
        if (n0Var != null) {
            nVar.K(n0Var, th2);
        } else {
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
        }
    }

    @a1
    @Nullable
    public static final <R> Object e(@NotNull Function1<? super d<? super R>, Unit> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        e eVar = new e(dVar);
        try {
            function1.invoke(eVar);
        } catch (Throwable th2) {
            eVar.R(th2);
        }
        Object objQ = eVar.Q();
        if (objQ == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objQ;
    }

    @a1
    private static final <R> Object f(Function1<? super d<? super R>, Unit> function1, kotlin.coroutines.d<? super R> dVar) {
        h0.e(0);
        e eVar = new e(dVar);
        try {
            function1.invoke(eVar);
        } catch (Throwable th2) {
            eVar.R(th2);
        }
        Object objQ = eVar.Q();
        if (objQ == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        h0.e(1);
        return objQ;
    }

    @a1
    @Nullable
    public static final <R> Object g(@NotNull Function1<? super d<? super R>, Unit> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        t tVar = new t(dVar);
        try {
            function1.invoke(tVar);
        } catch (Throwable th2) {
            tVar.S(th2);
        }
        Object objT = tVar.T();
        if (objT == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objT;
    }

    @a1
    private static final <R> Object h(Function1<? super d<? super R>, Unit> function1, kotlin.coroutines.d<? super R> dVar) {
        h0.e(0);
        t tVar = new t(dVar);
        try {
            function1.invoke(tVar);
        } catch (Throwable th2) {
            tVar.S(th2);
        }
        Object objT = tVar.T();
        if (objT == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        h0.e(1);
        return objT;
    }
}
