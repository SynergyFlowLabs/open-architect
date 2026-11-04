package androidx.media3.exoplayer.source;

import androidx.media3.common.z3;
import com.google.common.collect.k8;
import com.google.common.collect.l8;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class f1 extends h<Integer> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f65025p0 = -1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final androidx.media3.common.k0 f65026p1 = new androidx.media3.common.k0.c().E("MergingMediaSource").a();
    private int X;
    private long[][] Y;

    @androidx.annotation.p0
    private c Z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f65027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f65028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final t0[] f65029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<List<d>> f65030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final z3[] f65031o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList<t0> f65032s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f65033t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Map<Object, Long> f65034v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final k8<Object, e> f65035w;

    private static final class b extends b0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long[] f65036f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long[] f65037g;

        public b(z3 z3Var, Map<Object, Long> map) {
            super(z3Var);
            int iV = z3Var.v();
            this.f65037g = new long[z3Var.v()];
            z3.d dVar = new z3.d();
            for (int i10 = 0; i10 < iV; i10++) {
                this.f65037g[i10] = z3Var.t(i10, dVar).f62000m;
            }
            int iM = z3Var.m();
            this.f65036f = new long[iM];
            z3.b bVar = new z3.b();
            for (int i11 = 0; i11 < iM; i11++) {
                z3Var.k(i11, bVar, true);
                long jLongValue = ((Long) androidx.media3.common.util.a.g(map.get(bVar.f61968b))).longValue();
                long[] jArr = this.f65036f;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f61970d : jLongValue;
                jArr[i11] = jLongValue;
                long j10 = bVar.f61970d;
                if (j10 != -9223372036854775807L) {
                    long[] jArr2 = this.f65037g;
                    int i12 = bVar.f61969c;
                    jArr2[i12] = jArr2[i12] - (j10 - jLongValue);
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
        public z3.b k(int i10, z3.b bVar, boolean z10) {
            super.k(i10, bVar, z10);
            bVar.f61970d = this.f65036f[i10];
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0026  */
        @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
        public z3.d u(int i10, z3.d dVar, long j10) {
            long jMin;
            super.u(i10, dVar, j10);
            long j11 = this.f65037g[i10];
            dVar.f62000m = j11;
            if (j11 != -9223372036854775807L) {
                long j12 = dVar.f61999l;
                if (j12 == -9223372036854775807L) {
                    jMin = dVar.f61999l;
                } else {
                    jMin = Math.min(j12, j11);
                }
            } else {
                jMin = dVar.f61999l;
            }
            dVar.f61999l = jMin;
            return dVar;
        }
    }

    public static final class c extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f65038b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65039a;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public c(int i10) {
            this.f65039a = i10;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t0.b f65040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s0 f65041b;

        private d(t0.b bVar, s0 s0Var) {
            this.f65040a = bVar;
            this.f65041b = s0Var;
        }
    }

    public f1(t0... t0VarArr) {
        this(false, t0VarArr);
    }

    private void D0() {
        z3.b bVar = new z3.b();
        for (int i10 = 0; i10 < this.X; i10++) {
            long j10 = -this.f65031o[0].j(i10, bVar).q();
            int i11 = 1;
            while (true) {
                z3[] z3VarArr = this.f65031o;
                if (i11 < z3VarArr.length) {
                    this.Y[i10][i11] = j10 - (-z3VarArr[i11].j(i10, bVar).q());
                    i11++;
                }
            }
        }
    }

    private void G0() {
        z3[] z3VarArr;
        z3.b bVar = new z3.b();
        for (int i10 = 0; i10 < this.X; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                z3VarArr = this.f65031o;
                if (i11 >= z3VarArr.length) {
                    break;
                }
                long jM = z3VarArr[i11].j(i10, bVar).m();
                if (jM != -9223372036854775807L) {
                    long j11 = jM + this.Y[i10][i11];
                    if (j10 == Long.MIN_VALUE || j11 < j10) {
                        j10 = j11;
                    }
                }
                i11++;
            }
            Object objS = z3VarArr[0].s(i10);
            this.f65034v.put(objS, Long.valueOf(j10));
            Iterator<e> it = this.f65035w.x(objS).iterator();
            while (it.hasNext()) {
                it.next().w(0L, j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.h
    @androidx.annotation.p0
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public t0.b x0(Integer num, t0.b bVar) {
        List<d> list = this.f65030n.get(num.intValue());
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).f65040a.equals(bVar)) {
                return this.f65030n.get(0).get(i10).f65040a;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.h
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public void A0(Integer num, t0 t0Var, z3 z3Var) {
        if (this.Z != null) {
            return;
        }
        if (this.X == -1) {
            this.X = z3Var.m();
        } else if (z3Var.m() != this.X) {
            this.Z = new c(0);
            return;
        }
        if (this.Y.length == 0) {
            this.Y = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.X, this.f65031o.length);
        }
        this.f65032s.remove(t0Var);
        this.f65031o[num.intValue()] = z3Var;
        if (this.f65032s.isEmpty()) {
            if (this.f65027k) {
                D0();
            }
            z3 bVar = this.f65031o[0];
            if (this.f65028l) {
                G0();
                bVar = new b(bVar, this.f65034v);
            }
            k0(bVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void K(androidx.media3.common.k0 k0Var) {
        this.f65029m[0].K(k0Var);
    }

    @Override // androidx.media3.exoplayer.source.t0
    public boolean O(androidx.media3.common.k0 k0Var) {
        t0[] t0VarArr = this.f65029m;
        return t0VarArr.length > 0 && t0VarArr[0].O(k0Var);
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.t0
    public void a() throws IOException {
        c cVar = this.Z;
        if (cVar != null) {
            throw cVar;
        }
        super.a();
    }

    @Override // androidx.media3.exoplayer.source.t0
    public androidx.media3.common.k0 g() {
        t0[] t0VarArr = this.f65029m;
        return t0VarArr.length > 0 ? t0VarArr[0].g() : f65026p1;
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    protected void j0(@androidx.annotation.p0 androidx.media3.datasource.r1 r1Var) {
        super.j0(r1Var);
        for (int i10 = 0; i10 < this.f65029m.length; i10++) {
            B0(Integer.valueOf(i10), this.f65029m[i10]);
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void l(s0 s0Var) {
        if (this.f65028l) {
            e eVar = (e) s0Var;
            for (Map.Entry<Object, e> entry : this.f65035w.u()) {
                if (entry.getValue().equals(eVar)) {
                    this.f65035w.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            s0Var = eVar.f64963a;
        }
        e1 e1Var = (e1) s0Var;
        for (int i10 = 0; i10 < this.f65029m.length; i10++) {
            List<d> list = this.f65030n.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (list.get(i11).f65041b.equals(s0Var)) {
                    list.remove(i11);
                    break;
                }
            }
            this.f65029m[i10].l(e1Var.n(i10));
        }
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    protected void l0() {
        super.l0();
        Arrays.fill(this.f65031o, (Object) null);
        this.X = -1;
        this.Z = null;
        this.f65032s.clear();
        Collections.addAll(this.f65032s, this.f65029m);
    }

    @Override // androidx.media3.exoplayer.source.t0
    public s0 x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        int length = this.f65029m.length;
        s0[] s0VarArr = new s0[length];
        int iF = this.f65031o[0].f(bVar.f65467a);
        for (int i10 = 0; i10 < length; i10++) {
            t0.b bVarA = bVar.a(this.f65031o[i10].s(iF));
            s0VarArr[i10] = this.f65029m[i10].x(bVarA, bVar2, j10 - this.Y[iF][i10]);
            this.f65030n.get(i10).add(new d(bVarA, s0VarArr[i10]));
        }
        e1 e1Var = new e1(this.f65033t, this.Y[iF], s0VarArr);
        if (!this.f65028l) {
            return e1Var;
        }
        e eVar = new e(e1Var, false, 0L, ((Long) androidx.media3.common.util.a.g(this.f65034v.get(bVar.f65467a))).longValue());
        this.f65035w.put(bVar.f65467a, eVar);
        return eVar;
    }

    public f1(boolean z10, t0... t0VarArr) {
        this(z10, false, t0VarArr);
    }

    public f1(boolean z10, boolean z11, t0... t0VarArr) {
        this(z10, z11, new o(), t0VarArr);
    }

    public f1(boolean z10, boolean z11, j jVar, t0... t0VarArr) {
        this.f65027k = z10;
        this.f65028l = z11;
        this.f65029m = t0VarArr;
        this.f65033t = jVar;
        this.f65032s = new ArrayList<>(Arrays.asList(t0VarArr));
        this.X = -1;
        this.f65030n = new ArrayList(t0VarArr.length);
        for (int i10 = 0; i10 < t0VarArr.length; i10++) {
            this.f65030n.add(new ArrayList());
        }
        this.f65031o = new z3[t0VarArr.length];
        this.Y = new long[0][];
        this.f65034v = new HashMap();
        this.f65035w = l8.d().a().a();
    }
}
