package io.ktor.util.pipeline;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f {
    @NotNull
    public static final <TSubject, TContext> e<TSubject, TContext> a(@NotNull TContext context, @NotNull List<? extends pj.n<? super e<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> interceptors, @NotNull TSubject subject, @NotNull CoroutineContext coroutineContext, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        if (!g.a() && !z10) {
            return new p(subject, context, interceptors);
        }
        return new a(context, interceptors, subject, coroutineContext);
    }

    public static /* synthetic */ e b(Object obj, List list, Object obj2, CoroutineContext coroutineContext, boolean z10, int i10, Object obj3) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return a(obj, list, obj2, coroutineContext, z10);
    }
}
