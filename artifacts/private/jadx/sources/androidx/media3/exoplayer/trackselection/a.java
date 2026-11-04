package androidx.media3.exoplayer.trackselection;

import androidx.annotation.p0;
import androidx.media3.common.b4;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.z3;
import androidx.media3.exoplayer.source.t0;
import com.google.common.collect.k8;
import com.google.common.collect.l6;
import com.google.common.collect.l8;
import com.google.common.collect.o7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class a extends c {
    private static final String A = "AdaptiveTrackSelection";
    public static final int B = 10000;
    public static final int C = 25000;
    public static final int D = 25000;
    public static final int E = 1279;
    public static final int F = 719;
    public static final float G = 0.7f;
    public static final float H = 0.75f;
    private static final long I = 1000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.d f65641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f65642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f65643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f65644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f65645o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f65646p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float f65647q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float f65648r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final l6<C0593a> f65649s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final androidx.media3.common.util.j f65650t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f65651u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f65652v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f65653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f65654x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @p0
    private androidx.media3.exoplayer.source.chunk.m f65655y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f65656z;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.trackselection.a$a, reason: collision with other inner class name */
    public static final class C0593a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f65657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f65658b;

        public C0593a(long j10, long j11) {
            this.f65657a = j10;
            this.f65658b = j11;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0593a)) {
                return false;
            }
            C0593a c0593a = (C0593a) obj;
            return this.f65657a == c0593a.f65657a && this.f65658b == c0593a.f65658b;
        }

        public int hashCode() {
            return (((int) this.f65657a) * 31) + ((int) this.f65658b);
        }
    }

    public static class b implements c0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f65659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f65660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f65661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f65662d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f65663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f65664f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f65665g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final androidx.media3.common.util.j f65666h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001d  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.trackselection.c0.b
        public final c0[] a(c0.a[] aVarArr, androidx.media3.exoplayer.upstream.d dVar, t0.b bVar, z3 z3Var) {
            b bVar2;
            androidx.media3.exoplayer.upstream.d dVar2;
            c0 c0VarB;
            l6 l6VarD = a.D(aVarArr);
            c0[] c0VarArr = new c0[aVarArr.length];
            int i10 = 0;
            while (i10 < aVarArr.length) {
                c0.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f65677b;
                    if (iArr.length == 0) {
                        bVar2 = this;
                        dVar2 = dVar;
                    } else {
                        if (iArr.length == 1) {
                            bVar2 = this;
                            c0VarB = new d0(aVar.f65676a, iArr[0], aVar.f65678c);
                            dVar2 = dVar;
                        } else {
                            bVar2 = this;
                            dVar2 = dVar;
                            c0VarB = bVar2.b(aVar.f65676a, iArr, aVar.f65678c, dVar2, (l6) l6VarD.get(i10));
                        }
                        c0VarArr[i10] = c0VarB;
                    }
                } else {
                    bVar2 = this;
                    dVar2 = dVar;
                }
                i10++;
                this = bVar2;
                dVar = dVar2;
            }
            return c0VarArr;
        }

        protected a b(b4 b4Var, int[] iArr, int i10, androidx.media3.exoplayer.upstream.d dVar, l6<C0593a> l6Var) {
            return new a(b4Var, iArr, i10, dVar, this.f65659a, this.f65660b, this.f65661c, this.f65662d, this.f65663e, this.f65664f, this.f65665g, l6Var, this.f65666h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, a.E, a.F, f10, 0.75f, androidx.media3.common.util.j.f61520a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10) {
            this(i10, i11, i12, i13, i14, f10, 0.75f, androidx.media3.common.util.j.f61520a);
        }

        public b(int i10, int i11, int i12, float f10, float f11, androidx.media3.common.util.j jVar) {
            this(i10, i11, i12, a.E, a.F, f10, f11, jVar);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, androidx.media3.common.util.j jVar) {
            this.f65659a = i10;
            this.f65660b = i11;
            this.f65661c = i12;
            this.f65662d = i13;
            this.f65663e = i14;
            this.f65664f = f10;
            this.f65665g = f11;
            this.f65666h = jVar;
        }
    }

    public a(b4 b4Var, int[] iArr, androidx.media3.exoplayer.upstream.d dVar) {
        this(b4Var, iArr, 0, dVar, 10000L, 25000L, 25000L, E, F, 0.7f, 0.75f, l6.F(), androidx.media3.common.util.j.f61520a);
    }

    private static void A(List<l6.a<C0593a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            l6.a<C0593a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C0593a(j10, jArr[i10]));
            }
        }
    }

    private int C(long j10, long j11) {
        long jE = E(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f65668d; i11++) {
            if (j10 == Long.MIN_VALUE || !q(i11, j10)) {
                androidx.media3.common.w wVarL = l(i11);
                if (B(wVarL, wVarL.f61756j, jE)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l6<l6<C0593a>> D(c0.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (c0.a aVar : aVarArr) {
            if (aVar == null || aVar.f65677b.length <= 1) {
                arrayList.add(null);
            } else {
                l6.a aVarS = l6.s();
                aVarS.a(new C0593a(0L, 0L));
                arrayList.add(aVarS);
            }
        }
        long[][] jArrI = I(aVarArr);
        int[] iArr = new int[jArrI.length];
        long[] jArr = new long[jArrI.length];
        for (int i10 = 0; i10 < jArrI.length; i10++) {
            long[] jArr2 = jArrI[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        A(arrayList, jArr);
        l6<Integer> l6VarJ = J(jArrI);
        for (int i11 = 0; i11 < l6VarJ.size(); i11++) {
            int iIntValue = l6VarJ.get(i11).intValue();
            int i12 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i12;
            jArr[iIntValue] = jArrI[iIntValue][i12];
            A(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        A(arrayList, jArr);
        l6.a aVarS2 = l6.s();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            l6.a aVar2 = (l6.a) arrayList.get(i14);
            aVarS2.a(aVar2 == null ? l6.F() : aVar2.e());
        }
        return aVarS2.e();
    }

    private long E(long j10) {
        long jK = K(j10);
        if (this.f65649s.isEmpty()) {
            return jK;
        }
        int i10 = 1;
        while (i10 < this.f65649s.size() - 1 && this.f65649s.get(i10).f65657a < jK) {
            i10++;
        }
        C0593a c0593a = this.f65649s.get(i10 - 1);
        C0593a c0593a2 = this.f65649s.get(i10);
        long j11 = c0593a.f65657a;
        float f10 = (jK - j11) / (c0593a2.f65657a - j11);
        long j12 = c0593a.f65658b;
        return j12 + ((long) (f10 * (c0593a2.f65658b - j12)));
    }

    private long F(List<? extends androidx.media3.exoplayer.source.chunk.m> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        androidx.media3.exoplayer.source.chunk.m mVar = (androidx.media3.exoplayer.source.chunk.m) o7.w(list);
        long j10 = mVar.f64886g;
        if (j10 != -9223372036854775807L) {
            long j11 = mVar.f64887h;
            if (j11 != -9223372036854775807L) {
                return j11 - j10;
            }
        }
        return -9223372036854775807L;
    }

    private long H(androidx.media3.exoplayer.source.chunk.n[] nVarArr, List<? extends androidx.media3.exoplayer.source.chunk.m> list) {
        int i10 = this.f65652v;
        if (i10 < nVarArr.length && nVarArr[i10].next()) {
            androidx.media3.exoplayer.source.chunk.n nVar = nVarArr[this.f65652v];
            return nVar.b() - nVar.c();
        }
        for (androidx.media3.exoplayer.source.chunk.n nVar2 : nVarArr) {
            if (nVar2.next()) {
                return nVar2.b() - nVar2.c();
            }
        }
        return F(list);
    }

    private static long[][] I(c0.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            c0.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f65677b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f65677b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f65676a.c(iArr[i11]).f61756j;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static l6<Integer> J(long[][] jArr) {
        k8 k8VarA = l8.h().a().a();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double dLog = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i11] = dLog;
                    i11++;
                }
                int i12 = length - 1;
                double d10 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d11 = dArr[i13];
                    i13++;
                    k8VarA.put(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i13]) * 0.5d) - dArr[0]) / d10), Integer.valueOf(i10));
                }
            }
        }
        return l6.w(k8VarA.values());
    }

    private long K(long j10) {
        long jB = this.f65641k.b();
        this.f65656z = jB;
        long j11 = (long) (jB * this.f65647q);
        long jC = this.f65641k.c();
        if (jC == -9223372036854775807L || j10 == -9223372036854775807L) {
            return (long) (j11 / this.f65651u);
        }
        float f10 = j10;
        return (long) ((j11 * Math.max((f10 / this.f65651u) - jC, 0.0f)) / f10);
    }

    private long L(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f65642l;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min((long) (j10 * this.f65648r), this.f65642l);
    }

    protected boolean B(androidx.media3.common.w wVar, int i10, long j10) {
        return ((long) i10) <= j10;
    }

    protected long G() {
        return this.f65644n;
    }

    protected boolean M(long j10, List<? extends androidx.media3.exoplayer.source.chunk.m> list) {
        long j11 = this.f65654x;
        return j11 == -9223372036854775807L || j10 - j11 >= 1000 || !(list.isEmpty() || ((androidx.media3.exoplayer.source.chunk.m) o7.w(list)).equals(this.f65655y));
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public int a() {
        return this.f65652v;
    }

    @Override // androidx.media3.exoplayer.trackselection.c, androidx.media3.exoplayer.trackselection.c0
    @androidx.annotation.i
    public void d() {
        this.f65655y = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.c, androidx.media3.exoplayer.trackselection.c0
    @androidx.annotation.i
    public void h() {
        this.f65654x = -9223372036854775807L;
        this.f65655y = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.c, androidx.media3.exoplayer.trackselection.c0
    public int i(long j10, List<? extends androidx.media3.exoplayer.source.chunk.m> list) {
        int i10;
        int i11;
        long jB = this.f65650t.b();
        if (!M(jB, list)) {
            return list.size();
        }
        this.f65654x = jB;
        this.f65655y = list.isEmpty() ? null : (androidx.media3.exoplayer.source.chunk.m) o7.w(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jF0 = k1.F0(list.get(size - 1).f64886g - j10, this.f65651u);
        long jG = G();
        if (jF0 >= jG) {
            androidx.media3.common.w wVarL = l(C(jB, F(list)));
            for (int i12 = 0; i12 < size; i12++) {
                androidx.media3.exoplayer.source.chunk.m mVar = list.get(i12);
                androidx.media3.common.w wVar = mVar.f64883d;
                if (k1.F0(mVar.f64886g - j10, this.f65651u) >= jG && wVar.f61756j < wVarL.f61756j && (i10 = wVar.f61769w) != -1 && i10 <= this.f65646p && (i11 = wVar.f61768v) != -1 && i11 <= this.f65645o && i10 < wVarL.f61769w) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // androidx.media3.exoplayer.trackselection.c, androidx.media3.exoplayer.trackselection.c0
    public void m(float f10) {
        this.f65651u = f10;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    @p0
    public Object n() {
        return null;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public int o() {
        return this.f65653w;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public long p() {
        return this.f65656z;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public void v(long j10, long j11, long j12, List<? extends androidx.media3.exoplayer.source.chunk.m> list, androidx.media3.exoplayer.source.chunk.n[] nVarArr) {
        long jB = this.f65650t.b();
        long jH = H(nVarArr, list);
        int i10 = this.f65653w;
        if (i10 == 0) {
            this.f65653w = 1;
            this.f65652v = C(jB, jH);
            return;
        }
        int i11 = this.f65652v;
        int iU = list.isEmpty() ? -1 : u(((androidx.media3.exoplayer.source.chunk.m) o7.w(list)).f64883d);
        if (iU != -1) {
            i10 = ((androidx.media3.exoplayer.source.chunk.m) o7.w(list)).f64884e;
            i11 = iU;
        }
        int iC = C(jB, jH);
        if (iC != i11 && !q(i11, jB)) {
            androidx.media3.common.w wVarL = l(i11);
            androidx.media3.common.w wVarL2 = l(iC);
            long jL = L(j12, jH);
            int i12 = wVarL2.f61756j;
            int i13 = wVarL.f61756j;
            if ((i12 > i13 && j11 < jL) || (i12 < i13 && j11 >= this.f65643m)) {
                iC = i11;
            }
        }
        if (iC != i11) {
            i10 = 3;
        }
        this.f65653w = i10;
        this.f65652v = iC;
    }

    protected a(b4 b4Var, int[] iArr, int i10, androidx.media3.exoplayer.upstream.d dVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<C0593a> list, androidx.media3.common.util.j jVar) {
        long j13;
        super(b4Var, iArr, i10);
        if (j12 < j10) {
            androidx.media3.common.util.z.n(A, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f65641k = dVar;
        this.f65642l = j10 * 1000;
        this.f65643m = j11 * 1000;
        this.f65644n = j13 * 1000;
        this.f65645o = i11;
        this.f65646p = i12;
        this.f65647q = f10;
        this.f65648r = f11;
        this.f65649s = l6.w(list);
        this.f65650t = jVar;
        this.f65651u = 1.0f;
        this.f65653w = 0;
        this.f65654x = -9223372036854775807L;
        this.f65656z = -2147483647L;
    }
}
