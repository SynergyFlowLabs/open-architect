package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.annotation.p0;
import androidx.collection.g3;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.r0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.n0;
import androidx.media3.common.util.o0;
import androidx.media3.common.v0;
import androidx.media3.extractor.g0;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.m0;
import androidx.media3.extractor.x0;
import com.google.common.collect.l6;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f67895a = "BoxParsers";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f67896b = 1668047728;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f67897c = 1835299937;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f67898d = 1835365473;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f67899e = 1852009571;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f67900f = 1852009592;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f67901g = 1935832172;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f67902h = 1936684398;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f67903i = 1937072756;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f67904j = 1952807028;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f67905k = 1986618469;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f67906l = 8000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f67907m = 16000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f67908n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f67909o = k1.Q0("OpusHead");

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f67910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f67911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f67912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f67913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f67914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final o0 f67915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final o0 f67916g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f67917h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f67918i;

        public a(o0 o0Var, o0 o0Var2, boolean z10) throws v0 {
            this.f67916g = o0Var;
            this.f67915f = o0Var2;
            this.f67914e = z10;
            o0Var2.a0(12);
            this.f67910a = o0Var2.P();
            o0Var.a0(12);
            this.f67918i = o0Var.P();
            androidx.media3.extractor.u.a(o0Var.s() == 1, "first_chunk must be 1");
            this.f67911b = -1;
        }

        public boolean a() {
            int i10 = this.f67911b + 1;
            this.f67911b = i10;
            if (i10 == this.f67910a) {
                return false;
            }
            this.f67913d = this.f67914e ? this.f67915f.S() : this.f67915f.N();
            if (this.f67911b == this.f67917h) {
                this.f67912c = this.f67916g.P();
                this.f67916g.b0(4);
                int i11 = this.f67918i - 1;
                this.f67918i = i11;
                this.f67917h = i11 > 0 ? this.f67916g.P() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.extractor.mp4.b$b, reason: collision with other inner class name */
    private static final class C0609b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f67919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f67920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f67921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f67922d;

        public C0609b(String str, byte[] bArr, long j10, long j11) {
            this.f67919a = str;
            this.f67920b = bArr;
            this.f67921c = j10;
            this.f67922d = j11;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f67923a;

        public c(f fVar) {
            this.f67923a = fVar;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f67924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f67925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f67926c;

        public d(long j10, long j11, String str) {
            this.f67924a = j10;
            this.f67925b = j11;
            this.f67926c = str;
        }
    }

    private interface e {
        int a();

        int b();

        int c();
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f67927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f67928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f67929c;

        public f(boolean z10, boolean z11, boolean z12) {
            this.f67927a = z10;
            this.f67928b = z11;
            this.f67929c = z12;
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f67930e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w[] f67931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        public androidx.media3.common.w f67932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f67933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f67934d = 0;

        public g(int i10) {
            this.f67931a = new w[i10];
        }
    }

    static final class h implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f67935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f67936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o0 f67937c;

        public h(androidx.media3.container.b.c cVar, androidx.media3.common.w wVar) {
            o0 o0Var = cVar.Q1;
            this.f67937c = o0Var;
            o0Var.a0(12);
            int iP = o0Var.P();
            if ("audio/raw".equals(wVar.f61761o)) {
                int iE0 = k1.E0(wVar.G, wVar.E);
                if (iP == 0 || iP % iE0 != 0) {
                    androidx.media3.common.util.z.n(b.f67895a, "Audio sample size mismatch. stsd sample size: " + iE0 + ", stsz sample size: " + iP);
                    iP = iE0;
                }
            }
            this.f67935a = iP == 0 ? -1 : iP;
            this.f67936b = o0Var.P();
        }

        @Override // androidx.media3.extractor.mp4.b.e
        public int a() {
            int i10 = this.f67935a;
            return i10 == -1 ? this.f67937c.P() : i10;
        }

        @Override // androidx.media3.extractor.mp4.b.e
        public int b() {
            return this.f67936b;
        }

        @Override // androidx.media3.extractor.mp4.b.e
        public int c() {
            return this.f67935a;
        }
    }

    static final class i implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o0 f67938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f67939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f67940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f67941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f67942e;

        public i(androidx.media3.container.b.c cVar) {
            o0 o0Var = cVar.Q1;
            this.f67938a = o0Var;
            o0Var.a0(12);
            this.f67940c = o0Var.P() & 255;
            this.f67939b = o0Var.P();
        }

        @Override // androidx.media3.extractor.mp4.b.e
        public int a() {
            int i10 = this.f67940c;
            if (i10 == 8) {
                return this.f67938a.L();
            }
            if (i10 == 16) {
                return this.f67938a.T();
            }
            int i11 = this.f67941d;
            this.f67941d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f67942e & 15;
            }
            int iL = this.f67938a.L();
            this.f67942e = iL;
            return (iL & 240) >> 4;
        }

        @Override // androidx.media3.extractor.mp4.b.e
        public int b() {
            return this.f67939b;
        }

        @Override // androidx.media3.extractor.mp4.b.e
        public int c() {
            return -1;
        }
    }

    private static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f67943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f67944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f67945c;

        public j(int i10, long j10, int i11) {
            this.f67943a = i10;
            this.f67944b = j10;
            this.f67945c = i11;
        }
    }

    static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final c f67946a;

        public k(c cVar) {
            this.f67946a = cVar;
        }

        public boolean b() {
            c cVar = this.f67946a;
            return cVar != null && cVar.f67923a.f67927a && this.f67946a.f67923a.f67928b;
        }
    }

    private b() {
    }

    private static g A(o0 o0Var, int i10, int i11, String str, @p0 DrmInitData drmInitData, boolean z10) throws v0 {
        o0Var.a0(12);
        int iS = o0Var.s();
        g gVar = new g(iS);
        int i12 = 0;
        while (i12 < iS) {
            int iF = o0Var.f();
            int iS2 = o0Var.s();
            androidx.media3.extractor.u.a(iS2 > 0, "childAtomSize must be positive");
            int iS3 = o0Var.s();
            if (iS3 == 1635148593 || iS3 == 1635148595 || iS3 == 1701733238 || iS3 == 1831958048 || iS3 == 1836070006 || iS3 == 1752589105 || iS3 == 1751479857 || iS3 == 1932670515 || iS3 == 1211250227 || iS3 == 1748121139 || iS3 == 1987063864 || iS3 == 1987063865 || iS3 == 1635135537 || iS3 == 1685479798 || iS3 == 1685479729 || iS3 == 1685481573 || iS3 == 1685481521 || iS3 == 1634760241) {
                g gVar2 = gVar;
                int i13 = i12;
                I(o0Var, iS3, iF, iS2, i10, i11, drmInitData, gVar2, i13);
                gVar = gVar2;
                i12 = i13;
            } else if (iS3 == 1836069985 || iS3 == 1701733217 || iS3 == 1633889587 || iS3 == 1700998451 || iS3 == 1633889588 || iS3 == 1835823201 || iS3 == 1685353315 || iS3 == 1685353317 || iS3 == 1685353320 || iS3 == 1685353324 || iS3 == 1685353336 || iS3 == 1935764850 || iS3 == 1935767394 || iS3 == 1819304813 || iS3 == 1936684916 || iS3 == 1953984371 || iS3 == 778924082 || iS3 == 778924083 || iS3 == 1835557169 || iS3 == 1835560241 || iS3 == 1634492771 || iS3 == 1634492791 || iS3 == 1970037111 || iS3 == 1332770163 || iS3 == 1716281667 || iS3 == 1767992678) {
                g gVar3 = gVar;
                g(o0Var, iS3, iF, iS2, i10, str, z10, drmInitData, gVar3, i12);
                gVar = gVar3;
            } else if (iS3 == 1414810956 || iS3 == 1954034535 || iS3 == 2004251764 || iS3 == 1937010800 || iS3 == 1664495672) {
                B(o0Var, iS3, iF, iS2, i10, str, gVar);
            } else if (iS3 == 1835365492) {
                s(o0Var, iS3, iF, i10, gVar);
            } else if (iS3 == 1667329389) {
                gVar.f67932b = new androidx.media3.common.w.b().e0(i10).u0("application/x-camera-motion").N();
            }
            o0Var.a0(iF + iS2);
            i12++;
        }
        return gVar;
    }

    private static void B(o0 o0Var, int i10, int i11, int i12, int i13, String str, g gVar) {
        o0Var.a0(i11 + 16);
        String str2 = "application/ttml+xml";
        l6 l6VarG = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = i12 - 16;
                byte[] bArr = new byte[i14];
                o0Var.n(bArr, 0, i14);
                l6VarG = l6.G(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                gVar.f67934d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        gVar.f67932b = new androidx.media3.common.w.b().e0(i13).u0(str2).j0(str).y0(j10).g0(l6VarG).N();
    }

    private static j C(o0 o0Var) {
        long j10;
        o0Var.a0(8);
        int iN = n(o0Var.s());
        o0Var.b0(iN == 0 ? 8 : 16);
        int iS = o0Var.s();
        o0Var.b0(4);
        int iF = o0Var.f();
        int i10 = iN == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i12 >= i10) {
                o0Var.b0(i10);
                break;
            }
            if (o0Var.e()[iF + i12] != -1) {
                long jN = iN == 0 ? o0Var.N() : o0Var.S();
                if (jN == 0) {
                    break;
                }
                j10 = jN;
                break;
            }
            i12++;
        }
        o0Var.b0(16);
        int iS2 = o0Var.s();
        int iS3 = o0Var.s();
        o0Var.b0(4);
        int iS4 = o0Var.s();
        int iS5 = o0Var.s();
        if (iS2 == 0 && iS3 == 65536 && iS4 == -65536 && iS5 == 0) {
            i11 = 90;
        } else if (iS2 == 0 && iS3 == -65536 && iS4 == 65536 && iS5 == 0) {
            i11 = 270;
        } else if (iS2 == -65536 && iS3 == 0 && iS4 == 0 && iS5 == -65536) {
            i11 = 180;
        }
        return new j(iS, j10, i11);
    }

    @p0
    public static v D(androidx.media3.container.b.C0572b c0572b, androidx.media3.container.b.c cVar, long j10, @p0 DrmInitData drmInitData, boolean z10, boolean z11) throws v0 {
        long[] jArr;
        long[] jArr2;
        androidx.media3.container.b.C0572b c0572bD;
        Pair<long[], long[]> pairJ;
        androidx.media3.container.b.C0572b c0572b2 = (androidx.media3.container.b.C0572b) androidx.media3.common.util.a.g(c0572b.d(1835297121));
        int iD = d(o(((androidx.media3.container.b.c) androidx.media3.common.util.a.g(c0572b2.e(1751411826))).Q1));
        if (iD == -1) {
            return null;
        }
        j jVarC = C(((androidx.media3.container.b.c) androidx.media3.common.util.a.g(c0572b.e(1953196132))).Q1);
        long j11 = j10 == -9223372036854775807L ? jVarC.f67944b : j10;
        long j12 = t(cVar.Q1).f62107c;
        long jX1 = j11 != -9223372036854775807L ? k1.X1(j11, 1000000L, j12) : -9223372036854775807L;
        androidx.media3.container.b.C0572b c0572b3 = (androidx.media3.container.b.C0572b) androidx.media3.common.util.a.g(((androidx.media3.container.b.C0572b) androidx.media3.common.util.a.g(c0572b2.d(1835626086))).d(1937007212));
        d dVarQ = q(((androidx.media3.container.b.c) androidx.media3.common.util.a.g(c0572b2.e(1835296868))).Q1);
        androidx.media3.container.b.c cVarE = c0572b3.e(1937011556);
        if (cVarE == null) {
            throw v0.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        g gVarA = A(cVarE.Q1, jVarC.f67943a, jVarC.f67945c, dVarQ.f67926c, drmInitData, z11);
        if (z10 || (c0572bD = c0572b.d(1701082227)) == null || (pairJ = j(c0572bD)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairJ.first;
            jArr2 = (long[]) pairJ.second;
            jArr = jArr3;
        }
        if (gVarA.f67932b == null) {
            return null;
        }
        return new v(jVarC.f67943a, iD, dVarQ.f67924a, j12, jX1, dVarQ.f67925b, gVarA.f67932b, gVarA.f67934d, gVarA.f67931a, gVarA.f67933c, jArr, jArr2);
    }

    public static List<y> E(androidx.media3.container.b.C0572b c0572b, g0 g0Var, long j10, @p0 DrmInitData drmInitData, boolean z10, boolean z11, com.google.common.base.t<v, v> tVar) throws v0 {
        v vVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c0572b.S1.size(); i10++) {
            androidx.media3.container.b.C0572b c0572b2 = c0572b.S1.get(i10);
            if (c0572b2.f62099a == 1953653099 && (vVarApply = tVar.apply(D(c0572b2, (androidx.media3.container.b.c) androidx.media3.common.util.a.g(c0572b.e(1836476516)), j10, drmInitData, z10, z11))) != null) {
                arrayList.add(y(vVarApply, (androidx.media3.container.b.C0572b) androidx.media3.common.util.a.g(((androidx.media3.container.b.C0572b) androidx.media3.common.util.a.g(((androidx.media3.container.b.C0572b) androidx.media3.common.util.a.g(c0572b2.d(1835297121))).d(1835626086))).d(1937007212)), g0Var));
            }
        }
        return arrayList;
    }

    public static r0 F(androidx.media3.container.b.c cVar) {
        o0 o0Var = cVar.Q1;
        o0Var.a0(8);
        r0 r0Var = new r0(new r0.a[0]);
        while (o0Var.a() >= 8) {
            int iF = o0Var.f();
            int iS = o0Var.s();
            int iS2 = o0Var.s();
            if (iS2 == 1835365473) {
                o0Var.a0(iF);
                r0Var = r0Var.b(G(o0Var, iF + iS));
            } else if (iS2 == 1936553057) {
                o0Var.a0(iF);
                r0Var = r0Var.b(t.b(o0Var, iF + iS));
            } else if (iS2 == -1451722374) {
                r0Var = r0Var.b(J(o0Var));
            }
            o0Var.a0(iF + iS);
        }
        return r0Var;
    }

    @p0
    private static r0 G(o0 o0Var, int i10) {
        o0Var.b0(8);
        e(o0Var);
        while (o0Var.f() < i10) {
            int iF = o0Var.f();
            int iS = o0Var.s();
            if (o0Var.s() == 1768715124) {
                o0Var.a0(iF);
                return p(o0Var, iF + iS);
            }
            o0Var.a0(iF + iS);
        }
        return null;
    }

    @p0
    static k H(o0 o0Var, int i10, int i11) throws v0 {
        o0Var.a0(i10 + 8);
        int iF = o0Var.f();
        c cVarZ = null;
        while (iF - i10 < i11) {
            o0Var.a0(iF);
            int iS = o0Var.s();
            androidx.media3.extractor.u.a(iS > 0, "childAtomSize must be positive");
            if (o0Var.s() == 1702454643) {
                cVarZ = z(o0Var, iF, iS);
            }
            iF += iS;
        }
        if (cVarZ == null) {
            return null;
        }
        return new k(cVarZ);
    }

    private static void I(o0 o0Var, int i10, int i11, int i12, int i13, int i14, @p0 DrmInitData drmInitData, g gVar, int i15) throws v0 {
        String str;
        int i16;
        String str2;
        int i17;
        androidx.media3.container.f.k kVar;
        List<byte[]> list;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = i11;
        int i25 = i12;
        DrmInitData drmInitDataC = drmInitData;
        g gVar2 = gVar;
        o0Var.a0(i24 + 16);
        o0Var.b0(16);
        int iT = o0Var.T();
        int iT2 = o0Var.T();
        o0Var.b0(50);
        int iF = o0Var.f();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair<Integer, w> pairW = w(o0Var, i24, i25);
            if (pairW != null) {
                iIntValue = ((Integer) pairW.first).intValue();
                drmInitDataC = drmInitDataC == null ? null : drmInitDataC.c(((w) pairW.second).f68124b);
                gVar2.f67931a[i15] = (w) pairW.second;
            }
            o0Var.a0(iF);
        }
        String str3 = "video/3gpp";
        if (iIntValue == 1831958048) {
            str = "video/mpeg";
        } else {
            str = iIntValue == 1211250227 ? "video/3gpp" : null;
        }
        float fU = 1.0f;
        int i26 = 8;
        int i27 = 8;
        List<byte[]> listG = null;
        String str4 = null;
        byte[] bArrV = null;
        int i28 = -1;
        int i29 = -1;
        int i30 = -1;
        int iO = -1;
        int i31 = -1;
        int iP = -1;
        ByteBuffer byteBufferA = null;
        C0609b c0609bK = null;
        androidx.media3.container.f.k kVar2 = null;
        boolean z10 = false;
        while (iF - i24 < i25) {
            o0Var.a0(iF);
            int iF2 = o0Var.f();
            int iS = o0Var.s();
            if (iS == 0 && o0Var.f() - i11 == i25) {
                break;
            }
            androidx.media3.extractor.u.a(iS > 0, "childAtomSize must be positive");
            int iS2 = o0Var.s();
            if (iS2 == 1635148611) {
                androidx.media3.extractor.u.a(str == null, null);
                o0Var.a0(iF2 + 8);
                androidx.media3.extractor.d dVarB = androidx.media3.extractor.d.b(o0Var);
                List<byte[]> list2 = dVarB.f67182a;
                gVar2.f67933c = dVarB.f67183b;
                if (!z10) {
                    fU = dVarB.f67192k;
                }
                String str5 = dVarB.f67193l;
                int i32 = dVarB.f67191j;
                int i33 = dVarB.f67188g;
                int i34 = dVarB.f67189h;
                listG = list2;
                int i35 = dVarB.f67190i;
                int i36 = dVarB.f67186e;
                androidx.media3.container.f.k kVar3 = kVar2;
                drmInitDataC = drmInitDataC;
                kVar = kVar3;
                i16 = iF;
                i18 = iIntValue;
                str2 = str3;
                iO = i33;
                i17 = i34;
                iP = i35;
                i27 = dVarB.f67187f;
                i26 = i36;
                str4 = str5;
                str = "video/avc";
                i29 = i32;
            } else {
                i16 = iF;
                if (iS2 == 1752589123) {
                    androidx.media3.extractor.u.a(str == null, null);
                    o0Var.a0(iF2 + 8);
                    h0 h0VarA = h0.a(o0Var);
                    List<byte[]> list3 = h0VarA.f67347a;
                    gVar2.f67933c = h0VarA.f67348b;
                    if (!z10) {
                        fU = h0VarA.f67358l;
                    }
                    int i37 = h0VarA.f67359m;
                    int i38 = h0VarA.f67349c;
                    String str6 = h0VarA.f67360n;
                    int i39 = h0VarA.f67357k;
                    listG = list3;
                    if (i39 != -1) {
                        i28 = i39;
                    }
                    int i40 = h0VarA.f67354h;
                    int i41 = h0VarA.f67355i;
                    int i42 = h0VarA.f67356j;
                    int i43 = h0VarA.f67352f;
                    int i44 = h0VarA.f67353g;
                    drmInitDataC = drmInitDataC;
                    i18 = iIntValue;
                    str2 = str3;
                    i17 = i41;
                    iO = i40;
                    iP = i42;
                    i26 = i43;
                    kVar = h0VarA.f67361o;
                    i29 = i37;
                    i30 = i38;
                    str4 = str6;
                    i27 = i44;
                    str = "video/hevc";
                } else {
                    str2 = str3;
                    if (iS2 == 1818785347) {
                        androidx.media3.extractor.u.a("video/hevc".equals(str), "lhvC must follow hvcC atom");
                        androidx.media3.container.f.k kVar4 = kVar2;
                        androidx.media3.extractor.u.a(kVar4 != null && kVar4.f62183b.size() >= 2, "must have at least two layers");
                        o0Var.a0(iF2 + 8);
                        h0 h0VarC = h0.c(o0Var, (androidx.media3.container.f.k) androidx.media3.common.util.a.g(kVar4));
                        androidx.media3.extractor.u.a(gVar2.f67933c == h0VarC.f67348b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i45 = h0VarC.f67354h;
                        int i46 = iO;
                        if (i45 != -1) {
                            androidx.media3.extractor.u.a(i46 == i45, "colorSpace must be the same for both views");
                        }
                        int i47 = h0VarC.f67355i;
                        int i48 = i31;
                        if (i47 != -1) {
                            androidx.media3.extractor.u.a(i48 == i47, "colorRange must be the same for both views");
                        }
                        int i49 = h0VarC.f67356j;
                        if (i49 != -1) {
                            int i50 = iP;
                            i23 = i50;
                            androidx.media3.extractor.u.a(i50 == i49, "colorTransfer must be the same for both views");
                        } else {
                            i23 = iP;
                        }
                        androidx.media3.extractor.u.a(i26 == h0VarC.f67352f, "bitdepthLuma must be the same for both views");
                        androidx.media3.extractor.u.a(i27 == h0VarC.f67353g, "bitdepthChroma must be the same for both views");
                        List<byte[]> listE = listG;
                        if (listE != null) {
                            listE = l6.s().c(listE).c(h0VarC.f67347a).e();
                        } else {
                            androidx.media3.extractor.u.a(false, "initializationData must be already set from hvcC atom");
                        }
                        String str7 = h0VarC.f67360n;
                        str = s0.D;
                        i18 = iIntValue;
                        i17 = i48;
                        iO = i46;
                        iP = i23;
                        str4 = str7;
                        kVar = kVar4;
                        listG = listE;
                    } else {
                        List<byte[]> listI = listG;
                        iO = iO;
                        i17 = i31;
                        iP = iP;
                        androidx.media3.container.f.k kVar5 = kVar2;
                        if (iS2 == 1986361461) {
                            k kVarH = H(o0Var, iF2, iS);
                            if (kVarH == null || kVarH.f67946a == null) {
                                i22 = i28;
                                i28 = i22;
                            } else if (kVar5 == null || kVar5.f62183b.size() < 2) {
                                i22 = i28;
                                if (i22 == -1) {
                                    i28 = kVarH.f67946a.f67923a.f67929c ? 5 : 4;
                                } else {
                                    i28 = i22;
                                }
                            } else {
                                androidx.media3.extractor.u.a(kVarH.b(), "both eye views must be marked as available");
                                androidx.media3.extractor.u.a(!kVarH.f67946a.f67923a.f67929c, "for MV-HEVC, eye_views_reversed must be set to false");
                                i22 = i28;
                                i28 = i22;
                            }
                            drmInitDataC = drmInitDataC;
                            listG = listI;
                            i18 = iIntValue;
                            iO = iO;
                            iP = iP;
                            kVar = kVar5;
                        } else {
                            int i51 = i28;
                            kVar = kVar5;
                            if (iS2 == 1685480259 || iS2 == 1685485123) {
                                drmInitDataC = drmInitDataC;
                                list = listI;
                                i18 = iIntValue;
                                i19 = i51;
                                i27 = i27;
                                i26 = i26;
                                i20 = iO;
                                i21 = iP;
                                androidx.media3.extractor.n nVarA = androidx.media3.extractor.n.a(o0Var);
                                if (nVarA != null) {
                                    str = "video/dolby-vision";
                                    str4 = nVarA.f68158c;
                                }
                            } else if (iS2 == 1987076931) {
                                androidx.media3.extractor.u.a(str == null, null);
                                String str8 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                o0Var.a0(iF2 + 12);
                                byte bL = (byte) o0Var.L();
                                byte bL2 = (byte) o0Var.L();
                                int iL = o0Var.L();
                                i26 = iL >> 4;
                                i18 = iIntValue;
                                byte b10 = (byte) ((iL >> 1) & 7);
                                if (str8.equals("video/x-vnd.on2.vp9")) {
                                    listI = androidx.media3.common.util.k.i(bL, bL2, (byte) i26, b10);
                                }
                                boolean z11 = (iL & 1) != 0;
                                int iL2 = o0Var.L();
                                int iL3 = o0Var.L();
                                iO = androidx.media3.common.k.o(iL2);
                                int i52 = z11 ? 1 : 2;
                                iP = androidx.media3.common.k.p(iL3);
                                str = str8;
                                drmInitDataC = drmInitDataC;
                                i27 = i26;
                                i17 = i52;
                                kVar = kVar;
                                listG = listI;
                                i28 = i51;
                            } else {
                                i18 = iIntValue;
                                if (iS2 == 1635135811) {
                                    int i53 = iS - 8;
                                    byte[] bArr = new byte[i53];
                                    o0Var.n(bArr, 0, i53);
                                    listG = l6.G(bArr);
                                    o0Var.a0(iF2 + 8);
                                    androidx.media3.common.k kVarH2 = h(o0Var);
                                    int i54 = kVarH2.f60804e;
                                    int i55 = kVarH2.f60805f;
                                    int i56 = kVarH2.f60800a;
                                    int i57 = kVarH2.f60801b;
                                    iP = kVarH2.f60802c;
                                    i26 = i54;
                                    i27 = i55;
                                    iO = i56;
                                    i17 = i57;
                                    str = "video/av01";
                                } else if (iS2 == 1668050025) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer = byteBufferA;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(o0Var.H());
                                    byteBuffer.putShort(o0Var.H());
                                    byteBufferA = byteBuffer;
                                    listG = listI;
                                    iO = iO;
                                    iP = iP;
                                } else if (iS2 == 1835295606) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer2 = byteBufferA;
                                    short sH = o0Var.H();
                                    short sH2 = o0Var.H();
                                    short sH3 = o0Var.H();
                                    short sH4 = o0Var.H();
                                    int i58 = i27;
                                    short sH5 = o0Var.H();
                                    int i59 = i26;
                                    short sH6 = o0Var.H();
                                    short sH7 = o0Var.H();
                                    short sH8 = o0Var.H();
                                    long jN = o0Var.N();
                                    long jN2 = o0Var.N();
                                    byteBuffer2.position(1);
                                    byteBuffer2.putShort(sH5);
                                    byteBuffer2.putShort(sH6);
                                    byteBuffer2.putShort(sH);
                                    byteBuffer2.putShort(sH2);
                                    byteBuffer2.putShort(sH3);
                                    byteBuffer2.putShort(sH4);
                                    byteBuffer2.putShort(sH7);
                                    byteBuffer2.putShort(sH8);
                                    byteBuffer2.putShort((short) (jN / 10000));
                                    byteBuffer2.putShort((short) (jN2 / 10000));
                                    byteBufferA = byteBuffer2;
                                    kVar = kVar;
                                    i27 = i58;
                                    i26 = i59;
                                    iO = iO;
                                    iP = iP;
                                    listG = listI;
                                    i28 = i51;
                                } else {
                                    drmInitDataC = drmInitDataC;
                                    list = listI;
                                    i19 = i51;
                                    i27 = i27;
                                    i26 = i26;
                                    if (iS2 == 1681012275) {
                                        androidx.media3.extractor.u.a(str == null, null);
                                        str = str2;
                                    } else if (iS2 == 1702061171) {
                                        androidx.media3.extractor.u.a(str == null, null);
                                        c0609bK = k(o0Var, iF2);
                                        String str9 = c0609bK.f67919a;
                                        byte[] bArr2 = c0609bK.f67920b;
                                        listG = bArr2 != null ? l6.G(bArr2) : list;
                                        str = str9;
                                        kVar = kVar;
                                        i27 = i27;
                                        i26 = i26;
                                        i28 = i19;
                                    } else if (iS2 == 1885434736) {
                                        fU = u(o0Var, iF2);
                                        kVar = kVar;
                                        i27 = i27;
                                        i26 = i26;
                                        iO = iO;
                                        iP = iP;
                                        listG = list;
                                        i28 = i19;
                                        z10 = true;
                                    } else if (iS2 == 1937126244) {
                                        bArrV = v(o0Var, iF2, iS);
                                    } else if (iS2 == 1936995172) {
                                        int iL4 = o0Var.L();
                                        o0Var.b0(3);
                                        if (iL4 == 0) {
                                            int iL5 = o0Var.L();
                                            if (iL5 == 0) {
                                                i19 = 0;
                                            } else if (iL5 == 1) {
                                                i19 = 1;
                                            } else if (iL5 == 2) {
                                                i19 = 2;
                                            } else if (iL5 == 3) {
                                                i19 = 3;
                                            }
                                        }
                                    } else {
                                        if (iS2 == 1634760259) {
                                            int i60 = iS - 12;
                                            byte[] bArr3 = new byte[i60];
                                            o0Var.a0(iF2 + 12);
                                            o0Var.n(bArr3, 0, i60);
                                            listG = l6.G(bArr3);
                                            androidx.media3.common.k kVarF = f(new o0(bArr3));
                                            int i61 = kVarF.f60804e;
                                            int i62 = kVarF.f60805f;
                                            int i63 = kVarF.f60800a;
                                            int i64 = kVarF.f60801b;
                                            iP = kVarF.f60802c;
                                            i26 = i61;
                                            i27 = i62;
                                            iO = i63;
                                            i17 = i64;
                                            str = s0.f61319k;
                                            kVar = kVar;
                                            i28 = i19;
                                        } else {
                                            i20 = iO;
                                            if (iS2 == 1668246642) {
                                                i21 = iP;
                                                if (i20 == -1 && i21 == -1) {
                                                    int iS3 = o0Var.s();
                                                    if (iS3 == f67900f || iS3 == f67899e) {
                                                        int iT3 = o0Var.T();
                                                        int iT4 = o0Var.T();
                                                        o0Var.b0(2);
                                                        boolean z12 = iS == 19 && (o0Var.L() & 128) != 0;
                                                        int iO2 = androidx.media3.common.k.o(iT3);
                                                        i17 = z12 ? 1 : 2;
                                                        i27 = i27;
                                                        i26 = i26;
                                                        listG = list;
                                                        iO = iO2;
                                                        iP = androidx.media3.common.k.p(iT4);
                                                    } else {
                                                        androidx.media3.common.util.z.n(f67895a, "Unsupported color type: " + androidx.media3.container.b.a(iS3));
                                                    }
                                                }
                                                kVar = kVar;
                                                i28 = i19;
                                            } else {
                                                i21 = iP;
                                            }
                                        }
                                    }
                                    listG = list;
                                    i28 = i19;
                                }
                                i28 = i51;
                            }
                            i27 = i27;
                            i26 = i26;
                            listG = list;
                            iP = i21;
                            iO = i20;
                            kVar = kVar;
                            i28 = i19;
                        }
                    }
                }
            }
            DrmInitData drmInitData2 = drmInitDataC;
            kVar2 = kVar;
            drmInitDataC = drmInitData2;
            i24 = i11;
            i25 = i12;
            iF = i16 + iS;
            iIntValue = i18;
            str3 = str2;
            i31 = i17;
            gVar2 = gVar;
        }
        DrmInitData drmInitData3 = drmInitDataC;
        List<byte[]> list4 = listG;
        int i65 = i28;
        int i66 = iO;
        int i67 = i31;
        int i68 = iP;
        int i69 = i27;
        int i70 = i26;
        if (str == null) {
            return;
        }
        androidx.media3.common.w.b bVarT = new androidx.media3.common.w.b().e0(i13).u0(str).S(str4).B0(iT).d0(iT2).q0(fU).t0(i14).r0(bArrV).x0(i65).g0(list4).l0(i29).m0(i30).Y(drmInitData3).T(new androidx.media3.common.k.b().d(i66).c(i67).e(i68).f(byteBufferA != null ? byteBufferA.array() : null).g(i70).b(i69).a());
        if (c0609bK != null) {
            bVarT.Q(com.google.common.primitives.l.A(c0609bK.f67921c)).p0(com.google.common.primitives.l.A(c0609bK.f67922d));
        }
        gVar.f67932b = bVarT.N();
    }

    @p0
    private static r0 J(o0 o0Var) {
        short sH = o0Var.H();
        o0Var.b0(2);
        String strI = o0Var.I(sH);
        int iMax = Math.max(strI.lastIndexOf(43), strI.lastIndexOf(45));
        try {
            return new r0(new androidx.media3.container.c(Float.parseFloat(strI.substring(0, iMax)), Float.parseFloat(strI.substring(iMax, strI.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[k1.w(4, 0, length)] && jArr[k1.w(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static int c(o0 o0Var, int i10, int i11, int i12) throws v0 {
        int iF = o0Var.f();
        androidx.media3.extractor.u.a(iF >= i11, null);
        while (iF - i11 < i12) {
            o0Var.a0(iF);
            int iS = o0Var.s();
            androidx.media3.extractor.u.a(iS > 0, "childAtomSize must be positive");
            if (o0Var.s() == i10) {
                return iF;
            }
            iF += iS;
        }
        return -1;
    }

    private static int d(int i10) {
        if (i10 == f67902h) {
            return 1;
        }
        if (i10 == f67905k) {
            return 2;
        }
        if (i10 == f67904j || i10 == f67901g || i10 == f67903i || i10 == f67896b) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void e(o0 o0Var) {
        int iF = o0Var.f();
        o0Var.b0(4);
        if (o0Var.s() != 1751411826) {
            iF += 4;
        }
        o0Var.a0(iF);
    }

    private static androidx.media3.common.k f(o0 o0Var) {
        androidx.media3.common.k.b bVar = new androidx.media3.common.k.b();
        n0 n0Var = new n0(o0Var.e());
        n0Var.q(o0Var.f() * 8);
        n0Var.t(1);
        int iH = n0Var.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            n0Var.t(1);
            int iH2 = n0Var.h(8);
            for (int i11 = 0; i11 < iH2; i11++) {
                n0Var.s(6);
                boolean zG = n0Var.g();
                n0Var.r();
                n0Var.t(11);
                n0Var.s(4);
                int iH3 = n0Var.h(4) + 8;
                bVar.g(iH3);
                bVar.b(iH3);
                n0Var.t(1);
                if (zG) {
                    int iH4 = n0Var.h(8);
                    int iH5 = n0Var.h(8);
                    n0Var.t(1);
                    bVar.d(androidx.media3.common.k.o(iH4)).c(n0Var.g() ? 1 : 2).e(androidx.media3.common.k.p(iH5));
                }
            }
        }
        return bVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0171  */
    private static void g(o0 o0Var, int i10, int i11, int i12, int i13, String str, boolean z10, @p0 DrmInitData drmInitData, g gVar, int i14) throws v0 {
        int iT;
        int i15;
        int i16;
        int iT2;
        int iM;
        int iS;
        int i17;
        String str2;
        String str3;
        int iIntValue = i10;
        int i18 = i12;
        DrmInitData drmInitDataC = drmInitData;
        o0Var.a0(i11 + 16);
        if (z10) {
            iT = o0Var.T();
            o0Var.b0(6);
        } else {
            o0Var.b0(8);
            iT = 0;
        }
        if (iT == 0 || iT == 1) {
            i15 = 2;
            i16 = 4;
            iT2 = o0Var.T();
            o0Var.b0(6);
            iM = o0Var.M();
            o0Var.a0(o0Var.f() - 4);
            iS = o0Var.s();
            if (iT == 1) {
                o0Var.b0(16);
            }
            i17 = -1;
        } else {
            if (iT != 2) {
                return;
            }
            o0Var.b0(16);
            i15 = 2;
            iM = (int) Math.round(o0Var.q());
            int iP = o0Var.P();
            o0Var.b0(4);
            int iP2 = o0Var.P();
            int iP3 = o0Var.P();
            boolean z11 = (iP3 & 1) != 0;
            boolean z12 = (iP3 & 2) != 0;
            i16 = 4;
            if (z11) {
                if (iP2 == 32) {
                    i17 = 4;
                } else {
                    i17 = -1;
                }
            } else if (iP2 == 8) {
                i17 = 3;
            } else if (iP2 == 16) {
                i17 = z12 ? 268435456 : 2;
            } else if (iP2 == 24) {
                i17 = z12 ? androidx.media3.common.j.D : 21;
            } else if (iP2 == 32) {
                i17 = z12 ? androidx.media3.common.j.F : 22;
            } else {
                i17 = -1;
            }
            o0Var.b0(8);
            iT2 = iP;
            iS = 0;
        }
        if (iIntValue == 1767992678) {
            iM = -1;
            iT2 = -1;
        } else {
            if (iIntValue != 1935764850) {
                iM = iIntValue == 1935767394 ? 16000 : 8000;
            }
            iT2 = 1;
        }
        int iF = o0Var.f();
        if (iIntValue == 1701733217) {
            Pair<Integer, w> pairW = w(o0Var, i11, i18);
            if (pairW != null) {
                iIntValue = ((Integer) pairW.first).intValue();
                drmInitDataC = drmInitDataC == null ? null : drmInitDataC.c(((w) pairW.second).f68124b);
                gVar.f67931a[i14] = (w) pairW.second;
            }
            o0Var.a0(iF);
        }
        String str4 = s0.O;
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = s0.f61293a0;
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue == 1936684916) {
            str2 = "audio/raw";
            i17 = i15;
        } else if (iIntValue == 1953984371) {
            str2 = "audio/raw";
            i17 = 268435456;
        } else if (iIntValue == 1819304813) {
            if (i17 == -1) {
                str2 = "audio/raw";
                i17 = i15;
            } else {
                str2 = "audio/raw";
            }
        } else if (iIntValue == 778924082 || iIntValue == 778924083) {
            str2 = "audio/mpeg";
        } else if (iIntValue == 1835557169) {
            str2 = s0.N;
        } else if (iIntValue == 1835560241) {
            str2 = s0.O;
        } else if (iIntValue == 1634492771) {
            str2 = "audio/alac";
        } else if (iIntValue == 1634492791) {
            str2 = "audio/g711-alaw";
        } else if (iIntValue == 1970037111) {
            str2 = "audio/g711-mlaw";
        } else if (iIntValue == 1332770163) {
            str2 = "audio/opus";
        } else if (iIntValue == 1716281667) {
            str2 = "audio/flac";
        } else if (iIntValue == 1835823201) {
            str2 = "audio/true-hd";
        } else {
            str2 = iIntValue == 1767992678 ? s0.f61324m0 : null;
        }
        String str5 = null;
        List<byte[]> listG = null;
        C0609b c0609bK = null;
        while (iF - i11 < i18) {
            o0Var.a0(iF);
            int iS2 = o0Var.s();
            int i19 = i17;
            androidx.media3.extractor.u.a(iS2 > 0, "childAtomSize must be positive");
            int iS3 = o0Var.s();
            if (iS3 == 1835557187) {
                o0Var.a0(iF + 8);
                o0Var.b0(1);
                int iL = o0Var.L();
                o0Var.b0(1);
                String str6 = Objects.equals(str2, str4) ? String.format("mhm1.%02X", Integer.valueOf(iL)) : String.format("mha1.%02X", Integer.valueOf(iL));
                int iT3 = o0Var.T();
                byte[] bArr = new byte[iT3];
                o0Var.n(bArr, 0, iT3);
                listG = listG == null ? l6.G(bArr) : l6.J(bArr, listG.get(0));
                str5 = str6;
            } else {
                if (iS3 == 1835557200) {
                    o0Var.a0(iF + 8);
                    int iL2 = o0Var.L();
                    if (iL2 > 0) {
                        byte[] bArr2 = new byte[iL2];
                        str3 = str4;
                        o0Var.n(bArr2, 0, iL2);
                        listG = listG == null ? l6.G(bArr2) : l6.J(listG.get(0), bArr2);
                    }
                } else {
                    str3 = str4;
                    if (iS3 == 1702061171 || (z10 && iS3 == 2002876005)) {
                        i16 = i16;
                        int iC = iS3 == 1702061171 ? iF : c(o0Var, 1702061171, iF, iS2);
                        if (iC != -1) {
                            c0609bK = k(o0Var, iC);
                            str2 = c0609bK.f67919a;
                            byte[] bArr3 = c0609bK.f67920b;
                            if (bArr3 != null) {
                                if ("audio/vorbis".equals(str2)) {
                                    listG = x0.e(bArr3);
                                } else {
                                    if ("audio/mp4a-latm".equals(str2)) {
                                        androidx.media3.extractor.a.c cVarF = androidx.media3.extractor.a.f(bArr3);
                                        int i20 = cVarF.f67007a;
                                        int i21 = cVarF.f67008b;
                                        str5 = cVarF.f67009c;
                                        iM = i20;
                                        iT2 = i21;
                                    }
                                    listG = l6.G(bArr3);
                                }
                            }
                        }
                    } else {
                        if (iS3 == 1684103987) {
                            o0Var.a0(iF + 8);
                            gVar.f67932b = androidx.media3.extractor.b.d(o0Var, Integer.toString(i13), str, drmInitDataC);
                        } else if (iS3 == 1684366131) {
                            o0Var.a0(iF + 8);
                            gVar.f67932b = androidx.media3.extractor.b.h(o0Var, Integer.toString(i13), str, drmInitDataC);
                        } else if (iS3 == 1684103988) {
                            o0Var.a0(iF + 8);
                            gVar.f67932b = androidx.media3.extractor.c.d(o0Var, Integer.toString(i13), str, drmInitDataC);
                        } else if (iS3 == 1684892784) {
                            if (iS <= 0) {
                                throw v0.a("Invalid sample rate for Dolby TrueHD MLP stream: " + iS, null);
                            }
                            iM = iS;
                            iT2 = i15;
                        } else if (iS3 == 1684305011 || iS3 == 1969517683) {
                            i16 = i16;
                            gVar.f67932b = new androidx.media3.common.w.b().e0(i13).u0(str2).R(iT2).v0(iM).Y(drmInitDataC).j0(str).N();
                        } else if (iS3 == 1682927731) {
                            int i22 = iS2 - 8;
                            byte[] bArr4 = f67909o;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + i22);
                            o0Var.a0(iF + 8);
                            o0Var.n(bArrCopyOf, bArr4.length, i22);
                            listG = m0.a(bArrCopyOf);
                        } else if (iS3 == 1684425825) {
                            byte[] bArr5 = new byte[iS2 - 8];
                            bArr5[0] = 102;
                            bArr5[1] = 76;
                            bArr5[i15] = 97;
                            bArr5[3] = 67;
                            o0Var.a0(iF + 12);
                            i16 = i16;
                            o0Var.n(bArr5, i16, iS2 - 12);
                            listG = l6.G(bArr5);
                        } else {
                            i16 = i16;
                            if (iS3 == 1634492771) {
                                int i23 = iS2 - 12;
                                byte[] bArr6 = new byte[i23];
                                o0Var.a0(iF + 12);
                                o0Var.n(bArr6, 0, i23);
                                Pair<Integer, Integer> pairY = androidx.media3.common.util.k.y(bArr6);
                                int iIntValue2 = ((Integer) pairY.first).intValue();
                                int iIntValue3 = ((Integer) pairY.second).intValue();
                                listG = l6.G(bArr6);
                                iM = iIntValue2;
                                iT2 = iIntValue3;
                            } else if (iS3 == 1767990114) {
                                o0Var.a0(iF + 9);
                                int iQ = o0Var.Q();
                                byte[] bArr7 = new byte[iQ];
                                o0Var.n(bArr7, 0, iQ);
                                listG = l6.G(bArr7);
                            }
                        }
                        i16 = i16;
                    }
                    iF += iS2;
                    i18 = i12;
                    i16 = i16;
                    i17 = i19;
                    str4 = str3;
                }
                iF += iS2;
                i18 = i12;
                i16 = i16;
                i17 = i19;
                str4 = str3;
            }
            str3 = str4;
            iF += iS2;
            i18 = i12;
            i16 = i16;
            i17 = i19;
            str4 = str3;
        }
        int i24 = i17;
        if (gVar.f67932b != null || str2 == null) {
            return;
        }
        androidx.media3.common.w.b bVarJ0 = new androidx.media3.common.w.b().e0(i13).u0(str2).S(str5).R(iT2).v0(iM).o0(i24).g0(listG).Y(drmInitDataC).j0(str);
        if (c0609bK != null) {
            bVarJ0.Q(com.google.common.primitives.l.A(c0609bK.f67921c)).p0(com.google.common.primitives.l.A(c0609bK.f67922d));
        }
        gVar.f67932b = bVarJ0.N();
    }

    private static androidx.media3.common.k h(o0 o0Var) {
        androidx.media3.common.k.b bVar = new androidx.media3.common.k.b();
        n0 n0Var = new n0(o0Var.e());
        n0Var.q(o0Var.f() * 8);
        n0Var.t(1);
        int iH = n0Var.h(3);
        n0Var.s(6);
        boolean zG = n0Var.g();
        boolean zG2 = n0Var.g();
        if (iH == 2 && zG) {
            bVar.g(zG2 ? 12 : 10);
            bVar.b(zG2 ? 12 : 10);
        } else if (iH <= 2) {
            bVar.g(zG ? 10 : 8);
            bVar.b(zG ? 10 : 8);
        }
        n0Var.s(13);
        n0Var.r();
        int iH2 = n0Var.h(4);
        if (iH2 != 1) {
            androidx.media3.common.util.z.h(f67895a, "Unsupported obu_type: " + iH2);
            return bVar.a();
        }
        if (n0Var.g()) {
            androidx.media3.common.util.z.h(f67895a, "Unsupported obu_extension_flag");
            return bVar.a();
        }
        boolean zG3 = n0Var.g();
        n0Var.r();
        if (zG3 && n0Var.h(8) > 127) {
            androidx.media3.common.util.z.h(f67895a, "Excessive obu_size");
            return bVar.a();
        }
        int iH3 = n0Var.h(3);
        n0Var.r();
        if (n0Var.g()) {
            androidx.media3.common.util.z.h(f67895a, "Unsupported reduced_still_picture_header");
            return bVar.a();
        }
        if (n0Var.g()) {
            androidx.media3.common.util.z.h(f67895a, "Unsupported timing_info_present_flag");
            return bVar.a();
        }
        if (n0Var.g()) {
            androidx.media3.common.util.z.h(f67895a, "Unsupported initial_display_delay_present_flag");
            return bVar.a();
        }
        int iH4 = n0Var.h(5);
        boolean z10 = false;
        for (int i10 = 0; i10 <= iH4; i10++) {
            n0Var.s(12);
            if (n0Var.h(5) > 7) {
                n0Var.r();
            }
        }
        int iH5 = n0Var.h(4);
        int iH6 = n0Var.h(4);
        n0Var.s(iH5 + 1);
        n0Var.s(iH6 + 1);
        if (n0Var.g()) {
            n0Var.s(7);
        }
        n0Var.s(7);
        boolean zG4 = n0Var.g();
        if (zG4) {
            n0Var.s(2);
        }
        if ((n0Var.g() ? 2 : n0Var.h(1)) > 0 && !n0Var.g()) {
            n0Var.s(1);
        }
        if (zG4) {
            n0Var.s(3);
        }
        n0Var.s(3);
        boolean zG5 = n0Var.g();
        if (iH3 == 2 && zG5) {
            n0Var.r();
        }
        if (iH3 != 1 && n0Var.g()) {
            z10 = true;
        }
        if (n0Var.g()) {
            int iH7 = n0Var.h(8);
            int iH8 = n0Var.h(8);
            bVar.d(androidx.media3.common.k.o(iH7)).c(((z10 || iH7 != 1 || iH8 != 13 || n0Var.h(8) != 0) ? n0Var.h(1) : 1) != 1 ? 2 : 1).e(androidx.media3.common.k.p(iH8));
        }
        return bVar.a();
    }

    @p0
    static Pair<Integer, w> i(o0 o0Var, int i10, int i11) throws v0 {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String strI = null;
        Integer numValueOf = null;
        while (i12 - i10 < i11) {
            o0Var.a0(i12);
            int iS = o0Var.s();
            int iS2 = o0Var.s();
            if (iS2 == 1718775137) {
                numValueOf = Integer.valueOf(o0Var.s());
            } else if (iS2 == 1935894637) {
                o0Var.b0(4);
                strI = o0Var.I(4);
            } else if (iS2 == 1935894633) {
                i13 = i12;
                i14 = iS;
            }
            i12 += iS;
        }
        if (!"cenc".equals(strI) && !"cbc1".equals(strI) && !"cens".equals(strI) && !"cbcs".equals(strI)) {
            return null;
        }
        androidx.media3.extractor.u.a(numValueOf != null, "frma atom is mandatory");
        androidx.media3.extractor.u.a(i13 != -1, "schi atom is mandatory");
        w wVarX = x(o0Var, i13, i14, strI);
        androidx.media3.extractor.u.a(wVarX != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (w) k1.o(wVarX));
    }

    @p0
    private static Pair<long[], long[]> j(androidx.media3.container.b.C0572b c0572b) {
        androidx.media3.container.b.c cVarE = c0572b.e(1701606260);
        if (cVarE == null) {
            return null;
        }
        o0 o0Var = cVarE.Q1;
        o0Var.a0(8);
        int iN = n(o0Var.s());
        int iP = o0Var.P();
        long[] jArr = new long[iP];
        long[] jArr2 = new long[iP];
        for (int i10 = 0; i10 < iP; i10++) {
            jArr[i10] = iN == 1 ? o0Var.S() : o0Var.N();
            jArr2[i10] = iN == 1 ? o0Var.E() : o0Var.s();
            if (o0Var.H() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            o0Var.b0(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static C0609b k(o0 o0Var, int i10) {
        o0Var.a0(i10 + 12);
        o0Var.b0(1);
        l(o0Var);
        o0Var.b0(2);
        int iL = o0Var.L();
        if ((iL & 128) != 0) {
            o0Var.b0(2);
        }
        if ((iL & 64) != 0) {
            o0Var.b0(o0Var.L());
        }
        if ((iL & 32) != 0) {
            o0Var.b0(2);
        }
        o0Var.b0(1);
        l(o0Var);
        String strH = s0.h(o0Var.L());
        if ("audio/mpeg".equals(strH) || "audio/vnd.dts".equals(strH) || "audio/vnd.dts.hd".equals(strH)) {
            return new C0609b(strH, null, -1L, -1L);
        }
        o0Var.b0(4);
        long jN = o0Var.N();
        long jN2 = o0Var.N();
        o0Var.b0(1);
        int iL2 = l(o0Var);
        long j10 = jN2;
        byte[] bArr = new byte[iL2];
        o0Var.n(bArr, 0, iL2);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new C0609b(strH, bArr, j10, jN > 0 ? jN : -1L);
    }

    private static int l(o0 o0Var) {
        int iL = o0Var.L();
        int i10 = iL & 127;
        while ((iL & 128) == 128) {
            iL = o0Var.L();
            i10 = (i10 << 7) | (iL & 127);
        }
        return i10;
    }

    public static int m(int i10) {
        return i10 & 16777215;
    }

    public static int n(int i10) {
        return (i10 >> 24) & 255;
    }

    private static int o(o0 o0Var) {
        o0Var.a0(16);
        return o0Var.s();
    }

    @p0
    private static r0 p(o0 o0Var, int i10) {
        o0Var.b0(8);
        ArrayList arrayList = new ArrayList();
        while (o0Var.f() < i10) {
            r0.a aVarD = androidx.media3.extractor.mp4.k.d(o0Var);
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new r0(arrayList);
    }

    private static d q(o0 o0Var) {
        long j10;
        o0Var.a0(8);
        int iN = n(o0Var.s());
        o0Var.b0(iN == 0 ? 8 : 16);
        long jN = o0Var.N();
        int iF = o0Var.f();
        int i10 = iN == 0 ? 4 : 8;
        int i11 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i11 >= i10) {
                o0Var.b0(i10);
                break;
            }
            if (o0Var.e()[iF + i11] != -1) {
                long jN2 = iN == 0 ? o0Var.N() : o0Var.S();
                if (jN2 == 0) {
                    break;
                }
                long jX1 = k1.X1(jN2, 1000000L, jN);
                jN = jN;
                j10 = jX1;
                break;
            }
            i11++;
        }
        int iT = o0Var.T();
        return new d(jN, j10, "" + ((char) (((iT >> 10) & 31) + 96)) + ((char) (((iT >> 5) & 31) + 96)) + ((char) ((iT & 31) + 96)));
    }

    @p0
    public static r0 r(androidx.media3.container.b.C0572b c0572b) {
        androidx.media3.container.b.c cVarE = c0572b.e(1751411826);
        androidx.media3.container.b.c cVarE2 = c0572b.e(1801812339);
        androidx.media3.container.b.c cVarE3 = c0572b.e(1768715124);
        if (cVarE == null || cVarE2 == null || cVarE3 == null || o(cVarE.Q1) != f67897c) {
            return null;
        }
        o0 o0Var = cVarE2.Q1;
        o0Var.a0(12);
        int iS = o0Var.s();
        String[] strArr = new String[iS];
        for (int i10 = 0; i10 < iS; i10++) {
            int iS2 = o0Var.s();
            o0Var.b0(4);
            strArr[i10] = o0Var.I(iS2 - 8);
        }
        o0 o0Var2 = cVarE3.Q1;
        o0Var2.a0(8);
        ArrayList arrayList = new ArrayList();
        while (o0Var2.a() > 8) {
            int iF = o0Var2.f();
            int iS3 = o0Var2.s();
            int iS4 = o0Var2.s() - 1;
            if (iS4 < 0 || iS4 >= iS) {
                androidx.media3.common.util.z.n(f67895a, "Skipped metadata with unknown key index: " + iS4);
            } else {
                androidx.media3.container.a aVarI = androidx.media3.extractor.mp4.k.i(o0Var2, iF + iS3, strArr[iS4]);
                if (aVarI != null) {
                    arrayList.add(aVarI);
                }
            }
            o0Var2.a0(iF + iS3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new r0(arrayList);
    }

    private static void s(o0 o0Var, int i10, int i11, int i12, g gVar) {
        o0Var.a0(i11 + 16);
        if (i10 == 1835365492) {
            o0Var.F();
            String strF = o0Var.F();
            if (strF != null) {
                gVar.f67932b = new androidx.media3.common.w.b().e0(i12).u0(strF).N();
            }
        }
    }

    public static androidx.media3.container.e t(o0 o0Var) {
        long jE;
        long jE2;
        o0Var.a0(8);
        if (n(o0Var.s()) == 0) {
            jE = o0Var.N();
            jE2 = o0Var.N();
        } else {
            jE = o0Var.E();
            jE2 = o0Var.E();
        }
        return new androidx.media3.container.e(jE, jE2, o0Var.N());
    }

    private static float u(o0 o0Var, int i10) {
        o0Var.a0(i10 + 8);
        return o0Var.P() / o0Var.P();
    }

    @p0
    private static byte[] v(o0 o0Var, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            o0Var.a0(i12);
            int iS = o0Var.s();
            if (o0Var.s() == 1886547818) {
                return Arrays.copyOfRange(o0Var.e(), i12, iS + i12);
            }
            i12 += iS;
        }
        return null;
    }

    @p0
    private static Pair<Integer, w> w(o0 o0Var, int i10, int i11) throws v0 {
        Pair<Integer, w> pairI;
        int iF = o0Var.f();
        while (iF - i10 < i11) {
            o0Var.a0(iF);
            int iS = o0Var.s();
            androidx.media3.extractor.u.a(iS > 0, "childAtomSize must be positive");
            if (o0Var.s() == 1936289382 && (pairI = i(o0Var, iF, iS)) != null) {
                return pairI;
            }
            iF += iS;
        }
        return null;
    }

    @p0
    private static w x(o0 o0Var, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            o0Var.a0(i14);
            int iS = o0Var.s();
            if (o0Var.s() == 1952804451) {
                int iN = n(o0Var.s());
                o0Var.b0(1);
                if (iN == 0) {
                    o0Var.b0(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int iL = o0Var.L();
                    i12 = iL & 15;
                    i13 = (iL & 240) >> 4;
                }
                boolean z10 = o0Var.L() == 1;
                int iL2 = o0Var.L();
                byte[] bArr2 = new byte[16];
                o0Var.n(bArr2, 0, 16);
                if (z10 && iL2 == 0) {
                    int iL3 = o0Var.L();
                    bArr = new byte[iL3];
                    o0Var.n(bArr, 0, iL3);
                }
                return new w(z10, str, iL2, bArr2, i13, i12, bArr);
            }
            i14 += iS;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static y y(v vVar, androidx.media3.container.b.C0572b c0572b, g0 g0Var) throws v0 {
        e iVar;
        boolean z10;
        int iP;
        int iP2;
        int iP3;
        int i10;
        int i11;
        int i12;
        v vVar2;
        long[] jArrCopyOf;
        int[] iArr;
        long[] jArrCopyOf2;
        int i13;
        int[] iArrCopyOf;
        int i14;
        v vVar3;
        long[] jArr;
        int i15;
        long j10;
        int[] iArr2;
        int i16;
        int i17;
        int i18;
        v vVarA = vVar;
        androidx.media3.container.b.c cVarE = c0572b.e(1937011578);
        if (cVarE != null) {
            iVar = new h(cVarE, vVarA.f68116g);
        } else {
            androidx.media3.container.b.c cVarE2 = c0572b.e(1937013298);
            if (cVarE2 == null) {
                throw v0.a("Track has no sample table size information", null);
            }
            iVar = new i(cVarE2);
        }
        int iB = iVar.b();
        if (iB == 0) {
            return new y(vVarA, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (vVarA.f68111b == 2) {
            long j11 = vVarA.f68115f;
            if (j11 > 0) {
                vVarA = vVarA.a(vVarA.f68116g.b().b0(iB / (j11 / 1000000.0f)).N());
            }
        }
        v vVar4 = vVarA;
        androidx.media3.container.b.c cVarE3 = c0572b.e(1937007471);
        if (cVarE3 == null) {
            cVarE3 = (androidx.media3.container.b.c) androidx.media3.common.util.a.g(c0572b.e(1668232756));
            z10 = true;
        } else {
            z10 = false;
        }
        o0 o0Var = cVarE3.Q1;
        o0 o0Var2 = ((androidx.media3.container.b.c) androidx.media3.common.util.a.g(c0572b.e(1937011555))).Q1;
        o0 o0Var3 = ((androidx.media3.container.b.c) androidx.media3.common.util.a.g(c0572b.e(1937011827))).Q1;
        androidx.media3.container.b.c cVarE4 = c0572b.e(1937011571);
        o0 o0Var4 = cVarE4 != null ? cVarE4.Q1 : null;
        androidx.media3.container.b.c cVarE5 = c0572b.e(1668576371);
        o0 o0Var5 = cVarE5 != null ? cVarE5.Q1 : null;
        a aVar = new a(o0Var2, o0Var, z10);
        o0Var3.a0(12);
        int iP4 = o0Var3.P() - 1;
        int iP5 = o0Var3.P();
        int iP6 = o0Var3.P();
        if (o0Var5 != null) {
            o0Var5.a0(12);
            iP = o0Var5.P();
        } else {
            iP = 0;
        }
        if (o0Var4 != null) {
            o0Var4.a0(12);
            iP3 = o0Var4.P();
            if (iP3 > 0) {
                iP2 = o0Var4.P() - 1;
                i10 = 0;
            } else {
                iP2 = -1;
                i10 = 0;
                o0Var4 = null;
            }
        } else {
            iP2 = -1;
            iP3 = 0;
            i10 = 0;
        }
        int iC = iVar.c();
        String str = vVar4.f68116g.f61761o;
        if (((iC == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iP4 == 0 && iP == 0 && iP3 == 0)) ? i10 : 1) != 0) {
            int i19 = aVar.f67910a;
            long[] jArr2 = new long[i19];
            int[] iArr3 = new int[i19];
            while (aVar.a()) {
                int i20 = aVar.f67911b;
                jArr2[i20] = aVar.f67913d;
                iArr3[i20] = aVar.f67912c;
            }
            androidx.media3.extractor.mp4.d.b bVarA = androidx.media3.extractor.mp4.d.a(iC, jArr2, iArr3, iP6);
            long[] jArr3 = bVarA.f67952a;
            iArr = bVarA.f67953b;
            int i21 = bVarA.f67954c;
            jArrCopyOf2 = bVarA.f67955d;
            iArrCopyOf = bVarA.f67956e;
            jArr = jArr3;
            i15 = i21;
            i11 = 1;
            j10 = bVarA.f67957f;
            vVar3 = vVar4;
        } else {
            long[] jArr4 = new long[iB];
            int[] iArr4 = new int[iB];
            long[] jArr5 = new long[iB];
            i11 = 1;
            int[] iArr5 = new int[iB];
            o0 o0Var6 = o0Var5;
            e eVar = iVar;
            int iS = iP6;
            o0 o0Var7 = o0Var4;
            long j12 = 0;
            long j13 = 0;
            int iP7 = iP2;
            int i22 = i10;
            int iS2 = i22;
            int i23 = iS2;
            int i24 = i23;
            int iP8 = iP5;
            int i25 = iP4;
            int i26 = i24;
            while (true) {
                if (i22 >= iB) {
                    i12 = i25;
                    vVar2 = vVar4;
                    jArrCopyOf = jArr4;
                    iArr = iArr4;
                    jArrCopyOf2 = jArr5;
                    i13 = i23;
                    iArrCopyOf = iArr5;
                    break;
                }
                long j14 = j13;
                int i27 = i23;
                boolean zA = true;
                while (i27 == 0) {
                    zA = aVar.a();
                    if (!zA) {
                        break;
                    }
                    int i28 = i25;
                    long j15 = aVar.f67913d;
                    i27 = aVar.f67912c;
                    j14 = j15;
                    vVar4 = vVar4;
                    i25 = i28;
                    iB = iB;
                }
                int i29 = iB;
                i12 = i25;
                vVar2 = vVar4;
                if (!zA) {
                    androidx.media3.common.util.z.n(f67895a, "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr4, i22);
                    int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i22);
                    jArrCopyOf2 = Arrays.copyOf(jArr5, i22);
                    iArrCopyOf = Arrays.copyOf(iArr5, i22);
                    i13 = i27;
                    iArr = iArrCopyOf2;
                    iB = i22;
                    break;
                }
                if (o0Var6 != null) {
                    int iP9 = i24;
                    while (iP9 == 0 && iP > 0) {
                        iP9 = o0Var6.P();
                        iS2 = o0Var6.s();
                        iP--;
                    }
                    i24 = iP9 - 1;
                }
                jArr4[i22] = j14;
                int iA = eVar.a();
                iArr4[i22] = iA;
                if (iA > i26) {
                    i26 = iA;
                }
                jArr5[i22] = j12 + ((long) iS2);
                iArr5[i22] = o0Var7 == null ? 1 : i10;
                if (i22 == iP7) {
                    iArr5[i22] = 1;
                    iP3--;
                    if (iP3 > 0) {
                        iP7 = ((o0) androidx.media3.common.util.a.g(o0Var7)).P() - 1;
                    }
                }
                j12 += (long) iS;
                iP8--;
                if (iP8 != 0 || i12 <= 0) {
                    i25 = i12;
                } else {
                    i25 = i12 - 1;
                    iP8 = o0Var3.P();
                    iS = o0Var3.s();
                }
                long j16 = j14 + ((long) iArr4[i22]);
                i23 = i27 - 1;
                i22++;
                vVar4 = vVar2;
                j13 = j16;
                iB = i29;
            }
            long j17 = j12 + ((long) iS2);
            if (o0Var6 == null) {
                i14 = 1;
                break;
            }
            while (true) {
                if (iP <= 0) {
                    i14 = 1;
                    break;
                }
                if (o0Var6.P() != 0) {
                    i14 = i10;
                    break;
                }
                o0Var6.s();
                iP--;
            }
            if (iP3 == 0 && iP8 == 0 && i13 == 0 && i12 == 0 && i24 == 0 && i14 != 0) {
                vVar3 = vVar2;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Inconsistent stbl box for track ");
                vVar3 = vVar2;
                sb2.append(vVar3.f68110a);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(iP3);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(iP8);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i13);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(i12);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i24);
                sb2.append(i14 == 0 ? ", ctts invalid" : "");
                androidx.media3.common.util.z.n(f67895a, sb2.toString());
            }
            jArr = jArrCopyOf;
            i15 = i26;
            j10 = j17;
        }
        long[] jArr6 = jArrCopyOf2;
        long jX1 = k1.X1(j10, 1000000L, vVar3.f68112c);
        long[] jArr7 = vVar3.f68118i;
        if (jArr7 == null) {
            k1.Z1(jArr6, 1000000L, vVar3.f68112c);
            return new y(vVar3, jArr, iArr, i15, jArr6, iArrCopyOf, jX1);
        }
        v vVarA2 = vVar3;
        int[] iArr6 = iArr;
        int[] iArr7 = iArrCopyOf;
        int i30 = i11;
        if (jArr7.length == i30 && vVarA2.f68111b == i30 && jArr6.length >= 2) {
            long j18 = ((long[]) androidx.media3.common.util.a.g(vVarA2.f68119j))[i10];
            long jX2 = j18 + k1.X1(vVarA2.f68118i[i10], vVarA2.f68112c, vVarA2.f68113d);
            if (b(jArr6, j10, j18, jX2)) {
                long jX3 = k1.X1(j18 - jArr6[i10], vVarA2.f68116g.F, vVarA2.f68112c);
                long jX4 = k1.X1(j10 - jX2, vVarA2.f68116g.F, vVarA2.f68112c);
                if ((jX3 != 0 || jX4 != 0) && jX3 <= g3.f12256c && jX4 <= g3.f12256c) {
                    g0Var.f67338a = (int) jX3;
                    g0Var.f67339b = (int) jX4;
                    k1.Z1(jArr6, 1000000L, vVarA2.f68112c);
                    return new y(vVarA2, jArr, iArr6, i15, jArr6, iArr7, k1.X1(vVarA2.f68118i[i10], 1000000L, vVarA2.f68113d));
                }
            }
        }
        long[] jArr8 = vVarA2.f68118i;
        if (jArr8.length == 1 && jArr8[i10] == 0) {
            long j19 = ((long[]) androidx.media3.common.util.a.g(vVarA2.f68119j))[i10];
            for (int i31 = i10; i31 < jArr6.length; i31++) {
                jArr6[i31] = k1.X1(jArr6[i31] - j19, 1000000L, vVarA2.f68112c);
            }
            return new y(vVarA2, jArr, iArr6, i15, jArr6, iArr7, k1.X1(j10 - j19, 1000000L, vVarA2.f68112c));
        }
        boolean z11 = vVarA2.f68111b == 1 ? 1 : i10;
        int[] iArr8 = new int[jArr8.length];
        int[] iArr9 = new int[jArr8.length];
        long[] jArr9 = (long[]) androidx.media3.common.util.a.g(vVarA2.f68119j);
        int i32 = i10;
        int i33 = i32;
        int i34 = i33;
        int i35 = i34;
        while (true) {
            long[] jArr10 = vVarA2.f68118i;
            iArr2 = iArr9;
            if (i32 >= jArr10.length) {
                break;
            }
            int[] iArr10 = iArr8;
            long j20 = jArr9[i32];
            if (j20 != -1) {
                long j21 = jArr10[i32];
                i16 = i32;
                int i36 = i33;
                long jX5 = k1.X1(j21, vVarA2.f68112c, vVarA2.f68113d);
                iArr10[i16] = k1.n(jArr6, j20, true, true);
                long j22 = j20 + jX5;
                iArr2[i16] = k1.j(jArr6, j22, z11, i10);
                int i37 = iArr10[i16];
                while (true) {
                    i18 = iArr10[i16];
                    if (i18 < 0 || (iArr7[i18] & 1) != 0) {
                        break;
                    }
                    iArr10[i16] = i18 - 1;
                }
                if (i18 < 0) {
                    iArr10[i16] = i37;
                    while (true) {
                        int i38 = iArr10[i16];
                        if (i38 >= iArr2[i16] || (iArr7[i38] & 1) != 0) {
                            break;
                        }
                        iArr10[i16] = i38 + 1;
                    }
                }
                if (vVarA2.f68111b == 2 && iArr10[i16] != iArr2[i16]) {
                    while (true) {
                        int i39 = iArr2[i16];
                        if (i39 >= jArr6.length - 1 || jArr6[i39 + 1] > j22) {
                            break;
                        }
                        iArr2[i16] = i39 + 1;
                    }
                }
                int i40 = iArr2[i16];
                int i41 = iArr10[i16];
                i34 += i40 - i41;
                i17 = i36 | (i35 != i41 ? 1 : 0);
                i35 = i40;
            } else {
                i16 = i32;
                i17 = i33;
            }
            i32 = i16 + 1;
            jArr9 = jArr9;
            i33 = i17;
            iArr9 = iArr2;
            iArr8 = iArr10;
            i10 = 0;
        }
        int[] iArr11 = iArr8;
        int i42 = i33 | (i34 != iB ? 1 : 0);
        long[] jArr11 = i42 != 0 ? new long[i34] : jArr;
        int[] iArr12 = i42 != 0 ? new int[i34] : iArr6;
        if (i42 != 0) {
            i15 = 0;
        }
        int[] iArr13 = i42 != 0 ? new int[i34] : iArr7;
        long[] jArr12 = new long[i34];
        int i43 = i15;
        long j23 = 0;
        int i44 = 0;
        int i45 = 0;
        boolean z12 = false;
        while (i44 < vVarA2.f68118i.length) {
            long j24 = vVarA2.f68119j[i44];
            int i46 = iArr11[i44];
            int i47 = iArr2[i44];
            int i48 = i42;
            if (i42 != 0) {
                int i49 = i47 - i46;
                System.arraycopy(jArr, i46, jArr11, i45, i49);
                System.arraycopy(iArr6, i46, iArr12, i45, i49);
                System.arraycopy(iArr7, i46, iArr13, i45, i49);
            }
            int i50 = i43;
            while (i46 < i47) {
                long[] jArr13 = jArr11;
                int[] iArr14 = iArr13;
                long jX6 = k1.X1(j23, 1000000L, vVarA2.f68113d);
                long jX7 = k1.X1(jArr6[i46] - j24, 1000000L, vVarA2.f68112c);
                if (jX7 < 0) {
                    z12 = true;
                }
                jArr12[i45] = jX6 + jX7;
                if (i48 != 0 && iArr12[i45] > i50) {
                    i50 = iArr6[i46];
                }
                i45++;
                i46++;
                iArr13 = iArr14;
                jArr11 = jArr13;
            }
            j23 += vVarA2.f68118i[i44];
            i44++;
            i43 = i50;
            iArr13 = iArr13;
            jArr11 = jArr11;
            i42 = i48;
        }
        long[] jArr14 = jArr11;
        int[] iArr15 = iArr13;
        long jX8 = k1.X1(j23, 1000000L, vVarA2.f68113d);
        if (z12) {
            vVarA2 = vVarA2.a(vVarA2.f68116g.b().c0(true).N());
        }
        return new y(vVarA2, jArr14, iArr12, i43, jArr12, iArr15, jX8);
    }

    @p0
    private static c z(o0 o0Var, int i10, int i11) throws v0 {
        o0Var.a0(i10 + 8);
        int iF = o0Var.f();
        while (iF - i10 < i11) {
            o0Var.a0(iF);
            int iS = o0Var.s();
            androidx.media3.extractor.u.a(iS > 0, "childAtomSize must be positive");
            if (o0Var.s() == 1937011305) {
                o0Var.b0(4);
                int iL = o0Var.L();
                return new c(new f((iL & 1) == 1, (iL & 2) == 2, (iL & 8) == 8));
            }
            iF += iS;
        }
        return null;
    }
}
