package io.ktor.util.pipeline;

import io.ktor.utils.io.r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@r0
public abstract class e<TSubject, TContext> implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final TContext f296773a;

    public e(@NotNull TContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f296773a = context;
    }

    @Nullable
    public abstract Object c(@NotNull TSubject tsubject, @NotNull kotlin.coroutines.d<? super TSubject> dVar);

    public abstract void e();

    @NotNull
    public final TContext f() {
        return this.f296773a;
    }

    @NotNull
    public abstract TSubject i();

    @Nullable
    public abstract Object j(@NotNull kotlin.coroutines.d<? super TSubject> dVar);

    @Nullable
    public abstract Object k(@NotNull TSubject tsubject, @NotNull kotlin.coroutines.d<? super TSubject> dVar);

    public abstract void l(@NotNull TSubject tsubject);
}
