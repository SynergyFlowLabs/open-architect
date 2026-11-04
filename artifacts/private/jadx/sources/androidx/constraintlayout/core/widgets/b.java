package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f44631a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f44632b = false;

    /* JADX WARN: Code duplicated, block: B:100:0x0185  */
    /* JADX WARN: Code duplicated, block: B:102:0x018b  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[PHI: r15 r16
      0x0037: PHI (r15v27 boolean) = (r15v1 boolean), (r15v29 boolean) binds: [B:26:0x004b, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x004b, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0039 A[PHI: r15 r16
      0x0039: PHI (r15v3 boolean) = (r15v1 boolean), (r15v29 boolean) binds: [B:26:0x004b, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x004b, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:218:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:289:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:292:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:293:0x0501  */
    /* JADX WARN: Code duplicated, block: B:296:0x0507  */
    /* JADX WARN: Code duplicated, block: B:297:0x050a  */
    /* JADX WARN: Code duplicated, block: B:299:0x0510  */
    /* JADX WARN: Code duplicated, block: B:301:0x0518  */
    /* JADX WARN: Code duplicated, block: B:304:0x0522  */
    /* JADX WARN: Code duplicated, block: B:317:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0182  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [androidx.constraintlayout.core.e] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.constraintlayout.core.e] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.constraintlayout.core.widgets.e] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r5v18, types: [androidx.constraintlayout.core.i] */
    static void a(f fVar, androidx.constraintlayout.core.e eVar, int i10, int i11, c cVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        ?? r10;
        androidx.constraintlayout.core.e eVar2;
        d dVar;
        androidx.constraintlayout.core.i iVar;
        androidx.constraintlayout.core.i iVar2;
        int i12;
        d dVar2;
        androidx.constraintlayout.core.i iVar3;
        int i13;
        d[] dVarArr;
        int i14;
        d dVar3;
        d dVar4;
        androidx.constraintlayout.core.i iVar4;
        d dVar5;
        Object obj;
        int size;
        d dVar6;
        int i15;
        int i16 = i10;
        e eVar3 = cVar.f44633a;
        e eVar4 = cVar.f44635c;
        e eVar5 = cVar.f44634b;
        e eVar6 = cVar.f44636d;
        e eVar7 = cVar.f44637e;
        float f11 = cVar.f44643k;
        boolean z13 = fVar.f44705b0[i16] == e.b.WRAP_CONTENT;
        if (i16 == 0) {
            int i17 = eVar7.J0;
            z10 = i17 == 0;
            z11 = i17 == 1;
            if (i17 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            int i18 = eVar7.K0;
            z10 = i18 == 0;
            z11 = i18 == 1;
            if (i18 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        ?? r14 = eVar3;
        boolean z14 = false;
        while (true) {
            f10 = f11;
            Object obj2 = null;
            if (z14) {
                break;
            }
            d dVar7 = r14.Y[i11];
            int i19 = z12 ? 1 : 4;
            int iG = dVar7.g();
            e.b bVar = r14.f44705b0[i16];
            boolean z15 = z13;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            boolean z16 = bVar == bVar2 && r14.f44750y[i16] == 0;
            boolean z17 = z12;
            d dVar8 = dVar7.f44662f;
            if (dVar8 != null && r14 != eVar3) {
                iG += dVar8.g();
            }
            int i20 = iG;
            if (z17 && r14 != eVar3 && r14 != eVar5) {
                i19 = 8;
            }
            boolean z18 = z16;
            d dVar9 = dVar7.f44662f;
            if (dVar9 != null) {
                if (r14 == eVar5) {
                    eVar.h(dVar7.f44665i, dVar9.f44665i, i20, 6);
                } else {
                    eVar.h(dVar7.f44665i, dVar9.f44665i, i20, 8);
                }
                if (z18 && !z17) {
                    i19 = 5;
                }
                eVar.e(dVar7.f44665i, dVar7.f44662f.f44665i, i20, (r14 == eVar5 && z17 && r14.A0(i16)) ? 5 : i19);
            } else {
                z14 = z14;
                z10 = z10;
            }
            if (z15) {
                if (r14.l0() == 8 || r14.f44705b0[i16] != bVar2) {
                    i15 = 0;
                } else {
                    d[] dVarArr2 = r14.Y;
                    i15 = 0;
                    eVar.h(dVarArr2[i11 + 1].f44665i, dVarArr2[i11].f44665i, 0, 5);
                }
                eVar.h(r14.Y[i11].f44665i, fVar.Y[i11].f44665i, i15, 8);
            }
            d dVar10 = r14.Y[i11 + 1].f44662f;
            if (dVar10 != null) {
                e eVar8 = dVar10.f44660d;
                d dVar11 = eVar8.Y[i11].f44662f;
                if (dVar11 != null && dVar11.f44660d == r14) {
                    obj2 = eVar8;
                }
            }
            if (obj2 != null) {
                r14 = obj2;
                z14 = z14;
            } else {
                z14 = true;
            }
            f11 = f10;
            z13 = z15;
            z12 = z17;
            z10 = z10;
            r14 = r14;
        }
        boolean z19 = z13;
        boolean z20 = z12;
        boolean z21 = z10;
        if (eVar6 != null) {
            int i21 = i11 + 1;
            if (eVar4.Y[i21].f44662f != null) {
                d dVar12 = eVar6.Y[i21];
                if (eVar6.f44705b0[i16] == e.b.MATCH_CONSTRAINT && eVar6.f44750y[i16] == 0 && !z20) {
                    d dVar13 = dVar12.f44662f;
                    if (dVar13.f44660d == fVar) {
                        eVar.e(dVar12.f44665i, dVar13.f44665i, -dVar12.g(), 5);
                    } else if (z20) {
                        dVar6 = dVar12.f44662f;
                        if (dVar6.f44660d == fVar) {
                            eVar.e(dVar12.f44665i, dVar6.f44665i, -dVar12.g(), 4);
                        }
                    }
                } else if (z20) {
                    dVar6 = dVar12.f44662f;
                    if (dVar6.f44660d == fVar) {
                        eVar.e(dVar12.f44665i, dVar6.f44665i, -dVar12.g(), 4);
                    }
                }
                eVar.j(dVar12.f44665i, eVar4.Y[i21].f44662f.f44665i, -dVar12.g(), 6);
            }
        }
        if (z19) {
            int i22 = i11 + 1;
            androidx.constraintlayout.core.i iVar5 = fVar.Y[i22].f44665i;
            d dVar14 = eVar4.Y[i22];
            eVar.h(iVar5, dVar14.f44665i, dVar14.g(), 8);
        }
        ArrayList<e> arrayList = cVar.f44640h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f12 = (!cVar.f44650r || cVar.f44652t) ? f10 : cVar.f44642j;
            float f13 = 0.0f;
            float f14 = 0.0f;
            e eVar9 = null;
            int i23 = 0;
            while (i23 < size) {
                e eVar10 = arrayList.get(i23);
                float f15 = eVar10.N0[i16];
                if (f15 < f13) {
                    if (cVar.f44652t) {
                        d[] dVarArr3 = eVar10.Y;
                        f13 = f13;
                        eVar.e(dVarArr3[i11 + 1].f44665i, dVarArr3[i11].f44665i, 0, 4);
                    } else {
                        f15 = 1.0f;
                    }
                    arrayList = arrayList;
                    i23++;
                    f13 = f13;
                    arrayList = arrayList;
                }
                float f16 = f15;
                if (f16 == f13) {
                    d[] dVarArr4 = eVar10.Y;
                    eVar.e(dVarArr4[i11 + 1].f44665i, dVarArr4[i11].f44665i, 0, 8);
                    arrayList = arrayList;
                } else {
                    if (eVar9 != null) {
                        d[] dVarArr5 = eVar9.Y;
                        androidx.constraintlayout.core.i iVar6 = dVarArr5[i11].f44665i;
                        int i24 = i11 + 1;
                        androidx.constraintlayout.core.i iVar7 = dVarArr5[i24].f44665i;
                        d[] dVarArr6 = eVar10.Y;
                        androidx.constraintlayout.core.i iVar8 = dVarArr6[i11].f44665i;
                        androidx.constraintlayout.core.i iVar9 = dVarArr6[i24].f44665i;
                        androidx.constraintlayout.core.b bVarT = eVar.t();
                        bVarT.p(f14, f12, f16, iVar6, iVar7, iVar8, iVar9);
                        eVar.d(bVarT);
                    }
                    eVar9 = eVar10;
                    f14 = f16;
                }
                i23++;
                f13 = f13;
                arrayList = arrayList;
            }
        }
        if (eVar5 != null && (eVar5 == eVar6 || z20)) {
            d dVar15 = eVar3.Y[i11];
            int i25 = i11 + 1;
            d dVar16 = eVar4.Y[i25];
            d dVar17 = dVar15.f44662f;
            androidx.constraintlayout.core.i iVar10 = dVar17 != null ? dVar17.f44665i : null;
            d dVar18 = dVar16.f44662f;
            androidx.constraintlayout.core.i iVar11 = dVar18 != null ? dVar18.f44665i : null;
            d dVar19 = eVar5.Y[i11];
            if (eVar6 != null) {
                dVar16 = eVar6.Y[i25];
            }
            if (iVar10 != null && iVar11 != null) {
                eVar.c(dVar19.f44665i, iVar10, dVar19.g(), i16 == 0 ? eVar7.f44735q0 : eVar7.f44737r0, iVar11, dVar16.f44665i, dVar16.g(), 7);
            }
        } else {
            if (!z21 || eVar5 == null) {
                if (z11 && eVar5 != null) {
                    int i26 = cVar.f44642j;
                    boolean z22 = i26 > 0 && cVar.f44641i == i26;
                    e eVar11 = eVar5;
                    e eVar12 = eVar11;
                    while (eVar11 != null) {
                        e eVar13 = eVar11.P0[i10];
                        while (eVar13 != null && eVar13.l0() == 8) {
                            eVar13 = eVar13.P0[i10];
                        }
                        if (eVar11 != eVar5 && eVar11 != eVar6 && eVar13 != null) {
                            if (eVar13 == eVar6) {
                                eVar13 = null;
                            }
                            d dVar20 = eVar11.Y[i11];
                            androidx.constraintlayout.core.i iVar12 = dVar20.f44665i;
                            d dVar21 = dVar20.f44662f;
                            if (dVar21 != null) {
                                androidx.constraintlayout.core.i iVar13 = dVar21.f44665i;
                            }
                            int i27 = i11 + 1;
                            androidx.constraintlayout.core.i iVar14 = eVar12.Y[i27].f44665i;
                            int iG2 = dVar20.g();
                            int iG3 = eVar11.Y[i27].g();
                            if (eVar13 != null) {
                                dVar = eVar13.Y[i11];
                                iVar = dVar.f44665i;
                                d dVar22 = dVar.f44662f;
                                iVar2 = dVar22 != null ? dVar22.f44665i : null;
                            } else {
                                dVar = eVar6.Y[i11];
                                iVar = dVar != null ? dVar.f44665i : null;
                                iVar2 = eVar11.Y[i27].f44665i;
                            }
                            if (dVar != null) {
                                iG3 += dVar.g();
                            }
                            int iG4 = iG2 + eVar12.Y[i27].g();
                            int i28 = z22 ? 8 : 4;
                            if (iVar12 != null && iVar14 != null && iVar != null && iVar2 != null) {
                                eVar.c(iVar12, iVar14, iG4, 0.5f, iVar, iVar2, iG3, i28);
                            }
                            eVar13 = eVar13;
                        }
                        if (eVar11.l0() != 8) {
                            eVar12 = eVar11;
                        }
                        eVar11 = eVar13;
                    }
                    d dVar23 = eVar5.Y[i11];
                    d dVar24 = eVar3.Y[i11].f44662f;
                    int i29 = i11 + 1;
                    d dVar25 = eVar6.Y[i29];
                    d dVar26 = eVar4.Y[i29].f44662f;
                    if (dVar24 == null) {
                        r10 = eVar;
                    } else {
                        if (eVar5 != eVar6) {
                            eVar.e(dVar23.f44665i, dVar24.f44665i, dVar23.g(), 5);
                        } else if (dVar26 != null) {
                            eVar2 = eVar;
                            eVar2.c(dVar23.f44665i, dVar24.f44665i, dVar23.g(), 0.5f, dVar25.f44665i, dVar26.f44665i, dVar25.g(), 5);
                        }
                        r10 = eVar;
                    }
                    if (dVar26 != null && eVar5 != eVar6) {
                        r10.e(dVar25.f44665i, dVar26.f44665i, -dVar25.g(), 5);
                    }
                }
                if ((z21 && !z11) || eVar5 == null || eVar5 == eVar6) {
                    return;
                }
                dVarArr = eVar5.Y;
                d dVar27 = dVarArr[i11];
                if (eVar6 == null) {
                    eVar6 = eVar5;
                }
                i14 = i11 + 1;
                dVar3 = eVar6.Y[i14];
                dVar4 = dVar27.f44662f;
                if (dVar4 != null) {
                    iVar4 = dVar4.f44665i;
                } else {
                    iVar4 = null;
                }
                dVar5 = dVar3.f44662f;
                if (dVar5 != null) {
                    obj = dVar5.f44665i;
                } else {
                    obj = null;
                }
                if (eVar4 != eVar6) {
                    d dVar28 = eVar4.Y[i14].f44662f;
                    obj = dVar28 != null ? dVar28.f44665i : null;
                }
                if (eVar5 == eVar6) {
                    dVar3 = dVarArr[i14];
                }
                if (iVar4 != null || obj == null) {
                }
                r10.c(dVar27.f44665i, iVar4, dVar27.g(), 0.5f, obj, dVar3.f44665i, eVar6.Y[i14].g(), 5);
                return;
            }
            int i30 = cVar.f44642j;
            boolean z23 = i30 > 0 && cVar.f44641i == i30;
            e eVar14 = eVar5;
            e eVar15 = eVar14;
            while (eVar14 != null) {
                e eVar16 = eVar14.P0[i16];
                while (true) {
                    if (eVar16 == null) {
                        i12 = 8;
                        break;
                    }
                    i12 = 8;
                    if (eVar16.l0() != 8) {
                        break;
                    } else {
                        eVar16 = eVar16.P0[i16];
                    }
                }
                if (eVar16 != null || eVar14 == eVar6) {
                    d dVar29 = eVar14.Y[i11];
                    androidx.constraintlayout.core.i iVar15 = dVar29.f44665i;
                    d dVar30 = dVar29.f44662f;
                    androidx.constraintlayout.core.i iVar16 = dVar30 != null ? dVar30.f44665i : null;
                    if (eVar15 != eVar14) {
                        iVar16 = eVar15.Y[i11 + 1].f44665i;
                    } else if (eVar14 == eVar5) {
                        d dVar31 = eVar3.Y[i11].f44662f;
                        iVar16 = dVar31 != null ? dVar31.f44665i : null;
                    }
                    int iG5 = dVar29.g();
                    int i31 = i11 + 1;
                    int iG6 = eVar14.Y[i31].g();
                    if (eVar16 != null) {
                        dVar2 = eVar16.Y[i11];
                        iVar3 = dVar2.f44665i;
                    } else {
                        dVar2 = eVar4.Y[i31].f44662f;
                        iVar3 = dVar2 != null ? dVar2.f44665i : null;
                    }
                    androidx.constraintlayout.core.i iVar17 = eVar14.Y[i31].f44665i;
                    if (dVar2 != null) {
                        iG6 += dVar2.g();
                    }
                    int iG7 = iG5 + eVar15.Y[i31].g();
                    if (iVar15 == null || iVar16 == null || iVar3 == null || iVar17 == null) {
                        i13 = 8;
                    } else {
                        if (eVar14 == eVar5) {
                            iG7 = eVar5.Y[i11].g();
                        }
                        if (eVar14 == eVar6) {
                            iG6 = eVar6.Y[i31].g();
                        }
                        eVar16 = eVar16;
                        i13 = 8;
                        eVar.c(iVar15, iVar16, iG7, 0.5f, iVar3, iVar17, iG6, z23 ? 8 : 5);
                    }
                    if (eVar14.l0() != i13) {
                        eVar15 = eVar14;
                    }
                    i16 = i10;
                    eVar14 = eVar16;
                } else {
                    i13 = i12;
                }
                if (eVar14.l0() != i13) {
                    eVar15 = eVar14;
                }
                i16 = i10;
                eVar14 = eVar16;
            }
        }
        r10 = eVar;
        if (z21) {
        }
        dVarArr = eVar5.Y;
        d dVar210 = dVarArr[i11];
        if (eVar6 == null) {
            eVar6 = eVar5;
        }
        i14 = i11 + 1;
        dVar3 = eVar6.Y[i14];
        dVar4 = dVar210.f44662f;
        if (dVar4 != null) {
            iVar4 = dVar4.f44665i;
        } else {
            iVar4 = null;
        }
        dVar5 = dVar3.f44662f;
        if (dVar5 != null) {
            obj = dVar5.f44665i;
        } else {
            obj = null;
        }
        if (eVar4 != eVar6) {
            d dVar211 = eVar4.Y[i14].f44662f;
            obj = dVar211 != null ? dVar211.f44665i : null;
        }
        if (eVar5 == eVar6) {
            dVar3 = dVarArr[i14];
        }
        if (iVar4 != null) {
        }
    }

    public static void b(f fVar, androidx.constraintlayout.core.e eVar, ArrayList<e> arrayList, int i10) {
        int i11;
        c[] cVarArr;
        int i12;
        if (i10 == 0) {
            i11 = fVar.N1;
            cVarArr = fVar.Q1;
            i12 = 0;
        } else {
            i11 = fVar.O1;
            cVarArr = fVar.P1;
            i12 = 2;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            c cVar = cVarArr[i13];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f44633a)) {
                a(fVar, eVar, i10, i12, cVar);
            }
        }
    }
}
