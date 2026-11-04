package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f45829c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f45830d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f45831e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45832f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f45833g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f45834h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f45835i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f45836j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f45837k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f45838l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f45839m = -2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f45840n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f45841o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ConstraintLayout.b f45842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    View f45843b;

    public e(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.b)) {
            throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
        }
        this.f45842a = (ConstraintLayout.b) layoutParams;
        this.f45843b = view;
    }

    private String K(int i10) {
        switch (i10) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return VerticalAlignment.BOTTOM;
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public e A(float f10) {
        this.f45842a.L = f10;
        return this;
    }

    public e B(int i10, int i11) {
        switch (i10) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.f45842a).leftMargin = i11;
                return this;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.f45842a).rightMargin = i11;
                return this;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.f45842a).topMargin = i11;
                return this;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.f45842a).bottomMargin = i11;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f45842a.setMarginStart(i11);
                return this;
            case 7:
                this.f45842a.setMarginEnd(i11);
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public e C(int i10) {
        switch (i10) {
            case 1:
                ConstraintLayout.b bVar = this.f45842a;
                bVar.f45683f = -1;
                bVar.f45681e = -1;
                ((ViewGroup.MarginLayoutParams) bVar).leftMargin = -1;
                bVar.f45717w = Integer.MIN_VALUE;
                return this;
            case 2:
                ConstraintLayout.b bVar2 = this.f45842a;
                bVar2.f45687h = -1;
                bVar2.f45685g = -1;
                ((ViewGroup.MarginLayoutParams) bVar2).rightMargin = -1;
                bVar2.f45720y = Integer.MIN_VALUE;
                return this;
            case 3:
                ConstraintLayout.b bVar3 = this.f45842a;
                bVar3.f45691j = -1;
                bVar3.f45689i = -1;
                ((ViewGroup.MarginLayoutParams) bVar3).topMargin = -1;
                bVar3.f45719x = Integer.MIN_VALUE;
                return this;
            case 4:
                ConstraintLayout.b bVar4 = this.f45842a;
                bVar4.f45693k = -1;
                bVar4.f45695l = -1;
                ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin = -1;
                bVar4.f45721z = Integer.MIN_VALUE;
                return this;
            case 5:
                this.f45842a.f45697m = -1;
                return this;
            case 6:
                ConstraintLayout.b bVar5 = this.f45842a;
                bVar5.f45709s = -1;
                bVar5.f45711t = -1;
                bVar5.setMarginStart(-1);
                this.f45842a.A = Integer.MIN_VALUE;
                return this;
            case 7:
                ConstraintLayout.b bVar6 = this.f45842a;
                bVar6.f45713u = -1;
                bVar6.f45715v = -1;
                bVar6.setMarginEnd(-1);
                this.f45842a.B = Integer.MIN_VALUE;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public e D() {
        ConstraintLayout.b bVar = this.f45842a;
        int i10 = bVar.f45683f;
        int i11 = bVar.f45685g;
        if (i10 == -1 && i11 == -1) {
            int i12 = bVar.f45709s;
            int i13 = bVar.f45713u;
            if (i12 != -1 || i13 != -1) {
                e eVar = new e(((ViewGroup) this.f45843b.getParent()).findViewById(i12));
                e eVar2 = new e(((ViewGroup) this.f45843b.getParent()).findViewById(i13));
                ConstraintLayout.b bVar2 = this.f45842a;
                if (i12 != -1 && i13 != -1) {
                    eVar.m(7, i13, 6, 0);
                    eVar2.m(6, i10, 7, 0);
                } else if (i10 != -1 || i13 != -1) {
                    int i14 = bVar2.f45687h;
                    if (i14 != -1) {
                        eVar.m(7, i14, 7, 0);
                    } else {
                        int i15 = bVar2.f45681e;
                        if (i15 != -1) {
                            eVar2.m(6, i15, 6, 0);
                        }
                    }
                }
            }
            C(6);
            C(7);
            return this;
        }
        e eVar3 = new e(((ViewGroup) this.f45843b.getParent()).findViewById(i10));
        e eVar4 = new e(((ViewGroup) this.f45843b.getParent()).findViewById(i11));
        ConstraintLayout.b bVar3 = this.f45842a;
        if (i10 != -1 && i11 != -1) {
            eVar3.m(2, i11, 1, 0);
            eVar4.m(1, i10, 2, 0);
        } else if (i10 != -1 || i11 != -1) {
            int i16 = bVar3.f45687h;
            if (i16 != -1) {
                eVar3.m(2, i16, 2, 0);
            } else {
                int i17 = bVar3.f45681e;
                if (i17 != -1) {
                    eVar4.m(1, i17, 1, 0);
                }
            }
        }
        C(1);
        C(2);
        return this;
    }

    public e E() {
        ConstraintLayout.b bVar = this.f45842a;
        int i10 = bVar.f45691j;
        int i11 = bVar.f45693k;
        if (i10 != -1 || i11 != -1) {
            e eVar = new e(((ViewGroup) this.f45843b.getParent()).findViewById(i10));
            e eVar2 = new e(((ViewGroup) this.f45843b.getParent()).findViewById(i11));
            ConstraintLayout.b bVar2 = this.f45842a;
            if (i10 != -1 && i11 != -1) {
                eVar.m(4, i11, 3, 0);
                eVar2.m(3, i10, 4, 0);
            } else if (i10 != -1 || i11 != -1) {
                int i12 = bVar2.f45695l;
                if (i12 != -1) {
                    eVar.m(4, i12, 4, 0);
                } else {
                    int i13 = bVar2.f45689i;
                    if (i13 != -1) {
                        eVar2.m(3, i13, 3, 0);
                    }
                }
            }
        }
        C(3);
        C(4);
        return this;
    }

    public e F(float f10) {
        this.f45843b.setRotation(f10);
        return this;
    }

    public e G(float f10) {
        this.f45843b.setRotationX(f10);
        return this;
    }

    public e H(float f10) {
        this.f45843b.setRotationY(f10);
        return this;
    }

    public e I(float f10) {
        this.f45843b.setScaleY(f10);
        return this;
    }

    public e J(float f10) {
        return this;
    }

    public e L(float f10, float f11) {
        this.f45843b.setPivotX(f10);
        this.f45843b.setPivotY(f11);
        return this;
    }

    public e M(float f10) {
        this.f45843b.setPivotX(f10);
        return this;
    }

    public e N(float f10) {
        this.f45843b.setPivotY(f10);
        return this;
    }

    public e O(float f10, float f11) {
        this.f45843b.setTranslationX(f10);
        this.f45843b.setTranslationY(f11);
        return this;
    }

    public e P(float f10) {
        this.f45843b.setTranslationX(f10);
        return this;
    }

    public e Q(float f10) {
        this.f45843b.setTranslationY(f10);
        return this;
    }

    public e R(float f10) {
        this.f45843b.setTranslationZ(f10);
        return this;
    }

    public e S(float f10) {
        this.f45842a.H = f10;
        return this;
    }

    public e T(int i10) {
        this.f45842a.O = i10;
        return this;
    }

    public e U(float f10) {
        this.f45842a.M = f10;
        return this;
    }

    public e V(int i10) {
        this.f45843b.setVisibility(i10);
        return this;
    }

    public e a(int i10, int i11) {
        m(1, i10, i10 == 0 ? 1 : 2, 0);
        m(2, i11, i11 == 0 ? 2 : 1, 0);
        if (i10 != 0) {
            new e(((ViewGroup) this.f45843b.getParent()).findViewById(i10)).m(2, this.f45843b.getId(), 1, 0);
        }
        if (i11 != 0) {
            new e(((ViewGroup) this.f45843b.getParent()).findViewById(i11)).m(1, this.f45843b.getId(), 2, 0);
        }
        return this;
    }

    public e b(int i10, int i11) {
        m(6, i10, i10 == 0 ? 6 : 7, 0);
        m(7, i11, i11 == 0 ? 7 : 6, 0);
        if (i10 != 0) {
            new e(((ViewGroup) this.f45843b.getParent()).findViewById(i10)).m(7, this.f45843b.getId(), 6, 0);
        }
        if (i11 != 0) {
            new e(((ViewGroup) this.f45843b.getParent()).findViewById(i11)).m(6, this.f45843b.getId(), 7, 0);
        }
        return this;
    }

    public e c(int i10, int i11) {
        m(3, i10, i10 == 0 ? 3 : 4, 0);
        m(4, i11, i11 == 0 ? 4 : 3, 0);
        if (i10 != 0) {
            new e(((ViewGroup) this.f45843b.getParent()).findViewById(i10)).m(4, this.f45843b.getId(), 3, 0);
        }
        if (i11 != 0) {
            new e(((ViewGroup) this.f45843b.getParent()).findViewById(i11)).m(3, this.f45843b.getId(), 4, 0);
        }
        return this;
    }

    public e d(float f10) {
        this.f45843b.setAlpha(f10);
        return this;
    }

    public void e() {
    }

    public e f(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        if (i12 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f10 <= 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 6 && i11 != 7) {
                m(3, i10, i11, i12);
                m(4, i13, i14, i15);
                this.f45842a.H = f10;
                return this;
            }
            m(6, i10, i11, i12);
            m(7, i13, i14, i15);
            this.f45842a.G = f10;
            return this;
        }
        m(1, i10, i11, i12);
        m(2, i13, i14, i15);
        this.f45842a.G = f10;
        return this;
    }

    public e g(int i10) {
        if (i10 == 0) {
            f(0, 1, 0, 0, 2, 0, 0.5f);
            return this;
        }
        f(i10, 2, 0, i10, 1, 0, 0.5f);
        return this;
    }

    public e h(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        m(1, i10, i11, i12);
        m(2, i13, i14, i15);
        this.f45842a.G = f10;
        return this;
    }

    public e i(int i10) {
        if (i10 == 0) {
            f(0, 6, 0, 0, 7, 0, 0.5f);
            return this;
        }
        f(i10, 7, 0, i10, 6, 0, 0.5f);
        return this;
    }

    public e j(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        m(6, i10, i11, i12);
        m(7, i13, i14, i15);
        this.f45842a.G = f10;
        return this;
    }

    public e k(int i10) {
        if (i10 == 0) {
            f(0, 3, 0, 0, 4, 0, 0.5f);
            return this;
        }
        f(i10, 4, 0, i10, 3, 0, 0.5f);
        return this;
    }

    public e l(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        m(3, i10, i11, i12);
        m(4, i13, i14, i15);
        this.f45842a.H = f10;
        return this;
    }

    public e m(int i10, int i11, int i12, int i13) {
        switch (i10) {
            case 1:
                if (i12 == 1) {
                    ConstraintLayout.b bVar = this.f45842a;
                    bVar.f45681e = i11;
                    bVar.f45683f = -1;
                } else {
                    if (i12 != 2) {
                        throw new IllegalArgumentException("Left to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.b bVar2 = this.f45842a;
                    bVar2.f45683f = i11;
                    bVar2.f45681e = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f45842a).leftMargin = i13;
                return this;
            case 2:
                if (i12 == 1) {
                    ConstraintLayout.b bVar3 = this.f45842a;
                    bVar3.f45685g = i11;
                    bVar3.f45687h = -1;
                } else {
                    if (i12 != 2) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.b bVar4 = this.f45842a;
                    bVar4.f45687h = i11;
                    bVar4.f45685g = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f45842a).rightMargin = i13;
                return this;
            case 3:
                if (i12 == 3) {
                    ConstraintLayout.b bVar5 = this.f45842a;
                    bVar5.f45689i = i11;
                    bVar5.f45691j = -1;
                    bVar5.f45697m = -1;
                    bVar5.f45699n = -1;
                    bVar5.f45701o = -1;
                } else {
                    if (i12 != 4) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.b bVar6 = this.f45842a;
                    bVar6.f45691j = i11;
                    bVar6.f45689i = -1;
                    bVar6.f45697m = -1;
                    bVar6.f45699n = -1;
                    bVar6.f45701o = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f45842a).topMargin = i13;
                return this;
            case 4:
                if (i12 == 4) {
                    ConstraintLayout.b bVar7 = this.f45842a;
                    bVar7.f45695l = i11;
                    bVar7.f45693k = -1;
                    bVar7.f45697m = -1;
                    bVar7.f45699n = -1;
                    bVar7.f45701o = -1;
                } else {
                    if (i12 != 3) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.b bVar8 = this.f45842a;
                    bVar8.f45693k = i11;
                    bVar8.f45695l = -1;
                    bVar8.f45697m = -1;
                    bVar8.f45699n = -1;
                    bVar8.f45701o = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f45842a).bottomMargin = i13;
                return this;
            case 5:
                if (i12 == 5) {
                    ConstraintLayout.b bVar9 = this.f45842a;
                    bVar9.f45697m = i11;
                    bVar9.f45695l = -1;
                    bVar9.f45693k = -1;
                    bVar9.f45689i = -1;
                    bVar9.f45691j = -1;
                } else if (i12 == 3) {
                    ConstraintLayout.b bVar10 = this.f45842a;
                    bVar10.f45699n = i11;
                    bVar10.f45695l = -1;
                    bVar10.f45693k = -1;
                    bVar10.f45689i = -1;
                    bVar10.f45691j = -1;
                } else {
                    if (i12 != 4) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.b bVar11 = this.f45842a;
                    bVar11.f45701o = i11;
                    bVar11.f45695l = -1;
                    bVar11.f45693k = -1;
                    bVar11.f45689i = -1;
                    bVar11.f45691j = -1;
                }
                this.f45842a.D = i13;
                return this;
            case 6:
                if (i12 == 6) {
                    ConstraintLayout.b bVar12 = this.f45842a;
                    bVar12.f45711t = i11;
                    bVar12.f45709s = -1;
                } else {
                    if (i12 != 7) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.b bVar13 = this.f45842a;
                    bVar13.f45709s = i11;
                    bVar13.f45711t = -1;
                }
                this.f45842a.setMarginStart(i13);
                return this;
            case 7:
                if (i12 == 7) {
                    ConstraintLayout.b bVar14 = this.f45842a;
                    bVar14.f45715v = i11;
                    bVar14.f45713u = -1;
                } else {
                    if (i12 != 6) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.b bVar15 = this.f45842a;
                    bVar15.f45713u = i11;
                    bVar15.f45715v = -1;
                }
                this.f45842a.setMarginEnd(i13);
                return this;
            default:
                throw new IllegalArgumentException(K(i10) + " to " + K(i12) + " unknown");
        }
    }

    public e n(int i10) {
        this.f45842a.Q = i10;
        return this;
    }

    public e o(int i10) {
        this.f45842a.P = i10;
        return this;
    }

    public e p(int i10) {
        ((ViewGroup.MarginLayoutParams) this.f45842a).height = i10;
        return this;
    }

    public e q(int i10) {
        this.f45842a.U = i10;
        return this;
    }

    public e r(int i10) {
        this.f45842a.T = i10;
        return this;
    }

    public e s(int i10) {
        this.f45842a.S = i10;
        return this;
    }

    public e t(int i10) {
        this.f45842a.R = i10;
        return this;
    }

    public e u(int i10) {
        ((ViewGroup.MarginLayoutParams) this.f45842a).width = i10;
        return this;
    }

    public e v(String str) {
        this.f45842a.I = str;
        return this;
    }

    public e w(float f10) {
        this.f45843b.setElevation(f10);
        return this;
    }

    public e x(int i10, int i11) {
        switch (i10) {
            case 1:
                this.f45842a.f45717w = i11;
                return this;
            case 2:
                this.f45842a.f45720y = i11;
                return this;
            case 3:
                this.f45842a.f45719x = i11;
                return this;
            case 4:
                this.f45842a.f45721z = i11;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f45842a.A = i11;
                return this;
            case 7:
                this.f45842a.B = i11;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public e y(float f10) {
        this.f45842a.G = f10;
        return this;
    }

    public e z(int i10) {
        this.f45842a.N = i10;
        return this;
    }
}
