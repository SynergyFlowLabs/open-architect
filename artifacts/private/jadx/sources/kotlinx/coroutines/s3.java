package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nThreadContextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n263#1:286\n1#2:287\n*S KotlinDebug\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n*L\n284#1:286\n*E\n"})
public final class s3 {
    @NotNull
    public static final <T> r3<T> a(@NotNull ThreadLocal<T> threadLocal, T t10) {
        return new kotlinx.coroutines.internal.j1(t10, threadLocal);
    }

    public static /* synthetic */ r3 b(ThreadLocal threadLocal, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = threadLocal.get();
        }
        return a(threadLocal, obj);
    }

    @Nullable
    public static final Object c(@NotNull ThreadLocal<?> threadLocal, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (dVar.getContext().get(new kotlinx.coroutines.internal.k1(threadLocal)) != null) {
            return Unit.f312394a;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + dVar.getContext()).toString());
    }

    private static final Object d(ThreadLocal<?> threadLocal, kotlin.coroutines.d<? super Unit> dVar) {
        kotlin.jvm.internal.h0.e(3);
        throw null;
    }

    @Nullable
    public static final Object e(@NotNull ThreadLocal<?> threadLocal, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlin.coroutines.jvm.internal.b.a(dVar.getContext().get(new kotlinx.coroutines.internal.k1(threadLocal)) != null);
    }

    private static final Object f(ThreadLocal<?> threadLocal, kotlin.coroutines.d<? super Boolean> dVar) {
        kotlin.jvm.internal.h0.e(3);
        int i10 = 2 << 0;
        throw null;
    }
}
