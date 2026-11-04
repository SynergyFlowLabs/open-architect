package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f334873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f334874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f334875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f334876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f334877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Condition f334878f;

    public static final class a extends x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d1 f334879b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z0 z0Var, d1 d1Var) {
            super(z0Var);
            this.f334879b = d1Var;
        }

        @Override // okio.x, okio.z0
        public void Ga(@NotNull l source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            while (j10 > 0) {
                try {
                    long jL = this.f334879b.l(j10);
                    super.Ga(source, jL);
                    j10 -= jL;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        }
    }

    public static final class b extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d1 f334880a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b1 b1Var, d1 d1Var) {
            super(b1Var);
            this.f334880a = d1Var;
        }

        @Override // okio.y, okio.b1
        public long read(@NotNull l sink, long j10) throws InterruptedIOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return super.read(sink, this.f334880a.l(j10));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
        }
    }

    public d1(long j10) {
        this.f334873a = j10;
        this.f334875c = PlaybackStateCompat.f9665p2;
        this.f334876d = PlaybackStateCompat.f9655k3;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f334877e = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        this.f334878f = conditionNewCondition;
    }

    public static /* synthetic */ void e(d1 d1Var, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = d1Var.f334875c;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            j12 = d1Var.f334876d;
        }
        d1Var.d(j10, j13, j12);
    }

    private final long f(long j10) {
        return (j10 * 1000000000) / this.f334874b;
    }

    private final long i(long j10) {
        return (j10 * this.f334874b) / 1000000000;
    }

    public final long a(long j10, long j11) {
        if (this.f334874b == 0) {
            return j11;
        }
        long jMax = Math.max(this.f334873a - j10, 0L);
        long jI = this.f334876d - i(jMax);
        if (jI >= j11) {
            this.f334873a = j10 + jMax + f(j11);
            return j11;
        }
        long j12 = this.f334875c;
        if (jI >= j12) {
            this.f334873a = j10 + f(this.f334876d);
            return jI;
        }
        long jMin = Math.min(j12, j11);
        long jF = jMax + f(jMin - this.f334876d);
        if (jF != 0) {
            return -jF;
        }
        this.f334873a = j10 + f(this.f334876d);
        return jMin;
    }

    @oj.j
    public final void b(long j10) {
        e(this, j10, 0L, 0L, 6, null);
    }

    @oj.j
    public final void c(long j10, long j11) {
        e(this, j10, j11, 0L, 4, null);
    }

    @oj.j
    public final void d(long j10, long j11, long j12) {
        ReentrantLock reentrantLock = this.f334877e;
        reentrantLock.lock();
        try {
            if (j10 < 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (j11 <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (j12 < j11) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this.f334874b = j10;
            this.f334875c = j11;
            this.f334876d = j12;
            this.f334878f.signalAll();
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    public final Condition g() {
        return this.f334878f;
    }

    @NotNull
    public final ReentrantLock h() {
        return this.f334877e;
    }

    @NotNull
    public final z0 j(@NotNull z0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new a(sink, this);
    }

    @NotNull
    public final b1 k(@NotNull b1 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new b(source, this);
    }

    public final long l(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ReentrantLock reentrantLock = this.f334877e;
        reentrantLock.lock();
        while (true) {
            try {
                long jA = a(System.nanoTime(), j10);
                if (jA >= 0) {
                    reentrantLock.unlock();
                    return jA;
                }
                this.f334878f.awaitNanos(-jA);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public d1() {
        this(System.nanoTime());
    }
}
