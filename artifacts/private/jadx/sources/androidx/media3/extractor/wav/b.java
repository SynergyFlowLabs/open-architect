package androidx.media3.extractor.wav;

import android.util.Pair;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import androidx.media3.common.v0;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.r;
import androidx.media3.extractor.s;
import androidx.media3.extractor.t;
import androidx.media3.extractor.u0;
import androidx.media3.extractor.w;
import androidx.media3.extractor.y0;
import com.facebook.internal.p;
import com.rabbitmq.client.k0;
import il.m;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b implements r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f69573k = "WavExtractor";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f69574l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final w f69575m = new w() { // from class: androidx.media3.extractor.wav.a
        @Override // androidx.media3.extractor.w
        public final r[] c() {
            return b.d();
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f69576n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f69577o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f69578p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f69579q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f69580r = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t f69581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u0 f69582e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC0621b f69585h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69583f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f69584g = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69586i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f69587j = -1;

    private static final class a implements InterfaceC0621b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int[] f69588m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int[] f69589n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, com.planner5d.library.engine.input.f.b.f160745y1, 118, 130, 143, androidx.media2.widget.f.i.f59799s0, 173, p.f100029m, 209, 230, com.planner5d.library.engine.input.f.b.W1, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f69590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u0 f69591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.extractor.wav.c f69592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f69593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f69594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final o0 f69595f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f69596g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final androidx.media3.common.w f69597h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f69598i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f69599j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f69600k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f69601l;

        public a(t tVar, u0 u0Var, androidx.media3.extractor.wav.c cVar) throws v0 {
            this.f69590a = tVar;
            this.f69591b = u0Var;
            this.f69592c = cVar;
            int iMax = Math.max(1, cVar.f69612c / 10);
            this.f69596g = iMax;
            o0 o0Var = new o0(cVar.f69616g);
            o0Var.D();
            int iD = o0Var.D();
            this.f69593d = iD;
            int i10 = cVar.f69611b;
            int i11 = (((cVar.f69614e - (i10 * 4)) * 8) / (cVar.f69615f * i10)) + 1;
            if (iD == i11) {
                int iQ = k1.q(iMax, iD);
                this.f69594e = new byte[cVar.f69614e * iQ];
                this.f69595f = new o0(iQ * h(iD, i10));
                int i12 = ((cVar.f69612c * cVar.f69614e) * 8) / iD;
                this.f69597h = new androidx.media3.common.w.b().u0("audio/raw").Q(i12).p0(i12).k0(h(iMax, i10)).R(cVar.f69611b).v0(cVar.f69612c).o0(2).N();
                return;
            }
            throw v0.a("Expected frames per block: " + i11 + "; got: " + iD, null);
        }

        private void d(byte[] bArr, int i10, o0 o0Var) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f69592c.f69611b; i12++) {
                    e(bArr, i11, i12, o0Var.e());
                }
            }
            int iG = g(this.f69593d * i10);
            o0Var.a0(0);
            o0Var.Z(iG);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            androidx.media3.extractor.wav.c cVar = this.f69592c;
            int i12 = cVar.f69614e;
            int i13 = cVar.f69611b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iW = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int iMin = Math.min(bArr[i14 + 2] & 255, 88);
            int i17 = f69589n[iMin];
            int i18 = ((i10 * this.f69593d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iW & 255);
            bArr2[i18 + 1] = (byte) (iW >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                byte b10 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)];
                int i20 = i19 % 2 == 0 ? b10 & com.google.common.base.c.f116464q : (b10 & 255) >> 4;
                int i21 = ((((i20 & 7) * 2) + 1) * i17) >> 3;
                if ((i20 & 8) != 0) {
                    i21 = -i21;
                }
                iW = k1.w(iW + i21, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iW & 255);
                bArr2[i18 + 1] = (byte) (iW >> 8);
                int i22 = iMin + f69588m[i20];
                int[] iArr = f69589n;
                iMin = k1.w(i22, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        private int f(int i10) {
            return i10 / (this.f69592c.f69611b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f69592c.f69611b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long jX1 = this.f69599j + k1.X1(this.f69601l, 1000000L, this.f69592c.f69612c);
            int iG = g(i10);
            int i11 = 2 << 1;
            this.f69591b.g(jX1, 1, iG, this.f69600k - iG, null);
            this.f69601l += (long) i10;
            this.f69600k -= iG;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x003f A[LOOP:0: B:6:0x0020->B:12:0x003f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x0047 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0022  */
        /* JADX WARN: Code duplicated, block: B:9:0x0028  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:4:0x001d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.media3.extractor.wav.b.InterfaceC0621b
        public boolean a(androidx.media3.extractor.s r8, long r9) throws java.io.IOException {
            /*
                r7 = this;
                int r0 = r7.f69596g
                int r1 = r7.f69600k
                int r1 = r7.f(r1)
                int r0 = r0 - r1
                int r1 = r7.f69593d
                int r0 = androidx.media3.common.util.k1.q(r0, r1)
                androidx.media3.extractor.wav.c r1 = r7.f69592c
                r6 = 3
                int r1 = r1.f69614e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                r6 = 1
                r2 = 1
                if (r1 != 0) goto L1f
            L1d:
                r1 = r2
                goto L20
            L1f:
                r1 = 0
            L20:
                if (r1 != 0) goto L47
                r6 = 7
                int r3 = r7.f69598i
                r6 = 3
                if (r3 >= r0) goto L47
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r9)
                int r3 = (int) r3
                byte[] r4 = r7.f69594e
                r6 = 5
                int r5 = r7.f69598i
                r6 = 0
                int r3 = r8.read(r4, r5, r3)
                r4 = -1
                r6 = r6 ^ r4
                if (r3 != r4) goto L3f
                goto L1d
            L3f:
                r6 = 1
                int r4 = r7.f69598i
                int r4 = r4 + r3
                r7.f69598i = r4
                r6 = 4
                goto L20
            L47:
                r6 = 7
                int r8 = r7.f69598i
                androidx.media3.extractor.wav.c r9 = r7.f69592c
                int r9 = r9.f69614e
                int r8 = r8 / r9
                r6 = 2
                if (r8 <= 0) goto L85
                byte[] r9 = r7.f69594e
                androidx.media3.common.util.o0 r10 = r7.f69595f
                r7.d(r9, r8, r10)
                int r9 = r7.f69598i
                androidx.media3.extractor.wav.c r10 = r7.f69592c
                r6 = 7
                int r10 = r10.f69614e
                int r8 = r8 * r10
                r6 = 3
                int r9 = r9 - r8
                r7.f69598i = r9
                androidx.media3.common.util.o0 r8 = r7.f69595f
                int r8 = r8.g()
                androidx.media3.extractor.u0 r9 = r7.f69591b
                r6 = 6
                androidx.media3.common.util.o0 r10 = r7.f69595f
                r9.b(r10, r8)
                int r9 = r7.f69600k
                int r9 = r9 + r8
                r6 = 0
                r7.f69600k = r9
                r6 = 4
                int r8 = r7.f(r9)
                int r9 = r7.f69596g
                if (r8 < r9) goto L85
                r7.i(r9)
            L85:
                if (r1 == 0) goto L94
                r6 = 1
                int r8 = r7.f69600k
                r6 = 6
                int r8 = r7.f(r8)
                if (r8 <= 0) goto L94
                r7.i(r8)
            L94:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.wav.b.a.a(androidx.media3.extractor.s, long):boolean");
        }

        @Override // androidx.media3.extractor.wav.b.InterfaceC0621b
        public void b(int i10, long j10) {
            e eVar = new e(this.f69592c, this.f69593d, i10, j10);
            this.f69590a.u(eVar);
            this.f69591b.e(this.f69597h);
            this.f69591b.c(eVar.Q1());
        }

        @Override // androidx.media3.extractor.wav.b.InterfaceC0621b
        public void c(long j10) {
            this.f69598i = 0;
            this.f69599j = j10;
            this.f69600k = 0;
            this.f69601l = 0L;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.extractor.wav.b$b, reason: collision with other inner class name */
    private interface InterfaceC0621b {
        boolean a(s sVar, long j10) throws IOException;

        void b(int i10, long j10) throws v0;

        void c(long j10);
    }

    private static final class c implements InterfaceC0621b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f69602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u0 f69603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.extractor.wav.c f69604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.media3.common.w f69605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f69606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f69607f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f69608g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f69609h;

        public c(t tVar, u0 u0Var, androidx.media3.extractor.wav.c cVar, String str, int i10) throws v0 {
            this.f69602a = tVar;
            this.f69603b = u0Var;
            this.f69604c = cVar;
            int i11 = (cVar.f69611b * cVar.f69615f) / 8;
            if (cVar.f69614e == i11) {
                int i12 = cVar.f69612c;
                int i13 = i12 * i11 * 8;
                int iMax = Math.max(i11, (i12 * i11) / 10);
                this.f69606e = iMax;
                this.f69605d = new androidx.media3.common.w.b().U(s0.f61320k0).u0(str).Q(i13).p0(i13).k0(iMax).R(cVar.f69611b).v0(cVar.f69612c).o0(i10).N();
                return;
            }
            throw v0.a("Expected block size: " + i11 + "; got: " + cVar.f69614e, null);
        }

        @Override // androidx.media3.extractor.wav.b.InterfaceC0621b
        public boolean a(s sVar, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f69608g) < (i11 = this.f69606e)) {
                int iF = this.f69603b.f(sVar, (int) Math.min(i11 - i10, j11), true);
                if (iF == -1) {
                    j11 = 0;
                } else {
                    this.f69608g += iF;
                    j11 -= (long) iF;
                }
            }
            androidx.media3.extractor.wav.c cVar = this.f69604c;
            int i12 = cVar.f69614e;
            int i13 = this.f69608g / i12;
            if (i13 > 0) {
                long jX1 = this.f69607f + k1.X1(this.f69609h, 1000000L, cVar.f69612c);
                int i14 = i13 * i12;
                int i15 = this.f69608g - i14;
                this.f69603b.g(jX1, 1, i14, i15, null);
                this.f69609h += (long) i13;
                this.f69608g = i15;
            }
            return j11 <= 0;
        }

        @Override // androidx.media3.extractor.wav.b.InterfaceC0621b
        public void b(int i10, long j10) {
            e eVar = new e(this.f69604c, 1, i10, j10);
            this.f69602a.u(eVar);
            this.f69603b.e(this.f69605d);
            this.f69603b.c(eVar.Q1());
        }

        @Override // androidx.media3.extractor.wav.b.InterfaceC0621b
        public void c(long j10) {
            this.f69607f = j10;
            this.f69608g = 0;
            this.f69609h = 0L;
        }
    }

    public static /* synthetic */ r[] d() {
        return new r[]{new b()};
    }

    @il.d({"extractorOutput", "trackOutput"})
    private void e() {
        androidx.media3.common.util.a.k(this.f69582e);
        k1.o(this.f69581d);
    }

    private void i(s sVar) throws IOException {
        androidx.media3.common.util.a.i(sVar.getPosition() == 0);
        int i10 = this.f69586i;
        if (i10 != -1) {
            sVar.o(i10);
            this.f69583f = 4;
        } else {
            if (!d.a(sVar)) {
                throw v0.a("Unsupported or unrecognized wav file type.", null);
            }
            sVar.o((int) (sVar.m() - sVar.getPosition()));
            this.f69583f = 1;
        }
    }

    @m({"extractorOutput", "trackOutput"})
    private void j(s sVar) throws IOException {
        androidx.media3.extractor.wav.c cVarB = d.b(sVar);
        int i10 = cVarB.f69610a;
        if (i10 == 17) {
            this.f69585h = new a(this.f69581d, this.f69582e, cVarB);
        } else if (i10 == 6) {
            this.f69585h = new c(this.f69581d, this.f69582e, cVarB, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f69585h = new c(this.f69581d, this.f69582e, cVarB, "audio/g711-mlaw", -1);
        } else {
            int iA = y0.a(i10, cVarB.f69615f);
            if (iA == 0) {
                throw v0.e("Unsupported WAV format type: " + cVarB.f69610a);
            }
            this.f69585h = new c(this.f69581d, this.f69582e, cVarB, "audio/raw", iA);
        }
        this.f69583f = 3;
    }

    private void k(s sVar) throws IOException {
        this.f69584g = d.c(sVar);
        this.f69583f = 2;
    }

    private int l(s sVar) throws IOException {
        androidx.media3.common.util.a.i(this.f69587j != -1);
        return ((InterfaceC0621b) androidx.media3.common.util.a.g(this.f69585h)).a(sVar, this.f69587j - sVar.getPosition()) ? -1 : 0;
    }

    private void m(s sVar) throws IOException {
        Pair<Long, Long> pairE = d.e(sVar);
        this.f69586i = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j10 = this.f69584g;
        if (j10 != -1 && jLongValue == k0.f265952a) {
            jLongValue = j10;
        }
        this.f69587j = ((long) this.f69586i) + jLongValue;
        long length = sVar.getLength();
        if (length != -1 && this.f69587j > length) {
            z.n(f69573k, "Data exceeds input length: " + this.f69587j + ", " + length);
            this.f69587j = length;
        }
        ((InterfaceC0621b) androidx.media3.common.util.a.g(this.f69585h)).b(this.f69586i, this.f69587j);
        this.f69583f = 4;
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        this.f69583f = j10 == 0 ? 0 : 4;
        InterfaceC0621b interfaceC0621b = this.f69585h;
        if (interfaceC0621b != null) {
            interfaceC0621b.c(j11);
        }
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws IOException {
        e();
        int i10 = this.f69583f;
        if (i10 == 0) {
            i(sVar);
            return 0;
        }
        if (i10 == 1) {
            k(sVar);
            return 0;
        }
        if (i10 == 2) {
            j(sVar);
            return 0;
        }
        if (i10 == 3) {
            m(sVar);
            return 0;
        }
        if (i10 == 4) {
            return l(sVar);
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws IOException {
        return d.a(sVar);
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f69581d = tVar;
        this.f69582e = tVar.a(0, 1);
        tVar.l();
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }
}
