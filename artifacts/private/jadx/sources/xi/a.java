package xi;

import io.ktor.utils.io.o0;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    @o0
    public static /* synthetic */ void a() {
    }

    @o0
    public static /* synthetic */ void b() {
    }

    @o0
    @NotNull
    public static final ReentrantLock c() {
        return new ReentrantLock();
    }

    @o0
    public static final <T> T d(@NotNull Object lock, @NotNull Function0<? extends T> block) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (lock) {
            try {
                tInvoke = block.invoke();
                h0.d(1);
            } catch (Throwable th2) {
                h0.d(1);
                h0.c(1);
                throw th2;
            }
        }
        h0.c(1);
        return tInvoke;
    }

    @o0
    public static final <T> T e(@NotNull ReentrantLock reentrantLock, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(reentrantLock, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        reentrantLock.lock();
        try {
            T tInvoke = block.invoke();
            h0.d(1);
            reentrantLock.unlock();
            h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            h0.d(1);
            reentrantLock.unlock();
            h0.c(1);
            throw th2;
        }
    }
}
