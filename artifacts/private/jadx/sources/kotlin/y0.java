package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
class y0 extends x0 {
    @kotlin.internal.f
    private static final void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @kotlin.internal.f
    private static final void d(boolean z10, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (!z10) {
            throw new IllegalStateException(lazyMessage.invoke().toString());
        }
    }

    @kotlin.internal.f
    private static final <T> T e(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @kotlin.internal.f
    private static final <T> T f(T t10, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(lazyMessage.invoke().toString());
    }

    @kotlin.internal.f
    private static final Void g(Object message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalStateException(message.toString());
    }

    @kotlin.internal.f
    private static final void h(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @kotlin.internal.f
    private static final void i(boolean z10, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (!z10) {
            throw new IllegalArgumentException(lazyMessage.invoke().toString());
        }
    }

    @kotlin.internal.f
    private static final <T> T j(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @kotlin.internal.f
    private static final <T> T k(T t10, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException(lazyMessage.invoke().toString());
    }
}
