package androidx.media2.exoplayer.external.source;

import androidx.media2.exoplayer.external.Format;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public class u0 implements androidx.media2.exoplayer.external.extractor.s {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f56453p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f56454q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f56455r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f56456s = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f56457t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f56458u = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.b f56459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0 f56461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t0.a f56462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f56463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f56464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f56465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f56466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Format f56467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f56468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Format f56469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f56470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f56471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f56472n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c f56473o;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f56474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f56475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f56476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        public androidx.media2.exoplayer.external.upstream.a f56477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        public a f56478e;

        public a(long startPosition, int allocationLength) {
            this.f56474a = startPosition;
            this.f56475b = startPosition + ((long) allocationLength);
        }

        public a a() {
            this.f56477d = null;
            a aVar = this.f56478e;
            this.f56478e = null;
            return aVar;
        }

        public void b(androidx.media2.exoplayer.external.upstream.a allocation, a next) {
            this.f56477d = allocation;
            this.f56478e = next;
            this.f56476c = true;
        }

        public int c(long absolutePosition) {
            return ((int) (absolutePosition - this.f56474a)) + this.f56477d.f57244b;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface b {
    }

    public interface c {
        void g(Format format);
    }

    public u0(androidx.media2.exoplayer.external.upstream.b allocator) {
        this.f56459a = allocator;
        int iD = allocator.d();
        this.f56460b = iD;
        this.f56461c = new t0();
        this.f56462d = new t0.a();
        this.f56463e = new androidx.media2.exoplayer.external.util.x(32);
        a aVar = new a(0L, iD);
        this.f56464f = aVar;
        this.f56465g = aVar;
        this.f56466h = aVar;
    }

    private void B(long absolutePosition, ByteBuffer target, int length) {
        e(absolutePosition);
        while (length > 0) {
            int iMin = Math.min(length, (int) (this.f56465g.f56475b - absolutePosition));
            a aVar = this.f56465g;
            target.put(aVar.f56477d.f57243a, aVar.c(absolutePosition), iMin);
            length -= iMin;
            absolutePosition += (long) iMin;
            a aVar2 = this.f56465g;
            if (absolutePosition == aVar2.f56475b) {
                this.f56465g = aVar2.f56478e;
            }
        }
    }

    private void C(long absolutePosition, byte[] target, int length) {
        e(absolutePosition);
        int i10 = length;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (this.f56465g.f56475b - absolutePosition));
            a aVar = this.f56465g;
            System.arraycopy(aVar.f56477d.f57243a, aVar.c(absolutePosition), target, length - i10, iMin);
            i10 -= iMin;
            absolutePosition += (long) iMin;
            a aVar2 = this.f56465g;
            if (absolutePosition == aVar2.f56475b) {
                this.f56465g = aVar2.f56478e;
            }
        }
    }

    private void D(androidx.media2.exoplayer.external.decoder.e buffer, t0.a extrasHolder) {
        long j10 = extrasHolder.f56442b;
        int iJ = 1;
        this.f56463e.M(1);
        C(j10, this.f56463e.f57720a, 1);
        long j11 = j10 + 1;
        byte b10 = this.f56463e.f57720a[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & 127;
        androidx.media2.exoplayer.external.decoder.b bVar = buffer.f53788b;
        if (bVar.f53764a == null) {
            bVar.f53764a = new byte[16];
        }
        C(j11, bVar.f53764a, i10);
        long j12 = j11 + ((long) i10);
        if (z10) {
            this.f56463e.M(2);
            C(j12, this.f56463e.f57720a, 2);
            j12 += 2;
            iJ = this.f56463e.J();
        }
        int i11 = iJ;
        androidx.media2.exoplayer.external.decoder.b bVar2 = buffer.f53788b;
        int[] iArr = bVar2.f53767d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = bVar2.f53768e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            this.f56463e.M(i12);
            C(j12, this.f56463e.f57720a, i12);
            j12 += (long) i12;
            this.f56463e.Q(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = this.f56463e.J();
                iArr4[i13] = this.f56463e.H();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = extrasHolder.f56441a - ((int) (j12 - extrasHolder.f56442b));
        }
        androidx.media2.exoplayer.external.extractor.s.a aVar = extrasHolder.f56443c;
        androidx.media2.exoplayer.external.decoder.b bVar3 = buffer.f53788b;
        bVar3.c(i11, iArr2, iArr4, aVar.f54704b, bVar3.f53764a, aVar.f54703a, aVar.f54705c, aVar.f54706d);
        long j13 = extrasHolder.f56442b;
        int i14 = (int) (j12 - j13);
        extrasHolder.f56442b = j13 + ((long) i14);
        extrasHolder.f56441a -= i14;
    }

    private void E(androidx.media2.exoplayer.external.decoder.e buffer, t0.a extrasHolder) {
        if (buffer.E()) {
            D(buffer, extrasHolder);
        }
        if (!buffer.r()) {
            buffer.z(extrasHolder.f56441a);
            B(extrasHolder.f56442b, buffer.f53789c, extrasHolder.f56441a);
            return;
        }
        this.f56463e.M(4);
        C(extrasHolder.f56442b, this.f56463e.f57720a, 4);
        int iH = this.f56463e.H();
        extrasHolder.f56442b += 4;
        extrasHolder.f56441a -= 4;
        buffer.z(iH);
        B(extrasHolder.f56442b, buffer.f53789c, iH);
        extrasHolder.f56442b += (long) iH;
        int i10 = extrasHolder.f56441a - iH;
        extrasHolder.f56441a = i10;
        buffer.L(i10);
        B(extrasHolder.f56442b, buffer.f53791e, extrasHolder.f56441a);
    }

    private void e(long absolutePosition) {
        while (true) {
            a aVar = this.f56465g;
            if (absolutePosition < aVar.f56475b) {
                return;
            } else {
                this.f56465g = aVar.f56478e;
            }
        }
    }

    private void h(a aVar) {
        if (aVar.f56476c) {
            a aVar2 = this.f56466h;
            boolean z10 = aVar2.f56476c;
            int i10 = (z10 ? 1 : 0) + (((int) (aVar2.f56474a - aVar.f56474a)) / this.f56460b);
            androidx.media2.exoplayer.external.upstream.a[] aVarArr = new androidx.media2.exoplayer.external.upstream.a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = aVar.f56477d;
                aVar = aVar.a();
            }
            this.f56459a.f(aVarArr);
        }
    }

    private void i(long absolutePosition) {
        a aVar;
        if (absolutePosition == -1) {
            return;
        }
        while (true) {
            aVar = this.f56464f;
            if (absolutePosition < aVar.f56475b) {
                break;
            }
            this.f56459a.e(aVar.f56477d);
            this.f56464f = this.f56464f.a();
        }
        if (this.f56465g.f56474a < aVar.f56474a) {
            this.f56465g = aVar;
        }
    }

    private static Format n(Format format, long sampleOffsetUs) {
        if (format == null) {
            return null;
        }
        if (sampleOffsetUs == 0) {
            return format;
        }
        long j10 = format.f53109m;
        return j10 != Long.MAX_VALUE ? format.m(j10 + sampleOffsetUs) : format;
    }

    private void y(int length) {
        long j10 = this.f56471m + ((long) length);
        this.f56471m = j10;
        a aVar = this.f56466h;
        if (j10 == aVar.f56475b) {
            this.f56466h = aVar.f56478e;
        }
    }

    private int z(int length) {
        a aVar = this.f56466h;
        if (!aVar.f56476c) {
            aVar.b(this.f56459a.c(), new a(this.f56466h.f56475b, this.f56460b));
        }
        return Math.min(length, (int) (this.f56466h.f56475b - this.f56471m));
    }

    public int A(androidx.media2.exoplayer.external.d0 formatHolder, androidx.media2.exoplayer.external.decoder.e buffer, boolean formatRequired, boolean allowOnlyClearBuffers, boolean loadingFinished, long decodeOnlyUntilUs) {
        int iX = this.f56461c.x(formatHolder, buffer, formatRequired, allowOnlyClearBuffers, loadingFinished, this.f56467i, this.f56462d);
        if (iX == -5) {
            this.f56467i = formatHolder.f53762c;
            return -5;
        }
        if (iX != -4) {
            if (iX == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!buffer.t()) {
            if (buffer.f53790d < decodeOnlyUntilUs) {
                buffer.c(Integer.MIN_VALUE);
            }
            if (!buffer.H()) {
                E(buffer, this.f56462d);
            }
        }
        return -4;
    }

    public void F() {
        G(false);
    }

    public void G(boolean resetUpstreamFormat) {
        this.f56461c.y(resetUpstreamFormat);
        h(this.f56464f);
        a aVar = new a(0L, this.f56460b);
        this.f56464f = aVar;
        this.f56465g = aVar;
        this.f56466h = aVar;
        this.f56471m = 0L;
        this.f56459a.b();
    }

    public void H() {
        this.f56461c.z();
        this.f56465g = this.f56464f;
    }

    public boolean I(int sampleIndex) {
        return this.f56461c.A(sampleIndex);
    }

    public void J(long sampleOffsetUs) {
        if (this.f56470l != sampleOffsetUs) {
            this.f56470l = sampleOffsetUs;
            this.f56468j = true;
        }
    }

    public void K(c listener) {
        this.f56473o = listener;
    }

    public void L(int sourceId) {
        this.f56461c.B(sourceId);
    }

    public void M() {
        this.f56472n = true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.s
    public int a(androidx.media2.exoplayer.external.extractor.j input, int length, boolean allowEndOfInput) throws InterruptedException, IOException {
        int iZ = z(length);
        a aVar = this.f56466h;
        int i10 = input.read(aVar.f56477d.f57243a, aVar.c(this.f56471m), iZ);
        if (i10 != -1) {
            y(i10);
            return i10;
        }
        if (allowEndOfInput) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media2.exoplayer.external.extractor.s
    public void b(long timeUs, int flags, int size, int offset, @androidx.annotation.p0 androidx.media2.exoplayer.external.extractor.s.a cryptoData) {
        if (this.f56468j) {
            c(this.f56469k);
        }
        long j10 = timeUs + this.f56470l;
        if (this.f56472n) {
            if ((flags & 1) == 0 || !this.f56461c.c(j10)) {
                return;
            } else {
                this.f56472n = false;
            }
        }
        this.f56461c.d(j10, flags, (this.f56471m - ((long) size)) - ((long) offset), size, cryptoData);
    }

    @Override // androidx.media2.exoplayer.external.extractor.s
    public void c(Format format) {
        Format formatN = n(format, this.f56470l);
        boolean zK = this.f56461c.k(formatN);
        this.f56469k = format;
        this.f56468j = false;
        c cVar = this.f56473o;
        if (cVar == null || !zK) {
            return;
        }
        cVar.g(formatN);
    }

    @Override // androidx.media2.exoplayer.external.extractor.s
    public void d(androidx.media2.exoplayer.external.util.x buffer, int length) {
        while (length > 0) {
            int iZ = z(length);
            a aVar = this.f56466h;
            buffer.i(aVar.f56477d.f57243a, aVar.c(this.f56471m), iZ);
            length -= iZ;
            y(iZ);
        }
    }

    public int f(long timeUs, boolean toKeyframe, boolean allowTimeBeyondBuffer) {
        return this.f56461c.a(timeUs, toKeyframe, allowTimeBeyondBuffer);
    }

    public int g() {
        return this.f56461c.b();
    }

    public void j(long timeUs, boolean toKeyframe, boolean stopAtReadPosition) {
        i(this.f56461c.f(timeUs, toKeyframe, stopAtReadPosition));
    }

    public void k() {
        i(this.f56461c.g());
    }

    public void l() {
        i(this.f56461c.h());
    }

    public void m(int discardFromIndex) {
        long jI = this.f56461c.i(discardFromIndex);
        this.f56471m = jI;
        if (jI != 0) {
            a aVar = this.f56464f;
            if (jI != aVar.f56474a) {
                while (this.f56471m > aVar.f56475b) {
                    aVar = aVar.f56478e;
                }
                a aVar2 = aVar.f56478e;
                h(aVar2);
                a aVar3 = new a(aVar.f56475b, this.f56460b);
                aVar.f56478e = aVar3;
                if (this.f56471m == aVar.f56475b) {
                    aVar = aVar3;
                }
                this.f56466h = aVar;
                if (this.f56465g == aVar2) {
                    this.f56465g = aVar3;
                    return;
                }
                return;
            }
        }
        h(this.f56464f);
        a aVar4 = new a(this.f56471m, this.f56460b);
        this.f56464f = aVar4;
        this.f56465g = aVar4;
        this.f56466h = aVar4;
    }

    public int o() {
        return this.f56461c.l();
    }

    public long p() {
        return this.f56461c.m();
    }

    public long q() {
        return this.f56461c.n();
    }

    public int r() {
        return this.f56461c.p();
    }

    public Format s() {
        return this.f56461c.r();
    }

    public int t() {
        return this.f56461c.s();
    }

    public boolean u() {
        return this.f56461c.t();
    }

    public boolean v() {
        return this.f56461c.u();
    }

    public int w() {
        return this.f56461c.v(this.f56467i);
    }

    public int x() {
        return this.f56461c.w();
    }
}
