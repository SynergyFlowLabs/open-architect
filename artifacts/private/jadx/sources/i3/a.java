package i3;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final <T> T a(@NotNull ReentrantLock reentrantLock, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(reentrantLock, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            reentrantLock.lock();
            T tInvoke = block.invoke();
            h0.d(1);
            return tInvoke;
        } finally {
            h0.d(1);
            reentrantLock.unlock();
            h0.c(1);
        }
    }
}
