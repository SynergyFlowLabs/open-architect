package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.math.s;
import com.badlogic.gdx.utils.o0;
import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes3.dex */
public class a extends com.badlogic.gdx.graphics.g3d.utils.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final o0<b> f94587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f94588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f94589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f94590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f94591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f94592k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f94593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f94594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f94595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f94596o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f94597p;

    /* JADX INFO: renamed from: com.badlogic.gdx.graphics.g3d.utils.a$a, reason: collision with other inner class name */
    class C0843a extends o0<b> {
        C0843a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.badlogic.gdx.utils.o0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b e() {
            return new b();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f94599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public com.badlogic.gdx.graphics.g3d.model.a f94600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f94601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f94602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f94603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f94604f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f94605g;

        protected b() {
        }

        protected float a(float f10) {
            int iAbs;
            c cVar;
            if (this.f94605g == 0 || this.f94600b == null) {
                return f10;
            }
            float f11 = this.f94601c * f10;
            if (s.p(this.f94604f)) {
                iAbs = 1;
            } else {
                float f12 = this.f94602d + f11;
                this.f94602d = f12;
                iAbs = (int) Math.abs(f12 / this.f94604f);
                if (this.f94602d < 0.0f) {
                    iAbs++;
                    while (true) {
                        float f13 = this.f94602d;
                        if (f13 >= 0.0f) {
                            break;
                        }
                        this.f94602d = f13 + this.f94604f;
                    }
                }
                this.f94602d = Math.abs(this.f94602d % this.f94604f);
            }
            for (int i10 = 0; i10 < iAbs; i10++) {
                int i11 = this.f94605g;
                if (i11 > 0) {
                    this.f94605g = i11 - 1;
                }
                if (this.f94605g != 0 && (cVar = this.f94599a) != null) {
                    cVar.b(this);
                }
                if (this.f94605g == 0) {
                    float f14 = this.f94604f;
                    float f15 = ((iAbs - 1) - i10) * f14;
                    float f16 = this.f94602d;
                    if (f11 < 0.0f) {
                        f16 = f14 - f16;
                    }
                    float f17 = f15 + f16;
                    this.f94602d = f11 >= 0.0f ? f14 : 0.0f;
                    c cVar2 = this.f94599a;
                    if (cVar2 != null) {
                        cVar2.a(this);
                    }
                    return f17;
                }
            }
            return 0.0f;
        }
    }

    public interface c {
        void a(b bVar);

        void b(b bVar);
    }

    public a(com.badlogic.gdx.graphics.g3d.g gVar) {
        super(gVar);
        this.f94587f = new C0843a();
        this.f94597p = false;
    }

    private b A(b bVar) {
        return z(bVar.f94600b, bVar.f94603e, bVar.f94604f, bVar.f94605g, bVar.f94601c, bVar.f94599a);
    }

    private b B(String str, float f10, float f11, int i10, float f12, c cVar) {
        if (str == null) {
            return null;
        }
        com.badlogic.gdx.graphics.g3d.model.a aVarU = this.f94610c.u(str);
        if (aVarU != null) {
            return z(aVarU, f10, f11, i10, f12, cVar);
        }
        throw new t("Unknown animation: " + str);
    }

    private b z(com.badlogic.gdx.graphics.g3d.model.a aVar, float f10, float f11, int i10, float f12, c cVar) {
        if (aVar == null) {
            return null;
        }
        b bVarF = this.f94587f.f();
        bVarF.f94600b = aVar;
        bVarF.f94599a = cVar;
        bVarF.f94605g = i10;
        bVarF.f94601c = f12;
        bVarF.f94603e = f10;
        if (f11 < 0.0f) {
            f11 = aVar.f94433b - f10;
        }
        bVarF.f94604f = f11;
        bVarF.f94602d = f12 < 0.0f ? f11 : 0.0f;
        return bVarF;
    }

    protected b C(com.badlogic.gdx.graphics.g3d.model.a aVar, float f10, float f11, int i10, float f12, c cVar, float f13) {
        return D(z(aVar, f10, f11, i10, f12, cVar), f13);
    }

    protected b D(b bVar, float f10) {
        b bVar2 = this.f94588g;
        if (bVar2 == null || bVar2.f94605g == 0) {
            t(bVar, f10);
            return bVar;
        }
        b bVar3 = this.f94589h;
        if (bVar3 != null) {
            this.f94587f.b(bVar3);
        }
        this.f94589h = bVar;
        this.f94590i = f10;
        b bVar4 = this.f94588g;
        if (bVar4.f94605g < 0) {
            bVar4.f94605g = 1;
        }
        return bVar;
    }

    public b E(String str, float f10, float f11, int i10, float f12, c cVar, float f13) {
        return D(B(str, f10, f11, i10, f12, cVar), f13);
    }

    public b F(String str, int i10, float f10, c cVar, float f11) {
        return E(str, 0.0f, -1.0f, i10, f10, cVar, f11);
    }

    protected b G(com.badlogic.gdx.graphics.g3d.model.a aVar, float f10, float f11, int i10, float f12, c cVar) {
        return H(z(aVar, f10, f11, i10, f12, cVar));
    }

    protected b H(b bVar) {
        b bVar2 = this.f94588g;
        if (bVar2 == null) {
            this.f94588g = bVar;
        } else {
            if (this.f94596o || bVar == null || bVar2.f94600b != bVar.f94600b) {
                n(bVar2.f94600b);
            } else {
                bVar.f94602d = bVar2.f94602d;
            }
            this.f94587f.b(this.f94588g);
            this.f94588g = bVar;
        }
        this.f94597p = true;
        return bVar;
    }

    public b I(String str) {
        return L(str, 1, 1.0f, null);
    }

    public b J(String str, float f10, float f11, int i10, float f12, c cVar) {
        return H(B(str, f10, f11, i10, f12, cVar));
    }

    public b K(String str, int i10) {
        return L(str, i10, 1.0f, null);
    }

    public b L(String str, int i10, float f10, c cVar) {
        return J(str, 0.0f, -1.0f, i10, f10, cVar);
    }

    public b M(String str, int i10, c cVar) {
        return L(str, i10, 1.0f, cVar);
    }

    public b N(String str, c cVar) {
        return L(str, 1, 1.0f, cVar);
    }

    public void O(float f10) {
        b bVar;
        if (!this.f94595n) {
            b bVar2 = this.f94591j;
            if (bVar2 != null) {
                float f11 = this.f94592k + f10;
                this.f94592k = f11;
                if (f11 >= this.f94593l) {
                    n(bVar2.f94600b);
                    this.f94597p = true;
                    this.f94587f.b(this.f94591j);
                    this.f94591j = null;
                }
            }
            if (this.f94597p) {
                this.f94610c.l();
                this.f94597p = false;
            }
            b bVar3 = this.f94588g;
            if (bVar3 != null && bVar3.f94605g != 0 && bVar3.f94600b != null) {
                float fA = bVar3.a(f10);
                if (fA != 0.0f && (bVar = this.f94589h) != null) {
                    this.f94594m = false;
                    t(bVar, this.f94590i);
                    this.f94589h = null;
                    O(fA);
                    return;
                }
                b bVar4 = this.f94591j;
                if (bVar4 != null) {
                    com.badlogic.gdx.graphics.g3d.model.a aVar = bVar4.f94600b;
                    float f12 = bVar4.f94603e + bVar4.f94602d;
                    b bVar5 = this.f94588g;
                    d(aVar, f12, bVar5.f94600b, bVar5.f94603e + bVar5.f94602d, this.f94592k / this.f94593l);
                    return;
                }
                b bVar6 = this.f94588g;
                b(bVar6.f94600b, bVar6.f94603e + bVar6.f94602d);
            }
        }
    }

    protected b o(com.badlogic.gdx.graphics.g3d.model.a aVar, float f10, float f11, int i10, float f12, c cVar, float f13) {
        return p(z(aVar, f10, f11, i10, f12, cVar), f13);
    }

    protected b p(b bVar, float f10) {
        if (bVar.f94605g < 0) {
            throw new t("An action cannot be continuous");
        }
        b bVar2 = this.f94588g;
        if (bVar2 == null || bVar2.f94605g == 0) {
            t(bVar, f10);
            return bVar;
        }
        b bVarA = this.f94594m ? null : A(bVar2);
        this.f94594m = false;
        t(bVar, f10);
        this.f94594m = true;
        if (bVarA != null) {
            D(bVarA, f10);
        }
        return bVar;
    }

    public b q(String str, float f10, float f11, int i10, float f12, c cVar, float f13) {
        return p(B(str, f10, f11, i10, f12, cVar), f13);
    }

    public b r(String str, int i10, float f10, c cVar, float f11) {
        return q(str, 0.0f, -1.0f, i10, f10, cVar, f11);
    }

    protected b s(com.badlogic.gdx.graphics.g3d.model.a aVar, float f10, float f11, int i10, float f12, c cVar, float f13) {
        return t(z(aVar, f10, f11, i10, f12, cVar), f13);
    }

    protected b t(b bVar, float f10) {
        b bVar2 = this.f94588g;
        if (bVar2 == null) {
            this.f94588g = bVar;
            return bVar;
        }
        if (this.f94594m) {
            D(bVar, f10);
            return bVar;
        }
        if (!this.f94596o && bVar != null && bVar2.f94600b == bVar.f94600b) {
            bVar.f94602d = bVar2.f94602d;
            this.f94587f.b(bVar2);
            this.f94588g = bVar;
            return bVar;
        }
        b bVar3 = this.f94591j;
        if (bVar3 != null) {
            n(bVar3.f94600b);
            this.f94587f.b(this.f94591j);
        }
        this.f94591j = this.f94588g;
        this.f94588g = bVar;
        this.f94592k = 0.0f;
        this.f94593l = f10;
        return bVar;
    }

    public b u(String str, float f10) {
        return w(str, 1, 1.0f, null, f10);
    }

    public b v(String str, float f10, float f11, int i10, float f12, c cVar, float f13) {
        return t(B(str, f10, f11, i10, f12, cVar), f13);
    }

    public b w(String str, int i10, float f10, c cVar, float f11) {
        return v(str, 0.0f, -1.0f, i10, f10, cVar, f11);
    }

    public b x(String str, int i10, c cVar, float f10) {
        return w(str, i10, 1.0f, cVar, f10);
    }

    public b y(String str, c cVar, float f10) {
        return w(str, 1, 1.0f, cVar, f10);
    }
}
