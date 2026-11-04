package io.ktor.util.pipeline;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nStackTraceRecover.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecover.kt\nio/ktor/util/pipeline/StackTraceRecoverKt\n+ 2 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,23:1\n57#2,2:24\n*S KotlinDebug\n*F\n+ 1 StackTraceRecover.kt\nio/ktor/util/pipeline/StackTraceRecoverKt\n*L\n17#1:24,2\n*E\n"})
public final class m {
    @NotNull
    public static final Throwable a(@NotNull Throwable exception, @NotNull kotlin.coroutines.d<?> continuation) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        try {
            exception = l.a(exception, exception.getCause());
        } catch (Throwable unused) {
        }
        return exception;
    }
}
