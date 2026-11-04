package kotlinx.coroutines.reactive;

import java.util.ServiceLoader;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.l1;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.u;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nReactiveFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/ReactiveFlowKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,270:1\n12813#2,3:271\n37#3:274\n36#3,3:275\n*S KotlinDebug\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/ReactiveFlowKt\n*L\n165#1:271,3\n162#1:274\n162#1:275,3\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final c[] f315295a = (c[]) kotlin.sequences.o.c3(kotlin.sequences.o.e(ServiceLoader.load(c.class, c.class.getClassLoader()).iterator())).toArray(new c[0]);

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> a(@NotNull u<T> uVar) {
        return new m(uVar, null, 0, null, 14, null);
    }

    @oj.j
    @NotNull
    public static final <T> u<T> b(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar) {
        return d(iVar, null, 1, null);
    }

    @oj.j
    @NotNull
    public static final <T> u<T> c(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        return new e(iVar, l1.g().plus(coroutineContext));
    }

    public static /* synthetic */ u d(kotlinx.coroutines.flow.i iVar, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return c(iVar, coroutineContext);
    }

    @NotNull
    public static final <T> u<T> e(@NotNull u<T> uVar, @NotNull CoroutineContext coroutineContext) {
        for (c cVar : f315295a) {
            uVar = cVar.a(uVar, coroutineContext);
        }
        return uVar;
    }
}
