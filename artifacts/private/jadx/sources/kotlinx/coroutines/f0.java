package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nCompletionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,51:1\n1#2:52\n57#3,2:53\n57#3,2:55\n*S KotlinDebug\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n*L\n11#1:53,2\n16#1:55,2\n*E\n"})
public final class f0 {
    @NotNull
    public static final <T> Object a(@Nullable Object obj, @NotNull kotlin.coroutines.d<? super T> dVar) {
        if (obj instanceof c0) {
            Result.a aVar = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(((c0) obj).f313551a));
        }
        Result.a aVar2 = Result.Companion;
        return Result.m785constructorimpl(obj);
    }

    @Nullable
    public static final <T> Object b(@NotNull Object obj) {
        Throwable thD = Result.d(obj);
        return thD == null ? obj : new c0(thD, false, 2, null);
    }

    @Nullable
    public static final <T> Object c(@NotNull Object obj, @NotNull n<?> nVar) {
        Throwable thD = Result.d(obj);
        return thD == null ? obj : new c0(thD, false, 2, null);
    }
}
