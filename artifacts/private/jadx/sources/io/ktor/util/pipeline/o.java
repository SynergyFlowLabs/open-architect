package io.ktor.util.pipeline;

import io.ktor.util.k1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements kotlin.coroutines.jvm.internal.e, kotlin.coroutines.d<?> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o f296787a = new o();

    private o() {
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @Nullable
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        return null;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public CoroutineContext getContext() {
        return kotlin.coroutines.h.f312451a;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @NotNull
    public StackTraceElement getStackTraceElement() {
        kotlin.reflect.d dVarD = j1.d(n.class);
        n nVar = n.f296786a;
        return k1.c(dVarD, "failedToCaptureStackFrame", "StackWalkingFailed.kt", 8);
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@NotNull Object obj) {
        n.f296786a.a();
    }
}
