package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nDefaultExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultExecutor.kt\nkotlinx/coroutines/DefaultExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
public final class y0 extends t1 implements Runnable {

    @Nullable
    private static volatile Thread _thread = null;
    private static volatile int debugStatus = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final y0 f315719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f315720i = "kotlinx.coroutines.DefaultExecutor";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f315721j = 1000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f315722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f315723l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f315724m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f315725n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f315726o = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f315727s = 4;

    static {
        Long l10;
        y0 y0Var = new y0();
        f315719h = y0Var;
        s1.g1(y0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f315722k = timeUnit.toNanos(l10.longValue());
    }

    private y0() {
    }

    private final synchronized void O2() {
        try {
            if (W2()) {
                debugStatus = 3;
                y2();
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized Thread Q2() {
        Thread thread;
        try {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, f315720i);
                _thread = thread;
                thread.setContextClassLoader(f315719h.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return thread;
    }

    private static /* synthetic */ void T2() {
    }

    private final boolean U2() {
        return debugStatus == 4;
    }

    private final boolean W2() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean Y2() {
        try {
            if (W2()) {
                return false;
            }
            debugStatus = 1;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void Z2() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.u1
    @NotNull
    protected Thread E1() {
        Thread thread = _thread;
        return thread == null ? Q2() : thread;
    }

    @Override // kotlinx.coroutines.u1
    protected void J1(long j10, @NotNull t1.c cVar) {
        Z2();
    }

    public final synchronized void R2() {
        try {
            debugStatus = 0;
            Q2();
            while (debugStatus == 0) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                wait();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean X2() {
        return _thread != null;
    }

    public final synchronized void a3(long j10) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() + j10;
            if (!W2()) {
                debugStatus = 2;
            }
            while (debugStatus != 3 && _thread != null) {
                Thread thread = _thread;
                if (thread != null) {
                    b bVar = c.f313549a;
                    if (bVar != null) {
                        bVar.g(thread);
                    } else {
                        LockSupport.unpark(thread);
                    }
                }
                if (jCurrentTimeMillis - System.currentTimeMillis() <= 0) {
                    break;
                }
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                wait(j10);
            }
            debugStatus = 0;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.t1, kotlinx.coroutines.c1
    @NotNull
    public o1 d(long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return D2(j10, runnable);
    }

    @Override // kotlinx.coroutines.t1
    public void d2(@NotNull Runnable runnable) {
        if (U2()) {
            Z2();
        }
        super.d2(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        t3.f315643a.d(this);
        b bVar = c.f313549a;
        if (bVar != null) {
            bVar.d();
        }
        try {
            if (!Y2()) {
                _thread = null;
                O2();
                b bVar2 = c.f313549a;
                if (bVar2 != null) {
                    bVar2.h();
                }
                if (h1()) {
                    return;
                }
                E1();
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jS1 = s1();
                if (jS1 == Long.MAX_VALUE) {
                    b bVar3 = c.f313549a;
                    long jB = bVar3 != null ? bVar3.b() : System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f315722k + jB;
                    }
                    long j11 = j10 - jB;
                    if (j11 <= 0) {
                        _thread = null;
                        O2();
                        b bVar4 = c.f313549a;
                        if (bVar4 != null) {
                            bVar4.h();
                        }
                        if (h1()) {
                            return;
                        }
                        E1();
                        return;
                    }
                    jS1 = kotlin.ranges.r.C(jS1, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jS1 > 0) {
                    if (W2()) {
                        _thread = null;
                        O2();
                        b bVar5 = c.f313549a;
                        if (bVar5 != null) {
                            bVar5.h();
                        }
                        if (h1()) {
                            return;
                        }
                        E1();
                        return;
                    }
                    b bVar6 = c.f313549a;
                    if (bVar6 != null) {
                        bVar6.c(this, jS1);
                    } else {
                        LockSupport.parkNanos(this, jS1);
                    }
                }
            }
        } catch (Throwable th2) {
            _thread = null;
            O2();
            b bVar7 = c.f313549a;
            if (bVar7 != null) {
                bVar7.h();
            }
            if (!h1()) {
                E1();
            }
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.t1, kotlinx.coroutines.s1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public String toString() {
        return "DefaultExecutor";
    }
}
