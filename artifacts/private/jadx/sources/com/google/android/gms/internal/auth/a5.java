package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class a5<T> implements i5<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f107556n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Unsafe f107557o = k6.g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f107558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f107559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f107560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f107561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w4 f107562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f107563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f107564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f107565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k4 f107566i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final z5 f107567j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k3 f107568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c5 f107569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final r4 f107570m;

    private a5(int[] iArr, Object[] objArr, int i10, int i11, w4 w4Var, int i12, boolean z10, int[] iArr2, int i13, int i14, c5 c5Var, k4 k4Var, z5 z5Var, k3 k3Var, r4 r4Var) {
        this.f107558a = iArr;
        this.f107559b = objArr;
        this.f107560c = i10;
        this.f107561d = i11;
        this.f107563f = iArr2;
        this.f107564g = i13;
        this.f107565h = i14;
        this.f107569l = c5Var;
        this.f107566i = k4Var;
        this.f107567j = z5Var;
        this.f107568k = k3Var;
        this.f107562e = w4Var;
        this.f107570m = r4Var;
    }

    private final i5 A(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        i5 i5Var = (i5) this.f107559b[i12];
        if (i5Var != null) {
            return i5Var;
        }
        i5 i5VarB = f5.a().b((Class) this.f107559b[i12 + 1]);
        this.f107559b[i12] = i5VarB;
        return i5VarB;
    }

    private final Object B(int i10) {
        int i11 = i10 / 3;
        return this.f107559b[i11 + i11];
    }

    private final Object C(Object obj, int i10) {
        i5 i5VarA = A(i10);
        int iX = x(i10) & 1048575;
        if (!k(obj, i10)) {
            return i5VarA.m();
        }
        Object object = f107557o.getObject(obj, iX);
        if (o(object)) {
            return object;
        }
        Object objM = i5VarA.m();
        if (object != null) {
            i5VarA.f(objM, object);
        }
        return objM;
    }

    private final Object D(Object obj, int i10, int i11) {
        i5 i5VarA = A(i11);
        if (!p(obj, i10, i11)) {
            return i5VarA.m();
        }
        Object object = f107557o.getObject(obj, x(i11) & 1048575);
        if (o(object)) {
            return object;
        }
        Object objM = i5VarA.m();
        if (object != null) {
            i5VarA.f(objM, object);
        }
        return objM;
    }

    private static Field E(Class cls, String str) {
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

    private static void F(Object obj) {
        if (!o(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void G(Object obj, Object obj2, int i10) {
        if (k(obj2, i10)) {
            int iX = x(i10) & 1048575;
            Unsafe unsafe = f107557o;
            long j10 = iX;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f107558a[i10] + " is present but null: " + obj2.toString());
            }
            i5 i5VarA = A(i10);
            if (!k(obj, i10)) {
                if (o(object)) {
                    Object objM = i5VarA.m();
                    i5VarA.f(objM, object);
                    unsafe.putObject(obj, j10, objM);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                I(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!o(object2)) {
                Object objM2 = i5VarA.m();
                i5VarA.f(objM2, object2);
                unsafe.putObject(obj, j10, objM2);
                object2 = objM2;
            }
            i5VarA.f(object2, object);
        }
    }

    private final void H(Object obj, Object obj2, int i10) {
        int i11 = this.f107558a[i10];
        if (p(obj2, i11, i10)) {
            int iX = x(i10) & 1048575;
            Unsafe unsafe = f107557o;
            long j10 = iX;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f107558a[i10] + " is present but null: " + obj2.toString());
            }
            i5 i5VarA = A(i10);
            if (!p(obj, i11, i10)) {
                if (o(object)) {
                    Object objM = i5VarA.m();
                    i5VarA.f(objM, object);
                    unsafe.putObject(obj, j10, objM);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                a(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!o(object2)) {
                Object objM2 = i5VarA.m();
                i5VarA.f(objM2, object2);
                unsafe.putObject(obj, j10, objM2);
                object2 = objM2;
            }
            i5VarA.f(object2, object);
        }
    }

    private final void I(Object obj, int i10) {
        int iU = u(i10);
        long j10 = 1048575 & iU;
        if (j10 == 1048575) {
            return;
        }
        k6.n(obj, j10, (1 << (iU >>> 20)) | k6.c(obj, j10));
    }

    private final void a(Object obj, int i10, int i11) {
        k6.n(obj, u(i11) & 1048575, i10);
    }

    private final void h(Object obj, int i10, Object obj2) {
        f107557o.putObject(obj, x(i10) & 1048575, obj2);
        I(obj, i10);
    }

    private final void i(Object obj, int i10, int i11, Object obj2) {
        f107557o.putObject(obj, x(i11) & 1048575, obj2);
        a(obj, i10, i11);
    }

    private final boolean j(Object obj, Object obj2, int i10) {
        return k(obj, i10) == k(obj2, i10);
    }

    private final boolean k(Object obj, int i10) {
        int iU = u(i10);
        long j10 = iU & 1048575;
        if (j10 != 1048575) {
            return ((1 << (iU >>> 20)) & k6.c(obj, j10)) != 0;
        }
        int iX = x(i10);
        long j11 = iX & 1048575;
        switch (w(iX)) {
            case 0:
                return Double.doubleToRawLongBits(k6.a(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(k6.b(obj, j11)) != 0;
            case 2:
                return k6.d(obj, j11) != 0;
            case 3:
                return k6.d(obj, j11) != 0;
            case 4:
                return k6.c(obj, j11) != 0;
            case 5:
                return k6.d(obj, j11) != 0;
            case 6:
                return k6.c(obj, j11) != 0;
            case 7:
                return k6.t(obj, j11);
            case 8:
                Object objF = k6.f(obj, j11);
                if (objF instanceof String) {
                    return !((String) objF).isEmpty();
                }
                if (objF instanceof d3) {
                    return !d3.f107612b.equals(objF);
                }
                throw new IllegalArgumentException();
            case 9:
                return k6.f(obj, j11) != null;
            case 10:
                return !d3.f107612b.equals(k6.f(obj, j11));
            case 11:
                return k6.c(obj, j11) != 0;
            case 12:
                return k6.c(obj, j11) != 0;
            case 13:
                return k6.c(obj, j11) != 0;
            case 14:
                return k6.d(obj, j11) != 0;
            case 15:
                return k6.c(obj, j11) != 0;
            case 16:
                return k6.d(obj, j11) != 0;
            case 17:
                return k6.f(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean l(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return k(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean n(Object obj, int i10, i5 i5Var) {
        return i5Var.g(k6.f(obj, i10 & 1048575));
    }

    private static boolean o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof t3) {
            return ((t3) obj).n();
        }
        return true;
    }

    private final boolean p(Object obj, int i10, int i11) {
        return k6.c(obj, (long) (u(i11) & 1048575)) == i10;
    }

    static b6 r(Object obj) {
        t3 t3Var = (t3) obj;
        b6 b6Var = t3Var.zzc;
        if (b6Var != b6.a()) {
            return b6Var;
        }
        b6 b6VarD = b6.d();
        t3Var.zzc = b6VarD;
        return b6VarD;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0269  */
    /* JADX WARN: Code duplicated, block: B:125:0x0271  */
    /* JADX WARN: Code duplicated, block: B:128:0x0287  */
    /* JADX WARN: Code duplicated, block: B:129:0x028a  */
    static a5 s(Class cls, t4 t4Var, c5 c5Var, k4 k4Var, z5 z5Var, k3 k3Var, r4 r4Var) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
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
        h5 h5Var;
        int i27;
        int i28;
        int i29;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        Field fieldE;
        char cCharAt9;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field fieldE2;
        int i33;
        Object obj2;
        Field fieldE3;
        int i34;
        char cCharAt10;
        int i35;
        char cCharAt11;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        if (!(t4Var instanceof h5)) {
            throw null;
        }
        h5 h5Var2 = (h5) t4Var;
        String strB = h5Var2.b();
        int length = strB.length();
        char c10 = 55296;
        if (strB.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i10 = i38 + 1;
                if (strB.charAt(i38) < 55296) {
                    break;
                }
                i38 = i10;
            }
        } else {
            i10 = 1;
        }
        int i39 = i10 + 1;
        int iCharAt2 = strB.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i40 = iCharAt2 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                cCharAt13 = strB.charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            iCharAt2 = i40 | (cCharAt13 << i41);
            i39 = i37;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            iCharAt = 0;
            i12 = 0;
            i14 = 0;
            i11 = 0;
            i15 = 0;
            iArr = f107556n;
            i16 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt3 = strB.charAt(i39);
            if (iCharAt3 >= 55296) {
                int i43 = iCharAt3 & 8191;
                int i44 = 13;
                while (true) {
                    i24 = i42 + 1;
                    cCharAt8 = strB.charAt(i42);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i24;
                }
                iCharAt3 = i43 | (cCharAt8 << i44);
                i42 = i24;
            }
            int i45 = i42 + 1;
            int iCharAt4 = strB.charAt(i42);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i23 = i45 + 1;
                    cCharAt7 = strB.charAt(i45);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i23;
                }
                iCharAt4 = i46 | (cCharAt7 << i47);
                i45 = i23;
            }
            int i48 = i45 + 1;
            int iCharAt5 = strB.charAt(i45);
            if (iCharAt5 >= 55296) {
                int i49 = iCharAt5 & 8191;
                int i50 = 13;
                while (true) {
                    i22 = i48 + 1;
                    cCharAt6 = strB.charAt(i48);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i22;
                }
                iCharAt5 = i49 | (cCharAt6 << i50);
                i48 = i22;
            }
            int i51 = i48 + 1;
            int iCharAt6 = strB.charAt(i48);
            if (iCharAt6 >= 55296) {
                int i52 = iCharAt6 & 8191;
                int i53 = 13;
                while (true) {
                    i21 = i51 + 1;
                    cCharAt5 = strB.charAt(i51);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i21;
                }
                iCharAt6 = i52 | (cCharAt5 << i53);
                i51 = i21;
            }
            int i54 = i51 + 1;
            iCharAt = strB.charAt(i51);
            if (iCharAt >= 55296) {
                int i55 = iCharAt & 8191;
                int i56 = 13;
                while (true) {
                    i20 = i54 + 1;
                    cCharAt4 = strB.charAt(i54);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i20;
                }
                iCharAt = i55 | (cCharAt4 << i56);
                i54 = i20;
            }
            int i57 = i54 + 1;
            int iCharAt7 = strB.charAt(i54);
            if (iCharAt7 >= 55296) {
                int i58 = iCharAt7 & 8191;
                int i59 = 13;
                while (true) {
                    i19 = i57 + 1;
                    cCharAt3 = strB.charAt(i57);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i19;
                }
                iCharAt7 = i58 | (cCharAt3 << i59);
                i57 = i19;
            }
            int i60 = i57 + 1;
            int iCharAt8 = strB.charAt(i57);
            if (iCharAt8 >= 55296) {
                int i61 = iCharAt8 & 8191;
                int i62 = 13;
                while (true) {
                    i18 = i60 + 1;
                    cCharAt2 = strB.charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i18;
                }
                iCharAt8 = i61 | (cCharAt2 << i62);
                i60 = i18;
            }
            int i63 = i60 + 1;
            int iCharAt9 = strB.charAt(i60);
            if (iCharAt9 >= 55296) {
                int i64 = iCharAt9 & 8191;
                int i65 = 13;
                while (true) {
                    i17 = i63 + 1;
                    cCharAt = strB.charAt(i63);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i63 = i17;
                }
                iCharAt9 = i64 | (cCharAt << i65);
                i63 = i17;
            }
            i11 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i66 = iCharAt7;
            i12 = iCharAt5;
            i13 = i66;
            iArr = iArr2;
            i14 = iCharAt6;
            i15 = iCharAt9;
            i16 = iCharAt3;
            i39 = i63;
        }
        Unsafe unsafe = f107557o;
        Object[] objArrC = h5Var2.c();
        Class<?> cls2 = h5Var2.a().getClass();
        int i67 = i15 + i13;
        int i68 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i68];
        int i69 = 0;
        int i70 = 0;
        int i71 = i15;
        int i72 = i67;
        while (i39 < length) {
            int i73 = i39 + 1;
            int iCharAt10 = strB.charAt(i39);
            if (iCharAt10 >= c10) {
                int i74 = iCharAt10 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i36 = i75 + 1;
                    cCharAt12 = strB.charAt(i75);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i36;
                }
                iCharAt10 = i74 | (cCharAt12 << i76);
                i25 = i36;
            } else {
                i25 = i73;
            }
            int i77 = i25 + 1;
            int iCharAt11 = strB.charAt(i25);
            if (iCharAt11 >= c10) {
                int i78 = iCharAt11 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i35 = i79 + 1;
                    cCharAt11 = strB.charAt(i79);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i78 |= (cCharAt11 & 8191) << i80;
                    i80 += 13;
                    i79 = i35;
                }
                iCharAt11 = i78 | (cCharAt11 << i80);
                i26 = i35;
            } else {
                i26 = i77;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i69] = i70;
                i69++;
            }
            int i81 = iCharAt11 & 255;
            if (i81 >= 51) {
                int i82 = i26 + 1;
                int iCharAt12 = strB.charAt(i26);
                h5Var = h5Var2;
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i83 = iCharAt12 & 8191;
                    int i84 = 13;
                    while (true) {
                        i34 = i82 + 1;
                        cCharAt10 = strB.charAt(i82);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i83 |= (cCharAt10 & 8191) << i84;
                        i84 += 13;
                        i82 = i34;
                        c11 = 55296;
                    }
                    iCharAt12 = i83 | (cCharAt10 << i84);
                    i82 = i34;
                }
                int i85 = i81 - 51;
                if (i85 == 9 || i85 == 17) {
                    int i86 = i70 / 3;
                    i31 = i11 + 1;
                    objArr[i86 + i86 + 1] = objArrC[i11];
                } else {
                    if (i85 == 12 && (h5Var.h() == 1 || (iCharAt11 & 2048) != 0)) {
                        int i87 = i70 / 3;
                        i31 = i11 + 1;
                        objArr[i87 + i87 + 1] = objArrC[i11];
                    }
                    i32 = iCharAt12 + iCharAt12;
                    obj = objArrC[i32];
                    if (obj instanceof Field) {
                        fieldE2 = (Field) obj;
                    } else {
                        fieldE2 = E(cls2, (String) obj);
                        objArrC[i32] = fieldE2;
                    }
                    int i88 = i82;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE2);
                    i33 = i32 + 1;
                    obj2 = objArrC[i33];
                    if (obj2 instanceof Field) {
                        fieldE3 = (Field) obj2;
                    } else {
                        fieldE3 = E(cls2, (String) obj2);
                        objArrC[i33] = fieldE3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE3);
                    strB = strB;
                    i28 = i88;
                    i29 = 0;
                }
                i11 = i31;
                i32 = iCharAt12 + iCharAt12;
                obj = objArrC[i32];
                if (obj instanceof Field) {
                    fieldE2 = (Field) obj;
                } else {
                    fieldE2 = E(cls2, (String) obj);
                    objArrC[i32] = fieldE2;
                }
                int i89 = i82;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE2);
                i33 = i32 + 1;
                obj2 = objArrC[i33];
                if (obj2 instanceof Field) {
                    fieldE3 = (Field) obj2;
                } else {
                    fieldE3 = E(cls2, (String) obj2);
                    objArrC[i33] = fieldE3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE3);
                strB = strB;
                i28 = i89;
                i29 = 0;
            } else {
                h5Var = h5Var2;
                int i90 = i11 + 1;
                Field fieldE4 = E(cls2, (String) objArrC[i11]);
                if (i81 == 9 || i81 == 17) {
                    i27 = i90;
                    int i91 = i70 / 3;
                    objArr[i91 + i91 + 1] = fieldE4.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        int i92 = i70 / 3;
                        i30 = i11 + 2;
                        objArr[i92 + i92 + 1] = objArrC[i90];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        i27 = i90;
                        if (h5Var.h() == 1 || (iCharAt11 & 2048) != 0) {
                            int i93 = i70 / 3;
                            i30 = i11 + 2;
                            objArr[i93 + i93 + 1] = objArrC[i27];
                        }
                    } else if (i81 == 50) {
                        int i94 = i71 + 1;
                        iArr[i71] = i70;
                        int i95 = i70 / 3;
                        i27 = i11 + 2;
                        int i96 = i95 + i95;
                        objArr[i96] = objArrC[i90];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i96 + 1] = objArrC[i27];
                            i27 = i11 + 3;
                        }
                        i71 = i94;
                    } else {
                        i27 = i90;
                    }
                    i27 = i30;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldE4);
                int iObjectFieldOffset4 = 1048575;
                if ((iCharAt11 & 4096) == 0 || i81 > 17) {
                    i28 = i26;
                    i29 = 0;
                } else {
                    int i97 = i26 + 1;
                    int iCharAt13 = strB.charAt(i26);
                    if (iCharAt13 >= 55296) {
                        int i98 = iCharAt13 & 8191;
                        int i99 = 13;
                        while (true) {
                            i28 = i97 + 1;
                            cCharAt9 = strB.charAt(i97);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i98 |= (cCharAt9 & 8191) << i99;
                            i99 += 13;
                            i97 = i28;
                        }
                        iCharAt13 = i98 | (cCharAt9 << i99);
                    } else {
                        i28 = i97;
                    }
                    int i100 = i16 + i16 + (iCharAt13 / 32);
                    Object obj3 = objArrC[i100];
                    if (obj3 instanceof Field) {
                        fieldE = (Field) obj3;
                    } else {
                        fieldE = E(cls2, (String) obj3);
                        objArrC[i100] = fieldE;
                    }
                    i29 = iCharAt13 % 32;
                    iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldE);
                }
                if (i81 >= 18 && i81 <= 49) {
                    iArr[i72] = iObjectFieldOffset3;
                    i72++;
                }
                iObjectFieldOffset = iObjectFieldOffset3;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i11 = i27;
            }
            int i101 = i70 + 1;
            iArr3[i70] = iCharAt10;
            int i102 = i70 + 2;
            iArr3[i101] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i81 << 20) | iObjectFieldOffset;
            i70 += 3;
            iArr3[i102] = (i29 << 20) | iObjectFieldOffset2;
            i39 = i28;
            h5Var2 = h5Var;
            strB = strB;
            length = length;
            c10 = 55296;
        }
        h5 h5Var3 = h5Var2;
        return new a5(iArr3, objArr, i12, i14, h5Var3.a(), h5Var3.h(), false, iArr, i15, i67, c5Var, k4Var, z5Var, k3Var, r4Var);
    }

    private static int t(Object obj, long j10) {
        return ((Integer) k6.f(obj, j10)).intValue();
    }

    private final int u(int i10) {
        return this.f107558a[i10 + 2];
    }

    private final int v(int i10, int i11) {
        int length = (this.f107558a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f107558a[i13];
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

    private static int w(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int x(int i10) {
        return this.f107558a[i10 + 1];
    }

    private static long y(Object obj, long j10) {
        return ((Long) k6.f(obj, j10)).longValue();
    }

    private final w3 z(int i10) {
        int i11 = i10 / 3;
        return (w3) this.f107559b[i11 + i11 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.i5
    public final void b(Object obj) {
        if (o(obj)) {
            if (obj instanceof t3) {
                t3 t3Var = (t3) obj;
                t3Var.l(Integer.MAX_VALUE);
                t3Var.zza = 0;
                t3Var.i();
            }
            int length = this.f107558a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iX = x(i10);
                int i11 = 1048575 & iX;
                int iW = w(iX);
                long j10 = i11;
                if (iW != 9) {
                    if (iW != 60 && iW != 68) {
                        switch (iW) {
                            case 17:
                                if (k(obj, i10)) {
                                    A(i10).b(f107557o.getObject(obj, j10));
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
                                this.f107566i.a(obj, j10);
                                break;
                            case 50:
                                Unsafe unsafe = f107557o;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((q4) object).c();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (p(obj, this.f107558a[i10], i10)) {
                        A(i10).b(f107557o.getObject(obj, j10));
                    }
                } else if (k(obj, i10)) {
                    A(i10).b(f107557o.getObject(obj, j10));
                }
            }
            this.f107567j.e(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.i5
    public final int c(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int length = this.f107558a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iX = x(i12);
            int i13 = this.f107558a[i12];
            long j10 = 1048575 & iX;
            int iHashCode = 37;
            switch (w(iX)) {
                case 0:
                    i10 = i11 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(k6.a(obj, j10));
                    byte[] bArr = z3.f107905d;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iFloatToIntBits = Float.floatToIntBits(k6.b(obj, j10));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i11 * 53;
                    jDoubleToLongBits = k6.d(obj, j10);
                    byte[] bArr2 = z3.f107905d;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i11 * 53;
                    jDoubleToLongBits = k6.d(obj, j10);
                    byte[] bArr3 = z3.f107905d;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iFloatToIntBits = k6.c(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i11 * 53;
                    jDoubleToLongBits = k6.d(obj, j10);
                    byte[] bArr4 = z3.f107905d;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iFloatToIntBits = k6.c(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iFloatToIntBits = z3.a(k6.t(obj, j10));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iFloatToIntBits = ((String) k6.f(obj, j10)).hashCode();
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    Object objF = k6.f(obj, j10);
                    if (objF != null) {
                        iHashCode = objF.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iFloatToIntBits = k6.f(obj, j10).hashCode();
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iFloatToIntBits = k6.c(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iFloatToIntBits = k6.c(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iFloatToIntBits = k6.c(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i11 * 53;
                    jDoubleToLongBits = k6.d(obj, j10);
                    byte[] bArr5 = z3.f107905d;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iFloatToIntBits = k6.c(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i11 * 53;
                    jDoubleToLongBits = k6.d(obj, j10);
                    byte[] bArr6 = z3.f107905d;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    Object objF2 = k6.f(obj, j10);
                    if (objF2 != null) {
                        iHashCode = objF2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
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
                    i10 = i11 * 53;
                    iFloatToIntBits = k6.f(obj, j10).hashCode();
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iFloatToIntBits = k6.f(obj, j10).hashCode();
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) k6.f(obj, j10)).doubleValue());
                        byte[] bArr7 = z3.f107905d;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) k6.f(obj, j10)).floatValue());
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = y(obj, j10);
                        byte[] bArr8 = z3.f107905d;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = y(obj, j10);
                        byte[] bArr9 = z3.f107905d;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = t(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = y(obj, j10);
                        byte[] bArr10 = z3.f107905d;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = t(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = z3.a(((Boolean) k6.f(obj, j10)).booleanValue());
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = ((String) k6.f(obj, j10)).hashCode();
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = k6.f(obj, j10).hashCode();
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = k6.f(obj, j10).hashCode();
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = t(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = t(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = t(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = y(obj, j10);
                        byte[] bArr11 = z3.f107905d;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = t(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = y(obj, j10);
                        byte[] bArr12 = z3.f107905d;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    if (p(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = k6.f(obj, j10).hashCode();
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
            }
        }
        return (i11 * 53) + this.f107567j.b(obj).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.i5
    public final boolean d(Object obj, Object obj2) {
        boolean zF;
        int length = this.f107558a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iX = x(i10);
            long j10 = iX & 1048575;
            switch (w(iX)) {
                case 0:
                    if (!j(obj, obj2, i10) || Double.doubleToLongBits(k6.a(obj, j10)) != Double.doubleToLongBits(k6.a(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!j(obj, obj2, i10) || Float.floatToIntBits(k6.b(obj, j10)) != Float.floatToIntBits(k6.b(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!j(obj, obj2, i10) || k6.d(obj, j10) != k6.d(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!j(obj, obj2, i10) || k6.d(obj, j10) != k6.d(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!j(obj, obj2, i10) || k6.c(obj, j10) != k6.c(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!j(obj, obj2, i10) || k6.d(obj, j10) != k6.d(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!j(obj, obj2, i10) || k6.c(obj, j10) != k6.c(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!j(obj, obj2, i10) || k6.t(obj, j10) != k6.t(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!j(obj, obj2, i10) || !k5.f(k6.f(obj, j10), k6.f(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!j(obj, obj2, i10) || !k5.f(k6.f(obj, j10), k6.f(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!j(obj, obj2, i10) || !k5.f(k6.f(obj, j10), k6.f(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!j(obj, obj2, i10) || k6.c(obj, j10) != k6.c(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!j(obj, obj2, i10) || k6.c(obj, j10) != k6.c(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!j(obj, obj2, i10) || k6.c(obj, j10) != k6.c(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!j(obj, obj2, i10) || k6.d(obj, j10) != k6.d(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!j(obj, obj2, i10) || k6.c(obj, j10) != k6.c(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!j(obj, obj2, i10) || k6.d(obj, j10) != k6.d(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!j(obj, obj2, i10) || !k5.f(k6.f(obj, j10), k6.f(obj2, j10))) {
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
                    zF = k5.f(k6.f(obj, j10), k6.f(obj2, j10));
                    break;
                case 50:
                    zF = k5.f(k6.f(obj, j10), k6.f(obj2, j10));
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
                    long jU = u(i10) & 1048575;
                    if (k6.c(obj, jU) != k6.c(obj2, jU) || !k5.f(k6.f(obj, j10), k6.f(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zF) {
                return false;
            }
        }
        return this.f107567j.b(obj).equals(this.f107567j.b(obj2));
    }

    @Override // com.google.android.gms.internal.auth.i5
    public final void e(Object obj, byte[] bArr, int i10, int i11, q2 q2Var) throws IOException {
        q(obj, bArr, i10, i11, 0, q2Var);
    }

    @Override // com.google.android.gms.internal.auth.i5
    public final void f(Object obj, Object obj2) {
        F(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f107558a.length; i10 += 3) {
            int iX = x(i10);
            int i11 = this.f107558a[i10];
            long j10 = 1048575 & iX;
            switch (w(iX)) {
                case 0:
                    if (k(obj2, i10)) {
                        k6.l(obj, j10, k6.a(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 1:
                    if (k(obj2, i10)) {
                        k6.m(obj, j10, k6.b(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 2:
                    if (k(obj2, i10)) {
                        k6.o(obj, j10, k6.d(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 3:
                    if (k(obj2, i10)) {
                        k6.o(obj, j10, k6.d(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 4:
                    if (k(obj2, i10)) {
                        k6.n(obj, j10, k6.c(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 5:
                    if (k(obj2, i10)) {
                        k6.o(obj, j10, k6.d(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 6:
                    if (k(obj2, i10)) {
                        k6.n(obj, j10, k6.c(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 7:
                    if (k(obj2, i10)) {
                        k6.k(obj, j10, k6.t(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 8:
                    if (k(obj2, i10)) {
                        k6.p(obj, j10, k6.f(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 9:
                    G(obj, obj2, i10);
                    break;
                case 10:
                    if (k(obj2, i10)) {
                        k6.p(obj, j10, k6.f(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 11:
                    if (k(obj2, i10)) {
                        k6.n(obj, j10, k6.c(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 12:
                    if (k(obj2, i10)) {
                        k6.n(obj, j10, k6.c(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 13:
                    if (k(obj2, i10)) {
                        k6.n(obj, j10, k6.c(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 14:
                    if (k(obj2, i10)) {
                        k6.o(obj, j10, k6.d(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 15:
                    if (k(obj2, i10)) {
                        k6.n(obj, j10, k6.c(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 16:
                    if (k(obj2, i10)) {
                        k6.o(obj, j10, k6.d(obj2, j10));
                        I(obj, i10);
                    }
                    break;
                case 17:
                    G(obj, obj2, i10);
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
                    this.f107566i.b(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = k5.f107687d;
                    k6.p(obj, j10, r4.a(k6.f(obj, j10), k6.f(obj2, j10)));
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
                    if (p(obj2, i11, i10)) {
                        k6.p(obj, j10, k6.f(obj2, j10));
                        a(obj, i11, i10);
                    }
                    break;
                case 60:
                    H(obj, obj2, i10);
                    break;
                case 61:
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (p(obj2, i11, i10)) {
                        k6.p(obj, j10, k6.f(obj2, j10));
                        a(obj, i11, i10);
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    H(obj, obj2, i10);
                    break;
            }
        }
        k5.d(this.f107567j, obj, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b6 A[LOOP:1: B:45:0x00a5->B:50:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.i5
    public final boolean g(Object obj) {
        int i10;
        int i11;
        List list;
        i5 i5VarA;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i13 < this.f107564g) {
            int i16 = this.f107563f[i13];
            int i17 = this.f107558a[i16];
            int iX = this.x(i16);
            int i18 = this.f107558a[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i14 = f107557o.getInt(obj, i19);
                }
                i11 = i14;
                i10 = i19;
            } else {
                i10 = i15;
                i11 = i14;
            }
            a5<T> a5Var = this;
            Object obj2 = obj;
            if ((268435456 & iX) != 0 && !a5Var.l(obj2, i16, i10, i11, i20)) {
                return false;
            }
            int iW = w(iX);
            if (iW == 9 || iW == 17) {
                if (a5Var.l(obj2, i16, i10, i11, i20) && !n(obj2, iX, a5Var.A(i16))) {
                    return false;
                }
            } else if (iW == 27) {
                list = (List) k6.f(obj2, iX & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    i5VarA = a5Var.A(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!i5VarA.g(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iW == 60 || iW == 68) {
                if (a5Var.p(obj2, i17, i16) && !n(obj2, iX, a5Var.A(i16))) {
                    return false;
                }
            } else if (iW == 49) {
                list = (List) k6.f(obj2, iX & 1048575);
                if (list.isEmpty()) {
                    i5VarA = a5Var.A(i16);
                    while (i12 < list.size()) {
                        if (!i5VarA.g(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iW == 50 && !((q4) k6.f(obj2, iX & 1048575)).isEmpty()) {
                throw null;
            }
            i13++;
            this = a5Var;
            obj = obj2;
            i15 = i10;
            i14 = i11;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.i5
    public final Object m() {
        return ((t3) this.f107562e).c();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 40141. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int q(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, com.google.android.gms.internal.auth.q2 r41) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 4014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.a5.q(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.q2):int");
    }
}
