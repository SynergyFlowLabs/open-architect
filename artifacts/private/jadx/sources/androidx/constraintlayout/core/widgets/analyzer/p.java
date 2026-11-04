package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.core.widgets.e f44616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    m f44617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected androidx.constraintlayout.core.widgets.e.b f44618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f44619e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44620f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f44621g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f44622h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f44623i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected b f44624j = b.NONE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44625a;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.widgets.d.a.values().length];
            f44625a = iArr;
            try {
                iArr[androidx.constraintlayout.core.widgets.d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44625a[androidx.constraintlayout.core.widgets.d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44625a[androidx.constraintlayout.core.widgets.d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44625a[androidx.constraintlayout.core.widgets.d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44625a[androidx.constraintlayout.core.widgets.d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER;

        static {
            int i10 = 2 << 3;
        }
    }

    public p(androidx.constraintlayout.core.widgets.e eVar) {
        int i10 = 1 << 0;
        this.f44616b = eVar;
    }

    private void o(int i10, int i11) {
        int i12 = this.f44615a;
        if (i12 == 0) {
            this.f44619e.e(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f44619e.e(Math.min(g(this.f44619e.f44573m, i10), i11));
            return;
        }
        if (i12 == 2) {
            androidx.constraintlayout.core.widgets.e eVarU = this.f44616b.U();
            if (eVarU != null) {
                g gVar = (i10 == 0 ? eVarU.f44710e : eVarU.f44712f).f44619e;
                if (gVar.f44561j) {
                    this.f44619e.e(g((int) ((gVar.f44558g * (i10 == 0 ? this.f44616b.B : this.f44616b.E)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        androidx.constraintlayout.core.widgets.e eVar = this.f44616b;
        p pVar = eVar.f44710e;
        androidx.constraintlayout.core.widgets.e.b bVar = pVar.f44618d;
        androidx.constraintlayout.core.widgets.e.b bVar2 = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f44615a == 3) {
            n nVar = eVar.f44712f;
            if (nVar.f44618d == bVar2 && nVar.f44615a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = eVar.f44712f;
        }
        if (pVar.f44619e.f44561j) {
            float fA = eVar.A();
            this.f44619e.e(i10 == 1 ? (int) ((pVar.f44619e.f44558g / fA) + 0.5f) : (int) ((fA * pVar.f44619e.f44558g) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
    }

    protected final void b(f fVar, f fVar2, int i10) {
        fVar.f44563l.add(fVar2);
        fVar.f44557f = i10;
        fVar2.f44562k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f44563l.add(fVar2);
        fVar.f44563l.add(this.f44619e);
        fVar.f44559h = i10;
        fVar.f44560i = gVar;
        fVar2.f44562k.add(fVar);
        gVar.f44562k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i10, int i11) {
        if (i11 == 0) {
            androidx.constraintlayout.core.widgets.e eVar = this.f44616b;
            int i12 = eVar.A;
            int iMax = Math.max(eVar.f44752z, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            androidx.constraintlayout.core.widgets.e eVar2 = this.f44616b;
            int i13 = eVar2.D;
            int iMax2 = Math.max(eVar2.C, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    protected final f h(androidx.constraintlayout.core.widgets.d dVar) {
        androidx.constraintlayout.core.widgets.d dVar2 = dVar.f44662f;
        if (dVar2 == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.e eVar = dVar2.f44660d;
        int i10 = a.f44625a[dVar2.f44661e.ordinal()];
        if (i10 == 1) {
            return eVar.f44710e.f44622h;
        }
        if (i10 == 2) {
            return eVar.f44710e.f44623i;
        }
        if (i10 == 3) {
            return eVar.f44712f.f44622h;
        }
        if (i10 == 4) {
            return eVar.f44712f.f44597k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f44712f.f44623i;
    }

    protected final f i(androidx.constraintlayout.core.widgets.d dVar, int i10) {
        androidx.constraintlayout.core.widgets.d dVar2 = dVar.f44662f;
        if (dVar2 == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.e eVar = dVar2.f44660d;
        p pVar = i10 == 0 ? eVar.f44710e : eVar.f44712f;
        int i11 = a.f44625a[dVar2.f44661e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f44623i;
        }
        return pVar.f44622h;
    }

    public long j() {
        g gVar = this.f44619e;
        if (gVar.f44561j) {
            return gVar.f44558g;
        }
        return 0L;
    }

    public boolean k() {
        int size = this.f44622h.f44563l.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f44622h.f44563l.get(i11).f44555d != this) {
                i10++;
            }
        }
        int size2 = this.f44623i.f44563l.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (this.f44623i.f44563l.get(i12).f44555d != this) {
                i10++;
            }
        }
        return i10 >= 2;
    }

    public boolean l() {
        return this.f44619e.f44561j;
    }

    public boolean m() {
        return this.f44621g;
    }

    abstract void n();

    abstract boolean p();

    protected void q(d dVar, androidx.constraintlayout.core.widgets.d dVar2, androidx.constraintlayout.core.widgets.d dVar3, int i10) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f44561j && fVarH2.f44561j) {
            int iG = fVarH.f44558g + dVar2.g();
            int iG2 = fVarH2.f44558g - dVar3.g();
            int i11 = iG2 - iG;
            if (!this.f44619e.f44561j && this.f44618d == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
                o(i10, i11);
            }
            g gVar = this.f44619e;
            if (gVar.f44561j) {
                if (gVar.f44558g == i11) {
                    this.f44622h.e(iG);
                    this.f44623i.e(iG2);
                    return;
                }
                float fE = i10 == 0 ? this.f44616b.E() : this.f44616b.g0();
                if (fVarH == fVarH2) {
                    iG = fVarH.f44558g;
                    iG2 = fVarH2.f44558g;
                    fE = 0.5f;
                }
                this.f44622h.e((int) (iG + 0.5f + (((iG2 - iG) - this.f44619e.f44558g) * fE)));
                this.f44623i.e(this.f44622h.f44558g + this.f44619e.f44558g);
            }
        }
    }

    protected void r(d dVar) {
    }

    protected void s(d dVar) {
    }

    public long t(int i10) {
        g gVar = this.f44619e;
        if (!gVar.f44561j) {
            return 0L;
        }
        long j10 = gVar.f44558g;
        if (k()) {
            return j10 + ((long) (this.f44622h.f44557f - this.f44623i.f44557f));
        }
        return i10 == 0 ? j10 + ((long) this.f44622h.f44557f) : j10 - ((long) this.f44623i.f44557f);
    }
}
