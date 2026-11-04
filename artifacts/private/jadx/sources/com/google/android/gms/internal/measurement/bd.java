package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class bd<T> implements jd<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f108302l = new int[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Unsafe f108303m = ce.v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f108304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f108305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f108306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f108307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yc f108308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f108309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f108310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f108311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f108312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final vd f108313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final cb f108314k;

    private bd(int[] iArr, Object[] objArr, int i10, int i11, yc ycVar, boolean z10, int[] iArr2, int i12, int i13, dd ddVar, jc jcVar, vd vdVar, cb cbVar, tc tcVar) {
        this.f108304a = iArr;
        this.f108305b = objArr;
        this.f108306c = i10;
        this.f108307d = i11;
        boolean z11 = false;
        if (cbVar != null && (ycVar instanceof nb)) {
            z11 = true;
        }
        this.f108309f = z11;
        this.f108310g = iArr2;
        this.f108311h = i12;
        this.f108312i = i13;
        this.f108313j = vdVar;
        this.f108314k = cbVar;
        this.f108308e = ycVar;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x028b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0291  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:132:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:171:0x0372  */
    /* JADX WARN: Code duplicated, block: B:187:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:190:0x03d2  */
    static bd B(Class cls, vc vcVar, dd ddVar, jc jcVar, vd vdVar, cb cbVar, tc tcVar) {
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
        Field fieldC;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field fieldC2;
        int i36;
        Object obj2;
        Field fieldC3;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        int i40;
        char cCharAt13;
        if (!(vcVar instanceof id)) {
            throw null;
        }
        id idVar = (id) vcVar;
        String strB = idVar.b();
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
            iArr = f108302l;
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
        Unsafe unsafe = f108303m;
        Object[] objArrC = idVar.c();
        Class<?> cls2 = idVar.g().getClass();
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
            id idVar2 = idVar;
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
                    } else if (idVar2.h() == 1 || i86 != 0) {
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
                        fieldC2 = (Field) obj;
                    } else {
                        fieldC2 = C(cls2, (String) obj);
                        objArrC[i35] = fieldC2;
                    }
                    int i96 = i16;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC2);
                    i36 = i35 + 1;
                    obj2 = objArrC[i36];
                    i27 = i96;
                    if (obj2 instanceof Field) {
                        fieldC3 = (Field) obj2;
                    } else {
                        fieldC3 = C(cls2, (String) obj2);
                        objArrC[i36] = fieldC3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldC3);
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
                    fieldC2 = (Field) obj;
                } else {
                    fieldC2 = C(cls2, (String) obj);
                    objArrC[i35] = fieldC2;
                }
                int i98 = i16;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC2);
                i36 = i35 + 1;
                obj2 = objArrC[i36];
                i27 = i98;
                if (obj2 instanceof Field) {
                    fieldC3 = (Field) obj2;
                } else {
                    fieldC3 = C(cls2, (String) obj2);
                    objArrC[i36] = fieldC3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldC3);
                strB = strB;
                i29 = i97;
                i26 = i91;
                i28 = 0;
                c10 = 55296;
            } else {
                i27 = i16;
                int i99 = i15 + 1;
                Field fieldC4 = C(cls2, (String) objArrC[i15]);
                if (i85 == 9 || i85 == 17) {
                    int i100 = i76 / 3;
                    objArr[i100 + i100 + 1] = fieldC4.getType();
                } else {
                    if (i85 != 27) {
                        if (i85 == 49) {
                            i15 += 2;
                            i31 = 1;
                        } else if (i85 == 12 || i85 == 30 || i85 == 44) {
                            if (idVar2.h() == 1 || i86 != 0) {
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC4);
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
                                fieldC = (Field) obj3;
                            } else {
                                fieldC = C(cls2, (String) obj3);
                                objArrC[i109] = fieldC;
                            }
                            int i110 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldC);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC4);
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
            idVar = idVar2;
            length = length;
            i16 = i27;
        }
        return new bd(iArr3, objArr, i11, i13, idVar.g(), false, iArr, i14, i71, ddVar, jcVar, vdVar, cbVar, tcVar);
    }

    private static Field C(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(string);
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    private final void D(Object obj, Object obj2, int i10) {
        if (s(obj2, i10)) {
            int iN = N(i10) & 1048575;
            Unsafe unsafe = f108303m;
            long j10 = iN;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i11 = this.f108304a[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            jd jdVarF = F(i10);
            if (!s(obj, i10)) {
                if (c(object)) {
                    Object objA = jdVarF.a();
                    jdVarF.g(objA, object);
                    unsafe.putObject(obj, j10, objA);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                t(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!c(object2)) {
                Object objA2 = jdVarF.a();
                jdVarF.g(objA2, object2);
                unsafe.putObject(obj, j10, objA2);
                object2 = objA2;
            }
            jdVarF.g(object2, object);
        }
    }

    private final void E(Object obj, Object obj2, int i10) {
        int[] iArr = this.f108304a;
        int i11 = iArr[i10];
        if (u(obj2, i11, i10)) {
            int iN = N(i10) & 1048575;
            Unsafe unsafe = f108303m;
            long j10 = iN;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i12 = iArr[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            jd jdVarF = F(i10);
            if (!u(obj, i11, i10)) {
                if (c(object)) {
                    Object objA = jdVarF.a();
                    jdVarF.g(objA, object);
                    unsafe.putObject(obj, j10, objA);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                v(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!c(object2)) {
                Object objA2 = jdVarF.a();
                jdVarF.g(objA2, object2);
                unsafe.putObject(obj, j10, objA2);
                object2 = objA2;
            }
            jdVarF.g(object2, object);
        }
    }

    private final jd F(int i10) {
        Object[] objArr = this.f108305b;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        jd jdVar = (jd) objArr[i12];
        if (jdVar != null) {
            return jdVar;
        }
        jd jdVarB = gd.a().b((Class) objArr[i12 + 1]);
        objArr[i12] = jdVarB;
        return jdVarB;
    }

    private final Object G(int i10) {
        int i11 = i10 / 3;
        return this.f108305b[i11 + i11];
    }

    private final vb H(int i10) {
        int i11 = i10 / 3;
        return (vb) this.f108305b[i11 + i11 + 1];
    }

    private final Object I(Object obj, int i10) {
        jd jdVarF = F(i10);
        int iN = N(i10) & 1048575;
        if (!s(obj, i10)) {
            return jdVarF.a();
        }
        Object object = f108303m.getObject(obj, iN);
        if (c(object)) {
            return object;
        }
        Object objA = jdVarF.a();
        if (object != null) {
            jdVarF.g(objA, object);
        }
        return objA;
    }

    private final void J(Object obj, int i10, Object obj2) {
        f108303m.putObject(obj, N(i10) & 1048575, obj2);
        t(obj, i10);
    }

    private final Object K(Object obj, int i10, int i11) {
        jd jdVarF = F(i11);
        if (!u(obj, i10, i11)) {
            return jdVarF.a();
        }
        Object object = f108303m.getObject(obj, N(i11) & 1048575);
        if (c(object)) {
            return object;
        }
        Object objA = jdVarF.a();
        if (object != null) {
            jdVarF.g(objA, object);
        }
        return objA;
    }

    private final void L(Object obj, int i10, int i11, Object obj2) {
        f108303m.putObject(obj, N(i11) & 1048575, obj2);
        v(obj, i10, i11);
    }

    private static boolean M(Object obj, int i10, jd jdVar) {
        return jdVar.d(ce.s(obj, i10 & 1048575));
    }

    private final int N(int i10) {
        return this.f108304a[i10 + 1];
    }

    private final int O(int i10) {
        return this.f108304a[i10 + 2];
    }

    private static int P(int i10) {
        return (i10 >>> 20) & 255;
    }

    private static boolean c(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof qb) {
            return ((qb) obj).k();
        }
        return true;
    }

    private static void k(Object obj) {
        if (!c(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double l(Object obj, long j10) {
        return ((Double) ce.s(obj, j10)).doubleValue();
    }

    private static float m(Object obj, long j10) {
        return ((Float) ce.s(obj, j10)).floatValue();
    }

    private static int n(Object obj, long j10) {
        return ((Integer) ce.s(obj, j10)).intValue();
    }

    private static long o(Object obj, long j10) {
        return ((Long) ce.s(obj, j10)).longValue();
    }

    private static boolean p(Object obj, long j10) {
        return ((Boolean) ce.s(obj, j10)).booleanValue();
    }

    private final boolean q(Object obj, Object obj2, int i10) {
        return s(obj, i10) == s(obj2, i10);
    }

    private final boolean r(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return s(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private final boolean s(Object obj, int i10) {
        int iO = O(i10);
        long j10 = iO & 1048575;
        if (j10 != 1048575) {
            return ((1 << (iO >>> 20)) & ce.i(obj, j10)) != 0;
        }
        int iN = N(i10);
        long j11 = iN & 1048575;
        switch (P(iN)) {
            case 0:
                return Double.doubleToRawLongBits(ce.q(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(ce.o(obj, j11)) != 0;
            case 2:
                return ce.k(obj, j11) != 0;
            case 3:
                return ce.k(obj, j11) != 0;
            case 4:
                return ce.i(obj, j11) != 0;
            case 5:
                return ce.k(obj, j11) != 0;
            case 6:
                return ce.i(obj, j11) != 0;
            case 7:
                return ce.m(obj, j11);
            case 8:
                Object objS = ce.s(obj, j11);
                if (objS instanceof String) {
                    return !((String) objS).isEmpty();
                }
                if (objS instanceof ra) {
                    return !ra.f108771b.equals(objS);
                }
                throw new IllegalArgumentException();
            case 9:
                return ce.s(obj, j11) != null;
            case 10:
                return !ra.f108771b.equals(ce.s(obj, j11));
            case 11:
                return ce.i(obj, j11) != 0;
            case 12:
                return ce.i(obj, j11) != 0;
            case 13:
                return ce.i(obj, j11) != 0;
            case 14:
                return ce.k(obj, j11) != 0;
            case 15:
                return ce.i(obj, j11) != 0;
            case 16:
                return ce.k(obj, j11) != 0;
            case 17:
                return ce.s(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void t(Object obj, int i10) {
        int iO = O(i10);
        long j10 = 1048575 & iO;
        if (j10 == 1048575) {
            return;
        }
        ce.j(obj, j10, (1 << (iO >>> 20)) | ce.i(obj, j10));
    }

    private final boolean u(Object obj, int i10, int i11) {
        return ce.i(obj, (long) (O(i11) & 1048575)) == i10;
    }

    private final void v(Object obj, int i10, int i11) {
        ce.j(obj, O(i11) & 1048575, i10);
    }

    private final int w(int i10, int i11) {
        int[] iArr = this.f108304a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
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

    private static final int x(byte[] bArr, int i10, int i11, ge geVar, Class cls, fa faVar) throws IOException {
        ge geVar2 = ge.f108454c;
        switch (geVar.ordinal()) {
            case 0:
                int i12 = i10 + 8;
                faVar.f108427c = Double.valueOf(Double.longBitsToDouble(ga.e(bArr, i10)));
                return i12;
            case 1:
                int i13 = i10 + 4;
                faVar.f108427c = Float.valueOf(Float.intBitsToFloat(ga.d(bArr, i10)));
                return i13;
            case 2:
            case 3:
                int iC = ga.c(bArr, i10, faVar);
                faVar.f108427c = Long.valueOf(faVar.f108426b);
                return iC;
            case 4:
            case 12:
            case 13:
                int iA = ga.a(bArr, i10, faVar);
                faVar.f108427c = Integer.valueOf(faVar.f108425a);
                return iA;
            case 5:
            case 15:
                int i14 = i10 + 8;
                faVar.f108427c = Long.valueOf(ga.e(bArr, i10));
                return i14;
            case 6:
            case 14:
                int i15 = i10 + 4;
                faVar.f108427c = Integer.valueOf(ga.d(bArr, i10));
                return i15;
            case 7:
                int iC2 = ga.c(bArr, i10, faVar);
                faVar.f108427c = Boolean.valueOf(faVar.f108426b != 0);
                return iC2;
            case 8:
                return ga.f(bArr, i10, faVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return ga.h(gd.a().b(cls), bArr, i10, i11, faVar);
            case 11:
                return ga.g(bArr, i10, faVar);
            case 16:
                int iA2 = ga.a(bArr, i10, faVar);
                faVar.f108427c = Integer.valueOf(ta.a(faVar.f108425a));
                return iA2;
            case 17:
                int iC3 = ga.c(bArr, i10, faVar);
                faVar.f108427c = Long.valueOf(ta.b(faVar.f108426b));
                return iC3;
        }
    }

    private static final void y(int i10, Object obj, ie ieVar) throws IOException {
        if (obj instanceof String) {
            ieVar.m(i10, (String) obj);
        } else {
            ieVar.q(i10, (ra) obj);
        }
    }

    static wd z(Object obj) {
        qb qbVar = (qb) obj;
        wd wdVar = qbVar.zzc;
        if (wdVar != wd.a()) {
            return wdVar;
        }
        wd wdVarB = wd.b();
        qbVar.zzc = wdVarB;
        return wdVarB;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 46001. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int A(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.measurement.fa r40) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 4600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.bd.A(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.fa):int");
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final Object a() {
        return ((qb) this.f108308e).m();
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0391  */
    /* JADX WARN: Code duplicated, block: B:84:0x01df  */
    @Override // com.google.android.gms.internal.measurement.jd
    public final int b(Object obj) {
        int i10;
        int iG;
        int iG2;
        int iA;
        int iG3;
        int iG4;
        int iG5;
        int i11;
        int iG6;
        int iE;
        int iT;
        int size;
        int iU;
        int iG7;
        int iG8;
        int iG9;
        int iA2;
        int iC;
        int iG10;
        int iG11;
        int iG12;
        int iG13;
        int iG14;
        int iG15;
        int i12;
        int iG16;
        bd<T> bdVar = this;
        Unsafe unsafe = f108303m;
        int i13 = 0;
        int i14 = 0;
        int iG17 = 0;
        int i15 = 1048575;
        while (true) {
            int[] iArr = bdVar.f108304a;
            if (i13 >= iArr.length) {
                int i16 = iG17 + ((qb) obj).zzc.i();
                if (!bdVar.f108309f) {
                    return i16;
                }
                rd rdVar = ((nb) obj).zzb.f108447a;
                int iC2 = rdVar.c();
                int iJ = 0;
                for (int i17 = 0; i17 < iC2; i17++) {
                    Map.Entry entryD = rdVar.d(i17);
                    iJ += gb.j((fb) ((od) entryD).k(), entryD.getValue());
                }
                for (Map.Entry entry : rdVar.e()) {
                    iJ += gb.j((fb) entry.getKey(), entry.getValue());
                }
                return i16 + iJ;
            }
            int iN = bdVar.N(i13);
            int iP = P(iN);
            int i18 = iArr[i13];
            int i19 = iArr[i13 + 2];
            int i20 = i19 & 1048575;
            if (iP <= 17) {
                if (i20 != i15) {
                    i14 = i20 == 1048575 ? 0 : unsafe.getInt(obj, i20);
                    i15 = i20;
                }
                i10 = 1 << (i19 >>> 20);
            } else {
                i10 = 0;
            }
            int i21 = iN & 1048575;
            if (iP >= hb.f108514q3.a()) {
                hb.D3.a();
            }
            long j10 = i21;
            switch (iP) {
                case 0:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        iG17 += wa.G(i18 << 3) + 8;
                    }
                    break;
                case 1:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        iG = wa.G(i18 << 3);
                        iG4 = iG + 4;
                        iG17 += iG4;
                    }
                    bdVar = this;
                    break;
                case 2:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iG2 = wa.G(i18 << 3);
                        iA = wa.a(j11);
                        iG4 = iG2 + iA;
                        iG17 += iG4;
                    }
                    bdVar = this;
                    break;
                case 3:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        long j12 = unsafe.getLong(obj, j10);
                        iG2 = wa.G(i18 << 3);
                        iA = wa.a(j12);
                        iG4 = iG2 + iA;
                        iG17 += iG4;
                    }
                    bdVar = this;
                    break;
                case 4:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        long j13 = unsafe.getInt(obj, j10);
                        iG2 = wa.G(i18 << 3);
                        iA = wa.a(j13);
                        iG4 = iG2 + iA;
                        iG17 += iG4;
                    }
                    bdVar = this;
                    break;
                case 5:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        iG3 = wa.G(i18 << 3);
                        iG4 = iG3 + 8;
                        iG17 += iG4;
                    }
                    bdVar = this;
                    break;
                case 6:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        iG = wa.G(i18 << 3);
                        iG4 = iG + 4;
                        iG17 += iG4;
                    }
                    bdVar = this;
                    break;
                case 7:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        iG4 = wa.G(i18 << 3) + 1;
                        iG17 += iG4;
                    }
                    bdVar = this;
                    break;
                case 8:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        int i22 = i18 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof ra) {
                            iG5 = wa.G(i22);
                            i11 = ((ra) object).i();
                            iG6 = wa.G(i11);
                            iG4 = iG5 + iG6 + i11;
                            iG17 += iG4;
                        } else {
                            iG2 = wa.G(i22);
                            iA = wa.b((String) object);
                            iG4 = iG2 + iA;
                            iG17 += iG4;
                        }
                    }
                    bdVar = this;
                    break;
                case 9:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        iE = ld.E(i18, unsafe.getObject(obj, j10), bdVar.F(i13));
                        iG17 += iE;
                    }
                    break;
                case 10:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        ra raVar = (ra) unsafe.getObject(obj, j10);
                        iG5 = wa.G(i18 << 3);
                        i11 = raVar.i();
                        iG6 = wa.G(i11);
                        iG4 = iG5 + iG6 + i11;
                        iG17 += iG4;
                    }
                    bdVar = this;
                    break;
                case 11:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        int i23 = unsafe.getInt(obj, j10);
                        iG2 = wa.G(i18 << 3);
                        iA = wa.G(i23);
                        iG4 = iG2 + iA;
                        iG17 += iG4;
                    }
                    bdVar = this;
                    break;
                case 12:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        long j14 = unsafe.getInt(obj, j10);
                        iG2 = wa.G(i18 << 3);
                        iA = wa.a(j14);
                        iG4 = iG2 + iA;
                        iG17 += iG4;
                    }
                    bdVar = this;
                    break;
                case 13:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        iG = wa.G(i18 << 3);
                        iG4 = iG + 4;
                        iG17 += iG4;
                    }
                    bdVar = this;
                    break;
                case 14:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        iG3 = wa.G(i18 << 3);
                        iG4 = iG3 + 8;
                        iG17 += iG4;
                    }
                    bdVar = this;
                    break;
                case 15:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        int i24 = unsafe.getInt(obj, j10);
                        iG2 = wa.G(i18 << 3);
                        iA = wa.G((i24 >> 31) ^ (i24 + i24));
                        iG4 = iG2 + iA;
                        iG17 += iG4;
                    }
                    bdVar = this;
                    break;
                case 16:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        long j15 = unsafe.getLong(obj, j10);
                        iG2 = wa.G(i18 << 3);
                        iA = wa.a((j15 >> 63) ^ (j15 + j15));
                        iG4 = iG2 + iA;
                        iG17 += iG4;
                    }
                    bdVar = this;
                    break;
                case 17:
                    if (bdVar.r(obj, i13, i15, i14, i10)) {
                        iE = wa.g(i18, (yc) unsafe.getObject(obj, j10), bdVar.F(i13));
                        iG17 += iE;
                    }
                    break;
                case 18:
                    iE = ld.D(i18, (List) unsafe.getObject(obj, j10), false);
                    iG17 += iE;
                    break;
                case 19:
                    iE = ld.B(i18, (List) unsafe.getObject(obj, j10), false);
                    iG17 += iE;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i25 = ld.f108621b;
                    if (list.size() == 0) {
                        iT = 0;
                    } else {
                        iT = ld.t(list) + (list.size() * wa.G(i18 << 3));
                    }
                    iG17 += iT;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i26 = ld.f108621b;
                    size = list2.size();
                    if (size == 0) {
                        iE = 0;
                    } else {
                        iU = ld.u(list2);
                        iG7 = wa.G(i18 << 3);
                        iA2 = size * iG7;
                        iE = iU + iA2;
                    }
                    iG17 += iE;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i27 = ld.f108621b;
                    size = list3.size();
                    if (size == 0) {
                        iE = 0;
                    } else {
                        iU = ld.x(list3);
                        iG7 = wa.G(i18 << 3);
                        iA2 = size * iG7;
                        iE = iU + iA2;
                    }
                    iG17 += iE;
                    break;
                case 23:
                    iE = ld.D(i18, (List) unsafe.getObject(obj, j10), false);
                    iG17 += iE;
                    break;
                case 24:
                    iE = ld.B(i18, (List) unsafe.getObject(obj, j10), false);
                    iG17 += iE;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i28 = ld.f108621b;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iE = 0;
                    } else {
                        iE = size2 * (wa.G(i18 << 3) + 1);
                    }
                    iG17 += iE;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    int i29 = ld.f108621b;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iT = 0;
                    } else {
                        iT = wa.G(i18 << 3) * size3;
                        if (list5 instanceof ic) {
                            ic icVar = (ic) list5;
                            for (int i30 = 0; i30 < size3; i30++) {
                                Object objH = icVar.h();
                                if (objH instanceof ra) {
                                    int i31 = ((ra) objH).i();
                                    iT += wa.G(i31) + i31;
                                } else {
                                    iT += wa.b((String) objH);
                                }
                            }
                        } else {
                            for (int i32 = 0; i32 < size3; i32++) {
                                Object obj2 = list5.get(i32);
                                if (obj2 instanceof ra) {
                                    int i33 = ((ra) obj2).i();
                                    iT += wa.G(i33) + i33;
                                } else {
                                    iT += wa.b((String) obj2);
                                }
                            }
                        }
                    }
                    iG17 += iT;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    jd jdVarF = bdVar.F(i13);
                    int i34 = ld.f108621b;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iG8 = 0;
                    } else {
                        iG8 = wa.G(i18 << 3) * size4;
                        for (int i35 = 0; i35 < size4; i35++) {
                            Object obj3 = list6.get(i35);
                            if (obj3 instanceof hc) {
                                int iB = ((hc) obj3).b();
                                iG8 += wa.G(iB) + iB;
                            } else {
                                iG8 += wa.d((yc) obj3, jdVarF);
                            }
                        }
                    }
                    iG17 += iG8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i36 = ld.f108621b;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iG9 = 0;
                    } else {
                        iG9 = size5 * wa.G(i18 << 3);
                        for (int i37 = 0; i37 < list7.size(); i37++) {
                            int i38 = ((ra) list7.get(i37)).i();
                            iG9 += wa.G(i38) + i38;
                        }
                    }
                    iG17 += iG9;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i39 = ld.f108621b;
                    size = list8.size();
                    if (size == 0) {
                        iE = 0;
                    } else {
                        iU = ld.y(list8);
                        iG7 = wa.G(i18 << 3);
                        iA2 = size * iG7;
                        iE = iU + iA2;
                    }
                    iG17 += iE;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i40 = ld.f108621b;
                    size = list9.size();
                    if (size == 0) {
                        iE = 0;
                    } else {
                        iU = ld.w(list9);
                        iG7 = wa.G(i18 << 3);
                        iA2 = size * iG7;
                        iE = iU + iA2;
                    }
                    iG17 += iE;
                    break;
                case 31:
                    iE = ld.B(i18, (List) unsafe.getObject(obj, j10), false);
                    iG17 += iE;
                    break;
                case 32:
                    iE = ld.D(i18, (List) unsafe.getObject(obj, j10), false);
                    iG17 += iE;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    int i41 = ld.f108621b;
                    size = list10.size();
                    if (size == 0) {
                        iE = 0;
                    } else {
                        iU = ld.z(list10);
                        iG7 = wa.G(i18 << 3);
                        iA2 = size * iG7;
                        iE = iU + iA2;
                    }
                    iG17 += iE;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    int i42 = ld.f108621b;
                    size = list11.size();
                    if (size == 0) {
                        iE = 0;
                    } else {
                        iU = ld.v(list11);
                        iG7 = wa.G(i18 << 3);
                        iA2 = size * iG7;
                        iE = iU + iA2;
                    }
                    iG17 += iE;
                    break;
                case 35:
                    iC = ld.C((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = wa.G(i18 << 3);
                        iG11 = wa.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 36:
                    iC = ld.A((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = wa.G(i18 << 3);
                        iG11 = wa.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 37:
                    iC = ld.t((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = wa.G(i18 << 3);
                        iG11 = wa.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 38:
                    iC = ld.u((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = wa.G(i18 << 3);
                        iG11 = wa.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 39:
                    iC = ld.x((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = wa.G(i18 << 3);
                        iG11 = wa.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 40:
                    iC = ld.C((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = wa.G(i18 << 3);
                        iG11 = wa.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 41:
                    iC = ld.A((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = wa.G(i18 << 3);
                        iG11 = wa.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j10);
                    int i43 = ld.f108621b;
                    iC = list12.size();
                    if (iC > 0) {
                        iG10 = wa.G(i18 << 3);
                        iG11 = wa.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 43:
                    iC = ld.y((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = wa.G(i18 << 3);
                        iG11 = wa.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 44:
                    iC = ld.w((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = wa.G(i18 << 3);
                        iG11 = wa.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 45:
                    iC = ld.A((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = wa.G(i18 << 3);
                        iG11 = wa.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 46:
                    iC = ld.C((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = wa.G(i18 << 3);
                        iG11 = wa.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 47:
                    iC = ld.z((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = wa.G(i18 << 3);
                        iG11 = wa.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 48:
                    iC = ld.v((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = wa.G(i18 << 3);
                        iG11 = wa.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j10);
                    jd jdVarF2 = bdVar.F(i13);
                    int i44 = ld.f108621b;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iG12 = 0;
                    } else {
                        iG12 = 0;
                        for (int i45 = 0; i45 < size6; i45++) {
                            iG12 += wa.g(i18, (yc) list13.get(i45), jdVarF2);
                        }
                    }
                    iG17 += iG12;
                    break;
                case 50:
                    sc scVar = (sc) unsafe.getObject(obj, j10);
                    rc rcVar = (rc) bdVar.G(i13);
                    if (scVar.isEmpty()) {
                        iT = 0;
                    } else {
                        iT = 0;
                        for (Map.Entry entry2 : scVar.entrySet()) {
                            iT += rcVar.d(i18, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iG17 += iT;
                    break;
                case 51:
                    if (bdVar.u(obj, i18, i13)) {
                        iG13 = wa.G(i18 << 3);
                        iE = iG13 + 8;
                        iG17 += iE;
                    }
                    break;
                case 52:
                    if (bdVar.u(obj, i18, i13)) {
                        iG14 = wa.G(i18 << 3);
                        iE = iG14 + 4;
                        iG17 += iE;
                    }
                    break;
                case 53:
                    if (bdVar.u(obj, i18, i13)) {
                        long jO = o(obj, j10);
                        iU = wa.G(i18 << 3);
                        iA2 = wa.a(jO);
                        iE = iU + iA2;
                        iG17 += iE;
                    }
                    break;
                case 54:
                    if (bdVar.u(obj, i18, i13)) {
                        long jO2 = o(obj, j10);
                        iU = wa.G(i18 << 3);
                        iA2 = wa.a(jO2);
                        iE = iU + iA2;
                        iG17 += iE;
                    }
                    break;
                case 55:
                    if (bdVar.u(obj, i18, i13)) {
                        long jN = n(obj, j10);
                        iU = wa.G(i18 << 3);
                        iA2 = wa.a(jN);
                        iE = iU + iA2;
                        iG17 += iE;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                    if (bdVar.u(obj, i18, i13)) {
                        iG13 = wa.G(i18 << 3);
                        iE = iG13 + 8;
                        iG17 += iE;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    if (bdVar.u(obj, i18, i13)) {
                        iG14 = wa.G(i18 << 3);
                        iE = iG14 + 4;
                        iG17 += iE;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                    if (bdVar.u(obj, i18, i13)) {
                        iE = wa.G(i18 << 3) + 1;
                        iG17 += iE;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (bdVar.u(obj, i18, i13)) {
                        int i46 = i18 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof ra) {
                            iG15 = wa.G(i46);
                            i12 = ((ra) object2).i();
                            iG16 = wa.G(i12);
                            iE = iG15 + iG16 + i12;
                            iG17 += iE;
                        } else {
                            iU = wa.G(i46);
                            iA2 = wa.b((String) object2);
                            iE = iU + iA2;
                            iG17 += iE;
                        }
                    }
                    break;
                case 60:
                    if (bdVar.u(obj, i18, i13)) {
                        iE = ld.E(i18, unsafe.getObject(obj, j10), bdVar.F(i13));
                        iG17 += iE;
                    }
                    break;
                case 61:
                    if (bdVar.u(obj, i18, i13)) {
                        ra raVar2 = (ra) unsafe.getObject(obj, j10);
                        iG15 = wa.G(i18 << 3);
                        i12 = raVar2.i();
                        iG16 = wa.G(i12);
                        iE = iG15 + iG16 + i12;
                        iG17 += iE;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                    if (bdVar.u(obj, i18, i13)) {
                        int iN2 = n(obj, j10);
                        iU = wa.G(i18 << 3);
                        iA2 = wa.G(iN2);
                        iE = iU + iA2;
                        iG17 += iE;
                    }
                    break;
                case 63:
                    if (bdVar.u(obj, i18, i13)) {
                        long jN2 = n(obj, j10);
                        iU = wa.G(i18 << 3);
                        iA2 = wa.a(jN2);
                        iE = iU + iA2;
                        iG17 += iE;
                    }
                    break;
                case 64:
                    if (bdVar.u(obj, i18, i13)) {
                        iG14 = wa.G(i18 << 3);
                        iE = iG14 + 4;
                        iG17 += iE;
                    }
                    break;
                case 65:
                    if (bdVar.u(obj, i18, i13)) {
                        iG13 = wa.G(i18 << 3);
                        iE = iG13 + 8;
                        iG17 += iE;
                    }
                    break;
                case 66:
                    if (bdVar.u(obj, i18, i13)) {
                        int iN3 = n(obj, j10);
                        iU = wa.G(i18 << 3);
                        iA2 = wa.G((iN3 >> 31) ^ (iN3 + iN3));
                        iE = iU + iA2;
                        iG17 += iE;
                    }
                    break;
                case 67:
                    if (bdVar.u(obj, i18, i13)) {
                        long jO3 = o(obj, j10);
                        iU = wa.G(i18 << 3);
                        iA2 = wa.a((jO3 >> 63) ^ (jO3 + jO3));
                        iE = iU + iA2;
                        iG17 += iE;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    if (bdVar.u(obj, i18, i13)) {
                        iE = wa.g(i18, (yc) unsafe.getObject(obj, j10), bdVar.F(i13));
                        iG17 += iE;
                    }
                    break;
            }
            i13 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb A[LOOP:2: B:53:0x00da->B:58:0x00eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0102 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.jd
    public final boolean d(Object obj) {
        int i10;
        int i11;
        List list;
        jd jdVarF;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.f108311h) {
            int[] iArr = this.f108310g;
            int[] iArr2 = this.f108304a;
            int i16 = iArr[i14];
            int i17 = iArr2[i16];
            int iN = N(i16);
            int i18 = iArr2[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = f108303m.getInt(obj, i19);
                }
                i11 = i13;
                i10 = i19;
            } else {
                int i21 = i13;
                i10 = i15;
                i11 = i21;
            }
            if ((268435456 & iN) != 0 && !r(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iP = P(iN);
            if (iP == 9 || iP == 17) {
                if (r(obj, i16, i10, i11, i20) && !M(obj, iN, F(i16))) {
                    return false;
                }
            } else if (iP == 27) {
                list = (List) ce.s(obj, iN & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    jdVarF = F(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!jdVarF.d(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iP == 60 || iP == 68) {
                if (u(obj, i17, i16) && !M(obj, iN, F(i16))) {
                    return false;
                }
            } else if (iP == 49) {
                list = (List) ce.s(obj, iN & 1048575);
                if (list.isEmpty()) {
                    jdVarF = F(i16);
                    while (i12 < list.size()) {
                        if (!jdVarF.d(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iP != 50) {
                continue;
            } else {
                sc scVar = (sc) ce.s(obj, iN & 1048575);
                if (!scVar.isEmpty() && ((rc) G(i16)).e().f108755c.k() == he.MESSAGE) {
                    jd jdVarB = null;
                    for (Object obj2 : scVar.values()) {
                        if (jdVarB == null) {
                            jdVarB = gd.a().b(obj2.getClass());
                        }
                        if (!jdVarB.d(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i14++;
            i15 = i10;
            i13 = i11;
        }
        return !this.f108309f || ((nb) obj).zzb.e();
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final int e(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f108304a;
            if (i12 >= iArr.length) {
                int iHashCode = (i13 * 53) + ((qb) obj).zzc.hashCode();
                return this.f108309f ? (iHashCode * 53) + ((nb) obj).zzb.f108447a.hashCode() : iHashCode;
            }
            int iN = N(i12);
            int i14 = 1048575 & iN;
            int iP = P(iN);
            int i15 = iArr[i12];
            long j10 = i14;
            int iHashCode2 = 37;
            switch (iP) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(ce.q(obj, j10));
                    byte[] bArr = ac.f108281b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(ce.o(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = ce.k(obj, j10);
                    byte[] bArr2 = ac.f108281b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = ce.k(obj, j10);
                    byte[] bArr3 = ac.f108281b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iFloatToIntBits = ce.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = ce.k(obj, j10);
                    byte[] bArr4 = ac.f108281b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iFloatToIntBits = ce.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i13 * 53;
                    iFloatToIntBits = ac.b(ce.m(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i13 * 53;
                    iFloatToIntBits = ((String) ce.s(obj, j10)).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object objS = ce.s(obj, j10);
                    if (objS != null) {
                        iHashCode2 = objS.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 10:
                    i10 = i13 * 53;
                    iFloatToIntBits = ce.s(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iFloatToIntBits = ce.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iFloatToIntBits = ce.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iFloatToIntBits = ce.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = ce.k(obj, j10);
                    byte[] bArr5 = ac.f108281b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iFloatToIntBits = ce.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = ce.k(obj, j10);
                    byte[] bArr6 = ac.f108281b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object objS2 = ce.s(obj, j10);
                    if (objS2 != null) {
                        iHashCode2 = objS2.hashCode();
                    }
                    i13 = i11 + iHashCode2;
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
                    i10 = i13 * 53;
                    iFloatToIntBits = ce.s(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i13 * 53;
                    iFloatToIntBits = ce.s(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(l(obj, j10));
                        byte[] bArr7 = ac.f108281b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(m(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = o(obj, j10);
                        byte[] bArr8 = ac.f108281b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = o(obj, j10);
                        byte[] bArr9 = ac.f108281b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = n(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = o(obj, j10);
                        byte[] bArr10 = ac.f108281b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = n(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = ac.b(p(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = ((String) ce.s(obj, j10)).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = ce.s(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = ce.s(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = n(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = n(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = n(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = o(obj, j10);
                        byte[] bArr11 = ac.f108281b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = n(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = o(obj, j10);
                        byte[] bArr12 = ac.f108281b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    if (u(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = ce.s(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
            }
            i12 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    @Override // com.google.android.gms.internal.measurement.jd
    public final void f(Object obj, ie ieVar) throws IOException {
        Map.Entry entry;
        int i10;
        bd<T> bdVar = this;
        if (bdVar.f108309f) {
            gb gbVar = ((nb) obj).zzb;
            if (gbVar.f108447a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) gbVar.c().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = bdVar.f108304a;
        Unsafe unsafe = f108303m;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < iArr.length) {
            int iN = bdVar.N(i13);
            int iP = P(iN);
            int i15 = iArr[i13];
            if (iP <= 17) {
                int i16 = iArr[i13 + 2];
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
            long j10 = iN & i11;
            switch (iP) {
                case 0:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.b(i15, ce.q(obj, j10));
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 1:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.p(i15, ce.o(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 2:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.l(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 3:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.t(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 4:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.e(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 5:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.r(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 6:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.c(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 7:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.B(i15, ce.m(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 8:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        y(i15, unsafe.getObject(obj, j10), ieVar);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 9:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.D(i15, unsafe.getObject(obj, j10), bdVar.F(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 10:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.q(i15, (ra) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 11:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.x(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 12:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.n(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 13:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.j(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 14:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.o(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 15:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.z(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 16:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.E(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 17:
                    if (bdVar.r(obj, i13, i12, i14, i10)) {
                        ieVar.I(i15, unsafe.getObject(obj, j10), bdVar.F(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 18:
                    ld.f(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 19:
                    ld.g(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 20:
                    ld.h(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 21:
                    ld.i(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 22:
                    ld.m(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 23:
                    ld.k(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 24:
                    ld.p(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 25:
                    ld.s(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 26:
                    int i18 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j10);
                    int i19 = ld.f108621b;
                    if (list != null && !list.isEmpty()) {
                        ieVar.y(i18, list);
                    }
                    break;
                case 27:
                    int i20 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    jd jdVarF = bdVar.F(i13);
                    int i21 = ld.f108621b;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            ((xa) ieVar).D(i20, list2.get(i22), jdVarF);
                        }
                    }
                    break;
                case 28:
                    int i23 = iArr[i13];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i24 = ld.f108621b;
                    if (list3 != null && !list3.isEmpty()) {
                        ieVar.v(i23, list3);
                    }
                    break;
                case 29:
                    ld.n(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 30:
                    ld.r(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 31:
                    ld.q(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 32:
                    ld.l(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 33:
                    ld.o(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 34:
                    ld.j(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    bdVar = this;
                    break;
                case 35:
                    ld.f(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, true);
                    break;
                case 36:
                    ld.g(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, true);
                    break;
                case 37:
                    ld.h(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, true);
                    break;
                case 38:
                    ld.i(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, true);
                    break;
                case 39:
                    ld.m(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, true);
                    break;
                case 40:
                    ld.k(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, true);
                    break;
                case 41:
                    ld.p(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, true);
                    break;
                case 42:
                    ld.s(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, true);
                    break;
                case 43:
                    ld.n(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, true);
                    break;
                case 44:
                    ld.r(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, true);
                    break;
                case 45:
                    ld.q(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, true);
                    break;
                case 46:
                    ld.l(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, true);
                    break;
                case 47:
                    ld.o(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, true);
                    break;
                case 48:
                    ld.j(iArr[i13], (List) unsafe.getObject(obj, j10), ieVar, true);
                    break;
                case 49:
                    int i25 = iArr[i13];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    jd jdVarF2 = bdVar.F(i13);
                    int i26 = ld.f108621b;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            ((xa) ieVar).I(i25, list4.get(i27), jdVarF2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j10);
                    if (object != null) {
                        ieVar.k(i15, ((rc) bdVar.G(i13)).e(), (sc) object);
                    }
                    break;
                case 51:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.b(i15, l(obj, j10));
                    }
                    break;
                case 52:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.p(i15, m(obj, j10));
                    }
                    break;
                case 53:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.l(i15, o(obj, j10));
                    }
                    break;
                case 54:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.t(i15, o(obj, j10));
                    }
                    break;
                case 55:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.e(i15, n(obj, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.r(i15, o(obj, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.c(i15, n(obj, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.B(i15, p(obj, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (bdVar.u(obj, i15, i13)) {
                        y(i15, unsafe.getObject(obj, j10), ieVar);
                    }
                    break;
                case 60:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.D(i15, unsafe.getObject(obj, j10), bdVar.F(i13));
                    }
                    break;
                case 61:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.q(i15, (ra) unsafe.getObject(obj, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.x(i15, n(obj, j10));
                    }
                    break;
                case 63:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.n(i15, n(obj, j10));
                    }
                    break;
                case 64:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.j(i15, n(obj, j10));
                    }
                    break;
                case 65:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.o(i15, o(obj, j10));
                    }
                    break;
                case 66:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.z(i15, n(obj, j10));
                    }
                    break;
                case 67:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.E(i15, o(obj, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    if (bdVar.u(obj, i15, i13)) {
                        ieVar.I(i15, unsafe.getObject(obj, j10), bdVar.F(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
            bdVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((qb) obj).zzc.g(ieVar);
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final void g(Object obj, Object obj2) {
        k(obj);
        obj2.getClass();
        int i10 = 0;
        int i11 = 7 ^ 0;
        while (true) {
            int[] iArr = this.f108304a;
            if (i10 >= iArr.length) {
                ld.d(this.f108313j, obj, obj2);
                if (this.f108309f) {
                    ld.c(this.f108314k, obj, obj2);
                    return;
                }
                return;
            }
            int iN = N(i10);
            int i12 = 1048575 & iN;
            int iP = P(iN);
            int i13 = iArr[i10];
            long j10 = i12;
            switch (iP) {
                case 0:
                    if (s(obj2, i10)) {
                        ce.r(obj, j10, ce.q(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 1:
                    if (s(obj2, i10)) {
                        ce.p(obj, j10, ce.o(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 2:
                    if (s(obj2, i10)) {
                        ce.l(obj, j10, ce.k(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 3:
                    if (s(obj2, i10)) {
                        ce.l(obj, j10, ce.k(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 4:
                    if (s(obj2, i10)) {
                        ce.j(obj, j10, ce.i(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 5:
                    if (s(obj2, i10)) {
                        ce.l(obj, j10, ce.k(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 6:
                    if (s(obj2, i10)) {
                        ce.j(obj, j10, ce.i(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 7:
                    if (s(obj2, i10)) {
                        ce.n(obj, j10, ce.m(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 8:
                    if (s(obj2, i10)) {
                        ce.t(obj, j10, ce.s(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 9:
                    D(obj, obj2, i10);
                    break;
                case 10:
                    if (s(obj2, i10)) {
                        ce.t(obj, j10, ce.s(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 11:
                    if (s(obj2, i10)) {
                        ce.j(obj, j10, ce.i(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 12:
                    if (s(obj2, i10)) {
                        ce.j(obj, j10, ce.i(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 13:
                    if (s(obj2, i10)) {
                        ce.j(obj, j10, ce.i(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 14:
                    if (s(obj2, i10)) {
                        ce.l(obj, j10, ce.k(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 15:
                    if (s(obj2, i10)) {
                        ce.j(obj, j10, ce.i(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 16:
                    if (s(obj2, i10)) {
                        ce.l(obj, j10, ce.k(obj2, j10));
                        t(obj, i10);
                    }
                    break;
                case 17:
                    D(obj, obj2, i10);
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
                    zb zbVarF = (zb) ce.s(obj, j10);
                    zb zbVar = (zb) ce.s(obj2, j10);
                    int size = zbVarF.size();
                    int size2 = zbVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zbVarF.a()) {
                            zbVarF = zbVarF.f(size2 + size);
                        }
                        zbVarF.addAll(zbVar);
                    }
                    if (size > 0) {
                        zbVar = zbVarF;
                    }
                    ce.t(obj, j10, zbVar);
                    break;
                case 50:
                    int i14 = ld.f108621b;
                    ce.t(obj, j10, tc.a(ce.s(obj, j10), ce.s(obj2, j10)));
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
                    if (u(obj2, i13, i10)) {
                        ce.t(obj, j10, ce.s(obj2, j10));
                        v(obj, i13, i10);
                    }
                    break;
                case 60:
                    E(obj, obj2, i10);
                    break;
                case 61:
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (u(obj2, i13, i10)) {
                        ce.t(obj, j10, ce.s(obj2, j10));
                        v(obj, i13, i10);
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    E(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.jd
    public final void h(Object obj) {
        if (c(obj)) {
            if (obj instanceof qb) {
                qb qbVar = (qb) obj;
                qbVar.r(Integer.MAX_VALUE);
                qbVar.zza = 0;
                qbVar.l();
            }
            int[] iArr = this.f108304a;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iN = N(i10);
                int i11 = 1048575 & iN;
                int iP = P(iN);
                long j10 = i11;
                if (iP != 9) {
                    if (iP != 60 && iP != 68) {
                        switch (iP) {
                            case 17:
                                if (s(obj, i10)) {
                                    F(i10).h(f108303m.getObject(obj, j10));
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
                                ((zb) ce.s(obj, j10)).g();
                                break;
                            case 50:
                                Unsafe unsafe = f108303m;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((sc) object).d();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (u(obj, iArr[i10], i10)) {
                        F(i10).h(f108303m.getObject(obj, j10));
                    }
                } else if (s(obj, i10)) {
                    F(i10).h(f108303m.getObject(obj, j10));
                }
            }
            this.f108313j.b(obj);
            if (this.f108309f) {
                this.f108314k.a(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final void i(Object obj, byte[] bArr, int i10, int i11, fa faVar) throws IOException {
        A(obj, bArr, i10, i11, 0, faVar);
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final boolean j(Object obj, Object obj2) {
        boolean zB;
        for (int i10 = 0; i10 < this.f108304a.length; i10 += 3) {
            int iN = N(i10);
            long j10 = iN & 1048575;
            switch (P(iN)) {
                case 0:
                    if (!q(obj, obj2, i10) || Double.doubleToLongBits(ce.q(obj, j10)) != Double.doubleToLongBits(ce.q(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!q(obj, obj2, i10) || Float.floatToIntBits(ce.o(obj, j10)) != Float.floatToIntBits(ce.o(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!q(obj, obj2, i10) || ce.k(obj, j10) != ce.k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!q(obj, obj2, i10) || ce.k(obj, j10) != ce.k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!q(obj, obj2, i10) || ce.i(obj, j10) != ce.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!q(obj, obj2, i10) || ce.k(obj, j10) != ce.k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!q(obj, obj2, i10) || ce.i(obj, j10) != ce.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!q(obj, obj2, i10) || ce.m(obj, j10) != ce.m(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!q(obj, obj2, i10) || !ld.b(ce.s(obj, j10), ce.s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!q(obj, obj2, i10) || !ld.b(ce.s(obj, j10), ce.s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!q(obj, obj2, i10) || !ld.b(ce.s(obj, j10), ce.s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!q(obj, obj2, i10) || ce.i(obj, j10) != ce.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!q(obj, obj2, i10) || ce.i(obj, j10) != ce.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!q(obj, obj2, i10) || ce.i(obj, j10) != ce.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!q(obj, obj2, i10) || ce.k(obj, j10) != ce.k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!q(obj, obj2, i10) || ce.i(obj, j10) != ce.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!q(obj, obj2, i10) || ce.k(obj, j10) != ce.k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!q(obj, obj2, i10) || !ld.b(ce.s(obj, j10), ce.s(obj2, j10))) {
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
                    zB = ld.b(ce.s(obj, j10), ce.s(obj2, j10));
                    break;
                case 50:
                    zB = ld.b(ce.s(obj, j10), ce.s(obj2, j10));
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
                    long jO = O(i10) & 1048575;
                    if (ce.i(obj, jO) != ce.i(obj2, jO) || !ld.b(ce.s(obj, j10), ce.s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zB) {
                return false;
            }
        }
        if (!((qb) obj).zzc.equals(((qb) obj2).zzc)) {
            return false;
        }
        if (this.f108309f) {
            return ((nb) obj).zzb.equals(((nb) obj2).zzb);
        }
        return true;
    }
}
