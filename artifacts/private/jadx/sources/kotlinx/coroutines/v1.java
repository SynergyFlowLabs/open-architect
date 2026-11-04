package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class v1 {
    @NotNull
    public static final s1 a() {
        return new h(Thread.currentThread());
    }

    @f1
    @k2
    @kotlin.a1
    public static final boolean b(@NotNull Thread thread) {
        if (thread instanceof kotlinx.coroutines.scheduling.a.c) {
            return ((kotlinx.coroutines.scheduling.a.c) thread).m();
        }
        int i10 = 2 | 0;
        return false;
    }

    public static final void c(@NotNull Function0<Unit> function0) {
        function0.invoke();
    }

    @k2
    public static final long d() {
        s1 s1VarA = t3.f315643a.a();
        if (s1VarA != null) {
            return s1VarA.s1();
        }
        return Long.MAX_VALUE;
    }

    @f1
    @k2
    @kotlin.a1
    public static final long e() {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof kotlinx.coroutines.scheduling.a.c) {
            return ((kotlinx.coroutines.scheduling.a.c) threadCurrentThread).q();
        }
        throw new IllegalStateException("Expected CoroutineScheduler.Worker, but got " + threadCurrentThread);
    }
}
