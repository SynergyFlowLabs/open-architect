package androidx.constraintlayout.core;

import com.facebook.appevents.l0;
import com.facebook.appevents.p;
import com.google.firebase.crashlytics.internal.common.n0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class b implements e.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f43065g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f43066h = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f43071e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i f43067a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f43068b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f43069c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<i> f43070d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f43072f = false;

    public interface a {
        void clear();

        int e();

        int f(i iVar);

        boolean g(i iVar);

        i h(int i10);

        void i(i iVar, float f10);

        float j(i iVar);

        void k(float f10);

        void l(i iVar, float f10, boolean z10);

        void m();

        float n(i iVar, boolean z10);

        int o();

        void p();

        float q(b bVar, boolean z10);

        float r(int i10);
    }

    public b() {
    }

    private i B(boolean[] zArr, i iVar) {
        i.a aVar;
        int iE = this.f43071e.e();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iE; i10++) {
            float fR = this.f43071e.r(i10);
            if (fR < 0.0f) {
                i iVarH = this.f43071e.h(i10);
                if ((zArr == null || !zArr[iVarH.f43433c]) && iVarH != iVar && (((aVar = iVarH.f43440j) == i.a.SLACK || aVar == i.a.ERROR) && fR < f10)) {
                    f10 = fR;
                    iVar2 = iVarH;
                }
            }
        }
        return iVar2;
    }

    private boolean z(i iVar, e eVar) {
        return iVar.f43443m <= 1;
    }

    public i A(i iVar) {
        return B(null, iVar);
    }

    void C(i iVar) {
        i iVar2 = this.f43067a;
        if (iVar2 != null) {
            this.f43071e.i(iVar2, -1.0f);
            this.f43067a.f43434d = -1;
            this.f43067a = null;
        }
        float fN = this.f43071e.n(iVar, true) * (-1.0f);
        this.f43067a = iVar;
        if (fN == 1.0f) {
            return;
        }
        this.f43068b /= fN;
        this.f43071e.k(fN);
    }

    public void D() {
        this.f43067a = null;
        this.f43071e.clear();
        this.f43068b = 0.0f;
        this.f43072f = false;
    }

    int E() {
        int i10;
        if (this.f43067a != null) {
            i10 = 4;
            int i11 = 1 & 4;
        } else {
            i10 = 0;
        }
        return i10 + 8 + this.f43071e.o();
    }

    String F() {
        boolean z10;
        String str = (this.f43067a == null ? "" + p.f99189d0 : "" + this.f43067a) + " = ";
        if (this.f43068b != 0.0f) {
            str = str + this.f43068b;
            z10 = true;
        } else {
            z10 = false;
        }
        int iE = this.f43071e.e();
        for (int i10 = 0; i10 < iE; i10++) {
            i iVarH = this.f43071e.h(i10);
            if (iVarH != null) {
                float fR = this.f43071e.r(i10);
                if (fR != 0.0f) {
                    String string = iVarH.toString();
                    if (z10) {
                        if (fR > 0.0f) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            fR *= -1.0f;
                        }
                    } else if (fR < 0.0f) {
                        str = str + "- ";
                        fR *= -1.0f;
                    }
                    str = fR == 1.0f ? str + string : str + fR + " " + string;
                    z10 = true;
                }
            }
        }
        if (z10) {
            return str;
        }
        return str + n0.f121134h;
    }

    public void G(e eVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f43444n) {
            return;
        }
        float fJ = this.f43071e.j(iVar);
        this.f43068b += iVar.f43446s * fJ;
        this.f43071e.n(iVar, z10);
        if (z10) {
            iVar.q(this);
        }
        this.f43071e.l(eVar.f43371o.f43076d[iVar.f43445o], fJ, z10);
        if (e.f43355y && this.f43071e.e() == 0) {
            this.f43072f = true;
            eVar.f43358b = true;
        }
    }

    @Override // androidx.constraintlayout.core.e.a
    public void a(e eVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f43437g) {
            return;
        }
        this.f43068b += iVar.f43436f * this.f43071e.j(iVar);
        this.f43071e.n(iVar, z10);
        if (z10) {
            iVar.q(this);
        }
        if (e.f43355y && this.f43071e.e() == 0) {
            int i10 = 2 | 1;
            this.f43072f = true;
            eVar.f43358b = true;
        }
    }

    @Override // androidx.constraintlayout.core.e.a
    public void b(e eVar, b bVar, boolean z10) {
        this.f43068b += bVar.f43068b * this.f43071e.q(bVar, z10);
        if (z10) {
            bVar.f43067a.q(this);
        }
        if (e.f43355y && this.f43067a != null && this.f43071e.e() == 0) {
            this.f43072f = true;
            eVar.f43358b = true;
        }
    }

    @Override // androidx.constraintlayout.core.e.a
    public i c(e eVar, boolean[] zArr) {
        return B(zArr, null);
    }

    @Override // androidx.constraintlayout.core.e.a
    public void clear() {
        this.f43071e.clear();
        int i10 = 6 ^ 0;
        this.f43067a = null;
        this.f43068b = 0.0f;
    }

    @Override // androidx.constraintlayout.core.e.a
    public void d(e eVar) {
        if (eVar.f43364h.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iE = this.f43071e.e();
            for (int i10 = 0; i10 < iE; i10++) {
                i iVarH = this.f43071e.h(i10);
                if (iVarH.f43434d != -1 || iVarH.f43437g || iVarH.f43444n) {
                    this.f43070d.add(iVarH);
                }
            }
            int size = this.f43070d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = this.f43070d.get(i11);
                    if (iVar.f43437g) {
                        a(eVar, iVar, true);
                    } else if (iVar.f43444n) {
                        G(eVar, iVar, true);
                    } else {
                        b(eVar, eVar.f43364h[iVar.f43434d], true);
                    }
                }
                this.f43070d.clear();
            } else {
                z10 = true;
            }
        }
        if (e.f43355y && this.f43067a != null && this.f43071e.e() == 0) {
            this.f43072f = true;
            eVar.f43358b = true;
        }
    }

    @Override // androidx.constraintlayout.core.e.a
    public void e(e.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f43067a = null;
            this.f43071e.clear();
            for (int i10 = 0; i10 < bVar.f43071e.e(); i10++) {
                this.f43071e.l(bVar.f43071e.h(i10), bVar.f43071e.r(i10), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.e.a
    public void f(i iVar) {
        int i10 = iVar.f43435e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f43071e.i(iVar, f10);
    }

    public b g(e eVar, int i10) {
        this.f43071e.i(eVar.q(i10, "ep"), 1.0f);
        this.f43071e.i(eVar.q(i10, l0.f99132k), -1.0f);
        return this;
    }

    @Override // androidx.constraintlayout.core.e.a
    public i getKey() {
        return this.f43067a;
    }

    b h(i iVar, int i10) {
        this.f43071e.i(iVar, i10);
        return this;
    }

    boolean i(e eVar) {
        boolean z10;
        i iVarJ = j(eVar);
        if (iVarJ == null) {
            z10 = true;
        } else {
            C(iVarJ);
            z10 = false;
        }
        if (this.f43071e.e() == 0) {
            this.f43072f = true;
        }
        return z10;
    }

    @Override // androidx.constraintlayout.core.e.a
    public boolean isEmpty() {
        return this.f43067a == null && this.f43068b == 0.0f && this.f43071e.e() == 0;
    }

    i j(e eVar) {
        int iE = this.f43071e.e();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < iE; i10++) {
            float fR = this.f43071e.r(i10);
            i iVarH = this.f43071e.h(i10);
            if (iVarH.f43440j == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > fR) {
                    boolean z12 = z(iVarH, eVar);
                    z10 = z12;
                    f10 = fR;
                    iVar = iVarH;
                } else if (!z10 && z(iVarH, eVar)) {
                    f10 = fR;
                    iVar = iVarH;
                    z10 = true;
                }
            } else if (iVar == null && fR < 0.0f) {
                if (iVar2 == null || f11 > fR) {
                    boolean z13 = z(iVarH, eVar);
                    z11 = z13;
                    f11 = fR;
                    iVar2 = iVarH;
                } else if (!z11 && z(iVarH, eVar)) {
                    f11 = fR;
                    iVar2 = iVarH;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    b k(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f43071e.i(iVar, 1.0f);
            this.f43071e.i(iVar4, 1.0f);
            this.f43071e.i(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f43071e.i(iVar, 1.0f);
            this.f43071e.i(iVar2, -1.0f);
            this.f43071e.i(iVar3, -1.0f);
            this.f43071e.i(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f43068b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f43071e.i(iVar, -1.0f);
                this.f43071e.i(iVar2, 1.0f);
                this.f43068b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f43071e.i(iVar4, -1.0f);
                this.f43071e.i(iVar3, 1.0f);
                this.f43068b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f43071e.i(iVar, f11 * 1.0f);
            this.f43071e.i(iVar2, f11 * (-1.0f));
            this.f43071e.i(iVar3, (-1.0f) * f10);
            this.f43071e.i(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f43068b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    b l(i iVar, int i10) {
        this.f43067a = iVar;
        float f10 = i10;
        iVar.f43436f = f10;
        this.f43068b = f10;
        this.f43072f = true;
        return this;
    }

    b m(i iVar, i iVar2, float f10) {
        this.f43071e.i(iVar, -1.0f);
        this.f43071e.i(iVar2, f10);
        return this;
    }

    public b n(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f43071e.i(iVar, -1.0f);
        this.f43071e.i(iVar2, 1.0f);
        this.f43071e.i(iVar3, f10);
        this.f43071e.i(iVar4, -f10);
        return this;
    }

    public b o(float f10, float f11, float f12, i iVar, int i10, i iVar2, int i11, i iVar3, int i12, i iVar4, int i13) {
        if (f11 == 0.0f || f10 == f12) {
            this.f43068b = ((-i10) - i11) + i12 + i13;
            this.f43071e.i(iVar, 1.0f);
            this.f43071e.i(iVar2, -1.0f);
            this.f43071e.i(iVar4, 1.0f);
            this.f43071e.i(iVar3, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f43068b = ((-i10) - i11) + (i12 * f13) + (i13 * f13);
        this.f43071e.i(iVar, 1.0f);
        this.f43071e.i(iVar2, -1.0f);
        this.f43071e.i(iVar4, f13);
        this.f43071e.i(iVar3, -f13);
        return this;
    }

    public b p(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f43068b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f43071e.i(iVar, 1.0f);
            this.f43071e.i(iVar2, -1.0f);
            this.f43071e.i(iVar4, 1.0f);
            this.f43071e.i(iVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f43071e.i(iVar, 1.0f);
            this.f43071e.i(iVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f43071e.i(iVar3, 1.0f);
            this.f43071e.i(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f43071e.i(iVar, 1.0f);
        this.f43071e.i(iVar2, -1.0f);
        this.f43071e.i(iVar4, f13);
        this.f43071e.i(iVar3, -f13);
        return this;
    }

    public b q(i iVar, int i10) {
        if (i10 < 0) {
            this.f43068b = i10 * (-1);
            this.f43071e.i(iVar, 1.0f);
            return this;
        }
        this.f43068b = i10;
        this.f43071e.i(iVar, -1.0f);
        return this;
    }

    public b r(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f43068b = i10;
        }
        if (z10) {
            this.f43071e.i(iVar, 1.0f);
            this.f43071e.i(iVar2, -1.0f);
            return this;
        }
        this.f43071e.i(iVar, -1.0f);
        this.f43071e.i(iVar2, 1.0f);
        return this;
    }

    public b s(i iVar, int i10, i iVar2) {
        this.f43068b = i10;
        this.f43071e.i(iVar, -1.0f);
        return this;
    }

    public b t(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f43068b = i10;
        }
        if (z10) {
            this.f43071e.i(iVar, 1.0f);
            this.f43071e.i(iVar2, -1.0f);
            this.f43071e.i(iVar3, -1.0f);
            return this;
        }
        this.f43071e.i(iVar, -1.0f);
        this.f43071e.i(iVar2, 1.0f);
        this.f43071e.i(iVar3, 1.0f);
        return this;
    }

    public String toString() {
        return F();
    }

    public b u(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f43068b = i10;
        }
        if (z10) {
            this.f43071e.i(iVar, 1.0f);
            this.f43071e.i(iVar2, -1.0f);
            this.f43071e.i(iVar3, 1.0f);
            return this;
        }
        this.f43071e.i(iVar, -1.0f);
        this.f43071e.i(iVar2, 1.0f);
        this.f43071e.i(iVar3, -1.0f);
        return this;
    }

    public b v(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f43071e.i(iVar3, 0.5f);
        this.f43071e.i(iVar4, 0.5f);
        this.f43071e.i(iVar, -0.5f);
        this.f43071e.i(iVar2, -0.5f);
        this.f43068b = -f10;
        return this;
    }

    void w() {
        float f10 = this.f43068b;
        if (f10 < 0.0f) {
            this.f43068b = f10 * (-1.0f);
            this.f43071e.m();
        }
    }

    boolean x() {
        i iVar = this.f43067a;
        if (iVar != null) {
            return iVar.f43440j == i.a.UNRESTRICTED || this.f43068b >= 0.0f;
        }
        return false;
    }

    boolean y(i iVar) {
        return this.f43071e.g(iVar);
    }

    public b(c cVar) {
        boolean z10 = true | false;
        this.f43071e = new androidx.constraintlayout.core.a(this, cVar);
    }
}
