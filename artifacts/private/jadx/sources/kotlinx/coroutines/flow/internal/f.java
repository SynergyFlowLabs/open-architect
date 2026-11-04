package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,241:1\n91#2,5:242\n*S KotlinDebug\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n*L\n222#1:242,5\n*E\n"})
public final class f {
    @NotNull
    public static final <T> e<T> b(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar) {
        e<T> eVar = iVar instanceof e ? (e) iVar : null;
        if (eVar == null) {
            return new i(iVar, null, 0, null, 14, null);
        }
        return eVar;
    }

    @Nullable
    public static final <T, V> Object c(@NotNull CoroutineContext coroutineContext, V v10, @NotNull Object obj, @NotNull Function2<? super V, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        Object objI = i1.i(coroutineContext, obj);
        try {
            b0 b0Var = new b0(dVar, coroutineContext);
            Object objJ = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? kotlin.coroutines.intrinsics.b.j(function2, v10, b0Var) : ((Function2) r1.q(function2, 2)).invoke(v10, b0Var);
            i1.f(coroutineContext, objI);
            if (objJ == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objJ;
        } catch (Throwable th2) {
            i1.f(coroutineContext, objI);
            throw th2;
        }
    }

    public static /* synthetic */ Object d(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = i1.g(coroutineContext);
        }
        return c(coroutineContext, obj, obj2, function2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.j<T> e(kotlinx.coroutines.flow.j<? super T> jVar, CoroutineContext coroutineContext) {
        return ((jVar instanceof a0) || (jVar instanceof t)) ? jVar : new d0(jVar, coroutineContext);
    }
}
