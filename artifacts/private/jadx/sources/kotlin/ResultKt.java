package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
public final class ResultKt {
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T> R a(Object obj, Function1<? super T, ? extends R> onSuccess, Function1<? super Throwable, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Throwable thD = Result.d(obj);
        return thD == null ? onSuccess.invoke(obj) : onFailure.invoke(thD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T extends R> R b(Object obj, R r10) {
        return Result.m786isFailureimpl(obj) ? r10 : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T extends R> R c(Object obj, Function1<? super Throwable, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Throwable thD = Result.d(obj);
        return thD == null ? obj : onFailure.invoke(thD);
    }

    @a1
    @e1(version = "1.3")
    @NotNull
    public static final Object createFailure(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new Result.b(exception);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <T> T d(Object obj) {
        m(obj);
        return obj;
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T> Object e(Object obj, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (!Result.h(obj)) {
            return Result.m785constructorimpl(obj);
        }
        Result.a aVar = Result.Companion;
        return Result.m785constructorimpl(transform.invoke(obj));
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T> Object f(Object obj, Function1<? super T, ? extends R> transform) {
        Object objM785constructorimpl;
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (!Result.h(obj)) {
            return Result.m785constructorimpl(obj);
        }
        try {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(transform.invoke(obj));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(createFailure(th2));
        }
        return objM785constructorimpl;
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object g(Object obj, Function1<? super Throwable, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Throwable thD = Result.d(obj);
        if (thD != null) {
            action.invoke(thD);
        }
        return obj;
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object h(Object obj, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (Result.h(obj)) {
            action.invoke(obj);
        }
        return obj;
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T extends R> Object i(Object obj, Function1<? super Throwable, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Throwable thD = Result.d(obj);
        if (thD == null) {
            return obj;
        }
        Result.a aVar = Result.Companion;
        return Result.m785constructorimpl(transform.invoke(thD));
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T extends R> Object j(Object obj, Function1<? super Throwable, ? extends R> transform) {
        Object objM785constructorimpl;
        Intrinsics.checkNotNullParameter(transform, "transform");
        Throwable thD = Result.d(obj);
        if (thD == null) {
            return obj;
        }
        try {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(transform.invoke(thD));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(createFailure(th2));
        }
        return objM785constructorimpl;
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <T, R> Object k(T t10, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.a aVar = Result.Companion;
            return Result.m785constructorimpl(block.invoke(t10));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m785constructorimpl(createFailure(th2));
        }
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <R> Object l(Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.a aVar = Result.Companion;
            return Result.m785constructorimpl(block.invoke());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m785constructorimpl(createFailure(th2));
        }
    }

    @a1
    @e1(version = "1.3")
    public static final void m(@NotNull Object obj) {
        if (obj instanceof Result.b) {
            throw ((Result.b) obj).f312393a;
        }
    }
}
