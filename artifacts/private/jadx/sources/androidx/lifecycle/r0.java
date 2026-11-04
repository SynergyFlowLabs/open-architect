package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 {
    public static final void a(@Nullable o0 o0Var, @NotNull c0.b current, @NotNull c0.b next) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(next, "next");
        if (current == c0.b.INITIALIZED && next == c0.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + c0.b.CREATED + "' to be moved to '" + next + "' in component " + o0Var).toString());
        }
        c0.b bVar = c0.b.DESTROYED;
        if (current != bVar || current == next) {
            return;
        }
        throw new IllegalStateException(("State is '" + bVar + "' and cannot be moved to `" + next + "` in component " + o0Var).toString());
    }
}
