package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.d4;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s1;
import kotlinx.coroutines.t3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 2 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,313:1\n293#1,5:321\n298#1,12:327\n310#1:395\n297#1:397\n298#1,12:399\n310#1:428\n207#2,7:314\n214#2,23:342\n237#2,2:375\n239#2:379\n217#2:380\n219#2:396\n1#3:326\n1#3:398\n1#3:429\n184#4,3:339\n187#4,14:381\n184#4,17:411\n184#4,17:430\n103#5,10:365\n114#5,2:377\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n*L\n278#1:321,5\n278#1:327,12\n278#1:395\n283#1:397\n283#1:399,12\n283#1:428\n278#1:314,7\n278#1:342,23\n278#1:375,2\n278#1:379\n278#1:380\n278#1:396\n278#1:326\n283#1:398\n278#1:339,3\n278#1:381,14\n283#1:411,17\n309#1:430,17\n278#1:365,10\n278#1:377,2\n*E\n"})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final z0 f315100a = new z0("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final z0 f315101b = new z0("REUSABLE_CLAIMED");

    private static final boolean b(m<?> mVar, Object obj, int i10, boolean z10, Function0<Unit> function0) {
        s1 s1VarB = t3.f315643a.b();
        if (z10 && s1VarB.p1()) {
            return false;
        }
        if (s1VarB.j1()) {
            mVar.f315094f = obj;
            mVar.f315036c = i10;
            s1VarB.T0(mVar);
            return true;
        }
        s1VarB.e1(true);
        try {
            function0.invoke();
            do {
            } while (s1VarB.u1());
            kotlin.jvm.internal.h0.d(1);
        } catch (Throwable th2) {
            try {
                mVar.g(th2);
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th3) {
                kotlin.jvm.internal.h0.d(1);
                s1VarB.M0(true);
                kotlin.jvm.internal.h0.c(1);
                throw th3;
            }
        }
        s1VarB.M0(true);
        kotlin.jvm.internal.h0.c(1);
        return false;
    }

    static /* synthetic */ boolean c(m mVar, Object obj, int i10, boolean z10, Function0 function0, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        s1 s1VarB = t3.f315643a.b();
        if (z10 && s1VarB.p1()) {
            return false;
        }
        if (s1VarB.j1()) {
            mVar.f315094f = obj;
            mVar.f315036c = i10;
            s1VarB.T0(mVar);
            return true;
        }
        s1VarB.e1(true);
        try {
            function0.invoke();
            do {
            } while (s1VarB.u1());
            kotlin.jvm.internal.h0.d(1);
        } catch (Throwable th2) {
            try {
                mVar.g(th2);
                kotlin.jvm.internal.h0.d(1);
            } finally {
                kotlin.jvm.internal.h0.d(1);
                s1VarB.M0(true);
                kotlin.jvm.internal.h0.c(1);
            }
        }
        s1VarB.M0(true);
        return false;
    }

    @k2
    public static final <T> void d(@NotNull kotlin.coroutines.d<? super T> dVar, @NotNull Object obj) {
        if (!(dVar instanceof m)) {
            dVar.resumeWith(obj);
            return;
        }
        m mVar = (m) dVar;
        Object objB = kotlinx.coroutines.f0.b(obj);
        if (f(mVar.f315092d, mVar.getContext())) {
            mVar.f315094f = objB;
            mVar.f315036c = 1;
            e(mVar.f315092d, mVar.getContext(), mVar);
            return;
        }
        s1 s1VarB = t3.f315643a.b();
        if (s1VarB.j1()) {
            mVar.f315094f = objB;
            mVar.f315036c = 1;
            s1VarB.T0(mVar);
            return;
        }
        s1VarB.e1(true);
        try {
            p2 p2Var = (p2) mVar.getContext().get(p2.M2);
            if (p2Var == null || p2Var.isActive()) {
                kotlin.coroutines.d<T> dVar2 = mVar.f315093e;
                Object obj2 = mVar.f315095g;
                CoroutineContext context = dVar2.getContext();
                Object objI = i1.i(context, obj2);
                d4<?> d4VarM = objI != i1.f315077a ? kotlinx.coroutines.l0.m(dVar2, context, objI) : null;
                try {
                    mVar.f315093e.resumeWith(obj);
                    Unit unit = Unit.f312394a;
                    if (d4VarM == null || d4VarM.j2()) {
                        i1.f(context, objI);
                    }
                } catch (Throwable th2) {
                    if (d4VarM == null || d4VarM.j2()) {
                        i1.f(context, objI);
                    }
                    throw th2;
                }
            } else {
                CancellationException cancellationExceptionY0 = p2Var.y0();
                mVar.a(objB, cancellationExceptionY0);
                Result.a aVar = Result.Companion;
                mVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(cancellationExceptionY0)));
            }
            do {
            } while (s1VarB.u1());
        } catch (Throwable th3) {
            try {
                mVar.g(th3);
            } finally {
                s1VarB.M0(true);
            }
        }
    }

    public static final void e(@NotNull kotlinx.coroutines.n0 n0Var, @NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        try {
            n0Var.h(coroutineContext, runnable);
        } catch (Throwable th2) {
            throw new kotlinx.coroutines.g1(th2, n0Var, coroutineContext);
        }
    }

    public static final boolean f(@NotNull kotlinx.coroutines.n0 n0Var, @NotNull CoroutineContext coroutineContext) throws kotlinx.coroutines.g1 {
        try {
            return n0Var.N(coroutineContext);
        } catch (Throwable th2) {
            throw new kotlinx.coroutines.g1(th2, n0Var, coroutineContext);
        }
    }

    public static final boolean g(@NotNull m<? super Unit> mVar) {
        Unit unit = Unit.f312394a;
        s1 s1VarB = t3.f315643a.b();
        if (s1VarB.p1()) {
            return false;
        }
        if (s1VarB.j1()) {
            mVar.f315094f = unit;
            mVar.f315036c = 1;
            s1VarB.T0(mVar);
            return true;
        }
        s1VarB.e1(true);
        try {
            mVar.run();
            do {
            } while (s1VarB.u1());
        } catch (Throwable th2) {
            try {
                mVar.g(th2);
            } finally {
                s1VarB.M0(true);
            }
        }
        return false;
    }
}
