package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes2.dex */
public class l extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int[] f44583k = new int[2];

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44584a;

        static {
            int[] iArr = new int[p.b.values().length];
            f44584a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44584a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44584a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(androidx.constraintlayout.core.widgets.e eVar) {
        super(eVar);
        this.f44622h.f44556e = f.a.LEFT;
        this.f44623i.f44556e = f.a.RIGHT;
        this.f44620f = 0;
    }

    private void u(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x033c  */
    /* JADX WARN: Code duplicated, block: B:127:0x034f  */
    /* JADX WARN: Code duplicated, block: B:136:0x038c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0464  */
    /* JADX WARN: Code duplicated, block: B:173:0x0476  */
    /* JADX WARN: Code duplicated, block: B:175:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01be  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c4  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        f fVar;
        f fVar2;
        f fVar3;
        f fVar4;
        int i10;
        int i11;
        float fE;
        int i12;
        int iMax;
        androidx.constraintlayout.core.widgets.e eVar;
        int iG;
        int i13;
        int iG2;
        f fVar5;
        float f10;
        float fA;
        float fA2;
        int i14;
        int i15 = a.f44584a[this.f44624j.ordinal()];
        if (i15 == 1) {
            s(dVar);
        } else if (i15 == 2) {
            r(dVar);
        } else if (i15 == 3) {
            androidx.constraintlayout.core.widgets.e eVar2 = this.f44616b;
            q(dVar, eVar2.Q, eVar2.S, 0);
            return;
        }
        if (this.f44619e.f44561j || this.f44618d != androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
            fVar = this.f44622h;
            if (fVar.f44554c) {
                fVar2 = this.f44623i;
                if (fVar2.f44554c && (!fVar.f44561j || !fVar2.f44561j || !this.f44619e.f44561j)) {
                    if (!this.f44619e.f44561j && this.f44618d == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
                        eVar = this.f44616b;
                        if (eVar.f44746w == 0 && !eVar.B0()) {
                            f fVar6 = this.f44622h.f44563l.get(0);
                            f fVar7 = this.f44623i.f44563l.get(0);
                            int i16 = fVar6.f44558g;
                            f fVar8 = this.f44622h;
                            int i17 = i16 + fVar8.f44557f;
                            int i18 = fVar7.f44558g + this.f44623i.f44557f;
                            fVar8.e(i17);
                            this.f44623i.e(i18);
                            this.f44619e.e(i18 - i17);
                            return;
                        }
                    }
                    if (!this.f44619e.f44561j && this.f44618d == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT && this.f44615a == 1 && this.f44622h.f44563l.size() > 0 && this.f44623i.f44563l.size() > 0) {
                        int iMin = Math.min((this.f44623i.f44563l.get(0).f44558g + this.f44623i.f44557f) - (this.f44622h.f44563l.get(0).f44558g + this.f44622h.f44557f), this.f44619e.f44573m);
                        androidx.constraintlayout.core.widgets.e eVar3 = this.f44616b;
                        i12 = eVar3.A;
                        iMax = Math.max(eVar3.f44752z, iMin);
                        if (i12 > 0) {
                            iMax = Math.min(i12, iMax);
                        }
                        this.f44619e.e(iMax);
                    }
                    if (this.f44619e.f44561j) {
                        fVar3 = this.f44622h.f44563l.get(0);
                        fVar4 = this.f44623i.f44563l.get(0);
                        i10 = fVar3.f44558g + this.f44622h.f44557f;
                        i11 = fVar4.f44558g + this.f44623i.f44557f;
                        fE = this.f44616b.E();
                        if (fVar3 == fVar4) {
                            i10 = fVar3.f44558g;
                            i11 = fVar4.f44558g;
                            fE = 0.5f;
                        }
                        this.f44622h.e((int) (i10 + 0.5f + (((i11 - i10) - this.f44619e.f44558g) * fE)));
                        this.f44623i.e(this.f44622h.f44558g + this.f44619e.f44558g);
                    }
                }
            }
        } else {
            androidx.constraintlayout.core.widgets.e eVar4 = this.f44616b;
            int i19 = eVar4.f44746w;
            if (i19 == 2) {
                androidx.constraintlayout.core.widgets.e eVarU = eVar4.U();
                if (eVarU != null) {
                    g gVar = eVarU.f44710e.f44619e;
                    if (gVar.f44561j) {
                        this.f44619e.e((int) ((gVar.f44558g * this.f44616b.B) + 0.5f));
                    }
                }
            } else if (i19 == 3) {
                int i20 = eVar4.f44748x;
                if (i20 == 0 || i20 == 3) {
                    n nVar = eVar4.f44712f;
                    f fVar9 = nVar.f44622h;
                    f fVar10 = nVar.f44623i;
                    boolean z10 = eVar4.Q.f44662f != null;
                    boolean z11 = eVar4.R.f44662f != null;
                    boolean z12 = eVar4.S.f44662f != null;
                    boolean z13 = eVar4.T.f44662f != null;
                    int iB = eVar4.B();
                    if (z10 && z11 && z12 && z13) {
                        float fA3 = this.f44616b.A();
                        if (fVar9.f44561j && fVar10.f44561j) {
                            f fVar11 = this.f44622h;
                            if (fVar11.f44554c && this.f44623i.f44554c) {
                                u(f44583k, this.f44622h.f44557f + fVar11.f44563l.get(0).f44558g, this.f44623i.f44563l.get(0).f44558g - this.f44623i.f44557f, fVar9.f44557f + fVar9.f44558g, fVar10.f44558g - fVar10.f44557f, fA3, iB);
                                this.f44619e.e(f44583k[0]);
                                this.f44616b.f44712f.f44619e.e(f44583k[1]);
                                return;
                            }
                        } else {
                            f fVar12 = this.f44622h;
                            if (fVar12.f44561j) {
                                f fVar13 = this.f44623i;
                                if (!fVar13.f44561j) {
                                    fVar5 = this.f44622h;
                                    if (fVar5.f44554c && this.f44623i.f44554c && fVar9.f44554c && fVar10.f44554c) {
                                        u(f44583k, this.f44622h.f44557f + fVar5.f44563l.get(0).f44558g, this.f44623i.f44563l.get(0).f44558g - this.f44623i.f44557f, fVar9.f44557f + fVar9.f44563l.get(0).f44558g, fVar10.f44563l.get(0).f44558g - fVar10.f44557f, fA3, iB);
                                        this.f44619e.e(f44583k[0]);
                                        this.f44616b.f44712f.f44619e.e(f44583k[1]);
                                    }
                                } else if (fVar9.f44554c && fVar10.f44554c) {
                                    u(f44583k, fVar12.f44558g + fVar12.f44557f, fVar13.f44558g - fVar13.f44557f, fVar9.f44557f + fVar9.f44563l.get(0).f44558g, fVar10.f44563l.get(0).f44558g - fVar10.f44557f, fA3, iB);
                                    this.f44619e.e(f44583k[0]);
                                    this.f44616b.f44712f.f44619e.e(f44583k[1]);
                                    fVar5 = this.f44622h;
                                    if (fVar5.f44554c) {
                                        u(f44583k, this.f44622h.f44557f + fVar5.f44563l.get(0).f44558g, this.f44623i.f44563l.get(0).f44558g - this.f44623i.f44557f, fVar9.f44557f + fVar9.f44563l.get(0).f44558g, fVar10.f44563l.get(0).f44558g - fVar10.f44557f, fA3, iB);
                                        this.f44619e.e(f44583k[0]);
                                        this.f44616b.f44712f.f44619e.e(f44583k[1]);
                                    }
                                }
                            } else {
                                fVar5 = this.f44622h;
                                if (fVar5.f44554c) {
                                    u(f44583k, this.f44622h.f44557f + fVar5.f44563l.get(0).f44558g, this.f44623i.f44563l.get(0).f44558g - this.f44623i.f44557f, fVar9.f44557f + fVar9.f44563l.get(0).f44558g, fVar10.f44563l.get(0).f44558g - fVar10.f44557f, fA3, iB);
                                    this.f44619e.e(f44583k[0]);
                                    this.f44616b.f44712f.f44619e.e(f44583k[1]);
                                }
                            }
                        }
                    } else if (z10 && z12) {
                        if (this.f44622h.f44554c && this.f44623i.f44554c) {
                            float fA4 = this.f44616b.A();
                            int i21 = this.f44622h.f44563l.get(0).f44558g + this.f44622h.f44557f;
                            int i22 = this.f44623i.f44563l.get(0).f44558g - this.f44623i.f44557f;
                            if (iB == -1 || iB == 0) {
                                int iG3 = g(i22 - i21, 0);
                                int i23 = (int) ((iG3 * fA4) + 0.5f);
                                int iG4 = g(i23, 1);
                                if (i23 != iG4) {
                                    iG3 = (int) ((iG4 / fA4) + 0.5f);
                                }
                                this.f44619e.e(iG3);
                                this.f44616b.f44712f.f44619e.e(iG4);
                            } else if (iB == 1) {
                                int iG5 = g(i22 - i21, 0);
                                int i24 = (int) ((iG5 / fA4) + 0.5f);
                                int iG6 = g(i24, 1);
                                if (i24 != iG6) {
                                    iG5 = (int) ((iG6 * fA4) + 0.5f);
                                }
                                this.f44619e.e(iG5);
                                this.f44616b.f44712f.f44619e.e(iG6);
                            }
                        }
                    } else if (z11 && z13) {
                        if (fVar9.f44554c && fVar10.f44554c) {
                            float fA5 = this.f44616b.A();
                            int i25 = fVar9.f44563l.get(0).f44558g + fVar9.f44557f;
                            int i26 = fVar10.f44563l.get(0).f44558g - fVar10.f44557f;
                            if (iB == -1) {
                                iG = g(i26 - i25, 1);
                                i13 = (int) ((iG / fA5) + 0.5f);
                                iG2 = g(i13, 0);
                                if (i13 != iG2) {
                                    iG = (int) ((iG2 * fA5) + 0.5f);
                                }
                                this.f44619e.e(iG2);
                                this.f44616b.f44712f.f44619e.e(iG);
                            } else if (iB == 0) {
                                int iG7 = g(i26 - i25, 1);
                                int i27 = (int) ((iG7 * fA5) + 0.5f);
                                int iG8 = g(i27, 0);
                                if (i27 != iG8) {
                                    iG7 = (int) ((iG8 / fA5) + 0.5f);
                                }
                                this.f44619e.e(iG8);
                                this.f44616b.f44712f.f44619e.e(iG7);
                            } else if (iB == 1) {
                                iG = g(i26 - i25, 1);
                                i13 = (int) ((iG / fA5) + 0.5f);
                                iG2 = g(i13, 0);
                                if (i13 != iG2) {
                                    iG = (int) ((iG2 * fA5) + 0.5f);
                                }
                                this.f44619e.e(iG2);
                                this.f44616b.f44712f.f44619e.e(iG);
                            }
                        }
                    }
                } else {
                    int iB2 = eVar4.B();
                    if (iB2 != -1) {
                        if (iB2 == 0) {
                            androidx.constraintlayout.core.widgets.e eVar5 = this.f44616b;
                            fA2 = eVar5.f44712f.f44619e.f44558g / eVar5.A();
                            i14 = (int) (fA2 + 0.5f);
                        } else if (iB2 != 1) {
                            i14 = 0;
                        } else {
                            androidx.constraintlayout.core.widgets.e eVar6 = this.f44616b;
                            f10 = eVar6.f44712f.f44619e.f44558g;
                            fA = eVar6.A();
                        }
                        this.f44619e.e(i14);
                    } else {
                        androidx.constraintlayout.core.widgets.e eVar7 = this.f44616b;
                        f10 = eVar7.f44712f.f44619e.f44558g;
                        fA = eVar7.A();
                    }
                    fA2 = f10 * fA;
                    i14 = (int) (fA2 + 0.5f);
                    this.f44619e.e(i14);
                }
            }
            fVar = this.f44622h;
            if (fVar.f44554c) {
                fVar2 = this.f44623i;
                if (fVar2.f44554c) {
                    if (!this.f44619e.f44561j) {
                        eVar = this.f44616b;
                        if (eVar.f44746w == 0) {
                            f fVar14 = this.f44622h.f44563l.get(0);
                            f fVar15 = this.f44623i.f44563l.get(0);
                            int i110 = fVar14.f44558g;
                            f fVar16 = this.f44622h;
                            int i111 = i110 + fVar16.f44557f;
                            int i112 = fVar15.f44558g + this.f44623i.f44557f;
                            fVar16.e(i111);
                            this.f44623i.e(i112);
                            this.f44619e.e(i112 - i111);
                            return;
                        }
                    }
                    if (!this.f44619e.f44561j) {
                        int iMin2 = Math.min((this.f44623i.f44563l.get(0).f44558g + this.f44623i.f44557f) - (this.f44622h.f44563l.get(0).f44558g + this.f44622h.f44557f), this.f44619e.f44573m);
                        androidx.constraintlayout.core.widgets.e eVar8 = this.f44616b;
                        i12 = eVar8.A;
                        iMax = Math.max(eVar8.f44752z, iMin2);
                        if (i12 > 0) {
                            iMax = Math.min(i12, iMax);
                        }
                        this.f44619e.e(iMax);
                    }
                    if (this.f44619e.f44561j) {
                        fVar3 = this.f44622h.f44563l.get(0);
                        fVar4 = this.f44623i.f44563l.get(0);
                        i10 = fVar3.f44558g + this.f44622h.f44557f;
                        i11 = fVar4.f44558g + this.f44623i.f44557f;
                        fE = this.f44616b.E();
                        if (fVar3 == fVar4) {
                            i10 = fVar3.f44558g;
                            i11 = fVar4.f44558g;
                            fE = 0.5f;
                        }
                        this.f44622h.e((int) (i10 + 0.5f + (((i11 - i10) - this.f44619e.f44558g) * fE)));
                        this.f44623i.e(this.f44622h.f44558g + this.f44619e.f44558g);
                    }
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
            this.f44619e.e(eVar.m0());
        }
        if (this.f44619e.f44561j) {
            androidx.constraintlayout.core.widgets.e.b bVar = this.f44618d;
            androidx.constraintlayout.core.widgets.e.b bVar2 = androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT;
            if (bVar == bVar2 && (eVarU = this.f44616b.U()) != null && (eVarU.H() == androidx.constraintlayout.core.widgets.e.b.FIXED || eVarU.H() == bVar2)) {
                b(this.f44622h, eVarU.f44710e.f44622h, this.f44616b.Q.g());
                b(this.f44623i, eVarU.f44710e.f44623i, -this.f44616b.S.g());
                return;
            }
        } else {
            androidx.constraintlayout.core.widgets.e.b bVarH = this.f44616b.H();
            this.f44618d = bVarH;
            if (bVarH != androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
                androidx.constraintlayout.core.widgets.e.b bVar3 = androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT;
                if (bVarH == bVar3 && (eVarU2 = this.f44616b.U()) != null && (eVarU2.H() == androidx.constraintlayout.core.widgets.e.b.FIXED || eVarU2.H() == bVar3)) {
                    int iM0 = (eVarU2.m0() - this.f44616b.Q.g()) - this.f44616b.S.g();
                    b(this.f44622h, eVarU2.f44710e.f44622h, this.f44616b.Q.g());
                    b(this.f44623i, eVarU2.f44710e.f44623i, -this.f44616b.S.g());
                    this.f44619e.e(iM0);
                    return;
                }
                if (this.f44618d == androidx.constraintlayout.core.widgets.e.b.FIXED) {
                    this.f44619e.e(this.f44616b.m0());
                }
            }
        }
        g gVar = this.f44619e;
        if (gVar.f44561j) {
            androidx.constraintlayout.core.widgets.e eVar2 = this.f44616b;
            if (eVar2.f44702a) {
                androidx.constraintlayout.core.widgets.d[] dVarArr = eVar2.Y;
                androidx.constraintlayout.core.widgets.d dVar = dVarArr[0];
                androidx.constraintlayout.core.widgets.d dVar2 = dVar.f44662f;
                if (dVar2 != null && dVarArr[1].f44662f != null) {
                    if (eVar2.B0()) {
                        this.f44622h.f44557f = this.f44616b.Y[0].g();
                        this.f44623i.f44557f = -this.f44616b.Y[1].g();
                        return;
                    }
                    f fVarH = h(this.f44616b.Y[0]);
                    if (fVarH != null) {
                        b(this.f44622h, fVarH, this.f44616b.Y[0].g());
                    }
                    f fVarH2 = h(this.f44616b.Y[1]);
                    if (fVarH2 != null) {
                        b(this.f44623i, fVarH2, -this.f44616b.Y[1].g());
                    }
                    this.f44622h.f44553b = true;
                    this.f44623i.f44553b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f44622h, fVarH3, this.f44616b.Y[0].g());
                        b(this.f44623i, this.f44622h, this.f44619e.f44558g);
                        return;
                    }
                    return;
                }
                androidx.constraintlayout.core.widgets.d dVar3 = dVarArr[1];
                if (dVar3.f44662f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f44623i, fVarH4, -this.f44616b.Y[1].g());
                        b(this.f44622h, this.f44623i, -this.f44619e.f44558g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof androidx.constraintlayout.core.widgets.i) || eVar2.U() == null || this.f44616b.r(androidx.constraintlayout.core.widgets.d.a.CENTER).f44662f != null) {
                    return;
                }
                b(this.f44622h, this.f44616b.U().f44710e.f44622h, this.f44616b.o0());
                b(this.f44623i, this.f44622h, this.f44619e.f44558g);
                return;
            }
        }
        if (this.f44618d == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
            androidx.constraintlayout.core.widgets.e eVar3 = this.f44616b;
            int i10 = eVar3.f44746w;
            if (i10 == 2) {
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
            } else if (i10 == 3) {
                if (eVar3.f44748x == 3) {
                    this.f44622h.f44552a = this;
                    this.f44623i.f44552a = this;
                    n nVar = eVar3.f44712f;
                    nVar.f44622h.f44552a = this;
                    nVar.f44623i.f44552a = this;
                    gVar.f44552a = this;
                    if (eVar3.D0()) {
                        this.f44619e.f44563l.add(this.f44616b.f44712f.f44619e);
                        this.f44616b.f44712f.f44619e.f44562k.add(this.f44619e);
                        n nVar2 = this.f44616b.f44712f;
                        nVar2.f44619e.f44552a = this;
                        this.f44619e.f44563l.add(nVar2.f44622h);
                        this.f44619e.f44563l.add(this.f44616b.f44712f.f44623i);
                        this.f44616b.f44712f.f44622h.f44562k.add(this.f44619e);
                        this.f44616b.f44712f.f44623i.f44562k.add(this.f44619e);
                    } else if (this.f44616b.B0()) {
                        this.f44616b.f44712f.f44619e.f44563l.add(this.f44619e);
                        this.f44619e.f44562k.add(this.f44616b.f44712f.f44619e);
                    } else {
                        this.f44616b.f44712f.f44619e.f44563l.add(this.f44619e);
                    }
                } else {
                    g gVar4 = eVar3.f44712f.f44619e;
                    gVar.f44563l.add(gVar4);
                    gVar4.f44562k.add(this.f44619e);
                    this.f44616b.f44712f.f44622h.f44562k.add(this.f44619e);
                    this.f44616b.f44712f.f44623i.f44562k.add(this.f44619e);
                    g gVar5 = this.f44619e;
                    gVar5.f44553b = true;
                    gVar5.f44562k.add(this.f44622h);
                    this.f44619e.f44562k.add(this.f44623i);
                    this.f44622h.f44563l.add(this.f44619e);
                    this.f44623i.f44563l.add(this.f44619e);
                }
            }
        }
        androidx.constraintlayout.core.widgets.e eVar4 = this.f44616b;
        androidx.constraintlayout.core.widgets.d[] dVarArr2 = eVar4.Y;
        androidx.constraintlayout.core.widgets.d dVar4 = dVarArr2[0];
        androidx.constraintlayout.core.widgets.d dVar5 = dVar4.f44662f;
        if (dVar5 != null && dVarArr2[1].f44662f != null) {
            if (eVar4.B0()) {
                this.f44622h.f44557f = this.f44616b.Y[0].g();
                this.f44623i.f44557f = -this.f44616b.Y[1].g();
                return;
            }
            f fVarH5 = h(this.f44616b.Y[0]);
            f fVarH6 = h(this.f44616b.Y[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f44624j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f44622h, fVarH7, this.f44616b.Y[0].g());
                c(this.f44623i, this.f44622h, 1, this.f44619e);
                return;
            }
            return;
        }
        androidx.constraintlayout.core.widgets.d dVar6 = dVarArr2[1];
        if (dVar6.f44662f != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f44623i, fVarH8, -this.f44616b.Y[1].g());
                c(this.f44622h, this.f44623i, -1, this.f44619e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof androidx.constraintlayout.core.widgets.i) || eVar4.U() == null) {
            return;
        }
        b(this.f44622h, this.f44616b.U().f44710e.f44622h, this.f44616b.o0());
        c(this.f44623i, this.f44622h, 1, this.f44619e);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        f fVar = this.f44622h;
        if (fVar.f44561j) {
            this.f44616b.g2(fVar.f44558g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void f() {
        this.f44617c = null;
        this.f44622h.c();
        this.f44623i.c();
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
        this.f44619e.f44561j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    boolean p() {
        return this.f44618d != androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT || this.f44616b.f44746w == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f44616b.y();
    }
}
