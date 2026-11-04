package kotlin.coroutines.jvm.internal;

import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.3")
    @NotNull
    public static final <T> kotlin.coroutines.d<T> a(@NotNull kotlin.coroutines.d<? super T> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return completion;
    }

    @e1(version = "1.3")
    public static final void b(@NotNull kotlin.coroutines.d<?> frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    @e1(version = "1.3")
    public static final void c(@NotNull kotlin.coroutines.d<?> frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }
}
