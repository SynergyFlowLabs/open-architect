package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public abstract class a extends androidx.media3.common.z3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f62772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.exoplayer.source.u1 f62773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f62774g;

    public a(boolean z10, androidx.media3.exoplayer.source.u1 u1Var) {
        this.f62774g = z10;
        this.f62773f = u1Var;
        this.f62772e = u1Var.getLength();
    }

    public static Object C(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object D(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object F(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int I(int i10, boolean z10) {
        if (z10) {
            return this.f62773f.b(i10);
        }
        if (i10 < this.f62772e - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int J(int i10, boolean z10) {
        if (z10) {
            return this.f62773f.a(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    protected abstract int A(int i10);

    protected abstract int B(int i10);

    protected abstract Object E(int i10);

    protected abstract int G(int i10);

    protected abstract int H(int i10);

    protected abstract androidx.media3.common.z3 K(int i10);

    @Override // androidx.media3.common.z3
    public int e(boolean z10) {
        if (this.f62772e == 0) {
            return -1;
        }
        if (this.f62774g) {
            z10 = false;
        }
        int iE = z10 ? this.f62773f.e() : 0;
        while (K(iE).w()) {
            iE = I(iE, z10);
            if (iE == -1) {
                return -1;
            }
        }
        return H(iE) + K(iE).e(z10);
    }

    @Override // androidx.media3.common.z3
    public final int f(Object obj) {
        int iF;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objD = D(obj);
        Object objC = C(obj);
        int iZ = z(objD);
        if (iZ == -1 || (iF = K(iZ).f(objC)) == -1) {
            return -1;
        }
        return G(iZ) + iF;
    }

    @Override // androidx.media3.common.z3
    public int g(boolean z10) {
        int i10 = this.f62772e;
        if (i10 == 0) {
            return -1;
        }
        if (this.f62774g) {
            z10 = false;
        }
        int iC = z10 ? this.f62773f.c() : i10 - 1;
        while (K(iC).w()) {
            iC = J(iC, z10);
            if (iC == -1) {
                return -1;
            }
        }
        return H(iC) + K(iC).g(z10);
    }

    @Override // androidx.media3.common.z3
    public int i(int i10, int i11, boolean z10) {
        if (this.f62774g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iB = B(i10);
        int iH = H(iB);
        int i12 = K(iB).i(i10 - iH, i11 != 2 ? i11 : 0, z10);
        if (i12 != -1) {
            return iH + i12;
        }
        int I = I(iB, z10);
        while (I != -1 && K(I).w()) {
            I = I(I, z10);
        }
        if (I != -1) {
            return H(I) + K(I).e(z10);
        }
        if (i11 == 2) {
            return e(z10);
        }
        return -1;
    }

    @Override // androidx.media3.common.z3
    public final androidx.media3.common.z3.b k(int i10, androidx.media3.common.z3.b bVar, boolean z10) {
        int iA = A(i10);
        int iH = H(iA);
        K(iA).k(i10 - G(iA), bVar, z10);
        bVar.f61969c += iH;
        if (z10) {
            bVar.f61968b = F(E(iA), androidx.media3.common.util.a.g(bVar.f61968b));
        }
        return bVar;
    }

    @Override // androidx.media3.common.z3
    public final androidx.media3.common.z3.b l(Object obj, androidx.media3.common.z3.b bVar) {
        Object objD = D(obj);
        Object objC = C(obj);
        int iZ = z(objD);
        int iH = H(iZ);
        K(iZ).l(objC, bVar);
        bVar.f61969c += iH;
        bVar.f61968b = obj;
        return bVar;
    }

    @Override // androidx.media3.common.z3
    public int r(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f62774g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iB = B(i10);
        int iH = H(iB);
        androidx.media3.common.z3 z3VarK = K(iB);
        int i13 = i10 - iH;
        if (i11 != 2) {
            i12 = i11;
        }
        int iR = z3VarK.r(i13, i12, z10);
        if (iR != -1) {
            return iH + iR;
        }
        int iJ = J(iB, z10);
        while (iJ != -1 && K(iJ).w()) {
            iJ = J(iJ, z10);
        }
        if (iJ != -1) {
            return H(iJ) + K(iJ).g(z10);
        }
        if (i11 == 2) {
            return g(z10);
        }
        return -1;
    }

    @Override // androidx.media3.common.z3
    public final Object s(int i10) {
        int iA = A(i10);
        return F(E(iA), K(iA).s(i10 - G(iA)));
    }

    @Override // androidx.media3.common.z3
    public final androidx.media3.common.z3.d u(int i10, androidx.media3.common.z3.d dVar, long j10) {
        int iB = B(i10);
        int iH = H(iB);
        int iG = G(iB);
        K(iB).u(i10 - iH, dVar, j10);
        Object objE = E(iB);
        if (!androidx.media3.common.z3.d.f61978q.equals(dVar.f61988a)) {
            objE = F(objE, dVar.f61988a);
        }
        dVar.f61988a = objE;
        dVar.f62001n += iG;
        dVar.f62002o += iG;
        return dVar;
    }

    protected abstract int z(Object obj);
}
