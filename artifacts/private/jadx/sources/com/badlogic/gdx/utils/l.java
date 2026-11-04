package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes3.dex */
class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f95643g = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f95644h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f95645i = 256;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final boolean f95646j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f95647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f95648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f95649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f95650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f95651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f95652f;

    l() {
        this.f95648b = 7;
        this.f95650d = 0;
        this.f95649c = new Object[256];
        this.f95651e = new int[40];
        this.f95652f = new int[40];
    }

    private static void a(Object[] objArr, int i10, int i11, int i12) {
        if (i12 == i10) {
            i12++;
        }
        while (i12 < i11) {
            Comparable comparable = (Comparable) objArr[i12];
            int i13 = i10;
            int i14 = i12;
            while (i13 < i14) {
                int i15 = (i13 + i14) >>> 1;
                if (comparable.compareTo(objArr[i15]) < 0) {
                    i14 = i15;
                } else {
                    i13 = i15 + 1;
                }
            }
            int i16 = i12 - i13;
            if (i16 == 1) {
                objArr[i13 + 1] = objArr[i13];
            } else if (i16 != 2) {
                System.arraycopy(objArr, i13, objArr, i13 + 1, i16);
            } else {
                objArr[i13 + 2] = objArr[i13 + 1];
                objArr[i13 + 1] = objArr[i13];
            }
            objArr[i13] = comparable;
            i12++;
        }
    }

    private static int b(Object[] objArr, int i10, int i11) {
        int i12 = i10 + 1;
        if (i12 == i11) {
            return 1;
        }
        int i13 = i10 + 2;
        if (((Comparable) objArr[i12]).compareTo(objArr[i10]) < 0) {
            while (i13 < i11 && ((Comparable) objArr[i13]).compareTo(objArr[i13 - 1]) < 0) {
                i13++;
            }
            o(objArr, i10, i13);
        } else {
            while (i13 < i11 && ((Comparable) objArr[i13]).compareTo(objArr[i13 - 1]) >= 0) {
                i13++;
            }
        }
        return i13 - i10;
    }

    private Object[] d(int i10) {
        if (this.f95649c.length < i10) {
            int i11 = (i10 >> 1) | i10;
            int i12 = i11 | (i11 >> 2);
            int i13 = i12 | (i12 >> 4);
            int i14 = i13 | (i13 >> 8);
            int i15 = (i14 | (i14 >> 16)) + 1;
            if (i15 >= 0) {
                i10 = Math.min(i15, this.f95647a.length >>> 1);
            }
            this.f95649c = new Object[i10];
        }
        return this.f95649c;
    }

    private static int e(Comparable<Object> comparable, Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = i10 + i12;
        if (comparable.compareTo(objArr[i15]) > 0) {
            int i16 = i11 - i12;
            int i17 = 0;
            int i18 = 1;
            while (i18 < i16 && comparable.compareTo(objArr[i15 + i18]) > 0) {
                int i19 = (i18 << 1) + 1;
                if (i19 <= 0) {
                    i17 = i18;
                    i18 = i16;
                } else {
                    int i20 = i18;
                    i18 = i19;
                    i17 = i20;
                }
            }
            if (i18 <= i16) {
                i16 = i18;
            }
            i13 = i17 + i12;
            i14 = i16 + i12;
        } else {
            int i21 = i12 + 1;
            int i22 = 0;
            int i23 = 1;
            while (i23 < i21 && comparable.compareTo(objArr[i15 - i23]) <= 0) {
                int i24 = (i23 << 1) + 1;
                if (i24 <= 0) {
                    i22 = i23;
                    i23 = i21;
                } else {
                    int i25 = i23;
                    i23 = i24;
                    i22 = i25;
                }
            }
            if (i23 <= i21) {
                i21 = i23;
            }
            int i26 = i12 - i21;
            int i27 = i12 - i22;
            i13 = i26;
            i14 = i27;
        }
        int i28 = i13 + 1;
        while (i28 < i14) {
            int i29 = ((i14 - i28) >>> 1) + i28;
            if (comparable.compareTo(objArr[i10 + i29]) > 0) {
                i28 = i29 + 1;
            } else {
                i14 = i29;
            }
        }
        return i14;
    }

    private static int f(Comparable<Object> comparable, Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = i10 + i12;
        if (comparable.compareTo(objArr[i15]) < 0) {
            int i16 = i12 + 1;
            int i17 = 0;
            int i18 = 1;
            while (i18 < i16 && comparable.compareTo(objArr[i15 - i18]) < 0) {
                int i19 = (i18 << 1) + 1;
                if (i19 <= 0) {
                    i17 = i18;
                    i18 = i16;
                } else {
                    int i20 = i18;
                    i18 = i19;
                    i17 = i20;
                }
            }
            if (i18 <= i16) {
                i16 = i18;
            }
            i14 = i12 - i16;
            i13 = i12 - i17;
        } else {
            int i21 = i11 - i12;
            int i22 = 0;
            int i23 = 1;
            while (i23 < i21 && comparable.compareTo(objArr[i15 + i23]) >= 0) {
                int i24 = (i23 << 1) + 1;
                if (i24 <= 0) {
                    i22 = i23;
                    i23 = i21;
                } else {
                    int i25 = i23;
                    i23 = i24;
                    i22 = i25;
                }
            }
            if (i23 <= i21) {
                i21 = i23;
            }
            int i26 = i22 + i12;
            i13 = i12 + i21;
            i14 = i26;
        }
        int i27 = i14 + 1;
        while (i27 < i13) {
            int i28 = ((i13 - i27) >>> 1) + i27;
            if (comparable.compareTo(objArr[i10 + i28]) < 0) {
                i13 = i28;
            } else {
                i27 = i28 + 1;
            }
        }
        return i13;
    }

    private void g(int i10) {
        int[] iArr = this.f95651e;
        int i11 = iArr[i10];
        int[] iArr2 = this.f95652f;
        int i12 = iArr2[i10];
        int i13 = i10 + 1;
        int i14 = iArr[i13];
        int i15 = iArr2[i13];
        iArr2[i10] = i12 + i15;
        int i16 = this.f95650d;
        if (i10 == i16 - 3) {
            int i17 = i10 + 2;
            iArr[i13] = iArr[i17];
            iArr2[i13] = iArr2[i17];
        }
        this.f95650d = i16 - 1;
        Object[] objArr = this.f95647a;
        int iF = f((Comparable) objArr[i14], objArr, i11, i12, 0);
        int i18 = i11 + iF;
        int i19 = i12 - iF;
        if (i19 == 0) {
            return;
        }
        Object[] objArr2 = this.f95647a;
        int iE = e((Comparable) objArr2[(i18 + i19) - 1], objArr2, i14, i15, i15 - 1);
        if (iE == 0) {
            return;
        }
        if (i19 <= iE) {
            k(i18, i19, i14, iE);
        } else {
            j(i18, i19, i14, iE);
        }
    }

    private void h() {
        while (true) {
            int i10 = this.f95650d;
            if (i10 <= 1) {
                return;
            }
            int i11 = i10 - 2;
            if (i11 > 0) {
                int[] iArr = this.f95652f;
                int i12 = iArr[i10 - 3];
                int i13 = iArr[i11];
                int i14 = iArr[i10 - 1];
                if (i12 <= i13 + i14) {
                    if (i12 < i14) {
                        i11 = i10 - 3;
                    }
                    g(i11);
                }
            }
            int[] iArr2 = this.f95652f;
            if (iArr2[i11] > iArr2[i10 - 1]) {
                return;
            } else {
                g(i11);
            }
        }
    }

    private void i() {
        while (true) {
            int i10 = this.f95650d;
            if (i10 <= 1) {
                return;
            }
            int i11 = i10 - 2;
            if (i11 > 0) {
                int[] iArr = this.f95652f;
                if (iArr[i10 - 3] < iArr[i10 - 1]) {
                    i11 = i10 - 3;
                }
            }
            g(i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009b A[PHI: r2 r7 r8
      0x009b: PHI (r2v9 int) = (r2v8 int), (r2v15 int) binds: [B:25:0x008b, B:27:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r7v10 int) = (r7v9 int), (r7v17 int) binds: [B:25:0x008b, B:27:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r8v9 int) = (r8v8 int), (r8v11 int) binds: [B:25:0x008b, B:27:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x0107  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:63:0x0119  */
    /* JADX WARN: Code duplicated, block: B:65:0x0122 A[LOOP:2: B:24:0x007f->B:65:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0117 A[SYNTHETIC] */
    private void j(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int iE;
        int i18;
        int i19;
        boolean z10;
        boolean z11;
        int i20;
        int i21;
        int i22 = i13;
        Object[] objArr = this.f95647a;
        Object[] objArrD = d(i22);
        System.arraycopy(objArr, i12, objArrD, 0, i22);
        int i23 = i10 + i11;
        int i24 = i23 - 1;
        int i25 = i22 - 1;
        int i26 = i12 + i22;
        int i27 = i26 - 1;
        int i28 = i26 - 2;
        int i29 = i23 - 2;
        objArr[i27] = objArr[i24];
        int i30 = i11 - 1;
        if (i30 == 0) {
            System.arraycopy(objArrD, 0, objArr, i28 - i25, i22);
            return;
        }
        if (i22 == 1) {
            int i31 = i28 - i30;
            System.arraycopy(objArr, (i29 - i30) + 1, objArr, i31 + 1, i30);
            objArr[i31] = objArrD[i25];
            return;
        }
        int i32 = this.f95648b;
        loop0: while (true) {
            int i33 = 0;
            int i34 = 0;
            while (true) {
                if (((Comparable) objArrD[i25]).compareTo(objArr[i29]) >= 0) {
                    i14 = i28 - 1;
                    i15 = i25 - 1;
                    objArr[i28] = objArrD[i25];
                    i33++;
                    i22--;
                    if (i22 != 1) {
                        i28 = i14;
                        i25 = i15;
                        i34 = 0;
                    }
                    i16 = i14;
                    i25 = i15;
                    break loop0;
                }
                i16 = i28 - 1;
                int i35 = i29 - 1;
                objArr[i28] = objArr[i29];
                i34++;
                i30--;
                if (i30 == 0) {
                    i29 = i35;
                    break loop0;
                } else {
                    i28 = i16;
                    i29 = i35;
                    i33 = 0;
                }
                if ((i34 | i33) >= i32) {
                    while (true) {
                        int iF = i30 - f((Comparable) objArrD[i25], objArr, i10, i30, i30 - 1);
                        if (iF != 0) {
                            i28 -= iF;
                            i29 -= iF;
                            i30 -= iF;
                            System.arraycopy(objArr, i29 + 1, objArr, i28 + 1, iF);
                            if (i30 == 0) {
                                i16 = i28;
                                break loop0;
                            }
                            i14 = i28 - 1;
                            i15 = i25 - 1;
                            objArr[i28] = objArrD[i25];
                            i17 = i22 - 1;
                            if (i17 == 1) {
                                i22 = i17;
                                i16 = i14;
                                i25 = i15;
                                break loop0;
                            }
                            iE = i17 - e((Comparable) objArr[i29], objArrD, 0, i17, i22 - 2);
                            if (iE != 0) {
                                i20 = i14 - iE;
                                i21 = i15 - iE;
                                i17 -= iE;
                                System.arraycopy(objArrD, i21 + 1, objArr, i20 + 1, iE);
                                if (i17 <= 1) {
                                    i22 = i17;
                                    i16 = i20;
                                    i25 = i21;
                                    break loop0;
                                }
                                i14 = i20;
                                i25 = i21;
                            } else {
                                i25 = i15;
                            }
                            i18 = i14 - 1;
                            i19 = i29 - 1;
                            objArr[i14] = objArr[i29];
                            i30--;
                            if (i30 == 0) {
                                i22 = i17;
                                i16 = i18;
                                i29 = i19;
                                break loop0;
                            }
                            i32--;
                            if (iF >= 7) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (iE >= 7) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11 && !z10) {
                                if (i32 < 0) {
                                    i32 = 0;
                                }
                                i32 += 2;
                                i22 = i17;
                                i28 = i18;
                                i29 = i19;
                            } else {
                                i22 = i17;
                                i28 = i18;
                                i29 = i19;
                            }
                        } else {
                            i14 = i28 - 1;
                            i15 = i25 - 1;
                            objArr[i28] = objArrD[i25];
                            i17 = i22 - 1;
                            if (i17 == 1) {
                                i22 = i17;
                                i16 = i14;
                                i25 = i15;
                                break loop0;
                            }
                            iE = i17 - e((Comparable) objArr[i29], objArrD, 0, i17, i22 - 2);
                            if (iE != 0) {
                                i20 = i14 - iE;
                                i21 = i15 - iE;
                                i17 -= iE;
                                System.arraycopy(objArrD, i21 + 1, objArr, i20 + 1, iE);
                                if (i17 <= 1) {
                                    i22 = i17;
                                    i16 = i20;
                                    i25 = i21;
                                    break loop0;
                                }
                                i14 = i20;
                                i25 = i21;
                            } else {
                                i25 = i15;
                            }
                            i18 = i14 - 1;
                            i19 = i29 - 1;
                            objArr[i14] = objArr[i29];
                            i30--;
                            if (i30 == 0) {
                                i22 = i17;
                                i16 = i18;
                                i29 = i19;
                                break loop0;
                            }
                            i32--;
                            if (iF >= 7) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (iE >= 7) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11 && !z10) {
                                if (i32 < 0) {
                                    i32 = 0;
                                }
                                i32 += 2;
                                i22 = i17;
                                i28 = i18;
                                i29 = i19;
                            } else {
                                i22 = i17;
                                i28 = i18;
                                i29 = i19;
                            }
                        }
                    }
                }
            }
        }
        if (i32 < 1) {
            i32 = 1;
        }
        this.f95648b = i32;
        if (i22 == 1) {
            int i36 = i16 - i30;
            System.arraycopy(objArr, (i29 - i30) + 1, objArr, i36 + 1, i30);
            objArr[i36] = objArrD[i25];
        } else {
            if (i22 == 0) {
                throw new IllegalArgumentException("Comparison method violates its general contract!");
            }
            System.arraycopy(objArrD, 0, objArr, i16 - (i22 - 1), i22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b A[PHI: r3 r5 r13
      0x007b: PHI (r3v7 int) = (r3v6 int), (r3v17 int) binds: [B:25:0x006f, B:27:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r5v11 int) = (r5v10 int), (r5v18 int) binds: [B:25:0x006f, B:27:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r13v8 int) = (r13v7 int), (r13v10 int) binds: [B:25:0x006f, B:27:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ef A[LOOP:2: B:24:0x0067->B:65:0x00ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e6 A[SYNTHETIC] */
    private void k(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int iE;
        int i17;
        int i18;
        boolean z10;
        boolean z11;
        int i19;
        int i20;
        Object[] objArr = this.f95647a;
        Object[] objArrD = d(i11);
        System.arraycopy(objArr, i10, objArrD, 0, i11);
        int i21 = i10 + 1;
        int i22 = i12 + 1;
        objArr[i10] = objArr[i12];
        int i23 = i13 - 1;
        if (i23 == 0) {
            System.arraycopy(objArrD, 0, objArr, i21, i11);
            return;
        }
        if (i11 == 1) {
            System.arraycopy(objArr, i22, objArr, i21, i23);
            objArr[i21 + i23] = objArrD[0];
            return;
        }
        int i24 = this.f95648b;
        int i25 = 0;
        loop0: while (true) {
            int i26 = 0;
            int i27 = 0;
            while (true) {
                if (((Comparable) objArr[i22]).compareTo(objArrD[i25]) < 0) {
                    i14 = i21 + 1;
                    i15 = i22 + 1;
                    objArr[i21] = objArr[i22];
                    i27++;
                    i23--;
                    if (i23 != 0) {
                        i21 = i14;
                        i22 = i15;
                        i26 = 0;
                    }
                    i22 = i15;
                    break loop0;
                }
                int i28 = i21 + 1;
                int i29 = i25 + 1;
                objArr[i21] = objArrD[i25];
                i26++;
                i11--;
                if (i11 == 1) {
                    i14 = i28;
                    i25 = i29;
                    break loop0;
                } else {
                    i21 = i28;
                    i25 = i29;
                    i27 = 0;
                }
                if ((i26 | i27) >= i24) {
                    while (true) {
                        int iF = f((Comparable) objArr[i22], objArrD, i25, i11, 0);
                        if (iF != 0) {
                            System.arraycopy(objArrD, i25, objArr, i21, iF);
                            i21 += iF;
                            i25 += iF;
                            i11 -= iF;
                            if (i11 <= 1) {
                                i14 = i21;
                                break loop0;
                            }
                            i16 = i21 + 1;
                            i15 = i22 + 1;
                            objArr[i21] = objArr[i22];
                            i23--;
                            if (i23 == 0) {
                                i14 = i16;
                                i22 = i15;
                                break loop0;
                            }
                            iE = e((Comparable) objArrD[i25], objArr, i15, i23, 0);
                            if (iE != 0) {
                                System.arraycopy(objArr, i15, objArr, i16, iE);
                                i19 = i16 + iE;
                                i20 = i15 + iE;
                                i23 -= iE;
                                if (i23 == 0) {
                                    i14 = i19;
                                    i22 = i20;
                                    break loop0;
                                } else {
                                    i16 = i19;
                                    i22 = i20;
                                }
                            } else {
                                i22 = i15;
                            }
                            i17 = i16 + 1;
                            i18 = i25 + 1;
                            objArr[i16] = objArrD[i25];
                            i11--;
                            if (i11 == 1) {
                                i14 = i17;
                                i25 = i18;
                                break loop0;
                            }
                            i24--;
                            if (iF >= 7) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (iE >= 7) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11 && !z10) {
                                if (i24 < 0) {
                                    i24 = 0;
                                }
                                i24 += 2;
                                i21 = i17;
                                i25 = i18;
                            } else {
                                i21 = i17;
                                i25 = i18;
                            }
                        } else {
                            i16 = i21 + 1;
                            i15 = i22 + 1;
                            objArr[i21] = objArr[i22];
                            i23--;
                            if (i23 == 0) {
                                i14 = i16;
                                i22 = i15;
                                break loop0;
                            }
                            iE = e((Comparable) objArrD[i25], objArr, i15, i23, 0);
                            if (iE != 0) {
                                System.arraycopy(objArr, i15, objArr, i16, iE);
                                i19 = i16 + iE;
                                i20 = i15 + iE;
                                i23 -= iE;
                                if (i23 == 0) {
                                    i14 = i19;
                                    i22 = i20;
                                    break loop0;
                                } else {
                                    i16 = i19;
                                    i22 = i20;
                                }
                            } else {
                                i22 = i15;
                            }
                            i17 = i16 + 1;
                            i18 = i25 + 1;
                            objArr[i16] = objArrD[i25];
                            i11--;
                            if (i11 == 1) {
                                i14 = i17;
                                i25 = i18;
                                break loop0;
                            }
                            i24--;
                            if (iF >= 7) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (iE >= 7) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11 && !z10) {
                                if (i24 < 0) {
                                    i24 = 0;
                                }
                                i24 += 2;
                                i21 = i17;
                                i25 = i18;
                            } else {
                                i21 = i17;
                                i25 = i18;
                            }
                        }
                    }
                }
            }
        }
        if (i24 < 1) {
            i24 = 1;
        }
        this.f95648b = i24;
        if (i11 == 1) {
            System.arraycopy(objArr, i22, objArr, i14, i23);
            objArr[i14 + i23] = objArrD[i25];
        } else {
            if (i11 == 0) {
                throw new IllegalArgumentException("Comparison method violates its general contract!");
            }
            System.arraycopy(objArrD, i25, objArr, i14, i11);
        }
    }

    private static int l(int i10) {
        int i11 = 0;
        while (i10 >= 32) {
            i11 |= i10 & 1;
            i10 >>= 1;
        }
        return i10 + i11;
    }

    private void m(int i10, int i11) {
        int[] iArr = this.f95651e;
        int i12 = this.f95650d;
        iArr[i12] = i10;
        this.f95652f[i12] = i11;
        this.f95650d = i12 + 1;
    }

    private static void n(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            if (i12 > i10) {
                throw new ArrayIndexOutOfBoundsException(i12);
            }
            return;
        }
        throw new IllegalArgumentException("fromIndex(" + i11 + ") > toIndex(" + i12 + ")");
    }

    private static void o(Object[] objArr, int i10, int i11) {
        int i12 = i11 - 1;
        while (i10 < i12) {
            Object obj = objArr[i10];
            objArr[i10] = objArr[i12];
            objArr[i12] = obj;
            i12--;
            i10++;
        }
    }

    static void p(Object[] objArr) {
        q(objArr, 0, objArr.length);
    }

    static void q(Object[] objArr, int i10, int i11) {
        n(objArr.length, i10, i11);
        int i12 = i11 - i10;
        if (i12 < 2) {
            return;
        }
        if (i12 < 32) {
            a(objArr, i10, i11, b(objArr, i10, i11) + i10);
            return;
        }
        l lVar = new l(objArr);
        int iL = l(i12);
        do {
            int iB = b(objArr, i10, i11);
            if (iB < iL) {
                int i13 = i12 <= iL ? i12 : iL;
                a(objArr, i10, i10 + i13, iB + i10);
                iB = i13;
            }
            lVar.m(i10, iB);
            lVar.h();
            i10 += iB;
            i12 -= iB;
        } while (i12 != 0);
        lVar.i();
    }

    public void c(Object[] objArr, int i10, int i11) {
        this.f95650d = 0;
        n(objArr.length, i10, i11);
        int i12 = i11 - i10;
        if (i12 < 2) {
            return;
        }
        if (i12 < 32) {
            a(objArr, i10, i11, b(objArr, i10, i11) + i10);
            return;
        }
        this.f95647a = objArr;
        int iL = l(i12);
        do {
            int iB = b(objArr, i10, i11);
            if (iB < iL) {
                int i13 = i12 <= iL ? i12 : iL;
                a(objArr, i10, i10 + i13, iB + i10);
                iB = i13;
            }
            m(i10, iB);
            h();
            i10 += iB;
            i12 -= iB;
        } while (i12 != 0);
        i();
    }

    private l(Object[] objArr) {
        this.f95648b = 7;
        this.f95650d = 0;
        this.f95647a = objArr;
        int length = objArr.length;
        this.f95649c = new Object[length < 512 ? length >>> 1 : 256];
        int i10 = length < 120 ? 5 : length < 1542 ? 10 : length < 119151 ? 19 : 40;
        this.f95651e = new int[i10];
        this.f95652f = new int[i10];
    }
}
