package androidx.media2.exoplayer.external.extractor;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f53932e = 262144;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C0506a f53933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final g f53934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    protected d f53935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f53936d;

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.extractor.a$a, reason: collision with other inner class name */
    public static class C0506a implements q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e f53937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f53938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f53939f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f53940g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f53941h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f53942i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f53943j;

        public C0506a(e seekTimestampConverter, long durationUs, long floorTimePosition, long ceilingTimePosition, long floorBytePosition, long ceilingBytePosition, long approxBytesPerFrame) {
            this.f53937d = seekTimestampConverter;
            this.f53938e = durationUs;
            this.f53939f = floorTimePosition;
            this.f53940g = ceilingTimePosition;
            this.f53941h = floorBytePosition;
            this.f53942i = ceilingBytePosition;
            this.f53943j = approxBytesPerFrame;
        }

        @Override // androidx.media2.exoplayer.external.extractor.q
        public long Q1() {
            return this.f53938e;
        }

        @Override // androidx.media2.exoplayer.external.extractor.q
        public q.a R1(long timeUs) {
            return new q.a(new r(timeUs, d.h(this.f53937d.a(timeUs), this.f53939f, this.f53940g, this.f53941h, this.f53942i, this.f53943j)));
        }

        @Override // androidx.media2.exoplayer.external.extractor.q
        public boolean S1() {
            return true;
        }

        public long h(long timeUs) {
            return this.f53937d.a(timeUs);
        }
    }

    public static final class b implements e {
        @Override // androidx.media2.exoplayer.external.extractor.a.e
        public long a(long timeUs) {
            return timeUs;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f53944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f53945b = 0;

        public c(ByteBuffer outputByteBuffer) {
            this.f53944a = outputByteBuffer;
        }
    }

    protected static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f53946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f53947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f53948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f53949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f53950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f53951f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f53952g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f53953h;

        protected d(long seekTimeUs, long targetTimePosition, long floorTimePosition, long ceilingTimePosition, long floorBytePosition, long ceilingBytePosition, long approxBytesPerFrame) {
            this.f53946a = seekTimeUs;
            this.f53947b = targetTimePosition;
            this.f53949d = floorTimePosition;
            this.f53950e = ceilingTimePosition;
            this.f53951f = floorBytePosition;
            this.f53952g = ceilingBytePosition;
            this.f53948c = approxBytesPerFrame;
            this.f53953h = h(targetTimePosition, floorTimePosition, ceilingTimePosition, floorBytePosition, ceilingBytePosition, approxBytesPerFrame);
        }

        protected static long h(long targetTimePosition, long floorTimePosition, long ceilingTimePosition, long floorBytePosition, long ceilingBytePosition, long approxBytesPerFrame) {
            if (floorBytePosition + 1 >= ceilingBytePosition || floorTimePosition + 1 >= ceilingTimePosition) {
                return floorBytePosition;
            }
            long j10 = (long) ((targetTimePosition - floorTimePosition) * ((ceilingBytePosition - floorBytePosition) / (ceilingTimePosition - floorTimePosition)));
            return q0.s(((j10 + floorBytePosition) - approxBytesPerFrame) - (j10 / 20), floorBytePosition, ceilingBytePosition - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f53952g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f53951f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f53953h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f53946a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f53947b;
        }

        private void n() {
            this.f53953h = h(this.f53947b, this.f53949d, this.f53950e, this.f53951f, this.f53952g, this.f53948c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long ceilingTimePosition, long ceilingBytePosition) {
            this.f53950e = ceilingTimePosition;
            this.f53952g = ceilingBytePosition;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long floorTimePosition, long floorBytePosition) {
            this.f53949d = floorTimePosition;
            this.f53951f = floorBytePosition;
            n();
        }
    }

    protected interface e {
        long a(long timeUs);
    }

    public static final class f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f53954d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f53955e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f53956f = -2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f53957g = -3;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final f f53958h = new f(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f53959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f53960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f53961c;

        /* JADX INFO: renamed from: androidx.media2.exoplayer.external.extractor.a$f$a, reason: collision with other inner class name */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @interface InterfaceC0507a {
        }

        private f(int type, long timestampToUpdate, long bytePositionToUpdate) {
            this.f53959a = type;
            this.f53960b = timestampToUpdate;
            this.f53961c = bytePositionToUpdate;
        }

        public static f d(long newCeilingTimestamp, long newCeilingBytePosition) {
            return new f(-1, newCeilingTimestamp, newCeilingBytePosition);
        }

        public static f e(long resultBytePosition) {
            return new f(0, -9223372036854775807L, resultBytePosition);
        }

        public static f f(long newFloorTimestamp, long newCeilingBytePosition) {
            return new f(-2, newFloorTimestamp, newCeilingBytePosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface g {
        void a();

        f b(j input, long targetTimestamp, c outputFrameHolder) throws InterruptedException, IOException;
    }

    protected a(e seekTimestampConverter, g timestampSeeker, long durationUs, long floorTimePosition, long ceilingTimePosition, long floorBytePosition, long ceilingBytePosition, long approxBytesPerFrame, int minimumSearchRange) {
        this.f53934b = timestampSeeker;
        this.f53936d = minimumSearchRange;
        this.f53933a = new C0506a(seekTimestampConverter, durationUs, floorTimePosition, ceilingTimePosition, floorBytePosition, ceilingBytePosition, approxBytesPerFrame);
    }

    protected d a(long timeUs) {
        return new d(timeUs, this.f53933a.h(timeUs), this.f53933a.f53939f, this.f53933a.f53940g, this.f53933a.f53941h, this.f53933a.f53942i, this.f53933a.f53943j);
    }

    public final q b() {
        return this.f53933a;
    }

    public int c(j input, p seekPositionHolder, c outputFrameHolder) throws InterruptedException, IOException {
        g gVar = (g) androidx.media2.exoplayer.external.util.a.g(this.f53934b);
        while (true) {
            d dVar = (d) androidx.media2.exoplayer.external.util.a.g(this.f53935c);
            long j10 = dVar.j();
            long jI = dVar.i();
            long jK = dVar.k();
            if (jI - j10 <= this.f53936d) {
                e(false, j10);
                return g(input, j10, seekPositionHolder);
            }
            if (!i(input, jK)) {
                return g(input, jK, seekPositionHolder);
            }
            input.l();
            f fVarB = gVar.b(input, dVar.m(), outputFrameHolder);
            int i10 = fVarB.f53959a;
            if (i10 == -3) {
                e(false, jK);
                return g(input, jK, seekPositionHolder);
            }
            if (i10 == -2) {
                dVar.p(fVarB.f53960b, fVarB.f53961c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    e(true, fVarB.f53961c);
                    i(input, fVarB.f53961c);
                    return g(input, fVarB.f53961c, seekPositionHolder);
                }
                dVar.o(fVarB.f53960b, fVarB.f53961c);
            }
        }
    }

    public final boolean d() {
        return this.f53935c != null;
    }

    protected final void e(boolean foundTargetFrame, long resultPosition) {
        this.f53935c = null;
        this.f53934b.a();
        f(foundTargetFrame, resultPosition);
    }

    protected void f(boolean foundTargetFrame, long resultPosition) {
    }

    protected final int g(j input, long position, p seekPositionHolder) {
        if (position == input.getPosition()) {
            return 0;
        }
        seekPositionHolder.f54695a = position;
        return 1;
    }

    public final void h(long timeUs) {
        d dVar = this.f53935c;
        if (dVar == null || dVar.l() != timeUs) {
            this.f53935c = a(timeUs);
        }
    }

    protected final boolean i(j input, long position) throws InterruptedException, IOException {
        long position2 = position - input.getPosition();
        if (position2 < 0 || position2 > 262144) {
            return false;
        }
        input.o((int) position2);
        return true;
    }
}
