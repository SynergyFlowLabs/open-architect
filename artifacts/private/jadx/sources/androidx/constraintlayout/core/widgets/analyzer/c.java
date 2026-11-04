package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class c extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ArrayList<p> f44539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f44540l;

    public c(androidx.constraintlayout.core.widgets.e eVar, int i10) {
        super(eVar);
        this.f44539k = new ArrayList<>();
        this.f44620f = i10;
        u();
    }

    private void u() {
        androidx.constraintlayout.core.widgets.e eVar;
        androidx.constraintlayout.core.widgets.e eVar2 = this.f44616b;
        androidx.constraintlayout.core.widgets.e eVarV = eVar2.V(this.f44620f);
        while (true) {
            androidx.constraintlayout.core.widgets.e eVar3 = eVarV;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                eVarV = eVar2.V(this.f44620f);
            }
        }
        this.f44616b = eVar;
        this.f44539k.add(eVar.a0(this.f44620f));
        androidx.constraintlayout.core.widgets.e eVarR = eVar.R(this.f44620f);
        while (eVarR != null) {
            this.f44539k.add(eVarR.a0(this.f44620f));
            eVarR = eVarR.R(this.f44620f);
        }
        for (p pVar : this.f44539k) {
            int i10 = this.f44620f;
            if (i10 == 0) {
                pVar.f44616b.f44706c = this;
            } else if (i10 == 1) {
                pVar.f44616b.f44708d = this;
            }
        }
        if (this.f44620f == 0 && ((androidx.constraintlayout.core.widgets.f) this.f44616b.U()).P2() && this.f44539k.size() > 1) {
            ArrayList<p> arrayList = this.f44539k;
            this.f44616b = arrayList.get(arrayList.size() - 1).f44616b;
        }
        this.f44540l = this.f44620f == 0 ? this.f44616b.G() : this.f44616b.i0();
    }

    private androidx.constraintlayout.core.widgets.e v() {
        for (int i10 = 0; i10 < this.f44539k.size(); i10++) {
            p pVar = this.f44539k.get(i10);
            if (pVar.f44616b.l0() != 8) {
                return pVar.f44616b;
            }
        }
        return null;
    }

    private androidx.constraintlayout.core.widgets.e w() {
        for (int size = this.f44539k.size() - 1; size >= 0; size--) {
            p pVar = this.f44539k.get(size);
            if (pVar.f44616b.l0() != 8) {
                return pVar.f44616b;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0166  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        int i10;
        int i11;
        boolean z10;
        float f10;
        float f11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f12;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        if (this.f44622h.f44561j && this.f44623i.f44561j) {
            androidx.constraintlayout.core.widgets.e eVarU = this.f44616b.U();
            boolean zP2 = eVarU instanceof androidx.constraintlayout.core.widgets.f ? ((androidx.constraintlayout.core.widgets.f) eVarU).P2() : false;
            int i20 = this.f44623i.f44558g - this.f44622h.f44558g;
            int size = this.f44539k.size();
            int i21 = 0;
            while (true) {
                i10 = -1;
                i11 = 8;
                if (i21 >= size) {
                    i21 = -1;
                    break;
                } else if (this.f44539k.get(i21).f44616b.l0() != 8) {
                    break;
                } else {
                    i21++;
                }
            }
            int i22 = size - 1;
            for (int i23 = i22; i23 >= 0; i23--) {
                if (this.f44539k.get(i23).f44616b.l0() != 8) {
                    i10 = i23;
                    break;
                }
            }
            int i24 = 0;
            while (true) {
                if (i24 >= 2) {
                    z10 = zP2;
                    f10 = 0.0f;
                    f11 = 0.0f;
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                    break;
                }
                int i25 = 0;
                i13 = 0;
                i14 = 0;
                int i26 = 0;
                f11 = 0.0f;
                while (i25 < size) {
                    p pVar = this.f44539k.get(i25);
                    if (pVar.f44616b.l0() == i11) {
                        z11 = zP2;
                    } else {
                        i26++;
                        if (i25 > 0 && i25 >= i21) {
                            i13 += pVar.f44622h.f44557f;
                        }
                        g gVar = pVar.f44619e;
                        int i27 = gVar.f44558g;
                        boolean z12 = pVar.f44618d != androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
                        if (z12) {
                            int i28 = this.f44620f;
                            if (i28 == 0 && !pVar.f44616b.f44710e.f44619e.f44561j) {
                                return;
                            }
                            if (i28 == 1 && !pVar.f44616b.f44712f.f44619e.f44561j) {
                                return;
                            } else {
                                z11 = zP2;
                            }
                        } else {
                            z11 = zP2;
                            if (pVar.f44615a == 1 && i24 == 0) {
                                i27 = gVar.f44573m;
                                i14++;
                            } else if (gVar.f44561j) {
                            }
                            z12 = true;
                        }
                        if (z12) {
                            i13 += i27;
                        } else {
                            i14++;
                            float f13 = pVar.f44616b.N0[this.f44620f];
                            if (f13 >= 0.0f) {
                                f11 += f13;
                            }
                        }
                        if (i25 < i22 && i25 < i10) {
                            i13 += -pVar.f44623i.f44557f;
                        }
                    }
                    i25++;
                    zP2 = z11;
                    i11 = 8;
                }
                z10 = zP2;
                f10 = 0.0f;
                if (i13 < i20 || i14 == 0) {
                    i12 = i26;
                    break;
                } else {
                    i24++;
                    zP2 = z10;
                    i11 = 8;
                }
            }
            int i29 = this.f44622h.f44558g;
            if (z10) {
                i29 = this.f44623i.f44558g;
            }
            float f14 = 0.5f;
            if (i13 > i20) {
                i29 = z10 ? i29 + ((int) (((i13 - i20) / 2.0f) + 0.5f)) : i29 - ((int) (((i13 - i20) / 2.0f) + 0.5f));
            }
            if (i14 > 0) {
                float f15 = i20 - i13;
                int i30 = (int) ((f15 / i14) + 0.5f);
                int i31 = 0;
                int i32 = 0;
                while (i31 < size) {
                    p pVar2 = this.f44539k.get(i31);
                    float f16 = f14;
                    int i33 = i29;
                    if (pVar2.f44616b.l0() != 8 && pVar2.f44618d == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
                        g gVar2 = pVar2.f44619e;
                        if (gVar2.f44561j) {
                            i30 = i30;
                            i32 = i32;
                        } else {
                            int i34 = f11 > f10 ? (int) (((pVar2.f44616b.N0[this.f44620f] * f15) / f11) + f16) : i30;
                            if (this.f44620f == 0) {
                                androidx.constraintlayout.core.widgets.e eVar = pVar2.f44616b;
                                i18 = eVar.A;
                                i19 = eVar.f44752z;
                            } else {
                                androidx.constraintlayout.core.widgets.e eVar2 = pVar2.f44616b;
                                i18 = eVar2.D;
                                i19 = eVar2.C;
                            }
                            int i35 = i32;
                            int iMax = Math.max(i19, pVar2.f44615a == 1 ? Math.min(i34, gVar2.f44573m) : i34);
                            if (i18 > 0) {
                                iMax = Math.min(i18, iMax);
                            }
                            if (iMax != i34) {
                                i32 = i35 + 1;
                                i34 = iMax;
                            } else {
                                i32 = i35;
                            }
                            pVar2.f44619e.e(i34);
                        }
                    } else {
                        i30 = i30;
                        i32 = i32;
                    }
                    i31++;
                    f14 = f16;
                    i29 = i33;
                    f15 = f15;
                    i30 = i30;
                }
                i15 = i29;
                f12 = f14;
                int i36 = i32;
                if (i36 > 0) {
                    i14 -= i36;
                    i13 = 0;
                    for (int i37 = 0; i37 < size; i37++) {
                        p pVar3 = this.f44539k.get(i37);
                        if (pVar3.f44616b.l0() != 8) {
                            if (i37 > 0 && i37 >= i21) {
                                i13 += pVar3.f44622h.f44557f;
                            }
                            i13 += pVar3.f44619e.f44558g;
                            if (i37 < i22 && i37 < i10) {
                                i13 += -pVar3.f44623i.f44557f;
                            }
                        }
                    }
                }
                i17 = 2;
                if (this.f44540l == 2 && i36 == 0) {
                    i16 = 0;
                    this.f44540l = 0;
                } else {
                    i16 = 0;
                }
            } else {
                i15 = i29;
                f12 = 0.5f;
                i16 = 0;
                i17 = 2;
            }
            if (i13 > i20) {
                this.f44540l = i17;
            }
            if (i12 > 0 && i14 == 0 && i21 == i10) {
                this.f44540l = i17;
            }
            int i38 = this.f44540l;
            if (i38 == 1) {
                int i39 = i12 > 1 ? (i20 - i13) / (i12 - 1) : i12 == 1 ? (i20 - i13) / 2 : i16;
                if (i14 > 0) {
                    i39 = i16;
                }
                int i40 = i15;
                while (i16 < size) {
                    p pVar4 = this.f44539k.get(z10 ? size - (i16 + 1) : i16);
                    if (pVar4.f44616b.l0() == 8) {
                        pVar4.f44622h.e(i40);
                        pVar4.f44623i.e(i40);
                    } else {
                        if (i16 > 0) {
                            i40 = z10 ? i40 - i39 : i40 + i39;
                        }
                        if (i16 > 0 && i16 >= i21) {
                            i40 = z10 ? i40 - pVar4.f44622h.f44557f : i40 + pVar4.f44622h.f44557f;
                        }
                        if (z10) {
                            pVar4.f44623i.e(i40);
                        } else {
                            pVar4.f44622h.e(i40);
                        }
                        g gVar3 = pVar4.f44619e;
                        int i41 = gVar3.f44558g;
                        if (pVar4.f44618d == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT && pVar4.f44615a == 1) {
                            i41 = gVar3.f44573m;
                        }
                        i40 = z10 ? i40 - i41 : i40 + i41;
                        if (z10) {
                            pVar4.f44622h.e(i40);
                        } else {
                            pVar4.f44623i.e(i40);
                        }
                        pVar4.f44621g = true;
                        if (i16 < i22 && i16 < i10) {
                            i40 = z10 ? i40 - (-pVar4.f44623i.f44557f) : i40 + (-pVar4.f44623i.f44557f);
                        }
                    }
                    i16++;
                }
                return;
            }
            if (i38 == 0) {
                int i42 = (i20 - i13) / (i12 + 1);
                if (i14 > 0) {
                    i42 = i16;
                }
                int i43 = i15;
                while (i16 < size) {
                    p pVar5 = this.f44539k.get(z10 ? size - (i16 + 1) : i16);
                    if (pVar5.f44616b.l0() == 8) {
                        pVar5.f44622h.e(i43);
                        pVar5.f44623i.e(i43);
                    } else {
                        int i44 = z10 ? i43 - i42 : i43 + i42;
                        if (i16 > 0 && i16 >= i21) {
                            i44 = z10 ? i44 - pVar5.f44622h.f44557f : i44 + pVar5.f44622h.f44557f;
                        }
                        if (z10) {
                            pVar5.f44623i.e(i44);
                        } else {
                            pVar5.f44622h.e(i44);
                        }
                        g gVar4 = pVar5.f44619e;
                        int iMin = gVar4.f44558g;
                        if (pVar5.f44618d == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT && pVar5.f44615a == 1) {
                            iMin = Math.min(iMin, gVar4.f44573m);
                        }
                        i43 = z10 ? i44 - iMin : i44 + iMin;
                        if (z10) {
                            pVar5.f44622h.e(i43);
                        } else {
                            pVar5.f44623i.e(i43);
                        }
                        if (i16 < i22 && i16 < i10) {
                            i43 = z10 ? i43 - (-pVar5.f44623i.f44557f) : i43 + (-pVar5.f44623i.f44557f);
                        }
                    }
                    i16++;
                }
                return;
            }
            if (i38 == 2) {
                float fE = this.f44620f == 0 ? this.f44616b.E() : this.f44616b.g0();
                if (z10) {
                    fE = 1.0f - fE;
                }
                int i45 = (int) (((i20 - i13) * fE) + f12);
                if (i45 < 0 || i14 > 0) {
                    i45 = i16;
                }
                int i46 = z10 ? i15 - i45 : i15 + i45;
                while (i16 < size) {
                    p pVar6 = this.f44539k.get(z10 ? size - (i16 + 1) : i16);
                    if (pVar6.f44616b.l0() == 8) {
                        pVar6.f44622h.e(i46);
                        pVar6.f44623i.e(i46);
                    } else {
                        if (i16 > 0 && i16 >= i21) {
                            i46 = z10 ? i46 - pVar6.f44622h.f44557f : i46 + pVar6.f44622h.f44557f;
                        }
                        if (z10) {
                            pVar6.f44623i.e(i46);
                        } else {
                            pVar6.f44622h.e(i46);
                        }
                        g gVar5 = pVar6.f44619e;
                        int i47 = gVar5.f44558g;
                        if (pVar6.f44618d == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT && pVar6.f44615a == 1) {
                            i47 = gVar5.f44573m;
                        }
                        i46 = z10 ? i46 - i47 : i46 + i47;
                        if (z10) {
                            pVar6.f44622h.e(i46);
                        } else {
                            pVar6.f44623i.e(i46);
                        }
                        if (i16 < i22 && i16 < i10) {
                            i46 = z10 ? i46 - (-pVar6.f44623i.f44557f) : i46 + (-pVar6.f44623i.f44557f);
                        }
                    }
                    i16++;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void d() {
        Iterator<p> it = this.f44539k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f44539k.size();
        if (size < 1) {
            return;
        }
        androidx.constraintlayout.core.widgets.e eVar = this.f44539k.get(0).f44616b;
        androidx.constraintlayout.core.widgets.e eVar2 = this.f44539k.get(size - 1).f44616b;
        if (this.f44620f == 0) {
            androidx.constraintlayout.core.widgets.d dVar = eVar.Q;
            androidx.constraintlayout.core.widgets.d dVar2 = eVar2.S;
            f fVarI = i(dVar, 0);
            int iG = dVar.g();
            androidx.constraintlayout.core.widgets.e eVarV = v();
            if (eVarV != null) {
                iG = eVarV.Q.g();
            }
            if (fVarI != null) {
                b(this.f44622h, fVarI, iG);
            }
            f fVarI2 = i(dVar2, 0);
            int iG2 = dVar2.g();
            androidx.constraintlayout.core.widgets.e eVarW = w();
            if (eVarW != null) {
                iG2 = eVarW.S.g();
            }
            if (fVarI2 != null) {
                b(this.f44623i, fVarI2, -iG2);
            }
        } else {
            androidx.constraintlayout.core.widgets.d dVar3 = eVar.R;
            androidx.constraintlayout.core.widgets.d dVar4 = eVar2.T;
            f fVarI3 = i(dVar3, 1);
            int iG3 = dVar3.g();
            androidx.constraintlayout.core.widgets.e eVarV2 = v();
            if (eVarV2 != null) {
                iG3 = eVarV2.R.g();
            }
            if (fVarI3 != null) {
                b(this.f44622h, fVarI3, iG3);
            }
            f fVarI4 = i(dVar4, 1);
            int iG4 = dVar4.g();
            androidx.constraintlayout.core.widgets.e eVarW2 = w();
            if (eVarW2 != null) {
                iG4 = eVarW2.T.g();
            }
            if (fVarI4 != null) {
                b(this.f44623i, fVarI4, -iG4);
            }
        }
        this.f44622h.f44552a = this;
        this.f44623i.f44552a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        for (int i10 = 0; i10 < this.f44539k.size(); i10++) {
            this.f44539k.get(i10).e();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void f() {
        this.f44617c = null;
        Iterator<p> it = this.f44539k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public long j() {
        int size = this.f44539k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.f44539k.get(i10);
            j10 = j10 + ((long) pVar.f44622h.f44557f) + pVar.j() + ((long) pVar.f44623i.f44557f);
        }
        return j10;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void n() {
        this.f44622h.f44561j = false;
        this.f44623i.f44561j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    boolean p() {
        int size = this.f44539k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f44539k.get(i10).p()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f44620f == 0 ? "horizontal : " : "vertical : ");
        for (p pVar : this.f44539k) {
            sb2.append("<");
            sb2.append(pVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
