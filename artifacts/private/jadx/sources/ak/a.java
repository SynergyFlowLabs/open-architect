package ak;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.internal.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    @f
    private static final ReentrantLock a() {
        return new ReentrantLock();
    }

    @f
    private static final <T> T b(Object lock, Function0<? extends T> block) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (lock) {
            try {
                tInvoke = block.invoke();
                h0.d(1);
            } finally {
                h0.d(1);
                h0.c(1);
            }
        }
        return tInvoke;
    }

    @f
    private static final <T> T c(ReentrantLock reentrantLock, Function0<? extends T> block) {
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
