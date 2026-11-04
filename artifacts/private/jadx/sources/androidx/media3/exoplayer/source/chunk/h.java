package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.p0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z;
import androidx.media3.common.w;
import androidx.media3.exoplayer.drm.t;
import androidx.media3.exoplayer.drm.u;
import androidx.media3.exoplayer.f5;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.source.chunk.i;
import androidx.media3.exoplayer.source.d0;
import androidx.media3.exoplayer.source.h0;
import androidx.media3.exoplayer.source.r1;
import androidx.media3.exoplayer.source.s1;
import androidx.media3.exoplayer.source.t1;
import androidx.media3.exoplayer.t3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class h<T extends i> implements s1, t1, androidx.media3.exoplayer.upstream.o.b<e>, androidx.media3.exoplayer.upstream.o.f {

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final String f64891p2 = "ChunkSampleStream";
    boolean H1;
    private long X;
    private int Y;

    @p0
    private androidx.media3.exoplayer.source.chunk.a Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f64893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w[] f64894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f64895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final T f64896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t1.a<h<T>> f64897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media3.exoplayer.source.b1.a f64898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.m f64899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.o f64900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f64901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList<androidx.media3.exoplayer.source.chunk.a> f64902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<androidx.media3.exoplayer.source.chunk.a> f64903l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final r1 f64904m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final r1[] f64905n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c f64906o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f64907p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f64908p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private e f64909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private w f64910t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private b<T> f64911v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f64912w;

    public final class a implements s1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h<T> f64913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r1 f64914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f64915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f64916d;

        public a(h<T> hVar, r1 r1Var, int i10) {
            this.f64913a = hVar;
            this.f64914b = r1Var;
            this.f64915c = i10;
        }

        private void b() {
            if (this.f64916d) {
                return;
            }
            h.this.f64898g.j(h.this.f64893b[this.f64915c], h.this.f64894c[this.f64915c], 0, null, h.this.X);
            this.f64916d = true;
        }

        @Override // androidx.media3.exoplayer.source.s1
        public void a() {
        }

        public void c() {
            androidx.media3.common.util.a.i(h.this.f64895d[this.f64915c]);
            h.this.f64895d[this.f64915c] = false;
        }

        @Override // androidx.media3.exoplayer.source.s1
        public boolean isReady() {
            return !h.this.L() && this.f64914b.O(h.this.H1);
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int l(long j10) throws Throwable {
            if (h.this.L()) {
                return 0;
            }
            int I = this.f64914b.I(j10, h.this.H1);
            if (h.this.Z != null) {
                I = Math.min(I, h.this.Z.i(this.f64915c + 1) - this.f64914b.G());
            }
            this.f64914b.h0(I);
            if (I > 0) {
                b();
            }
            return I;
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int r(p3 p3Var, androidx.media3.decoder.g gVar, int i10) {
            if (h.this.L()) {
                return -3;
            }
            if (h.this.Z != null && h.this.Z.i(this.f64915c + 1) <= this.f64914b.G()) {
                return -3;
            }
            b();
            return this.f64914b.V(p3Var, gVar, i10, h.this.H1);
        }
    }

    public interface b<T extends i> {
        void a(h<T> hVar);
    }

    public h(int i10, @p0 int[] iArr, @p0 w[] wVarArr, T t10, t1.a<h<T>> aVar, androidx.media3.exoplayer.upstream.b bVar, long j10, u uVar, t.a aVar2, androidx.media3.exoplayer.upstream.m mVar, androidx.media3.exoplayer.source.b1.a aVar3, boolean z10, @p0 androidx.media3.exoplayer.util.c cVar) {
        this.f64892a = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f64893b = iArr;
        this.f64894c = wVarArr == null ? new w[0] : wVarArr;
        this.f64896e = t10;
        this.f64897f = aVar;
        this.f64898g = aVar3;
        this.f64899h = mVar;
        this.f64907p0 = z10;
        this.f64900i = cVar != null ? new androidx.media3.exoplayer.upstream.o(cVar) : new androidx.media3.exoplayer.upstream.o(f64891p2);
        this.f64901j = new g();
        ArrayList<androidx.media3.exoplayer.source.chunk.a> arrayList = new ArrayList<>();
        this.f64902k = arrayList;
        this.f64903l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f64905n = new r1[length];
        this.f64895d = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        r1[] r1VarArr = new r1[i12];
        r1 r1VarM = r1.m(bVar, uVar, aVar2);
        this.f64904m = r1VarM;
        iArr2[0] = i10;
        r1VarArr[0] = r1VarM;
        while (i11 < length) {
            r1 r1VarN = r1.n(bVar);
            this.f64905n[i11] = r1VarN;
            int i13 = i11 + 1;
            r1VarArr[i13] = r1VarN;
            iArr2[i13] = this.f64893b[i11];
            i11 = i13;
        }
        this.f64906o = new c(iArr2, r1VarArr);
        this.f64912w = j10;
        this.X = j10;
    }

    private void D(int i10) {
        int iMin = Math.min(S(i10, 0), this.Y);
        if (iMin > 0) {
            k1.T1(this.f64902k, 0, iMin);
            this.Y -= iMin;
        }
    }

    private void E(int i10) {
        androidx.media3.common.util.a.i(!this.f64900i.k());
        int size = this.f64902k.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!J(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = I().f64887h;
        androidx.media3.exoplayer.source.chunk.a aVarF = F(i10);
        if (this.f64902k.isEmpty()) {
            this.f64912w = this.X;
        }
        this.H1 = false;
        this.f64898g.B(this.f64892a, aVarF.f64886g, j10);
    }

    private androidx.media3.exoplayer.source.chunk.a F(int i10) {
        androidx.media3.exoplayer.source.chunk.a aVar = this.f64902k.get(i10);
        ArrayList<androidx.media3.exoplayer.source.chunk.a> arrayList = this.f64902k;
        k1.T1(arrayList, i10, arrayList.size());
        this.Y = Math.max(this.Y, this.f64902k.size());
        int i11 = 0;
        this.f64904m.x(aVar.i(0));
        while (true) {
            r1[] r1VarArr = this.f64905n;
            if (i11 >= r1VarArr.length) {
                return aVar;
            }
            r1 r1Var = r1VarArr[i11];
            i11++;
            r1Var.x(aVar.i(i11));
        }
    }

    private androidx.media3.exoplayer.source.chunk.a I() {
        ArrayList<androidx.media3.exoplayer.source.chunk.a> arrayList = this.f64902k;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean J(int i10) {
        int iG;
        androidx.media3.exoplayer.source.chunk.a aVar = this.f64902k.get(i10);
        if (this.f64904m.G() > aVar.i(0)) {
            return true;
        }
        int i11 = 0;
        do {
            r1[] r1VarArr = this.f64905n;
            if (i11 >= r1VarArr.length) {
                return false;
            }
            iG = r1VarArr[i11].G();
            i11++;
        } while (iG <= aVar.i(i11));
        return true;
    }

    private boolean K(e eVar) {
        return eVar instanceof androidx.media3.exoplayer.source.chunk.a;
    }

    private void M() {
        int iS = S(this.f64904m.G(), this.Y - 1);
        while (true) {
            int i10 = this.Y;
            if (i10 > iS) {
                return;
            }
            this.Y = i10 + 1;
            N(i10);
        }
    }

    private void N(int i10) {
        androidx.media3.exoplayer.source.chunk.a aVar = this.f64902k.get(i10);
        w wVar = aVar.f64883d;
        if (!wVar.equals(this.f64910t)) {
            this.f64898g.j(this.f64892a, wVar, aVar.f64884e, aVar.f64885f, aVar.f64886g);
        }
        this.f64910t = wVar;
    }

    private int S(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f64902k.size()) {
                return this.f64902k.size() - 1;
            }
        } while (this.f64902k.get(i11).i(0) <= i10);
        return i11 - 1;
    }

    private void V() {
        this.f64904m.Y();
        for (r1 r1Var : this.f64905n) {
            r1Var.Y();
        }
    }

    public boolean C() {
        try {
            boolean z10 = this.f64908p1;
            this.f64908p1 = false;
            return z10;
        } catch (Throwable th2) {
            this.f64908p1 = false;
            throw th2;
        }
    }

    public void G(long j10) {
        androidx.media3.common.util.a.i(!this.f64900i.k());
        if (L() || j10 == -9223372036854775807L || this.f64902k.isEmpty()) {
            return;
        }
        androidx.media3.exoplayer.source.chunk.a aVarI = I();
        long j11 = aVarI.f64850l;
        if (j11 == -9223372036854775807L) {
            j11 = aVarI.f64887h;
        }
        if (j11 <= j10) {
            return;
        }
        long jD = this.f64904m.D();
        if (jD <= j10) {
            return;
        }
        this.f64904m.v(j10);
        for (r1 r1Var : this.f64905n) {
            r1Var.v(j10);
        }
        this.f64898g.B(this.f64892a, j10, jD);
    }

    public T H() {
        return this.f64896e;
    }

    boolean L() {
        return this.f64912w != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.upstream.o.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void s(e eVar, long j10, long j11, boolean z10) {
        this.f64909s = null;
        this.Z = null;
        d0 d0Var = new d0(eVar.f64880a, eVar.f64881b, eVar.f(), eVar.e(), j10, j11, eVar.c());
        this.f64899h.b(eVar.f64880a);
        this.f64898g.m(d0Var, eVar.f64882c, this.f64892a, eVar.f64883d, eVar.f64884e, eVar.f64885f, eVar.f64886g, eVar.f64887h);
        if (z10) {
            return;
        }
        if (L()) {
            V();
        } else if (K(eVar)) {
            F(this.f64902k.size() - 1);
            if (this.f64902k.isEmpty()) {
                this.f64912w = this.X;
            }
        }
        this.f64897f.l(this);
    }

    @Override // androidx.media3.exoplayer.upstream.o.b
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void w(e eVar, long j10, long j11) {
        this.f64909s = null;
        this.f64896e.d(eVar);
        d0 d0Var = new d0(eVar.f64880a, eVar.f64881b, eVar.f(), eVar.e(), j10, j11, eVar.c());
        this.f64899h.b(eVar.f64880a);
        this.f64898g.p(d0Var, eVar.f64882c, this.f64892a, eVar.f64883d, eVar.f64884e, eVar.f64885f, eVar.f64886g, eVar.f64887h);
        this.f64897f.l(this);
    }

    @Override // androidx.media3.exoplayer.upstream.o.b
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public androidx.media3.exoplayer.upstream.o.c n(e eVar, long j10, long j11, IOException iOException, int i10) {
        androidx.media3.exoplayer.upstream.o.c cVarI;
        long jC = eVar.c();
        boolean zK = K(eVar);
        int size = this.f64902k.size() - 1;
        boolean z10 = (jC != 0 && zK && J(size)) ? false : true;
        d0 d0Var = new d0(eVar.f64880a, eVar.f64881b, eVar.f(), eVar.e(), j10, j11, jC);
        androidx.media3.exoplayer.upstream.m.d dVar = new androidx.media3.exoplayer.upstream.m.d(d0Var, new h0(eVar.f64882c, this.f64892a, eVar.f64883d, eVar.f64884e, eVar.f64885f, k1.A2(eVar.f64886g), k1.A2(eVar.f64887h)), iOException, i10);
        if (!this.f64896e.c(eVar, z10, dVar, this.f64899h)) {
            cVarI = null;
        } else if (z10) {
            cVarI = androidx.media3.exoplayer.upstream.o.f66130k;
            if (zK) {
                androidx.media3.common.util.a.i(F(size) == eVar);
                if (this.f64902k.isEmpty()) {
                    this.f64912w = this.X;
                }
            }
        } else {
            z.n(f64891p2, "Ignoring attempt to cancel non-cancelable load.");
            cVarI = null;
        }
        if (cVarI == null) {
            long jD = this.f64899h.d(dVar);
            cVarI = jD != -9223372036854775807L ? androidx.media3.exoplayer.upstream.o.i(false, jD) : androidx.media3.exoplayer.upstream.o.f66131l;
        }
        boolean zC = cVarI.c();
        this.f64898g.r(d0Var, eVar.f64882c, this.f64892a, eVar.f64883d, eVar.f64884e, eVar.f64885f, eVar.f64886g, eVar.f64887h, iOException, !zC);
        if (!zC) {
            this.f64909s = null;
            this.f64899h.b(eVar.f64880a);
            this.f64897f.l(this);
        }
        return cVarI;
    }

    @Override // androidx.media3.exoplayer.upstream.o.b
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void q(e eVar, long j10, long j11, int i10) {
        this.f64898g.x(i10 == 0 ? new d0(eVar.f64880a, eVar.f64881b, j10) : new d0(eVar.f64880a, eVar.f64881b, eVar.f(), eVar.e(), j10, j11, eVar.c()), eVar.f64882c, this.f64892a, eVar.f64883d, eVar.f64884e, eVar.f64885f, eVar.f64886g, eVar.f64887h, i10);
    }

    public void T() {
        U(null);
    }

    public void U(@p0 b<T> bVar) {
        this.f64911v = bVar;
        this.f64904m.U();
        for (r1 r1Var : this.f64905n) {
            r1Var.U();
        }
        this.f64900i.m(this);
    }

    public void W(long j10) throws Throwable {
        androidx.media3.exoplayer.source.chunk.a aVar;
        boolean zC0;
        this.X = j10;
        int i10 = 0;
        this.f64907p0 = false;
        if (L()) {
            this.f64912w = j10;
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 < this.f64902k.size()) {
                aVar = this.f64902k.get(i11);
                long j11 = aVar.f64886g;
                if (j11 == j10 && aVar.f64849k == -9223372036854775807L) {
                    break;
                } else if (j11 <= j10) {
                    i11++;
                }
            }
            aVar = null;
            break;
        }
        if (aVar != null) {
            zC0 = this.f64904m.b0(aVar.i(0));
        } else {
            zC0 = this.f64904m.c0(j10, j10 < e());
        }
        if (zC0) {
            this.Y = S(this.f64904m.G(), 0);
            r1[] r1VarArr = this.f64905n;
            int length = r1VarArr.length;
            while (i10 < length) {
                r1VarArr[i10].c0(j10, true);
                i10++;
            }
            return;
        }
        this.f64912w = j10;
        this.H1 = false;
        this.f64902k.clear();
        this.Y = 0;
        if (!this.f64900i.k()) {
            this.f64900i.h();
            V();
            return;
        }
        this.f64904m.t();
        r1[] r1VarArr2 = this.f64905n;
        int length2 = r1VarArr2.length;
        while (i10 < length2) {
            r1VarArr2[i10].t();
            i10++;
        }
        this.f64900i.g();
    }

    public h<T>.a X(long j10, int i10) throws Throwable {
        for (int i11 = 0; i11 < this.f64905n.length; i11++) {
            if (this.f64893b[i11] == i10) {
                androidx.media3.common.util.a.i(!this.f64895d[i11]);
                this.f64895d[i11] = true;
                this.f64905n[i11].c0(j10, true);
                return new a(this, this.f64905n[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.source.s1
    public void a() throws IOException {
        this.f64900i.a();
        this.f64904m.Q();
        if (!this.f64900i.k()) {
            this.f64896e.a();
        }
    }

    @Override // androidx.media3.exoplayer.source.t1
    public long b() {
        if (this.H1) {
            return Long.MIN_VALUE;
        }
        if (L()) {
            return this.f64912w;
        }
        long jMax = this.X;
        androidx.media3.exoplayer.source.chunk.a aVarI = I();
        if (!aVarI.h()) {
            if (this.f64902k.size() > 1) {
                ArrayList<androidx.media3.exoplayer.source.chunk.a> arrayList = this.f64902k;
                aVarI = arrayList.get(arrayList.size() - 2);
            } else {
                aVarI = null;
            }
        }
        if (aVarI != null) {
            jMax = Math.max(jMax, aVarI.f64887h);
        }
        return Math.max(jMax, this.f64904m.D());
    }

    @Override // androidx.media3.exoplayer.source.t1
    public void c(long j10) {
        if (!this.f64900i.j() && !L()) {
            if (!this.f64900i.k()) {
                int iB = this.f64896e.b(j10, this.f64903l);
                if (iB < this.f64902k.size()) {
                    E(iB);
                    return;
                }
                return;
            }
            e eVar = (e) androidx.media3.common.util.a.g(this.f64909s);
            if (!(K(eVar) && J(this.f64902k.size() - 1)) && this.f64896e.f(j10, eVar, this.f64903l)) {
                this.f64900i.g();
                if (K(eVar)) {
                    this.Z = (androidx.media3.exoplayer.source.chunk.a) eVar;
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.t1
    public boolean d() {
        return this.f64900i.k();
    }

    @Override // androidx.media3.exoplayer.source.t1
    public long e() {
        if (L()) {
            return this.f64912w;
        }
        if (this.H1) {
            return Long.MIN_VALUE;
        }
        return I().f64887h;
    }

    public long g(long j10, f5 f5Var) {
        return this.f64896e.g(j10, f5Var);
    }

    @Override // androidx.media3.exoplayer.source.s1
    public boolean isReady() {
        return !L() && this.f64904m.O(this.H1);
    }

    @Override // androidx.media3.exoplayer.upstream.o.f
    public void j() {
        this.f64904m.W();
        int i10 = 4 ^ 0;
        for (r1 r1Var : this.f64905n) {
            r1Var.W();
        }
        this.f64896e.release();
        b<T> bVar = this.f64911v;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.t1
    public boolean k(t3 t3Var) {
        List<androidx.media3.exoplayer.source.chunk.a> list;
        long j10;
        if (this.H1 || this.f64900i.k() || this.f64900i.j()) {
            return false;
        }
        boolean zL = L();
        if (zL) {
            list = Collections.EMPTY_LIST;
            j10 = this.f64912w;
        } else {
            list = this.f64903l;
            j10 = I().f64887h;
        }
        this.f64896e.e(t3Var, j10, list, this.f64901j);
        g gVar = this.f64901j;
        boolean z10 = gVar.f64890b;
        e eVar = gVar.f64889a;
        gVar.a();
        if (z10) {
            this.f64912w = -9223372036854775807L;
            this.H1 = true;
            return true;
        }
        if (eVar == null) {
            return false;
        }
        this.f64909s = eVar;
        if (K(eVar)) {
            androidx.media3.exoplayer.source.chunk.a aVar = (androidx.media3.exoplayer.source.chunk.a) eVar;
            if (zL) {
                long j11 = aVar.f64886g;
                long j12 = this.f64912w;
                if (j11 < j12) {
                    this.f64904m.e0(j12);
                    for (r1 r1Var : this.f64905n) {
                        r1Var.e0(this.f64912w);
                    }
                    if (this.f64907p0) {
                        w wVar = aVar.f64883d;
                        this.f64908p1 = !s0.a(wVar.f61761o, wVar.f61757k);
                    }
                }
                this.f64907p0 = false;
                this.f64912w = -9223372036854775807L;
            }
            aVar.k(this.f64906o);
            this.f64902k.add(aVar);
        } else if (eVar instanceof l) {
            ((l) eVar).h(this.f64906o);
        }
        this.f64900i.n(eVar, this, this.f64899h.a(eVar.f64882c));
        return true;
    }

    @Override // androidx.media3.exoplayer.source.s1
    public int l(long j10) throws Throwable {
        if (L()) {
            return 0;
        }
        int I = this.f64904m.I(j10, this.H1);
        androidx.media3.exoplayer.source.chunk.a aVar = this.Z;
        if (aVar != null) {
            I = Math.min(I, aVar.i(0) - this.f64904m.G());
        }
        this.f64904m.h0(I);
        M();
        return I;
    }

    public void p(long j10, boolean z10) {
        if (L()) {
            return;
        }
        int iB = this.f64904m.B();
        this.f64904m.s(j10, z10, true);
        int iB2 = this.f64904m.B();
        if (iB2 > iB) {
            long jC = this.f64904m.C();
            int i10 = 0;
            while (true) {
                r1[] r1VarArr = this.f64905n;
                if (i10 >= r1VarArr.length) {
                    break;
                }
                r1VarArr[i10].s(jC, z10, this.f64895d[i10]);
                i10++;
            }
        }
        D(iB2);
    }

    @Override // androidx.media3.exoplayer.source.s1
    public int r(p3 p3Var, androidx.media3.decoder.g gVar, int i10) {
        if (L()) {
            return -3;
        }
        androidx.media3.exoplayer.source.chunk.a aVar = this.Z;
        if (aVar != null && aVar.i(0) <= this.f64904m.G()) {
            return -3;
        }
        M();
        return this.f64904m.V(p3Var, gVar, i10, this.H1);
    }
}
