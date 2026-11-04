package androidx.media2.exoplayer.external.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.collection.g3;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import androidx.media2.exoplayer.external.extractor.i;
import androidx.media2.exoplayer.external.extractor.j;
import androidx.media2.exoplayer.external.extractor.k;
import androidx.media2.exoplayer.external.extractor.l;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.t;
import androidx.media2.exoplayer.external.util.x;
import androidx.media2.exoplayer.external.video.ColorInfo;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class e implements i {
    private static final String A0 = "A_AAC";
    private static final int A1 = 21998;
    private static final int A2 = 21973;
    private static final String B0 = "A_MPEG/L2";
    private static final int B1 = 21358;
    private static final int B2 = 21974;
    private static final String C0 = "A_MPEG/L3";
    private static final int C1 = 134;
    private static final int C2 = 21975;
    private static final String D0 = "A_AC3";
    private static final int D1 = 25506;
    private static final int D2 = 21976;
    private static final String E0 = "A_EAC3";
    private static final int E1 = 22186;
    private static final int E2 = 21977;
    private static final String F0 = "A_TRUEHD";
    private static final int F1 = 22203;
    private static final int F2 = 21978;
    private static final String G0 = "A_DTS";
    private static final int G1 = 224;
    private static final int G2 = 4;
    private static final String H0 = "A_DTS/EXPRESS";
    private static final int H1 = 176;
    private static final int H2 = 0;
    private static final String I0 = "A_DTS/LOSSLESS";
    private static final int I1 = 186;
    private static final int I2 = 1;
    private static final String J0 = "A_FLAC";
    private static final int J1 = 21680;
    private static final int J2 = 2;
    private static final String K0 = "A_MS/ACM";
    private static final int K1 = 21690;
    private static final int K2 = 3;
    private static final String L0 = "A_PCM/INT/LIT";
    private static final int L1 = 21682;
    private static final int L2 = 1482049860;
    private static final String M0 = "S_TEXT/UTF8";
    private static final int M1 = 225;
    private static final int M2 = 859189832;
    private static final String N0 = "S_TEXT/ASS";
    private static final int N1 = 159;
    private static final int N2 = 826496599;
    private static final String O0 = "S_VOBSUB";
    private static final int O1 = 25188;
    private static final String P0 = "S_HDMV/PGS";
    private static final int P1 = 181;
    private static final int P2 = 19;
    private static final String Q0 = "S_DVBSUB";
    private static final int Q1 = 28032;
    private static final int R0 = 8192;
    private static final int R1 = 25152;
    private static final long R2 = 1000;
    private static final int S0 = 5760;
    private static final int S1 = 20529;
    private static final String S2 = "%02d:%02d:%02d,%03d";
    private static final int T0 = 8;
    private static final int T1 = 20530;
    private static final int U0 = 2;
    private static final int U1 = 20532;
    private static final int V0 = 440786851;
    private static final int V1 = 16980;
    private static final int V2 = 21;
    private static final int W0 = 17143;
    private static final int W1 = 16981;
    private static final long W2 = 10000;
    private static final int X0 = 17026;
    private static final int X1 = 20533;
    private static final int Y0 = 17029;
    private static final int Y1 = 18401;
    private static final String Y2 = "%01d:%02d:%02d:%02d";
    private static final int Z0 = 408125543;
    private static final int Z1 = 18402;
    private static final int Z2 = 18;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private static final int f54107a1 = 357149030;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    private static final int f54108a2 = 18407;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    private static final int f54109a3 = 65534;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private static final int f54110b1 = 290298740;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    private static final int f54111b2 = 18408;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    private static final int f54112b3 = 1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private static final int f54113c1 = 19899;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    private static final int f54114c2 = 475249515;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private static final int f54116d1 = 21419;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    private static final int f54117d2 = 187;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static final int f54119e1 = 21420;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    private static final int f54120e2 = 179;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f54121f0 = 1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private static final int f54122f1 = 357149030;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    private static final int f54123f2 = 183;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final String f54124g0 = "MatroskaExtractor";

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private static final int f54125g1 = 2807729;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    private static final int f54126g2 = 241;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final int f54127h0 = -1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private static final int f54128h1 = 17545;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    private static final int f54129h2 = 2274716;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int f54130i0 = 0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static final int f54131i1 = 524531317;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    private static final int f54132i2 = 30320;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final int f54133j0 = 1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private static final int f54134j1 = 231;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    private static final int f54135j2 = 30321;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int f54136k0 = 2;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private static final int f54137k1 = 163;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    private static final int f54138k2 = 30322;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final String f54139l0 = "matroska";

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private static final int f54140l1 = 160;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    private static final int f54141l2 = 30323;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final String f54142m0 = "webm";

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private static final int f54143m1 = 161;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    private static final int f54144m2 = 30324;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final String f54145n0 = "V_VP8";

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private static final int f54146n1 = 155;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    private static final int f54147n2 = 30325;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final String f54148o0 = "V_VP9";

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private static final int f54149o1 = 30113;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    private static final int f54150o2 = 21432;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String f54151p0 = "V_AV1";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f54152p1 = 166;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f54153p2 = 21936;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final String f54154q0 = "V_MPEG2";

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private static final int f54155q1 = 238;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    private static final int f54156q2 = 21945;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final String f54157r0 = "V_MPEG4/ISO/SP";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private static final int f54158r1 = 165;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    private static final int f54159r2 = 21946;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final String f54160s0 = "V_MPEG4/ISO/ASP";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private static final int f54161s1 = 251;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    private static final int f54162s2 = 21947;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final String f54163t0 = "V_MPEG4/ISO/AP";

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private static final int f54164t1 = 374648427;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    private static final int f54165t2 = 21948;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final String f54166u0 = "V_MPEG4/ISO/AVC";

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private static final int f54167u1 = 174;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    private static final int f54168u2 = 21949;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final String f54169v0 = "V_MPEGH/ISO/HEVC";

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private static final int f54170v1 = 215;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    private static final int f54171v2 = 21968;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final String f54172w0 = "V_MS/VFW/FOURCC";

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private static final int f54173w1 = 131;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    private static final int f54174w2 = 21969;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final String f54175x0 = "V_THEORA";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final int f54176x1 = 136;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f54177x2 = 21970;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final String f54178y0 = "A_VORBIS";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final int f54179y1 = 21930;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final int f54180y2 = 21971;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final String f54181z0 = "A_OPUS";

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private static final int f54182z1 = 2352003;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    private static final int f54183z2 = 21972;
    private long A;
    private boolean B;
    private long C;
    private long D;
    private long E;
    private q F;
    private q G;
    private boolean H;
    private int I;
    private long J;
    private long K;
    private int L;
    private int M;
    private int[] N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private byte X;
    private int Y;
    private int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f54184a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f54185b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f54186c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.extractor.mkv.c f54187d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private k f54188d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f54189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray<d> f54190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f54191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x f54192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final x f54193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final x f54194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final x f54195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final x f54196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final x f54197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final x f54198n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final x f54199o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final x f54200p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final x f54201q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ByteBuffer f54202r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f54203s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f54204t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f54205u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f54206v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f54207w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private d f54208x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f54209y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f54210z;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final l f54118e0 = androidx.media2.exoplayer.external.extractor.mkv.d.f54106a;
    private static final byte[] O2 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] Q2 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final byte[] T2 = q0.i0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] U2 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] X2 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    private static final UUID f54115c3 = new UUID(72057594037932032L, -9223371306706625679L);

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private final class c implements androidx.media2.exoplayer.external.extractor.mkv.b {
        private c() {
        }

        @Override // androidx.media2.exoplayer.external.extractor.mkv.b
        public void a(int id2) throws k0 {
            e.this.k(id2);
        }

        @Override // androidx.media2.exoplayer.external.extractor.mkv.b
        public void b(int id2, double value) throws k0 {
            e.this.m(id2, value);
        }

        @Override // androidx.media2.exoplayer.external.extractor.mkv.b
        public void c(int id2, long value) throws k0 {
            e.this.p(id2, value);
        }

        @Override // androidx.media2.exoplayer.external.extractor.mkv.b
        public void d(int id2, String value) throws k0 {
            e.this.B(id2, value);
        }

        @Override // androidx.media2.exoplayer.external.extractor.mkv.b
        public void e(int id2, long contentPosition, long contentSize) throws k0 {
            e.this.A(id2, contentPosition, contentSize);
        }

        @Override // androidx.media2.exoplayer.external.extractor.mkv.b
        public int f(int id2) {
            return e.this.n(id2);
        }

        @Override // androidx.media2.exoplayer.external.extractor.mkv.b
        public boolean g(int id2) {
            return e.this.r(id2);
        }

        @Override // androidx.media2.exoplayer.external.extractor.mkv.b
        public void h(int id2, int contentsSize, j input) throws InterruptedException, IOException {
            e.this.g(id2, contentsSize, input);
        }
    }

    private static final class d {
        private static final int X = 0;
        private static final int Y = 50000;
        private static final int Z = 1000;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private static final int f54212a0 = 200;
        public int A;
        public int B;
        public float C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public int M;
        public int N;
        public int O;
        public long P;
        public long Q;

        @p0
        public C0509e R;
        public boolean S;
        public boolean T;
        private String U;
        public s V;
        public int W;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f54213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f54214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f54215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f54216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f54217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f54218f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f54219g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte[] f54220h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public s.a f54221i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f54222j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DrmInitData f54223k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f54224l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f54225m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f54226n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f54227o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f54228p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f54229q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f54230r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f54231s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f54232t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public byte[] f54233u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f54234v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f54235w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f54236x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f54237y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f54238z;

        private d() {
            this.f54224l = -1;
            this.f54225m = -1;
            this.f54226n = -1;
            this.f54227o = -1;
            this.f54228p = 0;
            this.f54229q = -1;
            this.f54230r = 0.0f;
            this.f54231s = 0.0f;
            this.f54232t = 0.0f;
            this.f54233u = null;
            this.f54234v = -1;
            this.f54235w = false;
            this.f54236x = -1;
            this.f54237y = -1;
            this.f54238z = -1;
            this.A = 1000;
            this.B = 200;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 1;
            this.N = -1;
            this.O = 8000;
            this.P = 0L;
            this.Q = 0L;
            this.T = true;
            this.U = "eng";
        }

        private byte[] b() {
            if (this.C != -1.0f && this.D != -1.0f && this.E != -1.0f && this.F != -1.0f && this.G != -1.0f && this.H != -1.0f && this.I != -1.0f && this.J != -1.0f && this.K != -1.0f && this.L != -1.0f) {
                byte[] bArr = new byte[25];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.put((byte) 0);
                byteBufferWrap.putShort((short) ((this.C * 50000.0f) + 0.5f));
                byteBufferWrap.putShort((short) ((this.D * 50000.0f) + 0.5f));
                byteBufferWrap.putShort((short) ((this.E * 50000.0f) + 0.5f));
                byteBufferWrap.putShort((short) ((this.F * 50000.0f) + 0.5f));
                byteBufferWrap.putShort((short) ((this.G * 50000.0f) + 0.5f));
                byteBufferWrap.putShort((short) ((this.H * 50000.0f) + 0.5f));
                byteBufferWrap.putShort((short) ((this.I * 50000.0f) + 0.5f));
                byteBufferWrap.putShort((short) ((this.J * 50000.0f) + 0.5f));
                byteBufferWrap.putShort((short) (this.K + 0.5f));
                byteBufferWrap.putShort((short) (this.L + 0.5f));
                byteBufferWrap.putShort((short) this.A);
                byteBufferWrap.putShort((short) this.B);
                return bArr;
            }
            return null;
        }

        private static Pair<String, List<byte[]>> e(x buffer) throws k0 {
            try {
                buffer.R(16);
                long jS = buffer.s();
                if (jS == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jS == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jS != 826496599) {
                    p.l(e.f54124g0, "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArr = buffer.f57720a;
                for (int iC = buffer.c() + 20; iC < bArr.length - 4; iC++) {
                    if (bArr[iC] == 0 && bArr[iC + 1] == 0 && bArr[iC + 2] == 1 && bArr[iC + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, iC, bArr.length)));
                    }
                }
                throw new k0("Failed to find FourCC VC1 initialization data");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new k0("Error parsing FourCC private data");
            }
        }

        private static boolean f(x buffer) throws k0 {
            try {
                int iV = buffer.v();
                if (iV == 1) {
                    return true;
                }
                if (iV == 65534) {
                    buffer.Q(24);
                    if (buffer.w() == e.f54115c3.getMostSignificantBits() && buffer.w() == e.f54115c3.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new k0("Error parsing MS/ACM codec private");
            }
        }

        private static List<byte[]> g(byte[] codecPrivate) throws k0 {
            int i10;
            int i11;
            try {
                if (codecPrivate[0] != 2) {
                    throw new k0("Error parsing vorbis codec private");
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = codecPrivate[i13];
                    if (i10 != -1) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + i10;
                int i16 = 0;
                while (true) {
                    i11 = codecPrivate[i14];
                    if (i11 != -1) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + i11;
                if (codecPrivate[i17] != 1) {
                    throw new k0("Error parsing vorbis codec private");
                }
                byte[] bArr = new byte[i15];
                System.arraycopy(codecPrivate, i17, bArr, 0, i15);
                int i19 = i17 + i15;
                if (codecPrivate[i19] != 3) {
                    throw new k0("Error parsing vorbis codec private");
                }
                int i20 = i19 + i18;
                if (codecPrivate[i20] != 5) {
                    throw new k0("Error parsing vorbis codec private");
                }
                byte[] bArr2 = new byte[codecPrivate.length - i20];
                System.arraycopy(codecPrivate, i20, bArr2, 0, codecPrivate.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr);
                arrayList.add(bArr2);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new k0("Error parsing vorbis codec private");
            }
        }

        /* JADX WARN: Code duplicated, block: B:185:0x03bc  */
        /* JADX WARN: Code duplicated, block: B:186:0x03bf  */
        /* JADX WARN: Code duplicated, block: B:189:0x03c9  */
        /* JADX WARN: Code duplicated, block: B:190:0x03ef  */
        /* JADX WARN: Code duplicated, block: B:192:0x03f7  */
        /* JADX WARN: Code duplicated, block: B:194:0x03fb  */
        /* JADX WARN: Code duplicated, block: B:196:0x03ff  */
        /* JADX WARN: Code duplicated, block: B:199:0x0407  */
        /* JADX WARN: Code duplicated, block: B:203:0x040f  */
        /* JADX WARN: Code duplicated, block: B:207:0x041f  */
        /* JADX WARN: Code duplicated, block: B:210:0x0426  */
        /* JADX WARN: Code duplicated, block: B:211:0x0438  */
        /* JADX WARN: Code duplicated, block: B:214:0x044a  */
        /* JADX WARN: Code duplicated, block: B:215:0x044d  */
        /* JADX WARN: Code duplicated, block: B:217:0x0457  */
        /* JADX WARN: Code duplicated, block: B:218:0x0459  */
        /* JADX WARN: Code duplicated, block: B:220:0x0463  */
        /* JADX WARN: Code duplicated, block: B:221:0x0466  */
        /* JADX WARN: Code duplicated, block: B:223:0x0472  */
        /* JADX WARN: Code duplicated, block: B:226:0x0478  */
        /* JADX WARN: Code duplicated, block: B:246:0x04c8  */
        /* JADX WARN: Code duplicated, block: B:248:0x04f6  */
        /* JADX WARN: Code duplicated, block: B:250:0x04fe  */
        /* JADX WARN: Code duplicated, block: B:252:0x050e  */
        /* JADX WARN: Code duplicated, block: B:254:0x0514  */
        /* JADX WARN: Code duplicated, block: B:255:0x0550  */
        /* JADX WARN: Code duplicated, block: B:257:0x0558  */
        public void c(k kVar, int i10) throws k0 {
            byte b10;
            List<byte[]> listSingletonList;
            String str;
            int iU;
            List<byte[]> listG;
            int i11;
            String str2;
            int i12;
            String str3;
            List<byte[]> listSingletonList2;
            int i13;
            List<byte[]> list;
            int i14;
            int i15;
            String str4;
            Format formatV;
            int i16;
            int i17;
            float f10;
            ColorInfo colorInfo;
            int i18;
            int i19;
            int i20;
            int i21;
            String str5 = this.f54214b;
            str5.getClass();
            int i22 = -1;
            switch (str5) {
                case "V_MPEG4/ISO/AP":
                    b10 = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b10 = 1;
                    break;
                case "A_MS/ACM":
                    b10 = 2;
                    break;
                case "A_TRUEHD":
                    b10 = 3;
                    break;
                case "A_VORBIS":
                    b10 = 4;
                    break;
                case "A_MPEG/L2":
                    b10 = 5;
                    break;
                case "A_MPEG/L3":
                    b10 = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b10 = 7;
                    break;
                case "S_DVBSUB":
                    b10 = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b10 = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b10 = 10;
                    break;
                case "S_VOBSUB":
                    b10 = 11;
                    break;
                case "A_DTS/LOSSLESS":
                    b10 = com.google.common.base.c.f116461n;
                    break;
                case "A_AAC":
                    b10 = com.google.common.base.c.f116462o;
                    break;
                case "A_AC3":
                    b10 = com.google.common.base.c.f116463p;
                    break;
                case "A_DTS":
                    b10 = com.google.common.base.c.f116464q;
                    break;
                case "V_AV1":
                    b10 = com.google.common.base.c.f116465r;
                    break;
                case "V_VP8":
                    b10 = 17;
                    break;
                case "V_VP9":
                    b10 = com.google.common.base.c.f116468u;
                    break;
                case "S_HDMV/PGS":
                    b10 = 19;
                    break;
                case "V_THEORA":
                    b10 = com.google.common.base.c.f116471x;
                    break;
                case "A_DTS/EXPRESS":
                    b10 = com.google.common.base.c.f116472y;
                    break;
                case "A_PCM/INT/LIT":
                    b10 = com.google.common.base.c.f116473z;
                    break;
                case "S_TEXT/ASS":
                    b10 = com.google.common.base.c.A;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b10 = com.google.common.base.c.B;
                    break;
                case "S_TEXT/UTF8":
                    b10 = com.google.common.base.c.C;
                    break;
                case "V_MPEG2":
                    b10 = com.google.common.base.c.D;
                    break;
                case "A_EAC3":
                    b10 = com.google.common.base.c.E;
                    break;
                case "A_FLAC":
                    b10 = com.google.common.base.c.F;
                    break;
                case "A_OPUS":
                    b10 = com.google.common.base.c.G;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            String str6 = "audio/raw";
            switch (b10) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr = this.f54222j;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str = "video/mp4v-es";
                    listSingletonList2 = listSingletonList;
                    i12 = -1;
                    i13 = -1;
                    str3 = str;
                    boolean z10 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z10 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    } else if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                        if (this.f54228p == 0) {
                            i20 = this.f54226n;
                            if (i20 == -1) {
                                i20 = this.f54224l;
                            }
                            this.f54226n = i20;
                            i21 = this.f54227o;
                            if (i21 == -1) {
                                i21 = this.f54225m;
                            }
                            this.f54227o = i21;
                        }
                        i17 = this.f54226n;
                        if (i17 != -1 || (i19 = this.f54227o) == -1) {
                            f10 = -1.0f;
                        } else {
                            f10 = (this.f54225m * i17) / (this.f54224l * i19);
                        }
                        float f11 = f10;
                        if (this.f54235w) {
                            colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                        } else {
                            colorInfo = null;
                        }
                        if ("htc_video_rotA-000".equals(this.f54213a)) {
                            i22 = 0;
                        } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                            i22 = 90;
                        } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                            i22 = 180;
                        } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                            i22 = 270;
                        }
                        if (this.f54229q == 0 || Float.compare(this.f54230r, 0.0f) != 0 || Float.compare(this.f54231s, 0.0f) != 0) {
                            i18 = i22;
                        } else if (Float.compare(this.f54232t, 0.0f) == 0) {
                            i18 = 0;
                        } else if (Float.compare(this.f54231s, 90.0f) == 0) {
                            i18 = 90;
                        } else if (Float.compare(this.f54231s, -180.0f) == 0 || Float.compare(this.f54231s, 180.0f) == 0) {
                            i18 = 180;
                        } else if (Float.compare(this.f54231s, -90.0f) == 0) {
                            i18 = 270;
                        } else {
                            i18 = i22;
                        }
                        formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f11, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                        i16 = 2;
                    } else {
                        str4 = str3;
                        if ("application/x-subrip".equals(str4)) {
                            formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                        } else if ("text/x-ssa".equals(str4)) {
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(e.T2);
                            arrayList.add(this.f54222j);
                            formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList);
                        } else {
                            if ("application/vobsub".equals(str4) && !"application/pgs".equals(str4) && !"application/dvbsubs".equals(str4)) {
                                throw new k0("Unexpected MIME type.");
                            }
                            formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                        }
                        i16 = 3;
                    }
                    s sVarA = kVar.a(this.f54215c, i16);
                    this.V = sVarA;
                    sVarA.c(formatV);
                    return;
                case 2:
                    if (f(new x(this.f54222j))) {
                        iU = q0.U(this.N);
                        if (iU == 0) {
                            int i23 = this.N;
                            StringBuilder sb2 = new StringBuilder("audio/x-unknown".length() + 60);
                            sb2.append("Unsupported PCM bit depth: ");
                            sb2.append(i23);
                            sb2.append(". Setting mimeType to ");
                            sb2.append("audio/x-unknown");
                            p.l(e.f54124g0, sb2.toString());
                        }
                        i12 = iU;
                        i13 = -1;
                        str3 = str6;
                        listSingletonList2 = null;
                        boolean z11 = this.T;
                        if (this.S) {
                            i14 = 2;
                        } else {
                            i14 = 0;
                        }
                        i15 = (z11 ? 1 : 0) | i14;
                        if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                            if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                                if (this.f54228p == 0) {
                                    i20 = this.f54226n;
                                    if (i20 == -1) {
                                        i20 = this.f54224l;
                                    }
                                    this.f54226n = i20;
                                    i21 = this.f54227o;
                                    if (i21 == -1) {
                                        i21 = this.f54225m;
                                    }
                                    this.f54227o = i21;
                                }
                                i17 = this.f54226n;
                                if (i17 != -1) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                float f12 = f10;
                                if (this.f54235w) {
                                    colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                                } else {
                                    colorInfo = null;
                                }
                                if ("htc_video_rotA-000".equals(this.f54213a)) {
                                    i22 = 0;
                                } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                    i22 = 90;
                                } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                    i22 = 180;
                                } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                    i22 = 270;
                                }
                                if (this.f54229q == 0) {
                                    i18 = i22;
                                } else {
                                    i18 = i22;
                                }
                                formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f12, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                                i16 = 2;
                            } else {
                                str4 = str3;
                                if ("application/x-subrip".equals(str4)) {
                                    formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                                } else if ("text/x-ssa".equals(str4)) {
                                    ArrayList arrayList2 = new ArrayList(2);
                                    arrayList2.add(e.T2);
                                    arrayList2.add(this.f54222j);
                                    formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList2);
                                } else {
                                    if ("application/vobsub".equals(str4)) {
                                    }
                                    formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                                }
                                i16 = 3;
                            }
                            break;
                        } else {
                            formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                            i16 = 1;
                        }
                        s sVarA2 = kVar.a(this.f54215c, i16);
                        this.V = sVarA2;
                        sVarA2.c(formatV);
                        return;
                    }
                    p.l(e.f54124g0, "audio/x-unknown".length() != 0 ? "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat("audio/x-unknown") : new String("Non-PCM MS/ACM is unsupported. Setting mimeType to "));
                    str3 = "audio/x-unknown";
                    i12 = -1;
                    i13 = -1;
                    listSingletonList2 = null;
                    boolean z12 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z12 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f13 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f13, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList3 = new ArrayList(2);
                                arrayList3.add(e.T2);
                                arrayList3.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList3);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA3 = kVar.a(this.f54215c, i16);
                    this.V = sVarA3;
                    sVarA3.c(formatV);
                    return;
                case 3:
                    this.R = new C0509e();
                    str6 = "audio/true-hd";
                    i12 = -1;
                    i13 = -1;
                    str3 = str6;
                    listSingletonList2 = null;
                    boolean z13 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z13 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f14 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f14, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList4 = new ArrayList(2);
                                arrayList4.add(e.T2);
                                arrayList4.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList4);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA4 = kVar.a(this.f54215c, i16);
                    this.V = sVarA4;
                    sVarA4.c(formatV);
                    return;
                case 4:
                    listG = g(this.f54222j);
                    str = "audio/vorbis";
                    i11 = 8192;
                    listSingletonList2 = listG;
                    i13 = i11;
                    i12 = -1;
                    str3 = str;
                    boolean z14 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z14 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f15 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f15, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList5 = new ArrayList(2);
                                arrayList5.add(e.T2);
                                arrayList5.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList5);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA5 = kVar.a(this.f54215c, i16);
                    this.V = sVarA5;
                    sVarA5.c(formatV);
                    return;
                case 5:
                    str2 = "audio/mpeg-L2";
                    i12 = -1;
                    str3 = str2;
                    listSingletonList2 = null;
                    i13 = 4096;
                    boolean z15 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z15 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f16 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f16, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList6 = new ArrayList(2);
                                arrayList6.add(e.T2);
                                arrayList6.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList6);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA6 = kVar.a(this.f54215c, i16);
                    this.V = sVarA6;
                    sVarA6.c(formatV);
                    return;
                case 6:
                    str2 = "audio/mpeg";
                    i12 = -1;
                    str3 = str2;
                    listSingletonList2 = null;
                    i13 = 4096;
                    boolean z16 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z16 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f17 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f17, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList7 = new ArrayList(2);
                                arrayList7.add(e.T2);
                                arrayList7.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList7);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA7 = kVar.a(this.f54215c, i16);
                    this.V = sVarA7;
                    sVarA7.c(formatV);
                    return;
                case 7:
                    Pair<String, List<byte[]>> pairE = e(new x(this.f54222j));
                    str = (String) pairE.first;
                    listSingletonList = (List) pairE.second;
                    listSingletonList2 = listSingletonList;
                    i12 = -1;
                    i13 = -1;
                    str3 = str;
                    boolean z17 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z17 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f18 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f18, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList8 = new ArrayList(2);
                                arrayList8.add(e.T2);
                                arrayList8.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList8);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA8 = kVar.a(this.f54215c, i16);
                    this.V = sVarA8;
                    sVarA8.c(formatV);
                    return;
                case 8:
                    byte[] bArr2 = this.f54222j;
                    listSingletonList2 = Collections.singletonList(new byte[]{bArr2[0], bArr2[1], bArr2[2], bArr2[3]});
                    i12 = -1;
                    i13 = -1;
                    str3 = "application/dvbsubs";
                    boolean z18 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z18 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f19 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f19, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList9 = new ArrayList(2);
                                arrayList9.add(e.T2);
                                arrayList9.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList9);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA9 = kVar.a(this.f54215c, i16);
                    this.V = sVarA9;
                    sVarA9.c(formatV);
                    return;
                case 10:
                    androidx.media2.exoplayer.external.video.a aVarB = androidx.media2.exoplayer.external.video.a.b(new x(this.f54222j));
                    list = aVarB.f57750a;
                    this.W = aVarB.f57751b;
                    str = "video/avc";
                    listSingletonList2 = list;
                    i12 = -1;
                    i13 = -1;
                    str3 = str;
                    boolean z19 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z19 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f110 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f110, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList10 = new ArrayList(2);
                                arrayList10.add(e.T2);
                                arrayList10.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList10);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA10 = kVar.a(this.f54215c, i16);
                    this.V = sVarA10;
                    sVarA10.c(formatV);
                    return;
                case 11:
                    listSingletonList2 = Collections.singletonList(this.f54222j);
                    i12 = -1;
                    i13 = -1;
                    str3 = "application/vobsub";
                    boolean z110 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z110 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f111 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f111, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList11 = new ArrayList(2);
                                arrayList11.add(e.T2);
                                arrayList11.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList11);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA11 = kVar.a(this.f54215c, i16);
                    this.V = sVarA11;
                    sVarA11.c(formatV);
                    return;
                case 12:
                    str6 = "audio/vnd.dts.hd";
                    i12 = -1;
                    i13 = -1;
                    str3 = str6;
                    listSingletonList2 = null;
                    boolean z111 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z111 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f112 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f112, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList12 = new ArrayList(2);
                                arrayList12.add(e.T2);
                                arrayList12.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList12);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA12 = kVar.a(this.f54215c, i16);
                    this.V = sVarA12;
                    sVarA12.c(formatV);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(this.f54222j);
                    str = "audio/mp4a-latm";
                    listSingletonList2 = listSingletonList;
                    i12 = -1;
                    i13 = -1;
                    str3 = str;
                    boolean z112 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z112 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f113 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f113, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList13 = new ArrayList(2);
                                arrayList13.add(e.T2);
                                arrayList13.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList13);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA13 = kVar.a(this.f54215c, i16);
                    this.V = sVarA13;
                    sVarA13.c(formatV);
                    return;
                case 14:
                    str6 = "audio/ac3";
                    i12 = -1;
                    i13 = -1;
                    str3 = str6;
                    listSingletonList2 = null;
                    boolean z113 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z113 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f114 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f114, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList14 = new ArrayList(2);
                                arrayList14.add(e.T2);
                                arrayList14.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList14);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA14 = kVar.a(this.f54215c, i16);
                    this.V = sVarA14;
                    sVarA14.c(formatV);
                    return;
                case 15:
                case 21:
                    str6 = "audio/vnd.dts";
                    i12 = -1;
                    i13 = -1;
                    str3 = str6;
                    listSingletonList2 = null;
                    boolean z114 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z114 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f115 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f115, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList15 = new ArrayList(2);
                                arrayList15.add(e.T2);
                                arrayList15.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList15);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA15 = kVar.a(this.f54215c, i16);
                    this.V = sVarA15;
                    sVarA15.c(formatV);
                    return;
                case 16:
                    str6 = "video/av01";
                    i12 = -1;
                    i13 = -1;
                    str3 = str6;
                    listSingletonList2 = null;
                    boolean z115 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z115 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f116 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f116, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList16 = new ArrayList(2);
                                arrayList16.add(e.T2);
                                arrayList16.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList16);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA16 = kVar.a(this.f54215c, i16);
                    this.V = sVarA16;
                    sVarA16.c(formatV);
                    return;
                case 17:
                    str6 = "video/x-vnd.on2.vp8";
                    i12 = -1;
                    i13 = -1;
                    str3 = str6;
                    listSingletonList2 = null;
                    boolean z116 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z116 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f117 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f117, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList17 = new ArrayList(2);
                                arrayList17.add(e.T2);
                                arrayList17.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList17);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA17 = kVar.a(this.f54215c, i16);
                    this.V = sVarA17;
                    sVarA17.c(formatV);
                    return;
                case 18:
                    str6 = "video/x-vnd.on2.vp9";
                    i12 = -1;
                    i13 = -1;
                    str3 = str6;
                    listSingletonList2 = null;
                    boolean z117 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z117 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f118 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f118, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList18 = new ArrayList(2);
                                arrayList18.add(e.T2);
                                arrayList18.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList18);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA18 = kVar.a(this.f54215c, i16);
                    this.V = sVarA18;
                    sVarA18.c(formatV);
                    return;
                case 19:
                    i12 = -1;
                    i13 = -1;
                    str3 = "application/pgs";
                    listSingletonList2 = null;
                    boolean z118 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z118 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f119 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f119, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList19 = new ArrayList(2);
                                arrayList19.add(e.T2);
                                arrayList19.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList19);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA19 = kVar.a(this.f54215c, i16);
                    this.V = sVarA19;
                    sVarA19.c(formatV);
                    return;
                case 20:
                    str6 = "video/x-unknown";
                    i12 = -1;
                    i13 = -1;
                    str3 = str6;
                    listSingletonList2 = null;
                    boolean z119 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z119 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f1110 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f1110, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList110 = new ArrayList(2);
                                arrayList110.add(e.T2);
                                arrayList110.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList110);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA110 = kVar.a(this.f54215c, i16);
                    this.V = sVarA110;
                    sVarA110.c(formatV);
                    return;
                case 22:
                    iU = q0.U(this.N);
                    if (iU == 0) {
                        int i24 = this.N;
                        StringBuilder sb3 = new StringBuilder("audio/x-unknown".length() + 60);
                        sb3.append("Unsupported PCM bit depth: ");
                        sb3.append(i24);
                        sb3.append(". Setting mimeType to ");
                        sb3.append("audio/x-unknown");
                        p.l(e.f54124g0, sb3.toString());
                        str3 = "audio/x-unknown";
                        i12 = -1;
                        i13 = -1;
                        listSingletonList2 = null;
                        boolean z1110 = this.T;
                        if (this.S) {
                            i14 = 2;
                        } else {
                            i14 = 0;
                        }
                        i15 = (z1110 ? 1 : 0) | i14;
                        if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                            if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                                if (this.f54228p == 0) {
                                    i20 = this.f54226n;
                                    if (i20 == -1) {
                                        i20 = this.f54224l;
                                    }
                                    this.f54226n = i20;
                                    i21 = this.f54227o;
                                    if (i21 == -1) {
                                        i21 = this.f54225m;
                                    }
                                    this.f54227o = i21;
                                }
                                i17 = this.f54226n;
                                if (i17 != -1) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                float f1111 = f10;
                                if (this.f54235w) {
                                    colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                                } else {
                                    colorInfo = null;
                                }
                                if ("htc_video_rotA-000".equals(this.f54213a)) {
                                    i22 = 0;
                                } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                    i22 = 90;
                                } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                    i22 = 180;
                                } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                    i22 = 270;
                                }
                                if (this.f54229q == 0) {
                                    i18 = i22;
                                } else {
                                    i18 = i22;
                                }
                                formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f1111, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                                i16 = 2;
                            } else {
                                str4 = str3;
                                if ("application/x-subrip".equals(str4)) {
                                    formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                                } else if ("text/x-ssa".equals(str4)) {
                                    ArrayList arrayList111 = new ArrayList(2);
                                    arrayList111.add(e.T2);
                                    arrayList111.add(this.f54222j);
                                    formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList111);
                                } else {
                                    if ("application/vobsub".equals(str4)) {
                                    }
                                    formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                                }
                                i16 = 3;
                            }
                            break;
                        } else {
                            formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                            i16 = 1;
                        }
                        s sVarA111 = kVar.a(this.f54215c, i16);
                        this.V = sVarA111;
                        sVarA111.c(formatV);
                        return;
                    }
                    i12 = iU;
                    i13 = -1;
                    str3 = str6;
                    listSingletonList2 = null;
                    boolean z1111 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z1111 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f1112 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f1112, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList112 = new ArrayList(2);
                                arrayList112.add(e.T2);
                                arrayList112.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList112);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA112 = kVar.a(this.f54215c, i16);
                    this.V = sVarA112;
                    sVarA112.c(formatV);
                    return;
                case 23:
                    str3 = "text/x-ssa";
                    i12 = -1;
                    i13 = -1;
                    listSingletonList2 = null;
                    boolean z1112 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z1112 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f1113 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f1113, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList113 = new ArrayList(2);
                                arrayList113.add(e.T2);
                                arrayList113.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList113);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA113 = kVar.a(this.f54215c, i16);
                    this.V = sVarA113;
                    sVarA113.c(formatV);
                    return;
                case 24:
                    androidx.media2.exoplayer.external.video.c cVarA = androidx.media2.exoplayer.external.video.c.a(new x(this.f54222j));
                    list = cVarA.f57758a;
                    this.W = cVarA.f57759b;
                    str = "video/hevc";
                    listSingletonList2 = list;
                    i12 = -1;
                    i13 = -1;
                    str3 = str;
                    boolean z1113 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z1113 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f1114 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f1114, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList114 = new ArrayList(2);
                                arrayList114.add(e.T2);
                                arrayList114.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList114);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA114 = kVar.a(this.f54215c, i16);
                    this.V = sVarA114;
                    sVarA114.c(formatV);
                    return;
                case 25:
                    str3 = "application/x-subrip";
                    i12 = -1;
                    i13 = -1;
                    listSingletonList2 = null;
                    boolean z1114 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z1114 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f1115 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f1115, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList115 = new ArrayList(2);
                                arrayList115.add(e.T2);
                                arrayList115.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList115);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA115 = kVar.a(this.f54215c, i16);
                    this.V = sVarA115;
                    sVarA115.c(formatV);
                    return;
                case 26:
                    str6 = "video/mpeg2";
                    i12 = -1;
                    i13 = -1;
                    str3 = str6;
                    listSingletonList2 = null;
                    boolean z1115 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z1115 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f1116 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f1116, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList116 = new ArrayList(2);
                                arrayList116.add(e.T2);
                                arrayList116.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList116);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA116 = kVar.a(this.f54215c, i16);
                    this.V = sVarA116;
                    sVarA116.c(formatV);
                    return;
                case 27:
                    str6 = "audio/eac3";
                    i12 = -1;
                    i13 = -1;
                    str3 = str6;
                    listSingletonList2 = null;
                    boolean z1116 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z1116 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f1117 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f1117, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList117 = new ArrayList(2);
                                arrayList117.add(e.T2);
                                arrayList117.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList117);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA117 = kVar.a(this.f54215c, i16);
                    this.V = sVarA117;
                    sVarA117.c(formatV);
                    return;
                case 28:
                    listSingletonList = Collections.singletonList(this.f54222j);
                    str = "audio/flac";
                    listSingletonList2 = listSingletonList;
                    i12 = -1;
                    i13 = -1;
                    str3 = str;
                    boolean z1117 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z1117 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f1118 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f1118, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList118 = new ArrayList(2);
                                arrayList118.add(e.T2);
                                arrayList118.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList118);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA118 = kVar.a(this.f54215c, i16);
                    this.V = sVarA118;
                    sVarA118.c(formatV);
                    return;
                case 29:
                    listG = new ArrayList<>(3);
                    listG.add(this.f54222j);
                    listG.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.P).array());
                    listG.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.Q).array());
                    str = "audio/opus";
                    i11 = e.S0;
                    listSingletonList2 = listG;
                    i13 = i11;
                    i12 = -1;
                    str3 = str;
                    boolean z1118 = this.T;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z1118 ? 1 : 0) | i14;
                    if (androidx.media2.exoplayer.external.util.s.l(str3)) {
                        if (androidx.media2.exoplayer.external.util.s.n(str3)) {
                            if (this.f54228p == 0) {
                                i20 = this.f54226n;
                                if (i20 == -1) {
                                    i20 = this.f54224l;
                                }
                                this.f54226n = i20;
                                i21 = this.f54227o;
                                if (i21 == -1) {
                                    i21 = this.f54225m;
                                }
                                this.f54227o = i21;
                            }
                            i17 = this.f54226n;
                            if (i17 != -1) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            float f1119 = f10;
                            if (this.f54235w) {
                                colorInfo = new ColorInfo(this.f54236x, this.f54238z, this.f54237y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f54213a)) {
                                i22 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f54213a)) {
                                i22 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f54213a)) {
                                i22 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f54213a)) {
                                i22 = 270;
                            }
                            if (this.f54229q == 0) {
                                i18 = i22;
                            } else {
                                i18 = i22;
                            }
                            formatV = Format.I(Integer.toString(i10), str3, null, -1, i13, this.f54224l, this.f54225m, -1.0f, listSingletonList2, i18, f1119, this.f54233u, this.f54234v, colorInfo, this.f54223k);
                            i16 = 2;
                        } else {
                            str4 = str3;
                            if ("application/x-subrip".equals(str4)) {
                                formatV = Format.B(Integer.toString(i10), str4, i15, this.U, this.f54223k);
                            } else if ("text/x-ssa".equals(str4)) {
                                ArrayList arrayList119 = new ArrayList(2);
                                arrayList119.add(e.T2);
                                arrayList119.add(this.f54222j);
                                formatV = Format.D(Integer.toString(i10), str4, null, -1, i15, this.U, -1, this.f54223k, Long.MAX_VALUE, arrayList119);
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                formatV = Format.v(Integer.toString(i10), str4, null, -1, i15, listSingletonList2, this.U, this.f54223k);
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        formatV = Format.r(Integer.toString(i10), str3, null, -1, i13, this.M, this.O, i12, listSingletonList2, this.f54223k, i15, this.U);
                        i16 = 1;
                    }
                    s sVarA119 = kVar.a(this.f54215c, i16);
                    this.V = sVarA119;
                    sVarA119.c(formatV);
                    return;
                default:
                    throw new k0("Unrecognized codec identifier.");
            }
        }

        public void d() {
            C0509e c0509e = this.R;
            if (c0509e != null) {
                c0509e.a(this);
            }
        }

        public void h() {
            C0509e c0509e = this.R;
            if (c0509e != null) {
                c0509e.b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.extractor.mkv.e$e, reason: collision with other inner class name */
    private static final class C0509e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f54239a = new byte[10];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f54240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f54241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f54242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f54243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f54244f;

        public void a(d track) {
            if (!this.f54240b || this.f54241c <= 0) {
                return;
            }
            track.V.b(this.f54243e, this.f54244f, this.f54242d, 0, track.f54221i);
            this.f54241c = 0;
        }

        public void b() {
            this.f54240b = false;
        }

        public void c(d track, long timeUs) {
            if (this.f54240b) {
                int i10 = this.f54241c;
                int i11 = i10 + 1;
                this.f54241c = i11;
                if (i10 == 0) {
                    this.f54243e = timeUs;
                }
                if (i11 >= 16) {
                    track.V.b(this.f54243e, this.f54244f, this.f54242d, 0, track.f54221i);
                    this.f54241c = 0;
                }
            }
        }

        public void d(j input, int blockFlags, int size) throws InterruptedException, IOException {
            if (!this.f54240b) {
                input.i(this.f54239a, 0, 10);
                input.l();
                if (androidx.media2.exoplayer.external.audio.a.j(this.f54239a) == 0) {
                    return;
                }
                this.f54240b = true;
                this.f54241c = 0;
            }
            if (this.f54241c == 0) {
                this.f54244f = blockFlags;
                this.f54242d = 0;
            }
            this.f54242d += size;
        }
    }

    public e() {
        this(0);
    }

    private void C(j input, d track, int size) throws InterruptedException, IOException {
        int i10;
        if (M0.equals(track.f54214b)) {
            D(input, O2, size);
            return;
        }
        if (N0.equals(track.f54214b)) {
            D(input, U2, size);
            return;
        }
        s sVar = track.V;
        boolean z10 = true;
        if (!this.T) {
            if (track.f54219g) {
                this.Q &= -1073741825;
                if (!this.U) {
                    input.readFully(this.f54194j.f57720a, 0, 1);
                    this.S++;
                    byte b10 = this.f54194j.f57720a[0];
                    if ((b10 & 128) == 128) {
                        throw new k0("Extension bit is set in signal byte");
                    }
                    this.X = b10;
                    this.U = true;
                }
                byte b11 = this.X;
                if ((b11 & 1) == 1) {
                    boolean z11 = (b11 & 2) == 2;
                    this.Q |= 1073741824;
                    if (!this.V) {
                        input.readFully(this.f54199o.f57720a, 0, 8);
                        this.S += 8;
                        this.V = true;
                        x xVar = this.f54194j;
                        xVar.f57720a[0] = (byte) ((z11 ? 128 : 0) | 8);
                        xVar.Q(0);
                        sVar.d(this.f54194j, 1);
                        this.f54184a0++;
                        this.f54199o.Q(0);
                        sVar.d(this.f54199o, 8);
                        this.f54184a0 += 8;
                    }
                    if (z11) {
                        if (!this.W) {
                            input.readFully(this.f54194j.f57720a, 0, 1);
                            this.S++;
                            this.f54194j.Q(0);
                            this.Y = this.f54194j.D();
                            this.W = true;
                        }
                        int i11 = this.Y * 4;
                        this.f54194j.M(i11);
                        input.readFully(this.f54194j.f57720a, 0, i11);
                        this.S += i11;
                        short s10 = (short) ((this.Y / 2) + 1);
                        int i12 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f54202r;
                        if (byteBuffer == null || byteBuffer.capacity() < i12) {
                            this.f54202r = ByteBuffer.allocate(i12);
                        }
                        this.f54202r.position(0);
                        this.f54202r.putShort(s10);
                        int i13 = 0;
                        int i14 = 0;
                        while (true) {
                            i10 = this.Y;
                            if (i13 >= i10) {
                                break;
                            }
                            int iH = this.f54194j.H();
                            if (i13 % 2 == 0) {
                                this.f54202r.putShort((short) (iH - i14));
                            } else {
                                this.f54202r.putInt(iH - i14);
                            }
                            i13++;
                            i14 = iH;
                        }
                        int i15 = (size - this.S) - i14;
                        if (i10 % 2 == 1) {
                            this.f54202r.putInt(i15);
                        } else {
                            this.f54202r.putShort((short) i15);
                            this.f54202r.putInt(0);
                        }
                        this.f54200p.O(this.f54202r.array(), i12);
                        sVar.d(this.f54200p, i12);
                        this.f54184a0 += i12;
                    }
                }
            } else {
                byte[] bArr = track.f54220h;
                if (bArr != null) {
                    this.f54197m.O(bArr, bArr.length);
                }
            }
            if (track.f54218f > 0) {
                this.Q |= 268435456;
                this.f54201q.L();
                this.f54194j.M(4);
                x xVar2 = this.f54194j;
                byte[] bArr2 = xVar2.f57720a;
                bArr2[0] = (byte) ((size >> 24) & 255);
                bArr2[1] = (byte) ((size >> 16) & 255);
                bArr2[2] = (byte) ((size >> 8) & 255);
                bArr2[3] = (byte) (size & 255);
                sVar.d(xVar2, 4);
                this.f54184a0 += 4;
            }
            this.T = true;
        }
        int iD = size + this.f54197m.d();
        if (!f54166u0.equals(track.f54214b) && !f54169v0.equals(track.f54214b)) {
            if (track.R != null) {
                if (this.f54197m.d() != 0) {
                    z10 = false;
                }
                androidx.media2.exoplayer.external.util.a.i(z10);
                track.R.d(input, this.Q, iD);
            }
            while (true) {
                int i16 = this.S;
                if (i16 >= iD) {
                    break;
                } else {
                    v(input, sVar, iD - i16);
                }
            }
        } else {
            byte[] bArr3 = this.f54193i.f57720a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i17 = track.W;
            int i18 = 4 - i17;
            while (this.S < iD) {
                int i19 = this.Z;
                if (i19 == 0) {
                    w(input, bArr3, i18, i17);
                    this.f54193i.Q(0);
                    this.Z = this.f54193i.H();
                    this.f54192h.Q(0);
                    sVar.d(this.f54192h, 4);
                    this.f54184a0 += 4;
                } else {
                    this.Z = i19 - v(input, sVar, i19);
                }
            }
        }
        if (f54178y0.equals(track.f54214b)) {
            this.f54195k.Q(0);
            sVar.d(this.f54195k, 4);
            this.f54184a0 += 4;
        }
    }

    private void D(j input, byte[] samplePrefix, int size) throws InterruptedException, IOException {
        int length = samplePrefix.length + size;
        if (this.f54198n.b() < length) {
            this.f54198n.f57720a = Arrays.copyOf(samplePrefix, length + size);
        } else {
            System.arraycopy(samplePrefix, 0, this.f54198n.f57720a, 0, samplePrefix.length);
        }
        input.readFully(this.f54198n.f57720a, samplePrefix.length, size);
        this.f54198n.M(length);
    }

    private androidx.media2.exoplayer.external.extractor.q h() {
        q qVar;
        q qVar2;
        if (this.f54204t != -1 && this.f54207w != -9223372036854775807L && (qVar = this.F) != null && qVar.c() != 0 && (qVar2 = this.G) != null && qVar2.c() == this.F.c()) {
            int iC = this.F.c();
            int[] iArr = new int[iC];
            long[] jArr = new long[iC];
            long[] jArr2 = new long[iC];
            long[] jArr3 = new long[iC];
            int i10 = 0;
            for (int i11 = 0; i11 < iC; i11++) {
                jArr3[i11] = this.F.b(i11);
                jArr[i11] = this.f54204t + this.G.b(i11);
            }
            while (true) {
                int i12 = iC - 1;
                if (i10 >= i12) {
                    iArr[i12] = (int) ((this.f54204t + this.f54203s) - jArr[i12]);
                    jArr2[i12] = this.f54207w - jArr3[i12];
                    this.F = null;
                    this.G = null;
                    return new androidx.media2.exoplayer.external.extractor.c(iArr, jArr, jArr2, jArr3);
                }
                int i13 = i10 + 1;
                iArr[i10] = (int) (jArr[i13] - jArr[i10]);
                jArr2[i10] = jArr3[i13] - jArr3[i10];
                i10 = i13;
            }
        }
        this.F = null;
        this.G = null;
        return new androidx.media2.exoplayer.external.extractor.q.b(this.f54207w);
    }

    private void i(d track, long timeUs) {
        C0509e c0509e = track.R;
        if (c0509e != null) {
            c0509e.c(track, timeUs);
        } else {
            if (M0.equals(track.f54214b)) {
                j(track, S2, 19, 1000L, Q2);
            } else if (N0.equals(track.f54214b)) {
                j(track, Y2, 21, 10000L, X2);
            }
            if ((this.Q & 268435456) != 0) {
                int iD = this.f54201q.d();
                track.V.d(this.f54201q, iD);
                this.f54184a0 += iD;
            }
            track.V.b(timeUs, this.Q, this.f54184a0, 0, track.f54221i);
        }
        this.f54185b0 = true;
        x();
    }

    private void j(d track, String timecodeFormat, int endTimecodeOffset, long lastTimecodeValueScalingFactor, byte[] emptyTimecode) {
        z(this.f54198n.f57720a, this.K, timecodeFormat, endTimecodeOffset, lastTimecodeValueScalingFactor, emptyTimecode);
        s sVar = track.V;
        x xVar = this.f54198n;
        sVar.d(xVar, xVar.d());
        this.f54184a0 += this.f54198n.d();
    }

    private static int[] l(int[] array, int length) {
        if (array == null) {
            return new int[length];
        }
        return array.length >= length ? array : new int[Math.max(array.length * 2, length)];
    }

    private static boolean q(String codecId) {
        return f54145n0.equals(codecId) || f54148o0.equals(codecId) || f54151p0.equals(codecId) || f54154q0.equals(codecId) || f54157r0.equals(codecId) || f54160s0.equals(codecId) || f54163t0.equals(codecId) || f54166u0.equals(codecId) || f54169v0.equals(codecId) || f54172w0.equals(codecId) || f54175x0.equals(codecId) || f54181z0.equals(codecId) || f54178y0.equals(codecId) || A0.equals(codecId) || B0.equals(codecId) || C0.equals(codecId) || D0.equals(codecId) || E0.equals(codecId) || F0.equals(codecId) || G0.equals(codecId) || H0.equals(codecId) || I0.equals(codecId) || J0.equals(codecId) || K0.equals(codecId) || L0.equals(codecId) || M0.equals(codecId) || N0.equals(codecId) || O0.equals(codecId) || P0.equals(codecId) || Q0.equals(codecId);
    }

    static final /* synthetic */ i[] s() {
        return new i[]{new e()};
    }

    private boolean t(androidx.media2.exoplayer.external.extractor.p seekPosition, long currentPosition) {
        if (this.B) {
            this.D = currentPosition;
            seekPosition.f54695a = this.C;
            this.B = false;
            return true;
        }
        if (this.f54209y) {
            long j10 = this.D;
            if (j10 != -1) {
                seekPosition.f54695a = j10;
                this.D = -1L;
                return true;
            }
        }
        return false;
    }

    private void u(j input, int requiredLength) throws InterruptedException, IOException {
        if (this.f54194j.d() >= requiredLength) {
            return;
        }
        if (this.f54194j.b() < requiredLength) {
            x xVar = this.f54194j;
            byte[] bArr = xVar.f57720a;
            xVar.O(Arrays.copyOf(bArr, Math.max(bArr.length * 2, requiredLength)), this.f54194j.d());
        }
        x xVar2 = this.f54194j;
        input.readFully(xVar2.f57720a, xVar2.d(), requiredLength - this.f54194j.d());
        this.f54194j.P(requiredLength);
    }

    private int v(j input, s output, int length) throws InterruptedException, IOException {
        int iA;
        int iA2 = this.f54197m.a();
        if (iA2 > 0) {
            iA = Math.min(length, iA2);
            output.d(this.f54197m, iA);
        } else {
            iA = output.a(input, length, false);
        }
        this.S += iA;
        this.f54184a0 += iA;
        return iA;
    }

    private void w(j input, byte[] target, int offset, int length) throws InterruptedException, IOException {
        int iMin = Math.min(length, this.f54197m.a());
        input.readFully(target, offset + iMin, length - iMin);
        if (iMin > 0) {
            this.f54197m.i(target, offset, iMin);
        }
        this.S += length;
    }

    private void x() {
        this.S = 0;
        this.f54184a0 = 0;
        this.Z = 0;
        this.T = false;
        this.U = false;
        this.W = false;
        this.Y = 0;
        this.X = (byte) 0;
        this.V = false;
        this.f54197m.L();
    }

    private long y(long unscaledTimecode) throws k0 {
        long j10 = this.f54205u;
        if (j10 != -9223372036854775807L) {
            return q0.I0(unscaledTimecode, j10, 1000L);
        }
        throw new k0("Can't scale timecode prior to timecodeScale being set.");
    }

    private static void z(byte[] subripSampleData, long durationUs, String timecodeFormat, int endTimecodeOffset, long lastTimecodeValueScalingFactor, byte[] emptyTimecode) {
        byte[] bArrI0;
        if (durationUs == -9223372036854775807L) {
            bArrI0 = emptyTimecode;
        } else {
            int i10 = (int) (durationUs / 3600000000L);
            long j10 = durationUs - (((long) (i10 * 3600)) * 1000000);
            int i11 = (int) (j10 / 60000000);
            long j11 = j10 - (((long) (i11 * 60)) * 1000000);
            int i12 = (int) (j11 / 1000000);
            bArrI0 = q0.i0(String.format(Locale.US, timecodeFormat, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j11 - (((long) i12) * 1000000)) / lastTimecodeValueScalingFactor))));
        }
        System.arraycopy(bArrI0, 0, subripSampleData, endTimecodeOffset, emptyTimecode.length);
    }

    @androidx.annotation.i
    protected void A(int id2, long contentPosition, long contentSize) throws k0 {
        if (id2 == 160) {
            this.f54186c0 = false;
            return;
        }
        if (id2 == f54167u1) {
            this.f54208x = new d();
            return;
        }
        if (id2 == f54117d2) {
            this.H = false;
            return;
        }
        if (id2 == f54113c1) {
            this.f54210z = -1;
            this.A = -1L;
            return;
        }
        if (id2 == X1) {
            this.f54208x.f54219g = true;
            return;
        }
        if (id2 == f54171v2) {
            this.f54208x.f54235w = true;
            return;
        }
        if (id2 == Z0) {
            long j10 = this.f54204t;
            if (j10 != -1 && j10 != contentPosition) {
                throw new k0("Multiple Segment elements not supported");
            }
            this.f54204t = contentPosition;
            this.f54203s = contentSize;
            return;
        }
        if (id2 == f54114c2) {
            this.F = new q();
            this.G = new q();
        } else if (id2 == f54131i1 && !this.f54209y) {
            if (this.f54191g && this.C != -1) {
                this.B = true;
            } else {
                this.f54188d0.q(new androidx.media2.exoplayer.external.extractor.q.b(this.f54207w));
                this.f54209y = true;
            }
        }
    }

    @androidx.annotation.i
    protected void B(int id2, String value) throws k0 {
        if (id2 == 134) {
            this.f54208x.f54214b = value;
            return;
        }
        if (id2 != 17026) {
            if (id2 == B1) {
                this.f54208x.f54213a = value;
            } else if (id2 == f54129h2) {
                this.f54208x.U = value;
            }
        } else if (!f54142m0.equals(value) && !f54139l0.equals(value)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 22);
            sb2.append("DocType ");
            sb2.append(value);
            sb2.append(" not supported");
            throw new k0(sb2.toString());
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    @androidx.annotation.i
    public void a(long position, long timeUs) {
        this.E = -9223372036854775807L;
        this.I = 0;
        this.f54187d.reset();
        this.f54189e.e();
        x();
        for (int i10 = 0; i10 < this.f54190f.size(); i10++) {
            this.f54190f.valueAt(i10).h();
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public final boolean b(j input) throws InterruptedException, IOException {
        return new f().b(input);
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public final void c(k output) {
        this.f54188d0 = output;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public final int f(j input, androidx.media2.exoplayer.external.extractor.p seekPosition) throws InterruptedException, IOException {
        this.f54185b0 = false;
        boolean zB = true;
        while (zB && !this.f54185b0) {
            zB = this.f54187d.b(input);
            if (zB && t(seekPosition, input.getPosition())) {
                return 1;
            }
        }
        if (zB) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f54190f.size(); i10++) {
            this.f54190f.valueAt(i10).d();
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x027f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0283  */
    /* JADX WARN: Code duplicated, block: B:109:0x0286  */
    /* JADX WARN: Code duplicated, block: B:96:0x0265  */
    /* JADX WARN: Code duplicated, block: B:97:0x026a  */
    @androidx.annotation.i
    protected void g(int id2, int contentSize, j input) throws InterruptedException, IOException {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        byte b10;
        int i20;
        int i21;
        int i22;
        int i23 = 2;
        int i24 = 1;
        int i25 = 0;
        if (id2 != f54143m1 && id2 != f54137k1) {
            if (id2 == f54158r1) {
                if (this.I != 2) {
                    return;
                }
                o(this.f54190f.get(this.O), this.R, input, contentSize);
                return;
            }
            if (id2 == W1) {
                byte[] bArr = new byte[contentSize];
                this.f54208x.f54220h = bArr;
                input.readFully(bArr, 0, contentSize);
                return;
            }
            if (id2 == Z1) {
                byte[] bArr2 = new byte[contentSize];
                input.readFully(bArr2, 0, contentSize);
                this.f54208x.f54221i = new s.a(1, bArr2, 0, 0);
                return;
            }
            if (id2 == f54116d1) {
                Arrays.fill(this.f54196l.f57720a, (byte) 0);
                input.readFully(this.f54196l.f57720a, 4 - contentSize, contentSize);
                this.f54196l.Q(0);
                this.f54210z = (int) this.f54196l.F();
                return;
            }
            if (id2 == D1) {
                byte[] bArr3 = new byte[contentSize];
                this.f54208x.f54222j = bArr3;
                input.readFully(bArr3, 0, contentSize);
                return;
            } else if (id2 == f54138k2) {
                byte[] bArr4 = new byte[contentSize];
                this.f54208x.f54233u = bArr4;
                input.readFully(bArr4, 0, contentSize);
                return;
            } else {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unexpected id: ");
                sb2.append(id2);
                throw new k0(sb2.toString());
            }
        }
        if (this.I == 0) {
            this.O = (int) this.f54189e.d(input, false, true, 8);
            this.P = this.f54189e.b();
            this.K = -9223372036854775807L;
            this.I = 1;
            this.f54194j.L();
        }
        d dVar = this.f54190f.get(this.O);
        if (dVar == null) {
            input.o(contentSize - this.P);
            this.I = 0;
            return;
        }
        if (this.I == 1) {
            u(input, 3);
            int i26 = (this.f54194j.f57720a[2] & 6) >> 1;
            if (i26 == 0) {
                this.M = 1;
                int[] iArrL = l(this.N, 1);
                this.N = iArrL;
                iArrL[0] = (contentSize - this.P) - 3;
            } else {
                if (id2 != f54137k1) {
                    throw new k0("Lacing only supported in SimpleBlocks.");
                }
                int i27 = 4;
                u(input, 4);
                int i28 = (this.f54194j.f57720a[3] & 255) + 1;
                this.M = i28;
                int[] iArrL2 = l(this.N, i28);
                this.N = iArrL2;
                if (i26 == 2) {
                    int i29 = (contentSize - this.P) - 4;
                    int i30 = this.M;
                    Arrays.fill(iArrL2, 0, i30, i29 / i30);
                } else {
                    if (i26 == 1) {
                        int i31 = 0;
                        int i32 = 0;
                        while (true) {
                            i17 = this.M;
                            if (i31 >= i17 - 1) {
                                break;
                            }
                            this.N[i31] = 0;
                            while (true) {
                                i18 = i27 + 1;
                                u(input, i18);
                                int i33 = this.f54194j.f57720a[i27] & 255;
                                int[] iArr = this.N;
                                i19 = iArr[i31] + i33;
                                iArr[i31] = i19;
                                if (i33 != 255) {
                                    break;
                                } else {
                                    i27 = i18;
                                }
                            }
                            i32 += i19;
                            i31++;
                            i27 = i18;
                        }
                        this.N[i17 - 1] = ((contentSize - this.P) - i27) - i32;
                    } else {
                        if (i26 != 3) {
                            StringBuilder sb3 = new StringBuilder(36);
                            sb3.append("Unexpected lacing value: ");
                            sb3.append(i26);
                            throw new k0(sb3.toString());
                        }
                        int i34 = 0;
                        int i35 = 0;
                        while (true) {
                            int i36 = this.M;
                            if (i34 >= i36 - 1) {
                                i11 = i23;
                                i12 = i24;
                                i13 = i25;
                                this.N[i36 - 1] = ((contentSize - this.P) - i27) - i35;
                                break;
                            }
                            this.N[i34] = i25;
                            int i37 = i27 + 1;
                            u(input, i37);
                            if (this.f54194j.f57720a[i27] == 0) {
                                throw new k0("No valid varint length mask found");
                            }
                            int i38 = i25;
                            while (true) {
                                if (i38 >= 8) {
                                    i14 = i23;
                                    i15 = i24;
                                    i16 = i25;
                                    j10 = 0;
                                    break;
                                }
                                i15 = i24;
                                int i39 = i15 << (7 - i38);
                                i16 = i25;
                                if ((this.f54194j.f57720a[i27] & i39) != 0) {
                                    i37 += i38;
                                    u(input, i37);
                                    j10 = (~i39) & this.f54194j.f57720a[i27] & 255;
                                    int i40 = i27 + 1;
                                    while (i40 < i37) {
                                        j10 = (j10 << 8) | ((long) (this.f54194j.f57720a[i40] & 255));
                                        i40++;
                                        i23 = i23;
                                    }
                                    i14 = i23;
                                    if (i34 <= 0) {
                                        break;
                                    }
                                    j10 -= (1 << ((i38 * 7) + 6)) - 1;
                                    break;
                                }
                                i38++;
                                i25 = i16;
                                i24 = i15;
                            }
                            i27 = i37;
                            if (j10 < g3.f12261h || j10 > g3.f12256c) {
                                throw new k0("EBML lacing sample size out of range.");
                            }
                            int i41 = (int) j10;
                            int[] iArr2 = this.N;
                            if (i34 != 0) {
                                i41 += iArr2[i34 - 1];
                            }
                            iArr2[i34] = i41;
                            i35 += i41;
                            i34++;
                            i25 = i16;
                            i24 = i15;
                            i23 = i14;
                        }
                    }
                    byte[] bArr5 = this.f54194j.f57720a;
                    this.J = this.E + y((bArr5[i12] & 255) | (bArr5[i13] << 8));
                    b10 = this.f54194j.f57720a[i11];
                    if ((b10 & 8) == 8) {
                        i20 = i12;
                    } else {
                        i20 = i13;
                    }
                    if (dVar.f54216d != i11 || (id2 == f54137k1 && (b10 & 128) == 128)) {
                        i21 = i12;
                    } else {
                        i21 = i13;
                    }
                    if (i20 != 0) {
                        i22 = Integer.MIN_VALUE;
                    } else {
                        i22 = i13;
                    }
                    this.Q = i21 | i22;
                    this.I = 2;
                    this.L = i13;
                    i10 = f54137k1;
                }
            }
            i11 = 2;
            i12 = 1;
            i13 = 0;
            byte[] bArr6 = this.f54194j.f57720a;
            this.J = this.E + y((bArr6[i12] & 255) | (bArr6[i13] << 8));
            b10 = this.f54194j.f57720a[i11];
            if ((b10 & 8) == 8) {
                i20 = i12;
            } else {
                i20 = i13;
            }
            if (dVar.f54216d != i11) {
                i21 = i12;
            } else {
                i21 = i12;
            }
            if (i20 != 0) {
                i22 = Integer.MIN_VALUE;
            } else {
                i22 = i13;
            }
            this.Q = i21 | i22;
            this.I = 2;
            this.L = i13;
            i10 = f54137k1;
        } else {
            i10 = f54137k1;
        }
        if (id2 != i10) {
            C(input, dVar, this.N[0]);
            return;
        }
        while (true) {
            int i42 = this.L;
            if (i42 >= this.M) {
                this.I = 0;
                return;
            } else {
                C(input, dVar, this.N[i42]);
                i(dVar, this.J + ((long) ((this.L * dVar.f54217e) / 1000)));
                this.L++;
            }
        }
    }

    @androidx.annotation.i
    protected void k(int id2) throws k0 {
        if (id2 == 160) {
            if (this.I != 2) {
                return;
            }
            if (!this.f54186c0) {
                this.Q |= 1;
            }
            i(this.f54190f.get(this.O), this.J);
            this.I = 0;
            return;
        }
        if (id2 == f54167u1) {
            if (q(this.f54208x.f54214b)) {
                d dVar = this.f54208x;
                dVar.c(this.f54188d0, dVar.f54215c);
                SparseArray<d> sparseArray = this.f54190f;
                d dVar2 = this.f54208x;
                sparseArray.put(dVar2.f54215c, dVar2);
            }
            this.f54208x = null;
            return;
        }
        if (id2 == f54113c1) {
            int i10 = this.f54210z;
            if (i10 != -1) {
                long j10 = this.A;
                if (j10 != -1) {
                    if (i10 == f54114c2) {
                        this.C = j10;
                        return;
                    }
                    return;
                }
            }
            throw new k0("Mandatory element SeekID or SeekPosition not found");
        }
        if (id2 == R1) {
            d dVar3 = this.f54208x;
            if (dVar3.f54219g) {
                if (dVar3.f54221i == null) {
                    throw new k0("Encrypted Track found but ContentEncKeyID was not found");
                }
                dVar3.f54223k = new DrmInitData(new DrmInitData.SchemeData(androidx.media2.exoplayer.external.c.f53739w1, "video/webm", this.f54208x.f54221i.f54704b));
                return;
            }
            return;
        }
        if (id2 == Q1) {
            d dVar4 = this.f54208x;
            if (dVar4.f54219g && dVar4.f54220h != null) {
                throw new k0("Combining encryption and compression is not supported");
            }
            return;
        }
        if (id2 == 357149030) {
            if (this.f54205u == -9223372036854775807L) {
                this.f54205u = 1000000L;
            }
            long j11 = this.f54206v;
            if (j11 != -9223372036854775807L) {
                this.f54207w = y(j11);
                return;
            }
            return;
        }
        if (id2 == f54164t1) {
            if (this.f54190f.size() == 0) {
                throw new k0("No valid tracks were found");
            }
            this.f54188d0.l();
        } else if (id2 == f54114c2 && !this.f54209y) {
            this.f54188d0.q(h());
            this.f54209y = true;
        }
    }

    @androidx.annotation.i
    protected void m(int id2, double value) throws k0 {
        if (id2 == P1) {
            this.f54208x.O = (int) value;
            return;
        }
        if (id2 == f54128h1) {
            this.f54206v = (long) value;
            return;
        }
        switch (id2) {
            case f54174w2 /* 21969 */:
                this.f54208x.C = (float) value;
                break;
            case f54177x2 /* 21970 */:
                this.f54208x.D = (float) value;
                break;
            case f54180y2 /* 21971 */:
                this.f54208x.E = (float) value;
                break;
            case f54183z2 /* 21972 */:
                this.f54208x.F = (float) value;
                break;
            case A2 /* 21973 */:
                this.f54208x.G = (float) value;
                break;
            case B2 /* 21974 */:
                this.f54208x.H = (float) value;
                break;
            case C2 /* 21975 */:
                this.f54208x.I = (float) value;
                break;
            case D2 /* 21976 */:
                this.f54208x.J = (float) value;
                break;
            case E2 /* 21977 */:
                this.f54208x.K = (float) value;
                break;
            case F2 /* 21978 */:
                this.f54208x.L = (float) value;
                break;
            default:
                switch (id2) {
                    case f54141l2 /* 30323 */:
                        this.f54208x.f54230r = (float) value;
                        break;
                    case f54144m2 /* 30324 */:
                        this.f54208x.f54231s = (float) value;
                        break;
                    case f54147n2 /* 30325 */:
                        this.f54208x.f54232t = (float) value;
                        break;
                }
                break;
        }
    }

    @androidx.annotation.i
    protected int n(int id2) {
        switch (id2) {
            case 131:
            case 136:
            case 155:
            case 159:
            case H1 /* 176 */:
            case f54120e2 /* 179 */:
            case I1 /* 186 */:
            case f54170v1 /* 215 */:
            case f54134j1 /* 231 */:
            case f54155q1 /* 238 */:
            case f54126g2 /* 241 */:
            case 251:
            case V1 /* 16980 */:
            case Y0 /* 17029 */:
            case W0 /* 17143 */:
            case Y1 /* 18401 */:
            case f54111b2 /* 18408 */:
            case S1 /* 20529 */:
            case T1 /* 20530 */:
            case f54119e1 /* 21420 */:
            case f54150o2 /* 21432 */:
            case J1 /* 21680 */:
            case L1 /* 21682 */:
            case K1 /* 21690 */:
            case f54179y1 /* 21930 */:
            case f54156q2 /* 21945 */:
            case f54159r2 /* 21946 */:
            case f54162s2 /* 21947 */:
            case f54165t2 /* 21948 */:
            case f54168u2 /* 21949 */:
            case A1 /* 21998 */:
            case E1 /* 22186 */:
            case F1 /* 22203 */:
            case O1 /* 25188 */:
            case f54135j2 /* 30321 */:
            case f54182z1 /* 2352003 */:
            case f54125g1 /* 2807729 */:
                return 2;
            case 134:
            case 17026:
            case B1 /* 21358 */:
            case f54129h2 /* 2274716 */:
                return 3;
            case 160:
            case f54152p1 /* 166 */:
            case f54167u1 /* 174 */:
            case f54123f2 /* 183 */:
            case f54117d2 /* 187 */:
            case 224:
            case M1 /* 225 */:
            case f54108a2 /* 18407 */:
            case f54113c1 /* 19899 */:
            case U1 /* 20532 */:
            case X1 /* 20533 */:
            case f54153p2 /* 21936 */:
            case f54171v2 /* 21968 */:
            case R1 /* 25152 */:
            case Q1 /* 28032 */:
            case f54149o1 /* 30113 */:
            case f54132i2 /* 30320 */:
            case f54110b1 /* 290298740 */:
            case 357149030:
            case f54164t1 /* 374648427 */:
            case Z0 /* 408125543 */:
            case V0 /* 440786851 */:
            case f54114c2 /* 475249515 */:
            case f54131i1 /* 524531317 */:
                return 1;
            case f54143m1 /* 161 */:
            case f54137k1 /* 163 */:
            case f54158r1 /* 165 */:
            case W1 /* 16981 */:
            case Z1 /* 18402 */:
            case f54116d1 /* 21419 */:
            case D1 /* 25506 */:
            case f54138k2 /* 30322 */:
                return 4;
            case P1 /* 181 */:
            case f54128h1 /* 17545 */:
            case f54174w2 /* 21969 */:
            case f54177x2 /* 21970 */:
            case f54180y2 /* 21971 */:
            case f54183z2 /* 21972 */:
            case A2 /* 21973 */:
            case B2 /* 21974 */:
            case C2 /* 21975 */:
            case D2 /* 21976 */:
            case E2 /* 21977 */:
            case F2 /* 21978 */:
            case f54141l2 /* 30323 */:
            case f54144m2 /* 30324 */:
            case f54147n2 /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    protected void o(d track, int blockAddId, j input, int contentSize) throws InterruptedException, IOException {
        if (blockAddId != 4 || !f54148o0.equals(track.f54214b)) {
            input.o(contentSize);
        } else {
            this.f54201q.M(contentSize);
            input.readFully(this.f54201q.f57720a, 0, contentSize);
        }
    }

    @androidx.annotation.i
    protected void p(int id2, long value) throws k0 {
        if (id2 == S1) {
            if (value == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingOrder ");
            sb2.append(value);
            sb2.append(" not supported");
            throw new k0(sb2.toString());
        }
        if (id2 == T1) {
            if (value == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(55);
            sb3.append("ContentEncodingScope ");
            sb3.append(value);
            sb3.append(" not supported");
            throw new k0(sb3.toString());
        }
        switch (id2) {
            case 131:
                this.f54208x.f54216d = (int) value;
                return;
            case 136:
                this.f54208x.T = value == 1;
                return;
            case 155:
                this.K = y(value);
                return;
            case 159:
                this.f54208x.M = (int) value;
                return;
            case H1 /* 176 */:
                this.f54208x.f54224l = (int) value;
                return;
            case f54120e2 /* 179 */:
                this.F.a(y(value));
                return;
            case I1 /* 186 */:
                this.f54208x.f54225m = (int) value;
                return;
            case f54170v1 /* 215 */:
                this.f54208x.f54215c = (int) value;
                return;
            case f54134j1 /* 231 */:
                this.E = y(value);
                return;
            case f54155q1 /* 238 */:
                this.R = (int) value;
                return;
            case f54126g2 /* 241 */:
                if (this.H) {
                    return;
                }
                this.G.a(value);
                this.H = true;
                return;
            case 251:
                this.f54186c0 = true;
                return;
            case V1 /* 16980 */:
                if (value == 3) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(50);
                sb4.append("ContentCompAlgo ");
                sb4.append(value);
                sb4.append(" not supported");
                throw new k0(sb4.toString());
            case Y0 /* 17029 */:
                if (value < 1 || value > 2) {
                    StringBuilder sb5 = new StringBuilder(53);
                    sb5.append("DocTypeReadVersion ");
                    sb5.append(value);
                    sb5.append(" not supported");
                    throw new k0(sb5.toString());
                }
                return;
            case W0 /* 17143 */:
                if (value == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(50);
                sb6.append("EBMLReadVersion ");
                sb6.append(value);
                sb6.append(" not supported");
                throw new k0(sb6.toString());
            case Y1 /* 18401 */:
                if (value == 5) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(49);
                sb7.append("ContentEncAlgo ");
                sb7.append(value);
                sb7.append(" not supported");
                throw new k0(sb7.toString());
            case f54111b2 /* 18408 */:
                if (value == 1) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(56);
                sb8.append("AESSettingsCipherMode ");
                sb8.append(value);
                sb8.append(" not supported");
                throw new k0(sb8.toString());
            case f54119e1 /* 21420 */:
                this.A = value + this.f54204t;
                return;
            case f54150o2 /* 21432 */:
                int i10 = (int) value;
                if (i10 == 0) {
                    this.f54208x.f54234v = 0;
                    return;
                }
                if (i10 == 1) {
                    this.f54208x.f54234v = 2;
                    return;
                } else if (i10 == 3) {
                    this.f54208x.f54234v = 1;
                    return;
                } else {
                    if (i10 != 15) {
                        return;
                    }
                    this.f54208x.f54234v = 3;
                    return;
                }
            case J1 /* 21680 */:
                this.f54208x.f54226n = (int) value;
                return;
            case L1 /* 21682 */:
                this.f54208x.f54228p = (int) value;
                return;
            case K1 /* 21690 */:
                this.f54208x.f54227o = (int) value;
                return;
            case f54179y1 /* 21930 */:
                this.f54208x.S = value == 1;
                return;
            case A1 /* 21998 */:
                this.f54208x.f54218f = (int) value;
                return;
            case E1 /* 22186 */:
                this.f54208x.P = value;
                return;
            case F1 /* 22203 */:
                this.f54208x.Q = value;
                return;
            case O1 /* 25188 */:
                this.f54208x.N = (int) value;
                return;
            case f54135j2 /* 30321 */:
                int i11 = (int) value;
                if (i11 == 0) {
                    this.f54208x.f54229q = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f54208x.f54229q = 1;
                    return;
                } else if (i11 == 2) {
                    this.f54208x.f54229q = 2;
                    return;
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    this.f54208x.f54229q = 3;
                    return;
                }
            case f54182z1 /* 2352003 */:
                this.f54208x.f54217e = (int) value;
                return;
            case f54125g1 /* 2807729 */:
                this.f54205u = value;
                return;
            default:
                switch (id2) {
                    case f54156q2 /* 21945 */:
                        int i12 = (int) value;
                        if (i12 == 1) {
                            this.f54208x.f54238z = 2;
                            return;
                        } else {
                            if (i12 != 2) {
                                return;
                            }
                            this.f54208x.f54238z = 1;
                            return;
                        }
                    case f54159r2 /* 21946 */:
                        int i13 = (int) value;
                        if (i13 != 1) {
                            if (i13 == 16) {
                                this.f54208x.f54237y = 6;
                                return;
                            } else if (i13 == 18) {
                                this.f54208x.f54237y = 7;
                                return;
                            } else if (i13 != 6 && i13 != 7) {
                                return;
                            }
                        }
                        this.f54208x.f54237y = 3;
                        return;
                    case f54162s2 /* 21947 */:
                        d dVar = this.f54208x;
                        dVar.f54235w = true;
                        int i14 = (int) value;
                        if (i14 == 1) {
                            dVar.f54236x = 1;
                            return;
                        }
                        if (i14 == 9) {
                            dVar.f54236x = 6;
                            return;
                        } else {
                            if (i14 == 4 || i14 == 5 || i14 == 6 || i14 == 7) {
                                dVar.f54236x = 2;
                                return;
                            }
                            return;
                        }
                    case f54165t2 /* 21948 */:
                        this.f54208x.A = (int) value;
                        return;
                    case f54168u2 /* 21949 */:
                        this.f54208x.B = (int) value;
                        return;
                    default:
                        return;
                }
        }
    }

    @androidx.annotation.i
    protected boolean r(int id2) {
        return id2 == 357149030 || id2 == f54131i1 || id2 == f54114c2 || id2 == f54164t1;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public final void release() {
    }

    public e(int flags) {
        this(new androidx.media2.exoplayer.external.extractor.mkv.a(), flags);
    }

    e(androidx.media2.exoplayer.external.extractor.mkv.c reader, int flags) {
        this.f54204t = -1L;
        this.f54205u = -9223372036854775807L;
        this.f54206v = -9223372036854775807L;
        this.f54207w = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.f54187d = reader;
        reader.c(new c());
        boolean z10 = true;
        if ((flags & 1) != 0) {
            z10 = false;
        }
        this.f54191g = z10;
        this.f54189e = new g();
        this.f54190f = new SparseArray<>();
        this.f54194j = new x(4);
        this.f54195k = new x(ByteBuffer.allocate(4).putInt(-1).array());
        this.f54196l = new x(4);
        this.f54192h = new x(t.f57686b);
        this.f54193i = new x(4);
        this.f54197m = new x();
        this.f54198n = new x();
        this.f54199o = new x(8);
        this.f54200p = new x();
        this.f54201q = new x();
    }
}
