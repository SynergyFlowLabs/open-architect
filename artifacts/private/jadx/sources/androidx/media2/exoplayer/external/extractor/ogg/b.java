package androidx.media2.exoplayer.external.extractor.ogg;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.extractor.q;
import androidx.media2.exoplayer.external.extractor.r;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.x;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class b extends i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte f54595t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final byte f54596u = 3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f54597v = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private androidx.media2.exoplayer.external.util.l f54598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a f54599s;

    private class a implements g, q {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f54600i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f54601j = 18;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long[] f54602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long[] f54603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f54604f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f54605g = -1;

        public a() {
        }

        @Override // androidx.media2.exoplayer.external.extractor.q
        public long Q1() {
            return b.this.f54598r.c();
        }

        @Override // androidx.media2.exoplayer.external.extractor.q
        public q.a R1(long timeUs) {
            int iH = q0.h(this.f54602d, b.this.b(timeUs), true, true);
            long jA = b.this.a(this.f54602d[iH]);
            r rVar = new r(jA, this.f54604f + this.f54603e[iH]);
            if (jA < timeUs) {
                long[] jArr = this.f54602d;
                if (iH != jArr.length - 1) {
                    int i10 = iH + 1;
                    return new q.a(rVar, new r(b.this.a(jArr[i10]), this.f54604f + this.f54603e[i10]));
                }
            }
            return new q.a(rVar);
        }

        @Override // androidx.media2.exoplayer.external.extractor.q
        public boolean S1() {
            return true;
        }

        @Override // androidx.media2.exoplayer.external.extractor.ogg.g
        public q a() {
            return this;
        }

        @Override // androidx.media2.exoplayer.external.extractor.ogg.g
        public long b(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
            long j10 = this.f54605g;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f54605g = -1L;
            return j11;
        }

        @Override // androidx.media2.exoplayer.external.extractor.ogg.g
        public void c(long targetGranule) {
            this.f54605g = this.f54602d[q0.h(this.f54602d, targetGranule, true, true)];
        }

        public void f(x data) {
            data.R(1);
            int iG = data.G() / 18;
            this.f54602d = new long[iG];
            this.f54603e = new long[iG];
            int i10 = 4 | 0;
            for (int i11 = 0; i11 < iG; i11++) {
                this.f54602d[i11] = data.w();
                this.f54603e[i11] = data.w();
                data.R(2);
            }
        }

        public void g(long firstFrameOffset) {
            this.f54604f = firstFrameOffset;
        }
    }

    b() {
    }

    private int m(x packet) {
        int i10 = 7 << 4;
        int i11 = (packet.f57720a[2] & 255) >> 4;
        switch (i11) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i11 - 2);
            case 6:
            case 7:
                packet.R(4);
                packet.K();
                int iD = i11 == 6 ? packet.D() : packet.J();
                packet.Q(0);
                return iD + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i11 - 8);
            default:
                int i12 = i10 ^ (-1);
                return -1;
        }
    }

    private static boolean n(byte[] data) {
        return data[0] == -1;
    }

    public static boolean o(x data) {
        return data.a() >= 5 && data.D() == 127 && data.F() == 1179402563;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ogg.i
    protected long e(x packet) {
        if (n(packet.f57720a)) {
            return m(packet);
        }
        return -1L;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ogg.i
    protected boolean h(x packet, long position, i.b setupData) throws InterruptedException, IOException {
        byte[] bArr = packet.f57720a;
        if (this.f54598r == null) {
            this.f54598r = new androidx.media2.exoplayer.external.util.l(bArr, 17);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 9, packet.d());
            bArrCopyOfRange[4] = -128;
            List listSingletonList = Collections.singletonList(bArrCopyOfRange);
            int iA = this.f54598r.a();
            androidx.media2.exoplayer.external.util.l lVar = this.f54598r;
            setupData.f54656a = Format.s(null, "audio/flac", null, -1, iA, lVar.f57599f, lVar.f57598e, listSingletonList, null, 0, null);
            return true;
        }
        if ((bArr[0] & 127) == 3) {
            a aVar = new a();
            this.f54599s = aVar;
            aVar.f(packet);
            return true;
        }
        if (!n(bArr)) {
            return true;
        }
        a aVar2 = this.f54599s;
        if (aVar2 != null) {
            aVar2.g(position);
            setupData.f54657b = this.f54599s;
        }
        return false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ogg.i
    protected void j(boolean headerData) {
        super.j(headerData);
        if (headerData) {
            this.f54598r = null;
            this.f54599s = null;
        }
    }
}
