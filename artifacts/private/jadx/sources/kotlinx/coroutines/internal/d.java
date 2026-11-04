package kotlinx.coroutines.internal;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private static final Method f315041a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f315041a = method;
    }

    @NotNull
    public static final <E> Set<E> a(int i10) {
        return Collections.newSetFromMap(new IdentityHashMap(i10));
    }

    public static final boolean b(@NotNull Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = f315041a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final <T> T c(@NotNull ReentrantLock reentrantLock, @NotNull Function0<? extends T> function0) {
        reentrantLock.lock();
        try {
            T tInvoke = function0.invoke();
            kotlin.jvm.internal.h0.d(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }
}
