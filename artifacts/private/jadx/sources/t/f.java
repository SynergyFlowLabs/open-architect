package t;

import java.util.NoSuchElementException;
import kotlin.a1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final void a(boolean z10, @NotNull Function0<String> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (z10) {
            return;
        }
        d(lazyMessage.invoke());
    }

    public static final void b(boolean z10, @NotNull Function0<String> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (z10) {
            return;
        }
        c(lazyMessage.invoke());
    }

    public static final void c(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void d(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalStateException(message);
    }

    public static final void e(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void f(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new NoSuchElementException(message);
    }

    @a1
    @NotNull
    public static final Void g(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new NoSuchElementException(message);
    }
}
