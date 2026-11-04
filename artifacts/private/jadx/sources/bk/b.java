package bk;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.a0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.internal.i1;
import kotlinx.coroutines.internal.v0;
import kotlinx.coroutines.x2;
import kotlinx.coroutines.z3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nUndispatched.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n+ 2 ProbesSupport.kt\nkotlinx/coroutines/internal/ProbesSupportKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,105:1\n8#2:106\n11#2,2:110\n91#3,3:107\n95#3:112\n57#4,2:113\n57#4,2:115\n57#4,2:117\n*S KotlinDebug\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n*L\n14#1:106\n19#1:110,2\n18#1:107,3\n18#1:112\n88#1:113,2\n89#1:115,2\n103#1:117,2\n*E\n"})
public final class b {
    private static final Void a(v0<?> v0Var, g1 g1Var) throws Throwable {
        boolean z10 = false & false;
        v0Var.z1(new c0(g1Var.getCause(), false, 2, null));
        throw g1Var.getCause();
    }

    private static final boolean b(v0<?> v0Var, Throwable th2) {
        return ((th2 instanceof z3) && ((z3) th2).f315736a == v0Var) ? false : true;
    }

    public static final <R, T> void c(@NotNull Function2<? super R, ? super d<? super T>, ? extends Object> function2, R r10, @NotNull d<? super T> dVar) {
        d dVarA = h.a(dVar);
        try {
            CoroutineContext context = dVarA.getContext();
            Object objI = i1.i(context, null);
            try {
                h.b(dVarA);
                Object objJ = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? kotlin.coroutines.intrinsics.b.j(function2, r10, dVarA) : ((Function2) r1.q(function2, 2)).invoke(r10, dVarA);
                i1.f(context, objI);
                if (objJ != kotlin.coroutines.intrinsics.b.l()) {
                    Result.a aVar = Result.Companion;
                    dVarA.resumeWith(Result.m785constructorimpl(objJ));
                }
            } catch (Throwable th2) {
                i1.f(context, objI);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof g1) {
                th = ((g1) th).getCause();
            }
            Result.a aVar2 = Result.Companion;
            dVarA.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th)));
        }
    }

    @Nullable
    public static final <T, R> Object d(@NotNull v0<? super T> v0Var, R r10, @NotNull Function2<? super R, ? super d<? super T>, ? extends Object> function2) {
        return f(v0Var, true, r10, function2);
    }

    @Nullable
    public static final <T, R> Object e(@NotNull v0<? super T> v0Var, R r10, @NotNull Function2<? super R, ? super d<? super T>, ? extends Object> function2) {
        return f(v0Var, false, r10, function2);
    }

    private static final <T, R> Object f(v0<? super T> v0Var, boolean z10, R r10, Function2<? super R, ? super d<? super T>, ? extends Object> function2) throws Throwable {
        Object c0Var;
        Object objA1;
        try {
            c0Var = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? kotlin.coroutines.intrinsics.b.j(function2, r10, v0Var) : ((Function2) r1.q(function2, 2)).invoke(r10, v0Var);
        } catch (g1 e10) {
            a(v0Var, e10);
            throw new a0();
        } catch (Throwable th2) {
            c0Var = new c0(th2, false, 2, null);
        }
        if (c0Var != kotlin.coroutines.intrinsics.b.l() && (objA1 = v0Var.A1(c0Var)) != x2.f315707b) {
            v0Var.i2();
            if (!(objA1 instanceof c0)) {
                c0Var = x2.h(objA1);
            } else {
                if (z10 || b(v0Var, ((c0) objA1).f313551a)) {
                    throw ((c0) objA1).f313551a;
                }
                if (c0Var instanceof c0) {
                    throw ((c0) c0Var).f313551a;
                }
            }
            return c0Var;
        }
        return kotlin.coroutines.intrinsics.b.l();
    }
}
