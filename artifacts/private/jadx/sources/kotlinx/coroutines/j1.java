package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 4 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n184#1,17:238\n1#2:221\n236#3:222\n237#3,2:233\n239#3:237\n103#4,10:223\n114#4,2:235\n57#5,2:255\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n*L\n174#1:238,17\n162#1:222\n162#1:233,2\n162#1:237\n162#1:223,10\n162#1:235,2\n204#1:255,2\n*E\n"})
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f315153a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f315154b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f315155c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f315156d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f315157e = -1;

    public static final <T> void a(@NotNull i1<? super T> i1Var, int i10) {
        kotlin.coroutines.d<? super T> dVarD = i1Var.d();
        boolean z10 = i10 == 4;
        if (z10 || !(dVarD instanceof kotlinx.coroutines.internal.m) || c(i10) != c(i1Var.f315036c)) {
            e(i1Var, dVarD, z10);
            return;
        }
        kotlinx.coroutines.internal.m mVar = (kotlinx.coroutines.internal.m) dVarD;
        n0 n0Var = mVar.f315092d;
        CoroutineContext context = mVar.getContext();
        if (kotlinx.coroutines.internal.n.f(n0Var, context)) {
            kotlinx.coroutines.internal.n.e(n0Var, context, i1Var);
        } else {
            f(i1Var);
        }
    }

    @kotlin.a1
    public static /* synthetic */ void b() {
    }

    public static final boolean c(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean d(int i10) {
        return i10 == 2;
    }

    public static final <T> void e(@NotNull i1<? super T> i1Var, @NotNull kotlin.coroutines.d<? super T> dVar, boolean z10) {
        Object objF;
        Object objH = i1Var.h();
        Throwable thE = i1Var.e(objH);
        if (thE != null) {
            Result.a aVar = Result.Companion;
            objF = ResultKt.createFailure(thE);
        } else {
            Result.a aVar2 = Result.Companion;
            objF = i1Var.f(objH);
        }
        Object objM785constructorimpl = Result.m785constructorimpl(objF);
        if (!z10) {
            dVar.resumeWith(objM785constructorimpl);
            return;
        }
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        kotlinx.coroutines.internal.m mVar = (kotlinx.coroutines.internal.m) dVar;
        kotlin.coroutines.d<T> dVar2 = mVar.f315093e;
        Object obj = mVar.f315095g;
        CoroutineContext context = dVar2.getContext();
        Object objI = kotlinx.coroutines.internal.i1.i(context, obj);
        d4<?> d4VarM = objI != kotlinx.coroutines.internal.i1.f315077a ? l0.m(dVar2, context, objI) : null;
        try {
            mVar.f315093e.resumeWith(objM785constructorimpl);
            Unit unit = Unit.f312394a;
            if (d4VarM != null && !d4VarM.j2()) {
                return;
            }
        } finally {
            if (d4VarM == null || d4VarM.j2()) {
                kotlinx.coroutines.internal.i1.f(context, objI);
            }
        }
    }

    private static final void f(i1<?> i1Var) {
        s1 s1VarB = t3.f315643a.b();
        if (s1VarB.j1()) {
            s1VarB.T0(i1Var);
            return;
        }
        s1VarB.e1(true);
        try {
            e(i1Var, i1Var.d(), true);
            do {
            } while (s1VarB.u1());
        } catch (Throwable th2) {
            try {
                i1Var.g(th2);
            } catch (Throwable th3) {
                s1VarB.M0(true);
                throw th3;
            }
        }
        s1VarB.M0(true);
    }

    public static final void g(@NotNull kotlin.coroutines.d<?> dVar, @NotNull Throwable th2) {
        Result.a aVar = Result.Companion;
        dVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
    }

    public static final void h(@NotNull i1<?> i1Var, @NotNull s1 s1Var, @NotNull Function0<Unit> function0) {
        s1Var.e1(true);
        try {
            function0.invoke();
            do {
            } while (s1Var.u1());
            kotlin.jvm.internal.h0.d(1);
        } catch (Throwable th2) {
            try {
                i1Var.g(th2);
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th3) {
                kotlin.jvm.internal.h0.d(1);
                s1Var.M0(true);
                kotlin.jvm.internal.h0.c(1);
                throw th3;
            }
        }
        s1Var.M0(true);
        kotlin.jvm.internal.h0.c(1);
    }
}
