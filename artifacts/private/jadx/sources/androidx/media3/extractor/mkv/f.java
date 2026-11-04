package androidx.media3.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.p0;
import androidx.collection.g3;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.j;
import androidx.media3.common.k;
import androidx.media3.common.s0;
import androidx.media3.common.util.a0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import androidx.media3.common.v0;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.n;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.r;
import androidx.media3.extractor.s;
import androidx.media3.extractor.t;
import androidx.media3.extractor.u0;
import androidx.media3.extractor.w;
import com.google.common.collect.l6;
import il.m;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class f implements r {
    private static final String A0 = "V_MPEGH/ISO/HEVC";
    private static final int A1 = 251;
    private static final int A2 = 21432;
    private static final String B0 = "V_MS/VFW/FOURCC";
    private static final int B1 = 374648427;
    private static final int B2 = 21936;
    private static final String C0 = "V_THEORA";
    private static final int C1 = 174;
    private static final int C2 = 21945;
    private static final String D0 = "A_VORBIS";
    private static final int D1 = 215;
    private static final int D2 = 21938;
    private static final String E0 = "A_OPUS";
    private static final int E1 = 131;
    private static final int E2 = 21946;
    private static final String F0 = "A_AAC";
    private static final int F1 = 136;
    private static final int F2 = 21947;
    private static final String G0 = "A_MPEG/L2";
    private static final int G1 = 21930;
    private static final int G2 = 21948;
    private static final String H0 = "A_MPEG/L3";
    private static final int H1 = 2352003;
    private static final int H2 = 21949;
    private static final String I0 = "A_AC3";
    private static final int I1 = 21998;
    private static final int I2 = 21968;
    private static final String J0 = "A_EAC3";
    private static final int J1 = 16868;
    private static final int J2 = 21969;
    private static final String K0 = "A_TRUEHD";
    private static final int K1 = 16871;
    private static final int K2 = 21970;
    private static final String L0 = "A_DTS";
    private static final int L1 = 16877;
    private static final int L2 = 21971;
    private static final String M0 = "A_DTS/EXPRESS";
    private static final int M1 = 21358;
    private static final int M2 = 21972;
    private static final String N0 = "A_DTS/LOSSLESS";
    private static final int N1 = 134;
    private static final int N2 = 21973;
    private static final String O0 = "A_FLAC";
    private static final int O1 = 25506;
    private static final int O2 = 21974;
    private static final String P0 = "A_MS/ACM";
    private static final int P1 = 22186;
    private static final int P2 = 21975;
    private static final String Q0 = "A_PCM/INT/LIT";
    private static final int Q1 = 22203;
    private static final int Q2 = 21976;
    private static final String R0 = "A_PCM/INT/BIG";
    private static final int R1 = 30114;
    private static final int R2 = 21977;
    private static final String S0 = "A_PCM/FLOAT/IEEE";
    private static final int S1 = 224;
    private static final int S2 = 21978;
    private static final String T0 = "S_TEXT/UTF8";
    private static final int T1 = 176;
    private static final int T2 = 4;
    private static final String U0 = "S_TEXT/ASS";
    private static final int U1 = 186;
    private static final int U2 = 1685480259;
    private static final String V0 = "S_TEXT/WEBVTT";
    private static final int V1 = 21680;
    private static final int V2 = 1685485123;
    private static final String W0 = "S_VOBSUB";
    private static final int W1 = 21690;
    private static final int W2 = 0;
    private static final String X0 = "S_HDMV/PGS";
    private static final int X1 = 21682;
    private static final int X2 = 1;
    private static final String Y0 = "S_DVBSUB";
    private static final int Y1 = 225;
    private static final int Y2 = 2;
    private static final int Z0 = 8192;
    private static final int Z1 = 159;
    private static final int Z2 = 3;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private static final int f67673a1 = 5760;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    private static final int f67674a2 = 25188;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    private static final int f67675a3 = 1482049860;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private static final int f67676b1 = 8;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    private static final int f67677b2 = 181;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    private static final int f67678b3 = 859189832;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private static final int f67679c1 = 2;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    private static final int f67680c2 = 28032;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    private static final int f67681c3 = 826496599;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private static final int f67682d1 = 440786851;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    private static final int f67683d2 = 25152;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static final int f67685e1 = 17143;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    private static final int f67686e2 = 20529;

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    private static final int f67687e3 = 19;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private static final int f67688f1 = 17026;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    private static final int f67689f2 = 20530;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    private static final long f67690f3 = 1000;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private static final int f67691g1 = 17029;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    private static final int f67692g2 = 20532;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final String f67693g3 = "%02d:%02d:%02d,%03d";

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private static final int f67694h1 = 408125543;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    private static final int f67695h2 = 16980;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f67697i0 = 1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static final int f67698i1 = 357149030;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    private static final int f67699i2 = 16981;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f67701j0 = 2;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private static final int f67702j1 = 290298740;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    private static final int f67703j2 = 20533;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final int f67704j3 = 21;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private static final int f67706k1 = 19899;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    private static final int f67707k2 = 18401;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final long f67708k3 = 10000;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final String f67709l0 = "MatroskaExtractor";

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private static final int f67710l1 = 21419;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    private static final int f67711l2 = 18402;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final String f67712l3 = "%01d:%02d:%02d:%02d";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final int f67713m0 = -1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private static final int f67714m1 = 21420;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    private static final int f67715m2 = 18407;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final int f67717n0 = 0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private static final int f67718n1 = 357149030;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    private static final int f67719n2 = 18408;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final int f67720n3 = 25;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final int f67721o0 = 1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private static final int f67722o1 = 2807729;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    private static final int f67723o2 = 475249515;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final long f67724o3 = 1000;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f67725p0 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f67726p1 = 17545;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f67727p2 = 187;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final String f67728p3 = "%02d:%02d:%02d.%03d";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final String f67729q0 = "matroska";

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private static final int f67730q1 = 524531317;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    private static final int f67731q2 = 179;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final int f67732q3 = 18;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final String f67733r0 = "webm";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private static final int f67734r1 = 231;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    private static final int f67735r2 = 183;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final int f67736r3 = 65534;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final String f67737s0 = "V_VP8";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private static final int f67738s1 = 163;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    private static final int f67739s2 = 241;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final int f67740s3 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final String f67741t0 = "V_VP9";

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private static final int f67742t1 = 160;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    private static final int f67743t2 = 2274716;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final String f67745u0 = "V_AV1";

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private static final int f67746u1 = 161;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    private static final int f67747u2 = 30320;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final Map<String, Integer> f67748u3;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final String f67749v0 = "V_MPEG2";

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private static final int f67750v1 = 155;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    private static final int f67751v2 = 30321;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final String f67752w0 = "V_MPEG4/ISO/SP";

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private static final int f67753w1 = 30113;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    private static final int f67754w2 = 30322;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final String f67755x0 = "V_MPEG4/ISO/ASP";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final int f67756x1 = 166;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f67757x2 = 30323;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final String f67758y0 = "V_MPEG4/ISO/AP";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final int f67759y1 = 238;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final int f67760y2 = 30324;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final String f67761z0 = "V_MPEG4/ISO/AVC";

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private static final int f67762z1 = 165;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    private static final int f67763z2 = 30325;

    @p0
    private d A;
    private boolean B;
    private int C;
    private long D;
    private boolean E;
    private long F;
    private long G;
    private long H;

    @p0
    private a0 I;

    @p0
    private a0 J;
    private boolean K;
    private boolean L;
    private int M;
    private long N;
    private long O;
    private int P;
    private int Q;
    private int[] R;
    private int S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private long X;
    private int Y;
    private int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f67764a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f67765b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f67766c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.extractor.mkv.c f67767d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f67768d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f67769e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f67770e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray<d> f67771f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private byte f67772f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f67773g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f67774g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f67775h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private t f67776h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media3.extractor.text.r.a f67777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o0 f67778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final o0 f67779k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final o0 f67780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final o0 f67781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o0 f67782n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final o0 f67783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final o0 f67784p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final o0 f67785q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final o0 f67786r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final o0 f67787s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ByteBuffer f67788t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f67789u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f67790v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f67791w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f67792x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f67793y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f67794z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @Deprecated
    public static final w f67705k0 = new w() { // from class: androidx.media3.extractor.mkv.e
        @Override // androidx.media3.extractor.w
        public final r[] c() {
            return f.e();
        }
    };

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final byte[] f67684d3 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final byte[] f67696h3 = k1.Q0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final byte[] f67700i3 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final byte[] f67716m3 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final UUID f67744t3 = new UUID(72057594037932032L, -9223371306706625679L);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private final class c implements androidx.media3.extractor.mkv.b {
        private c() {
        }

        @Override // androidx.media3.extractor.mkv.b
        public void a(int i10) throws v0 {
            f.this.r(i10);
        }

        @Override // androidx.media3.extractor.mkv.b
        public void b(int i10, double d10) throws v0 {
            f.this.u(i10, d10);
        }

        @Override // androidx.media3.extractor.mkv.b
        public void c(int i10, long j10) throws v0 {
            f.this.A(i10, j10);
        }

        @Override // androidx.media3.extractor.mkv.b
        public void d(int i10, String str) throws v0 {
            f.this.K(i10, str);
        }

        @Override // androidx.media3.extractor.mkv.b
        public void e(int i10, long j10, long j11) throws v0 {
            f.this.J(i10, j10, j11);
        }

        @Override // androidx.media3.extractor.mkv.b
        public int f(int i10) {
            return f.this.x(i10);
        }

        @Override // androidx.media3.extractor.mkv.b
        public boolean g(int i10) {
            return f.this.C(i10);
        }

        @Override // androidx.media3.extractor.mkv.b
        public void h(int i10, int i11, s sVar) throws IOException {
            f.this.o(i10, i11, sVar);
        }
    }

    protected static final class d {

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        private static final int f67796b0 = 0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        private static final int f67797c0 = 50000;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        private static final int f67798d0 = 1000;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        private static final int f67799e0 = 200;
        public byte[] P;
        public androidx.media3.extractor.v0 V;
        public boolean W;
        public u0 Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f67800a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f67801a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f67802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f67803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f67804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f67805e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f67806f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f67807g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f67808h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f67809i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f67810j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public u0.a f67811k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public byte[] f67812l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public DrmInitData f67813m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f67814n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f67815o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f67816p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f67817q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f67818r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f67819s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f67820t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f67821u = 0.0f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f67822v = 0.0f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public float f67823w = 0.0f;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public byte[] f67824x = null;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f67825y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f67826z = false;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = 1000;
        public int E = 200;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public float N = -1.0f;
        public float O = -1.0f;
        public int Q = 1;
        public int R = -1;
        public int S = 8000;
        public long T = 0;
        public long U = 0;
        public boolean X = true;
        private String Y = "eng";

        protected d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @il.d({"output"})
        public void f() {
            androidx.media3.common.util.a.g(this.Z);
        }

        @il.d({"codecPrivate"})
        private byte[] g(String str) throws v0 {
            byte[] bArr = this.f67812l;
            if (bArr != null) {
                return bArr;
            }
            throw v0.a("Missing CodecPrivate for codec " + str, null);
        }

        @p0
        private byte[] h() {
            if (this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f || this.N == -1.0f || this.O == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.L * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.M * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.N + 0.5f));
            byteBufferOrder.putShort((short) (this.O + 0.5f));
            byteBufferOrder.putShort((short) this.D);
            byteBufferOrder.putShort((short) this.E);
            return bArr;
        }

        private static Pair<String, List<byte[]>> k(o0 o0Var) throws v0 {
            try {
                o0Var.b0(16);
                long jA = o0Var.A();
                if (jA == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jA == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jA != 826496599) {
                    z.n(f.f67709l0, "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArrE = o0Var.e();
                for (int iF = o0Var.f() + 20; iF < bArrE.length - 4; iF++) {
                    if (bArrE[iF] == 0 && bArrE[iF + 1] == 0 && bArrE[iF + 2] == 1 && bArrE[iF + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrE, iF, bArrE.length)));
                    }
                }
                throw v0.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw v0.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean l(o0 o0Var) throws v0 {
            try {
                int iD = o0Var.D();
                if (iD == 1) {
                    return true;
                }
                if (iD == 65534) {
                    o0Var.a0(24);
                    if (o0Var.E() == f.f67744t3.getMostSignificantBits() && o0Var.E() == f.f67744t3.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw v0.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> m(byte[] bArr) throws v0 {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw v0.a("Error parsing vorbis codec private", null);
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if ((i10 & 255) != 255) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + (i10 & 255);
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + (i11 & 255);
                if (bArr[i17] != 1) {
                    throw v0.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw v0.a("Error parsing vorbis codec private", null);
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw v0.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw v0.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o(boolean z10) {
            if (f.E0.equals(this.f67803c)) {
                return z10;
            }
            return this.f67807g > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:221:0x0498  */
        /* JADX WARN: Code duplicated, block: B:226:0x04b1  */
        /* JADX WARN: Code duplicated, block: B:227:0x04b3  */
        /* JADX WARN: Code duplicated, block: B:230:0x04c0  */
        /* JADX WARN: Code duplicated, block: B:231:0x04d2  */
        /* JADX WARN: Code duplicated, block: B:233:0x04d8  */
        /* JADX WARN: Code duplicated, block: B:235:0x04dc  */
        /* JADX WARN: Code duplicated, block: B:237:0x04e1  */
        /* JADX WARN: Code duplicated, block: B:240:0x04e9  */
        /* JADX WARN: Code duplicated, block: B:242:0x04ee  */
        /* JADX WARN: Code duplicated, block: B:245:0x04f3  */
        /* JADX WARN: Code duplicated, block: B:248:0x0501  */
        /* JADX WARN: Code duplicated, block: B:251:0x0507  */
        /* JADX WARN: Code duplicated, block: B:254:0x053a  */
        /* JADX WARN: Code duplicated, block: B:259:0x055a  */
        /* JADX WARN: Code duplicated, block: B:265:0x0573  */
        /* JADX WARN: Code duplicated, block: B:266:0x0575  */
        /* JADX WARN: Code duplicated, block: B:268:0x057f  */
        /* JADX WARN: Code duplicated, block: B:269:0x0582  */
        /* JADX WARN: Code duplicated, block: B:271:0x058c  */
        /* JADX WARN: Code duplicated, block: B:277:0x05a4  */
        /* JADX WARN: Code duplicated, block: B:279:0x05cb  */
        /* JADX WARN: Code duplicated, block: B:281:0x05d1  */
        /* JADX WARN: Code duplicated, block: B:297:0x05ff  */
        /* JADX WARN: Code duplicated, block: B:302:0x061c  */
        /* JADX WARN: Code duplicated, block: B:303:0x061f  */
        /* JADX WARN: Code duplicated, block: B:4:0x0017  */
        @il.d({"this.output"})
        @m({"codecId"})
        public void i(t tVar, int i10) throws v0 {
            byte b10;
            List<byte[]> listSingletonList;
            String str;
            int i11;
            int i12;
            List<byte[]> list;
            String str2;
            String str3;
            int i13;
            androidx.media3.common.w.b bVar;
            int i14;
            int iIntValue;
            int i15;
            float f10;
            int i16;
            int i17;
            int i18;
            String str4;
            n nVarA;
            String str5 = this.f67803c;
            str5.getClass();
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
                    b10 = 16;
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
                case "A_PCM/FLOAT/IEEE":
                    b10 = com.google.common.base.c.f116473z;
                    break;
                case "A_PCM/INT/BIG":
                    b10 = com.google.common.base.c.A;
                    break;
                case "A_PCM/INT/LIT":
                    b10 = 24;
                    break;
                case "S_TEXT/ASS":
                    b10 = com.google.common.base.c.C;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b10 = com.google.common.base.c.D;
                    break;
                case "S_TEXT/WEBVTT":
                    b10 = com.google.common.base.c.E;
                    break;
                case "S_TEXT/UTF8":
                    b10 = com.google.common.base.c.F;
                    break;
                case "V_MPEG2":
                    b10 = com.google.common.base.c.G;
                    break;
                case "A_EAC3":
                    b10 = com.google.common.base.c.H;
                    break;
                case "A_FLAC":
                    b10 = com.google.common.base.c.I;
                    break;
                case "A_OPUS":
                    b10 = 32;
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
                    byte[] bArr = this.f67812l;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str6 = "video/mp4v-es";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null && (nVarA = n.a(new o0(this.P))) != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z10 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i19 = i13 | (z10 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    } else if (s0.v(str3)) {
                        if (this.f67819s == 0) {
                            i17 = this.f67817q;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f67814n;
                            }
                            this.f67817q = i17;
                            i18 = this.f67818r;
                            if (i18 == -1) {
                                i18 = this.f67815o;
                            }
                            this.f67818r = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f67817q;
                        if (i15 != iIntValue || (i16 = this.f67818r) == iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = (this.f67815o * i15) / (this.f67814n * i16);
                        }
                        k kVarA = this.f67826z ? new k.b().d(this.A).c(this.C).e(this.B).f(h()).g(this.f67816p).b(this.f67816p).a() : null;
                        if (this.f67802b != null && f.f67748u3.containsKey(this.f67802b)) {
                            iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                        }
                        if (this.f67820t == 0 && Float.compare(this.f67821u, 0.0f) == 0 && Float.compare(this.f67822v, 0.0f) == 0) {
                            if (Float.compare(this.f67823w, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f67823w, -180.0f) != 0 || Float.compare(this.f67823w, 180.0f) == 0) {
                                iIntValue = 180;
                            } else if (Float.compare(this.f67823w, -90.0f) == 0) {
                                iIntValue = 270;
                            }
                        }
                        bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                            throw v0.a("Unexpected MIME type.", null);
                        }
                        i14 = 3;
                    }
                    if (this.f67802b != null && !f.f67748u3.containsKey(this.f67802b)) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE0 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN = bVarE0.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i19).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA;
                    u0VarA.e(wVarN);
                    return;
                case 2:
                    if (l(new o0(g(this.f67803c)))) {
                        int iB0 = k1.B0(this.R);
                        if (iB0 == 0) {
                            z.n(f.f67709l0, "Unsupported PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                        } else {
                            i11 = iB0;
                            listSingletonList = null;
                            str = null;
                            i12 = -1;
                        }
                        if (this.P != null) {
                            str = nVarA.f68158c;
                            str6 = "video/dolby-vision";
                        }
                        str3 = str6;
                        boolean z11 = this.X;
                        if (this.W) {
                            i13 = 2;
                        } else {
                            i13 = 0;
                        }
                        int i110 = i13 | (z11 ? 1 : 0);
                        bVar = new androidx.media3.common.w.b();
                        if (s0.q(str3)) {
                            if (s0.v(str3)) {
                                if (this.f67819s == 0) {
                                    i17 = this.f67817q;
                                    iIntValue = -1;
                                    if (i17 == -1) {
                                        i17 = this.f67814n;
                                    }
                                    this.f67817q = i17;
                                    i18 = this.f67818r;
                                    if (i18 == -1) {
                                        i18 = this.f67815o;
                                    }
                                    this.f67818r = i18;
                                } else {
                                    iIntValue = -1;
                                }
                                i15 = this.f67817q;
                                if (i15 != iIntValue) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.f67826z) {
                                }
                                if (this.f67802b != null) {
                                    iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                                }
                                if (this.f67820t == 0) {
                                    if (Float.compare(this.f67823w, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                                i14 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i14 = 3;
                            }
                            break;
                        } else {
                            bVar.R(this.Q).v0(this.S).o0(i11);
                            i14 = 1;
                        }
                        if (this.f67802b != null) {
                            bVar.h0(this.f67802b);
                        }
                        androidx.media3.common.w.b bVarE1 = bVar.e0(i10);
                        if (this.f67800a) {
                            str4 = "video/webm";
                        } else {
                            str4 = s0.f61310g;
                        }
                        androidx.media3.common.w wVarN2 = bVarE1.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i110).g0(listSingletonList).S(str).Y(this.f67813m).N();
                        u0 u0VarA2 = tVar.a(this.f67804d, i14);
                        this.Z = u0VarA2;
                        u0VarA2.e(wVarN2);
                        return;
                    }
                    z.n(f.f67709l0, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str = null;
                    str6 = "audio/x-unknown";
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z12 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i111 = i13 | (z12 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE2 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN3 = bVarE2.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i111).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA3 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA3;
                    u0VarA3.e(wVarN3);
                    return;
                case 3:
                    this.V = new androidx.media3.extractor.v0();
                    str6 = "audio/true-hd";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z13 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i112 = i13 | (z13 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE3 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN4 = bVarE3.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i112).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA4 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA4;
                    u0VarA4.e(wVarN4);
                    return;
                case 4:
                    listSingletonList = m(g(this.f67803c));
                    str6 = "audio/vorbis";
                    i12 = 8192;
                    str = null;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z14 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i113 = i13 | (z14 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE4 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN5 = bVarE4.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i113).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA5 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA5;
                    u0VarA5.e(wVarN5);
                    return;
                case 5:
                    str6 = "audio/mpeg-L2";
                    listSingletonList = null;
                    str = null;
                    i12 = 4096;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z15 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i114 = i13 | (z15 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE5 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN6 = bVarE5.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i114).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA6 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA6;
                    u0VarA6.e(wVarN6);
                    return;
                case 6:
                    str6 = "audio/mpeg";
                    listSingletonList = null;
                    str = null;
                    i12 = 4096;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z16 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i115 = i13 | (z16 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE6 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN7 = bVarE6.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i115).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA7 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA7;
                    u0VarA7.e(wVarN7);
                    return;
                case 7:
                    Pair<String, List<byte[]>> pairK = k(new o0(g(this.f67803c)));
                    str6 = (String) pairK.first;
                    listSingletonList = (List) pairK.second;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z17 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i116 = i13 | (z17 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE7 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN8 = bVarE7.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i116).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA8 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA8;
                    u0VarA8.e(wVarN8);
                    return;
                case 8:
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(g(this.f67803c), 0, bArr2, 0, 4);
                    listSingletonList = l6.G(bArr2);
                    str = null;
                    str6 = "application/dvbsubs";
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z18 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i117 = i13 | (z18 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE8 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN9 = bVarE8.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i117).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA9 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA9;
                    u0VarA9.e(wVarN9);
                    return;
                case 10:
                    androidx.media3.extractor.d dVarB = androidx.media3.extractor.d.b(new o0(g(this.f67803c)));
                    list = dVarB.f67182a;
                    this.f67801a0 = dVarB.f67183b;
                    str2 = dVarB.f67193l;
                    str6 = "video/avc";
                    List<byte[]> list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z19 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i118 = i13 | (z19 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE9 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN10 = bVarE9.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i118).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA10 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA10;
                    u0VarA10.e(wVarN10);
                    return;
                case 11:
                    listSingletonList = l6.G(g(this.f67803c));
                    str = null;
                    str6 = "application/vobsub";
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z110 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i119 = i13 | (z110 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE10 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN11 = bVarE10.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i119).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA11 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA11;
                    u0VarA11.e(wVarN11);
                    return;
                case 12:
                    str6 = "audio/vnd.dts.hd";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z111 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1110 = i13 | (z111 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE11 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN12 = bVarE11.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i1110).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA12 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA12;
                    u0VarA12.e(wVarN12);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(g(this.f67803c));
                    androidx.media3.extractor.a.c cVarF = androidx.media3.extractor.a.f(this.f67812l);
                    this.S = cVarF.f67007a;
                    this.Q = cVarF.f67008b;
                    str = cVarF.f67009c;
                    str6 = "audio/mp4a-latm";
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z112 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1111 = i13 | (z112 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE12 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN13 = bVarE12.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i1111).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA13 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA13;
                    u0VarA13.e(wVarN13);
                    return;
                case 14:
                    str6 = "audio/ac3";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z113 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1112 = i13 | (z113 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE13 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN14 = bVarE13.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i1112).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA14 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA14;
                    u0VarA14.e(wVarN14);
                    return;
                case 15:
                case 21:
                    str6 = "audio/vnd.dts";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z114 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1113 = i13 | (z114 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE14 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN15 = bVarE14.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i1113).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA15 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA15;
                    u0VarA15.e(wVarN15);
                    return;
                case 16:
                    byte[] bArr3 = this.f67812l;
                    listSingletonList = bArr3 == null ? null : l6.G(bArr3);
                    str6 = "video/av01";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z115 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1114 = i13 | (z115 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE15 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN16 = bVarE15.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i1114).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA16 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA16;
                    u0VarA16.e(wVarN16);
                    return;
                case 17:
                    str6 = "video/x-vnd.on2.vp8";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z116 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1115 = i13 | (z116 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE16 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN17 = bVarE16.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i1115).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA17 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA17;
                    u0VarA17.e(wVarN17);
                    return;
                case 18:
                    byte[] bArr4 = this.f67812l;
                    listSingletonList = bArr4 == null ? null : l6.G(bArr4);
                    str6 = "video/x-vnd.on2.vp9";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z117 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1116 = i13 | (z117 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE17 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN18 = bVarE17.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i1116).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA18 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA18;
                    u0VarA18.e(wVarN18);
                    return;
                case 19:
                    listSingletonList = null;
                    str = null;
                    str6 = "application/pgs";
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z118 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1117 = i13 | (z118 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE18 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN19 = bVarE18.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i1117).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA19 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA19;
                    u0VarA19.e(wVarN19);
                    return;
                case 20:
                    str6 = "video/x-unknown";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z119 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1118 = i13 | (z119 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE19 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN110 = bVarE19.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i1118).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA110 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA110;
                    u0VarA110.e(wVarN110);
                    return;
                case 22:
                    if (this.R == 32) {
                        listSingletonList = null;
                        str = null;
                        i12 = -1;
                        i11 = 4;
                    } else {
                        z.n(f.f67709l0, "Unsupported floating point PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str6 = "audio/x-unknown";
                        i12 = -1;
                        i11 = -1;
                    }
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1110 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1119 = i13 | (z1110 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE110 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN111 = bVarE110.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i1119).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA111 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA111;
                    u0VarA111.e(wVarN111);
                    return;
                case 23:
                    int i20 = this.R;
                    if (i20 == 8) {
                        listSingletonList = null;
                        str = null;
                        i11 = 3;
                    } else {
                        if (i20 == 16) {
                            i11 = 268435456;
                        } else if (i20 == 24) {
                            i11 = j.D;
                        } else {
                            if (i20 != 32) {
                                z.n(f.f67709l0, "Unsupported big endian PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                                listSingletonList = null;
                                str = null;
                                str6 = "audio/x-unknown";
                                i12 = -1;
                                i11 = -1;
                                if (this.P != null) {
                                    str = nVarA.f68158c;
                                    str6 = "video/dolby-vision";
                                }
                                str3 = str6;
                                boolean z1111 = this.X;
                                if (this.W) {
                                    i13 = 2;
                                } else {
                                    i13 = 0;
                                }
                                int i11110 = i13 | (z1111 ? 1 : 0);
                                bVar = new androidx.media3.common.w.b();
                                if (s0.q(str3)) {
                                    if (s0.v(str3)) {
                                        if (this.f67819s == 0) {
                                            i17 = this.f67817q;
                                            iIntValue = -1;
                                            if (i17 == -1) {
                                                i17 = this.f67814n;
                                            }
                                            this.f67817q = i17;
                                            i18 = this.f67818r;
                                            if (i18 == -1) {
                                                i18 = this.f67815o;
                                            }
                                            this.f67818r = i18;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        i15 = this.f67817q;
                                        if (i15 != iIntValue) {
                                            f10 = -1.0f;
                                        } else {
                                            f10 = -1.0f;
                                        }
                                        if (this.f67826z) {
                                        }
                                        if (this.f67802b != null) {
                                            iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                                        }
                                        if (this.f67820t == 0) {
                                            if (Float.compare(this.f67823w, 0.0f) == 0) {
                                                iIntValue = 0;
                                            } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                                iIntValue = 90;
                                            } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                                iIntValue = 180;
                                            } else {
                                                iIntValue = 180;
                                            }
                                        }
                                        bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                                        i14 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str3)) {
                                        }
                                        i14 = 3;
                                    }
                                    break;
                                } else {
                                    bVar.R(this.Q).v0(this.S).o0(i11);
                                    i14 = 1;
                                }
                                if (this.f67802b != null) {
                                    bVar.h0(this.f67802b);
                                }
                                androidx.media3.common.w.b bVarE111 = bVar.e0(i10);
                                if (this.f67800a) {
                                    str4 = "video/webm";
                                } else {
                                    str4 = s0.f61310g;
                                }
                                androidx.media3.common.w wVarN112 = bVarE111.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i11110).g0(listSingletonList).S(str).Y(this.f67813m).N();
                                u0 u0VarA112 = tVar.a(this.f67804d, i14);
                                this.Z = u0VarA112;
                                u0VarA112.e(wVarN112);
                                return;
                            }
                            i11 = j.F;
                        }
                        listSingletonList = null;
                        str = null;
                    }
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1112 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11111 = i13 | (z1112 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE112 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN113 = bVarE112.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i11111).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA113 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA113;
                    u0VarA113.e(wVarN113);
                    return;
                case 24:
                    int iB1 = k1.B0(this.R);
                    if (iB1 != 0) {
                        i11 = iB1;
                        listSingletonList = null;
                        str = null;
                        i12 = -1;
                        if (this.P != null) {
                            str = nVarA.f68158c;
                            str6 = "video/dolby-vision";
                        }
                        str3 = str6;
                        boolean z1113 = this.X;
                        if (this.W) {
                            i13 = 2;
                        } else {
                            i13 = 0;
                        }
                        int i11112 = i13 | (z1113 ? 1 : 0);
                        bVar = new androidx.media3.common.w.b();
                        if (s0.q(str3)) {
                            if (s0.v(str3)) {
                                if (this.f67819s == 0) {
                                    i17 = this.f67817q;
                                    iIntValue = -1;
                                    if (i17 == -1) {
                                        i17 = this.f67814n;
                                    }
                                    this.f67817q = i17;
                                    i18 = this.f67818r;
                                    if (i18 == -1) {
                                        i18 = this.f67815o;
                                    }
                                    this.f67818r = i18;
                                } else {
                                    iIntValue = -1;
                                }
                                i15 = this.f67817q;
                                if (i15 != iIntValue) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.f67826z) {
                                }
                                if (this.f67802b != null) {
                                    iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                                }
                                if (this.f67820t == 0) {
                                    if (Float.compare(this.f67823w, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                                i14 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i14 = 3;
                            }
                            break;
                        } else {
                            bVar.R(this.Q).v0(this.S).o0(i11);
                            i14 = 1;
                        }
                        if (this.f67802b != null) {
                            bVar.h0(this.f67802b);
                        }
                        androidx.media3.common.w.b bVarE113 = bVar.e0(i10);
                        if (this.f67800a) {
                            str4 = "video/webm";
                        } else {
                            str4 = s0.f61310g;
                        }
                        androidx.media3.common.w wVarN114 = bVarE113.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i11112).g0(listSingletonList).S(str).Y(this.f67813m).N();
                        u0 u0VarA114 = tVar.a(this.f67804d, i14);
                        this.Z = u0VarA114;
                        u0VarA114.e(wVarN114);
                        return;
                    }
                    z.n(f.f67709l0, "Unsupported little endian PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str = null;
                    str6 = "audio/x-unknown";
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1114 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11113 = i13 | (z1114 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE114 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN115 = bVarE114.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i11113).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA115 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA115;
                    u0VarA115.e(wVarN115);
                    return;
                case 25:
                    listSingletonList = l6.J(f.f67696h3, g(this.f67803c));
                    str6 = "text/x-ssa";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1115 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11114 = i13 | (z1115 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE115 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN116 = bVarE115.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i11114).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA116 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA116;
                    u0VarA116.e(wVarN116);
                    return;
                case 26:
                    h0 h0VarA = h0.a(new o0(g(this.f67803c)));
                    list = h0VarA.f67347a;
                    this.f67801a0 = h0VarA.f67348b;
                    str2 = h0VarA.f67360n;
                    str6 = "video/hevc";
                    List<byte[]> list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1116 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11115 = i13 | (z1116 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE116 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN117 = bVarE116.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i11115).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA117 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA117;
                    u0VarA117.e(wVarN117);
                    return;
                case 27:
                    str6 = "text/vtt";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1117 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11116 = i13 | (z1117 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE117 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN118 = bVarE117.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i11116).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA118 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA118;
                    u0VarA118.e(wVarN118);
                    return;
                case 28:
                    str6 = "application/x-subrip";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1118 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11117 = i13 | (z1118 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE118 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN119 = bVarE118.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i11117).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA119 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA119;
                    u0VarA119.e(wVarN119);
                    return;
                case 29:
                    str6 = "video/mpeg2";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1119 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11118 = i13 | (z1119 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE119 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN1110 = bVarE119.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i11118).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA1110 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA1110;
                    u0VarA1110.e(wVarN1110);
                    return;
                case 30:
                    str6 = "audio/eac3";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11110 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11119 = i13 | (z11110 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE1110 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN1111 = bVarE1110.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i11119).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA1111 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA1111;
                    u0VarA1111.e(wVarN1111);
                    return;
                case 31:
                    listSingletonList = Collections.singletonList(g(this.f67803c));
                    str6 = "audio/flac";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11111 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i111110 = i13 | (z11111 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE1111 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN1112 = bVarE1111.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i111110).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA1112 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA1112;
                    u0VarA1112.e(wVarN1112);
                    return;
                case 32:
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(g(this.f67803c));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.T).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.U).array());
                    str6 = "audio/opus";
                    i12 = f.f67673a1;
                    str = null;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f68158c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11112 = this.X;
                    if (this.W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i111111 = i13 | (z11112 ? 1 : 0);
                    bVar = new androidx.media3.common.w.b();
                    if (s0.q(str3)) {
                        if (s0.v(str3)) {
                            if (this.f67819s == 0) {
                                i17 = this.f67817q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f67814n;
                                }
                                this.f67817q = i17;
                                i18 = this.f67818r;
                                if (i18 == -1) {
                                    i18 = this.f67815o;
                                }
                                this.f67818r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f67817q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f67826z) {
                            }
                            if (this.f67802b != null) {
                                iIntValue = ((Integer) f.f67748u3.get(this.f67802b)).intValue();
                            }
                            if (this.f67820t == 0) {
                                if (Float.compare(this.f67823w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f67823w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f67823w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.B0(this.f67814n).d0(this.f67815o).q0(f10).t0(iIntValue).r0(this.f67824x).x0(this.f67825y).T(kVarA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i14 = 1;
                    }
                    if (this.f67802b != null) {
                        bVar.h0(this.f67802b);
                    }
                    androidx.media3.common.w.b bVarE1112 = bVar.e0(i10);
                    if (this.f67800a) {
                        str4 = "video/webm";
                    } else {
                        str4 = s0.f61310g;
                    }
                    androidx.media3.common.w wVarN1113 = bVarE1112.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i111111).g0(listSingletonList).S(str).Y(this.f67813m).N();
                    u0 u0VarA1113 = tVar.a(this.f67804d, i14);
                    this.Z = u0VarA1113;
                    u0VarA1113.e(wVarN1113);
                    return;
                default:
                    throw v0.a("Unrecognized codec identifier.", null);
            }
        }

        @m({"output"})
        public void j() {
            androidx.media3.extractor.v0 v0Var = this.V;
            if (v0Var != null) {
                v0Var.a(this.Z, this.f67811k);
            }
        }

        public void n() {
            androidx.media3.extractor.v0 v0Var = this.V;
            if (v0Var != null) {
                v0Var.b();
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f67748u3 = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public f() {
        this(new androidx.media3.extractor.mkv.a(), 2, androidx.media3.extractor.text.r.a.f68570a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean B(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(f67758y0)) {
                    b10 = 0;
                }
                break;
            case -2095575984:
                if (str.equals(f67752w0)) {
                    b10 = 1;
                }
                break;
            case -1985379776:
                if (str.equals(P0)) {
                    b10 = 2;
                }
                break;
            case -1784763192:
                if (str.equals(K0)) {
                    b10 = 3;
                }
                break;
            case -1730367663:
                if (str.equals(D0)) {
                    b10 = 4;
                }
                break;
            case -1482641358:
                if (str.equals(G0)) {
                    b10 = 5;
                }
                break;
            case -1482641357:
                if (str.equals(H0)) {
                    b10 = 6;
                }
                break;
            case -1373388978:
                if (str.equals(B0)) {
                    b10 = 7;
                }
                break;
            case -933872740:
                if (str.equals(Y0)) {
                    b10 = 8;
                }
                break;
            case -538363189:
                if (str.equals(f67755x0)) {
                    b10 = 9;
                }
                break;
            case -538363109:
                if (str.equals(f67761z0)) {
                    b10 = 10;
                }
                break;
            case -425012669:
                if (str.equals(W0)) {
                    b10 = 11;
                }
                break;
            case -356037306:
                if (str.equals(N0)) {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case 62923557:
                if (str.equals(F0)) {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
            case 62923603:
                if (str.equals(I0)) {
                    b10 = com.google.common.base.c.f116463p;
                }
                break;
            case 62927045:
                if (str.equals(L0)) {
                    b10 = com.google.common.base.c.f116464q;
                }
                break;
            case 82318131:
                if (str.equals(f67745u0)) {
                    b10 = com.google.common.base.c.f116465r;
                }
                break;
            case 82338133:
                if (str.equals(f67737s0)) {
                    b10 = 17;
                }
                break;
            case 82338134:
                if (str.equals(f67741t0)) {
                    b10 = com.google.common.base.c.f116468u;
                }
                break;
            case 99146302:
                if (str.equals(X0)) {
                    b10 = 19;
                }
                break;
            case 444813526:
                if (str.equals(C0)) {
                    b10 = com.google.common.base.c.f116471x;
                }
                break;
            case 542569478:
                if (str.equals(M0)) {
                    b10 = com.google.common.base.c.f116472y;
                }
                break;
            case 635596514:
                if (str.equals(S0)) {
                    b10 = com.google.common.base.c.f116473z;
                }
                break;
            case 725948237:
                if (str.equals(R0)) {
                    b10 = com.google.common.base.c.A;
                }
                break;
            case 725957860:
                if (str.equals(Q0)) {
                    b10 = com.google.common.base.c.B;
                }
                break;
            case 738597099:
                if (str.equals(U0)) {
                    b10 = com.google.common.base.c.C;
                }
                break;
            case 855502857:
                if (str.equals(A0)) {
                    b10 = com.google.common.base.c.D;
                }
                break;
            case 1045209816:
                if (str.equals(V0)) {
                    b10 = com.google.common.base.c.E;
                }
                break;
            case 1422270023:
                if (str.equals(T0)) {
                    b10 = com.google.common.base.c.F;
                }
                break;
            case 1809237540:
                if (str.equals(f67749v0)) {
                    b10 = com.google.common.base.c.G;
                }
                break;
            case 1950749482:
                if (str.equals(J0)) {
                    b10 = com.google.common.base.c.H;
                }
                break;
            case 1950789798:
                if (str.equals(O0)) {
                    b10 = com.google.common.base.c.I;
                }
                break;
            case 1951062397:
                if (str.equals(E0)) {
                    b10 = 32;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                return true;
            default:
                return false;
        }
    }

    private boolean D(n0 n0Var, long j10) {
        int i10 = 6 << 1;
        if (this.E) {
            this.G = j10;
            n0Var.f68159a = this.F;
            this.E = false;
            return true;
        }
        if (this.B) {
            long j11 = this.G;
            if (j11 != -1) {
                n0Var.f68159a = j11;
                this.G = -1L;
                return true;
            }
        }
        return false;
    }

    public static w E(final androidx.media3.extractor.text.r.a aVar) {
        return new w() { // from class: androidx.media3.extractor.mkv.d
            @Override // androidx.media3.extractor.w
            public final r[] c() {
                return f.d(aVar);
            }
        };
    }

    private void F(s sVar, int i10) throws IOException {
        if (this.f67780l.g() >= i10) {
            return;
        }
        if (this.f67780l.b() < i10) {
            o0 o0Var = this.f67780l;
            o0Var.c(Math.max(o0Var.b() * 2, i10));
        }
        sVar.readFully(this.f67780l.e(), this.f67780l.g(), i10 - this.f67780l.g());
        this.f67780l.Z(i10);
    }

    private void G() {
        this.Y = 0;
        this.Z = 0;
        this.f67764a0 = 0;
        this.f67765b0 = false;
        this.f67766c0 = false;
        this.f67768d0 = false;
        this.f67770e0 = 0;
        this.f67772f0 = (byte) 0;
        this.f67774g0 = false;
        this.f67783o.W(0);
    }

    private long H(long j10) throws v0 {
        long j11 = this.f67791w;
        if (j11 != -9223372036854775807L) {
            return k1.X1(j10, j11, 1000L);
        }
        throw v0.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void I(String str, long j10, byte[] bArr) {
        byte[] bArrV;
        int i10;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
                bArrV = v(j10, f67712l3, 10000L);
                i10 = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrV = v(j10, f67728p3, 1000L);
                i10 = 25;
                break;
            case "S_TEXT/UTF8":
                bArrV = v(j10, f67693g3, 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrV, 0, bArr, i10, bArrV.length);
    }

    @m({"#2.output"})
    private int L(s sVar, d dVar, int i10, boolean z10) throws IOException {
        int i11;
        if (T0.equals(dVar.f67803c)) {
            M(sVar, f67684d3, i10);
            return t();
        }
        if (U0.equals(dVar.f67803c)) {
            M(sVar, f67700i3, i10);
            return t();
        }
        if (V0.equals(dVar.f67803c)) {
            M(sVar, f67716m3, i10);
            return t();
        }
        u0 u0Var = dVar.Z;
        if (!this.f67765b0) {
            if (dVar.f67809i) {
                this.U &= -1073741825;
                int i12 = 128;
                if (!this.f67766c0) {
                    sVar.readFully(this.f67780l.e(), 0, 1);
                    this.Y++;
                    if ((this.f67780l.e()[0] & 128) == 128) {
                        throw v0.a("Extension bit is set in signal byte", null);
                    }
                    this.f67772f0 = this.f67780l.e()[0];
                    this.f67766c0 = true;
                }
                byte b10 = this.f67772f0;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.U |= 1073741824;
                    if (!this.f67774g0) {
                        sVar.readFully(this.f67785q.e(), 0, 8);
                        this.Y += 8;
                        this.f67774g0 = true;
                        byte[] bArrE = this.f67780l.e();
                        if (!z11) {
                            i12 = 0;
                        }
                        bArrE[0] = (byte) (i12 | 8);
                        this.f67780l.a0(0);
                        u0Var.a(this.f67780l, 1, 1);
                        this.Z++;
                        this.f67785q.a0(0);
                        u0Var.a(this.f67785q, 8, 1);
                        this.Z += 8;
                    }
                    if (z11) {
                        if (!this.f67768d0) {
                            sVar.readFully(this.f67780l.e(), 0, 1);
                            this.Y++;
                            this.f67780l.a0(0);
                            this.f67770e0 = this.f67780l.L();
                            this.f67768d0 = true;
                        }
                        int i13 = this.f67770e0 * 4;
                        this.f67780l.W(i13);
                        sVar.readFully(this.f67780l.e(), 0, i13);
                        this.Y += i13;
                        short s10 = (short) ((this.f67770e0 / 2) + 1);
                        int i14 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f67788t;
                        if (byteBuffer == null || byteBuffer.capacity() < i14) {
                            this.f67788t = ByteBuffer.allocate(i14);
                        }
                        this.f67788t.position(0);
                        this.f67788t.putShort(s10);
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i11 = this.f67770e0;
                            if (i15 >= i11) {
                                break;
                            }
                            int iP = this.f67780l.P();
                            if (i15 % 2 == 0) {
                                this.f67788t.putShort((short) (iP - i16));
                            } else {
                                this.f67788t.putInt(iP - i16);
                            }
                            i15++;
                            i16 = iP;
                        }
                        int i17 = (i10 - this.Y) - i16;
                        if (i11 % 2 == 1) {
                            this.f67788t.putInt(i17);
                        } else {
                            this.f67788t.putShort((short) i17);
                            this.f67788t.putInt(0);
                        }
                        this.f67786r.Y(this.f67788t.array(), i14);
                        u0Var.a(this.f67786r, i14, 1);
                        this.Z += i14;
                    }
                }
            } else {
                byte[] bArr = dVar.f67810j;
                if (bArr != null) {
                    this.f67783o.Y(bArr, bArr.length);
                }
            }
            if (dVar.o(z10)) {
                this.U |= 268435456;
                this.f67787s.W(0);
                int iG = (this.f67783o.g() + i10) - this.Y;
                this.f67780l.W(4);
                this.f67780l.e()[0] = (byte) ((iG >> 24) & 255);
                this.f67780l.e()[1] = (byte) ((iG >> 16) & 255);
                this.f67780l.e()[2] = (byte) ((iG >> 8) & 255);
                this.f67780l.e()[3] = (byte) (iG & 255);
                u0Var.a(this.f67780l, 4, 2);
                this.Z += 4;
            }
            this.f67765b0 = true;
        }
        int iG2 = i10 + this.f67783o.g();
        if (!f67761z0.equals(dVar.f67803c) && !A0.equals(dVar.f67803c)) {
            if (dVar.V != null) {
                androidx.media3.common.util.a.i(this.f67783o.g() == 0);
                dVar.V.d(sVar);
            }
            while (true) {
                int i18 = this.Y;
                if (i18 >= iG2) {
                    break;
                }
                int iN = N(sVar, u0Var, iG2 - i18);
                this.Y += iN;
                this.Z += iN;
            }
        } else {
            byte[] bArrE2 = this.f67779k.e();
            bArrE2[0] = 0;
            bArrE2[1] = 0;
            bArrE2[2] = 0;
            int i19 = dVar.f67801a0;
            int i20 = 4 - i19;
            while (this.Y < iG2) {
                int i21 = this.f67764a0;
                if (i21 == 0) {
                    O(sVar, bArrE2, i20, i19);
                    this.Y += i19;
                    this.f67779k.a0(0);
                    this.f67764a0 = this.f67779k.P();
                    this.f67778j.a0(0);
                    u0Var.b(this.f67778j, 4);
                    this.Z += 4;
                } else {
                    int iN2 = N(sVar, u0Var, i21);
                    this.Y += iN2;
                    this.Z += iN2;
                    this.f67764a0 -= iN2;
                }
            }
        }
        if (D0.equals(dVar.f67803c)) {
            this.f67781m.a0(0);
            u0Var.b(this.f67781m, 4);
            this.Z += 4;
        }
        return t();
    }

    private void M(s sVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        if (this.f67784p.b() < length) {
            this.f67784p.X(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f67784p.e(), 0, bArr.length);
        }
        sVar.readFully(this.f67784p.e(), bArr.length, i10);
        this.f67784p.a0(0);
        this.f67784p.Z(length);
    }

    private int N(s sVar, u0 u0Var, int i10) throws IOException {
        int iA = this.f67783o.a();
        if (iA <= 0) {
            return u0Var.f(sVar, i10, false);
        }
        int iMin = Math.min(i10, iA);
        u0Var.b(this.f67783o, iMin);
        return iMin;
    }

    private void O(s sVar, byte[] bArr, int i10, int i11) throws IOException {
        int iMin = Math.min(i11, this.f67783o.a());
        sVar.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f67783o.n(bArr, i10, iMin);
        }
    }

    public static /* synthetic */ r[] d(androidx.media3.extractor.text.r.a aVar) {
        return new r[]{new f(aVar)};
    }

    public static /* synthetic */ r[] e() {
        int i10 = 2 << 0;
        return new r[]{new f(androidx.media3.extractor.text.r.a.f68570a, 2)};
    }

    @il.d({"cueTimesUs", "cueClusterPositions"})
    private void l(int i10) throws v0 {
        if (this.I == null || this.J == null) {
            throw v0.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    @il.d({"currentTrack"})
    private void m(int i10) throws v0 {
        if (this.A != null) {
            return;
        }
        throw v0.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    @il.d({"extractorOutput"})
    private void n() {
        androidx.media3.common.util.a.k(this.f67776h0);
    }

    private androidx.media3.extractor.p0 p(@p0 a0 a0Var, @p0 a0 a0Var2) {
        int i10;
        if (this.f67790v != -1 && this.f67793y != -9223372036854775807L && a0Var != null && a0Var.d() != 0 && a0Var2 != null && a0Var2.d() == a0Var.d()) {
            int iD = a0Var.d();
            int[] iArrCopyOf = new int[iD];
            long[] jArrCopyOf = new long[iD];
            long[] jArrCopyOf2 = new long[iD];
            long[] jArrCopyOf3 = new long[iD];
            int i11 = 0;
            for (int i12 = 0; i12 < iD; i12++) {
                jArrCopyOf3[i12] = a0Var.c(i12);
                jArrCopyOf[i12] = this.f67790v + a0Var2.c(i12);
            }
            while (true) {
                i10 = iD - 1;
                if (i11 >= i10) {
                    break;
                }
                int i13 = i11 + 1;
                iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
                jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
                i11 = i13;
            }
            int i14 = i10;
            while (i14 > 0 && jArrCopyOf3[i14] > this.f67793y) {
                i14--;
            }
            iArrCopyOf[i14] = (int) ((this.f67790v + this.f67789u) - jArrCopyOf[i14]);
            jArrCopyOf2[i14] = this.f67793y - jArrCopyOf3[i14];
            if (i14 < i10) {
                z.n(f67709l0, "Discarding trailing cue points with timestamps greater than total duration");
                int i15 = i14 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i15);
            }
            return new androidx.media3.extractor.g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        return new androidx.media3.extractor.p0.b(this.f67793y);
    }

    @m({"#1.output"})
    private void q(d dVar, long j10, int i10, int i11, int i12) {
        int iG;
        androidx.media3.extractor.v0 v0Var = dVar.V;
        if (v0Var != null) {
            v0Var.c(dVar.Z, j10, i10, i11, i12, dVar.f67811k);
        } else {
            if (T0.equals(dVar.f67803c) || U0.equals(dVar.f67803c) || V0.equals(dVar.f67803c)) {
                if (this.Q > 1) {
                    z.n(f67709l0, "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.O;
                    if (j11 == -9223372036854775807L) {
                        z.n(f67709l0, "Skipping subtitle sample with no duration.");
                    } else {
                        I(dVar.f67803c, j11, this.f67784p.e());
                        for (int iF = this.f67784p.f(); iF < this.f67784p.g(); iF++) {
                            if (this.f67784p.e()[iF] == 0) {
                                this.f67784p.Z(iF);
                                break;
                            }
                        }
                        u0 u0Var = dVar.Z;
                        o0 o0Var = this.f67784p;
                        u0Var.b(o0Var, o0Var.g());
                        iG = i11 + this.f67784p.g();
                    }
                }
                iG = i11;
            } else {
                iG = i11;
            }
            if ((i10 & 268435456) != 0) {
                if (this.Q > 1) {
                    this.f67787s.W(0);
                } else {
                    int iG2 = this.f67787s.g();
                    dVar.Z.a(this.f67787s, iG2, 2);
                    iG += iG2;
                }
            }
            dVar.Z.g(j10, i10, iG, i12, dVar.f67811k);
        }
        this.L = true;
    }

    private static int[] s(@p0 int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int t() {
        int i10 = this.Z;
        G();
        return i10;
    }

    private static byte[] v(long j10, String str, long j11) {
        androidx.media3.common.util.a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        return k1.Q0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    @androidx.annotation.i
    protected void A(int i10, long j10) throws v0 {
        if (i10 == f67686e2) {
            if (j10 == 0) {
                return;
            }
            throw v0.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == f67689f2) {
            if (j10 == 1) {
                return;
            }
            throw v0.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                w(i10).f67805e = (int) j10;
                return;
            case 136:
                w(i10).X = j10 == 1;
                return;
            case 155:
                this.O = H(j10);
                return;
            case 159:
                w(i10).Q = (int) j10;
                return;
            case T1 /* 176 */:
                w(i10).f67814n = (int) j10;
                return;
            case f67731q2 /* 179 */:
                l(i10);
                this.I.a(H(j10));
                return;
            case U1 /* 186 */:
                w(i10).f67815o = (int) j10;
                return;
            case D1 /* 215 */:
                w(i10).f67804d = (int) j10;
                return;
            case f67734r1 /* 231 */:
                this.H = H(j10);
                return;
            case f67759y1 /* 238 */:
                this.V = (int) j10;
                return;
            case f67739s2 /* 241 */:
                if (this.K) {
                    return;
                }
                l(i10);
                this.J.a(j10);
                this.K = true;
                return;
            case 251:
                this.W = true;
                return;
            case K1 /* 16871 */:
                w(i10).f67808h = (int) j10;
                return;
            case f67695h2 /* 16980 */:
                if (j10 == 3) {
                    return;
                }
                throw v0.a("ContentCompAlgo " + j10 + " not supported", null);
            case f67691g1 /* 17029 */:
                if (j10 < 1 || j10 > 2) {
                    throw v0.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case f67685e1 /* 17143 */:
                if (j10 == 1) {
                    return;
                }
                throw v0.a("EBMLReadVersion " + j10 + " not supported", null);
            case f67707k2 /* 18401 */:
                if (j10 == 5) {
                    return;
                }
                throw v0.a("ContentEncAlgo " + j10 + " not supported", null);
            case f67719n2 /* 18408 */:
                if (j10 == 1) {
                    return;
                }
                throw v0.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case f67714m1 /* 21420 */:
                this.D = j10 + this.f67790v;
                return;
            case A2 /* 21432 */:
                int i11 = (int) j10;
                m(i10);
                if (i11 == 0) {
                    this.A.f67825y = 0;
                    return;
                }
                if (i11 == 1) {
                    this.A.f67825y = 2;
                    return;
                } else if (i11 == 3) {
                    this.A.f67825y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.A.f67825y = 3;
                    return;
                }
            case V1 /* 21680 */:
                w(i10).f67817q = (int) j10;
                return;
            case X1 /* 21682 */:
                w(i10).f67819s = (int) j10;
                return;
            case W1 /* 21690 */:
                w(i10).f67818r = (int) j10;
                return;
            case G1 /* 21930 */:
                w(i10).W = j10 == 1;
                return;
            case D2 /* 21938 */:
                m(i10);
                d dVar = this.A;
                dVar.f67826z = true;
                dVar.f67816p = (int) j10;
                return;
            case I1 /* 21998 */:
                w(i10).f67807g = (int) j10;
                return;
            case P1 /* 22186 */:
                w(i10).T = j10;
                return;
            case Q1 /* 22203 */:
                w(i10).U = j10;
                return;
            case f67674a2 /* 25188 */:
                w(i10).R = (int) j10;
                return;
            case R1 /* 30114 */:
                this.X = j10;
                return;
            case f67751v2 /* 30321 */:
                m(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.A.f67820t = 0;
                    return;
                }
                if (i12 == 1) {
                    this.A.f67820t = 1;
                    return;
                } else if (i12 == 2) {
                    this.A.f67820t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.A.f67820t = 3;
                    return;
                }
            case H1 /* 2352003 */:
                w(i10).f67806f = (int) j10;
                return;
            case f67722o1 /* 2807729 */:
                this.f67791w = j10;
                return;
            default:
                switch (i10) {
                    case C2 /* 21945 */:
                        m(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.A.C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.A.C = 1;
                            return;
                        }
                    case E2 /* 21946 */:
                        m(i10);
                        int iP = k.p((int) j10);
                        if (iP != -1) {
                            this.A.B = iP;
                            return;
                        }
                        return;
                    case F2 /* 21947 */:
                        m(i10);
                        this.A.f67826z = true;
                        int iO = k.o((int) j10);
                        if (iO != -1) {
                            this.A.A = iO;
                            return;
                        }
                        return;
                    case G2 /* 21948 */:
                        w(i10).D = (int) j10;
                        return;
                    case H2 /* 21949 */:
                        w(i10).E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @androidx.annotation.i
    protected boolean C(int i10) {
        if (i10 != 357149030 && i10 != f67730q1 && i10 != f67723o2 && i10 != B1) {
            return false;
        }
        return true;
    }

    @androidx.annotation.i
    protected void J(int i10, long j10, long j11) throws v0 {
        n();
        if (i10 == 160) {
            this.W = false;
            this.X = 0L;
            return;
        }
        if (i10 == C1) {
            d dVar = new d();
            this.A = dVar;
            dVar.f67800a = this.f67794z;
            return;
        }
        if (i10 == f67727p2) {
            this.K = false;
            return;
        }
        if (i10 == f67706k1) {
            this.C = -1;
            this.D = -1L;
            return;
        }
        if (i10 == f67703j2) {
            w(i10).f67809i = true;
            return;
        }
        if (i10 == I2) {
            w(i10).f67826z = true;
            return;
        }
        if (i10 == f67694h1) {
            long j12 = this.f67790v;
            if (j12 != -1 && j12 != j10) {
                throw v0.a("Multiple Segment elements not supported", null);
            }
            this.f67790v = j10;
            this.f67789u = j11;
            return;
        }
        if (i10 == f67723o2) {
            this.I = new a0();
            this.J = new a0();
        } else if (i10 == f67730q1 && !this.B) {
            if (this.f67773g && this.F != -1) {
                this.E = true;
            } else {
                this.f67776h0.u(new androidx.media3.extractor.p0.b(this.f67793y));
                this.B = true;
            }
        }
    }

    @androidx.annotation.i
    protected void K(int i10, String str) throws v0 {
        if (i10 == 134) {
            w(i10).f67803c = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == M1) {
                w(i10).f67802b = str;
                return;
            } else {
                if (i10 != f67743t2) {
                    return;
                }
                w(i10).Y = str;
                return;
            }
        }
        if (f67733r0.equals(str) || f67729q0.equals(str)) {
            this.f67794z = Objects.equals(str, f67733r0);
            return;
        }
        throw v0.a("DocType " + str + " not supported", null);
    }

    @Override // androidx.media3.extractor.r
    @androidx.annotation.i
    public void a(long j10, long j11) {
        this.H = -9223372036854775807L;
        this.M = 0;
        this.f67767d.reset();
        this.f67769e.e();
        G();
        for (int i10 = 0; i10 < this.f67771f.size(); i10++) {
            this.f67771f.valueAt(i10).n();
        }
    }

    @Override // androidx.media3.extractor.r
    public final int f(s sVar, n0 n0Var) throws IOException {
        this.L = false;
        boolean zB = true;
        while (zB && !this.L) {
            zB = this.f67767d.b(sVar);
            if (zB && D(n0Var, sVar.getPosition())) {
                return 1;
            }
        }
        if (zB) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f67771f.size(); i10++) {
            d dVarValueAt = this.f67771f.valueAt(i10);
            dVarValueAt.f();
            dVarValueAt.j();
        }
        return -1;
    }

    @Override // androidx.media3.extractor.r
    public final boolean g(s sVar) throws IOException {
        return new g().b(sVar);
    }

    @Override // androidx.media3.extractor.r
    public final void h(t tVar) {
        if (this.f67775h) {
            tVar = new androidx.media3.extractor.text.t(tVar, this.f67777i);
        }
        this.f67776h0 = tVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02a5  */
    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.i
    protected void o(int i10, int i11, s sVar) throws IOException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        int i20;
        s sVar2 = sVar;
        int i21 = 0;
        int i22 = 1;
        if (i10 != f67746u1 && i10 != f67738s1) {
            if (i10 == f67762z1) {
                if (this.M != 2) {
                    return;
                }
                z(this.f67771f.get(this.S), this.V, sVar2, i11);
                return;
            }
            if (i10 == L1) {
                y(w(i10), sVar2, i11);
                return;
            }
            if (i10 == f67699i2) {
                m(i10);
                byte[] bArr = new byte[i11];
                this.A.f67810j = bArr;
                sVar2.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == f67711l2) {
                byte[] bArr2 = new byte[i11];
                sVar2.readFully(bArr2, 0, i11);
                w(i10).f67811k = new u0.a(1, bArr2, 0, 0);
                return;
            }
            if (i10 == f67710l1) {
                Arrays.fill(this.f67782n.e(), (byte) 0);
                sVar2.readFully(this.f67782n.e(), 4 - i11, i11);
                this.f67782n.a0(0);
                this.C = (int) this.f67782n.N();
                return;
            }
            if (i10 == O1) {
                m(i10);
                byte[] bArr3 = new byte[i11];
                this.A.f67812l = bArr3;
                sVar2.readFully(bArr3, 0, i11);
                return;
            }
            if (i10 != f67754w2) {
                throw v0.a("Unexpected id: " + i10, null);
            }
            m(i10);
            byte[] bArr4 = new byte[i11];
            this.A.f67824x = bArr4;
            sVar2.readFully(bArr4, 0, i11);
            return;
        }
        int i23 = 8;
        if (this.M == 0) {
            this.S = (int) this.f67769e.d(sVar2, false, true, 8);
            this.T = this.f67769e.b();
            this.O = -9223372036854775807L;
            this.M = 1;
            this.f67780l.W(0);
        }
        d dVar = this.f67771f.get(this.S);
        if (dVar == null) {
            sVar2.o(i11 - this.T);
            this.M = 0;
            return;
        }
        dVar.f();
        if (this.M == 1) {
            F(sVar2, 3);
            int i24 = (this.f67780l.e()[2] & 6) >> 1;
            if (i24 == 0) {
                this.Q = 1;
                int[] iArrS = s(this.R, 1);
                this.R = iArrS;
                iArrS[0] = (i11 - this.T) - 3;
            } else {
                F(sVar2, 4);
                int i25 = (this.f67780l.e()[3] & 255) + 1;
                this.Q = i25;
                int[] iArrS2 = s(this.R, i25);
                this.R = iArrS2;
                if (i24 == 2) {
                    int i26 = (i11 - this.T) - 4;
                    int i27 = this.Q;
                    Arrays.fill(iArrS2, 0, i27, i26 / i27);
                } else {
                    if (i24 == 1) {
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 4;
                        while (true) {
                            i17 = this.Q;
                            if (i28 >= i17 - 1) {
                                break;
                            }
                            this.R[i28] = 0;
                            while (true) {
                                i18 = i30 + 1;
                                F(sVar2, i18);
                                int i31 = this.f67780l.e()[i30] & 255;
                                int[] iArr = this.R;
                                i19 = iArr[i28] + i31;
                                iArr[i28] = i19;
                                if (i31 != 255) {
                                    break;
                                } else {
                                    i30 = i18;
                                }
                            }
                            i29 += i19;
                            i28++;
                            i30 = i18;
                        }
                        this.R[i17 - 1] = ((i11 - this.T) - i30) - i29;
                    } else {
                        if (i24 != 3) {
                            throw v0.a("Unexpected lacing value: " + i24, null);
                        }
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = 4;
                        while (true) {
                            int i35 = this.Q;
                            i12 = i22;
                            if (i32 >= i35 - 1) {
                                i13 = i21;
                                this.R[i35 - 1] = ((i11 - this.T) - i34) - i33;
                                break;
                            }
                            this.R[i32] = i21;
                            int i36 = i34 + 1;
                            F(sVar2, i36);
                            if (this.f67780l.e()[i34] == 0) {
                                throw v0.a("No valid varint length mask found", null);
                            }
                            int i37 = i21;
                            while (true) {
                                if (i37 >= i23) {
                                    i14 = i21;
                                    i15 = i23;
                                    i16 = i32;
                                    j10 = 0;
                                    break;
                                }
                                i15 = i23;
                                int i38 = i12 << (7 - i37);
                                i14 = i21;
                                if ((this.f67780l.e()[i34] & i38) != 0) {
                                    i36 += i37;
                                    F(sVar2, i36);
                                    int i39 = i34 + 1;
                                    j10 = this.f67780l.e()[i34] & 255 & (~i38);
                                    while (true) {
                                        int i40 = i39;
                                        if (i40 >= i36) {
                                            break;
                                        }
                                        i39 = i40 + 1;
                                        j10 = (j10 << i15) | ((long) (this.f67780l.e()[i40] & 255));
                                        i32 = i32;
                                    }
                                    i16 = i32;
                                    if (i16 <= 0) {
                                        break;
                                    }
                                    j10 -= (1 << ((i37 * 7) + 6)) - 1;
                                    break;
                                }
                                i37++;
                                sVar2 = sVar;
                                i21 = i14;
                                i23 = i15;
                            }
                            i34 = i36;
                            if (j10 < g3.f12261h || j10 > g3.f12256c) {
                                throw v0.a("EBML lacing sample size out of range.", null);
                            }
                            int i41 = (int) j10;
                            int[] iArr2 = this.R;
                            if (i16 != 0) {
                                i41 += iArr2[i16 - 1];
                            }
                            iArr2[i16] = i41;
                            i33 += i41;
                            i32 = i16 + 1;
                            sVar2 = sVar;
                            i22 = i12;
                            i21 = i14;
                            i23 = i15;
                        }
                    }
                    this.N = this.H + H((this.f67780l.e()[i13] << 8) | (this.f67780l.e()[i12] & 255));
                    if (dVar.f67805e != 2 || (i10 == f67738s1 && (this.f67780l.e()[2] & 128) == 128)) {
                        i20 = i12;
                    } else {
                        i20 = i13;
                    }
                    this.U = i20;
                    this.M = 2;
                    this.P = i13;
                }
            }
            i13 = 0;
            i12 = 1;
            this.N = this.H + H((this.f67780l.e()[i13] << 8) | (this.f67780l.e()[i12] & 255));
            if (dVar.f67805e != 2) {
                i20 = i12;
            } else {
                i20 = i12;
            }
            this.U = i20;
            this.M = 2;
            this.P = i13;
        } else {
            i12 = 1;
        }
        if (i10 == f67738s1) {
            while (true) {
                int i42 = this.P;
                if (i42 >= this.Q) {
                    this.M = 0;
                    return;
                }
                int iL = L(sVar, dVar, this.R[i42], false);
                d dVar2 = dVar;
                q(dVar2, this.N + ((long) ((this.P * dVar.f67806f) / 1000)), this.U, iL, 0);
                this.P++;
                dVar = dVar2;
            }
        } else {
            while (true) {
                int i43 = this.P;
                if (i43 >= this.Q) {
                    return;
                }
                int[] iArr3 = this.R;
                boolean z10 = i12;
                iArr3[i43] = L(sVar, dVar, iArr3[i43], z10);
                this.P += z10 ? 1 : 0;
            }
        }
    }

    @androidx.annotation.i
    protected void r(int i10) throws v0 {
        n();
        if (i10 == 160) {
            if (this.M != 2) {
                return;
            }
            d dVar = this.f67771f.get(this.S);
            dVar.f();
            if (this.X > 0 && E0.equals(dVar.f67803c)) {
                this.f67787s.X(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.X).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.Q; i12++) {
                i11 += this.R[i12];
            }
            int i13 = 0;
            while (i13 < this.Q) {
                long j10 = this.N + ((long) ((dVar.f67806f * i13) / 1000));
                int i14 = this.U;
                if (i13 == 0 && !this.W) {
                    i14 |= 1;
                }
                int i15 = this.R[i13];
                int i16 = i11 - i15;
                q(dVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.M = 0;
            return;
        }
        if (i10 == C1) {
            d dVar2 = (d) androidx.media3.common.util.a.k(this.A);
            String str = dVar2.f67803c;
            if (str == null) {
                throw v0.a("CodecId is missing in TrackEntry element", null);
            }
            if (B(str)) {
                dVar2.i(this.f67776h0, dVar2.f67804d);
                this.f67771f.put(dVar2.f67804d, dVar2);
            }
            this.A = null;
            return;
        }
        if (i10 == f67706k1) {
            int i17 = this.C;
            if (i17 != -1) {
                long j11 = this.D;
                if (j11 != -1) {
                    if (i17 == f67723o2) {
                        this.F = j11;
                        return;
                    }
                    return;
                }
            }
            throw v0.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == f67683d2) {
            m(i10);
            d dVar3 = this.A;
            if (dVar3.f67809i) {
                if (dVar3.f67811k == null) {
                    throw v0.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                dVar3.f67813m = new DrmInitData(new DrmInitData.SchemeData(j.f60704k2, "video/webm", this.A.f67811k.f69558b));
                return;
            }
            return;
        }
        if (i10 == f67680c2) {
            m(i10);
            d dVar4 = this.A;
            if (dVar4.f67809i && dVar4.f67810j != null) {
                throw v0.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f67791w == -9223372036854775807L) {
                this.f67791w = 1000000L;
            }
            long j12 = this.f67792x;
            if (j12 != -9223372036854775807L) {
                this.f67793y = H(j12);
                return;
            }
            return;
        }
        if (i10 == B1) {
            if (this.f67771f.size() == 0) {
                throw v0.a("No valid tracks were found", null);
            }
            this.f67776h0.l();
        } else {
            if (i10 != f67723o2) {
                return;
            }
            if (!this.B) {
                this.f67776h0.u(p(this.I, this.J));
                this.B = true;
            }
            this.I = null;
            this.J = null;
        }
    }

    @Override // androidx.media3.extractor.r
    public final void release() {
    }

    @androidx.annotation.i
    protected void u(int i10, double d10) throws v0 {
        if (i10 == f67677b2) {
            w(i10).S = (int) d10;
            return;
        }
        if (i10 == f67726p1) {
            this.f67792x = (long) d10;
            return;
        }
        switch (i10) {
            case J2 /* 21969 */:
                w(i10).F = (float) d10;
                break;
            case K2 /* 21970 */:
                w(i10).G = (float) d10;
                break;
            case L2 /* 21971 */:
                w(i10).H = (float) d10;
                break;
            case M2 /* 21972 */:
                w(i10).I = (float) d10;
                break;
            case N2 /* 21973 */:
                w(i10).J = (float) d10;
                break;
            case O2 /* 21974 */:
                w(i10).K = (float) d10;
                break;
            case P2 /* 21975 */:
                w(i10).L = (float) d10;
                break;
            case Q2 /* 21976 */:
                w(i10).M = (float) d10;
                break;
            case R2 /* 21977 */:
                w(i10).N = (float) d10;
                break;
            case S2 /* 21978 */:
                w(i10).O = (float) d10;
                break;
            default:
                switch (i10) {
                    case f67757x2 /* 30323 */:
                        w(i10).f67821u = (float) d10;
                        break;
                    case f67760y2 /* 30324 */:
                        w(i10).f67822v = (float) d10;
                        break;
                    case f67763z2 /* 30325 */:
                        w(i10).f67823w = (float) d10;
                        break;
                }
                break;
        }
    }

    protected d w(int i10) throws v0 {
        m(i10);
        return this.A;
    }

    @androidx.annotation.i
    protected int x(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case T1 /* 176 */:
            case f67731q2 /* 179 */:
            case U1 /* 186 */:
            case D1 /* 215 */:
            case f67734r1 /* 231 */:
            case f67759y1 /* 238 */:
            case f67739s2 /* 241 */:
            case 251:
            case K1 /* 16871 */:
            case f67695h2 /* 16980 */:
            case f67691g1 /* 17029 */:
            case f67685e1 /* 17143 */:
            case f67707k2 /* 18401 */:
            case f67719n2 /* 18408 */:
            case f67686e2 /* 20529 */:
            case f67689f2 /* 20530 */:
            case f67714m1 /* 21420 */:
            case A2 /* 21432 */:
            case V1 /* 21680 */:
            case X1 /* 21682 */:
            case W1 /* 21690 */:
            case G1 /* 21930 */:
            case D2 /* 21938 */:
            case C2 /* 21945 */:
            case E2 /* 21946 */:
            case F2 /* 21947 */:
            case G2 /* 21948 */:
            case H2 /* 21949 */:
            case I1 /* 21998 */:
            case P1 /* 22186 */:
            case Q1 /* 22203 */:
            case f67674a2 /* 25188 */:
            case R1 /* 30114 */:
            case f67751v2 /* 30321 */:
            case H1 /* 2352003 */:
            case f67722o1 /* 2807729 */:
                return 2;
            case 134:
            case 17026:
            case M1 /* 21358 */:
            case f67743t2 /* 2274716 */:
                return 3;
            case 160:
            case f67756x1 /* 166 */:
            case C1 /* 174 */:
            case f67735r2 /* 183 */:
            case f67727p2 /* 187 */:
            case 224:
            case Y1 /* 225 */:
            case J1 /* 16868 */:
            case f67715m2 /* 18407 */:
            case f67706k1 /* 19899 */:
            case f67692g2 /* 20532 */:
            case f67703j2 /* 20533 */:
            case B2 /* 21936 */:
            case I2 /* 21968 */:
            case f67683d2 /* 25152 */:
            case f67680c2 /* 28032 */:
            case f67753w1 /* 30113 */:
            case f67747u2 /* 30320 */:
            case f67702j1 /* 290298740 */:
            case 357149030:
            case B1 /* 374648427 */:
            case f67694h1 /* 408125543 */:
            case f67682d1 /* 440786851 */:
            case f67723o2 /* 475249515 */:
            case f67730q1 /* 524531317 */:
                return 1;
            case f67746u1 /* 161 */:
            case f67738s1 /* 163 */:
            case f67762z1 /* 165 */:
            case L1 /* 16877 */:
            case f67699i2 /* 16981 */:
            case f67711l2 /* 18402 */:
            case f67710l1 /* 21419 */:
            case O1 /* 25506 */:
            case f67754w2 /* 30322 */:
                return 4;
            case f67677b2 /* 181 */:
            case f67726p1 /* 17545 */:
            case J2 /* 21969 */:
            case K2 /* 21970 */:
            case L2 /* 21971 */:
            case M2 /* 21972 */:
            case N2 /* 21973 */:
            case O2 /* 21974 */:
            case P2 /* 21975 */:
            case Q2 /* 21976 */:
            case R2 /* 21977 */:
            case S2 /* 21978 */:
            case f67757x2 /* 30323 */:
            case f67760y2 /* 30324 */:
            case f67763z2 /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    protected void y(d dVar, s sVar, int i10) throws IOException {
        if (dVar.f67808h != 1685485123 && dVar.f67808h != 1685480259) {
            sVar.o(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        dVar.P = bArr;
        sVar.readFully(bArr, 0, i10);
    }

    protected void z(d dVar, int i10, s sVar, int i11) throws IOException {
        if (i10 != 4 || !f67741t0.equals(dVar.f67803c)) {
            sVar.o(i11);
        } else {
            this.f67787s.W(i11);
            sVar.readFully(this.f67787s.e(), 0, i11);
        }
    }

    @Deprecated
    public f(int i10) {
        this(new androidx.media3.extractor.mkv.a(), i10 | 2, androidx.media3.extractor.text.r.a.f68570a);
    }

    public f(androidx.media3.extractor.text.r.a aVar) {
        this(new androidx.media3.extractor.mkv.a(), 0, aVar);
    }

    public f(androidx.media3.extractor.text.r.a aVar, int i10) {
        this(new androidx.media3.extractor.mkv.a(), i10, aVar);
    }

    f(androidx.media3.extractor.mkv.c cVar, int i10, androidx.media3.extractor.text.r.a aVar) {
        this.f67790v = -1L;
        this.f67791w = -9223372036854775807L;
        this.f67792x = -9223372036854775807L;
        this.f67793y = -9223372036854775807L;
        this.F = -1L;
        this.G = -1L;
        this.H = -9223372036854775807L;
        this.f67767d = cVar;
        cVar.a(new c());
        this.f67777i = aVar;
        this.f67773g = (i10 & 1) == 0;
        this.f67775h = (i10 & 2) == 0;
        this.f67769e = new h();
        this.f67771f = new SparseArray<>();
        this.f67780l = new o0(4);
        this.f67781m = new o0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f67782n = new o0(4);
        this.f67778j = new o0(androidx.media3.container.f.C);
        this.f67779k = new o0(4);
        this.f67783o = new o0();
        this.f67784p = new o0();
        this.f67785q = new o0(8);
        this.f67786r = new o0();
        this.f67787s = new o0();
        this.R = new int[1];
    }
}
