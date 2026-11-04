package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f44633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e f44634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f44635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e f44636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e f44637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f44638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected e f44639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f44640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f44641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f44642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f44643k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f44644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f44645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f44646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f44647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f44648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f44649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f44650r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f44651s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f44652t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f44653u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f44654v;

    public c(e eVar, int i10, boolean z10) {
        this.f44633a = eVar;
        this.f44648p = i10;
        this.f44649q = z10;
    }

    private void b() {
        int i10 = this.f44648p * 2;
        e eVar = this.f44633a;
        boolean z10 = true;
        this.f44647o = true;
        e eVar2 = eVar;
        boolean z11 = false;
        while (!z11) {
            this.f44641i++;
            e[] eVarArr = eVar.P0;
            int i11 = this.f44648p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.O0[i11] = null;
            if (eVar.l0() != 8) {
                this.f44644l++;
                e.b bVarZ = eVar.z(this.f44648p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarZ != bVar) {
                    this.f44645m += eVar.M(this.f44648p);
                }
                int iG = this.f44645m + eVar.Y[i10].g();
                this.f44645m = iG;
                int i12 = i10 + 1;
                this.f44645m = iG + eVar.Y[i12].g();
                int iG2 = this.f44646n + eVar.Y[i10].g();
                this.f44646n = iG2;
                this.f44646n = iG2 + eVar.Y[i12].g();
                if (this.f44634b == null) {
                    this.f44634b = eVar;
                }
                this.f44636d = eVar;
                e.b[] bVarArr = eVar.f44705b0;
                int i13 = this.f44648p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f44750y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f44642j++;
                        float f10 = eVar.N0[i13];
                        if (f10 > 0.0f) {
                            this.f44643k += f10;
                        }
                        if (k(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f44650r = true;
                            } else {
                                this.f44651s = true;
                            }
                            if (this.f44640h == null) {
                                this.f44640h = new ArrayList<>();
                            }
                            this.f44640h.add(eVar);
                        }
                        if (this.f44638f == null) {
                            this.f44638f = eVar;
                        }
                        e eVar4 = this.f44639g;
                        if (eVar4 != null) {
                            eVar4.O0[this.f44648p] = eVar;
                        }
                        this.f44639g = eVar;
                    }
                    if (this.f44648p == 0) {
                        if (eVar.f44746w != 0 || eVar.f44752z != 0 || eVar.A != 0) {
                            this.f44647o = false;
                        }
                    } else if (eVar.f44748x != 0 || eVar.C != 0 || eVar.D != 0) {
                        this.f44647o = false;
                    }
                    if (eVar.f44713f0 != 0.0f) {
                        this.f44647o = false;
                        this.f44653u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.P0[this.f44648p] = eVar;
            }
            d dVar = eVar.Y[i10 + 1].f44662f;
            if (dVar != null) {
                e eVar5 = dVar.f44660d;
                d dVar2 = eVar5.Y[i10].f44662f;
                if (dVar2 != null && dVar2.f44660d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z11 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f44634b;
        if (eVar6 != null) {
            this.f44645m -= eVar6.Y[i10].g();
        }
        e eVar7 = this.f44636d;
        if (eVar7 != null) {
            this.f44645m -= eVar7.Y[i10 + 1].g();
        }
        this.f44635c = eVar;
        if (this.f44648p == 0 && this.f44649q) {
            this.f44637e = eVar;
        } else {
            this.f44637e = this.f44633a;
        }
        if (!this.f44651s || !this.f44650r) {
            z10 = false;
        }
        this.f44652t = z10;
    }

    private static boolean k(e eVar, int i10) {
        int i11;
        return eVar.l0() != 8 && eVar.f44705b0[i10] == e.b.MATCH_CONSTRAINT && ((i11 = eVar.f44750y[i10]) == 0 || i11 == 3);
    }

    public void a() {
        if (!this.f44654v) {
            b();
        }
        this.f44654v = true;
    }

    public e c() {
        return this.f44633a;
    }

    public e d() {
        return this.f44638f;
    }

    public e e() {
        return this.f44634b;
    }

    public e f() {
        return this.f44637e;
    }

    public e g() {
        return this.f44635c;
    }

    public e h() {
        return this.f44639g;
    }

    public e i() {
        return this.f44636d;
    }

    public float j() {
        return this.f44643k;
    }
}
