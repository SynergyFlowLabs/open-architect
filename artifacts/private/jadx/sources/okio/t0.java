package okio;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,262:1\n1#2:263\n302#3,26:264\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe\n*L\n222#1:264,26\n*E\n"})
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f335089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f335090b = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f335091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f335092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f335093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private z0 f335094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f335095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Condition f335096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final z0 f335097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final b1 f335098j;

    @SourceDebugExtension({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Pipe.kt\nokio/Pipe\n+ 4 Timeout.kt\nokio/Timeout\n*L\n1#1,262:1\n1#2:263\n222#3:264\n223#3:291\n222#3:292\n223#3:319\n222#3:320\n223#3:347\n302#4,26:265\n302#4,26:293\n302#4,26:321\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n*L\n87#1:264\n87#1:291\n106#1:292\n106#1:319\n124#1:320\n124#1:347\n87#1:265,26\n106#1:293,26\n124#1:321,26\n*E\n"})
    public static final class a implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final e1 f335099a = new e1();

        a() {
        }

        @Override // okio.z0
        public void Ga(@NotNull l source, long j10) {
            z0 z0VarI;
            Intrinsics.checkNotNullParameter(source, "source");
            ReentrantLock reentrantLockJ = t0.this.j();
            t0 t0Var = t0.this;
            reentrantLockJ.lock();
            try {
                if (t0Var.l()) {
                    throw new IllegalStateException(MetricTracker.Action.CLOSED);
                }
                if (t0Var.g()) {
                    throw new IOException("canceled");
                }
                while (true) {
                    if (j10 <= 0) {
                        z0VarI = null;
                        break;
                    }
                    z0VarI = t0Var.i();
                    if (z0VarI != null) {
                        break;
                    }
                    if (t0Var.m()) {
                        throw new IOException("source is closed");
                    }
                    long jK = t0Var.k() - t0Var.f().size();
                    if (jK == 0) {
                        this.f335099a.a(t0Var.h());
                        if (t0Var.g()) {
                            throw new IOException("canceled");
                        }
                    } else {
                        long jMin = Math.min(jK, j10);
                        t0Var.f().Ga(source, jMin);
                        j10 -= jMin;
                        t0Var.h().signalAll();
                    }
                }
                Unit unit = Unit.f312394a;
                reentrantLockJ.unlock();
                if (z0VarI != null) {
                    t0 t0Var2 = t0.this;
                    e1 e1VarTimeout = z0VarI.timeout();
                    e1 e1VarTimeout2 = t0Var2.r().timeout();
                    long jL = e1VarTimeout.l();
                    long jA = e1.f334886e.a(e1VarTimeout2.l(), e1VarTimeout.l());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    e1VarTimeout.k(jA, timeUnit);
                    if (!e1VarTimeout.h()) {
                        if (e1VarTimeout2.h()) {
                            e1VarTimeout.g(e1VarTimeout2.f());
                        }
                        try {
                            z0VarI.Ga(source, j10);
                            e1VarTimeout.k(jL, timeUnit);
                            if (e1VarTimeout2.h()) {
                                e1VarTimeout.c();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            e1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                            if (e1VarTimeout2.h()) {
                                e1VarTimeout.c();
                            }
                            throw th2;
                        }
                    }
                    long jF = e1VarTimeout.f();
                    if (e1VarTimeout2.h()) {
                        e1VarTimeout.g(Math.min(e1VarTimeout.f(), e1VarTimeout2.f()));
                    }
                    try {
                        z0VarI.Ga(source, j10);
                        e1VarTimeout.k(jL, timeUnit);
                        if (e1VarTimeout2.h()) {
                            e1VarTimeout.g(jF);
                        }
                    } catch (Throwable th3) {
                        e1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                        if (e1VarTimeout2.h()) {
                            e1VarTimeout.g(jF);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                reentrantLockJ.unlock();
                throw th4;
            }
        }

        @Override // okio.z0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock reentrantLockJ = t0.this.j();
            t0 t0Var = t0.this;
            reentrantLockJ.lock();
            try {
                if (t0Var.l()) {
                    reentrantLockJ.unlock();
                    return;
                }
                z0 z0VarI = t0Var.i();
                if (z0VarI == null) {
                    if (t0Var.m() && t0Var.f().size() > 0) {
                        throw new IOException("source is closed");
                    }
                    t0Var.p(true);
                    t0Var.h().signalAll();
                    z0VarI = null;
                }
                Unit unit = Unit.f312394a;
                reentrantLockJ.unlock();
                if (z0VarI != null) {
                    t0 t0Var2 = t0.this;
                    e1 e1VarTimeout = z0VarI.timeout();
                    e1 e1VarTimeout2 = t0Var2.r().timeout();
                    long jL = e1VarTimeout.l();
                    long jA = e1.f334886e.a(e1VarTimeout2.l(), e1VarTimeout.l());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    e1VarTimeout.k(jA, timeUnit);
                    if (e1VarTimeout.h()) {
                        long jF = e1VarTimeout.f();
                        if (e1VarTimeout2.h()) {
                            e1VarTimeout.g(Math.min(e1VarTimeout.f(), e1VarTimeout2.f()));
                        }
                        try {
                            z0VarI.close();
                            e1VarTimeout.k(jL, timeUnit);
                            boolean zH = e1VarTimeout2.h();
                            if (zH) {
                                return;
                            } else {
                                return;
                            }
                        } finally {
                            e1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                            if (e1VarTimeout2.h()) {
                                e1VarTimeout.g(jF);
                            }
                        }
                    }
                    if (e1VarTimeout2.h()) {
                        e1VarTimeout.g(e1VarTimeout2.f());
                    }
                    try {
                        z0VarI.close();
                        e1VarTimeout.k(jL, timeUnit);
                        if (e1VarTimeout2.h()) {
                            e1VarTimeout.c();
                        }
                    } catch (Throwable th2) {
                        e1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                        if (e1VarTimeout2.h()) {
                            e1VarTimeout.c();
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                reentrantLockJ.unlock();
                throw th3;
            }
        }

        @Override // okio.z0, java.io.Flushable
        public void flush() {
            ReentrantLock reentrantLockJ = t0.this.j();
            t0 t0Var = t0.this;
            reentrantLockJ.lock();
            try {
                if (t0Var.l()) {
                    throw new IllegalStateException(MetricTracker.Action.CLOSED);
                }
                if (t0Var.g()) {
                    throw new IOException("canceled");
                }
                z0 z0VarI = t0Var.i();
                if (z0VarI == null) {
                    if (t0Var.m() && t0Var.f().size() > 0) {
                        throw new IOException("source is closed");
                    }
                    z0VarI = null;
                }
                Unit unit = Unit.f312394a;
                reentrantLockJ.unlock();
                if (z0VarI != null) {
                    t0 t0Var2 = t0.this;
                    e1 e1VarTimeout = z0VarI.timeout();
                    e1 e1VarTimeout2 = t0Var2.r().timeout();
                    long jL = e1VarTimeout.l();
                    long jA = e1.f334886e.a(e1VarTimeout2.l(), e1VarTimeout.l());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    e1VarTimeout.k(jA, timeUnit);
                    if (!e1VarTimeout.h()) {
                        if (e1VarTimeout2.h()) {
                            e1VarTimeout.g(e1VarTimeout2.f());
                        }
                        try {
                            z0VarI.flush();
                            e1VarTimeout.k(jL, timeUnit);
                            if (e1VarTimeout2.h()) {
                                return;
                            } else {
                                return;
                            }
                        } finally {
                            e1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                            if (e1VarTimeout2.h()) {
                                e1VarTimeout.c();
                            }
                        }
                    }
                    long jF = e1VarTimeout.f();
                    if (e1VarTimeout2.h()) {
                        e1VarTimeout.g(Math.min(e1VarTimeout.f(), e1VarTimeout2.f()));
                    }
                    try {
                        z0VarI.flush();
                        e1VarTimeout.k(jL, timeUnit);
                        boolean zH = e1VarTimeout2.h();
                    } finally {
                        e1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                        if (e1VarTimeout2.h()) {
                            e1VarTimeout.g(jF);
                        }
                    }
                }
            } catch (Throwable th2) {
                reentrantLockJ.unlock();
                throw th2;
            }
        }

        @Override // okio.z0
        @NotNull
        public e1 timeout() {
            return this.f335099a;
        }
    }

    @SourceDebugExtension({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$source$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n1#2:263\n*E\n"})
    public static final class b implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final e1 f335101a = new e1();

        b() {
        }

        @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock reentrantLockJ = t0.this.j();
            t0 t0Var = t0.this;
            reentrantLockJ.lock();
            try {
                t0Var.q(true);
                t0Var.h().signalAll();
                Unit unit = Unit.f312394a;
            } finally {
                reentrantLockJ.unlock();
            }
        }

        @Override // okio.b1
        public long read(@NotNull l sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            ReentrantLock reentrantLockJ = t0.this.j();
            t0 t0Var = t0.this;
            reentrantLockJ.lock();
            try {
                if (t0Var.m()) {
                    throw new IllegalStateException(MetricTracker.Action.CLOSED);
                }
                if (t0Var.g()) {
                    throw new IOException("canceled");
                }
                while (t0Var.f().size() == 0) {
                    if (t0Var.l()) {
                        reentrantLockJ.unlock();
                        return -1L;
                    }
                    this.f335101a.a(t0Var.h());
                    if (t0Var.g()) {
                        throw new IOException("canceled");
                    }
                }
                long j11 = t0Var.f().read(sink, j10);
                t0Var.h().signalAll();
                reentrantLockJ.unlock();
                return j11;
            } catch (Throwable th2) {
                reentrantLockJ.unlock();
                throw th2;
            }
        }

        @Override // okio.b1
        @NotNull
        public e1 timeout() {
            return this.f335101a;
        }
    }

    public t0(long j10) {
        this.f335089a = j10;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f335095g = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        this.f335096h = conditionNewCondition;
        if (j10 >= 1) {
            this.f335097i = new a();
            this.f335098j = new b();
        } else {
            throw new IllegalArgumentException(("maxBufferSize < 1: " + j10).toString());
        }
    }

    private final void e(z0 z0Var, Function1<? super z0, Unit> function1) {
        e1 e1VarTimeout = z0Var.timeout();
        e1 e1VarTimeout2 = r().timeout();
        long jL = e1VarTimeout.l();
        long jA = e1.f334886e.a(e1VarTimeout2.l(), e1VarTimeout.l());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        e1VarTimeout.k(jA, timeUnit);
        if (e1VarTimeout.h()) {
            long jF = e1VarTimeout.f();
            if (e1VarTimeout2.h()) {
                e1VarTimeout.g(Math.min(e1VarTimeout.f(), e1VarTimeout2.f()));
            }
            try {
                function1.invoke(z0Var);
                Unit unit = Unit.f312394a;
                kotlin.jvm.internal.h0.d(1);
                e1VarTimeout.k(jL, timeUnit);
                return;
            } finally {
                kotlin.jvm.internal.h0.d(1);
                e1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                if (e1VarTimeout2.h()) {
                    e1VarTimeout.g(jF);
                }
                kotlin.jvm.internal.h0.c(1);
            }
        }
        if (e1VarTimeout2.h()) {
            e1VarTimeout.g(e1VarTimeout2.f());
        }
        try {
            function1.invoke(z0Var);
            Unit unit2 = Unit.f312394a;
            kotlin.jvm.internal.h0.d(1);
            e1VarTimeout.k(jL, timeUnit);
            if (e1VarTimeout2.h()) {
                e1VarTimeout.c();
            }
        } finally {
            kotlin.jvm.internal.h0.d(1);
            e1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
            if (e1VarTimeout2.h()) {
                e1VarTimeout.c();
            }
            kotlin.jvm.internal.h0.c(1);
        }
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "sink", imports = {}))
    @oj.i(name = "-deprecated_sink")
    @NotNull
    public final z0 a() {
        return this.f335097i;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "source", imports = {}))
    @oj.i(name = "-deprecated_source")
    @NotNull
    public final b1 b() {
        return this.f335098j;
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f335095g;
        reentrantLock.lock();
        try {
            this.f335091c = true;
            this.f335090b.c();
            this.f335096h.signalAll();
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void d(@NotNull z0 sink) throws IOException {
        l lVar;
        boolean z10;
        Intrinsics.checkNotNullParameter(sink, "sink");
        while (true) {
            ReentrantLock reentrantLock = this.f335095g;
            reentrantLock.lock();
            try {
                if (this.f335094f != null) {
                    throw new IllegalStateException("sink already folded");
                }
                if (this.f335091c) {
                    this.f335094f = sink;
                    throw new IOException("canceled");
                }
                boolean z11 = this.f335092d;
                l lVar2 = null;
                if (this.f335090b.y1()) {
                    this.f335093e = true;
                    this.f335094f = sink;
                    lVar = null;
                    z10 = true;
                } else {
                    lVar = new l();
                    l lVar3 = this.f335090b;
                    lVar.Ga(lVar3, lVar3.size());
                    this.f335096h.signalAll();
                    z10 = false;
                }
                Unit unit = Unit.f312394a;
                reentrantLock.unlock();
                if (z10) {
                    if (z11) {
                        sink.close();
                        return;
                    }
                    return;
                }
                if (lVar == null) {
                    try {
                        Intrinsics.throwUninitializedPropertyAccessException("sinkBuffer");
                    } catch (Throwable th2) {
                        ReentrantLock reentrantLock2 = this.f335095g;
                        reentrantLock2.lock();
                        try {
                            this.f335093e = true;
                            this.f335096h.signalAll();
                            Unit unit2 = Unit.f312394a;
                            throw th2;
                        } finally {
                            reentrantLock2.unlock();
                        }
                    }
                } else {
                    lVar2 = lVar;
                }
                sink.Ga(lVar2, lVar.size());
                sink.flush();
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        }
    }

    @NotNull
    public final l f() {
        return this.f335090b;
    }

    public final boolean g() {
        return this.f335091c;
    }

    @NotNull
    public final Condition h() {
        return this.f335096h;
    }

    @Nullable
    public final z0 i() {
        return this.f335094f;
    }

    @NotNull
    public final ReentrantLock j() {
        return this.f335095g;
    }

    public final long k() {
        return this.f335089a;
    }

    public final boolean l() {
        return this.f335092d;
    }

    public final boolean m() {
        return this.f335093e;
    }

    public final void n(boolean z10) {
        this.f335091c = z10;
    }

    public final void o(@Nullable z0 z0Var) {
        this.f335094f = z0Var;
    }

    public final void p(boolean z10) {
        this.f335092d = z10;
    }

    public final void q(boolean z10) {
        this.f335093e = z10;
    }

    @oj.i(name = "sink")
    @NotNull
    public final z0 r() {
        return this.f335097i;
    }

    @oj.i(name = "source")
    @NotNull
    public final b1 s() {
        return this.f335098j;
    }
}
