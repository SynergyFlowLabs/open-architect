package com.planner5d.library.engine.input;

import com.planner5d.library.math.k;

/* JADX INFO: loaded from: classes5.dex */
public class e extends g {
    private final k X;
    private final k Y;
    private final f Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f160637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f160638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f160639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f160640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f160641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f160642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f160643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f160644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f160645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f160646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f160647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f160648l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f160649m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c f160650n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f160651o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f160652s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f160653t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    k f160654v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final k f160655w;

    public static class a implements b {
        @Override // com.planner5d.library.engine.input.e.b
        public boolean a(float f10, float f11, int i10, int i11) {
            return false;
        }

        @Override // com.planner5d.library.engine.input.e.b
        public boolean b(float f10, float f11, int i10, int i11) {
            return false;
        }

        @Override // com.planner5d.library.engine.input.e.b
        public boolean c(k kVar, k kVar2, k kVar3, k kVar4) {
            return false;
        }

        @Override // com.planner5d.library.engine.input.e.b
        public boolean d(float f10, float f11) {
            return false;
        }

        @Override // com.planner5d.library.engine.input.e.b
        public boolean e(float f10, float f11, int i10) {
            return false;
        }

        @Override // com.planner5d.library.engine.input.e.b
        public boolean f(float f10, float f11, int i10, int i11) {
            return false;
        }

        @Override // com.planner5d.library.engine.input.e.b
        public boolean g(float f10, float f11, float f12, float f13) {
            return false;
        }
    }

    public interface b {
        boolean a(float f10, float f11, int i10, int i11);

        boolean b(float f10, float f11, int i10, int i11);

        boolean c(k kVar, k kVar2, k kVar3, k kVar4);

        boolean d(float f10, float f11);

        boolean e(float f10, float f11, int i10);

        boolean f(float f10, float f11, int i10, int i11);

        boolean g(float f10, float f11, float f12, float f13);
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f160657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f160658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f160659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f160660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f160661f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f160662g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160656a = 10;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float[] f160663h = new float[10];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float[] f160664i = new float[10];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        long[] f160665j = new long[10];

        c() {
        }

        private float a(float[] fArr, int i10) {
            int iMin = Math.min(this.f160656a, i10);
            float f10 = 0.0f;
            for (int i11 = 0; i11 < iMin; i11++) {
                f10 += fArr[i11];
            }
            return f10 / iMin;
        }

        private long b(long[] jArr, int i10) {
            int iMin = Math.min(this.f160656a, i10);
            long j10 = 0;
            for (int i11 = 0; i11 < iMin; i11++) {
                j10 += jArr[i11];
            }
            if (iMin == 0) {
                return 0L;
            }
            return j10 / ((long) iMin);
        }

        private float c(float[] fArr, int i10) {
            int iMin = Math.min(this.f160656a, i10);
            float f10 = 0.0f;
            for (int i11 = 0; i11 < iMin; i11++) {
                f10 += fArr[i11];
            }
            if (iMin == 0) {
                return 0.0f;
            }
            return f10;
        }

        public float d() {
            float fA = a(this.f160663h, this.f160662g);
            float fB = b(this.f160665j, this.f160662g) / 1.0E9f;
            int i10 = 1 >> 0;
            if (fB == 0.0f) {
                return 0.0f;
            }
            return fA / fB;
        }

        public float e() {
            float fA = a(this.f160664i, this.f160662g);
            float fB = b(this.f160665j, this.f160662g) / 1.0E9f;
            if (fB == 0.0f) {
                return 0.0f;
            }
            return fA / fB;
        }

        public void f(float f10, float f11, long j10) {
            this.f160657b = f10;
            this.f160658c = f11;
            this.f160659d = 0.0f;
            this.f160660e = 0.0f;
            this.f160662g = 0;
            for (int i10 = 0; i10 < this.f160656a; i10++) {
                this.f160663h[i10] = 0.0f;
                this.f160664i[i10] = 0.0f;
                this.f160665j[i10] = 0;
            }
            this.f160661f = j10;
        }

        public void g(float f10, float f11, long j10) {
            float f12 = f10 - this.f160657b;
            this.f160659d = f12;
            float f13 = f11 - this.f160658c;
            this.f160660e = f13;
            this.f160657b = f10;
            this.f160658c = f11;
            long j11 = j10 - this.f160661f;
            this.f160661f = j10;
            int i10 = this.f160662g;
            int i11 = i10 % this.f160656a;
            this.f160663h[i11] = f12;
            this.f160664i[i11] = f13;
            this.f160665j[i11] = j11;
            this.f160662g = i10 + 1;
        }
    }

    public e(com.planner5d.library.engine.a aVar, b bVar) {
        this(aVar, 20.0f, 0.4f, 0.15f, bVar);
    }

    private boolean A(float f10, float f11, float f12, float f13) {
        return Math.abs(f10 - f12) < this.f160638b && Math.abs(f11 - f13) < this.f160638b;
    }

    public void B() {
        this.f160653t = 0L;
        this.f160649m = false;
        this.f160641e = false;
    }

