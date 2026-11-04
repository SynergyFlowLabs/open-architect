package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class k8<T> implements s8<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f109166l = new int[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Unsafe f109167m = m9.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f109168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f109169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f109170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f109171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h8 f109172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f109173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f109174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f109175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f109176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f9 f109177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final q6 f109178k;

    private k8(int[] iArr, Object[] objArr, int i10, int i11, h8 h8Var, boolean z10, int[] iArr2, int i12, int i13, m8 m8Var, t7 t7Var, f9 f9Var, q6 q6Var, c8 c8Var) {
        this.f109168a = iArr;
        this.f109169b = objArr;
        this.f109170c = i10;
        this.f109171d = i11;
        boolean z11 = false;
        if (q6Var != null && (h8Var instanceof b7)) {
            z11 = true;
        }
        this.f109173f = z11;
        this.f109174g = iArr2;
        this.f109175h = i12;
        this.f109176i = i13;
        this.f109177j = f9Var;
        this.f109178k = q6Var;
        this.f109172e = h8Var;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0288  */
    /* JADX WARN: Code duplicated, block: B:128:0x028e  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:171:0x0370  */
    /* JADX WARN: Code duplicated, block: B:187:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:190:0x03d8  */
    static k8 A(Class cls, e8 e8Var, m8 m8Var, t7 t7Var, f9 f9Var, q6 q6Var, c8 c8Var) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        char c10;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        int i30;
        Field fieldO;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field fieldO2;
        int i36;
        Object obj2;
        Field fieldO3;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        int i40;
        char cCharAt13;
        if (!(e8Var instanceof r8)) {
            throw null;
        }
        r8 r8Var = (r8) e8Var;
        String strB = r8Var.b();
        int length = strB.length();
        char c11 = 55296;
        if (strB.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i10 = i41 + 1;
                if (strB.charAt(i41) < 55296) {
                    break;
                }
                i41 = i10;
            }
        } else {
            i10 = 1;
        }
        int i42 = i10 + 1;
        int iCharAt2 = strB.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i43 = iCharAt2 & 8191;
            int i44 = 13;
            while (true) {
                i40 = i42 + 1;
                cCharAt13 = strB.charAt(i42);
                if (cCharAt13 < 55296) {
                    break;
                }
                i43 |= (cCharAt13 & 8191) << i44;
                i44 += 13;
                i42 = i40;
            }
            iCharAt2 = i43 | (cCharAt13 << i44);
            i42 = i40;
        }
        if (iCharAt2 == 0) {
            i12 = 0;
            i15 = 0;
            iCharAt = 0;
            i11 = 0;
            i13 = 0;
            i14 = 0;
            iArr = f109166l;
            i16 = 0;
        } else {
            int i45 = i42 + 1;
            int iCharAt3 = strB.charAt(i42);
            if (iCharAt3 >= 55296) {
                int i46 = iCharAt3 & 8191;
                int i47 = 13;
                while (true) {
                    i24 = i45 + 1;
                    cCharAt8 = strB.charAt(i45);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i24;
                }
                iCharAt3 = i46 | (cCharAt8 << i47);
                i45 = i24;
            }
            int i48 = i45 + 1;
            int iCharAt4 = strB.charAt(i45);
            if (iCharAt4 >= 55296) {
                int i49 = iCharAt4 & 8191;
                int i50 = 13;
                while (true) {
                    i23 = i48 + 1;
                    cCharAt7 = strB.charAt(i48);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i23;
                }
                iCharAt4 = i49 | (cCharAt7 << i50);
                i48 = i23;
            }
            int i51 = i48 + 1;
            int iCharAt5 = strB.charAt(i48);
            if (iCharAt5 >= 55296) {
                int i52 = iCharAt5 & 8191;
                int i53 = 13;
                while (true) {
                    i22 = i51 + 1;
                    cCharAt6 = strB.charAt(i51);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i22;
                }
                iCharAt5 = i52 | (cCharAt6 << i53);
                i51 = i22;
            }
            int i54 = i51 + 1;
            int iCharAt6 = strB.charAt(i51);
            if (iCharAt6 >= 55296) {
                int i55 = iCharAt6 & 8191;
                int i56 = 13;
                while (true) {
                    i21 = i54 + 1;
                    cCharAt5 = strB.charAt(i54);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i21;
                }
                iCharAt6 = i55 | (cCharAt5 << i56);
                i54 = i21;
            }
            int i57 = i54 + 1;
            iCharAt = strB.charAt(i54);
            if (iCharAt >= 55296) {
                int i58 = iCharAt & 8191;
                int i59 = 13;
                while (true) {
                    i20 = i57 + 1;
                    cCharAt4 = strB.charAt(i57);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i20;
                }
                iCharAt = i58 | (cCharAt4 << i59);
                i57 = i20;
            }
            int i60 = i57 + 1;
            int iCharAt7 = strB.charAt(i57);
            if (iCharAt7 >= 55296) {
                int i61 = iCharAt7 & 8191;
                int i62 = 13;
                while (true) {
                    i19 = i60 + 1;
                    cCharAt3 = strB.charAt(i60);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i19;
                }
                iCharAt7 = i61 | (cCharAt3 << i62);
                i60 = i19;
            }
            int i63 = i60 + 1;
            int iCharAt8 = strB.charAt(i60);
            if (iCharAt8 >= 55296) {
                int i64 = iCharAt8 & 8191;
                int i65 = 13;
                while (true) {
                    i18 = i63 + 1;
                    cCharAt2 = strB.charAt(i63);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt2 & 8191) << i65;
                    i65 += 13;
                    i63 = i18;
                }
                iCharAt8 = i64 | (cCharAt2 << i65);
                i63 = i18;
            }
            int i66 = i63 + 1;
            int iCharAt9 = strB.charAt(i63);
            if (iCharAt9 >= 55296) {
                int i67 = iCharAt9 & 8191;
                int i68 = 13;
                while (true) {
                    i17 = i66 + 1;
                    cCharAt = strB.charAt(i66);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i67 |= (cCharAt & 8191) << i68;
                    i68 += 13;
                    i66 = i17;
                }
                iCharAt9 = i67 | (cCharAt << i68);
                i66 = i17;
            }
            int i69 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i70 = iCharAt7;
            i11 = iCharAt5;
            i12 = i70;
            i13 = iCharAt6;
            i14 = iCharAt9;
            i15 = i69;
            iArr = iArr2;
            i16 = iCharAt3;
            i42 = i66;
        }
        Unsafe unsafe = f109167m;
        Object[] objArrC = r8Var.c();
        Class<?> cls2 = r8Var.a().getClass();
        int i71 = i14 + i12;
        int i72 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i72];
        int i73 = i14;
        int i74 = i71;
        int i75 = 0;
        int i76 = 0;
        while (i42 < length) {
            int i77 = i42 + 1;
            int iCharAt10 = strB.charAt(i42);
            if (iCharAt10 >= c11) {
                int i78 = iCharAt10 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i39 = i79 + 1;
                    cCharAt12 = strB.charAt(i79);
                    if (cCharAt12 < c11) {
                        break;
                    }
                    i78 |= (cCharAt12 & 8191) << i80;
                    i80 += 13;
                    i79 = i39;
                }
                iCharAt10 = i78 | (cCharAt12 << i80);
                i25 = i39;
            } else {
                i25 = i77;
            }
            int i81 = i25 + 1;
            int iCharAt11 = strB.charAt(i25);
            if (iCharAt11 >= c11) {
                int i82 = iCharAt11 & 8191;
                int i83 = i81;
                int i84 = 13;
                while (true) {
                    i38 = i83 + 1;
                    cCharAt11 = strB.charAt(i83);
                    if (cCharAt11 < c11) {
                        break;
                    }
                    i82 |= (cCharAt11 & 8191) << i84;
                    i84 += 13;
                    i83 = i38;
                }
                iCharAt11 = i82 | (cCharAt11 << i84);
                i26 = i38;
            } else {
                i26 = i81;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i75] = i76;
                i75++;
            }
            int i85 = iCharAt11 & 255;
            r8 r8Var2 = r8Var;
            int i86 = iCharAt11 & 2048;
            if (i85 >= 51) {
                int i87 = i26 + 1;
                int iCharAt12 = strB.charAt(i26);
                char c12 = 55296;
                if (iCharAt12 >= 55296) {
                    int i88 = iCharAt12 & 8191;
                    int i89 = i87;
                    int i90 = 13;
                    while (true) {
                        i37 = i89 + 1;
                        cCharAt10 = strB.charAt(i89);
                        if (cCharAt10 < c12) {
                            break;
                        }
                        i88 |= (cCharAt10 & 8191) << i90;
                        i90 += 13;
                        i89 = i37;
                        c12 = 55296;
                    }
                    iCharAt12 = i88 | (cCharAt10 << i90);
                    i32 = i37;
                } else {
                    i32 = i87;
                }
                int i91 = i32;
                int i92 = i85 - 51;
                if (i92 == 9 || i92 == 17) {
                    i33 = i15 + 1;
                    int i93 = i76 / 3;
                    objArr[i93 + i93 + 1] = objArrC[i15];
                } else {
                    if (i92 != 12) {
                        i34 = i86;
                    } else if (r8Var2.h() == 1 || i86 != 0) {
                        i33 = i15 + 1;
                        int i94 = i76 / 3;
                        objArr[i94 + i94 + 1] = objArrC[i15];
                    } else {
                        i34 = 0;
                    }
                    i35 = iCharAt12 + iCharAt12;
                    obj = objArrC[i35];
                    int i95 = i34;
                    if (obj instanceof Field) {
                        fieldO2 = (Field) obj;
                    } else {
                        fieldO2 = O(cls2, (String) obj);
                        objArrC[i35] = fieldO2;
                    }
                    int i96 = i16;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO2);
                    i36 = i35 + 1;
                    obj2 = objArrC[i36];
                    i27 = i96;
                    if (obj2 instanceof Field) {
                        fieldO3 = (Field) obj2;
                    } else {
                        fieldO3 = O(cls2, (String) obj2);
                        objArrC[i36] = fieldO3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                    strB = strB;
                    i29 = i95;
                    i26 = i91;
                    i28 = 0;
                    c10 = 55296;
                }
                i15 = i33;
                i34 = i86;
                i35 = iCharAt12 + iCharAt12;
                obj = objArrC[i35];
                int i97 = i34;
                if (obj instanceof Field) {
                    fieldO2 = (Field) obj;
                } else {
                    fieldO2 = O(cls2, (String) obj);
                    objArrC[i35] = fieldO2;
                }
                int i98 = i16;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO2);
                i36 = i35 + 1;
                obj2 = objArrC[i36];
                i27 = i98;
                if (obj2 instanceof Field) {
                    fieldO3 = (Field) obj2;
                } else {
                    fieldO3 = O(cls2, (String) obj2);
                    objArrC[i36] = fieldO3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                strB = strB;
                i29 = i97;
                i26 = i91;
                i28 = 0;
                c10 = 55296;
            } else {
                i27 = i16;
                int i99 = i15 + 1;
                Field fieldO4 = O(cls2, (String) objArrC[i15]);
                if (i85 == 9 || i85 == 17) {
                    int i100 = i76 / 3;
                    objArr[i100 + i100 + 1] = fieldO4.getType();
                } else {
                    if (i85 != 27) {
                        if (i85 == 49) {
                            i15 += 2;
                            i31 = 1;
                        } else if (i85 == 12 || i85 == 30 || i85 == 44) {
                            if (r8Var2.h() == 1 || i86 != 0) {
                                i15 += 2;
                                int i101 = i76 / 3;
                                objArr[i101 + i101 + 1] = objArrC[i99];
                            } else {
                                i15 = i99;
                                i86 = 0;
                            }
                        } else if (i85 == 50) {
                            int i102 = i15 + 2;
                            int i103 = i73 + 1;
                            iArr[i73] = i76;
                            int i104 = i76 / 3;
                            int i105 = i104 + i104;
                            objArr[i105] = objArrC[i99];
                            if (i86 != 0) {
                                objArr[i105 + 1] = objArrC[i102];
                                i15 += 3;
                                i73 = i103;
                            } else {
                                i15 = i102;
                                i73 = i103;
                                i86 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                        if ((iCharAt11 & 4096) != 0 || i85 > 17) {
                            c10 = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i28 = 0;
                        } else {
                            int i106 = i26 + 1;
                            int iCharAt13 = strB.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i107 = iCharAt13 & 8191;
                                int i108 = 13;
                                while (true) {
                                    i30 = i106 + 1;
                                    cCharAt9 = strB.charAt(i106);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i107 |= (cCharAt9 & 8191) << i108;
                                    i108 += 13;
                                    i106 = i30;
                                }
                                iCharAt13 = i107 | (cCharAt9 << i108);
                            } else {
                                i30 = i106;
                            }
                            int i109 = i27 + i27 + (iCharAt13 / 32);
                            Object obj3 = objArrC[i109];
                            if (obj3 instanceof Field) {
                                fieldO = (Field) obj3;
                            } else {
                                fieldO = O(cls2, (String) obj3);
                                objArrC[i109] = fieldO;
                            }
                            int i110 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO);
                            i28 = i110 % 32;
                            i26 = i30;
                            c10 = 55296;
                            iObjectFieldOffset2 = iObjectFieldOffset3;
                        }
                        if (i85 >= 18 && i85 <= 49) {
                            iArr[i74] = iObjectFieldOffset;
                            i74++;
                        }
                        i29 = i86;
                    } else {
                        i31 = 1;
                        i15 += 2;
                    }
                    int i111 = i76 / 3;
                    objArr[i111 + i111 + i31] = objArrC[i99];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                    if ((iCharAt11 & 4096) != 0) {
                        c10 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i28 = 0;
                    } else {
                        c10 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i28 = 0;
                    }
                    if (i85 >= 18) {
                        iArr[i74] = iObjectFieldOffset;
                        i74++;
                    }
                    i29 = i86;
                }
                i15 = i99;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                if ((iCharAt11 & 4096) != 0) {
                    c10 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i28 = 0;
                } else {
                    c10 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i28 = 0;
                }
                if (i85 >= 18) {
                    iArr[i74] = iObjectFieldOffset;
                    i74++;
                }
                i29 = i86;
            }
            int i112 = i76 + 1;
            iArr3[i76] = iCharAt10;
            int i113 = i76 + 2;
            iArr3[i112] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i29 != 0 ? Integer.MIN_VALUE : 0) | (i85 << 20) | iObjectFieldOffset;
            i76 += 3;
            iArr3[i113] = (i28 << 20) | iObjectFieldOffset2;
            i42 = i26;
            strB = strB;
            c11 = c10;
            r8Var = r8Var2;
            length = length;
            i16 = i27;
        }
        return new k8(iArr3, objArr, i11, i13, r8Var.a(), false, iArr, i14, i71, m8Var, t7Var, f9Var, q6Var, c8Var);
    }

    private static double B(Object obj, long j10) {
        return ((Double) m9.k(obj, j10)).doubleValue();
    }

    private static float C(Object obj, long j10) {
        return ((Float) m9.k(obj, j10)).floatValue();
    }

    private static int D(Object obj, long j10) {
        return ((Integer) m9.k(obj, j10)).intValue();
    }

    private final int E(int i10) {
        return this.f109168a[i10 + 2];
    }

    private final int F(int i10, int i11) {
        int length = (this.f109168a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f109168a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int G(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int H(int i10) {
        return this.f109168a[i10 + 1];
    }

    private static long I(Object obj, long j10) {
        return ((Long) m9.k(obj, j10)).longValue();
    }

    private final g7 J(int i10) {
        int i11 = i10 / 3;
        return (g7) this.f109169b[i11 + i11 + 1];
    }

    private final s8 K(int i10) {
        Object[] objArr = this.f109169b;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        s8 s8Var = (s8) objArr[i12];
        if (s8Var != null) {
            return s8Var;
        }
        s8 s8VarB = p8.a().b((Class) objArr[i12 + 1]);
        this.f109169b[i12] = s8VarB;
        return s8VarB;
    }

    private final Object L(int i10) {
        int i11 = i10 / 3;
        return this.f109169b[i11 + i11];
    }

    private final Object M(Object obj, int i10) {
        s8 s8VarK = K(i10);
        int iH = H(i10) & 1048575;
        if (!r(obj, i10)) {
            return s8VarK.j();
        }
        Object object = f109167m.getObject(obj, iH);
        if (u(object)) {
            return object;
        }
        Object objJ = s8VarK.j();
        if (object != null) {
            s8VarK.f(objJ, object);
        }
        return objJ;
    }

    private final Object N(Object obj, int i10, int i11) {
        s8 s8VarK = K(i11);
        if (!v(obj, i10, i11)) {
            return s8VarK.j();
        }
        Object object = f109167m.getObject(obj, H(i11) & 1048575);
        if (u(object)) {
            return object;
        }
        Object objJ = s8VarK.j();
        if (object != null) {
            s8VarK.f(objJ, object);
        }
        return objJ;
    }

    private static Field O(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void i(Object obj) {
        if (!u(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void k(Object obj, Object obj2, int i10) {
        if (r(obj2, i10)) {
            int iH = H(i10) & 1048575;
            Unsafe unsafe = f109167m;
            long j10 = iH;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f109168a[i10] + " is present but null: " + obj2.toString());
            }
            s8 s8VarK = K(i10);
            if (!r(obj, i10)) {
                if (u(object)) {
                    Object objJ = s8VarK.j();
                    s8VarK.f(objJ, object);
                    unsafe.putObject(obj, j10, objJ);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                m(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!u(object2)) {
                Object objJ2 = s8VarK.j();
                s8VarK.f(objJ2, object2);
                unsafe.putObject(obj, j10, objJ2);
                object2 = objJ2;
            }
            s8VarK.f(object2, object);
        }
    }

    private final void l(Object obj, Object obj2, int i10) {
        int i11 = this.f109168a[i10];
        if (v(obj2, i11, i10)) {
            int iH = H(i10) & 1048575;
            Unsafe unsafe = f109167m;
            long j10 = iH;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f109168a[i10] + " is present but null: " + obj2.toString());
            }
            s8 s8VarK = K(i10);
            if (!v(obj, i11, i10)) {
                if (u(object)) {
                    Object objJ = s8VarK.j();
                    s8VarK.f(objJ, object);
                    unsafe.putObject(obj, j10, objJ);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                n(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!u(object2)) {
                Object objJ2 = s8VarK.j();
                s8VarK.f(objJ2, object2);
                unsafe.putObject(obj, j10, objJ2);
                object2 = objJ2;
            }
            s8VarK.f(object2, object);
        }
    }

    private final void m(Object obj, int i10) {
        int iE = E(i10);
        long j10 = 1048575 & iE;
        if (j10 == 1048575) {
            return;
        }
        m9.v(obj, j10, (1 << (iE >>> 20)) | m9.h(obj, j10));
    }

    private final void n(Object obj, int i10, int i11) {
        m9.v(obj, E(i11) & 1048575, i10);
    }

    private final void o(Object obj, int i10, Object obj2) {
        f109167m.putObject(obj, H(i10) & 1048575, obj2);
        m(obj, i10);
    }

    private final void p(Object obj, int i10, int i11, Object obj2) {
        f109167m.putObject(obj, H(i11) & 1048575, obj2);
        n(obj, i10, i11);
    }

    private final boolean q(Object obj, Object obj2, int i10) {
        return r(obj, i10) == r(obj2, i10);
    }

    private final boolean r(Object obj, int i10) {
        int iE = E(i10);
        long j10 = iE & 1048575;
        if (j10 != 1048575) {
            return ((1 << (iE >>> 20)) & m9.h(obj, j10)) != 0;
        }
        int iH = H(i10);
        long j11 = iH & 1048575;
        switch (G(iH)) {
            case 0:
                return Double.doubleToRawLongBits(m9.f(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(m9.g(obj, j11)) != 0;
            case 2:
                return m9.i(obj, j11) != 0;
            case 3:
                return m9.i(obj, j11) != 0;
            case 4:
                return m9.h(obj, j11) != 0;
            case 5:
                return m9.i(obj, j11) != 0;
            case 6:
                return m9.h(obj, j11) != 0;
            case 7:
                return m9.B(obj, j11);
            case 8:
                Object objK = m9.k(obj, j11);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof d6) {
                    return !d6.f109102b.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return m9.k(obj, j11) != null;
            case 10:
                return !d6.f109102b.equals(m9.k(obj, j11));
            case 11:
                return m9.h(obj, j11) != 0;
            case 12:
                return m9.h(obj, j11) != 0;
            case 13:
                return m9.h(obj, j11) != 0;
            case 14:
                return m9.i(obj, j11) != 0;
            case 15:
                return m9.h(obj, j11) != 0;
            case 16:
                return m9.i(obj, j11) != 0;
            case 17:
                return m9.k(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean s(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return r(obj, i10);
        }
        if ((i12 & i13) == 0) {
            return false;
        }
        int i14 = 4 << 1;
        return true;
    }

    private static boolean t(Object obj, int i10, s8 s8Var) {
        return s8Var.d(m9.k(obj, i10 & 1048575));
    }

    private static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof e7) {
            return ((e7) obj).j();
        }
        return true;
    }

    private final boolean v(Object obj, int i10, int i11) {
        return m9.h(obj, (long) (E(i11) & 1048575)) == i10;
    }

    private static boolean w(Object obj, long j10) {
        return ((Boolean) m9.k(obj, j10)).booleanValue();
    }

    private static final void x(int i10, Object obj, s9 s9Var) throws IOException {
        if (obj instanceof String) {
            s9Var.k(i10, (String) obj);
        } else {
            s9Var.x(i10, (d6) obj);
        }
    }

    static g9 z(Object obj) {
        e7 e7Var = (e7) obj;
        g9 g9Var = e7Var.zzc;
        if (g9Var != g9.c()) {
            return g9Var;
        }
        g9 g9VarF = g9.f();
        e7Var.zzc = g9VarF;
        return g9VarF;
    }

    @Override // com.google.android.gms.internal.play_billing.s8
    public final int a(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f109168a.length; i13 += 3) {
            int iH = H(i13);
            int[] iArr = this.f109168a;
            int i14 = 1048575 & iH;
            int iG = G(iH);
            int i15 = iArr[i13];
            long j10 = i14;
            int iHashCode = 37;
            switch (iG) {
                case 0:
                    i10 = i12 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(m9.f(obj, j10));
                    byte[] bArr = j7.f109152b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(m9.g(obj, j10));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i12 * 53;
                    jDoubleToLongBits = m9.i(obj, j10);
                    byte[] bArr2 = j7.f109152b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i12 * 53;
                    jDoubleToLongBits = m9.i(obj, j10);
                    byte[] bArr3 = j7.f109152b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iFloatToIntBits = m9.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i12 * 53;
                    jDoubleToLongBits = m9.i(obj, j10);
                    byte[] bArr4 = j7.f109152b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iFloatToIntBits = m9.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iFloatToIntBits = j7.a(m9.B(obj, j10));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iFloatToIntBits = ((String) m9.k(obj, j10)).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object objK = m9.k(obj, j10);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i12 = i11 + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iFloatToIntBits = m9.k(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iFloatToIntBits = m9.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iFloatToIntBits = m9.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iFloatToIntBits = m9.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i12 * 53;
                    jDoubleToLongBits = m9.i(obj, j10);
                    byte[] bArr5 = j7.f109152b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iFloatToIntBits = m9.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i12 * 53;
                    jDoubleToLongBits = m9.i(obj, j10);
                    byte[] bArr6 = j7.f109152b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object objK2 = m9.k(obj, j10);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
                    }
                    i12 = i11 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i12 * 53;
                    iFloatToIntBits = m9.k(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iFloatToIntBits = m9.k(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(B(obj, j10));
                        byte[] bArr7 = j7.f109152b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = Float.floatToIntBits(C(obj, j10));
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = I(obj, j10);
                        byte[] bArr8 = j7.f109152b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = I(obj, j10);
                        byte[] bArr9 = j7.f109152b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = D(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = I(obj, j10);
                        byte[] bArr10 = j7.f109152b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = D(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = j7.a(w(obj, j10));
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = ((String) m9.k(obj, j10)).hashCode();
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = m9.k(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = m9.k(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = D(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = D(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = D(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = I(obj, j10);
                        byte[] bArr11 = j7.f109152b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = D(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = I(obj, j10);
                        byte[] bArr12 = j7.f109152b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    if (v(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = m9.k(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i12 * 53) + ((e7) obj).zzc.hashCode();
        return this.f109173f ? (iHashCode2 * 53) + ((b7) obj).zzb.f109364a.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x0099 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.s8
    public final void b(Object obj) {
        if (u(obj)) {
            if (obj instanceof e7) {
                e7 e7Var = (e7) obj;
                e7Var.A(Integer.MAX_VALUE);
                e7Var.zza = 0;
                e7Var.y();
            }
            int[] iArr = this.f109168a;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iH = H(i10);
                int i11 = 1048575 & iH;
                int iG = G(iH);
                long j10 = i11;
                if (iG != 9) {
                    if (iG != 60 && iG != 68) {
                        switch (iG) {
                            case 17:
                                if (r(obj, i10)) {
                                    K(i10).b(f109167m.getObject(obj, j10));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((i7) m9.k(obj, j10)).g();
                                break;
                            case 50:
                                Unsafe unsafe = f109167m;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((b8) object).c();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (v(obj, this.f109168a[i10], i10)) {
                        K(i10).b(f109167m.getObject(obj, j10));
                    }
                } else if (r(obj, i10)) {
                    K(i10).b(f109167m.getObject(obj, j10));
                }
            }
            this.f109177j.a(obj);
            if (this.f109173f) {
                this.f109178k.a(obj);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x0390  */
    /* JADX WARN: Code duplicated, block: B:179:0x0488  */
    /* JADX WARN: Code duplicated, block: B:280:0x071f A[PHI: r0
      0x071f: PHI (r0v10 com.google.android.gms.internal.play_billing.k8<T>) = 
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v47 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
      (r0v2 com.google.android.gms.internal.play_billing.k8<T>)
     binds: [B:18:0x0055, B:278:0x0712, B:248:0x064b, B:225:0x05ba, B:218:0x0587, B:138:0x0374, B:135:0x035c, B:132:0x0344, B:129:0x032c, B:126:0x0314, B:123:0x02fc, B:120:0x02e4, B:117:0x02cc, B:114:0x02b3, B:111:0x029c, B:108:0x0285, B:105:0x026e, B:102:0x0257, B:97:0x023b, B:83:0x01e7, B:85:0x01f5, B:80:0x01cd, B:77:0x01bf, B:74:0x01a9, B:71:0x0193, B:68:0x017c, B:65:0x016e, B:62:0x0160, B:59:0x0151, B:53:0x0126, B:50:0x0112, B:46:0x00f4, B:43:0x00df, B:40:0x00c9, B:36:0x00ba, B:32:0x00ab, B:29:0x0091, B:25:0x0076, B:21:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.s8
    public final int c(Object obj) {
        int i10;
        int iB;
        int iB2;
        int iA;
        int iB3;
        int iB4;
        int iB5;
        int i11;
        int iB6;
        int iM;
        int iL;
        int size;
        int iQ;
        int iB7;
        int iB8;
        int iB9;
        int iA2;
        int iJ;
        int iB10;
        int iB11;
        int iY;
        int iB12;
        int iB13;
        int iB14;
        int i12;
        int iB15;
        k8<T> k8Var = this;
        Unsafe unsafe = f109167m;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int iB16 = 0;
        int i16 = 1048575;
        while (i14 < k8Var.f109168a.length) {
            int iH = k8Var.H(i14);
            int iG = G(iH);
            int[] iArr = k8Var.f109168a;
            int i17 = iArr[i14];
            int i18 = iArr[i14 + 2];
            int i19 = i18 & i13;
            if (iG <= 17) {
                if (i19 != i16) {
                    i15 = i19 == i13 ? 0 : unsafe.getInt(obj, i19);
                    i16 = i19;
                }
                i10 = 1 << (i18 >>> 20);
            } else {
                i10 = 0;
            }
            int i20 = iH & i13;
            if (iG >= w6.f109405q3.a()) {
                w6.D3.a();
            }
            int i21 = iB16;
            long j10 = i20;
            switch (iG) {
                case 0:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        iB16 = i21 + k6.B(i17 << 3) + 8;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 1:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        iB = k6.B(i17 << 3);
                        iB4 = iB + 4;
                        iB16 = i21 + iB4;
                        k8Var = this;
                        i14 += 3;
                        i13 = 1048575;
                    }
                    k8Var = this;
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 2:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iB2 = k6.B(i17 << 3);
                        iA = k6.a(j11);
                        iB4 = iB2 + iA;
                        iB16 = i21 + iB4;
                        k8Var = this;
                        i14 += 3;
                        i13 = 1048575;
                    }
                    k8Var = this;
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 3:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        long j12 = unsafe.getLong(obj, j10);
                        iB2 = k6.B(i17 << 3);
                        iA = k6.a(j12);
                        iB4 = iB2 + iA;
                        iB16 = i21 + iB4;
                        k8Var = this;
                        i14 += 3;
                        i13 = 1048575;
                    }
                    k8Var = this;
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 4:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        long j13 = unsafe.getInt(obj, j10);
                        iB2 = k6.B(i17 << 3);
                        iA = k6.a(j13);
                        iB4 = iB2 + iA;
                        iB16 = i21 + iB4;
                        k8Var = this;
                        i14 += 3;
                        i13 = 1048575;
                    }
                    k8Var = this;
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 5:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        iB3 = k6.B(i17 << 3);
                        iB4 = iB3 + 8;
                        iB16 = i21 + iB4;
                        k8Var = this;
                        i14 += 3;
                        i13 = 1048575;
                    }
                    k8Var = this;
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 6:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        iB = k6.B(i17 << 3);
                        iB4 = iB + 4;
                        iB16 = i21 + iB4;
                        k8Var = this;
                        i14 += 3;
                        i13 = 1048575;
                    }
                    k8Var = this;
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 7:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        iB4 = k6.B(i17 << 3) + 1;
                        iB16 = i21 + iB4;
                        k8Var = this;
                        i14 += 3;
                        i13 = 1048575;
                    }
                    k8Var = this;
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 8:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        int i22 = i17 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof d6) {
                            iB5 = k6.B(i22);
                            i11 = ((d6) object).i();
                            iB6 = k6.B(i11);
                            iB4 = iB5 + iB6 + i11;
                            iB16 = i21 + iB4;
                            k8Var = this;
                            i14 += 3;
                            i13 = 1048575;
                        } else {
                            iB2 = k6.B(i22);
                            iA = k6.A((String) object);
                            iB4 = iB2 + iA;
                            iB16 = i21 + iB4;
                            k8Var = this;
                            i14 += 3;
                            i13 = 1048575;
                        }
                    }
                    k8Var = this;
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 9:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        iM = u8.m(i17, unsafe.getObject(obj, j10), k8Var.K(i14));
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 10:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        d6 d6Var = (d6) unsafe.getObject(obj, j10);
                        iB5 = k6.B(i17 << 3);
                        i11 = d6Var.i();
                        iB6 = k6.B(i11);
                        iB4 = iB5 + iB6 + i11;
                        iB16 = i21 + iB4;
                        k8Var = this;
                        i14 += 3;
                        i13 = 1048575;
                    }
                    k8Var = this;
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 11:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        int i23 = unsafe.getInt(obj, j10);
                        iB2 = k6.B(i17 << 3);
                        iA = k6.B(i23);
                        iB4 = iB2 + iA;
                        iB16 = i21 + iB4;
                        k8Var = this;
                        i14 += 3;
                        i13 = 1048575;
                    }
                    k8Var = this;
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 12:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        long j14 = unsafe.getInt(obj, j10);
                        iB2 = k6.B(i17 << 3);
                        iA = k6.a(j14);
                        iB4 = iB2 + iA;
                        iB16 = i21 + iB4;
                        k8Var = this;
                        i14 += 3;
                        i13 = 1048575;
                    }
                    k8Var = this;
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 13:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        iB = k6.B(i17 << 3);
                        iB4 = iB + 4;
                        iB16 = i21 + iB4;
                        k8Var = this;
                        i14 += 3;
                        i13 = 1048575;
                    }
                    k8Var = this;
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 14:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        iB3 = k6.B(i17 << 3);
                        iB4 = iB3 + 8;
                        iB16 = i21 + iB4;
                        k8Var = this;
                        i14 += 3;
                        i13 = 1048575;
                    }
                    k8Var = this;
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 15:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        int i24 = unsafe.getInt(obj, j10);
                        iB2 = k6.B(i17 << 3);
                        iA = k6.B((i24 >> 31) ^ (i24 + i24));
                        iB4 = iB2 + iA;
                        iB16 = i21 + iB4;
                        k8Var = this;
                        i14 += 3;
                        i13 = 1048575;
                    }
                    k8Var = this;
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 16:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        long j15 = unsafe.getLong(obj, j10);
                        iB2 = k6.B(i17 << 3);
                        iA = k6.a((j15 >> 63) ^ (j15 + j15));
                        iB4 = iB2 + iA;
                        iB16 = i21 + iB4;
                        k8Var = this;
                        i14 += 3;
                        i13 = 1048575;
                    }
                    k8Var = this;
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 17:
                    if (k8Var.s(obj, i14, i16, i15, i10)) {
                        iM = k6.y(i17, (h8) unsafe.getObject(obj, j10), k8Var.K(i14));
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 18:
                    iM = u8.i(i17, (List) unsafe.getObject(obj, j10), false);
                    iB16 = i21 + iM;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 19:
                    iM = u8.g(i17, (List) unsafe.getObject(obj, j10), false);
                    iB16 = i21 + iM;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i25 = u8.f109359b;
                    if (list.size() == 0) {
                        iL = 0;
                    } else {
                        iL = u8.l(list) + (list.size() * k6.B(i17 << 3));
                    }
                    iB16 = iL + i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i26 = u8.f109359b;
                    size = list2.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = u8.q(list2);
                        iB7 = k6.B(i17 << 3);
                        iA2 = size * iB7;
                        iM = iQ + iA2;
                    }
                    iB16 = i21 + iM;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i27 = u8.f109359b;
                    size = list3.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = u8.k(list3);
                        iB7 = k6.B(i17 << 3);
                        iA2 = size * iB7;
                        iM = iQ + iA2;
                    }
                    iB16 = i21 + iM;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 23:
                    iM = u8.i(i17, (List) unsafe.getObject(obj, j10), false);
                    iB16 = i21 + iM;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 24:
                    iM = u8.g(i17, (List) unsafe.getObject(obj, j10), false);
                    iB16 = i21 + iM;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i28 = u8.f109359b;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM = 0;
                    } else {
                        iM = size2 * (k6.B(i17 << 3) + 1);
                    }
                    iB16 = i21 + iM;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    int i29 = u8.f109359b;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iL = 0;
                    } else {
                        iL = k6.B(i17 << 3) * size3;
                        if (list5 instanceof s7) {
                            s7 s7Var = (s7) list5;
                            for (int i30 = 0; i30 < size3; i30++) {
                                Object objH = s7Var.h();
                                if (objH instanceof d6) {
                                    int i31 = ((d6) objH).i();
                                    iL += k6.B(i31) + i31;
                                } else {
                                    iL += k6.A((String) objH);
                                }
                            }
                        } else {
                            for (int i32 = 0; i32 < size3; i32++) {
                                Object obj2 = list5.get(i32);
                                if (obj2 instanceof d6) {
                                    int i33 = ((d6) obj2).i();
                                    iL += k6.B(i33) + i33;
                                } else {
                                    iL += k6.A((String) obj2);
                                }
                            }
                        }
                    }
                    iB16 = iL + i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    s8 s8VarK = k8Var.K(i14);
                    int i34 = u8.f109359b;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iB8 = 0;
                    } else {
                        iB8 = k6.B(i17 << 3) * size4;
                        for (int i35 = 0; i35 < size4; i35++) {
                            Object obj3 = list6.get(i35);
                            if (obj3 instanceof r7) {
                                int iA3 = ((r7) obj3).a();
                                iB8 += k6.B(iA3) + iA3;
                            } else {
                                iB8 += k6.z((h8) obj3, s8VarK);
                            }
                        }
                    }
                    iB16 = i21 + iB8;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i36 = u8.f109359b;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iB9 = 0;
                    } else {
                        iB9 = size5 * k6.B(i17 << 3);
                        for (int i37 = 0; i37 < list7.size(); i37++) {
                            int i38 = ((d6) list7.get(i37)).i();
                            iB9 += k6.B(i38) + i38;
                        }
                    }
                    iB16 = i21 + iB9;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i39 = u8.f109359b;
                    size = list8.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = u8.p(list8);
                        iB7 = k6.B(i17 << 3);
                        iA2 = size * iB7;
                        iM = iQ + iA2;
                    }
                    iB16 = i21 + iM;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i40 = u8.f109359b;
                    size = list9.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = u8.f(list9);
                        iB7 = k6.B(i17 << 3);
                        iA2 = size * iB7;
                        iM = iQ + iA2;
                    }
                    iB16 = i21 + iM;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 31:
                    iM = u8.g(i17, (List) unsafe.getObject(obj, j10), false);
                    iB16 = i21 + iM;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 32:
                    iM = u8.i(i17, (List) unsafe.getObject(obj, j10), false);
                    iB16 = i21 + iM;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    int i41 = u8.f109359b;
                    size = list10.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = u8.n(list10);
                        iB7 = k6.B(i17 << 3);
                        iA2 = size * iB7;
                        iM = iQ + iA2;
                    }
                    iB16 = i21 + iM;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    int i42 = u8.f109359b;
                    size = list11.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = u8.o(list11);
                        iB7 = k6.B(i17 << 3);
                        iA2 = size * iB7;
                        iM = iQ + iA2;
                    }
                    iB16 = i21 + iM;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 35:
                    iJ = u8.j((List) unsafe.getObject(obj, j10));
                    if (iJ > 0) {
                        iB10 = k6.B(i17 << 3);
                        iB11 = k6.B(iJ);
                        iB9 = iB10 + iB11 + iJ;
                        iB16 = i21 + iB9;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 36:
                    iJ = u8.h((List) unsafe.getObject(obj, j10));
                    if (iJ > 0) {
                        iB10 = k6.B(i17 << 3);
                        iB11 = k6.B(iJ);
                        iB9 = iB10 + iB11 + iJ;
                        iB16 = i21 + iB9;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 37:
                    iJ = u8.l((List) unsafe.getObject(obj, j10));
                    if (iJ > 0) {
                        iB10 = k6.B(i17 << 3);
                        iB11 = k6.B(iJ);
                        iB9 = iB10 + iB11 + iJ;
                        iB16 = i21 + iB9;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 38:
                    iJ = u8.q((List) unsafe.getObject(obj, j10));
                    if (iJ > 0) {
                        iB10 = k6.B(i17 << 3);
                        iB11 = k6.B(iJ);
                        iB9 = iB10 + iB11 + iJ;
                        iB16 = i21 + iB9;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 39:
                    iJ = u8.k((List) unsafe.getObject(obj, j10));
                    if (iJ > 0) {
                        iB10 = k6.B(i17 << 3);
                        iB11 = k6.B(iJ);
                        iB9 = iB10 + iB11 + iJ;
                        iB16 = i21 + iB9;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 40:
                    iJ = u8.j((List) unsafe.getObject(obj, j10));
                    if (iJ > 0) {
                        iB10 = k6.B(i17 << 3);
                        iB11 = k6.B(iJ);
                        iB9 = iB10 + iB11 + iJ;
                        iB16 = i21 + iB9;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 41:
                    iJ = u8.h((List) unsafe.getObject(obj, j10));
                    if (iJ > 0) {
                        iB10 = k6.B(i17 << 3);
                        iB11 = k6.B(iJ);
                        iB9 = iB10 + iB11 + iJ;
                        iB16 = i21 + iB9;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j10);
                    int i43 = u8.f109359b;
                    iJ = list12.size();
                    if (iJ > 0) {
                        iB10 = k6.B(i17 << 3);
                        iB11 = k6.B(iJ);
                        iB9 = iB10 + iB11 + iJ;
                        iB16 = i21 + iB9;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 43:
                    iJ = u8.p((List) unsafe.getObject(obj, j10));
                    if (iJ > 0) {
                        iB10 = k6.B(i17 << 3);
                        iB11 = k6.B(iJ);
                        iB9 = iB10 + iB11 + iJ;
                        iB16 = i21 + iB9;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 44:
                    iJ = u8.f((List) unsafe.getObject(obj, j10));
                    if (iJ > 0) {
                        iB10 = k6.B(i17 << 3);
                        iB11 = k6.B(iJ);
                        iB9 = iB10 + iB11 + iJ;
                        iB16 = i21 + iB9;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 45:
                    iJ = u8.h((List) unsafe.getObject(obj, j10));
                    if (iJ > 0) {
                        iB10 = k6.B(i17 << 3);
                        iB11 = k6.B(iJ);
                        iB9 = iB10 + iB11 + iJ;
                        iB16 = i21 + iB9;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 46:
                    iJ = u8.j((List) unsafe.getObject(obj, j10));
                    if (iJ > 0) {
                        iB10 = k6.B(i17 << 3);
                        iB11 = k6.B(iJ);
                        iB9 = iB10 + iB11 + iJ;
                        iB16 = i21 + iB9;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 47:
                    iJ = u8.n((List) unsafe.getObject(obj, j10));
                    if (iJ > 0) {
                        iB10 = k6.B(i17 << 3);
                        iB11 = k6.B(iJ);
                        iB9 = iB10 + iB11 + iJ;
                        iB16 = i21 + iB9;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 48:
                    iJ = u8.o((List) unsafe.getObject(obj, j10));
                    if (iJ > 0) {
                        iB10 = k6.B(i17 << 3);
                        iB11 = k6.B(iJ);
                        iB9 = iB10 + iB11 + iJ;
                        iB16 = i21 + iB9;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j10);
                    s8 s8VarK2 = k8Var.K(i14);
                    int i44 = u8.f109359b;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iY = 0;
                    } else {
                        iY = 0;
                        for (int i45 = 0; i45 < size6; i45++) {
                            iY += k6.y(i17, (h8) list13.get(i45), s8VarK2);
                        }
                    }
                    iB16 = i21 + iY;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 50:
                    b8 b8Var = (b8) unsafe.getObject(obj, j10);
                    if (!b8Var.isEmpty()) {
                        Iterator it = b8Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 51:
                    if (k8Var.v(obj, i17, i14)) {
                        iB12 = k6.B(i17 << 3);
                        iM = iB12 + 8;
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 52:
                    if (k8Var.v(obj, i17, i14)) {
                        iB13 = k6.B(i17 << 3);
                        iM = iB13 + 4;
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 53:
                    if (k8Var.v(obj, i17, i14)) {
                        long jI = I(obj, j10);
                        iQ = k6.B(i17 << 3);
                        iA2 = k6.a(jI);
                        iM = iQ + iA2;
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 54:
                    if (k8Var.v(obj, i17, i14)) {
                        long jI2 = I(obj, j10);
                        iQ = k6.B(i17 << 3);
                        iA2 = k6.a(jI2);
                        iM = iQ + iA2;
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 55:
                    if (k8Var.v(obj, i17, i14)) {
                        long jD = D(obj, j10);
                        iQ = k6.B(i17 << 3);
                        iA2 = k6.a(jD);
                        iM = iQ + iA2;
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                    if (k8Var.v(obj, i17, i14)) {
                        iB12 = k6.B(i17 << 3);
                        iM = iB12 + 8;
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    if (k8Var.v(obj, i17, i14)) {
                        iB13 = k6.B(i17 << 3);
                        iM = iB13 + 4;
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                    if (k8Var.v(obj, i17, i14)) {
                        iM = k6.B(i17 << 3) + 1;
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (k8Var.v(obj, i17, i14)) {
                        int i46 = i17 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof d6) {
                            iB14 = k6.B(i46);
                            i12 = ((d6) object2).i();
                            iB15 = k6.B(i12);
                            iM = iB14 + iB15 + i12;
                            iB16 = i21 + iM;
                        } else {
                            iQ = k6.B(i46);
                            iA2 = k6.A((String) object2);
                            iM = iQ + iA2;
                            iB16 = i21 + iM;
                        }
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 60:
                    if (k8Var.v(obj, i17, i14)) {
                        iM = u8.m(i17, unsafe.getObject(obj, j10), k8Var.K(i14));
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 61:
                    if (k8Var.v(obj, i17, i14)) {
                        d6 d6Var2 = (d6) unsafe.getObject(obj, j10);
                        iB14 = k6.B(i17 << 3);
                        i12 = d6Var2.i();
                        iB15 = k6.B(i12);
                        iM = iB14 + iB15 + i12;
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                    if (k8Var.v(obj, i17, i14)) {
                        int iD = D(obj, j10);
                        iQ = k6.B(i17 << 3);
                        iA2 = k6.B(iD);
                        iM = iQ + iA2;
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 63:
                    if (k8Var.v(obj, i17, i14)) {
                        long jD2 = D(obj, j10);
                        iQ = k6.B(i17 << 3);
                        iA2 = k6.a(jD2);
                        iM = iQ + iA2;
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 64:
                    if (k8Var.v(obj, i17, i14)) {
                        iB13 = k6.B(i17 << 3);
                        iM = iB13 + 4;
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 65:
                    if (k8Var.v(obj, i17, i14)) {
                        iB12 = k6.B(i17 << 3);
                        iM = iB12 + 8;
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 66:
                    if (k8Var.v(obj, i17, i14)) {
                        int iD2 = D(obj, j10);
                        iQ = k6.B(i17 << 3);
                        iA2 = k6.B((iD2 >> 31) ^ (iD2 + iD2));
                        iM = iQ + iA2;
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 67:
                    if (k8Var.v(obj, i17, i14)) {
                        long jI3 = I(obj, j10);
                        iQ = k6.B(i17 << 3);
                        iA2 = k6.a((jI3 >> 63) ^ (jI3 + jI3));
                        iM = iQ + iA2;
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    if (k8Var.v(obj, i17, i14)) {
                        iM = k6.y(i17, (h8) unsafe.getObject(obj, j10), k8Var.K(i14));
                        iB16 = i21 + iM;
                    } else {
                        iB16 = i21;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                default:
                    iB16 = i21;
                    i14 += 3;
                    i13 = 1048575;
                    break;
            }
        }
        int iA4 = iB16 + ((e7) obj).zzc.a();
        if (!k8Var.f109173f) {
            return iA4;
        }
        v6 v6Var = ((b7) obj).zzb;
        int iC = v6Var.f109364a.c();
        int iB17 = 0;
        for (int i47 = 0; i47 < iC; i47++) {
            Map.Entry entryG = v6Var.f109364a.g(i47);
            iB17 += v6.b((u6) ((x8) entryG).k(), entryG.getValue());
        }
        for (Map.Entry entry2 : v6Var.f109364a.d()) {
            iB17 += v6.b((u6) entry2.getKey(), entry2.getValue());
        }
        return iA4 + iB17;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b6 A[LOOP:1: B:45:0x00a5->B:50:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.s8
    public final boolean d(Object obj) {
        int i10;
        int i11;
        List list;
        s8 s8VarK;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i13 < this.f109175h) {
            int[] iArr = this.f109174g;
            int[] iArr2 = this.f109168a;
            int i16 = iArr[i13];
            int i17 = iArr2[i16];
            int iH = this.H(i16);
            int i18 = this.f109168a[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i14 = f109167m.getInt(obj, i19);
                }
                i11 = i14;
                i10 = i19;
            } else {
                i10 = i15;
                i11 = i14;
            }
            k8<T> k8Var = this;
            Object obj2 = obj;
            if ((268435456 & iH) != 0 && !k8Var.s(obj2, i16, i10, i11, i20)) {
                return false;
            }
            int iG = G(iH);
            if (iG == 9 || iG == 17) {
                if (k8Var.s(obj2, i16, i10, i11, i20) && !t(obj2, iH, k8Var.K(i16))) {
                    return false;
                }
            } else if (iG == 27) {
                list = (List) m9.k(obj2, iH & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    s8VarK = k8Var.K(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!s8VarK.d(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iG == 60 || iG == 68) {
                if (k8Var.v(obj2, i17, i16) && !t(obj2, iH, k8Var.K(i16))) {
                    return false;
                }
            } else if (iG == 49) {
                list = (List) m9.k(obj2, iH & 1048575);
                if (list.isEmpty()) {
                    s8VarK = k8Var.K(i16);
                    while (i12 < list.size()) {
                        if (!s8VarK.d(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iG == 50 && !((b8) m9.k(obj2, iH & 1048575)).isEmpty()) {
                throw null;
            }
            i13++;
            this = k8Var;
            obj = obj2;
            i15 = i10;
            i14 = i11;
        }
        return !this.f109173f || ((b7) obj).zzb.h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    @Override // com.google.android.gms.internal.play_billing.s8
    public final void e(Object obj, s9 s9Var) throws IOException {
        Map.Entry entry;
        int i10;
        k8<T> k8Var = this;
        if (k8Var.f109173f) {
            v6 v6Var = ((b7) obj).zzb;
            if (v6Var.f109364a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) v6Var.e().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = k8Var.f109168a;
        Unsafe unsafe = f109167m;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < iArr.length) {
            int iH = k8Var.H(i13);
            int[] iArr2 = k8Var.f109168a;
            int iG = G(iH);
            int i15 = iArr2[i13];
            if (iG <= 17) {
                int i16 = iArr2[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j10 = iH & i11;
            switch (iG) {
                case 0:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.b(i15, m9.f(obj, j10));
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 1:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.v(i15, m9.g(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 2:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.D(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 3:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.B(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 4:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.F(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 5:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.z(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 6:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.c(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 7:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.l(i15, m9.B(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 8:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        x(i15, unsafe.getObject(obj, j10), s9Var);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 9:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.j(i15, unsafe.getObject(obj, j10), k8Var.K(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 10:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.x(i15, (d6) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 11:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.s(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 12:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.e(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 13:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.H(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 14:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.J(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 15:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.p(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 16:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.o(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 17:
                    if (k8Var.s(obj, i13, i12, i14, i10)) {
                        s9Var.n(i15, unsafe.getObject(obj, j10), k8Var.K(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 18:
                    u8.w(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 19:
                    u8.A(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 20:
                    u8.C(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 21:
                    u8.d(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 22:
                    u8.B(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 23:
                    u8.z(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 24:
                    u8.y(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 25:
                    u8.v(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 26:
                    int i18 = k8Var.f109168a[i13];
                    List list = (List) unsafe.getObject(obj, j10);
                    int i19 = u8.f109359b;
                    if (list != null && !list.isEmpty()) {
                        s9Var.A(i18, list);
                    }
                    break;
                case 27:
                    int i20 = k8Var.f109168a[i13];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    s8 s8VarK = k8Var.K(i13);
                    int i21 = u8.f109359b;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            ((l6) s9Var).j(i20, list2.get(i22), s8VarK);
                        }
                    }
                    break;
                case 28:
                    int i23 = k8Var.f109168a[i13];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i24 = u8.f109359b;
                    if (list3 != null && !list3.isEmpty()) {
                        s9Var.C(i23, list3);
                    }
                    break;
                case 29:
                    u8.c(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 30:
                    u8.x(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 31:
                    u8.D(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 32:
                    u8.E(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 33:
                    u8.a(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 34:
                    u8.b(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    k8Var = this;
                    break;
                case 35:
                    u8.w(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, true);
                    break;
                case 36:
                    u8.A(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, true);
                    break;
                case 37:
                    u8.C(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, true);
                    break;
                case 38:
                    u8.d(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, true);
                    break;
                case 39:
                    u8.B(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, true);
                    break;
                case 40:
                    u8.z(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, true);
                    break;
                case 41:
                    u8.y(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, true);
                    break;
                case 42:
                    u8.v(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, true);
                    break;
                case 43:
                    u8.c(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, true);
                    break;
                case 44:
                    u8.x(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, true);
                    break;
                case 45:
                    u8.D(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, true);
                    break;
                case 46:
                    u8.E(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, true);
                    break;
                case 47:
                    u8.a(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, true);
                    break;
                case 48:
                    u8.b(k8Var.f109168a[i13], (List) unsafe.getObject(obj, j10), s9Var, true);
                    break;
                case 49:
                    int i25 = k8Var.f109168a[i13];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    s8 s8VarK2 = k8Var.K(i13);
                    int i26 = u8.f109359b;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            ((l6) s9Var).n(i25, list4.get(i27), s8VarK2);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j10) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.b(i15, B(obj, j10));
                    }
                    break;
                case 52:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.v(i15, C(obj, j10));
                    }
                    break;
                case 53:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.D(i15, I(obj, j10));
                    }
                    break;
                case 54:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.B(i15, I(obj, j10));
                    }
                    break;
                case 55:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.F(i15, D(obj, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.z(i15, I(obj, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.c(i15, D(obj, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.l(i15, w(obj, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (k8Var.v(obj, i15, i13)) {
                        x(i15, unsafe.getObject(obj, j10), s9Var);
                    }
                    break;
                case 60:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.j(i15, unsafe.getObject(obj, j10), k8Var.K(i13));
                    }
                    break;
                case 61:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.x(i15, (d6) unsafe.getObject(obj, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.s(i15, D(obj, j10));
                    }
                    break;
                case 63:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.e(i15, D(obj, j10));
                    }
                    break;
                case 64:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.H(i15, D(obj, j10));
                    }
                    break;
                case 65:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.J(i15, I(obj, j10));
                    }
                    break;
                case 66:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.p(i15, D(obj, j10));
                    }
                    break;
                case 67:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.o(i15, I(obj, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    if (k8Var.v(obj, i15, i13)) {
                        s9Var.n(i15, unsafe.getObject(obj, j10), k8Var.K(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
            k8Var = this;
        }
        if (entry != null) {
            throw null;
        }
        ((e7) obj).zzc.l(s9Var);
    }

    @Override // com.google.android.gms.internal.play_billing.s8
    public final void f(Object obj, Object obj2) {
        i(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f109168a.length; i10 += 3) {
            int iH = H(i10);
            int i11 = 1048575 & iH;
            int[] iArr = this.f109168a;
            int iG = G(iH);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iG) {
                case 0:
                    if (r(obj2, i10)) {
                        m9.t(obj, j10, m9.f(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 1:
                    if (r(obj2, i10)) {
                        m9.u(obj, j10, m9.g(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 2:
                    if (r(obj2, i10)) {
                        m9.w(obj, j10, m9.i(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 3:
                    if (r(obj2, i10)) {
                        m9.w(obj, j10, m9.i(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 4:
                    if (r(obj2, i10)) {
                        m9.v(obj, j10, m9.h(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 5:
                    if (r(obj2, i10)) {
                        m9.w(obj, j10, m9.i(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 6:
                    if (r(obj2, i10)) {
                        m9.v(obj, j10, m9.h(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 7:
                    if (r(obj2, i10)) {
                        m9.r(obj, j10, m9.B(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 8:
                    if (r(obj2, i10)) {
                        m9.x(obj, j10, m9.k(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 9:
                    k(obj, obj2, i10);
                    break;
                case 10:
                    if (r(obj2, i10)) {
                        m9.x(obj, j10, m9.k(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 11:
                    if (r(obj2, i10)) {
                        m9.v(obj, j10, m9.h(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 12:
                    if (r(obj2, i10)) {
                        m9.v(obj, j10, m9.h(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 13:
                    if (r(obj2, i10)) {
                        m9.v(obj, j10, m9.h(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 14:
                    if (r(obj2, i10)) {
                        m9.w(obj, j10, m9.i(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 15:
                    if (r(obj2, i10)) {
                        m9.v(obj, j10, m9.h(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 16:
                    if (r(obj2, i10)) {
                        m9.w(obj, j10, m9.i(obj2, j10));
                        m(obj, i10);
                    }
                    break;
                case 17:
                    k(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i7 i7VarE = (i7) m9.k(obj, j10);
                    i7 i7Var = (i7) m9.k(obj2, j10);
                    int size = i7VarE.size();
                    int size2 = i7Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!i7VarE.h()) {
                            i7VarE = i7VarE.e(size2 + size);
                        }
                        i7VarE.addAll(i7Var);
                    }
                    if (size > 0) {
                        i7Var = i7VarE;
                    }
                    m9.x(obj, j10, i7Var);
                    break;
                case 50:
                    int i13 = u8.f109359b;
                    m9.x(obj, j10, c8.a(m9.k(obj, j10), m9.k(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (v(obj2, i12, i10)) {
                        m9.x(obj, j10, m9.k(obj2, j10));
                        n(obj, i12, i10);
                    }
                    break;
                case 60:
                    l(obj, obj2, i10);
                    break;
                case 61:
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (v(obj2, i12, i10)) {
                        m9.x(obj, j10, m9.k(obj2, j10));
                        n(obj, i12, i10);
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    l(obj, obj2, i10);
                    break;
            }
        }
        u8.u(this.f109177j, obj, obj2);
        if (this.f109173f) {
            u8.t(this.f109178k, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s8
    public final boolean g(Object obj, Object obj2) {
        boolean zE;
        for (int i10 = 0; i10 < this.f109168a.length; i10 += 3) {
            int iH = H(i10);
            long j10 = iH & 1048575;
            switch (G(iH)) {
                case 0:
                    if (!q(obj, obj2, i10) || Double.doubleToLongBits(m9.f(obj, j10)) != Double.doubleToLongBits(m9.f(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!q(obj, obj2, i10) || Float.floatToIntBits(m9.g(obj, j10)) != Float.floatToIntBits(m9.g(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!q(obj, obj2, i10) || m9.i(obj, j10) != m9.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!q(obj, obj2, i10) || m9.i(obj, j10) != m9.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!q(obj, obj2, i10) || m9.h(obj, j10) != m9.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!q(obj, obj2, i10) || m9.i(obj, j10) != m9.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!q(obj, obj2, i10) || m9.h(obj, j10) != m9.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!q(obj, obj2, i10) || m9.B(obj, j10) != m9.B(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!q(obj, obj2, i10) || !u8.e(m9.k(obj, j10), m9.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!q(obj, obj2, i10) || !u8.e(m9.k(obj, j10), m9.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!q(obj, obj2, i10) || !u8.e(m9.k(obj, j10), m9.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!q(obj, obj2, i10) || m9.h(obj, j10) != m9.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!q(obj, obj2, i10) || m9.h(obj, j10) != m9.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!q(obj, obj2, i10) || m9.h(obj, j10) != m9.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!q(obj, obj2, i10) || m9.i(obj, j10) != m9.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!q(obj, obj2, i10) || m9.h(obj, j10) != m9.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!q(obj, obj2, i10) || m9.i(obj, j10) != m9.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!q(obj, obj2, i10) || !u8.e(m9.k(obj, j10), m9.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zE = u8.e(m9.k(obj, j10), m9.k(obj2, j10));
                    break;
                case 50:
                    zE = u8.e(m9.k(obj, j10), m9.k(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                case 60:
                case 61:
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    long jE = E(i10) & 1048575;
                    if (m9.h(obj, jE) != m9.h(obj2, jE) || !u8.e(m9.k(obj, j10), m9.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zE) {
                return false;
            }
        }
        if (!((e7) obj).zzc.equals(((e7) obj2).zzc)) {
            return false;
        }
        if (this.f109173f) {
            return ((b7) obj).zzb.equals(((b7) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.s8
    public final void h(Object obj, byte[] bArr, int i10, int i11, r5 r5Var) throws IOException {
        y(obj, bArr, i10, i11, 0, r5Var);
    }

    @Override // com.google.android.gms.internal.play_billing.s8
    public final Object j() {
        return ((e7) this.f109172e).r();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 43821. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int y(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.play_billing.r5 r39) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 4382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.k8.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.r5):int");
    }
}
