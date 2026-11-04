package androidx.constraintlayout.core;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class e {
    public static boolean A = true;
    public static boolean B = false;
    public static f C = null;
    public static long D = 0;
    public static long E = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f43349s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f43350t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final boolean f43351u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final boolean f43352v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f43353w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static boolean f43354x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f43355y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static boolean f43356z = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f43361e;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final c f43371o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f43374r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43357a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43358b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f43359c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap<String, i> f43360d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f43362f = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f43363g = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43365i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f43366j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean[] f43367k = new boolean[32];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f43368l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f43369m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f43370n = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private i[] f43372p = new i[1000];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f43373q = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    androidx.constraintlayout.core.b[] f43364h = new androidx.constraintlayout.core.b[32];

    interface a {
        void a(e eVar, i iVar, boolean z10);

        void b(e eVar, androidx.constraintlayout.core.b bVar, boolean z10);

        i c(e eVar, boolean[] zArr);

        void clear();

        void d(e eVar);

        void e(a aVar);

        void f(i iVar);

        i getKey();

        boolean isEmpty();
    }

    static class b extends androidx.constraintlayout.core.b {
        b(c cVar) {
            this.f43071e = new j(this, cVar);
        }
    }

    public e() {
        U();
        c cVar = new c();
        this.f43371o = cVar;
        this.f43361e = new h(cVar);
        if (B) {
            this.f43374r = new b(cVar);
        } else {
            this.f43374r = new androidx.constraintlayout.core.b(cVar);
        }
    }

    private int C(a aVar) throws Exception {
        float f10;
        long j10;
        for (int i10 = 0; i10 < this.f43369m; i10++) {
            androidx.constraintlayout.core.b bVar = this.f43364h[i10];
            if (bVar.f43067a.f43440j != i.a.UNRESTRICTED) {
                float f11 = 0.0f;
                if (bVar.f43068b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        f fVar = C;
                        long j11 = 1;
                        if (fVar != null) {
                            fVar.f43389o++;
                        }
                        i11++;
                        float f12 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i12 >= this.f43369m) {
                                break;
                            }
                            androidx.constraintlayout.core.b bVar2 = this.f43364h[i12];
                            if (bVar2.f43067a.f43440j == i.a.UNRESTRICTED || bVar2.f43072f || bVar2.f43068b >= f11) {
                                f10 = f11;
                                j10 = j11;
                            } else if (A) {
                                int iE = bVar2.f43071e.e();
                                int i16 = 0;
                                while (i16 < iE) {
                                    float f13 = f11;
                                    i iVarH = bVar2.f43071e.h(i16);
                                    long j12 = j11;
                                    float fJ = bVar2.f43071e.j(iVarH);
                                    if (fJ > f13) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f14 = iVarH.f43438h[i17] / fJ;
                                            if ((f14 < f12 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = iVarH.f43433c;
                                                i13 = i12;
                                                f12 = f14;
                                            }
                                        }
                                    }
                                    i16++;
                                    f11 = f13;
                                    j11 = j12;
                                }
                                f10 = f11;
                                j10 = j11;
                            } else {
                                f10 = f11;
                                j10 = j11;
                                for (int i18 = 1; i18 < this.f43368l; i18++) {
                                    i iVar = this.f43371o.f43076d[i18];
                                    float fJ2 = bVar2.f43071e.j(iVar);
                                    if (fJ2 > f10) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f15 = iVar.f43438h[i19] / fJ2;
                                            if ((f15 < f12 && i19 == i15) || i19 > i15) {
                                                i15 = i19;
                                                f12 = f15;
                                                i13 = i12;
                                                i14 = i18;
                                            }
                                        }
                                    }
                                }
                            }
                            i12++;
                            f11 = f10;
                            j11 = j10;
                        }
                        float f16 = f11;
                        long j13 = j11;
                        if (i13 != -1) {
                            androidx.constraintlayout.core.b bVar3 = this.f43364h[i13];
                            bVar3.f43067a.f43434d = -1;
                            f fVar2 = C;
                            if (fVar2 != null) {
                                fVar2.f43388n += j13;
                            }
                            bVar3.C(this.f43371o.f43076d[i14]);
                            i iVar2 = bVar3.f43067a;
                            iVar2.f43434d = i13;
                            iVar2.z(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f43368l / 2) {
                            z10 = true;
                        }
                        f11 = f16;
                    }
                    return i11;
                }
            }
        }
        return 0;
    }

    private String F(int i10) {
        int i11 = i10 * 4;
        int i12 = i11 / 1024;
        int i13 = i12 / 1024;
        if (i13 > 0) {
            return "" + i13 + " Mb";
        }
        if (i12 > 0) {
            return "" + i12 + " Kb";
        }
        return "" + i11 + " bytes";
    }

    private String G(int i10) {
        if (i10 == 1) {
            return "LOW";
        }
        if (i10 == 2) {
            return "MEDIUM";
        }
        if (i10 == 3) {
            return "HIGH";
        }
        if (i10 == 4) {
            return "HIGHEST";
        }
        if (i10 == 5) {
            return "EQUALITY";
        }
        if (i10 == 8) {
            return "FIXED";
        }
        return i10 == 6 ? "BARRIER" : "NONE";
    }

    public static f J() {
        return C;
    }

    private void Q() {
        int i10 = this.f43362f * 2;
        this.f43362f = i10;
        this.f43364h = (androidx.constraintlayout.core.b[]) Arrays.copyOf(this.f43364h, i10);
        c cVar = this.f43371o;
        cVar.f43076d = (i[]) Arrays.copyOf(cVar.f43076d, this.f43362f);
        int i11 = this.f43362f;
        this.f43367k = new boolean[i11];
        this.f43363g = i11;
        this.f43370n = i11;
        f fVar = C;
        if (fVar != null) {
            fVar.f43382h++;
            fVar.f43394t = Math.max(fVar.f43394t, i11);
            f fVar2 = C;
            fVar2.E = fVar2.f43394t;
        }
    }

    private int T(a aVar, boolean z10) {
        f fVar = C;
        if (fVar != null) {
            fVar.f43386l++;
        }
        for (int i10 = 0; i10 < this.f43368l; i10++) {
            this.f43367k[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            f fVar2 = C;
            if (fVar2 != null) {
                fVar2.f43387m++;
            }
            i11++;
            if (i11 < this.f43368l * 2) {
                if (aVar.getKey() != null) {
                    this.f43367k[aVar.getKey().f43433c] = true;
                }
                i iVarC = aVar.c(this, this.f43367k);
                if (iVarC != null) {
                    boolean[] zArr = this.f43367k;
                    int i12 = iVarC.f43433c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarC != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f43369m; i14++) {
                        androidx.constraintlayout.core.b bVar = this.f43364h[i14];
                        if (bVar.f43067a.f43440j != i.a.UNRESTRICTED && !bVar.f43072f && bVar.y(iVarC)) {
                            float fJ = bVar.f43071e.j(iVarC);
                            if (fJ < 0.0f) {
                                float f11 = (-bVar.f43068b) / fJ;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        androidx.constraintlayout.core.b bVar2 = this.f43364h[i13];
                        bVar2.f43067a.f43434d = -1;
                        f fVar3 = C;
                        if (fVar3 != null) {
                            fVar3.f43388n++;
                        }
                        bVar2.C(iVarC);
                        i iVar = bVar2.f43067a;
                        iVar.f43434d = i13;
                        iVar.z(this, bVar2);
                    }
                } else {
                    z11 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    private void U() {
        int i10 = 0;
        if (B) {
            while (i10 < this.f43369m) {
                androidx.constraintlayout.core.b bVar = this.f43364h[i10];
                if (bVar != null) {
                    this.f43371o.f43073a.a(bVar);
                }
                this.f43364h[i10] = null;
                i10++;
            }
        } else {
            while (i10 < this.f43369m) {
                androidx.constraintlayout.core.b bVar2 = this.f43364h[i10];
                if (bVar2 != null) {
                    this.f43371o.f43074b.a(bVar2);
                }
                this.f43364h[i10] = null;
                i10++;
            }
        }
    }

    private i a(i.a aVar, String str) {
        i iVarAcquire = this.f43371o.f43075c.acquire();
        if (iVarAcquire == null) {
            iVarAcquire = new i(aVar, str);
            iVarAcquire.w(aVar, str);
        } else {
            iVarAcquire.r();
            iVarAcquire.w(aVar, str);
        }
        int i10 = this.f43373q;
        int i11 = this.f43357a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f43357a = i12;
            this.f43372p = (i[]) Arrays.copyOf(this.f43372p, i12);
        }
        i[] iVarArr = this.f43372p;
        int i13 = this.f43373q;
        this.f43373q = i13 + 1;
        iVarArr[i13] = iVarAcquire;
        return iVarAcquire;
    }

    private void l(androidx.constraintlayout.core.b bVar) {
        int i10;
        if (f43355y && bVar.f43072f) {
            bVar.f43067a.s(this, bVar.f43068b);
        } else {
            androidx.constraintlayout.core.b[] bVarArr = this.f43364h;
            int i11 = this.f43369m;
            bVarArr[i11] = bVar;
            i iVar = bVar.f43067a;
            iVar.f43434d = i11;
            this.f43369m = i11 + 1;
            iVar.z(this, bVar);
        }
        if (f43355y && this.f43358b) {
            int i12 = 0;
            while (i12 < this.f43369m) {
                if (this.f43364h[i12] == null) {
                    System.out.println("WTF");
                }
                androidx.constraintlayout.core.b bVar2 = this.f43364h[i12];
                if (bVar2 != null && bVar2.f43072f) {
                    bVar2.f43067a.s(this, bVar2.f43068b);
                    if (B) {
                        this.f43371o.f43073a.a(bVar2);
                    } else {
                        this.f43371o.f43074b.a(bVar2);
                    }
                    this.f43364h[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f43369m;
                        if (i13 >= i10) {
                            break;
                        }
                        androidx.constraintlayout.core.b[] bVarArr2 = this.f43364h;
                        int i15 = i13 - 1;
                        androidx.constraintlayout.core.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f43067a;
                        if (iVar2.f43434d == i13) {
                            iVar2.f43434d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f43364h[i14] = null;
                    }
                    this.f43369m = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f43358b = false;
        }
    }

    private void p() {
        for (int i10 = 0; i10 < this.f43369m; i10++) {
            androidx.constraintlayout.core.b bVar = this.f43364h[i10];
            bVar.f43067a.f43436f = bVar.f43068b;
        }
    }

    public static androidx.constraintlayout.core.b u(e eVar, i iVar, i iVar2, float f10) {
        return eVar.t().m(iVar, iVar2, f10);
    }

    private i w(String str, i.a aVar) {
        f fVar = C;
        if (fVar != null) {
            fVar.f43390p++;
        }
        if (this.f43368l + 1 >= this.f43363g) {
            Q();
        }
        i iVarA = a(aVar, null);
        iVarA.t(str);
        int i10 = this.f43359c + 1;
        this.f43359c = i10;
        this.f43368l++;
        iVarA.f43433c = i10;
        if (this.f43360d == null) {
            this.f43360d = new HashMap<>();
        }
        this.f43360d.put(str, iVarA);
        this.f43371o.f43076d[this.f43359c] = iVarA;
        return iVarA;
    }

    private void y() {
        z();
        String str = "";
        for (int i10 = 0; i10 < this.f43369m; i10++) {
            str = (str + this.f43364h[i10]) + "\n";
        }
        System.out.println(str + this.f43361e + "\n");
    }

    private void z() {
        System.out.println("Display Rows (" + this.f43369m + "x" + this.f43368l + ")\n");
    }

    void A() {
        int iE = 0;
        for (int i10 = 0; i10 < this.f43362f; i10++) {
            androidx.constraintlayout.core.b bVar = this.f43364h[i10];
            if (bVar != null) {
                iE += bVar.E();
            }
        }
        int iE2 = 0;
        for (int i11 = 0; i11 < this.f43369m; i11++) {
            androidx.constraintlayout.core.b bVar2 = this.f43364h[i11];
            if (bVar2 != null) {
                iE2 += bVar2.E();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Linear System -> Table size: ");
        sb2.append(this.f43362f);
        sb2.append(" (");
        int i12 = this.f43362f;
        sb2.append(F(i12 * i12));
        sb2.append(") -- row sizes: ");
        sb2.append(F(iE));
        sb2.append(", actual size: ");
        sb2.append(F(iE2));
        sb2.append(" rows: ");
        sb2.append(this.f43369m);
        sb2.append("/");
        sb2.append(this.f43370n);
        sb2.append(" cols: ");
        sb2.append(this.f43368l);
        sb2.append("/");
        sb2.append(this.f43363g);
        sb2.append(" ");
        sb2.append(0);
        sb2.append(" occupied cells, ");
        sb2.append(F(0));
        printStream.println(sb2.toString());
    }

    public void B() {
        z();
        String str = "";
        for (int i10 = 0; i10 < this.f43369m; i10++) {
            if (this.f43364h[i10].f43067a.f43440j == i.a.UNRESTRICTED) {
                str = (str + this.f43364h[i10].F()) + "\n";
            }
        }
        System.out.println(str + this.f43361e + "\n");
    }

    public void D(f fVar) {
        C = fVar;
    }

    public c E() {
        return this.f43371o;
    }

    a H() {
        return this.f43361e;
    }

    public int I() {
        int iE = 0;
        for (int i10 = 0; i10 < this.f43369m; i10++) {
            androidx.constraintlayout.core.b bVar = this.f43364h[i10];
            if (bVar != null) {
                iE += bVar.E();
            }
        }
        return iE;
    }

    public int K() {
        return this.f43369m;
    }

    public int L() {
        return this.f43359c;
    }

    public int M(Object obj) {
        i iVarJ = ((androidx.constraintlayout.core.widgets.d) obj).j();
        if (iVarJ != null) {
            return (int) (iVarJ.f43436f + 0.5f);
        }
        return 0;
    }

    androidx.constraintlayout.core.b N(int i10) {
        return this.f43364h[i10];
    }

    float O(String str) {
        i iVarP = P(str, i.a.UNRESTRICTED);
        if (iVarP == null) {
            return 0.0f;
        }
        return iVarP.f43436f;
    }

    i P(String str, i.a aVar) {
        if (this.f43360d == null) {
            this.f43360d = new HashMap<>();
        }
        i iVar = this.f43360d.get(str);
        return iVar == null ? w(str, aVar) : iVar;
    }

    public void R() throws Exception {
        f fVar = C;
        if (fVar != null) {
            fVar.f43383i++;
        }
        if (this.f43361e.isEmpty()) {
            p();
            return;
        }
        if (!this.f43365i && !this.f43366j) {
            S(this.f43361e);
            return;
        }
        f fVar2 = C;
        if (fVar2 != null) {
            fVar2.f43396v++;
        }
        for (int i10 = 0; i10 < this.f43369m; i10++) {
            if (!this.f43364h[i10].f43072f) {
                S(this.f43361e);
                return;
            }
        }
        f fVar3 = C;
        if (fVar3 != null) {
            fVar3.f43395u++;
        }
        p();
    }

    void S(a aVar) throws Exception {
        f fVar = C;
        if (fVar != null) {
            fVar.f43400z++;
            fVar.A = Math.max(fVar.A, this.f43368l);
            f fVar2 = C;
            fVar2.B = Math.max(fVar2.B, this.f43369m);
        }
        C(aVar);
        T(aVar, false);
        p();
    }

    public void V(androidx.constraintlayout.core.b bVar) {
        i iVar;
        int i10;
        if (bVar.f43072f && (iVar = bVar.f43067a) != null) {
            int i11 = iVar.f43434d;
            if (i11 != -1) {
                while (true) {
                    i10 = this.f43369m;
                    if (i11 >= i10 - 1) {
                        break;
                    }
                    androidx.constraintlayout.core.b[] bVarArr = this.f43364h;
                    int i12 = i11 + 1;
                    androidx.constraintlayout.core.b bVar2 = bVarArr[i12];
                    i iVar2 = bVar2.f43067a;
                    if (iVar2.f43434d == i12) {
                        iVar2.f43434d = i11;
                    }
                    bVarArr[i11] = bVar2;
                    i11 = i12;
                }
                this.f43369m = i10 - 1;
            }
            i iVar3 = bVar.f43067a;
            if (!iVar3.f43437g) {
                iVar3.s(this, bVar.f43068b);
            }
            if (B) {
                this.f43371o.f43073a.a(bVar);
                return;
            }
            this.f43371o.f43074b.a(bVar);
        }
    }

    public void W() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f43371o;
            i[] iVarArr = cVar.f43076d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.r();
            }
            i10++;
        }
        cVar.f43075c.b(this.f43372p, this.f43373q);
        this.f43373q = 0;
        Arrays.fill(this.f43371o.f43076d, (Object) null);
        HashMap<String, i> map = this.f43360d;
        if (map != null) {
            map.clear();
        }
        this.f43359c = 0;
        this.f43361e.clear();
        this.f43368l = 1;
        for (int i11 = 0; i11 < this.f43369m; i11++) {
            androidx.constraintlayout.core.b bVar = this.f43364h[i11];
            if (bVar != null) {
                bVar.f43069c = false;
            }
        }
        U();
        this.f43369m = 0;
        if (B) {
            this.f43374r = new b(this.f43371o);
        } else {
            this.f43374r = new androidx.constraintlayout.core.b(this.f43371o);
        }
    }

    public void b(androidx.constraintlayout.core.widgets.e eVar, androidx.constraintlayout.core.widgets.e eVar2, float f10, int i10) {
        androidx.constraintlayout.core.widgets.d.a aVar = androidx.constraintlayout.core.widgets.d.a.LEFT;
        i iVarS = s(eVar.r(aVar));
        androidx.constraintlayout.core.widgets.d.a aVar2 = androidx.constraintlayout.core.widgets.d.a.TOP;
        i iVarS2 = s(eVar.r(aVar2));
        androidx.constraintlayout.core.widgets.d.a aVar3 = androidx.constraintlayout.core.widgets.d.a.RIGHT;
        i iVarS3 = s(eVar.r(aVar3));
        androidx.constraintlayout.core.widgets.d.a aVar4 = androidx.constraintlayout.core.widgets.d.a.BOTTOM;
        i iVarS4 = s(eVar.r(aVar4));
        i iVarS5 = s(eVar2.r(aVar));
        i iVarS6 = s(eVar2.r(aVar2));
        i iVarS7 = s(eVar2.r(aVar3));
        i iVarS8 = s(eVar2.r(aVar4));
        androidx.constraintlayout.core.b bVarT = t();
        double d10 = f10;
        double d11 = i10;
        bVarT.v(iVarS2, iVarS4, iVarS6, iVarS8, (float) (Math.sin(d10) * d11));
        d(bVarT);
        androidx.constraintlayout.core.b bVarT2 = t();
        bVarT2.v(iVarS, iVarS3, iVarS5, iVarS7, (float) (Math.cos(d10) * d11));
        d(bVarT2);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        androidx.constraintlayout.core.b bVarT = t();
        bVarT.k(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            bVarT.g(this, i12);
        }
        d(bVarT);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    public void d(androidx.constraintlayout.core.b bVar) {
        i iVarA;
        if (bVar == null) {
            return;
        }
        f fVar = C;
        if (fVar != null) {
            fVar.f43384j++;
            if (bVar.f43072f) {
                fVar.f43385k++;
            }
        }
        boolean z10 = true;
        if (this.f43369m + 1 >= this.f43370n || this.f43368l + 1 >= this.f43363g) {
            Q();
        }
        boolean z11 = false;
        if (!bVar.f43072f) {
            bVar.d(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.w();
            if (bVar.i(this)) {
                i iVarR = r();
                bVar.f43067a = iVarR;
                int i10 = this.f43369m;
                l(bVar);
                if (this.f43369m == i10 + 1) {
                    this.f43374r.e(bVar);
                    T(this.f43374r, true);
                    if (iVarR.f43434d == -1) {
                        if (bVar.f43067a == iVarR && (iVarA = bVar.A(iVarR)) != null) {
                            f fVar2 = C;
                            if (fVar2 != null) {
                                fVar2.f43388n++;
                            }
                            bVar.C(iVarA);
                        }
                        if (!bVar.f43072f) {
                            bVar.f43067a.z(this, bVar);
                        }
                        if (B) {
                            this.f43371o.f43073a.a(bVar);
                        } else {
                            this.f43371o.f43074b.a(bVar);
                        }
                        this.f43369m--;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!bVar.x()) {
                return;
            } else {
                z11 = z10;
            }
        }
        if (z11) {
            return;
        }
        l(bVar);
    }

    public androidx.constraintlayout.core.b e(i iVar, i iVar2, int i10, int i11) {
        f fVar = C;
        if (fVar != null) {
            fVar.U++;
        }
        if (f43354x && i11 == 8 && iVar2.f43437g && iVar.f43434d == -1) {
            iVar.s(this, iVar2.f43436f + i10);
            return null;
        }
        androidx.constraintlayout.core.b bVarT = t();
        bVarT.r(iVar, iVar2, i10);
        if (i11 != 8) {
            bVarT.g(this, i11);
        }
        d(bVarT);
        return bVarT;
    }

    public void f(i iVar, int i10) {
        f fVar = C;
        if (fVar != null) {
            fVar.U++;
        }
        if (f43354x && iVar.f43434d == -1) {
            float f10 = i10;
            iVar.s(this, f10);
            for (int i11 = 0; i11 < this.f43359c + 1; i11++) {
                i iVar2 = this.f43371o.f43076d[i11];
                if (iVar2 != null && iVar2.f43444n && iVar2.f43445o == iVar.f43433c) {
                    iVar2.s(this, iVar2.f43446s + f10);
                }
            }
            return;
        }
        int i12 = iVar.f43434d;
        if (i12 == -1) {
            androidx.constraintlayout.core.b bVarT = t();
            bVarT.l(iVar, i10);
            d(bVarT);
            return;
        }
        androidx.constraintlayout.core.b bVar = this.f43364h[i12];
        if (bVar.f43072f) {
            bVar.f43068b = i10;
            return;
        }
        if (bVar.f43071e.e() == 0) {
            bVar.f43072f = true;
            bVar.f43068b = i10;
        } else {
            androidx.constraintlayout.core.b bVarT2 = t();
            bVarT2.q(iVar, i10);
            d(bVarT2);
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        androidx.constraintlayout.core.b bVarT = t();
        i iVarV = v();
        iVarV.f43435e = 0;
        bVarT.t(iVar, iVar2, iVarV, i10);
        d(bVarT);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        androidx.constraintlayout.core.b bVarT = t();
        i iVarV = v();
        iVarV.f43435e = 0;
        bVarT.t(iVar, iVar2, iVarV, i10);
        if (i11 != 8) {
            m(bVarT, (int) (bVarT.f43071e.j(iVarV) * (-1.0f)), i11);
        }
        d(bVarT);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        androidx.constraintlayout.core.b bVarT = t();
        i iVarV = v();
        iVarV.f43435e = 0;
        bVarT.u(iVar, iVar2, iVarV, i10);
        d(bVarT);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        androidx.constraintlayout.core.b bVarT = t();
        i iVarV = v();
        iVarV.f43435e = 0;
        bVarT.u(iVar, iVar2, iVarV, i10);
        if (i11 != 8) {
            m(bVarT, (int) (bVarT.f43071e.j(iVarV) * (-1.0f)), i11);
        }
        d(bVarT);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        androidx.constraintlayout.core.b bVarT = t();
        bVarT.n(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            bVarT.g(this, i10);
        }
        d(bVarT);
    }

    void m(androidx.constraintlayout.core.b bVar, int i10, int i11) {
        bVar.h(q(i11, null), i10);
    }

    public void n(i iVar, i iVar2, int i10) {
        if (iVar.f43434d != -1 || i10 != 0) {
            e(iVar, iVar2, i10, 8);
            return;
        }
        if (iVar2.f43444n) {
            iVar2 = this.f43371o.f43076d[iVar2.f43445o];
        }
        if (iVar.f43444n) {
            i iVar3 = this.f43371o.f43076d[iVar.f43445o];
        } else {
            iVar.v(this, iVar2, 0.0f);
        }
    }

    final void o() {
        int i10;
        int i11 = 0;
        while (i11 < this.f43369m) {
            androidx.constraintlayout.core.b bVar = this.f43364h[i11];
            if (bVar.f43071e.e() == 0) {
                bVar.f43072f = true;
            }
            if (bVar.f43072f) {
                i iVar = bVar.f43067a;
                iVar.f43436f = bVar.f43068b;
                iVar.q(bVar);
                int i12 = i11;
                while (true) {
                    i10 = this.f43369m;
                    if (i12 >= i10 - 1) {
                        break;
                    }
                    androidx.constraintlayout.core.b[] bVarArr = this.f43364h;
                    int i13 = i12 + 1;
                    bVarArr[i12] = bVarArr[i13];
                    i12 = i13;
                }
                this.f43364h[i10 - 1] = null;
                this.f43369m = i10 - 1;
                i11--;
                if (B) {
                    this.f43371o.f43073a.a(bVar);
                } else {
                    this.f43371o.f43074b.a(bVar);
                }
            }
            i11++;
        }
    }

    public i q(int i10, String str) {
        f fVar = C;
        if (fVar != null) {
            fVar.f43391q++;
        }
        if (this.f43368l + 1 >= this.f43363g) {
            Q();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f43359c + 1;
        this.f43359c = i11;
        this.f43368l++;
        iVarA.f43433c = i11;
        iVarA.f43435e = i10;
        this.f43371o.f43076d[i11] = iVarA;
        this.f43361e.f(iVarA);
        return iVarA;
    }

    public i r() {
        f fVar = C;
        if (fVar != null) {
            fVar.f43393s++;
        }
        if (this.f43368l + 1 >= this.f43363g) {
            Q();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f43359c + 1;
        this.f43359c = i10;
        this.f43368l++;
        iVarA.f43433c = i10;
        this.f43371o.f43076d[i10] = iVarA;
        return iVarA;
    }

    public i s(Object obj) {
        i iVarJ = null;
        if (obj == null) {
            return null;
        }
        if (this.f43368l + 1 >= this.f43363g) {
            Q();
        }
        if (obj instanceof androidx.constraintlayout.core.widgets.d) {
            androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) obj;
            iVarJ = dVar.j();
            if (iVarJ == null) {
                dVar.z(this.f43371o);
                iVarJ = dVar.j();
            }
            int i10 = iVarJ.f43433c;
            if (i10 != -1 && i10 <= this.f43359c && this.f43371o.f43076d[i10] != null) {
                return iVarJ;
            }
            if (i10 != -1) {
                iVarJ.r();
            }
            int i11 = this.f43359c + 1;
            this.f43359c = i11;
            this.f43368l++;
            iVarJ.f43433c = i11;
            iVarJ.f43440j = i.a.UNRESTRICTED;
            this.f43371o.f43076d[i11] = iVarJ;
        }
        return iVarJ;
    }

    public androidx.constraintlayout.core.b t() {
        androidx.constraintlayout.core.b bVarAcquire;
        if (B) {
            bVarAcquire = this.f43371o.f43073a.acquire();
            if (bVarAcquire == null) {
                bVarAcquire = new b(this.f43371o);
                E++;
            } else {
                bVarAcquire.D();
            }
        } else {
            bVarAcquire = this.f43371o.f43074b.acquire();
            if (bVarAcquire == null) {
                bVarAcquire = new androidx.constraintlayout.core.b(this.f43371o);
                D++;
            } else {
                bVarAcquire.D();
            }
        }
        i.p();
        return bVarAcquire;
    }

    public i v() {
        f fVar = C;
        if (fVar != null) {
            fVar.f43392r++;
        }
        if (this.f43368l + 1 >= this.f43363g) {
            Q();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f43359c + 1;
        this.f43359c = i10;
        this.f43368l++;
        iVarA.f43433c = i10;
        this.f43371o.f43076d[i10] = iVarA;
        return iVarA;
    }

    public void x() {
        z();
        String str = " num vars " + this.f43359c + "\n";
        for (int i10 = 0; i10 < this.f43359c + 1; i10++) {
            i iVar = this.f43371o.f43076d[i10];
            if (iVar != null && iVar.f43437g) {
                str = str + " $[" + i10 + "] => " + iVar + " = " + iVar.f43436f + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i11 = 0; i11 < this.f43359c + 1; i11++) {
            i[] iVarArr = this.f43371o.f43076d;
            i iVar2 = iVarArr[i11];
            if (iVar2 != null && iVar2.f43444n) {
                str2 = str2 + " ~[" + i11 + "] => " + iVar2 + " = " + iVarArr[iVar2.f43445o] + " + " + iVar2.f43446s + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i12 = 0; i12 < this.f43369m; i12++) {
            str3 = (str3 + this.f43364h[i12].F()) + "\n #  ";
        }
        if (this.f43361e != null) {
            str3 = str3 + "Goal: " + this.f43361e + "\n";
        }
        System.out.println(str3);
    }
}
