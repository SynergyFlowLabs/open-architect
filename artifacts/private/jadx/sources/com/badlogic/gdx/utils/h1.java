package com.badlogic.gdx.utils;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
class h1<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f95533i = 32;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f95534j = 7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f95535k = 256;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final boolean f95536l = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T[] f95537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Comparator<? super T> f95538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f95539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T[] f95540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f95541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f95542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f95543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f95544h;

    h1() {
        this.f95539c = 7;
        this.f95542f = 0;
        this.f95540d = (T[]) new Object[256];
        this.f95543g = new int[40];
        this.f95544h = new int[40];
    }

    private static <T> void a(T[] tArr, int i10, int i11, int i12, Comparator<? super T> comparator) {
        if (i12 == i10) {
            i12++;
        }
        while (i12 < i11) {
            T t10 = tArr[i12];
            int i13 = i10;
            int i14 = i12;
            while (i13 < i14) {
                int i15 = (i13 + i14) >>> 1;
                if (comparator.compare(t10, tArr[i15]) < 0) {
                    i14 = i15;
                } else {
                    i13 = i15 + 1;
                }
            }
            int i16 = i12 - i13;
            if (i16 == 1) {
                tArr[i13 + 1] = tArr[i13];
            } else if (i16 != 2) {
                System.arraycopy(tArr, i13, tArr, i13 + 1, i16);
            } else {
                tArr[i13 + 2] = tArr[i13 + 1];
                tArr[i13 + 1] = tArr[i13];
            }
            tArr[i13] = t10;
            i12++;
        }
    }

    private static <T> int b(T[] tArr, int i10, int i11, Comparator<? super T> comparator) {
        int i12 = i10 + 1;
        if (i12 == i11) {
            return 1;
        }
        int i13 = i10 + 2;
        if (comparator.compare(tArr[i12], tArr[i10]) < 0) {
            while (i13 < i11 && comparator.compare(tArr[i13], tArr[i13 - 1]) < 0) {
                i13++;
            }
            o(tArr, i10, i13);
        } else {
            while (i13 < i11 && comparator.compare(tArr[i13], tArr[i13 - 1]) >= 0) {
                i13++;
            }
        }
        return i13 - i10;
    }

    private T[] d(int i10) {
        this.f95541e = Math.max(this.f95541e, i10);
        if (this.f95540d.length < i10) {
            int i11 = (i10 >> 1) | i10;
            int i12 = i11 | (i11 >> 2);
            int i13 = i12 | (i12 >> 4);
            int i14 = i13 | (i13 >> 8);
            int i15 = (i14 | (i14 >> 16)) + 1;
            if (i15 >= 0) {
                i10 = Math.min(i15, this.f95537a.length >>> 1);
            }
            this.f95540d = (T[]) new Object[i10];
        }
        return this.f95540d;
    }

    private static <T> int e(T t10, T[] tArr, int i10, int i11, int i12, Comparator<? super T> comparator) {
        int i13;
        int i14;
        int i15 = i10 + i12;
        if (comparator.compare(t10, tArr[i15]) > 0) {
            int i16 = i11 - i12;
            int i17 = 0;
            int i18 = 1;
            while (i18 < i16 && comparator.compare(t10, tArr[i15 + i18]) > 0) {
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
            while (i23 < i21 && comparator.compare(t10, tArr[i15 - i23]) <= 0) {
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
            if (comparator.compare(t10, tArr[i10 + i29]) > 0) {
                i28 = i29 + 1;
            } else {
                i14 = i29;
            }
        }
        return i14;
    }

    private static <T> int f(T t10, T[] tArr, int i10, int i11, int i12, Comparator<? super T> comparator) {
        int i13;
        int i14;
        int i15 = i10 + i12;
        if (comparator.compare(t10, tArr[i15]) < 0) {
            int i16 = i12 + 1;
            int i17 = 0;
            int i18 = 1;
            while (i18 < i16 && comparator.compare(t10, tArr[i15 - i18]) < 0) {
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
            while (i23 < i21 && comparator.compare(t10, tArr[i15 + i23]) >= 0) {
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
            if (comparator.compare(t10, tArr[i10 + i28]) < 0) {
                i13 = i28;
            } else {
                i27 = i28 + 1;
            }
        }
        return i13;
    }

    private void g(int i10) {
        int[] iArr = this.f95543g;
        int i11 = iArr[i10];
        int[] iArr2 = this.f95544h;
        int i12 = iArr2[i10];
        int i13 = i10 + 1;
        int i14 = iArr[i13];
        int i15 = iArr2[i13];
        iArr2[i10] = i12 + i15;
        int i16 = this.f95542f;
        if (i10 == i16 - 3) {
            int i17 = i10 + 2;
            iArr[i13] = iArr[i17];
            iArr2[i13] = iArr2[i17];
        }
        this.f95542f = i16 - 1;
        T[] tArr = this.f95537a;
        int iF = f(tArr[i14], tArr, i11, i12, 0, this.f95538b);
        int i18 = i11 + iF;
        int i19 = i12 - iF;
        if (i19 != 0) {
            T[] tArr2 = this.f95537a;
            int iE = e(tArr2[(i18 + i19) - 1], tArr2, i14, i15, i15 - 1, this.f95538b);
            if (iE != 0) {
                if (i19 <= iE) {
                    k(i18, i19, i14, iE);
                } else {
                    j(i18, i19, i14, iE);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    private void h() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        while (true) {
            int i10 = this.f95542f;
            if (i10 <= 1) {
                return;
            }
            int i11 = i10 - 2;
            if (i11 >= 1) {
                int[] iArr4 = this.f95544h;
                if (iArr4[i10 - 3] > iArr4[i11] + iArr4[i10 - 1]) {
                    if (i11 >= 2) {
                        iArr2 = this.f95544h;
                        if (iArr2[i10 - 4] <= iArr2[i11] + iArr2[i10 - 3]) {
                            iArr3 = this.f95544h;
                            if (iArr3[i10 - 3] < iArr3[i10 - 1]) {
                                i11 = i10 - 3;
                            }
                        }
                    }
                    iArr = this.f95544h;
                    if (iArr[i11] > iArr[i10 - 1]) {
                        return;
                    }
                } else {
                    iArr3 = this.f95544h;
                    if (iArr3[i10 - 3] < iArr3[i10 - 1]) {
                        i11 = i10 - 3;
                    }
                }
            } else {
                if (i11 >= 2) {
                    iArr2 = this.f95544h;
                    if (iArr2[i10 - 4] <= iArr2[i11] + iArr2[i10 - 3]) {
                        iArr3 = this.f95544h;
                        if (iArr3[i10 - 3] < iArr3[i10 - 1]) {
                            i11 = i10 - 3;
                        }
                    }
                }
                iArr = this.f95544h;
                if (iArr[i11] > iArr[i10 - 1]) {
                    return;
                }
            }
            g(i11);
        }
    }

    private void i() {
        while (true) {
            int i10 = this.f95542f;
            if (i10 <= 1) {
                return;
            }
            int i11 = i10 - 2;
            if (i11 > 0) {
                int[] iArr = this.f95544h;
                if (iArr[i10 - 3] < iArr[i10 - 1]) {
                    i11 = i10 - 3;
                }
            }
            g(i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:56:0x0139  */
    /* JADX WARN: Code duplicated, block: B:58:0x013e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0141  */
    /* JADX WARN: Code duplicated, block: B:61:0x0145  */
    /* JADX WARN: Code duplicated, block: B:62:0x0147  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159 A[LOOP:2: B:25:0x0086->B:68:0x0159, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x014b A[SYNTHETIC] */
    private void j(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        T[] tArr;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        boolean z11;
        int i22;
        int i23;
        int i24 = i13;
        T[] tArr2 = this.f95537a;
        T[] tArrD = d(i24);
        System.arraycopy(tArr2, i12, tArrD, 0, i24);
        int i25 = i10 + i11;
        int i26 = i25 - 1;
        int i27 = i24 - 1;
        int i28 = i12 + i24;
        int i29 = i28 - 1;
        int i30 = i28 - 2;
        int i31 = i25 - 2;
        tArr2[i29] = tArr2[i26];
        int i32 = i11 - 1;
        if (i32 == 0) {
            System.arraycopy(tArrD, 0, tArr2, i30 - i27, i24);
            return;
        }
        if (i24 == 1) {
            int i33 = i30 - i32;
            System.arraycopy(tArr2, (i31 - i32) + 1, tArr2, i33 + 1, i32);
            tArr2[i33] = tArrD[i27];
            return;
        }
        Comparator<? super T> comparator = this.f95538b;
        int i34 = this.f95539c;
        loop0: while (true) {
            int i35 = 0;
            int i36 = 0;
            do {
                if (comparator.compare(tArrD[i27], tArr2[i31]) < 0) {
                    i14 = i30 - 1;
                    int i37 = i31 - 1;
                    tArr2[i30] = tArr2[i31];
                    i36++;
                    i32--;
                    if (i32 == 0) {
                        i31 = i37;
                        break loop0;
                    } else {
                        i30 = i14;
                        i31 = i37;
                        i35 = 0;
                    }
                } else {
                    int i38 = i30 - 1;
                    int i39 = i27 - 1;
                    tArr2[i30] = tArrD[i27];
                    i35++;
                    i24--;
                    if (i24 == 1) {
                        i14 = i38;
                        i27 = i39;
                        break loop0;
                    } else {
                        i30 = i38;
                        i27 = i39;
                        i36 = 0;
                    }
                }
            } while ((i36 | i35) < i34);
            int i40 = i24;
            int i41 = i31;
            int i42 = i32;
            int i43 = i27;
            int i44 = i34;
            int i45 = i30;
            while (true) {
                T[] tArr3 = tArr2;
                Comparator<? super T> comparator2 = comparator;
                tArr2 = tArr3;
                int iF = i42 - f(tArrD[i43], tArr3, i10, i42, i42 - 1, comparator2);
                if (iF != 0) {
                    int i46 = i45 - iF;
                    int i47 = i41 - iF;
                    i42 -= iF;
                    System.arraycopy(tArr2, i47 + 1, tArr2, i46 + 1, iF);
                    if (i42 == 0) {
                        int i48 = i40;
                        i14 = i46;
                        i24 = i48;
                        i32 = i42;
                        i31 = i47;
                        i27 = i43;
                    } else {
                        i45 = i46;
                        i41 = i47;
                        i15 = i42;
                        i16 = i45 - 1;
                        i17 = i43 - 1;
                        tArr2[i45] = tArrD[i43];
                        tArr = tArrD;
                        i18 = i40 - 1;
                        if (i18 == 1) {
                            i32 = i15;
                            i24 = i18;
                            tArrD = tArr;
                            i31 = i41;
                            i34 = i44;
                            i14 = i16;
                            i27 = i17;
                            break loop0;
                        }
                        comparator = comparator2;
                        int iE = e(tArr2[i41], tArr, 0, i18, i40 - 2, comparator);
                        i40 = i18;
                        tArrD = tArr;
                        i19 = i40 - iE;
                        if (i19 != 0) {
                            i22 = i16 - i19;
                            i27 = i17 - i19;
                            i23 = i40 - i19;
                            System.arraycopy(tArrD, i27 + 1, tArr2, i22 + 1, i19);
                            if (i23 <= 1) {
                                i14 = i22;
                                i31 = i41;
                                i32 = i15;
                                i24 = i23;
                            } else {
                                i16 = i22;
                                i43 = i27;
                                i40 = i23;
                            }
                        } else {
                            i43 = i17;
                        }
                        i45 = i16 - 1;
                        i20 = i41 - 1;
                        tArr2[i16] = tArr2[i41];
                        i21 = i15 - 1;
                        if (i21 == 0) {
                            i31 = i20;
                            i27 = i43;
                            i32 = i21;
                            i24 = i40;
                            i14 = i45;
                        } else {
                            i44--;
                            if (iF >= 7) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (i19 >= 7) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z10 && !z11) {
                                if (i44 < 0) {
                                    i44 = 0;
                                }
                                i34 = i44 + 2;
                                i30 = i45;
                                i31 = i20;
                                i27 = i43;
                                i32 = i21;
                                i24 = i40;
                            } else {
                                i42 = i21;
                                i41 = i20;
                            }
                        }
                    }
                    i34 = i44;
                    break loop0;
                }
                i15 = i42;
                i16 = i45 - 1;
                i17 = i43 - 1;
                tArr2[i45] = tArrD[i43];
                tArr = tArrD;
                i18 = i40 - 1;
                if (i18 == 1) {
                    i32 = i15;
                    i24 = i18;
                    tArrD = tArr;
                    i31 = i41;
                    i34 = i44;
                    i14 = i16;
                    i27 = i17;
                    break loop0;
                }
                comparator = comparator2;
                int iE2 = e(tArr2[i41], tArr, 0, i18, i40 - 2, comparator);
                i40 = i18;
                tArrD = tArr;
                i19 = i40 - iE2;
                if (i19 != 0) {
                    i22 = i16 - i19;
                    i27 = i17 - i19;
                    i23 = i40 - i19;
                    System.arraycopy(tArrD, i27 + 1, tArr2, i22 + 1, i19);
                    if (i23 <= 1) {
                        i14 = i22;
                        i31 = i41;
                        i32 = i15;
                        i24 = i23;
                    } else {
                        i16 = i22;
                        i43 = i27;
                        i40 = i23;
                    }
                    i34 = i44;
                    break loop0;
                }
                i43 = i17;
                i45 = i16 - 1;
                i20 = i41 - 1;
                tArr2[i16] = tArr2[i41];
                i21 = i15 - 1;
                if (i21 == 0) {
                    i31 = i20;
                    i27 = i43;
                    i32 = i21;
                    i24 = i40;
                    i14 = i45;
                    i34 = i44;
                    break loop0;
                }
                i44--;
                if (iF >= 7) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i19 >= 7) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z10 && !z11) {
                    if (i44 < 0) {
                        i44 = 0;
                    }
                    i34 = i44 + 2;
                    i30 = i45;
                    i31 = i20;
                    i27 = i43;
                    i32 = i21;
                    i24 = i40;
                } else {
                    i42 = i21;
                    i41 = i20;
                }
            }
        }
        if (i34 < 1) {
            i34 = 1;
        }
        this.f95539c = i34;
        if (i24 == 1) {
            int i49 = i14 - i32;
            System.arraycopy(tArr2, (i31 - i32) + 1, tArr2, i49 + 1, i32);
            tArr2[i49] = tArrD[i27];
        } else {
            if (i24 == 0) {
                throw new IllegalArgumentException("Comparison method violates its general contract!");
            }
            System.arraycopy(tArrD, 0, tArr2, i14 - (i24 - 1), i24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x0109  */
    /* JADX WARN: Code duplicated, block: B:58:0x010e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:61:0x0113  */
    /* JADX WARN: Code duplicated, block: B:62:0x0115  */
    /* JADX WARN: Code duplicated, block: B:66:0x011b  */
    /* JADX WARN: Code duplicated, block: B:68:0x012c A[LOOP:2: B:26:0x007f->B:68:0x012c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0119 A[SYNTHETIC] */
    private void k(int i10, int i11, int i12, int i13) {
        int i14;
        T[] tArr;
        int i15;
        int i16;
        T[] tArr2;
        int i17;
        int i18;
        int iE;
        boolean z10;
        boolean z11;
        int i19;
        int i20 = i11;
        T[] tArr3 = this.f95537a;
        T[] tArrD = d(i20);
        System.arraycopy(tArr3, i10, tArrD, 0, i20);
        int i21 = i10 + 1;
        int i22 = i12 + 1;
        tArr3[i10] = tArr3[i12];
        int i23 = i13 - 1;
        if (i23 == 0) {
            System.arraycopy(tArrD, 0, tArr3, i21, i20);
            return;
        }
        if (i20 == 1) {
            System.arraycopy(tArr3, i22, tArr3, i21, i23);
            tArr3[i21 + i23] = tArrD[0];
            return;
        }
        Comparator<? super T> comparator = this.f95538b;
        int i24 = this.f95539c;
        int i25 = 0;
        loop0: while (true) {
            int i26 = 0;
            int i27 = 0;
            while (true) {
                if (comparator.compare(tArr3[i22], tArrD[i25]) >= 0) {
                    int i28 = i21 + 1;
                    i14 = i25 + 1;
                    tArr3[i21] = tArrD[i25];
                    i26++;
                    i20--;
                    if (i20 == 1) {
                        tArr = tArrD;
                        i15 = i28;
                    } else {
                        i21 = i28;
                        i25 = i14;
                        i27 = 0;
                    }
                    i25 = i14;
                    break loop0;
                }
                i15 = i21 + 1;
                int i29 = i22 + 1;
                tArr3[i21] = tArr3[i22];
                i27++;
                i23--;
                if (i23 == 0) {
                    tArr = tArrD;
                    i22 = i29;
                    break loop0;
                } else {
                    i21 = i15;
                    i22 = i29;
                    i26 = 0;
                }
                if ((i26 | i27) >= i24) {
                    int i30 = i22;
                    int i31 = i24;
                    int i32 = i25;
                    int i33 = i20;
                    int i34 = i21;
                    while (true) {
                        int iF = f(tArr3[i30], tArrD, i32, i33, 0, comparator);
                        int i35 = i32;
                        Comparator<? super T> comparator2 = comparator;
                        tArr = tArrD;
                        if (iF == 0) {
                            i14 = i35;
                            i16 = i34 + 1;
                            int i36 = i34;
                            tArr2 = tArr3;
                            i17 = i30 + 1;
                            tArr2[i36] = tArr2[i30];
                            i18 = i23 - 1;
                            if (i18 == 0) {
                                i22 = i17;
                                i23 = i18;
                                i25 = i14;
                                i15 = i16;
                                tArr3 = tArr2;
                            } else {
                                iE = e(tArr[i14], tArr2, i17, i18, 0, comparator2);
                                i30 = i17;
                                tArr3 = tArr2;
                                if (iE != 0) {
                                    System.arraycopy(tArr3, i30, tArr3, i16, iE);
                                    i19 = i16 + iE;
                                    i22 = i30 + iE;
                                    i18 -= iE;
                                    if (i18 == 0) {
                                        i15 = i19;
                                        i23 = i18;
                                        i20 = i33;
                                        i24 = i31;
                                        i25 = i14;
                                        break loop0;
                                    }
                                    i16 = i19;
                                    i30 = i22;
                                }
                                i34 = i16 + 1;
                                i32 = i14 + 1;
                                tArr3[i16] = tArr[i14];
                                i33--;
                                if (i33 == 1) {
                                    i23 = i18;
                                    i25 = i32;
                                    i22 = i30;
                                    i15 = i34;
                                } else {
                                    i31--;
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
                                        if (i31 < 0) {
                                            i31 = 0;
                                        }
                                        i24 = i31 + 2;
                                        i23 = i18;
                                        i21 = i34;
                                        i20 = i33;
                                        comparator = comparator2;
                                        tArrD = tArr;
                                        i25 = i32;
                                        i22 = i30;
                                    } else {
                                        comparator = comparator2;
                                        tArrD = tArr;
                                        i23 = i18;
                                    }
                                }
                            }
                            i20 = i33;
                            i24 = i31;
                            break loop0;
                        }
                        System.arraycopy(tArr, i35, tArr3, i34, iF);
                        i34 += iF;
                        i35 += iF;
                        int i37 = i33 - iF;
                        if (i37 > 1) {
                            i33 = i37;
                            i14 = i35;
                            i16 = i34 + 1;
                            int i38 = i34;
                            tArr2 = tArr3;
                            i17 = i30 + 1;
                            tArr2[i38] = tArr2[i30];
                            i18 = i23 - 1;
                            if (i18 == 0) {
                                i22 = i17;
                                i23 = i18;
                                i25 = i14;
                                i15 = i16;
                                tArr3 = tArr2;
                            } else {
                                iE = e(tArr[i14], tArr2, i17, i18, 0, comparator2);
                                i30 = i17;
                                tArr3 = tArr2;
                                if (iE != 0) {
                                    System.arraycopy(tArr3, i30, tArr3, i16, iE);
                                    i19 = i16 + iE;
                                    i22 = i30 + iE;
                                    i18 -= iE;
                                    if (i18 == 0) {
                                        i15 = i19;
                                        i23 = i18;
                                        i20 = i33;
                                        i24 = i31;
                                        i25 = i14;
                                        break loop0;
                                    }
                                    i16 = i19;
                                    i30 = i22;
                                }
                                i34 = i16 + 1;
                                i32 = i14 + 1;
                                tArr3[i16] = tArr[i14];
                                i33--;
                                if (i33 == 1) {
                                    i23 = i18;
                                    i25 = i32;
                                    i22 = i30;
                                    i15 = i34;
                                } else {
                                    i31--;
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
                                        if (i31 < 0) {
                                            i31 = 0;
                                        }
                                        i24 = i31 + 2;
                                        i23 = i18;
                                        i21 = i34;
                                        i20 = i33;
                                        comparator = comparator2;
                                        tArrD = tArr;
                                        i25 = i32;
                                        i22 = i30;
                                    } else {
                                        comparator = comparator2;
                                        tArrD = tArr;
                                        i23 = i18;
                                    }
                                }
                            }
                            i20 = i33;
                            i24 = i31;
                            break loop0;
                        }
                        i25 = i35;
                        i22 = i30;
                        i24 = i31;
                        i15 = i34;
                        i20 = i37;
                        break loop0;
                    }
                }
                comparator = comparator;
                tArrD = tArrD;
            }
        }
        if (i24 < 1) {
            i24 = 1;
        }
        this.f95539c = i24;
        if (i20 == 1) {
            System.arraycopy(tArr3, i22, tArr3, i15, i23);
            tArr3[i15 + i23] = tArr[i25];
        } else {
            if (i20 == 0) {
                throw new IllegalArgumentException("Comparison method violates its general contract!");
            }
            System.arraycopy(tArr, i25, tArr3, i15, i20);
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
        int[] iArr = this.f95543g;
        int i12 = this.f95542f;
        iArr[i12] = i10;
        this.f95544h[i12] = i11;
        this.f95542f = i12 + 1;
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

    static <T> void p(T[] tArr, int i10, int i11, Comparator<? super T> comparator) {
        if (comparator == null) {
            Arrays.sort(tArr, i10, i11);
            return;
        }
        n(tArr.length, i10, i11);
        int i12 = i11 - i10;
        if (i12 < 2) {
            return;
        }
        if (i12 < 32) {
            a(tArr, i10, i11, b(tArr, i10, i11, comparator) + i10, comparator);
            return;
        }
        h1 h1Var = new h1(tArr, comparator);
        int iL = l(i12);
        do {
            int iB = b(tArr, i10, i11, comparator);
            if (iB < iL) {
                int i13 = i12 <= iL ? i12 : iL;
                a(tArr, i10, i10 + i13, iB + i10, comparator);
                iB = i13;
            }
            h1Var.m(i10, iB);
            h1Var.h();
            i10 += iB;
            i12 -= iB;
        } while (i12 != 0);
        h1Var.i();
    }

    static <T> void q(T[] tArr, Comparator<? super T> comparator) {
        p(tArr, 0, tArr.length, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(T[] tArr, Comparator<T> comparator, int i10, int i11) {
        this.f95542f = 0;
        n(tArr.length, i10, i11);
        int i12 = i11 - i10;
        if (i12 >= 2) {
            if (i12 < 32) {
                a(tArr, i10, i11, b(tArr, i10, i11, comparator) + i10, comparator);
                return;
            }
            this.f95537a = tArr;
            this.f95538b = comparator;
            this.f95541e = 0;
            int iL = l(i12);
            do {
                int iB = b(tArr, i10, i11, comparator);
                if (iB < iL) {
                    int i13 = i12 <= iL ? i12 : iL;
                    a(tArr, i10, i10 + i13, iB + i10, comparator);
                    iB = i13;
                }
                m(i10, iB);
                h();
                i10 += iB;
                i12 -= iB;
            } while (i12 != 0);
            i();
            this.f95537a = null;
            this.f95538b = null;
            T[] tArr2 = this.f95540d;
            int i14 = this.f95541e;
            for (int i15 = 0; i15 < i14; i15++) {
                tArr2[i15] = null;
            }
        }
    }

    private h1(T[] tArr, Comparator<? super T> comparator) {
        this.f95539c = 7;
        this.f95542f = 0;
        this.f95537a = tArr;
        this.f95538b = comparator;
        int length = tArr.length;
        this.f95540d = (T[]) new Object[length < 512 ? length >>> 1 : 256];
        int i10 = length < 120 ? 5 : length < 1542 ? 10 : length < 119151 ? 19 : 40;
        this.f95543g = new int[i10];
        this.f95544h = new int[i10];
    }
}
