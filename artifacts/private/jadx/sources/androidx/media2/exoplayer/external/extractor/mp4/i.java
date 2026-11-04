package androidx.media2.exoplayer.external.extractor.mp4;

import androidx.annotation.b1;
import androidx.collection.g3;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.extractor.p;
import androidx.media2.exoplayer.external.extractor.q;
import androidx.media2.exoplayer.external.extractor.r;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.util.t;
import androidx.media2.exoplayer.external.util.x;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class i implements androidx.media2.exoplayer.external.extractor.i, q {
    private static final int A = 0;
    private static final int B = 1;
    private static final int C = 2;
    private static final int D = 1903435808;
    private static final long E = 262144;
    private static final long F = 10485760;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final androidx.media2.exoplayer.external.extractor.l f54479y = h.f54478a;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f54480z = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f54481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x f54482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x f54483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x f54484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x f54485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayDeque<androidx.media2.exoplayer.external.extractor.mp4.a.C0510a> f54486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f54487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f54488k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f54489l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f54490m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private x f54491n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f54492o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f54493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f54494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f54495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.k f54496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b[] f54497t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long[][] f54498u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f54499v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f54500w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f54501x;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f54502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f54503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s f54504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f54505d;

        public b(l track, o sampleTable, s trackOutput) {
            this.f54502a = track;
            this.f54503b = sampleTable;
            this.f54504c = trackOutput;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface c {
    }

    public i() {
        this(0);
    }

    private static long[][] g(b[] tracks) {
        long[][] jArr = new long[tracks.length][];
        int[] iArr = new int[tracks.length];
        long[] jArr2 = new long[tracks.length];
        boolean[] zArr = new boolean[tracks.length];
        for (int i10 = 0; i10 < tracks.length; i10++) {
            jArr[i10] = new long[tracks[i10].f54503b.f54551b];
            jArr2[i10] = tracks[i10].f54503b.f54555f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < tracks.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < tracks.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            o oVar = tracks[i12].f54503b;
            j10 += (long) oVar.f54553d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = oVar.f54555f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void h() {
        this.f54487j = 0;
        this.f54490m = 0;
    }

    private static int i(o sampleTable, long timeUs) {
        int iA = sampleTable.a(timeUs);
        return iA == -1 ? sampleTable.b(timeUs) : iA;
    }

    private int j(long inputPosition) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j10 = Long.MAX_VALUE;
        boolean z10 = true;
        long j11 = Long.MAX_VALUE;
        boolean z11 = true;
        long j12 = Long.MAX_VALUE;
        while (true) {
            b[] bVarArr = this.f54497t;
            if (i12 >= bVarArr.length) {
                break;
            }
            b bVar = bVarArr[i12];
            int i13 = bVar.f54505d;
            o oVar = bVar.f54503b;
            if (i13 != oVar.f54551b) {
                long j13 = oVar.f54552c[i13];
                long j14 = this.f54498u[i12][i13];
                long j15 = j13 - inputPosition;
                boolean z12 = j15 < 0 || j15 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j15 < j12)) {
                    j11 = j14;
                    z11 = z12;
                    i11 = i12;
                    j12 = j15;
                }
                if (j14 < j10) {
                    j10 = j14;
                    z10 = z12;
                    i10 = i12;
                }
            }
            i12++;
        }
        return (j10 == Long.MAX_VALUE || !z10 || j11 < j10 + 10485760) ? i11 : i10;
    }

    private ArrayList<o> k(androidx.media2.exoplayer.external.extractor.mp4.a.C0510a moov, androidx.media2.exoplayer.external.extractor.m gaplessInfoHolder, boolean ignoreEditLists) throws k0 {
        boolean z10;
        ArrayList<o> arrayList = new ArrayList<>();
        int i10 = 0;
        int i11 = 4 ^ 0;
        while (i10 < moov.f54365o1.size()) {
            androidx.media2.exoplayer.external.extractor.mp4.a.C0510a c0510a = moov.f54365o1.get(i10);
            if (c0510a.f54362a != 1953653099) {
                z10 = ignoreEditLists;
            } else {
                z10 = ignoreEditLists;
                l lVarV = androidx.media2.exoplayer.external.extractor.mp4.b.v(c0510a, moov.h(1836476516), -9223372036854775807L, null, z10, this.f54501x);
                if (lVarV != null) {
                    o oVarR = androidx.media2.exoplayer.external.extractor.mp4.b.r(lVarV, c0510a.g(1835297121).g(1835626086).g(1937007212), gaplessInfoHolder);
                    if (oVarR.f54551b != 0) {
                        arrayList.add(oVarR);
                    }
                }
            }
            i10++;
            ignoreEditLists = z10;
        }
        return arrayList;
    }

    static final /* synthetic */ androidx.media2.exoplayer.external.extractor.i[] l() {
        return new androidx.media2.exoplayer.external.extractor.i[]{new i()};
    }

    private static long m(o sampleTable, long seekTimeUs, long offset) {
        int i10 = i(sampleTable, seekTimeUs);
        return i10 == -1 ? offset : Math.min(sampleTable.f54552c[i10], offset);
    }

    private void n(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        this.f54484g.M(8);
        input.i(this.f54484g.f57720a, 0, 8);
        this.f54484g.R(4);
        if (this.f54484g.l() == 1751411826) {
            input.l();
        } else {
            input.o(4);
        }
    }

    private void o(long atomEndPosition) throws k0 {
        while (!this.f54486i.isEmpty() && this.f54486i.peek().f54363m1 == atomEndPosition) {
            androidx.media2.exoplayer.external.extractor.mp4.a.C0510a c0510aPop = this.f54486i.pop();
            if (c0510aPop.f54362a == 1836019574) {
                q(c0510aPop);
                this.f54486i.clear();
                this.f54487j = 2;
            } else if (!this.f54486i.isEmpty()) {
                this.f54486i.peek().d(c0510aPop);
            }
        }
        if (this.f54487j != 2) {
            h();
        }
    }

    private static boolean p(x atomData) {
        atomData.Q(8);
        if (atomData.l() == 1903435808) {
            return true;
        }
        atomData.R(4);
        while (atomData.a() > 0) {
            if (atomData.l() == 1903435808) {
                return true;
            }
        }
        return false;
    }

    private void q(androidx.media2.exoplayer.external.extractor.mp4.a.C0510a moov) throws k0 {
        Metadata metadataW;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        androidx.media2.exoplayer.external.extractor.m mVar = new androidx.media2.exoplayer.external.extractor.m();
        androidx.media2.exoplayer.external.extractor.mp4.a.b bVarH = moov.h(1969517665);
        if (bVarH != null) {
            metadataW = androidx.media2.exoplayer.external.extractor.mp4.b.w(bVarH, this.f54501x);
            if (metadataW != null) {
                mVar.c(metadataW);
            }
        } else {
            metadataW = null;
        }
        androidx.media2.exoplayer.external.extractor.mp4.a.C0510a c0510aG = moov.g(1835365473);
        Metadata metadataL = c0510aG != null ? androidx.media2.exoplayer.external.extractor.mp4.b.l(c0510aG) : null;
        ArrayList<o> arrayListK = k(moov, mVar, (this.f54481d & 1) != 0);
        int size = arrayListK.size();
        int i10 = 0;
        int size2 = -1;
        long jMax = -9223372036854775807L;
        while (i10 < size) {
            o oVar = arrayListK.get(i10);
            l lVar = oVar.f54550a;
            long j10 = lVar.f54518e;
            if (j10 == -9223372036854775807L) {
                j10 = oVar.f54557h;
            }
            jMax = Math.max(jMax, j10);
            ArrayList<o> arrayList2 = arrayListK;
            int i11 = size;
            b bVar = new b(lVar, oVar, this.f54496s.a(i10, lVar.f54515b));
            Format formatJ = lVar.f54519f.j(oVar.f54554e + 30);
            int i12 = i10;
            if (lVar.f54515b != 2 || j10 <= 0) {
                z10 = true;
            } else {
                int i13 = oVar.f54551b;
                z10 = true;
                if (i13 > 1) {
                    formatJ = formatJ.g(i13 / (j10 / 1000000.0f));
                }
            }
            bVar.f54504c.c(g.a(lVar.f54515b, formatJ, metadataW, metadataL, mVar));
            if (lVar.f54515b == 2 && size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(bVar);
            i10 = i12 + 1;
            arrayListK = arrayList2;
            size = i11;
        }
        this.f54499v = size2;
        this.f54500w = jMax;
        b[] bVarArr = (b[]) arrayList.toArray(new b[0]);
        this.f54497t = bVarArr;
        this.f54498u = g(bVarArr);
        this.f54496s.l();
        this.f54496s.q(this);
    }

    private boolean r(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        if (this.f54490m == 0) {
            if (!input.e(this.f54485h.f57720a, 0, 8, true)) {
                return false;
            }
            this.f54490m = 8;
            this.f54485h.Q(0);
            this.f54489l = this.f54485h.F();
            this.f54488k = this.f54485h.l();
        }
        long j10 = this.f54489l;
        if (j10 == 1) {
            input.readFully(this.f54485h.f57720a, 8, 8);
            this.f54490m += 8;
            this.f54489l = this.f54485h.I();
        } else if (j10 == 0) {
            long length = input.getLength();
            if (length == -1 && !this.f54486i.isEmpty()) {
                length = this.f54486i.peek().f54363m1;
            }
            if (length != -1) {
                this.f54489l = (length - input.getPosition()) + ((long) this.f54490m);
            }
        }
        if (this.f54489l < this.f54490m) {
            throw new k0("Atom size less than header length (unsupported).");
        }
        if (u(this.f54488k)) {
            long position = (input.getPosition() + this.f54489l) - ((long) this.f54490m);
            this.f54486i.push(new androidx.media2.exoplayer.external.extractor.mp4.a.C0510a(this.f54488k, position));
            if (this.f54489l == this.f54490m) {
                o(position);
            } else {
                if (this.f54488k == 1835365473) {
                    n(input);
                }
                h();
            }
        } else if (v(this.f54488k)) {
            androidx.media2.exoplayer.external.util.a.i(this.f54490m == 8);
            androidx.media2.exoplayer.external.util.a.i(this.f54489l <= g3.f12256c);
            x xVar = new x((int) this.f54489l);
            this.f54491n = xVar;
            System.arraycopy(this.f54485h.f57720a, 0, xVar.f57720a, 0, 8);
            this.f54487j = 1;
        } else {
            this.f54491n = null;
            this.f54487j = 1;
        }
        return true;
    }

    private boolean s(androidx.media2.exoplayer.external.extractor.j input, p positionHolder) throws InterruptedException, IOException {
        boolean z10;
        long j10 = this.f54489l - ((long) this.f54490m);
        long position = input.getPosition() + j10;
        x xVar = this.f54491n;
        if (xVar == null) {
            if (j10 < 262144) {
                input.o((int) j10);
            } else {
                positionHolder.f54695a = input.getPosition() + j10;
                z10 = true;
            }
            o(position);
            return (z10 || this.f54487j == 2) ? false : true;
        }
        input.readFully(xVar.f57720a, this.f54490m, (int) j10);
        if (this.f54488k == 1718909296) {
            this.f54501x = p(this.f54491n);
        } else if (!this.f54486i.isEmpty()) {
            this.f54486i.peek().e(new androidx.media2.exoplayer.external.extractor.mp4.a.b(this.f54488k, this.f54491n));
        }
        z10 = false;
        o(position);
        if (z10) {
        }
    }

    private int t(androidx.media2.exoplayer.external.extractor.j input, p positionHolder) throws InterruptedException, IOException {
        long position = input.getPosition();
        if (this.f54492o == -1) {
            int iJ = j(position);
            this.f54492o = iJ;
            if (iJ == -1) {
                return -1;
            }
            this.f54495r = "audio/ac4".equals(this.f54497t[iJ].f54502a.f54519f.f53103i);
        }
        b bVar = this.f54497t[this.f54492o];
        s sVar = bVar.f54504c;
        int i10 = bVar.f54505d;
        o oVar = bVar.f54503b;
        long j10 = oVar.f54552c[i10];
        int i11 = oVar.f54553d[i10];
        long j11 = (j10 - position) + ((long) this.f54493p);
        if (j11 < 0 || j11 >= 262144) {
            positionHolder.f54695a = j10;
            return 1;
        }
        if (bVar.f54502a.f54520g == 1) {
            j11 += 8;
            i11 -= 8;
        }
        input.o((int) j11);
        int i12 = bVar.f54502a.f54523j;
        if (i12 == 0) {
            if (this.f54495r) {
                androidx.media2.exoplayer.external.audio.b.a(i11, this.f54484g);
                int iD = this.f54484g.d();
                sVar.d(this.f54484g, iD);
                i11 += iD;
                this.f54493p += iD;
                this.f54495r = false;
            }
            while (true) {
                int i13 = this.f54493p;
                if (i13 >= i11) {
                    break;
                }
                int iA = sVar.a(input, i11 - i13, false);
                this.f54493p += iA;
                this.f54494q -= iA;
            }
        } else {
            byte[] bArr = this.f54483f.f57720a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i14 = 4 - i12;
            while (this.f54493p < i11) {
                int i15 = this.f54494q;
                if (i15 == 0) {
                    input.readFully(bArr, i14, i12);
                    this.f54483f.Q(0);
                    int iL = this.f54483f.l();
                    if (iL < 0) {
                        throw new k0("Invalid NAL length");
                    }
                    this.f54494q = iL;
                    this.f54482e.Q(0);
                    sVar.d(this.f54482e, 4);
                    this.f54493p += 4;
                    i11 += i14;
                } else {
                    int iA2 = sVar.a(input, i15, false);
                    this.f54493p += iA2;
                    this.f54494q -= iA2;
                }
            }
        }
        int i16 = i11;
        o oVar2 = bVar.f54503b;
        sVar.b(oVar2.f54555f[i10], oVar2.f54556g[i10], i16, 0, null);
        bVar.f54505d++;
        this.f54492o = -1;
        this.f54493p = 0;
        this.f54494q = 0;
        return 0;
    }

    private static boolean u(int atom) {
        return atom == 1836019574 || atom == 1953653099 || atom == 1835297121 || atom == 1835626086 || atom == 1937007212 || atom == 1701082227 || atom == 1835365473;
    }

    private static boolean v(int atom) {
        return atom == 1835296868 || atom == 1836476516 || atom == 1751411826 || atom == 1937011556 || atom == 1937011827 || atom == 1937011571 || atom == 1668576371 || atom == 1701606260 || atom == 1937011555 || atom == 1937011578 || atom == 1937013298 || atom == 1937007471 || atom == 1668232756 || atom == 1953196132 || atom == 1718909296 || atom == 1969517665 || atom == 1801812339 || atom == 1768715124;
    }

    private void w(long timeUs) {
        for (b bVar : this.f54497t) {
            o oVar = bVar.f54503b;
            int iA = oVar.a(timeUs);
            if (iA == -1) {
                iA = oVar.b(timeUs);
            }
            bVar.f54505d = iA;
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public long Q1() {
        return this.f54500w;
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public q.a R1(long timeUs) {
        long j10;
        long j11;
        int iB;
        b[] bVarArr = this.f54497t;
        if (bVarArr.length == 0) {
            return new q.a(r.f54700c);
        }
        int i10 = this.f54499v;
        long jM = -1;
        if (i10 != -1) {
            o oVar = bVarArr[i10].f54503b;
            int i11 = i(oVar, timeUs);
            if (i11 == -1) {
                return new q.a(r.f54700c);
            }
            long j12 = oVar.f54555f[i11];
            j10 = oVar.f54552c[i11];
            if (j12 >= timeUs || i11 >= oVar.f54551b - 1 || (iB = oVar.b(timeUs)) == -1 || iB == i11) {
                j11 = -9223372036854775807L;
            } else {
                j11 = oVar.f54555f[iB];
                jM = oVar.f54552c[iB];
            }
            timeUs = j12;
        } else {
            j10 = Long.MAX_VALUE;
            j11 = -9223372036854775807L;
        }
        int i12 = 0;
        while (true) {
            b[] bVarArr2 = this.f54497t;
            if (i12 >= bVarArr2.length) {
                break;
            }
            if (i12 != this.f54499v) {
                o oVar2 = bVarArr2[i12].f54503b;
                long jM2 = m(oVar2, timeUs, j10);
                if (j11 != -9223372036854775807L) {
                    jM = m(oVar2, j11, jM);
                }
                j10 = jM2;
            }
            i12++;
        }
        r rVar = new r(timeUs, j10);
        return j11 == -9223372036854775807L ? new q.a(rVar) : new q.a(rVar, new r(j11, jM));
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public boolean S1() {
        return true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void a(long position, long timeUs) {
        this.f54486i.clear();
        this.f54490m = 0;
        this.f54492o = -1;
        this.f54493p = 0;
        this.f54494q = 0;
        this.f54495r = false;
        if (position == 0) {
            h();
        } else if (this.f54497t != null) {
            w(timeUs);
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public boolean b(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        return k.d(input);
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void c(androidx.media2.exoplayer.external.extractor.k output) {
        this.f54496s = output;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public int f(androidx.media2.exoplayer.external.extractor.j input, p seekPosition) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.f54487j;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return t(input, seekPosition);
                    }
                    throw new IllegalStateException();
                }
                if (s(input, seekPosition)) {
                    return 1;
                }
            } else if (!r(input)) {
                int i11 = 2 ^ (-1);
                return -1;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void release() {
    }

    public i(int flags) {
        this.f54481d = flags;
        this.f54485h = new x(16);
        this.f54486i = new ArrayDeque<>();
        this.f54482e = new x(t.f57686b);
        this.f54483f = new x(4);
        this.f54484g = new x();
        this.f54492o = -1;
    }
}
