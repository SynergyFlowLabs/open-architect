package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private static b f313549a;

    @kotlin.internal.f
    private static final long c() {
        b bVar = f313549a;
        return bVar != null ? bVar.a() : System.currentTimeMillis();
    }

    public static final void d(@Nullable b bVar) {
        f313549a = bVar;
    }

    @kotlin.internal.f
    private static final long e() {
        b bVar = f313549a;
        return bVar != null ? bVar.b() : System.nanoTime();
    }

    @kotlin.internal.f
    private static final void f(Object obj, long j10) {
        b bVar = f313549a;
        if (bVar != null) {
            bVar.c(obj, j10);
        } else {
            LockSupport.parkNanos(obj, j10);
        }
    }

    @kotlin.internal.f
    private static final void g() {
        b bVar = f313549a;
        if (bVar != null) {
            bVar.d();
        }
    }

    @kotlin.internal.f
    private static final void h() {
        b bVar = f313549a;
        if (bVar != null) {
            bVar.e();
        }
    }

    @kotlin.internal.f
    private static final void i() {
        b bVar = f313549a;
        if (bVar != null) {
            bVar.f();
        }
    }

    @kotlin.internal.f
    private static final void j(Thread thread) {
        b bVar = f313549a;
        if (bVar != null) {
            bVar.g(thread);
        } else {
            LockSupport.unpark(thread);
        }
    }

    @kotlin.internal.f
    private static final void k() {
        b bVar = f313549a;
        if (bVar != null) {
            bVar.h();
        }
    }

    @kotlin.internal.f
    private static final Runnable l(Runnable runnable) {
        Runnable runnableI;
        b bVar = f313549a;
        return (bVar == null || (runnableI = bVar.i(runnable)) == null) ? runnable : runnableI;
    }
}
