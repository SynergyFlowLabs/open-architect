package okio;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,444:1\n33#2:445\n33#2:447\n33#2:448\n33#2:449\n33#2:450\n33#2:451\n33#2:452\n33#2:453\n33#2:457\n33#2:459\n1#3:446\n62#4:454\n62#4:455\n62#4:456\n51#5:458\n86#6:460\n86#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"})
public abstract class t implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f335079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f335080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f335081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f335082d = i1.b();

    @SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n*L\n410#1:446\n*E\n"})
    private static final class a implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final t f335083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f335084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f335085c;

        public a(@NotNull t fileHandle, long j10) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f335083a = fileHandle;
            this.f335084b = j10;
        }

        @Override // okio.z0
        public void Ga(@NotNull l source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f335085c) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            this.f335083a.j0(this.f335084b, source, j10);
            this.f335084b += j10;
        }

        public final boolean a() {
            return this.f335085c;
        }

        @NotNull
        public final t b() {
            return this.f335083a;
        }

        public final long c() {
            return this.f335084b;
        }

        @Override // okio.z0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f335085c) {
                return;
            }
            this.f335085c = true;
            ReentrantLock reentrantLockG = this.f335083a.g();
            reentrantLockG.lock();
            try {
                this.f335083a.f335081c--;
                if (this.f335083a.f335081c == 0 && this.f335083a.f335080b) {
                    Unit unit = Unit.f312394a;
                    reentrantLockG.unlock();
                    this.f335083a.m();
                    return;
                }
                reentrantLockG.unlock();
            } catch (Throwable th2) {
                reentrantLockG.unlock();
                throw th2;
            }
        }

        public final void d(boolean z10) {
            this.f335085c = z10;
        }

        public final void e(long j10) {
            this.f335084b = j10;
        }

        @Override // okio.z0, java.io.Flushable
        public void flush() throws IOException {
            if (this.f335085c) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            this.f335083a.o();
        }

        @Override // okio.z0
        @NotNull
        public e1 timeout() {
            return e1.f334887f;
        }
    }

    @SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n*L\n436#1:446\n*E\n"})
    private static final class b implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final t f335086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f335087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f335088c;

        public b(@NotNull t fileHandle, long j10) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f335086a = fileHandle;
            this.f335087b = j10;
        }

        public final boolean a() {
            return this.f335088c;
        }

        @NotNull
        public final t b() {
            return this.f335086a;
        }

        public final long c() {
            return this.f335087b;
        }

        @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f335088c) {
                return;
            }
            this.f335088c = true;
            ReentrantLock reentrantLockG = this.f335086a.g();
            reentrantLockG.lock();
            try {
                this.f335086a.f335081c--;
                if (this.f335086a.f335081c == 0 && this.f335086a.f335080b) {
                    Unit unit = Unit.f312394a;
                    reentrantLockG.unlock();
                    this.f335086a.m();
                    return;
                }
                reentrantLockG.unlock();
            } catch (Throwable th2) {
                reentrantLockG.unlock();
                throw th2;
            }
        }

        public final void d(boolean z10) {
            this.f335088c = z10;
        }

        public final void e(long j10) {
            this.f335087b = j10;
        }

        @Override // okio.b1
        public long read(@NotNull l sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f335088c) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            long jH = this.f335086a.H(this.f335087b, sink, j10);
            if (jH != -1) {
                this.f335087b += jH;
            }
            return jH;
        }

        @Override // okio.b1
        @NotNull
        public e1 timeout() {
            return e1.f334887f;
        }
    }

    public t(boolean z10) {
        this.f335079a = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long H(long j10, l lVar, long j11) throws IOException {
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        long j12 = j11 + j10;
        long j13 = j10;
        while (j13 < j12) {
            w0 w0VarT0 = lVar.T0(1);
            byte[] bArr = w0VarT0.f335128a;
            int i10 = w0VarT0.f335130c;
            int iQ = q(j13, bArr, i10, (int) Math.min(j12 - j13, 8192 - i10));
            if (iQ == -1) {
                if (w0VarT0.f335129b == w0VarT0.f335130c) {
                    lVar.f335034a = w0VarT0.b();
                    x0.d(w0VarT0);
                }
                if (j10 != j13) {
                    break;
                }
                return -1L;
            }
            w0VarT0.f335130c += iQ;
            long j14 = iQ;
            j13 += j14;
            lVar.B0(lVar.size() + j14);
        }
        return j13 - j10;
    }

    public static /* synthetic */ z0 X(t tVar, long j10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return tVar.T(j10);
    }

    public static /* synthetic */ b1 d0(t tVar, long j10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return tVar.Y(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(long j10, l lVar, long j11) throws IOException {
        i.e(lVar.size(), 0L, j11);
        long j12 = j10 + j11;
        long j13 = j10;
        while (j13 < j12) {
            w0 w0Var = lVar.f335034a;
            Intrinsics.checkNotNull(w0Var);
            int iMin = (int) Math.min(j12 - j13, w0Var.f335130c - w0Var.f335129b);
            t tVar = this;
            tVar.x(j13, w0Var.f335128a, w0Var.f335129b, iMin);
            w0Var.f335129b += iMin;
            long j14 = iMin;
            j13 += j14;
            lVar.B0(lVar.size() - j14);
            if (w0Var.f335129b == w0Var.f335130c) {
                lVar.f335034a = w0Var.b();
                x0.d(w0Var);
            }
            this = tVar;
        }
    }

    public final long E(long j10, @NotNull l sink, long j11) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        ReentrantLock reentrantLock = this.f335082d;
        reentrantLock.lock();
        try {
            if (this.f335080b) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
            return H(j10, sink, j11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void I(@NotNull z0 sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(sink instanceof u0)) {
            if (!(sink instanceof a) || ((a) sink).b() != this) {
                throw new IllegalArgumentException("sink was not created by this FileHandle");
            }
            a aVar = (a) sink;
            if (aVar.a()) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            aVar.e(j10);
            return;
        }
        u0 u0Var = (u0) sink;
        z0 z0Var = u0Var.f335111a;
        if (!(z0Var instanceof a) || ((a) z0Var).b() != this) {
            throw new IllegalArgumentException("sink was not created by this FileHandle");
        }
        a aVar2 = (a) z0Var;
        if (aVar2.a()) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f1();
        aVar2.e(j10);
    }

    public final void N(@NotNull b1 source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(source instanceof v0)) {
            if (!(source instanceof b) || ((b) source).b() != this) {
                throw new IllegalArgumentException("source was not created by this FileHandle");
            }
            b bVar = (b) source;
            if (bVar.a()) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            bVar.e(j10);
            return;
        }
        v0 v0Var = (v0) source;
        b1 b1Var = v0Var.f335119a;
        if (!(b1Var instanceof b) || ((b) b1Var).b() != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle");
        }
        b bVar2 = (b) b1Var;
        if (bVar2.a()) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        long size = v0Var.f335120b.size();
        long jC = j10 - (bVar2.c() - size);
        if (0 <= jC && jC < size) {
            v0Var.skip(jC);
        } else {
            v0Var.f335120b.c();
            bVar2.e(j10);
        }
    }

    public final void R(long j10) throws IOException {
        if (!this.f335079a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f335082d;
        reentrantLock.lock();
        try {
            if (this.f335080b) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
            r(j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    public final z0 T(long j10) throws IOException {
        if (!this.f335079a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f335082d;
        reentrantLock.lock();
        try {
            if (this.f335080b) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            this.f335081c++;
            reentrantLock.unlock();
            return new a(this, j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    public final b1 Y(long j10) throws IOException {
        ReentrantLock reentrantLock = this.f335082d;
        reentrantLock.lock();
        try {
            if (this.f335080b) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            this.f335081c++;
            reentrantLock.unlock();
            return new b(this, j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.f335082d;
        reentrantLock.lock();
        try {
            if (this.f335080b) {
                reentrantLock.unlock();
                return;
            }
            this.f335080b = true;
            if (this.f335081c != 0) {
                reentrantLock.unlock();
                return;
            }
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
            m();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    public final z0 f() throws IOException {
        return T(size());
    }

    public final void f0(long j10, @NotNull l source, long j11) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f335079a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f335082d;
        reentrantLock.lock();
        try {
            if (this.f335080b) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
            j0(j10, source, j11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void flush() throws IOException {
        if (!this.f335079a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f335082d;
        reentrantLock.lock();
        try {
            if (this.f335080b) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
            o();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    public final ReentrantLock g() {
        return this.f335082d;
    }

    public final void g0(long j10, @NotNull byte[] array, int i10, int i11) throws IOException {
        Intrinsics.checkNotNullParameter(array, "array");
        if (!this.f335079a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f335082d;
        reentrantLock.lock();
        try {
            if (this.f335080b) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
            x(j10, array, i10, i11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean h() {
        return this.f335079a;
    }

    public final long j(@NotNull z0 sink) throws IOException {
        long size;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (sink instanceof u0) {
            u0 u0Var = (u0) sink;
            size = u0Var.f335112b.size();
            sink = u0Var.f335111a;
        } else {
            size = 0;
        }
        if (!(sink instanceof a) || ((a) sink).b() != this) {
            throw new IllegalArgumentException("sink was not created by this FileHandle");
        }
        a aVar = (a) sink;
        if (aVar.a()) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        return aVar.c() + size;
    }

    public final long l(@NotNull b1 source) throws IOException {
        long size;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof v0) {
            v0 v0Var = (v0) source;
            size = v0Var.f335120b.size();
            source = v0Var.f335119a;
        } else {
            size = 0;
        }
        if (!(source instanceof b) || ((b) source).b() != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle");
        }
        b bVar = (b) source;
        if (bVar.a()) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        return bVar.c() - size;
    }

    protected abstract void m() throws IOException;

    protected abstract void o() throws IOException;

    protected abstract int q(long j10, @NotNull byte[] bArr, int i10, int i11) throws IOException;

    protected abstract void r(long j10) throws IOException;

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.f335082d;
        reentrantLock.lock();
        try {
            if (this.f335080b) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
            return t();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    protected abstract long t() throws IOException;

    protected abstract void x(long j10, @NotNull byte[] bArr, int i10, int i11) throws IOException;

    public final int y(long j10, @NotNull byte[] array, int i10, int i11) throws IOException {
        Intrinsics.checkNotNullParameter(array, "array");
        ReentrantLock reentrantLock = this.f335082d;
        reentrantLock.lock();
        try {
            if (this.f335080b) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
            return q(j10, array, i10, i11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
