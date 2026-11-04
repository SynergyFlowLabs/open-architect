package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import io.sentry.k4;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,382:1\n1#2:383\n*E\n"})
public class j extends e1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final a f335015j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final ReentrantLock f335016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final Condition f335017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f335018m = 65536;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f335019n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f335020o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f335021p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f335022q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f335023r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f335024s = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private static j f335025t;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f335026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private j f335027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f335028i;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(j jVar, long j10, boolean z10) {
            if (j.f335025t == null) {
                j.f335025t = new j();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                jVar.f335028i = Math.min(j10, jVar.f() - jNanoTime) + jNanoTime;
            } else if (j10 != 0) {
                jVar.f335028i = j10 + jNanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                jVar.f335028i = jVar.f();
            }
            long jD = jVar.D(jNanoTime);
            j jVar2 = j.f335025t;
            Intrinsics.checkNotNull(jVar2);
            while (jVar2.f335027h != null) {
                j jVar3 = jVar2.f335027h;
                Intrinsics.checkNotNull(jVar3);
                if (jD < jVar3.D(jNanoTime)) {
                    break;
                }
                jVar2 = jVar2.f335027h;
                Intrinsics.checkNotNull(jVar2);
            }
            jVar.f335027h = jVar2.f335027h;
            jVar2.f335027h = jVar;
            if (jVar2 == j.f335025t) {
                d().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(j jVar) {
            for (j jVar2 = j.f335025t; jVar2 != null; jVar2 = jVar2.f335027h) {
                if (jVar2.f335027h == jVar) {
                    jVar2.f335027h = jVar.f335027h;
                    jVar.f335027h = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        @Nullable
        public final j c() throws InterruptedException {
            j jVar = j.f335025t;
            Intrinsics.checkNotNull(jVar);
            j jVar2 = jVar.f335027h;
            if (jVar2 == null) {
                long jNanoTime = System.nanoTime();
                d().await(j.f335019n, TimeUnit.MILLISECONDS);
                j jVar3 = j.f335025t;
                Intrinsics.checkNotNull(jVar3);
                if (jVar3.f335027h != null || System.nanoTime() - jNanoTime < j.f335020o) {
                    return null;
                }
                return j.f335025t;
            }
            long jD = jVar2.D(System.nanoTime());
            if (jD > 0) {
                d().await(jD, TimeUnit.NANOSECONDS);
                return null;
            }
            j jVar4 = j.f335025t;
            Intrinsics.checkNotNull(jVar4);
            jVar4.f335027h = jVar2.f335027h;
            jVar2.f335027h = null;
            jVar2.f335026g = 2;
            return jVar2;
        }

        @NotNull
        public final Condition d() {
            return j.f335017l;
        }

        @NotNull
        public final ReentrantLock e() {
            return j.f335016k;
        }

        private a() {
        }
    }

    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    ReentrantLock reentrantLockE = j.f335015j.e();
                    reentrantLockE.lock();
                    try {
                        j jVarC = j.f335015j.c();
                        if (jVarC == j.f335025t) {
                            a unused = j.f335015j;
                            j.f335025t = null;
                            reentrantLockE.unlock();
                            return;
                        } else {
                            Unit unit = Unit.f312394a;
                            reentrantLockE.unlock();
                            if (jVarC != null) {
                                jVarC.G();
                            }
                        }
                    } catch (Throwable th2) {
                        reentrantLockE.unlock();
                        throw th2;
                    }
                } catch (InterruptedException unused2) {
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,382:1\n171#2,11:383\n171#2,11:394\n171#2,11:405\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n*L\n127#1:383,11\n133#1:394,11\n137#1:405,11\n*E\n"})
    public static final class c implements z0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z0 f335030b;

        c(z0 z0Var) {
            this.f335030b = z0Var;
        }

        @Override // okio.z0
        public void Ga(@NotNull l source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            i.e(source.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                w0 w0Var = source.f335034a;
                Intrinsics.checkNotNull(w0Var);
                while (j11 < PlaybackStateCompat.f9653i3) {
                    j11 += (long) (w0Var.f335130c - w0Var.f335129b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        w0Var = w0Var.f335133f;
                        Intrinsics.checkNotNull(w0Var);
                    }
                }
                j jVar = j.this;
                z0 z0Var = this.f335030b;
                jVar.A();
                try {
                    try {
                        z0Var.Ga(source, j11);
                        Unit unit = Unit.f312394a;
                        if (jVar.B()) {
                            throw jVar.u(null);
                        }
                        j10 -= j11;
                    } catch (IOException e10) {
                        IOException iOExceptionU = e10;
                        if (jVar.B()) {
                            iOExceptionU = jVar.u(iOExceptionU);
                        }
                        throw iOExceptionU;
                    }
                } catch (Throwable th2) {
                    jVar.B();
                    throw th2;
                }
            }
        }

        @Override // okio.z0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j timeout() {
            return j.this;
        }

        @Override // okio.z0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            j jVar = j.this;
            z0 z0Var = this.f335030b;
            jVar.A();
            try {
                try {
                    z0Var.close();
                    Unit unit = Unit.f312394a;
                    if (jVar.B()) {
                        throw jVar.u(null);
                    }
                } catch (IOException e10) {
                    e = e10;
                    if (jVar.B()) {
                        e = jVar.u(e);
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                jVar.B();
                throw th2;
            }
        }

        @Override // okio.z0, java.io.Flushable
        public void flush() throws IOException {
            j jVar = j.this;
            z0 z0Var = this.f335030b;
            jVar.A();
            try {
                try {
                    z0Var.flush();
                    Unit unit = Unit.f312394a;
                    if (jVar.B()) {
                        throw jVar.u(null);
                    }
                } catch (IOException e10) {
                    if (!jVar.B()) {
                        throw e10;
                    }
                    throw jVar.u(e10);
                }
            } catch (Throwable th2) {
                jVar.B();
                throw th2;
            }
        }

        @NotNull
        public String toString() {
            return "AsyncTimeout.sink(" + this.f335030b + ')';
        }
    }

    @SourceDebugExtension({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,382:1\n171#2,11:383\n171#2,11:394\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n*L\n153#1:383,11\n157#1:394,11\n*E\n"})
    public static final class d implements b1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b1 f335032b;

        d(b1 b1Var) {
            this.f335032b = b1Var;
        }

        @Override // okio.b1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j timeout() {
            return j.this;
        }

        @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            j jVar = j.this;
            b1 b1Var = this.f335032b;
            jVar.A();
            try {
                try {
                    b1Var.close();
                    Unit unit = Unit.f312394a;
                    if (jVar.B()) {
                        throw jVar.u(null);
                    }
                } catch (IOException e10) {
                    if (!jVar.B()) {
                        throw e10;
                    }
                    throw jVar.u(e10);
                }
            } catch (Throwable th2) {
                jVar.B();
                throw th2;
            }
        }

        @Override // okio.b1
        public long read(@NotNull l sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            j jVar = j.this;
            b1 b1Var = this.f335032b;
            jVar.A();
            try {
                try {
                    long j11 = b1Var.read(sink, j10);
                    if (jVar.B()) {
                        throw jVar.u(null);
                    }
                    return j11;
                } catch (IOException e10) {
                    if (jVar.B()) {
                        throw jVar.u(e10);
                    }
                    throw e10;
                }
            } catch (Throwable th2) {
                jVar.B();
                throw th2;
            }
        }

        @NotNull
        public String toString() {
            return "AsyncTimeout.source(" + this.f335032b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f335016k = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        f335017l = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f335019n = millis;
        f335020o = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long D(long j10) {
        return this.f335028i - j10;
    }

    public final void A() {
        long jL = l();
        boolean zH = h();
        if (jL != 0 || zH) {
            ReentrantLock reentrantLock = f335016k;
            reentrantLock.lock();
            try {
                if (this.f335026g != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f335026g = 1;
                f335015j.f(this, jL, zH);
                Unit unit = Unit.f312394a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public final boolean B() {
        ReentrantLock reentrantLock = f335016k;
        reentrantLock.lock();
        try {
            int i10 = this.f335026g;
            this.f335026g = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f335015j.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    protected IOException C(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(k4.f305718l3);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @NotNull
    public final z0 E(@NotNull z0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new c(sink);
    }

    @NotNull
    public final b1 F(@NotNull b1 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new d(source);
    }

    protected void G() {
    }

    public final <T> T H(@NotNull Function0<? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(block, "block");
        A();
        try {
            try {
                T tInvoke = block.invoke();
                kotlin.jvm.internal.h0.d(1);
                if (B()) {
                    throw u(null);
                }
                kotlin.jvm.internal.h0.c(1);
                return tInvoke;
            } catch (IOException e10) {
                if (B()) {
                    throw u(e10);
                }
                throw e10;
            }
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            B();
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    @Override // okio.e1
    public void b() {
        super.b();
        ReentrantLock reentrantLock = f335016k;
        reentrantLock.lock();
        try {
            if (this.f335026g == 1) {
                f335015j.g(this);
                this.f335026g = 3;
            }
            Unit unit = Unit.f312394a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @kotlin.a1
    @NotNull
    public final IOException u(@Nullable IOException iOException) {
        return C(iOException);
    }
}
