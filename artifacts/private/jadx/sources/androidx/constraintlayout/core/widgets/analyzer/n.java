package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes2.dex */
public class n extends p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final boolean f44596m = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f44597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f44598l;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44599a;

        static {
            int[] iArr = new int[p.b.values().length];
            f44599a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44599a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44599a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(androidx.constraintlayout.core.widgets.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f44597k = fVar;
        this.f44598l = null;
        this.f44622h.f44556e = f.a.TOP;
        this.f44623i.f44556e = f.a.BOTTOM;
        fVar.f44556e = f.a.BASELINE;
        this.f44620f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        float f10;
        float fA;
        float fA2;
        int i10;
        int i11 = a.f44599a[this.f44624j.ordinal()];
        if (i11 == 1) {
            s(dVar);
        } else if (i11 == 2) {
            r(dVar);
        } else if (i11 == 3) {
            androidx.constraintlayout.core.widgets.e eVar = this.f44616b;
            q(dVar, eVar.R, eVar.T, 1);
            return;
        }
        g gVar = this.f44619e;
        if (gVar.f44554c && !gVar.f44561j && this.f44618d == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
            androidx.constraintlayout.core.widgets.e eVar2 = this.f44616b;
            int i12 = eVar2.f44748x;
            if (i12 == 2) {
                androidx.constraintlayout.core.widgets.e eVarU = eVar2.U();
                if (eVarU != null) {
                    g gVar2 = eVarU.f44712f.f44619e;
                    if (gVar2.f44561j) {
                        this.f44619e.e((int) ((gVar2.f44558g * this.f44616b.E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f44710e.f44619e.f44561j) {
                int iB = eVar2.B();
                if (iB != -1) {
                    if (iB == 0) {
                        androidx.constraintlayout.core.widgets.e eVar3 = this.f44616b;
                        fA2 = eVar3.f44710e.f44619e.f44558g * eVar3.A();
                        i10 = (int) (fA2 + 0.5f);
                    } else if (iB != 1) {
                        i10 = 0;
                    } else {
                        androidx.constraintlayout.core.widgets.e eVar4 = this.f44616b;
                        f10 = eVar4.f44710e.f44619e.f44558g;
                        fA = eVar4.A();
                    }
                    this.f44619e.e(i10);
                } else {
                    androidx.constraintlayout.core.widgets.e eVar5 = this.f44616b;
                    f10 = eVar5.f44710e.f44619e.f44558g;
                    fA = eVar5.A();
                }
                fA2 = f10 / fA;
                i10 = (int) (fA2 + 0.5f);
                this.f44619e.e(i10);
            }
        }
        f fVar = this.f44622h;
        if (fVar.f44554c) {
            f fVar2 = this.f44623i;
            if (fVar2.f44554c) {
                if (fVar.f44561j && fVar2.f44561j && this.f44619e.f44561j) {
                    return;
                }
                if (!this.f44619e.f44561j && this.f44618d == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
                    androidx.constraintlayout.core.widgets.e eVar6 = this.f44616b;
                    if (eVar6.f44746w == 0 && !eVar6.D0()) {
                        f fVar3 = this.f44622h.f44563l.get(0);
                        f fVar4 = this.f44623i.f44563l.get(0);
                        int i13 = fVar3.f44558g;
                        f fVar5 = this.f44622h;
                        int i14 = i13 + fVar5.f44557f;
                        int i15 = fVar4.f44558g + this.f44623i.f44557f;
                        fVar5.e(i14);
                        this.f44623i.e(i15);
                        this.f44619e.e(i15 - i14);
                        return;
                    }
                }
                if (!this.f44619e.f44561j && this.f44618d == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT && this.f44615a == 1 && this.f44622h.f44563l.size() > 0 && this.f44623i.f44563l.size() > 0) {
                    f fVar6 = this.f44622h.f44563l.get(0);
                    int i16 = (this.f44623i.f44563l.get(0).f44558g + this.f44623i.f44557f) - (fVar6.f44558g + this.f44622h.f44557f);
                    g gVar3 = this.f44619e;
                    int i17 = gVar3.f44573m;
                    if (i16 < i17) {
                        gVar3.e(i16);
                    } else {
                        gVar3.e(i17);
                    }
                }
                if (this.f44619e.f44561j && this.f44622h.f44563l.size() > 0 && this.f44623i.f44563l.size() > 0) {
                    f fVar7 = this.f44622h.f44563l.get(0);
                    f fVar8 = this.f44623i.f44563l.get(0);
                    int i18 = fVar7.f44558g + this.f44622h.f44557f;
                    int i19 = fVar8.f44558g + this.f44623i.f44557f;
                    float fG0 = this.f44616b.g0();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f44558g;
                        i19 = fVar8.f44558g;
                        fG0 = 0.5f;
                    }
                    this.f44622h.e((int) (i18 + 0.5f + (((i19 - i18) - this.f44619e.f44558g) * fG0)));
                    this.f44623i.e(this.f44622h.f44558g + this.f44619e.f44558g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void d() {
        androidx.constraintlayout.core.widgets.e eVarU;
        androidx.constraintlayout.core.widgets.e eVarU2;
        androidx.constraintlayout.core.widgets.e eVar = this.f44616b;
        if (eVar.f44702a) {
            this.f44619e.e(eVar.D());
        }
        if (!this.f44619e.f44561j) {
            this.f44618d = this.f44616b.j0();
            if (this.f44616b.q0()) {
                this.f44598l = new androidx.constraintlayout.core.widgets.analyzer.a(this);
            }
            androidx.constraintlayout.core.widgets.e.b bVar = this.f44618d;
            if (bVar != androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
                if (bVar == androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT && (eVarU2 = this.f44616b.U()) != null && eVarU2.j0() == androidx.constraintlayout.core.widgets.e.b.FIXED) {
                    int iD = (eVarU2.D() - this.f44616b.R.g()) - this.f44616b.T.g();
                    b(this.f44622h, eVarU2.f44712f.f44622h, this.f44616b.R.g());
                    b(this.f44623i, eVarU2.f44712f.f44623i, -this.f44616b.T.g());
                    this.f44619e.e(iD);
                    return;
                }
                if (this.f44618d == androidx.constraintlayout.core.widgets.e.b.FIXED) {
                    this.f44619e.e(this.f44616b.D());
                }
            }
        } else if (this.f44618d == androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT && (eVarU = this.f44616b.U()) != null && eVarU.j0() == androidx.constraintlayout.core.widgets.e.b.FIXED) {
            b(this.f44622h, eVarU.f44712f.f44622h, this.f44616b.R.g());
            b(this.f44623i, eVarU.f44712f.f44623i, -this.f44616b.T.g());
            return;
        }
        g gVar = this.f44619e;
        boolean z10 = gVar.f44561j;
        int i10 = 5 ^ 1;
        if (z10) {
            androidx.constraintlayout.core.widgets.e eVar2 = this.f44616b;
            if (eVar2.f44702a) {
                androidx.constraintlayout.core.widgets.d[] dVarArr = eVar2.Y;
                androidx.constraintlayout.core.widgets.d dVar = dVarArr[2];
                androidx.constraintlayout.core.widgets.d dVar2 = dVar.f44662f;
                if (dVar2 != null && dVarArr[3].f44662f != null) {
                    if (eVar2.D0()) {
                        this.f44622h.f44557f = this.f44616b.Y[2].g();
                        this.f44623i.f44557f = -this.f44616b.Y[3].g();
                    } else {
                        f fVarH = h(this.f44616b.Y[2]);
                        if (fVarH != null) {
                            b(this.f44622h, fVarH, this.f44616b.Y[2].g());
                        }
                        f fVarH2 = h(this.f44616b.Y[3]);
                        if (fVarH2 != null) {
                            b(this.f44623i, fVarH2, -this.f44616b.Y[3].g());
                        }
                        this.f44622h.f44553b = true;
                        this.f44623i.f44553b = true;
                    }
                    if (this.f44616b.q0()) {
                        b(this.f44597k, this.f44622h, this.f44616b.t());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f44622h, fVarH3, this.f44616b.Y[2].g());
                        b(this.f44623i, this.f44622h, this.f44619e.f44558g);
                        if (this.f44616b.q0()) {
                            b(this.f44597k, this.f44622h, this.f44616b.t());
                            return;
                        }
                        return;
                    }
                    return;
                }
                androidx.constraintlayout.core.widgets.d dVar3 = dVarArr[3];
                if (dVar3.f44662f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f44623i, fVarH4, -this.f44616b.Y[3].g());
                        b(this.f44622h, this.f44623i, -this.f44619e.f44558g);
                    }
                    if (this.f44616b.q0()) {
                        b(this.f44597k, this.f44622h, this.f44616b.t());
                        return;
                    }
                    return;
                }
                androidx.constraintlayout.core.widgets.d dVar4 = dVarArr[4];
                if (dVar4.f44662f != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f44597k, fVarH5, 0);
                        b(this.f44622h, this.f44597k, -this.f44616b.t());
                        b(this.f44623i, this.f44622h, this.f44619e.f44558g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof androidx.constraintlayout.core.widgets.i) || eVar2.U() == null || this.f44616b.r(androidx.constraintlayout.core.widgets.d.a.CENTER).f44662f != null) {
                    return;
                }
                b(this.f44622h, this.f44616b.U().f44712f.f44622h, this.f44616b.p0());
                b(this.f44623i, this.f44622h, this.f44619e.f44558g);
                if (this.f44616b.q0()) {
                    b(this.f44597k, this.f44622h, this.f44616b.t());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f44618d != androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            androidx.constraintlayout.core.widgets.e eVar3 = this.f44616b;
            int i11 = eVar3.f44748x;
            if (i11 == 2) {
                androidx.constraintlayout.core.widgets.e eVarU3 = eVar3.U();
                if (eVarU3 != null) {
                    g gVar2 = eVarU3.f44712f.f44619e;
                    this.f44619e.f44563l.add(gVar2);
                    gVar2.f44562k.add(this.f44619e);
                    g gVar3 = this.f44619e;
                    gVar3.f44553b = true;
                    gVar3.f44562k.add(this.f44622h);
                    this.f44619e.f44562k.add(this.f44623i);
                }
            } else if (i11 == 3 && !eVar3.D0()) {
                androidx.constraintlayout.core.widgets.e eVar4 = this.f44616b;
                if (eVar4.f44746w != 3) {
                    g gVar4 = eVar4.f44710e.f44619e;
                    this.f44619e.f44563l.add(gVar4);
                    gVar4.f44562k.add(this.f44619e);
                    g gVar5 = this.f44619e;
                    gVar5.f44553b = true;
                    gVar5.f44562k.add(this.f44622h);
                    this.f44619e.f44562k.add(this.f44623i);
                }
            }
        }
        androidx.constraintlayout.core.widgets.e eVar5 = this.f44616b;
        androidx.constraintlayout.core.widgets.d[] dVarArr2 = eVar5.Y;
        androidx.constraintlayout.core.widgets.d dVar5 = dVarArr2[2];
        androidx.constraintlayout.core.widgets.d dVar6 = dVar5.f44662f;
        if (dVar6 != null && dVarArr2[3].f44662f != null) {
            if (eVar5.D0()) {
                this.f44622h.f44557f = this.f44616b.Y[2].g();
                this.f44623i.f44557f = -this.f44616b.Y[3].g();
            } else {
                f fVarH6 = h(this.f44616b.Y[2]);
                f fVarH7 = h(this.f44616b.Y[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f44624j = p.b.CENTER;
            }
            if (this.f44616b.q0()) {
                c(this.f44597k, this.f44622h, 1, this.f44598l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f44622h, fVarH8, this.f44616b.Y[2].g());
                c(this.f44623i, this.f44622h, 1, this.f44619e);
                if (this.f44616b.q0()) {
                    c(this.f44597k, this.f44622h, 1, this.f44598l);
                }
                androidx.constraintlayout.core.widgets.e.b bVar2 = this.f44618d;
                androidx.constraintlayout.core.widgets.e.b bVar3 = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f44616b.A() > 0.0f) {
                    l lVar = this.f44616b.f44710e;
                    if (lVar.f44618d == bVar3) {
                        lVar.f44619e.f44562k.add(this.f44619e);
                        this.f44619e.f44563l.add(this.f44616b.f44710e.f44619e);
                        this.f44619e.f44552a = this;
                    }
                }
            }
        } else {
            androidx.constraintlayout.core.widgets.d dVar7 = dVarArr2[3];
            if (dVar7.f44662f != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f44623i, fVarH9, -this.f44616b.Y[3].g());
                    c(this.f44622h, this.f44623i, -1, this.f44619e);
                    if (this.f44616b.q0()) {
                        c(this.f44597k, this.f44622h, 1, this.f44598l);
                    }
                }
            } else {
                androidx.constraintlayout.core.widgets.d dVar8 = dVarArr2[4];
                if (dVar8.f44662f != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f44597k, fVarH10, 0);
                        c(this.f44622h, this.f44597k, -1, this.f44598l);
                        c(this.f44623i, this.f44622h, 1, this.f44619e);
                    }
                } else if (!(eVar5 instanceof androidx.constraintlayout.core.widgets.i) && eVar5.U() != null) {
                    b(this.f44622h, this.f44616b.U().f44712f.f44622h, this.f44616b.p0());
                    c(this.f44623i, this.f44622h, 1, this.f44619e);
                    if (this.f44616b.q0()) {
                        c(this.f44597k, this.f44622h, 1, this.f44598l);
                    }
                    androidx.constraintlayout.core.widgets.e.b bVar4 = this.f44618d;
                    androidx.constraintlayout.core.widgets.e.b bVar5 = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f44616b.A() > 0.0f) {
                        l lVar2 = this.f44616b.f44710e;
                        if (lVar2.f44618d == bVar5) {
                            lVar2.f44619e.f44562k.add(this.f44619e);
                            this.f44619e.f44563l.add(this.f44616b.f44710e.f44619e);
                            this.f44619e.f44552a = this;
                        }
                    }
                }
            }
        }
        if (this.f44619e.f44563l.size() == 0) {
            this.f44619e.f44554c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        f fVar = this.f44622h;
        if (fVar.f44561j) {
            this.f44616b.h2(fVar.f44558g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void f() {
        this.f44617c = null;
        this.f44622h.c();
        this.f44623i.c();
        this.f44597k.c();
        this.f44619e.c();
        this.f44621g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void n() {
        this.f44621g = false;
        this.f44622h.c();
        this.f44622h.f44561j = false;
        this.f44623i.c();
        this.f44623i.f44561j = false;
        this.f44597k.c();
        this.f44597k.f44561j = false;
        this.f44619e.f44561j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    boolean p() {
        return this.f44618d != androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT || this.f44616b.f44748x == 0;
    }

    public String toString() {
        return "VerticalRun " + this.f44616b.y();
    }
}
