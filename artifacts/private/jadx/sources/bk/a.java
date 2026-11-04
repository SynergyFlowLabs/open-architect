package bk;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.internal.n;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nCancellable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n1#1,65:1\n45#1,6:66\n45#1,6:72\n45#1,6:78\n*S KotlinDebug\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n15#1:66,6\n25#1:72,6\n34#1:78,6\n*E\n"})
public final class a {
    private static final void a(d<?> dVar, Throwable th2) throws Throwable {
        if (th2 instanceof g1) {
            th2 = ((g1) th2).getCause();
        }
        Result.a aVar = Result.Companion;
        dVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
        throw th2;
    }

    private static final void b(d<?> dVar, Function0<Unit> function0) throws Throwable {
        try {
            function0.invoke();
        } catch (Throwable th2) {
            a(dVar, th2);
        }
    }

    public static final void c(@NotNull d<? super Unit> dVar, @NotNull d<?> dVar2) throws Throwable {
        try {
            d dVarE = kotlin.coroutines.intrinsics.b.e(dVar);
            Result.a aVar = Result.Companion;
            n.d(dVarE, Result.m785constructorimpl(Unit.f312394a));
        } catch (Throwable th2) {
            a(dVar2, th2);
        }
    }

    @k2
    public static final <T> void d(@NotNull Function1<? super d<? super T>, ? extends Object> function1, @NotNull d<? super T> dVar) {
        try {
            d dVarE = kotlin.coroutines.intrinsics.b.e(kotlin.coroutines.intrinsics.b.b(function1, dVar));
            Result.a aVar = Result.Companion;
            n.d(dVarE, Result.m785constructorimpl(Unit.f312394a));
        } catch (Throwable th2) {
            a(dVar, th2);
        }
    }

    public static final <R, T> void e(@NotNull Function2<? super R, ? super d<? super T>, ? extends Object> function2, R r10, @NotNull d<? super T> dVar) {
        try {
            d dVarE = kotlin.coroutines.intrinsics.b.e(kotlin.coroutines.intrinsics.b.c(function2, r10, dVar));
            Result.a aVar = Result.Companion;
            n.d(dVarE, Result.m785constructorimpl(Unit.f312394a));
        } catch (Throwable th2) {
            a(dVar, th2);
        }
    }
}
