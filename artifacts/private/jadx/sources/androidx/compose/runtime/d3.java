package androidx.compose.runtime;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n1#1,131:1\n65#1:132\n*S KotlinDebug\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n105#1:132\n*E\n"})
public final class d3 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class a<R> implements Function1<Long, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Long, R> f35581a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Long, ? extends R> function1) {
            this.f35581a = function1;
        }

        public final R c(long j10) {
            return this.f35581a.invoke(Long.valueOf(j10 / 1000000));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Long l10) {
            return c(l10.longValue());
        }
    }

    @NotNull
    public static final c3 a(@NotNull CoroutineContext coroutineContext) {
        c3 c3Var = (c3) coroutineContext.get(c3.C);
        if (c3Var != null) {
            return c3Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    @c2
    public static /* synthetic */ void b(CoroutineContext coroutineContext) {
    }

    @Nullable
    public static final <R> Object c(@NotNull c3 c3Var, @NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        return c3Var.y(new a(function1), dVar);
    }

    @Nullable
    public static final <R> Object d(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        return a(dVar.getContext()).y(new a(function1), dVar);
    }

    private static final <R> Object e(c3 c3Var, Function1<? super Long, ? extends R> function1, kotlin.coroutines.d<? super R> dVar) {
        a aVar = new a(function1);
        kotlin.jvm.internal.h0.e(0);
        Object objY = c3Var.y(aVar, dVar);
        kotlin.jvm.internal.h0.e(1);
        return objY;
    }

    @Nullable
    public static final <R> Object f(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        return a(dVar.getContext()).y(function1, dVar);
    }
}
