package okio;

import io.sentry.k4;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nokio/Timeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,358:1\n1#2:359\n*E\n"})
public class e1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f334886e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final e1 f334887f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f334888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f334889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f334890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private volatile Object f334891d;

    public static final class a extends e1 {
        a() {
        }

        @Override // okio.e1
        @NotNull
        public e1 g(long j10) {
            return this;
        }

        @Override // okio.e1
        public void j() {
        }

        @Override // okio.e1
        @NotNull
        public e1 k(long j10, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(long j10, long j11) {
            return (j10 != 0 && (j11 == 0 || j10 < j11)) ? j10 : j11;
        }

        @NotNull
        public final e1 b(@NotNull e1 e1Var, long j10, @NotNull kotlin.time.f unit) {
            Intrinsics.checkNotNullParameter(e1Var, "<this>");
            Intrinsics.checkNotNullParameter(unit, "unit");
            return e1Var.k(j10, kotlin.time.g.e(unit));
        }

        @NotNull
        public final e1 c(@NotNull e1 timeout, long j10) {
            Intrinsics.checkNotNullParameter(timeout, "$this$timeout");
            return timeout.k(kotlin.time.c.h0(j10), TimeUnit.NANOSECONDS);
        }

        private b() {
        }
    }

    public void a(@NotNull Condition condition) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(condition, "condition");
        try {
            boolean zH = h();
            long jL = l();
            if (!zH && jL == 0) {
                condition.await();
                return;
            }
            if (zH && jL != 0) {
                jL = Math.min(jL, f() - System.nanoTime());
            } else if (zH) {
                jL = f() - System.nanoTime();
            }
            if (jL <= 0) {
                throw new InterruptedIOException(k4.f305718l3);
            }
            Object obj = this.f334891d;
            if (condition.awaitNanos(jL) <= 0 && this.f334891d == obj) {
                throw new InterruptedIOException(k4.f305718l3);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void b() {
        this.f334891d = new Object();
    }

    @NotNull
    public e1 c() {
        this.f334888a = false;
        return this;
    }

    @NotNull
    public e1 d() {
        this.f334890c = 0L;
        return this;
    }

    @NotNull
    public final e1 e(long j10, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 > 0) {
            return g(System.nanoTime() + unit.toNanos(j10));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j10).toString());
    }

    public long f() {
        if (this.f334888a) {
            return this.f334889b;
        }
        throw new IllegalStateException("No deadline");
    }

    @NotNull
    public e1 g(long j10) {
        this.f334888a = true;
        this.f334889b = j10;
        return this;
    }

    public boolean h() {
        return this.f334888a;
    }

    public final <T> T i(@NotNull e1 other, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(block, "block");
        long jL = l();
        long jA = f334886e.a(other.l(), l());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        k(jA, timeUnit);
        if (h()) {
            long jF = f();
            if (other.h()) {
                g(Math.min(f(), other.f()));
            }
            try {
                T tInvoke = block.invoke();
                kotlin.jvm.internal.h0.d(1);
                k(jL, timeUnit);
                boolean zH = other.h();
                return tInvoke;
            } finally {
                kotlin.jvm.internal.h0.d(1);
                k(jL, TimeUnit.NANOSECONDS);
                if (other.h()) {
                    g(jF);
                }
                kotlin.jvm.internal.h0.c(1);
            }
        }
        if (other.h()) {
            g(other.f());
        }
        try {
            T tInvoke2 = block.invoke();
            kotlin.jvm.internal.h0.d(1);
            k(jL, timeUnit);
            if (other.h()) {
                c();
            }
            kotlin.jvm.internal.h0.c(1);
            return tInvoke2;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            k(jL, TimeUnit.NANOSECONDS);
            if (other.h()) {
                c();
            }
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    public void j() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f334888a && this.f334889b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @NotNull
    public e1 k(long j10, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 >= 0) {
            this.f334890c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long l() {
        return this.f334890c;
    }

    public void m(@NotNull Object monitor) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        try {
            boolean zH = h();
            long jL = l();
            if (!zH && jL == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime = System.nanoTime();
            if (zH && jL != 0) {
                jL = Math.min(jL, f() - jNanoTime);
            } else if (zH) {
                jL = f() - jNanoTime;
            }
            if (jL <= 0) {
                throw new InterruptedIOException(k4.f305718l3);
            }
            Object obj = this.f334891d;
            long j10 = jL / 1000000;
            monitor.wait(j10, (int) (jL - (1000000 * j10)));
            if (System.nanoTime() - jNanoTime >= jL && this.f334891d == obj) {
                throw new InterruptedIOException(k4.f305718l3);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
