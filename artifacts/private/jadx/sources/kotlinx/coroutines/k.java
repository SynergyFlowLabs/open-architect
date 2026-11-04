package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nBuilders.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,268:1\n91#2,5:269\n*S KotlinDebug\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n*L\n164#1:269,5\n*E\n"})
public final /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f315160a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f315161b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f315162c = 2;

    @NotNull
    public static final <T> a1<T> a(@NotNull s0 s0Var, @NotNull CoroutineContext coroutineContext, @NotNull u0 u0Var, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) {
        CoroutineContext coroutineContextK = l0.k(s0Var, coroutineContext);
        b1 y2Var = u0Var.o() ? new y2(coroutineContextK, function2) : new b1(coroutineContextK, true);
        ((a) y2Var).h2(u0Var, y2Var, function2);
        return (a1<T>) y2Var;
    }

    public static /* synthetic */ a1 b(s0 s0Var, CoroutineContext coroutineContext, u0 u0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i10 & 2) != 0) {
            u0Var = u0.DEFAULT;
        }
        return i.a(s0Var, coroutineContext, u0Var, function2);
    }

    @Nullable
    public static final <T> Object c(@NotNull n0 n0Var, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return i.h(n0Var, function2, dVar);
    }

    private static final <T> Object d(n0 n0Var, Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super T> dVar) {
        kotlin.jvm.internal.h0.e(0);
        Object objH = i.h(n0Var, function2, dVar);
        kotlin.jvm.internal.h0.e(1);
        return objH;
    }

    @NotNull
    public static final p2 e(@NotNull s0 s0Var, @NotNull CoroutineContext coroutineContext, @NotNull u0 u0Var, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        CoroutineContext coroutineContextK = l0.k(s0Var, coroutineContext);
        a z2Var = u0Var.o() ? new z2(coroutineContextK, function2) : new n3(coroutineContextK, true);
        z2Var.h2(u0Var, z2Var, function2);
        return z2Var;
    }

    public static /* synthetic */ p2 f(s0 s0Var, CoroutineContext coroutineContext, u0 u0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i10 & 2) != 0) {
            u0Var = u0.DEFAULT;
        }
        return i.d(s0Var, coroutineContext, u0Var, function2);
    }

    @Nullable
    public static final <T> Object g(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        Object objJ2;
        CoroutineContext context = dVar.getContext();
        CoroutineContext coroutineContextJ = l0.j(context, coroutineContext);
        s2.y(coroutineContextJ);
        if (coroutineContextJ == context) {
            kotlinx.coroutines.internal.v0 v0Var = new kotlinx.coroutines.internal.v0(coroutineContextJ, dVar);
            objJ2 = bk.b.d(v0Var, v0Var, function2);
        } else {
            kotlin.coroutines.e.b bVar = kotlin.coroutines.e.K2;
            if (Intrinsics.areEqual(coroutineContextJ.get(bVar), context.get(bVar))) {
                d4 d4Var = new d4(coroutineContextJ, dVar);
                CoroutineContext context2 = d4Var.getContext();
                Object objI = kotlinx.coroutines.internal.i1.i(context2, null);
                try {
                    Object objD = bk.b.d(d4Var, d4Var, function2);
                    kotlinx.coroutines.internal.i1.f(context2, objI);
                    objJ2 = objD;
                } catch (Throwable th2) {
                    kotlinx.coroutines.internal.i1.f(context2, objI);
                    throw th2;
                }
            } else {
                h1 h1Var = new h1(coroutineContextJ, dVar);
                bk.a.e(function2, h1Var, h1Var);
                objJ2 = h1Var.j2();
            }
        }
        if (objJ2 == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objJ2;
    }
}