    public void C(long j10) {
        this.f160640d = j10;
    }

    public void D(float f10) {
        this.f160639c = (long) (f10 * 1.0E9f);
    }

    public void E(float f10) {
        this.f160638b = f10;
    }

    public boolean F(float f10, float f11, int i10, int i11) {
        if (i10 > 1) {
            return false;
        }
        if (i10 == 0) {
            this.f160654v.U(f10, f11);
            long jT5 = this.Z.T5();
            this.f160653t = jT5;
            this.f160650n.f(f10, f11, jT5);
            if (this.Z.m6(1)) {
                this.f160641e = false;
                this.f160648l = true;
                this.X.V(this.f160654v);
                this.Y.V(this.f160655w);
            } else {
                this.f160641e = true;
                this.f160648l = false;
                this.f160651o = f10;
                this.f160652s = f11;
            }
        } else {
            this.f160655w.U(f10, f11);
            this.f160641e = false;
            this.f160648l = true;
            this.X.V(this.f160654v);
            this.Y.V(this.f160655w);
        }
        return this.f160637a.b(f10, f11, i10, i11);
    }

    public boolean G(float f10, float f11, int i10) {
        if (i10 > 1) {
            return false;
        }
        if (i10 == 0) {
            this.f160654v.U(f10, f11);
        } else {
            this.f160655w.U(f10, f11);
        }
        if (this.f160648l) {
            b bVar = this.f160637a;
            if (bVar != null) {
                return this.f160637a.d(this.X.m(this.Y), this.f160654v.m(this.f160655w)) || bVar.c(this.X, this.Y, this.f160654v, this.f160655w);
            }
            return false;
        }
        this.f160650n.g(f10, f11, this.Z.T5());
        if (this.f160641e && !A(f10, f11, this.f160651o, this.f160652s)) {
            this.f160641e = false;
        }
        if (this.f160641e) {
            return false;
        }
        this.f160649m = true;
        b bVar2 = this.f160637a;
        c cVar = this.f160650n;
        return bVar2.g(f10, f11, cVar.f160659d, cVar.f160660e);
    }

    public boolean H(float f10, float f11, int i10, int i11) {
        if (i10 > 1) {
            return false;
        }
        if (this.f160641e && !A(f10, f11, this.f160651o, this.f160652s)) {
            this.f160641e = false;
        }
        boolean z10 = this.f160649m;
        this.f160649m = false;
        if (this.f160641e) {
            if (this.f160646j != i11 || this.f160647k != i10 || System.nanoTime() - this.f160643g > this.f160639c || !A(f10, f11, this.f160644h, this.f160645i)) {
                this.f160642f = 0;
            }
            this.f160642f++;
            this.f160643g = System.nanoTime();
            this.f160644h = f10;
            this.f160645i = f11;
            this.f160646j = i11;
            this.f160647k = i10;
            this.f160653t = 0L;
            return this.f160637a.f(f10, f11, this.f160642f, i11);
        }
        if (!this.f160648l) {
            boolean zA = z10 ? this.f160637a.a(f10, f11, i10, i11) : false;
            this.f160653t = 0L;
            long jT5 = this.Z.T5();
            c cVar = this.f160650n;
            if (jT5 - cVar.f160661f >= this.f160640d) {
                return zA;
            }
            cVar.g(f10, f11, jT5);
            return this.f160637a.e(this.f160650n.d(), this.f160650n.e(), i11) || zA;
        }
        this.f160648l = false;
        this.f160649m = true;
        if (i10 == 0) {
            c cVar2 = this.f160650n;
            k kVar = this.f160655w;
            cVar2.f(kVar.f180480a, kVar.f180481b, this.Z.T5());
        } else {
            c cVar3 = this.f160650n;
            k kVar2 = this.f160654v;
            cVar3.f(kVar2.f180480a, kVar2.f180481b, this.Z.T5());
        }
        return false;
    }

    @Override // com.planner5d.library.engine.input.g, com.planner5d.library.engine.l
    public boolean c(int i10, int i11, int i12, int i13) {
        return H(i10, i11, i12, i13);
    }

    @Override // com.planner5d.library.engine.input.g, com.planner5d.library.engine.l
    public boolean d(int i10, int i11, int i12, int i13) {
        return F(i10, i11, i12, i13);
    }

    @Override // com.planner5d.library.engine.input.g, com.planner5d.library.engine.l
    public boolean k(int i10, int i11, int i12) {
        return G(i10, i11, i12);
    }

    public void t() {
    }

    public void v() {
        this.f160641e = false;
    }

    public boolean w() {
        return this.f160649m;
    }

    public e(com.planner5d.library.engine.a aVar, float f10, float f11, float f12, b bVar) {
        this.f160650n = new c();
        this.f160654v = new k();
        this.f160655w = new k();
        this.X = new k();
        this.Y = new k();
        this.Z = aVar.h();
        this.f160638b = f10;
        this.f160639c = (long) (f11 * 1.0E9f);
        this.f160640d = (long) (f12 * 1.0E9f);
        this.f160637a = bVar;
    }
}
