package w9;

import com.google.zxing.m;
import com.google.zxing.t;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f385935b = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f385936a;

    public b(com.google.zxing.common.b bVar) {
        this.f385936a = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:41:0x0065  */
    /* JADX WARN: Code duplicated, block: B:69:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x003a A[EDGE_INSN: B:70:0x003a->B:22:0x003a BREAK  A[LOOP:1: B:13:0x0023->B:74:0x0023], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x003a A[EDGE_INSN: B:71:0x003a->B:22:0x003a BREAK  A[LOOP:1: B:13:0x0023->B:74:0x0023], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x002b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x003a A[EDGE_INSN: B:73:0x003a->B:22:0x003a BREAK  A[LOOP:1: B:13:0x0023->B:74:0x0023], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0077 A[EDGE_INSN: B:87:0x0077->B:48:0x0077 BREAK  A[LOOP:3: B:39:0x0061->B:92:0x0061], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0077 A[EDGE_INSN: B:89:0x0077->B:48:0x0077 BREAK  A[LOOP:3: B:39:0x0061->B:92:0x0061], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0077 A[EDGE_INSN: B:91:0x0077->B:48:0x0077 BREAK  A[LOOP:3: B:39:0x0061->B:92:0x0061], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0061 A[SYNTHETIC] */
    private int[] a(int i10, int i11, int i12, int i13, boolean z10) {
        int i14;
        com.google.zxing.common.b bVar;
        int i15;
        com.google.zxing.common.b bVar2;
        int i16 = (i12 + i13) / 2;
        int i17 = i16;
        while (i17 >= i12) {
            com.google.zxing.common.b bVar3 = this.f385936a;
            if (z10) {
                if (!bVar3.e(i17, i10)) {
                    i15 = i17;
                    while (true) {
                        i15--;
                        if (i15 >= i12) {
                            break;
                        }
                        bVar2 = this.f385936a;
                        if (z10) {
                            if (bVar2.e(i15, i10)) {
                                break;
                            }
                        } else if (bVar2.e(i10, i15)) {
                            break;
                        }
                    }
                    int i18 = i17 - i15;
                    if (i15 >= i12 || i18 > i11) {
                        break;
                        break;
                    }
                    i17 = i15;
                } else {
                    i17--;
                }
            } else if (bVar3.e(i10, i17)) {
                i17--;
            } else {
                i15 = i17;
                while (true) {
                    i15--;
                    if (i15 >= i12) {
                        break;
                        break;
                    }
                    bVar2 = this.f385936a;
                    if (z10) {
                        if (bVar2.e(i15, i10)) {
                            break;
                            break;
                        }
                    } else if (bVar2.e(i10, i15)) {
                        break;
                        break;
                    }
                }
                int i19 = i17 - i15;
                if (i15 >= i12) {
                    break;
                }
                i17 = i15;
            }
        }
        int i20 = i17 + 1;
        while (i16 < i13) {
            com.google.zxing.common.b bVar4 = this.f385936a;
            if (!z10) {
                if (!bVar4.e(i10, i16)) {
                    i14 = i16;
                    while (true) {
                        i14++;
                        if (i14 < i13) {
                            break;
                            break;
                        }
                        bVar = this.f385936a;
                        if (z10) {
                            if (bVar.e(i14, i10)) {
                                break;
                                break;
                            }
                        } else if (bVar.e(i10, i14)) {
                            break;
                            break;
                        }
                    }
                    int i21 = i14 - i16;
                    if (i14 >= i13) {
                        break;
                    }
                    break;
                    break;
                }
                i16++;
            } else if (bVar4.e(i16, i10)) {
                i16++;
            } else {
                i14 = i16;
                while (true) {
                    i14++;
                    if (i14 < i13) {
                        break;
                    }
                    bVar = this.f385936a;
                    if (z10) {
                        if (bVar.e(i14, i10)) {
                            break;
                        }
                    } else if (bVar.e(i10, i14)) {
                        break;
                    }
                }
                int i22 = i14 - i16;
                if (i14 >= i13 || i22 > i11) {
                    break;
                }
                i16 = i14;
            }
        }
        int i23 = i16 - 1;
        if (i23 > i20) {
            return new int[]{i20, i23};
        }
        return null;
    }

    private t c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) throws m {
        int[] iArr = null;
        int i19 = i10;
        int i20 = i14;
        while (i20 < i17 && i20 >= i16 && i19 < i13 && i19 >= i12) {
            int[] iArrA = i11 == 0 ? a(i20, i18, i12, i13, true) : a(i19, i18, i16, i17, false);
            if (iArrA == null) {
                if (iArr == null) {
                    throw m.a();
                }
                if (i11 == 0) {
                    int i21 = i20 - i15;
                    int i22 = iArr[0];
                    if (i22 >= i10) {
                        return new t(iArr[1], i21);
                    }
                    if (iArr[1] > i10) {
                        return new t(iArr[i15 <= 0 ? (char) 1 : (char) 0], i21);
                    }
                    return new t(i22, i21);
                }
                int i23 = i19 - i11;
                int i24 = iArr[0];
                if (i24 >= i14) {
                    return new t(i23, iArr[1]);
                }
                if (iArr[1] > i14) {
                    return new t(i23, iArr[i11 >= 0 ? (char) 1 : (char) 0]);
                }
                return new t(i23, i24);
            }
            i20 += i15;
            i19 += i11;
            iArr = iArrA;
        }
        throw m.a();
    }

    public t[] b() throws m {
        int iH = this.f385936a.h();
        int iL = this.f385936a.l();
        int i10 = iH / 2;
        int i11 = iL / 2;
        int iMax = Math.max(1, iH / 256);
        int iMax2 = Math.max(1, iL / 256);
        int i12 = -iMax;
        int i13 = i11 / 2;
        int iD = ((int) c(i11, 0, 0, iL, i10, i12, 0, iH, i13).d()) - 1;
        int i14 = i10 / 2;
        t tVarC = c(i11, -iMax2, 0, iL, i10, 0, iD, iH, i14);
        int iC = ((int) tVarC.c()) - 1;
        t tVarC2 = c(i11, iMax2, iC, iL, i10, 0, iD, iH, i14);
        int iC2 = ((int) tVarC2.c()) + 1;
        t tVarC3 = c(i11, 0, iC, iC2, i10, iMax, iD, iH, i13);
        return new t[]{c(i11, 0, iC, iC2, i10, i12, iD, ((int) tVarC3.d()) + 1, i11 / 4), tVarC, tVarC2, tVarC3};
    }
}
