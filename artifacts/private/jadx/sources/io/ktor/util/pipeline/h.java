package io.ktor.util.pipeline;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class h {
    @Nullable
    public static final <TSubject, TContext> Object a(@NotNull pj.n<? super e<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interceptor, @NotNull e<TSubject, TContext> context, @NotNull TSubject subject, @NotNull kotlin.coroutines.d<? super Unit> continuation) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return ((pj.n) r1.q(interceptor, 3)).invoke(context, subject, continuation);
    }
}
