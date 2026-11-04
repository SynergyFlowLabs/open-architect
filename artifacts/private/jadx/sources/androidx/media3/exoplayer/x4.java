package androidx.media3.exoplayer;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class x4 extends androidx.media3.exoplayer.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f66682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f66683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f66684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f66685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.media3.common.z3[] f66686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object[] f66687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap<Object, Integer> f66688n;

    class a extends androidx.media3.exoplayer.source.b0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final androidx.media3.common.z3.d f66689f;

        a(androidx.media3.common.z3 z3Var) {
            super(z3Var);
            this.f66689f = new androidx.media3.common.z3.d();
        }

        @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
        public androidx.media3.common.z3.b k(int i10, androidx.media3.common.z3.b bVar, boolean z10) {
            androidx.media3.common.z3.b bVarK = super.k(i10, bVar, z10);
            if (super.t(bVarK.f61969c, this.f66689f).i()) {
                bVarK.w(bVar.f61967a, bVar.f61968b, bVar.f61969c, bVar.f61970d, bVar.f61971e, androidx.media3.common.b.f60416l, true);
                return bVarK;
            }
            bVarK.f61972f = true;
            return bVarK;
        }
    }

    public x4(Collection<? extends d4> collection, androidx.media3.exoplayer.source.u1 u1Var) {
        this(N(collection), O(collection), u1Var);
    }

    private static androidx.media3.common.z3[] N(Collection<? extends d4> collection) {
        androidx.media3.common.z3[] z3VarArr = new androidx.media3.common.z3[collection.size()];
        Iterator<? extends d4> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            z3VarArr[i10] = it.next().b();
            i10++;
        }
        return z3VarArr;
    }

    private static Object[] O(Collection<? extends d4> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends d4> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = it.next().a();
            i10++;
        }
        return objArr;
    }

    @Override // androidx.media3.exoplayer.a
    protected int A(int i10) {
        return androidx.media3.common.util.k1.m(this.f66684j, i10 + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.a
    protected int B(int i10) {
        return androidx.media3.common.util.k1.m(this.f66685k, i10 + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.a
    protected Object E(int i10) {
        return this.f66687m[i10];
    }

    @Override // androidx.media3.exoplayer.a
    protected int G(int i10) {
        return this.f66684j[i10];
    }

    @Override // androidx.media3.exoplayer.a
    protected int H(int i10) {
        return this.f66685k[i10];
    }

    @Override // androidx.media3.exoplayer.a
    protected androidx.media3.common.z3 K(int i10) {
        return this.f66686l[i10];
    }

    public x4 L(androidx.media3.exoplayer.source.u1 u1Var) {
        androidx.media3.common.z3[] z3VarArr = new androidx.media3.common.z3[this.f66686l.length];
        int i10 = 0;
        while (true) {
            androidx.media3.common.z3[] z3VarArr2 = this.f66686l;
            if (i10 >= z3VarArr2.length) {
                return new x4(z3VarArr, this.f66687m, u1Var);
            }
            z3VarArr[i10] = new a(z3VarArr2[i10]);
            i10++;
        }
    }

    List<androidx.media3.common.z3> M() {
        return Arrays.asList(this.f66686l);
    }

    @Override // androidx.media3.common.z3
    public int m() {
        return this.f66683i;
    }

    @Override // androidx.media3.common.z3
    public int v() {
        return this.f66682h;
    }

    @Override // androidx.media3.exoplayer.a
    protected int z(Object obj) {
        Integer num = this.f66688n.get(obj);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 3 ^ (-1);
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private x4(androidx.media3.common.z3[] z3VarArr, Object[] objArr, androidx.media3.exoplayer.source.u1 u1Var) {
        super(false, u1Var);
        int i10 = 0;
        int length = z3VarArr.length;
        this.f66686l = z3VarArr;
        this.f66684j = new int[length];
        this.f66685k = new int[length];
        this.f66687m = objArr;
        this.f66688n = new HashMap<>();
        int length2 = z3VarArr.length;
        int iV = 0;
        int iM = 0;
        int i11 = 0;
        while (i10 < length2) {
            androidx.media3.common.z3 z3Var = z3VarArr[i10];
            this.f66686l[i11] = z3Var;
            this.f66685k[i11] = iV;
            this.f66684j[i11] = iM;
            iV += z3Var.v();
            iM += this.f66686l[i11].m();
            this.f66688n.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f66682h = iV;
        this.f66683i = iM;
    }
}
