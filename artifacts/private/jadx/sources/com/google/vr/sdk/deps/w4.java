package com.google.vr.sdk.deps;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
final class w4<T> implements k5<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f129639r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f129640s = f6.w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f129641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f129642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f129643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f129644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t4 f129645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f129646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f129647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f129648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f129649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f129650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f129651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f129652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z4 f129653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e4 f129654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a6<?, ?> f129655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final y2<?> f129656p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p4 f129657q;

    private w4(int[] iArr, Object[] objArr, int i10, int i11, t4 t4Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, z4 z4Var, e4 e4Var, a6<?, ?> a6Var, y2<?> y2Var, p4 p4Var) {
        this.f129641a = iArr;
        this.f129642b = objArr;
        this.f129643c = i10;
        this.f129644d = i11;
        this.f129647g = t4Var instanceof i3;
        this.f129648h = z10;
        this.f129646f = y2Var != null && y2Var.i(t4Var);
        this.f129649i = z11;
        this.f129650j = iArr2;
        this.f129651k = i12;
        this.f129652l = i13;
        this.f129653m = z4Var;
        this.f129654n = e4Var;
        this.f129655o = a6Var;
        this.f129656p = y2Var;
        this.f129645e = t4Var;
        this.f129657q = p4Var;
    }

    private final Object A(int i10) {
        return this.f129642b[(i10 / 3) << 1];
    }

    private final void B(T t10, int i10) {
        if (this.f129648h) {
            return;
        }
        int iK = K(i10);
        long j10 = iK & 1048575;
        f6.j(t10, j10, f6.b(t10, j10) | (1 << (iK >>> 20)));
    }

    private final void C(T t10, int i10, int i11) {
        f6.j(t10, K(i11) & 1048575, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    private final void D(T t10, q6 q6Var) throws IOException {
        Iterator itR;
        Map.Entry<?, ?> entry;
        boolean z10;
        int i10;
        boolean z11;
        if (this.f129646f) {
            a3<i3.c> a3VarB = this.f129656p.b(t10);
            if (a3VarB.m()) {
                itR = null;
                entry = null;
            } else {
                itR = a3VarB.r();
                entry = (Map.Entry) itR.next();
            }
        } else {
            itR = null;
            entry = null;
        }
        int length = this.f129641a.length;
        Unsafe unsafe = f129640s;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int I = I(i13);
            int[] iArr = this.f129641a;
            int i14 = iArr[i13];
            int i15 = (267386880 & I) >>> 20;
            if (this.f129648h || i15 > 17) {
                z10 = true;
                i10 = 0;
            } else {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & 1048575;
                z10 = true;
                if (i17 != i11) {
                    i12 = unsafe.getInt(t10, i17);
                    i11 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            }
            while (entry != null && this.f129656p.a(entry) <= i14) {
                this.f129656p.g(q6Var, entry);
                entry = itR.hasNext() ? (Map.Entry) itR.next() : null;
            }
            long j10 = I & 1048575;
            switch (i15) {
                case 0:
                    if ((i10 & i12) != 0) {
                        q6Var.d(i14, f6.F(t10, j10));
                    }
                    break;
                case 1:
                    if ((i10 & i12) != 0) {
                        q6Var.e(i14, f6.A(t10, j10));
                    }
                    break;
                case 2:
                    if ((i10 & i12) != 0) {
                        q6Var.g(i14, unsafe.getLong(t10, j10));
                    }
                    break;
                case 3:
                    if ((i10 & i12) != 0) {
                        q6Var.z(i14, unsafe.getLong(t10, j10));
                    }
                    break;
                case 4:
                    if ((i10 & i12) != 0) {
                        q6Var.y(i14, unsafe.getInt(t10, j10));
                    }
                    break;
                case 5:
                    if ((i10 & i12) != 0) {
                        q6Var.C(i14, unsafe.getLong(t10, j10));
                    }
                    break;
                case 6:
                    if ((i10 & i12) != 0) {
                        q6Var.B(i14, unsafe.getInt(t10, j10));
                    }
                    break;
                case 7:
                    if ((i10 & i12) != 0) {
                        q6Var.p(i14, f6.z(t10, j10));
                    }
                    break;
                case 8:
                    if ((i10 & i12) != 0) {
                        p(i14, unsafe.getObject(t10, j10), q6Var);
                    }
                    break;
                case 9:
                    if ((i10 & i12) != 0) {
                        q6Var.k(i14, unsafe.getObject(t10, j10), k(i13));
                    }
                    break;
                case 10:
                    if ((i10 & i12) != 0) {
                        q6Var.h(i14, (k2) unsafe.getObject(t10, j10));
                    }
                    break;
                case 11:
                    if ((i10 & i12) != 0) {
                        q6Var.E(i14, unsafe.getInt(t10, j10));
                    }
                    break;
                case 12:
                    if ((i10 & i12) != 0) {
                        q6Var.r(i14, unsafe.getInt(t10, j10));
                    }
                    break;
                case 13:
                    if ((i10 & i12) != 0) {
                        q6Var.f(i14, unsafe.getInt(t10, j10));
                    }
                    break;
                case 14:
                    if ((i10 & i12) != 0) {
                        q6Var.s(i14, unsafe.getLong(t10, j10));
                    }
                    break;
                case 15:
                    if ((i10 & i12) != 0) {
                        q6Var.H(i14, unsafe.getInt(t10, j10));
                    }
                    break;
                case 16:
                    if ((i10 & i12) != 0) {
                        q6Var.F(i14, unsafe.getLong(t10, j10));
                    }
                    break;
                case 17:
                    if ((i10 & i12) != 0) {
                        q6Var.u(i14, unsafe.getObject(t10, j10), k(i13));
                    }
                    break;
                case 18:
                    m5.l(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, false);
                    break;
                case 19:
                    m5.y(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, false);
                    break;
                case 20:
                    m5.C(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, false);
                    break;
                case 21:
                    m5.G(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, false);
                    break;
                case 22:
                    m5.T(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, false);
                    break;
                case 23:
                    m5.N(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, false);
                    break;
                case 24:
                    m5.a0(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, false);
                    break;
                case 25:
                    m5.d0(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, false);
                    break;
                case 26:
                    m5.j(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var);
                    break;
                case 27:
                    m5.k(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, k(i13));
                    break;
                case 28:
                    m5.w(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var);
                    break;
                case 29:
                    z11 = false;
                    m5.W(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, false);
                    break;
                case 30:
                    z11 = false;
                    m5.c0(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, false);
                    break;
                case 31:
                    z11 = false;
                    m5.b0(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, false);
                    break;
                case 32:
                    z11 = false;
                    m5.Q(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, false);
                    break;
                case 33:
                    z11 = false;
                    m5.Z(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, false);
                    break;
                case 34:
                    z11 = false;
                    m5.K(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, false);
                    break;
                case 35:
                    m5.l(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, z10);
                    break;
                case 36:
                    m5.y(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, z10);
                    break;
                case 37:
                    m5.C(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, z10);
                    break;
                case 38:
                    m5.G(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, z10);
                    break;
                case 39:
                    m5.T(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, z10);
                    break;
                case 40:
                    m5.N(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, z10);
                    break;
                case 41:
                    m5.a0(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, z10);
                    break;
                case 42:
                    m5.d0(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, z10);
                    break;
                case 43:
                    m5.W(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, z10);
                    break;
                case 44:
                    m5.c0(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, z10);
                    break;
                case 45:
                    m5.b0(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, z10);
                    break;
                case 46:
                    m5.Q(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, z10);
                    break;
                case 47:
                    m5.Z(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, z10);
                    break;
                case 48:
                    m5.K(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, z10);
                    break;
                case 49:
                    m5.x(this.f129641a[i13], (List) unsafe.getObject(t10, j10), q6Var, k(i13));
                    break;
                case 50:
                    r(q6Var, i14, unsafe.getObject(t10, j10), i13);
                    break;
                case 51:
                    if (v(t10, i14, i13)) {
                        q6Var.d(i14, z(t10, j10));
                    }
                    break;
                case 52:
                    if (v(t10, i14, i13)) {
                        q6Var.e(i14, F(t10, j10));
                    }
                    break;
                case 53:
                    if (v(t10, i14, i13)) {
                        q6Var.g(i14, L(t10, j10));
                    }
                    break;
                case 54:
                    if (v(t10, i14, i13)) {
                        q6Var.z(i14, L(t10, j10));
                    }
                    break;
                case 55:
                    if (v(t10, i14, i13)) {
                        q6Var.y(i14, J(t10, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                    if (v(t10, i14, i13)) {
                        q6Var.C(i14, L(t10, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    if (v(t10, i14, i13)) {
                        q6Var.B(i14, J(t10, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                    if (v(t10, i14, i13)) {
                        q6Var.p(i14, N(t10, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (v(t10, i14, i13)) {
                        p(i14, unsafe.getObject(t10, j10), q6Var);
                    }
                    break;
                case 60:
                    if (v(t10, i14, i13)) {
                        q6Var.k(i14, unsafe.getObject(t10, j10), k(i13));
                    }
                    break;
                case 61:
                    if (v(t10, i14, i13)) {
                        q6Var.h(i14, (k2) unsafe.getObject(t10, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                    if (v(t10, i14, i13)) {
                        q6Var.E(i14, J(t10, j10));
                    }
                    break;
                case 63:
                    if (v(t10, i14, i13)) {
                        q6Var.r(i14, J(t10, j10));
                    }
                    break;
                case 64:
                    if (v(t10, i14, i13)) {
                        q6Var.f(i14, J(t10, j10));
                    }
                    break;
                case 65:
                    if (v(t10, i14, i13)) {
                        q6Var.s(i14, L(t10, j10));
                    }
                    break;
                case 66:
                    if (v(t10, i14, i13)) {
                        q6Var.H(i14, J(t10, j10));
                    }
                    break;
                case 67:
                    if (v(t10, i14, i13)) {
                        q6Var.F(i14, L(t10, j10));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    if (v(t10, i14, i13)) {
                        q6Var.u(i14, unsafe.getObject(t10, j10), k(i13));
                    }
                    break;
                default:
                    break;
            }
        }
        while (entry != null) {
            this.f129656p.g(q6Var, entry);
            entry = itR.hasNext() ? (Map.Entry) itR.next() : null;
        }
        q(this.f129655o, t10, q6Var);
    }

    private final void E(T t10, T t11, int i10) {
        int I = I(i10);
        int i11 = this.f129641a[i10];
        long j10 = I & 1048575;
        if (v(t11, i11, i10)) {
            Object objI = f6.I(t10, j10);
            Object objI2 = f6.I(t11, j10);
            if (objI != null && objI2 != null) {
                f6.l(t10, j10, k3.e(objI, objI2));
                C(t10, i11, i10);
            } else if (objI2 != null) {
                f6.l(t10, j10, objI2);
                C(t10, i11, i10);
            }
        }
    }

    private static <T> float F(T t10, long j10) {
        return ((Float) f6.I(t10, j10)).floatValue();
    }

    private final p3 G(int i10) {
        return (p3) this.f129642b[((i10 / 3) << 1) + 1];
    }

    private final boolean H(T t10, T t11, int i10) {
        return u(t10, i10) == u(t11, i10);
    }

    private final int I(int i10) {
        return this.f129641a[i10 + 1];
    }

    private static <T> int J(T t10, long j10) {
        return ((Integer) f6.I(t10, j10)).intValue();
    }

    private final int K(int i10) {
        return this.f129641a[i10 + 2];
    }

    private static <T> long L(T t10, long j10) {
        return ((Long) f6.I(t10, j10)).longValue();
    }

    private static boolean M(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static <T> boolean N(T t10, long j10) {
        return ((Boolean) f6.I(t10, j10)).booleanValue();
    }

    private static <UT, UB> int i(a6<UT, UB> a6Var, T t10) {
        return a6Var.E(a6Var.s(t10));
    }

    /* JADX WARN: Code duplicated, block: B:169:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:171:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:173:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:176:0x03c2 A[LOOP:6: B:174:0x03ba->B:176:0x03c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:179:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:182:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:183:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:185:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:187:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:191:0x040a  */
    /* JADX WARN: Code duplicated, block: B:195:0x041e  */
    /* JADX WARN: Code duplicated, block: B:217:0x03cc A[EDGE_INSN: B:217:0x03cc->B:177:0x03cc BREAK  A[LOOP:6: B:174:0x03ba->B:176:0x03c2], SYNTHETIC] */
    static <T> w4<T> j(r4 r4Var, z4 z4Var, e4 e4Var, a6<?, ?> a6Var, y2<?> y2Var, p4 p4Var) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int[] iArr;
        int i13;
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
        int i27;
        int i28;
        int i29;
        int iObjectFieldOffset;
        int i30;
        int iObjectFieldOffset2;
        int i31;
        int i32;
        int i33;
        int iCharAt2;
        int i34;
        Object obj;
        Field fieldN;
        int i35;
        int i36;
        char cCharAt9;
        int i37;
        Field fieldN2;
        Field fieldN3;
        int i38;
        int i39;
        char cCharAt10;
        int i40;
        char cCharAt11;
        int i41;
        int i42;
        char cCharAt12;
        int i43;
        char cCharAt13;
        char cCharAt14;
        if (!(r4Var instanceof i5)) {
            ((x5) r4Var).y();
            int i44 = e5.f129355b;
            throw new NoSuchMethodError();
        }
        i5 i5Var = (i5) r4Var;
        int i45 = 0;
        boolean z10 = i5Var.y() == e5.f129355b;
        String strA = i5Var.a();
        int length = strA.length();
        int iCharAt3 = strA.charAt(0);
        if (iCharAt3 >= 55296) {
            int i46 = iCharAt3 & 8191;
            int i47 = 1;
            int i48 = 13;
            while (true) {
                i10 = i47 + 1;
                cCharAt14 = strA.charAt(i47);
                if (cCharAt14 < 55296) {
                    break;
                }
                i46 |= (cCharAt14 & 8191) << i48;
                i48 += 13;
                i47 = i10;
            }
            iCharAt3 = i46 | (cCharAt14 << i48);
        } else {
            i10 = 1;
        }
        int i49 = i10 + 1;
        int iCharAt4 = strA.charAt(i10);
        if (iCharAt4 >= 55296) {
            int i50 = iCharAt4 & 8191;
            int i51 = 13;
            while (true) {
                i43 = i49 + 1;
                cCharAt13 = strA.charAt(i49);
                if (cCharAt13 < 55296) {
                    break;
                }
                i50 |= (cCharAt13 & 8191) << i51;
                i51 += 13;
                i49 = i43;
            }
            iCharAt4 = i50 | (cCharAt13 << i51);
            i49 = i43;
        }
        if (iCharAt4 == 0) {
            i13 = 0;
            iCharAt = 0;
            i15 = 0;
            i16 = 0;
            i12 = 0;
            iArr = f129639r;
            i14 = 0;
        } else {
            int i52 = i49 + 1;
            int iCharAt5 = strA.charAt(i49);
            if (iCharAt5 >= 55296) {
                int i53 = iCharAt5 & 8191;
                int i54 = 13;
                while (true) {
                    i24 = i52 + 1;
                    cCharAt8 = strA.charAt(i52);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt8 & 8191) << i54;
                    i54 += 13;
                    i52 = i24;
                }
                iCharAt5 = i53 | (cCharAt8 << i54);
                i52 = i24;
            }
            int i55 = i52 + 1;
            int iCharAt6 = strA.charAt(i52);
            if (iCharAt6 >= 55296) {
                int i56 = iCharAt6 & 8191;
                int i57 = 13;
                while (true) {
                    i23 = i55 + 1;
                    cCharAt7 = strA.charAt(i55);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt7 & 8191) << i57;
                    i57 += 13;
                    i55 = i23;
                }
                iCharAt6 = i56 | (cCharAt7 << i57);
                i55 = i23;
            }
            int i58 = i55 + 1;
            iCharAt = strA.charAt(i55);
            if (iCharAt >= 55296) {
                int i59 = iCharAt & 8191;
                int i60 = 13;
                while (true) {
                    i22 = i58 + 1;
                    cCharAt6 = strA.charAt(i58);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt6 & 8191) << i60;
                    i60 += 13;
                    i58 = i22;
                }
                iCharAt = i59 | (cCharAt6 << i60);
                i58 = i22;
            }
            int i61 = i58 + 1;
            int iCharAt7 = strA.charAt(i58);
            if (iCharAt7 >= 55296) {
                int i62 = iCharAt7 & 8191;
                int i63 = 13;
                while (true) {
                    i21 = i61 + 1;
                    cCharAt5 = strA.charAt(i61);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt5 & 8191) << i63;
                    i63 += 13;
                    i61 = i21;
                }
                iCharAt7 = i62 | (cCharAt5 << i63);
                i61 = i21;
            }
            int i64 = i61 + 1;
            int iCharAt8 = strA.charAt(i61);
            if (iCharAt8 >= 55296) {
                int i65 = iCharAt8 & 8191;
                int i66 = 13;
                while (true) {
                    i20 = i64 + 1;
                    cCharAt4 = strA.charAt(i64);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i65 |= (cCharAt4 & 8191) << i66;
                    i66 += 13;
                    i64 = i20;
                }
                iCharAt8 = i65 | (cCharAt4 << i66);
                i64 = i20;
            }
            int i67 = i64 + 1;
            int iCharAt9 = strA.charAt(i64);
            if (iCharAt9 >= 55296) {
                int i68 = iCharAt9 & 8191;
                int i69 = 13;
                while (true) {
                    i19 = i67 + 1;
                    cCharAt3 = strA.charAt(i67);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i68 |= (cCharAt3 & 8191) << i69;
                    i69 += 13;
                    i67 = i19;
                }
                iCharAt9 = i68 | (cCharAt3 << i69);
                i67 = i19;
            }
            int i70 = i67 + 1;
            int iCharAt10 = strA.charAt(i67);
            if (iCharAt10 >= 55296) {
                int i71 = iCharAt10 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i18 = i72 + 1;
                    cCharAt2 = strA.charAt(i72);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i71 |= (cCharAt2 & 8191) << i73;
                    i73 += 13;
                    i72 = i18;
                }
                iCharAt10 = i71 | (cCharAt2 << i73);
                i11 = i18;
            } else {
                i11 = i70;
            }
            int i74 = i11 + 1;
            int iCharAt11 = strA.charAt(i11);
            if (iCharAt11 >= 55296) {
                int i75 = iCharAt11 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i17 = i76 + 1;
                    cCharAt = strA.charAt(i76);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i75 |= (cCharAt & 8191) << i77;
                    i77 += 13;
                    i76 = i17;
                }
                iCharAt11 = i75 | (cCharAt << i77);
                i74 = i17;
            }
            int[] iArr2 = new int[iCharAt11 + iCharAt9 + iCharAt10];
            i12 = (iCharAt5 << 1) + iCharAt6;
            int i78 = iCharAt8;
            iArr = iArr2;
            i13 = i78;
            i14 = iCharAt7;
            i15 = iCharAt9;
            i16 = iCharAt11;
            i45 = iCharAt5;
            i49 = i74;
        }
        int i79 = 1;
        Unsafe unsafe = f129640s;
        Object[] objArrD = i5Var.d();
        Class<?> cls = i5Var.c().getClass();
        int[] iArr3 = new int[i13 * 3];
        Object[] objArr = new Object[i13 << 1];
        int i80 = i15 + i16;
        int i81 = i80;
        int i82 = i16;
        int i83 = 0;
        int i84 = 0;
        while (i49 < length) {
            int i85 = i49 + 1;
            int iCharAt12 = strA.charAt(i49);
            int[] iArr4 = iArr3;
            if (iCharAt12 >= 55296) {
                int i86 = iCharAt12 & 8191;
                int i87 = i85;
                int i88 = 13;
                while (true) {
                    i42 = i87 + 1;
                    cCharAt12 = strA.charAt(i87);
                    i25 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i86 |= (cCharAt12 & 8191) << i88;
                    i88 += 13;
                    i87 = i42;
                    length = i25;
                }
                iCharAt12 = i86 | (cCharAt12 << i88);
                i26 = i42;
            } else {
                i25 = length;
                i26 = i85;
            }
            int i89 = i26 + 1;
            int iCharAt13 = strA.charAt(i26);
            if (iCharAt13 >= 55296) {
                int i90 = iCharAt13 & 8191;
                int i91 = i89;
                int i92 = 13;
                while (true) {
                    i40 = i91 + 1;
                    cCharAt11 = strA.charAt(i91);
                    i41 = i90;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i90 = i41 | ((cCharAt11 & 8191) << i92);
                    i92 += 13;
                    i91 = i40;
                }
                iCharAt13 = i41 | (cCharAt11 << i92);
                i27 = i40;
            } else {
                i27 = i89;
            }
            int i93 = i45;
            int i94 = iCharAt13 & 255;
            int i95 = iCharAt3;
            if ((iCharAt13 & 1024) != 0) {
                iArr[i84] = i83;
                i84++;
            }
            Object[] objArr2 = objArr;
            if (i94 >= 51) {
                int i96 = i27 + 1;
                int iCharAt14 = strA.charAt(i27);
                char c10 = 55296;
                if (iCharAt14 >= 55296) {
                    int i97 = iCharAt14 & 8191;
                    int i98 = 13;
                    while (true) {
                        i39 = i96 + 1;
                        cCharAt10 = strA.charAt(i96);
                        if (cCharAt10 < c10) {
                            break;
                        }
                        i97 |= (cCharAt10 & 8191) << i98;
                        i98 += 13;
                        i96 = i39;
                        c10 = 55296;
                    }
                    iCharAt14 = i97 | (cCharAt10 << i98);
                    i96 = i39;
                }
                int i99 = i94 - 51;
                int i100 = iCharAt14;
                if (i99 == 9 || i99 == 17) {
                    objArr2[((i83 / 3) << 1) + 1] = objArrD[i12];
                    i12++;
                } else if (i99 == 12 && (i95 & 1) == (i38 = i79)) {
                    objArr2[((i83 / 3) << i38) + i38] = objArrD[i12];
                    i12++;
                }
                int i101 = i100 << 1;
                Object obj2 = objArrD[i101];
                if (obj2 instanceof Field) {
                    fieldN2 = (Field) obj2;
                } else {
                    fieldN2 = n(cls, (String) obj2);
                    objArrD[i101] = fieldN2;
                }
                int i102 = i96;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldN2);
                int i103 = i101 + 1;
                Object obj3 = objArrD[i103];
                if (obj3 instanceof Field) {
                    fieldN3 = (Field) obj3;
                } else {
                    fieldN3 = n(cls, (String) obj3);
                    objArrD[i103] = fieldN3;
                }
                i28 = iCharAt12;
                i49 = i102;
                strA = strA;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN3);
                i29 = i12;
                i32 = iObjectFieldOffset3;
                i31 = 0;
                i79 = 1;
                i14 = i14;
            } else {
                int i104 = i12 + 1;
                Field fieldN4 = n(cls, (String) objArrD[i12]);
                if (i94 == 9 || i94 == 17) {
                    i28 = iCharAt12;
                    objArr2[((i83 / 3) << 1) + 1] = fieldN4.getType();
                } else {
                    if (i94 == 27 || i94 == 49) {
                        i28 = iCharAt12;
                        i37 = i12 + 2;
                        objArr2[((i83 / 3) << 1) + 1] = objArrD[i104];
                    } else if (i94 == 12 || i94 == 30 || i94 == 44) {
                        i28 = iCharAt12;
                        if ((i95 & 1) == 1) {
                            i37 = i12 + 2;
                            objArr2[((i83 / 3) << 1) + 1] = objArrD[i104];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN4);
                        if ((i95 & 1) == 1) {
                            if (i94 <= 17) {
                                i33 = i27 + 1;
                                iCharAt2 = strA.charAt(i27);
                                if (iCharAt2 >= 55296) {
                                    i35 = iCharAt2 & 8191;
                                    i36 = 13;
                                    while (true) {
                                        i30 = i33 + 1;
                                        cCharAt9 = strA.charAt(i33);
                                        if (cCharAt9 >= 55296) {
                                            break;
                                        }
                                        i35 |= (cCharAt9 & 8191) << i36;
                                        i36 += 13;
                                        i33 = i30;
                                    }
                                    iCharAt2 = i35 | (cCharAt9 << i36);
                                } else {
                                    i30 = i33;
                                }
                                i79 = 1;
                                i34 = (i93 << 1) + (iCharAt2 / 32);
                                obj = objArrD[i34];
                                if (obj instanceof Field) {
                                    fieldN = (Field) obj;
                                } else {
                                    fieldN = n(cls, (String) obj);
                                    objArrD[i34] = fieldN;
                                }
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN);
                                i31 = iCharAt2 % 32;
                            } else {
                                i79 = 1;
                            }
                            if (i94 >= 18 || i94 > 49) {
                                i32 = iObjectFieldOffset;
                            } else {
                                iArr[i81] = iObjectFieldOffset;
                                i32 = iObjectFieldOffset;
                                i81++;
                            }
                            i49 = i30;
                        } else {
                            i79 = 1;
                        }
                        i30 = i27;
                        iObjectFieldOffset2 = 0;
                        i31 = 0;
                        if (i94 >= 18) {
                            i32 = iObjectFieldOffset;
                        } else {
                            i32 = iObjectFieldOffset;
                        }
                        i49 = i30;
                    } else {
                        if (i94 == 50) {
                            int i105 = i82 + 1;
                            iArr[i82] = i83;
                            int i106 = (i83 / 3) << 1;
                            int i107 = i12 + 2;
                            objArr2[i106] = objArrD[i104];
                            if ((iCharAt13 & 2048) != 0) {
                                i29 = i12 + 3;
                                objArr2[i106 + 1] = objArrD[i107];
                                i28 = iCharAt12;
                                i82 = i105;
                            } else {
                                i29 = i107;
                                i82 = i105;
                                i28 = iCharAt12;
                            }
                        } else {
                            i28 = iCharAt12;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN4);
                        if ((i95 & 1) == 1) {
                            if (i94 <= 17) {
                                i33 = i27 + 1;
                                iCharAt2 = strA.charAt(i27);
                                if (iCharAt2 >= 55296) {
                                    i35 = iCharAt2 & 8191;
                                    i36 = 13;
                                    while (true) {
                                        i30 = i33 + 1;
                                        cCharAt9 = strA.charAt(i33);
                                        if (cCharAt9 >= 55296) {
                                            break;
                                            break;
                                        }
                                        i35 |= (cCharAt9 & 8191) << i36;
                                        i36 += 13;
                                        i33 = i30;
                                    }
                                    iCharAt2 = i35 | (cCharAt9 << i36);
                                } else {
                                    i30 = i33;
                                }
                                i79 = 1;
                                i34 = (i93 << 1) + (iCharAt2 / 32);
                                obj = objArrD[i34];
                                if (obj instanceof Field) {
                                    fieldN = (Field) obj;
                                } else {
                                    fieldN = n(cls, (String) obj);
                                    objArrD[i34] = fieldN;
                                }
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN);
                                i31 = iCharAt2 % 32;
                            } else {
                                i79 = 1;
                            }
                            if (i94 >= 18) {
                                i32 = iObjectFieldOffset;
                            } else {
                                i32 = iObjectFieldOffset;
                            }
                            i49 = i30;
                        } else {
                            i79 = 1;
                        }
                        i30 = i27;
                        iObjectFieldOffset2 = 0;
                        i31 = 0;
                        if (i94 >= 18) {
                            i32 = iObjectFieldOffset;
                        } else {
                            i32 = iObjectFieldOffset;
                        }
                        i49 = i30;
                    }
                    i29 = i37;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN4);
                    if ((i95 & 1) == 1) {
                        if (i94 <= 17) {
                            i33 = i27 + 1;
                            iCharAt2 = strA.charAt(i27);
                            if (iCharAt2 >= 55296) {
                                i35 = iCharAt2 & 8191;
                                i36 = 13;
                                while (true) {
                                    i30 = i33 + 1;
                                    cCharAt9 = strA.charAt(i33);
                                    if (cCharAt9 >= 55296) {
                                        break;
                                        break;
                                    }
                                    i35 |= (cCharAt9 & 8191) << i36;
                                    i36 += 13;
                                    i33 = i30;
                                }
                                iCharAt2 = i35 | (cCharAt9 << i36);
                            } else {
                                i30 = i33;
                            }
                            i79 = 1;
                            i34 = (i93 << 1) + (iCharAt2 / 32);
                            obj = objArrD[i34];
                            if (obj instanceof Field) {
                                fieldN = (Field) obj;
                            } else {
                                fieldN = n(cls, (String) obj);
                                objArrD[i34] = fieldN;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN);
                            i31 = iCharAt2 % 32;
                        } else {
                            i79 = 1;
                        }
                        if (i94 >= 18) {
                            i32 = iObjectFieldOffset;
                        } else {
                            i32 = iObjectFieldOffset;
                        }
                        i49 = i30;
                    } else {
                        i79 = 1;
                    }
                    i30 = i27;
                    iObjectFieldOffset2 = 0;
                    i31 = 0;
                    if (i94 >= 18) {
                        i32 = iObjectFieldOffset;
                    } else {
                        i32 = iObjectFieldOffset;
                    }
                    i49 = i30;
                }
                i29 = i104;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN4);
                if ((i95 & 1) == 1) {
                    if (i94 <= 17) {
                        i33 = i27 + 1;
                        iCharAt2 = strA.charAt(i27);
                        if (iCharAt2 >= 55296) {
                            i35 = iCharAt2 & 8191;
                            i36 = 13;
                            while (true) {
                                i30 = i33 + 1;
                                cCharAt9 = strA.charAt(i33);
                                if (cCharAt9 >= 55296) {
                                    break;
                                    break;
                                }
                                i35 |= (cCharAt9 & 8191) << i36;
                                i36 += 13;
                                i33 = i30;
                            }
                            iCharAt2 = i35 | (cCharAt9 << i36);
                        } else {
                            i30 = i33;
                        }
                        i79 = 1;
                        i34 = (i93 << 1) + (iCharAt2 / 32);
                        obj = objArrD[i34];
                        if (obj instanceof Field) {
                            fieldN = (Field) obj;
                        } else {
                            fieldN = n(cls, (String) obj);
                            objArrD[i34] = fieldN;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN);
                        i31 = iCharAt2 % 32;
                    } else {
                        i79 = 1;
                    }
                    if (i94 >= 18) {
                        i32 = iObjectFieldOffset;
                    } else {
                        i32 = iObjectFieldOffset;
                    }
                    i49 = i30;
                } else {
                    i79 = 1;
                }
                i30 = i27;
                iObjectFieldOffset2 = 0;
                i31 = 0;
                if (i94 >= 18) {
                    i32 = iObjectFieldOffset;
                } else {
                    i32 = iObjectFieldOffset;
                }
                i49 = i30;
            }
            int i108 = i83 + 1;
            iArr4[i83] = i28;
            int i109 = i83 + 2;
            int i110 = iObjectFieldOffset2;
            iArr4[i108] = ((iCharAt13 & 256) != 0 ? 268435456 : 0) | ((iCharAt13 & 512) != 0 ? 536870912 : 0) | (i94 << 20) | i32;
            i83 += 3;
            iArr4[i109] = (i31 << 20) | i110;
            i14 = i14;
            i45 = i93;
            iArr3 = iArr4;
            iCharAt3 = i95;
            length = i25;
            strA = strA;
            i12 = i29;
            objArr = objArr2;
        }
        return new w4<>(iArr3, objArr, iCharAt, i14, i5Var.c(), z10, false, iArr, i16, i80, z4Var, e4Var, a6Var, y2Var, p4Var);
    }

    private final k5 k(int i10) {
        int i11 = (i10 / 3) << 1;
        k5 k5Var = (k5) this.f129642b[i11];
        if (k5Var != null) {
            return k5Var;
        }
        k5<T> k5VarB = f5.a().b((Class) this.f129642b[i11 + 1]);
        this.f129642b[i11] = k5VarB;
        return k5VarB;
    }

    private final <K, V, UT, UB> UB l(int i10, int i11, Map<K, V> map, p3 p3Var, UB ub2, a6<UT, UB> a6Var) {
        n4<?, ?> n4VarJ = this.f129657q.j(A(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!p3Var.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = a6Var.r();
                }
                n4 n4VarC = k2.C(m4.c(n4VarJ, next.getKey(), next.getValue()));
                try {
                    m4.l(n4VarC.b(), n4VarJ, next.getKey(), next.getValue());
                    a6Var.j(ub2, i11, n4VarC.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private final <UT, UB> UB m(Object obj, int i10, UB ub2, a6<UT, UB> a6Var) {
        p3 p3VarG;
        int i11 = this.f129641a[i10];
        Object objI = f6.I(obj, I(i10) & 1048575);
        if (objI != null && (p3VarG = G(i10)) != null) {
            return (UB) l(i10, i11, this.f129657q.d(objI), p3VarG, ub2, a6Var);
        }
        return ub2;
    }

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(string).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(string);
            throw new RuntimeException(sb2.toString());
        }
    }

    private static <E> List<E> o(Object obj, long j10) {
        return (List) f6.I(obj, j10);
    }

    private static void p(int i10, Object obj, q6 q6Var) throws IOException {
        if (obj instanceof String) {
            q6Var.l(i10, (String) obj);
        } else {
            q6Var.h(i10, (k2) obj);
        }
    }

    private static <UT, UB> void q(a6<UT, UB> a6Var, T t10, q6 q6Var) throws IOException {
        a6Var.m(a6Var.s(t10), q6Var);
    }

    private final <K, V> void r(q6 q6Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            q6Var.i(i10, this.f129657q.j(A(i11)), this.f129657q.g(obj));
        }
    }

    private final void s(Object obj, int i10, j5 j5Var) throws IOException {
        if (M(i10)) {
            f6.l(obj, i10 & 1048575, j5Var.m());
        } else if (this.f129647g) {
            f6.l(obj, i10 & 1048575, j5Var.l());
        } else {
            f6.l(obj, i10 & 1048575, j5Var.n());
        }
    }

    private final void t(T t10, T t11, int i10) {
        long jI = I(i10) & 1048575;
        if (u(t11, i10)) {
            Object objI = f6.I(t10, jI);
            Object objI2 = f6.I(t11, jI);
            if (objI != null && objI2 != null) {
                f6.l(t10, jI, k3.e(objI, objI2));
                B(t10, i10);
            } else if (objI2 != null) {
                f6.l(t10, jI, objI2);
                B(t10, i10);
            }
        }
    }

    private final boolean u(T t10, int i10) {
        if (!this.f129648h) {
            int iK = K(i10);
            return (f6.b(t10, (long) (iK & 1048575)) & (1 << (iK >>> 20))) != 0;
        }
        int I = I(i10);
        long j10 = I & 1048575;
        switch ((I & 267386880) >>> 20) {
            case 0:
                return f6.F(t10, j10) != 0.0d;
            case 1:
                return f6.A(t10, j10) != 0.0f;
            case 2:
                return f6.r(t10, j10) != 0;
            case 3:
                return f6.r(t10, j10) != 0;
            case 4:
                return f6.b(t10, j10) != 0;
            case 5:
                return f6.r(t10, j10) != 0;
            case 6:
                return f6.b(t10, j10) != 0;
            case 7:
                return f6.z(t10, j10);
            case 8:
                Object objI = f6.I(t10, j10);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof k2) {
                    return !k2.f129465b.equals(objI);
                }
                throw new IllegalArgumentException();
            case 9:
                return f6.I(t10, j10) != null;
            case 10:
                return !k2.f129465b.equals(f6.I(t10, j10));
            case 11:
                return f6.b(t10, j10) != 0;
            case 12:
                return f6.b(t10, j10) != 0;
            case 13:
                return f6.b(t10, j10) != 0;
            case 14:
                return f6.r(t10, j10) != 0;
            case 15:
                return f6.b(t10, j10) != 0;
            case 16:
                return f6.r(t10, j10) != 0;
            case 17:
                return f6.I(t10, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean v(T t10, int i10, int i11) {
        return f6.b(t10, (long) (K(i11) & 1048575)) == i10;
    }

    private final boolean w(T t10, int i10, int i11, int i12) {
        if (this.f129648h) {
            return u(t10, i10);
        }
        return (i11 & i12) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean x(Object obj, int i10, k5 k5Var) {
        return k5Var.d(f6.I(obj, i10 & 1048575));
    }

    private static <T> double z(T t10, long j10) {
        return ((Double) f6.I(t10, j10)).doubleValue();
    }

    @Override // com.google.vr.sdk.deps.k5
    public final void a(T t10) {
        int i10;
        int i11 = this.f129651k;
        while (true) {
            i10 = this.f129652l;
            if (i11 >= i10) {
                break;
            }
            long jI = I(this.f129650j[i11]) & 1048575;
            Object objI = f6.I(t10, jI);
            if (objI != null) {
                f6.l(t10, jI, this.f129657q.i(objI));
            }
            i11++;
        }
        int length = this.f129650j.length;
        while (i10 < length) {
            this.f129654n.e(t10, this.f129650j[i10]);
            i10++;
        }
        this.f129655o.C(t10);
        if (this.f129646f) {
            this.f129656p.k(t10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    @Override // com.google.vr.sdk.deps.k5
    public final boolean b(T t10, T t11) {
        int length = this.f129641a.length;
        int i10 = 0;
        while (true) {
            boolean zQ = true;
            if (i10 >= length) {
                if (!this.f129655o.s(t10).equals(this.f129655o.s(t11))) {
                    return false;
                }
                if (this.f129646f) {
                    return this.f129656p.b(t10).equals(this.f129656p.b(t11));
                }
                return true;
            }
            int I = I(i10);
            long j10 = I & 1048575;
            switch ((I & 267386880) >>> 20) {
                case 0:
                    if (!H(t10, t11, i10) || Double.doubleToLongBits(f6.F(t10, j10)) != Double.doubleToLongBits(f6.F(t11, j10))) {
                        zQ = false;
                    }
                    break;
                case 1:
                    if (!H(t10, t11, i10) || Float.floatToIntBits(f6.A(t10, j10)) != Float.floatToIntBits(f6.A(t11, j10))) {
                        zQ = false;
                    }
                    break;
                case 2:
                    if (!H(t10, t11, i10) || f6.r(t10, j10) != f6.r(t11, j10)) {
                        zQ = false;
                    }
                    break;
                case 3:
                    if (!H(t10, t11, i10) || f6.r(t10, j10) != f6.r(t11, j10)) {
                        zQ = false;
                    }
                    break;
                case 4:
                    if (!H(t10, t11, i10) || f6.b(t10, j10) != f6.b(t11, j10)) {
                        zQ = false;
                    }
                    break;
                case 5:
                    if (!H(t10, t11, i10) || f6.r(t10, j10) != f6.r(t11, j10)) {
                        zQ = false;
                    }
                    break;
                case 6:
                    if (!H(t10, t11, i10) || f6.b(t10, j10) != f6.b(t11, j10)) {
                        zQ = false;
                    }
                    break;
                case 7:
                    if (!H(t10, t11, i10) || f6.z(t10, j10) != f6.z(t11, j10)) {
                        zQ = false;
                    }
                    break;
                case 8:
                    if (!H(t10, t11, i10) || !m5.q(f6.I(t10, j10), f6.I(t11, j10))) {
                        zQ = false;
                    }
                    break;
                case 9:
                    if (!H(t10, t11, i10) || !m5.q(f6.I(t10, j10), f6.I(t11, j10))) {
                        zQ = false;
                    }
                    break;
                case 10:
                    if (!H(t10, t11, i10) || !m5.q(f6.I(t10, j10), f6.I(t11, j10))) {
                        zQ = false;
                    }
                    break;
                case 11:
                    if (!H(t10, t11, i10) || f6.b(t10, j10) != f6.b(t11, j10)) {
                        zQ = false;
                    }
                    break;
                case 12:
                    if (!H(t10, t11, i10) || f6.b(t10, j10) != f6.b(t11, j10)) {
                        zQ = false;
                    }
                    break;
                case 13:
                    if (!H(t10, t11, i10) || f6.b(t10, j10) != f6.b(t11, j10)) {
                        zQ = false;
                    }
                    break;
                case 14:
                    if (!H(t10, t11, i10) || f6.r(t10, j10) != f6.r(t11, j10)) {
                        zQ = false;
                    }
                    break;
                case 15:
                    if (!H(t10, t11, i10) || f6.b(t10, j10) != f6.b(t11, j10)) {
                        zQ = false;
                    }
                    break;
                case 16:
                    if (!H(t10, t11, i10) || f6.r(t10, j10) != f6.r(t11, j10)) {
                        zQ = false;
                    }
                    break;
                case 17:
                    if (!H(t10, t11, i10) || !m5.q(f6.I(t10, j10), f6.I(t11, j10))) {
                        zQ = false;
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
                    zQ = m5.q(f6.I(t10, j10), f6.I(t11, j10));
                    break;
                case 50:
                    zQ = m5.q(f6.I(t10, j10), f6.I(t11, j10));
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
                    long jK = K(i10) & 1048575;
                    if (f6.b(t10, jK) != f6.b(t11, jK) || !m5.q(f6.I(t10, j10), f6.I(t11, j10))) {
                        zQ = false;
                    }
                    break;
            }
            if (!zQ) {
                return false;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:261:0x0572 A[PHI: r5
      0x0572: PHI (r5v4 int) = 
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v12 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v13 int)
      (r5v1 int)
     binds: [B:255:0x0559, B:461:0x09c6, B:458:0x09bc, B:452:0x09a0, B:449:0x098e, B:446:0x097e, B:443:0x0970, B:440:0x0962, B:437:0x0957, B:434:0x094d, B:431:0x093f, B:428:0x0931, B:425:0x091d, B:401:0x082b, B:395:0x080d, B:389:0x07ef, B:383:0x07d1, B:377:0x07b3, B:371:0x0795, B:365:0x0777, B:359:0x0759, B:353:0x073b, B:347:0x071e, B:341:0x0701, B:335:0x06e4, B:329:0x06c7, B:322:0x06a7, B:317:0x0673, B:314:0x0666, B:311:0x0656, B:308:0x0646, B:305:0x0636, B:302:0x062a, B:299:0x061e, B:296:0x0612, B:290:0x05f4, B:287:0x05e1, B:284:0x05d0, B:281:0x05c1, B:278:0x05b2, B:276:0x05ac, B:274:0x05a5, B:271:0x059a, B:268:0x058b, B:265:0x057c, B:260:0x0571, B:258:0x0561] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.vr.sdk.deps.k5
    public final int c(T t10) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int iE0;
        int iG;
        int iH0;
        boolean z12;
        int iR;
        int iV;
        int iL0;
        int iV0;
        int iB;
        int iV2;
        int iL1;
        int iV1;
        int i12 = 267386880;
        int i13 = 1048575;
        if (this.f129648h) {
            Unsafe unsafe = f129640s;
            int i14 = 0;
            int i15 = 0;
            while (i14 < this.f129641a.length) {
                int I = I(i14);
                int i16 = (I & i12) >>> 20;
                int i17 = i12;
                int i18 = this.f129641a[i14];
                long j10 = I & 1048575;
                int i19 = (i16 < c3.f127748r3.l() || i16 > c3.E3.l()) ? 0 : this.f129641a[i14 + 2] & 1048575;
                switch (i16) {
                    case 0:
                        if (u(t10, i14)) {
                            iB = t2.B(i18, 0.0d);
                            i15 += iB;
                        }
                        break;
                    case 1:
                        if (u(t10, i14)) {
                            iB = t2.C(i18, 0.0f);
                            i15 += iB;
                        }
                        break;
                    case 2:
                        if (u(t10, i14)) {
                            iB = t2.e0(i18, f6.r(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case 3:
                        if (u(t10, i14)) {
                            iB = t2.m0(i18, f6.r(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case 4:
                        if (u(t10, i14)) {
                            iB = t2.r0(i18, f6.b(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case 5:
                        if (u(t10, i14)) {
                            iB = t2.x0(i18, 0L);
                            i15 += iB;
                        }
                        break;
                    case 6:
                        if (u(t10, i14)) {
                            iB = t2.F0(i18, 0);
                            i15 += iB;
                        }
                        break;
                    case 7:
                        if (u(t10, i14)) {
                            iB = t2.G(i18, true);
                            i15 += iB;
                        }
                        break;
                    case 8:
                        if (u(t10, i14)) {
                            Object objI = f6.I(t10, j10);
                            iB = objI instanceof k2 ? t2.U(i18, (k2) objI) : t2.F(i18, (String) objI);
                            i15 += iB;
                        }
                        break;
                    case 9:
                        if (u(t10, i14)) {
                            iB = m5.a(i18, f6.I(t10, j10), k(i14));
                            i15 += iB;
                        }
                        break;
                    case 10:
                        if (u(t10, i14)) {
                            iB = t2.U(i18, (k2) f6.I(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case 11:
                        if (u(t10, i14)) {
                            iB = t2.w0(i18, f6.b(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case 12:
                        if (u(t10, i14)) {
                            iB = t2.K0(i18, f6.b(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case 13:
                        if (u(t10, i14)) {
                            iB = t2.H0(i18, 0);
                            i15 += iB;
                        }
                        break;
                    case 14:
                        if (u(t10, i14)) {
                            iB = t2.B0(i18, 0L);
                            i15 += iB;
                        }
                        break;
                    case 15:
                        if (u(t10, i14)) {
                            iB = t2.A0(i18, f6.b(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case 16:
                        if (u(t10, i14)) {
                            iB = t2.s0(i18, f6.r(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case 17:
                        if (u(t10, i14)) {
                            iB = t2.W(i18, (t4) f6.I(t10, j10), k(i14));
                            i15 += iB;
                        }
                        break;
                    case 18:
                        iB = m5.U(i18, o(t10, j10), false);
                        i15 += iB;
                        break;
                    case 19:
                        iB = m5.R(i18, o(t10, j10), false);
                        i15 += iB;
                        break;
                    case 20:
                        iB = m5.d(i18, o(t10, j10), false);
                        i15 += iB;
                        break;
                    case 21:
                        iB = m5.t(i18, o(t10, j10), false);
                        i15 += iB;
                        break;
                    case 22:
                        iB = m5.H(i18, o(t10, j10), false);
                        i15 += iB;
                        break;
                    case 23:
                        iB = m5.U(i18, o(t10, j10), false);
                        i15 += iB;
                        break;
                    case 24:
                        iB = m5.R(i18, o(t10, j10), false);
                        i15 += iB;
                        break;
                    case 25:
                        iB = m5.X(i18, o(t10, j10), false);
                        i15 += iB;
                        break;
                    case 26:
                        iB = m5.b(i18, o(t10, j10));
                        i15 += iB;
                        break;
                    case 27:
                        iB = m5.c(i18, o(t10, j10), k(i14));
                        i15 += iB;
                        break;
                    case 28:
                        iB = m5.r(i18, o(t10, j10));
                        i15 += iB;
                        break;
                    case 29:
                        iB = m5.L(i18, o(t10, j10), false);
                        i15 += iB;
                        break;
                    case 30:
                        iB = m5.D(i18, o(t10, j10), false);
                        i15 += iB;
                        break;
                    case 31:
                        iB = m5.R(i18, o(t10, j10), false);
                        i15 += iB;
                        break;
                    case 32:
                        iB = m5.U(i18, o(t10, j10), false);
                        i15 += iB;
                        break;
                    case 33:
                        iB = m5.O(i18, o(t10, j10), false);
                        i15 += iB;
                        break;
                    case 34:
                        iB = m5.z(i18, o(t10, j10), false);
                        i15 += iB;
                        break;
                    case 35:
                        iV2 = m5.V((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            if (this.f129649i) {
                                unsafe.putInt(t10, i19, iV2);
                            }
                            iL1 = t2.l0(i18);
                            iV1 = t2.v0(iV2);
                            iB = iL1 + iV1 + iV2;
                            i15 += iB;
                        }
                        break;
                    case 36:
                        iV2 = m5.S((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            if (this.f129649i) {
                                unsafe.putInt(t10, i19, iV2);
                            }
                            iL1 = t2.l0(i18);
                            iV1 = t2.v0(iV2);
                            iB = iL1 + iV1 + iV2;
                            i15 += iB;
                        }
                        break;
                    case 37:
                        iV2 = m5.e((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            if (this.f129649i) {
                                unsafe.putInt(t10, i19, iV2);
                            }
                            iL1 = t2.l0(i18);
                            iV1 = t2.v0(iV2);
                            iB = iL1 + iV1 + iV2;
                            i15 += iB;
                        }
                        break;
                    case 38:
                        iV2 = m5.u((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            if (this.f129649i) {
                                unsafe.putInt(t10, i19, iV2);
                            }
                            iL1 = t2.l0(i18);
                            iV1 = t2.v0(iV2);
                            iB = iL1 + iV1 + iV2;
                            i15 += iB;
                        }
                        break;
                    case 39:
                        iV2 = m5.I((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            if (this.f129649i) {
                                unsafe.putInt(t10, i19, iV2);
                            }
                            iL1 = t2.l0(i18);
                            iV1 = t2.v0(iV2);
                            iB = iL1 + iV1 + iV2;
                            i15 += iB;
                        }
                        break;
                    case 40:
                        iV2 = m5.V((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            if (this.f129649i) {
                                unsafe.putInt(t10, i19, iV2);
                            }
                            iL1 = t2.l0(i18);
                            iV1 = t2.v0(iV2);
                            iB = iL1 + iV1 + iV2;
                            i15 += iB;
                        }
                        break;
                    case 41:
                        iV2 = m5.S((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            if (this.f129649i) {
                                unsafe.putInt(t10, i19, iV2);
                            }
                            iL1 = t2.l0(i18);
                            iV1 = t2.v0(iV2);
                            iB = iL1 + iV1 + iV2;
                            i15 += iB;
                        }
                        break;
                    case 42:
                        iV2 = m5.Y((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            if (this.f129649i) {
                                unsafe.putInt(t10, i19, iV2);
                            }
                            iL1 = t2.l0(i18);
                            iV1 = t2.v0(iV2);
                            iB = iL1 + iV1 + iV2;
                            i15 += iB;
                        }
                        break;
                    case 43:
                        iV2 = m5.M((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            if (this.f129649i) {
                                unsafe.putInt(t10, i19, iV2);
                            }
                            iL1 = t2.l0(i18);
                            iV1 = t2.v0(iV2);
                            iB = iL1 + iV1 + iV2;
                            i15 += iB;
                        }
                        break;
                    case 44:
                        iV2 = m5.E((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            if (this.f129649i) {
                                unsafe.putInt(t10, i19, iV2);
                            }
                            iL1 = t2.l0(i18);
                            iV1 = t2.v0(iV2);
                            iB = iL1 + iV1 + iV2;
                            i15 += iB;
                        }
                        break;
                    case 45:
                        iV2 = m5.S((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            if (this.f129649i) {
                                unsafe.putInt(t10, i19, iV2);
                            }
                            iL1 = t2.l0(i18);
                            iV1 = t2.v0(iV2);
                            iB = iL1 + iV1 + iV2;
                            i15 += iB;
                        }
                        break;
                    case 46:
                        iV2 = m5.V((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            if (this.f129649i) {
                                unsafe.putInt(t10, i19, iV2);
                            }
                            iL1 = t2.l0(i18);
                            iV1 = t2.v0(iV2);
                            iB = iL1 + iV1 + iV2;
                            i15 += iB;
                        }
                        break;
                    case 47:
                        iV2 = m5.P((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            if (this.f129649i) {
                                unsafe.putInt(t10, i19, iV2);
                            }
                            iL1 = t2.l0(i18);
                            iV1 = t2.v0(iV2);
                            iB = iL1 + iV1 + iV2;
                            i15 += iB;
                        }
                        break;
                    case 48:
                        iV2 = m5.A((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            if (this.f129649i) {
                                unsafe.putInt(t10, i19, iV2);
                            }
                            iL1 = t2.l0(i18);
                            iV1 = t2.v0(iV2);
                            iB = iL1 + iV1 + iV2;
                            i15 += iB;
                        }
                        break;
                    case 49:
                        iB = m5.s(i18, o(t10, j10), k(i14));
                        i15 += iB;
                        break;
                    case 50:
                        iB = this.f129657q.a(i18, f6.I(t10, j10), A(i14));
                        i15 += iB;
                        break;
                    case 51:
                        if (v(t10, i18, i14)) {
                            iB = t2.B(i18, 0.0d);
                            i15 += iB;
                        }
                        break;
                    case 52:
                        if (v(t10, i18, i14)) {
                            iB = t2.C(i18, 0.0f);
                            i15 += iB;
                        }
                        break;
                    case 53:
                        if (v(t10, i18, i14)) {
                            iB = t2.e0(i18, L(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case 54:
                        if (v(t10, i18, i14)) {
                            iB = t2.m0(i18, L(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case 55:
                        if (v(t10, i18, i14)) {
                            iB = t2.r0(i18, J(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                        if (v(t10, i18, i14)) {
                            iB = t2.x0(i18, 0L);
                            i15 += iB;
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                        if (v(t10, i18, i14)) {
                            iB = t2.F0(i18, 0);
                            i15 += iB;
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                        if (v(t10, i18, i14)) {
                            iB = t2.G(i18, true);
                            i15 += iB;
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                        if (v(t10, i18, i14)) {
                            Object objI2 = f6.I(t10, j10);
                            iB = objI2 instanceof k2 ? t2.U(i18, (k2) objI2) : t2.F(i18, (String) objI2);
                            i15 += iB;
                        }
                        break;
                    case 60:
                        if (v(t10, i18, i14)) {
                            iB = m5.a(i18, f6.I(t10, j10), k(i14));
                            i15 += iB;
                        }
                        break;
                    case 61:
                        if (v(t10, i18, i14)) {
                            iB = t2.U(i18, (k2) f6.I(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                        if (v(t10, i18, i14)) {
                            iB = t2.w0(i18, J(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case 63:
                        if (v(t10, i18, i14)) {
                            iB = t2.K0(i18, J(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case 64:
                        if (v(t10, i18, i14)) {
                            iB = t2.H0(i18, 0);
                            i15 += iB;
                        }
                        break;
                    case 65:
                        if (v(t10, i18, i14)) {
                            iB = t2.B0(i18, 0L);
                            i15 += iB;
                        }
                        break;
                    case 66:
                        if (v(t10, i18, i14)) {
                            iB = t2.A0(i18, J(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case 67:
                        if (v(t10, i18, i14)) {
                            iB = t2.s0(i18, L(t10, j10));
                            i15 += iB;
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.V /* 68 */:
                        if (v(t10, i18, i14)) {
                            iB = t2.W(i18, (t4) f6.I(t10, j10), k(i14));
                            i15 += iB;
                        }
                        break;
                }
                i14 += 3;
                i12 = i17;
            }
            return i15 + i(this.f129655o, t10);
        }
        Unsafe unsafe2 = f129640s;
        int i20 = -1;
        int i21 = 0;
        int iB2 = 0;
        int i22 = 0;
        while (i21 < this.f129641a.length) {
            int I2 = I(i21);
            int[] iArr = this.f129641a;
            int i23 = iArr[i21];
            int i24 = i13;
            int i25 = (I2 & 267386880) >>> 20;
            if (i25 <= 17) {
                i10 = iArr[i21 + 2];
                int i26 = i10 & i24;
                i11 = 1 << (i10 >>> 20);
                if (i26 != i20) {
                    i22 = unsafe2.getInt(t10, i26);
                    i20 = i26;
                }
            } else {
                i10 = (!this.f129649i || i25 < c3.f127748r3.l() || i25 > c3.E3.l()) ? 0 : this.f129641a[i21 + 2] & i24;
                i11 = 0;
            }
            long j11 = I2 & i24;
            switch (i25) {
                case 0:
                    z10 = false;
                    z11 = false;
                    if ((i22 & i11) != 0) {
                        iB2 += t2.B(i23, 0.0d);
                    }
                    break;
                case 1:
                    z10 = false;
                    if ((i22 & i11) != 0) {
                        z11 = false;
                        iB2 += t2.C(i23, 0.0f);
                    } else {
                        z11 = false;
                    }
                    break;
                case 2:
                    z10 = false;
                    if ((i22 & i11) != 0) {
                        iE0 = t2.e0(i23, unsafe2.getLong(t10, j11));
                        iB2 += iE0;
                    }
                    z11 = false;
                    break;
                case 3:
                    z10 = false;
                    if ((i22 & i11) != 0) {
                        iE0 = t2.m0(i23, unsafe2.getLong(t10, j11));
                        iB2 += iE0;
                    }
                    z11 = false;
                    break;
                case 4:
                    z10 = false;
                    if ((i22 & i11) != 0) {
                        iE0 = t2.r0(i23, unsafe2.getInt(t10, j11));
                        iB2 += iE0;
                    }
                    z11 = false;
                    break;
                case 5:
                    z10 = false;
                    if ((i22 & i11) != 0) {
                        iE0 = t2.x0(i23, 0L);
                        iB2 += iE0;
                    }
                    z11 = false;
                    break;
                case 6:
                    if ((i22 & i11) != 0) {
                        z10 = false;
                        iE0 = t2.F0(i23, 0);
                        iB2 += iE0;
                    } else {
                        z10 = false;
                    }
                    z11 = false;
                    break;
                case 7:
                    if ((i22 & i11) != 0) {
                        iG = t2.G(i23, true);
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 8:
                    if ((i22 & i11) != 0) {
                        Object object = unsafe2.getObject(t10, j11);
                        iG = object instanceof k2 ? t2.U(i23, (k2) object) : t2.F(i23, (String) object);
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 9:
                    if ((i22 & i11) != 0) {
                        iG = m5.a(i23, unsafe2.getObject(t10, j11), k(i21));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 10:
                    if ((i22 & i11) != 0) {
                        iG = t2.U(i23, (k2) unsafe2.getObject(t10, j11));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 11:
                    if ((i22 & i11) != 0) {
                        iG = t2.w0(i23, unsafe2.getInt(t10, j11));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 12:
                    if ((i22 & i11) != 0) {
                        iG = t2.K0(i23, unsafe2.getInt(t10, j11));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 13:
                    if ((i22 & i11) != 0) {
                        iH0 = t2.H0(i23, 0);
                        iB2 += iH0;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 14:
                    if ((i22 & i11) != 0) {
                        iG = t2.B0(i23, 0L);
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 15:
                    if ((i22 & i11) != 0) {
                        iG = t2.A0(i23, unsafe2.getInt(t10, j11));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 16:
                    if ((i22 & i11) != 0) {
                        iG = t2.s0(i23, unsafe2.getLong(t10, j11));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 17:
                    if ((i22 & i11) != 0) {
                        iG = t2.W(i23, (t4) unsafe2.getObject(t10, j11), k(i21));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 18:
                    iG = m5.U(i23, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iG;
                    z10 = false;
                    z11 = false;
                    break;
                case 19:
                    z12 = false;
                    iR = m5.R(i23, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iR;
                    z10 = z12;
                    z11 = false;
                    break;
                case 20:
                    z12 = false;
                    iR = m5.d(i23, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iR;
                    z10 = z12;
                    z11 = false;
                    break;
                case 21:
                    z12 = false;
                    iR = m5.t(i23, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iR;
                    z10 = z12;
                    z11 = false;
                    break;
                case 22:
                    z12 = false;
                    iR = m5.H(i23, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iR;
                    z10 = z12;
                    z11 = false;
                    break;
                case 23:
                    z12 = false;
                    iR = m5.U(i23, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iR;
                    z10 = z12;
                    z11 = false;
                    break;
                case 24:
                    z12 = false;
                    iR = m5.R(i23, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iR;
                    z10 = z12;
                    z11 = false;
                    break;
                case 25:
                    z12 = false;
                    iR = m5.X(i23, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iR;
                    z10 = z12;
                    z11 = false;
                    break;
                case 26:
                    iG = m5.b(i23, (List) unsafe2.getObject(t10, j11));
                    iB2 += iG;
                    z10 = false;
                    z11 = false;
                    break;
                case 27:
                    iG = m5.c(i23, (List) unsafe2.getObject(t10, j11), k(i21));
                    iB2 += iG;
                    z10 = false;
                    z11 = false;
                    break;
                case 28:
                    iG = m5.r(i23, (List) unsafe2.getObject(t10, j11));
                    iB2 += iG;
                    z10 = false;
                    z11 = false;
                    break;
                case 29:
                    iG = m5.L(i23, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iG;
                    z10 = false;
                    z11 = false;
                    break;
                case 30:
                    z12 = false;
                    iR = m5.D(i23, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iR;
                    z10 = z12;
                    z11 = false;
                    break;
                case 31:
                    z12 = false;
                    iR = m5.R(i23, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iR;
                    z10 = z12;
                    z11 = false;
                    break;
                case 32:
                    z12 = false;
                    iR = m5.U(i23, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iR;
                    z10 = z12;
                    z11 = false;
                    break;
                case 33:
                    z12 = false;
                    iR = m5.O(i23, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iR;
                    z10 = z12;
                    z11 = false;
                    break;
                case 34:
                    z12 = false;
                    iR = m5.z(i23, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iR;
                    z10 = z12;
                    z11 = false;
                    break;
                case 35:
                    iV = m5.V((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        if (this.f129649i) {
                            unsafe2.putInt(t10, i10, iV);
                        }
                        iL0 = t2.l0(i23);
                        iV0 = t2.v0(iV);
                        iG = iL0 + iV0 + iV;
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 36:
                    iV = m5.S((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        if (this.f129649i) {
                            unsafe2.putInt(t10, i10, iV);
                        }
                        iL0 = t2.l0(i23);
                        iV0 = t2.v0(iV);
                        iG = iL0 + iV0 + iV;
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 37:
                    iV = m5.e((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        if (this.f129649i) {
                            unsafe2.putInt(t10, i10, iV);
                        }
                        iL0 = t2.l0(i23);
                        iV0 = t2.v0(iV);
                        iG = iL0 + iV0 + iV;
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 38:
                    iV = m5.u((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        if (this.f129649i) {
                            unsafe2.putInt(t10, i10, iV);
                        }
                        iL0 = t2.l0(i23);
                        iV0 = t2.v0(iV);
                        iG = iL0 + iV0 + iV;
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 39:
                    iV = m5.I((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        if (this.f129649i) {
                            unsafe2.putInt(t10, i10, iV);
                        }
                        iL0 = t2.l0(i23);
                        iV0 = t2.v0(iV);
                        iG = iL0 + iV0 + iV;
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 40:
                    iV = m5.V((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        if (this.f129649i) {
                            unsafe2.putInt(t10, i10, iV);
                        }
                        iL0 = t2.l0(i23);
                        iV0 = t2.v0(iV);
                        iG = iL0 + iV0 + iV;
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 41:
                    iV = m5.S((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        if (this.f129649i) {
                            unsafe2.putInt(t10, i10, iV);
                        }
                        iL0 = t2.l0(i23);
                        iV0 = t2.v0(iV);
                        iG = iL0 + iV0 + iV;
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 42:
                    iV = m5.Y((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        if (this.f129649i) {
                            unsafe2.putInt(t10, i10, iV);
                        }
                        iL0 = t2.l0(i23);
                        iV0 = t2.v0(iV);
                        iG = iL0 + iV0 + iV;
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 43:
                    iV = m5.M((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        if (this.f129649i) {
                            unsafe2.putInt(t10, i10, iV);
                        }
                        iL0 = t2.l0(i23);
                        iV0 = t2.v0(iV);
                        iG = iL0 + iV0 + iV;
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 44:
                    iV = m5.E((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        if (this.f129649i) {
                            unsafe2.putInt(t10, i10, iV);
                        }
                        iL0 = t2.l0(i23);
                        iV0 = t2.v0(iV);
                        iG = iL0 + iV0 + iV;
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 45:
                    iV = m5.S((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        if (this.f129649i) {
                            unsafe2.putInt(t10, i10, iV);
                        }
                        iL0 = t2.l0(i23);
                        iV0 = t2.v0(iV);
                        iG = iL0 + iV0 + iV;
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 46:
                    iV = m5.V((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        if (this.f129649i) {
                            unsafe2.putInt(t10, i10, iV);
                        }
                        iL0 = t2.l0(i23);
                        iV0 = t2.v0(iV);
                        iG = iL0 + iV0 + iV;
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 47:
                    iV = m5.P((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        if (this.f129649i) {
                            unsafe2.putInt(t10, i10, iV);
                        }
                        iL0 = t2.l0(i23);
                        iV0 = t2.v0(iV);
                        iG = iL0 + iV0 + iV;
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 48:
                    iV = m5.A((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        if (this.f129649i) {
                            unsafe2.putInt(t10, i10, iV);
                        }
                        iL0 = t2.l0(i23);
                        iV0 = t2.v0(iV);
                        iG = iL0 + iV0 + iV;
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 49:
                    iG = m5.s(i23, (List) unsafe2.getObject(t10, j11), k(i21));
                    iB2 += iG;
                    z10 = false;
                    z11 = false;
                    break;
                case 50:
                    iG = this.f129657q.a(i23, unsafe2.getObject(t10, j11), A(i21));
                    iB2 += iG;
                    z10 = false;
                    z11 = false;
                    break;
                case 51:
                    if (v(t10, i23, i21)) {
                        iG = t2.B(i23, 0.0d);
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 52:
                    if (v(t10, i23, i21)) {
                        iH0 = t2.C(i23, 0.0f);
                        iB2 += iH0;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 53:
                    if (v(t10, i23, i21)) {
                        iG = t2.e0(i23, L(t10, j11));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 54:
                    if (v(t10, i23, i21)) {
                        iG = t2.m0(i23, L(t10, j11));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 55:
                    if (v(t10, i23, i21)) {
                        iG = t2.r0(i23, J(t10, j11));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                    if (v(t10, i23, i21)) {
                        iG = t2.x0(i23, 0L);
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    if (v(t10, i23, i21)) {
                        iH0 = t2.F0(i23, 0);
                        iB2 += iH0;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                    if (v(t10, i23, i21)) {
                        iG = t2.G(i23, true);
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (v(t10, i23, i21)) {
                        Object object2 = unsafe2.getObject(t10, j11);
                        iG = object2 instanceof k2 ? t2.U(i23, (k2) object2) : t2.F(i23, (String) object2);
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 60:
                    if (v(t10, i23, i21)) {
                        iG = m5.a(i23, unsafe2.getObject(t10, j11), k(i21));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 61:
                    if (v(t10, i23, i21)) {
                        iG = t2.U(i23, (k2) unsafe2.getObject(t10, j11));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                    if (v(t10, i23, i21)) {
                        iG = t2.w0(i23, J(t10, j11));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 63:
                    if (v(t10, i23, i21)) {
                        iG = t2.K0(i23, J(t10, j11));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 64:
                    if (v(t10, i23, i21)) {
                        iH0 = t2.H0(i23, 0);
                        iB2 += iH0;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 65:
                    if (v(t10, i23, i21)) {
                        iG = t2.B0(i23, 0L);
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 66:
                    if (v(t10, i23, i21)) {
                        iG = t2.A0(i23, J(t10, j11));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case 67:
                    if (v(t10, i23, i21)) {
                        iG = t2.s0(i23, L(t10, j11));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    if (v(t10, i23, i21)) {
                        iG = t2.W(i23, (t4) unsafe2.getObject(t10, j11), k(i21));
                        iB2 += iG;
                    }
                    z10 = false;
                    z11 = false;
                    break;
                default:
                    z10 = false;
                    z11 = false;
                    break;
            }
            i21 += 3;
            i13 = i24;
        }
        int i27 = iB2 + i(this.f129655o, t10);
        return this.f129646f ? i27 + this.f129656p.b(t10).u() : i27;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code duplicated, block: B:58:0x0112 A[LOOP:2: B:52:0x00fc->B:58:0x0112, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.vr.sdk.deps.k5] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.google.vr.sdk.deps.k5] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    @Override // com.google.vr.sdk.deps.k5
    public final boolean d(T t10) {
        int i10;
        List list;
        ?? K;
        int i11;
        int i12 = -1;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f129651k; i14++) {
            int i15 = this.f129650j[i14];
            int i16 = this.f129641a[i15];
            int I = I(i15);
            if (this.f129648h) {
                i10 = 0;
            } else {
                int i17 = this.f129641a[i15 + 2];
                int i18 = i17 & 1048575;
                i10 = 1 << (i17 >>> 20);
                if (i18 != i12) {
                    i13 = f129640s.getInt(t10, i18);
                    i12 = i18;
                }
            }
            if ((268435456 & I) != 0 && !w(t10, i15, i13, i10)) {
                return false;
            }
            int i19 = (267386880 & I) >>> 20;
            if (i19 == 9 || i19 == 17) {
                if (w(t10, i15, i13, i10) && !x(t10, I, k(i15))) {
                    return false;
                }
            } else if (i19 == 27) {
                list = (List) f6.I(t10, I & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    K = k(i15);
                    for (i11 = 0; i11 < list.size(); i11++) {
                        if (!K.d(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (i19 == 60 || i19 == 68) {
                if (v(t10, i16, i15) && !x(t10, I, k(i15))) {
                    return false;
                }
            } else if (i19 == 49) {
                list = (List) f6.I(t10, I & 1048575);
                if (list.isEmpty()) {
                    K = k(i15);
                    while (i11 < list.size()) {
                        if (!K.d(list.get(i11))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i19 == 50) {
                Map<?, ?> mapG = this.f129657q.g(f6.I(t10, I & 1048575));
                if (mapG.isEmpty()) {
                    continue;
                } else if (this.f129657q.j(A(i15)).f129492c.k() == p6.MESSAGE) {
                    ?? B = 0;
                    for (Object obj : mapG.values()) {
                        if (B == 0) {
                            B = B;
                            B = f5.a().b(obj.getClass());
                        }
                        B = B;
                        if (!B.d(obj)) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return !this.f129646f || this.f129656p.b(t10).t();
    }

    @Override // com.google.vr.sdk.deps.k5
    public final int e(T t10) {
        int i10;
        int iB;
        int length = this.f129641a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int I = I(i12);
            int i13 = this.f129641a[i12];
            long j10 = 1048575 & I;
            int iHashCode = 37;
            switch ((I & 267386880) >>> 20) {
                case 0:
                    i10 = i11 * 53;
                    iB = k3.b(Double.doubleToLongBits(f6.F(t10, j10)));
                    i11 = i10 + iB;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iB = Float.floatToIntBits(f6.A(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iB = k3.b(f6.r(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iB = k3.b(f6.r(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iB = f6.b(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iB = k3.b(f6.r(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iB = f6.b(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iB = k3.c(f6.z(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iB = ((String) f6.I(t10, j10)).hashCode();
                    i11 = i10 + iB;
                    break;
                case 9:
                    Object objI = f6.I(t10, j10);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iB = f6.I(t10, j10).hashCode();
                    i11 = i10 + iB;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iB = f6.b(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iB = f6.b(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iB = f6.b(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iB = k3.b(f6.r(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iB = f6.b(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iB = k3.b(f6.r(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 17:
                    Object objI2 = f6.I(t10, j10);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
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
                    iB = f6.I(t10, j10).hashCode();
                    i11 = i10 + iB;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iB = f6.I(t10, j10).hashCode();
                    i11 = i10 + iB;
                    break;
                case 51:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = k3.b(Double.doubleToLongBits(z(t10, j10)));
                        i11 = i10 + iB;
                    }
                    break;
                case 52:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = Float.floatToIntBits(F(t10, j10));
                        i11 = i10 + iB;
                    }
                    break;
                case 53:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = k3.b(L(t10, j10));
                        i11 = i10 + iB;
                    }
                    break;
                case 54:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = k3.b(L(t10, j10));
                        i11 = i10 + iB;
                    }
                    break;
                case 55:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = J(t10, j10);
                        i11 = i10 + iB;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = k3.b(L(t10, j10));
                        i11 = i10 + iB;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = J(t10, j10);
                        i11 = i10 + iB;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = k3.c(N(t10, j10));
                        i11 = i10 + iB;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = ((String) f6.I(t10, j10)).hashCode();
                        i11 = i10 + iB;
                    }
                    break;
                case 60:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = f6.I(t10, j10).hashCode();
                        i11 = i10 + iB;
                    }
                    break;
                case 61:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = f6.I(t10, j10).hashCode();
                        i11 = i10 + iB;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = J(t10, j10);
                        i11 = i10 + iB;
                    }
                    break;
                case 63:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = J(t10, j10);
                        i11 = i10 + iB;
                    }
                    break;
                case 64:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = J(t10, j10);
                        i11 = i10 + iB;
                    }
                    break;
                case 65:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = k3.b(L(t10, j10));
                        i11 = i10 + iB;
                    }
                    break;
                case 66:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = J(t10, j10);
                        i11 = i10 + iB;
                    }
                    break;
                case 67:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = k3.b(L(t10, j10));
                        i11 = i10 + iB;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = f6.I(t10, j10).hashCode();
                        i11 = i10 + iB;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.f129655o.s(t10).hashCode();
        return this.f129646f ? (iHashCode2 * 53) + this.f129656p.b(t10).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0547  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    @Override // com.google.vr.sdk.deps.k5
    public final void f(T t10, q6 q6Var) throws IOException {
        Iterator itR;
        Map.Entry<?, ?> entry;
        Iterator itS;
        Map.Entry<?, ?> entry2;
        if (q6Var.a() == e5.f129357d) {
            q(this.f129655o, t10, q6Var);
            if (this.f129646f) {
                a3<i3.c> a3VarB = this.f129656p.b(t10);
                if (a3VarB.m()) {
                    itS = null;
                    entry2 = null;
                } else {
                    itS = a3VarB.s();
                    entry2 = (Map.Entry) itS.next();
                }
            } else {
                itS = null;
                entry2 = null;
            }
            for (int length = this.f129641a.length - 3; length >= 0; length -= 3) {
                int I = I(length);
                int i10 = this.f129641a[length];
                while (entry2 != null && this.f129656p.a(entry2) > i10) {
                    this.f129656p.g(q6Var, entry2);
                    entry2 = itS.hasNext() ? (Map.Entry) itS.next() : null;
                }
                switch ((I & 267386880) >>> 20) {
                    case 0:
                        if (u(t10, length)) {
                            q6Var.d(i10, f6.F(t10, I & 1048575));
                        }
                        break;
                    case 1:
                        if (u(t10, length)) {
                            q6Var.e(i10, f6.A(t10, I & 1048575));
                        }
                        break;
                    case 2:
                        if (u(t10, length)) {
                            q6Var.g(i10, f6.r(t10, I & 1048575));
                        }
                        break;
                    case 3:
                        if (u(t10, length)) {
                            q6Var.z(i10, f6.r(t10, I & 1048575));
                        }
                        break;
                    case 4:
                        if (u(t10, length)) {
                            q6Var.y(i10, f6.b(t10, I & 1048575));
                        }
                        break;
                    case 5:
                        if (u(t10, length)) {
                            q6Var.C(i10, f6.r(t10, I & 1048575));
                        }
                        break;
                    case 6:
                        if (u(t10, length)) {
                            q6Var.B(i10, f6.b(t10, I & 1048575));
                        }
                        break;
                    case 7:
                        if (u(t10, length)) {
                            q6Var.p(i10, f6.z(t10, I & 1048575));
                        }
                        break;
                    case 8:
                        if (u(t10, length)) {
                            p(i10, f6.I(t10, I & 1048575), q6Var);
                        }
                        break;
                    case 9:
                        if (u(t10, length)) {
                            q6Var.k(i10, f6.I(t10, I & 1048575), k(length));
                        }
                        break;
                    case 10:
                        if (u(t10, length)) {
                            q6Var.h(i10, (k2) f6.I(t10, I & 1048575));
                        }
                        break;
                    case 11:
                        if (u(t10, length)) {
                            q6Var.E(i10, f6.b(t10, I & 1048575));
                        }
                        break;
                    case 12:
                        if (u(t10, length)) {
                            q6Var.r(i10, f6.b(t10, I & 1048575));
                        }
                        break;
                    case 13:
                        if (u(t10, length)) {
                            q6Var.f(i10, f6.b(t10, I & 1048575));
                        }
                        break;
                    case 14:
                        if (u(t10, length)) {
                            q6Var.s(i10, f6.r(t10, I & 1048575));
                        }
                        break;
                    case 15:
                        if (u(t10, length)) {
                            q6Var.H(i10, f6.b(t10, I & 1048575));
                        }
                        break;
                    case 16:
                        if (u(t10, length)) {
                            q6Var.F(i10, f6.r(t10, I & 1048575));
                        }
                        break;
                    case 17:
                        if (u(t10, length)) {
                            q6Var.u(i10, f6.I(t10, I & 1048575), k(length));
                        }
                        break;
                    case 18:
                        m5.l(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, false);
                        break;
                    case 19:
                        m5.y(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, false);
                        break;
                    case 20:
                        m5.C(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, false);
                        break;
                    case 21:
                        m5.G(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, false);
                        break;
                    case 22:
                        m5.T(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, false);
                        break;
                    case 23:
                        m5.N(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, false);
                        break;
                    case 24:
                        m5.a0(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, false);
                        break;
                    case 25:
                        m5.d0(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, false);
                        break;
                    case 26:
                        m5.j(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var);
                        break;
                    case 27:
                        m5.k(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, k(length));
                        break;
                    case 28:
                        m5.w(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var);
                        break;
                    case 29:
                        m5.W(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, false);
                        break;
                    case 30:
                        m5.c0(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, false);
                        break;
                    case 31:
                        m5.b0(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, false);
                        break;
                    case 32:
                        m5.Q(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, false);
                        break;
                    case 33:
                        m5.Z(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, false);
                        break;
                    case 34:
                        m5.K(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, false);
                        break;
                    case 35:
                        m5.l(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, true);
                        break;
                    case 36:
                        m5.y(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, true);
                        break;
                    case 37:
                        m5.C(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, true);
                        break;
                    case 38:
                        m5.G(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, true);
                        break;
                    case 39:
                        m5.T(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, true);
                        break;
                    case 40:
                        m5.N(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, true);
                        break;
                    case 41:
                        m5.a0(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, true);
                        break;
                    case 42:
                        m5.d0(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, true);
                        break;
                    case 43:
                        m5.W(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, true);
                        break;
                    case 44:
                        m5.c0(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, true);
                        break;
                    case 45:
                        m5.b0(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, true);
                        break;
                    case 46:
                        m5.Q(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, true);
                        break;
                    case 47:
                        m5.Z(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, true);
                        break;
                    case 48:
                        m5.K(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, true);
                        break;
                    case 49:
                        m5.x(this.f129641a[length], (List) f6.I(t10, I & 1048575), q6Var, k(length));
                        break;
                    case 50:
                        r(q6Var, i10, f6.I(t10, I & 1048575), length);
                        break;
                    case 51:
                        if (v(t10, i10, length)) {
                            q6Var.d(i10, z(t10, I & 1048575));
                        }
                        break;
                    case 52:
                        if (v(t10, i10, length)) {
                            q6Var.e(i10, F(t10, I & 1048575));
                        }
                        break;
                    case 53:
                        if (v(t10, i10, length)) {
                            q6Var.g(i10, L(t10, I & 1048575));
                        }
                        break;
                    case 54:
                        if (v(t10, i10, length)) {
                            q6Var.z(i10, L(t10, I & 1048575));
                        }
                        break;
                    case 55:
                        if (v(t10, i10, length)) {
                            q6Var.y(i10, J(t10, I & 1048575));
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                        if (v(t10, i10, length)) {
                            q6Var.C(i10, L(t10, I & 1048575));
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                        if (v(t10, i10, length)) {
                            q6Var.B(i10, J(t10, I & 1048575));
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                        if (v(t10, i10, length)) {
                            q6Var.p(i10, N(t10, I & 1048575));
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                        if (v(t10, i10, length)) {
                            p(i10, f6.I(t10, I & 1048575), q6Var);
                        }
                        break;
                    case 60:
                        if (v(t10, i10, length)) {
                            q6Var.k(i10, f6.I(t10, I & 1048575), k(length));
                        }
                        break;
                    case 61:
                        if (v(t10, i10, length)) {
                            q6Var.h(i10, (k2) f6.I(t10, I & 1048575));
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                        if (v(t10, i10, length)) {
                            q6Var.E(i10, J(t10, I & 1048575));
                        }
                        break;
                    case 63:
                        if (v(t10, i10, length)) {
                            q6Var.r(i10, J(t10, I & 1048575));
                        }
                        break;
                    case 64:
                        if (v(t10, i10, length)) {
                            q6Var.f(i10, J(t10, I & 1048575));
                        }
                        break;
                    case 65:
                        if (v(t10, i10, length)) {
                            q6Var.s(i10, L(t10, I & 1048575));
                        }
                        break;
                    case 66:
                        if (v(t10, i10, length)) {
                            q6Var.H(i10, J(t10, I & 1048575));
                        }
                        break;
                    case 67:
                        if (v(t10, i10, length)) {
                            q6Var.F(i10, L(t10, I & 1048575));
                        }
                        break;
                    case com.planner5d.library.engine.input.f.b.V /* 68 */:
                        if (v(t10, i10, length)) {
                            q6Var.u(i10, f6.I(t10, I & 1048575), k(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                this.f129656p.g(q6Var, entry2);
                entry2 = itS.hasNext() ? (Map.Entry) itS.next() : null;
            }
            return;
        }
        if (!this.f129648h) {
            D(t10, q6Var);
            return;
        }
        if (this.f129646f) {
            a3<i3.c> a3VarB2 = this.f129656p.b(t10);
            if (a3VarB2.m()) {
                itR = null;
                entry = null;
            } else {
                itR = a3VarB2.r();
                entry = (Map.Entry) itR.next();
            }
        } else {
            itR = null;
            entry = null;
        }
        int length2 = this.f129641a.length;
        for (int i11 = 0; i11 < length2; i11 += 3) {
            int I2 = I(i11);
            int i12 = this.f129641a[i11];
            while (entry != null && this.f129656p.a(entry) <= i12) {
                this.f129656p.g(q6Var, entry);
                entry = itR.hasNext() ? (Map.Entry) itR.next() : null;
            }
            switch ((I2 & 267386880) >>> 20) {
                case 0:
                    if (u(t10, i11)) {
                        q6Var.d(i12, f6.F(t10, I2 & 1048575));
                    }
                    break;
                case 1:
                    if (u(t10, i11)) {
                        q6Var.e(i12, f6.A(t10, I2 & 1048575));
                    }
                    break;
                case 2:
                    if (u(t10, i11)) {
                        q6Var.g(i12, f6.r(t10, I2 & 1048575));
                    }
                    break;
                case 3:
                    if (u(t10, i11)) {
                        q6Var.z(i12, f6.r(t10, I2 & 1048575));
                    }
                    break;
                case 4:
                    if (u(t10, i11)) {
                        q6Var.y(i12, f6.b(t10, I2 & 1048575));
                    }
                    break;
                case 5:
                    if (u(t10, i11)) {
                        q6Var.C(i12, f6.r(t10, I2 & 1048575));
                    }
                    break;
                case 6:
                    if (u(t10, i11)) {
                        q6Var.B(i12, f6.b(t10, I2 & 1048575));
                    }
                    break;
                case 7:
                    if (u(t10, i11)) {
                        q6Var.p(i12, f6.z(t10, I2 & 1048575));
                    }
                    break;
                case 8:
                    if (u(t10, i11)) {
                        p(i12, f6.I(t10, I2 & 1048575), q6Var);
                    }
                    break;
                case 9:
                    if (u(t10, i11)) {
                        q6Var.k(i12, f6.I(t10, I2 & 1048575), k(i11));
                    }
                    break;
                case 10:
                    if (u(t10, i11)) {
                        q6Var.h(i12, (k2) f6.I(t10, I2 & 1048575));
                    }
                    break;
                case 11:
                    if (u(t10, i11)) {
                        q6Var.E(i12, f6.b(t10, I2 & 1048575));
                    }
                    break;
                case 12:
                    if (u(t10, i11)) {
                        q6Var.r(i12, f6.b(t10, I2 & 1048575));
                    }
                    break;
                case 13:
                    if (u(t10, i11)) {
                        q6Var.f(i12, f6.b(t10, I2 & 1048575));
                    }
                    break;
                case 14:
                    if (u(t10, i11)) {
                        q6Var.s(i12, f6.r(t10, I2 & 1048575));
                    }
                    break;
                case 15:
                    if (u(t10, i11)) {
                        q6Var.H(i12, f6.b(t10, I2 & 1048575));
                    }
                    break;
                case 16:
                    if (u(t10, i11)) {
                        q6Var.F(i12, f6.r(t10, I2 & 1048575));
                    }
                    break;
                case 17:
                    if (u(t10, i11)) {
                        q6Var.u(i12, f6.I(t10, I2 & 1048575), k(i11));
                    }
                    break;
                case 18:
                    m5.l(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, false);
                    break;
                case 19:
                    m5.y(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, false);
                    break;
                case 20:
                    m5.C(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, false);
                    break;
                case 21:
                    m5.G(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, false);
                    break;
                case 22:
                    m5.T(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, false);
                    break;
                case 23:
                    m5.N(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, false);
                    break;
                case 24:
                    m5.a0(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, false);
                    break;
                case 25:
                    m5.d0(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, false);
                    break;
                case 26:
                    m5.j(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var);
                    break;
                case 27:
                    m5.k(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, k(i11));
                    break;
                case 28:
                    m5.w(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var);
                    break;
                case 29:
                    m5.W(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, false);
                    break;
                case 30:
                    m5.c0(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, false);
                    break;
                case 31:
                    m5.b0(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, false);
                    break;
                case 32:
                    m5.Q(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, false);
                    break;
                case 33:
                    m5.Z(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, false);
                    break;
                case 34:
                    m5.K(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, false);
                    break;
                case 35:
                    m5.l(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, true);
                    break;
                case 36:
                    m5.y(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, true);
                    break;
                case 37:
                    m5.C(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, true);
                    break;
                case 38:
                    m5.G(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, true);
                    break;
                case 39:
                    m5.T(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, true);
                    break;
                case 40:
                    m5.N(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, true);
                    break;
                case 41:
                    m5.a0(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, true);
                    break;
                case 42:
                    m5.d0(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, true);
                    break;
                case 43:
                    m5.W(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, true);
                    break;
                case 44:
                    m5.c0(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, true);
                    break;
                case 45:
                    m5.b0(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, true);
                    break;
                case 46:
                    m5.Q(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, true);
                    break;
                case 47:
                    m5.Z(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, true);
                    break;
                case 48:
                    m5.K(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, true);
                    break;
                case 49:
                    m5.x(this.f129641a[i11], (List) f6.I(t10, I2 & 1048575), q6Var, k(i11));
                    break;
                case 50:
                    r(q6Var, i12, f6.I(t10, I2 & 1048575), i11);
                    break;
                case 51:
                    if (v(t10, i12, i11)) {
                        q6Var.d(i12, z(t10, I2 & 1048575));
                    }
                    break;
                case 52:
                    if (v(t10, i12, i11)) {
                        q6Var.e(i12, F(t10, I2 & 1048575));
                    }
                    break;
                case 53:
                    if (v(t10, i12, i11)) {
                        q6Var.g(i12, L(t10, I2 & 1048575));
                    }
                    break;
                case 54:
                    if (v(t10, i12, i11)) {
                        q6Var.z(i12, L(t10, I2 & 1048575));
                    }
                    break;
                case 55:
                    if (v(t10, i12, i11)) {
                        q6Var.y(i12, J(t10, I2 & 1048575));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                    if (v(t10, i12, i11)) {
                        q6Var.C(i12, L(t10, I2 & 1048575));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    if (v(t10, i12, i11)) {
                        q6Var.B(i12, J(t10, I2 & 1048575));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                    if (v(t10, i12, i11)) {
                        q6Var.p(i12, N(t10, I2 & 1048575));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (v(t10, i12, i11)) {
                        p(i12, f6.I(t10, I2 & 1048575), q6Var);
                    }
                    break;
                case 60:
                    if (v(t10, i12, i11)) {
                        q6Var.k(i12, f6.I(t10, I2 & 1048575), k(i11));
                    }
                    break;
                case 61:
                    if (v(t10, i12, i11)) {
                        q6Var.h(i12, (k2) f6.I(t10, I2 & 1048575));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                    if (v(t10, i12, i11)) {
                        q6Var.E(i12, J(t10, I2 & 1048575));
                    }
                    break;
                case 63:
                    if (v(t10, i12, i11)) {
                        q6Var.r(i12, J(t10, I2 & 1048575));
                    }
                    break;
                case 64:
                    if (v(t10, i12, i11)) {
                        q6Var.f(i12, J(t10, I2 & 1048575));
                    }
                    break;
                case 65:
                    if (v(t10, i12, i11)) {
                        q6Var.s(i12, L(t10, I2 & 1048575));
                    }
                    break;
                case 66:
                    if (v(t10, i12, i11)) {
                        q6Var.H(i12, J(t10, I2 & 1048575));
                    }
                    break;
                case 67:
                    if (v(t10, i12, i11)) {
                        q6Var.F(i12, L(t10, I2 & 1048575));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    if (v(t10, i12, i11)) {
                        q6Var.u(i12, f6.I(t10, I2 & 1048575), k(i11));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f129656p.g(q6Var, entry);
            entry = itR.hasNext() ? (Map.Entry) itR.next() : null;
        }
        q(this.f129655o, t10, q6Var);
    }

    /* JADX WARN: Code duplicated, block: B:177:0x05c4 A[LOOP:6: B:175:0x05c0->B:177:0x05c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:179:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:286:? A[SYNTHETIC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.vr.sdk.deps.k5
    public final void g(T t10, j5 j5Var, x2 x2Var) throws IOException {
        int i10;
        x2 x2Var2;
        x2Var.getClass();
        a6<?, ?> a6Var = this.f129655o;
        y2<?> y2Var = this.f129656p;
        a3<i3.c> a3VarJ = null;
        Object objM = null;
        while (true) {
            try {
                int iY = j5Var.y();
                int i11 = -1;
                if (iY >= this.f129643c && iY <= this.f129644d) {
                    int length = (this.f129641a.length / 3) - 1;
                    int i12 = 0;
                    while (i12 <= length) {
                        int i13 = (length + i12) >>> 1;
                        int i14 = i13 * 3;
                        int i15 = this.f129641a[i14];
                        if (iY == i15) {
                            i11 = i14;
                        } else if (iY < i15) {
                            length = i13 - 1;
                        } else {
                            i12 = i13 + 1;
                        }
                    }
                }
                if (i11 >= 0) {
                    x2Var2 = x2Var;
                    int I = I(i11);
                    switch ((267386880 & I) >>> 20) {
                        case 0:
                            f6.h(t10, I & 1048575, j5Var.d());
                            B(t10, i11);
                            continue;
                        case 1:
                            f6.i(t10, I & 1048575, j5Var.e());
                            B(t10, i11);
                            continue;
                        case 2:
                            f6.k(t10, I & 1048575, j5Var.J());
                            B(t10, i11);
                            continue;
                        case 3:
                            f6.k(t10, I & 1048575, j5Var.f());
                            B(t10, i11);
                            continue;
                        case 4:
                            f6.j(t10, I & 1048575, j5Var.L());
                            B(t10, i11);
                            continue;
                        case 5:
                            f6.k(t10, I & 1048575, j5Var.i());
                            B(t10, i11);
                            continue;
                        case 6:
                            f6.j(t10, I & 1048575, j5Var.a());
                            B(t10, i11);
                            continue;
                        case 7:
                            f6.m(t10, I & 1048575, j5Var.k());
                            B(t10, i11);
                            continue;
                        case 8:
                            s(t10, I, j5Var);
                            B(t10, i11);
                            continue;
                        case 9:
                            if (u(t10, i11)) {
                                long j10 = I & 1048575;
                                f6.l(t10, j10, k3.e(f6.I(t10, j10), j5Var.E(k(i11), x2Var2)));
                                continue;
                            } else {
                                f6.l(t10, I & 1048575, j5Var.E(k(i11), x2Var2));
                                B(t10, i11);
                            }
                            break;
                        case 10:
                            f6.l(t10, I & 1048575, j5Var.n());
                            B(t10, i11);
                            continue;
                        case 11:
                            f6.j(t10, I & 1048575, j5Var.g());
                            B(t10, i11);
                            continue;
                        case 12:
                            int iH = j5Var.h();
                            p3 p3VarG = G(i11);
                            if (p3VarG == null || p3VarG.a(iH)) {
                                f6.j(t10, I & 1048575, iH);
                                B(t10, i11);
                            } else {
                                objM = m5.h(iY, iH, objM, a6Var);
                                continue;
                            }
                            break;
                        case 13:
                            f6.j(t10, I & 1048575, j5Var.j());
                            B(t10, i11);
                            continue;
                        case 14:
                            f6.k(t10, I & 1048575, j5Var.o());
                            B(t10, i11);
                            continue;
                        case 15:
                            f6.j(t10, I & 1048575, j5Var.s());
                            B(t10, i11);
                            continue;
                        case 16:
                            f6.k(t10, I & 1048575, j5Var.q());
                            B(t10, i11);
                            continue;
                        case 17:
                            if (u(t10, i11)) {
                                long j11 = I & 1048575;
                                f6.l(t10, j11, k3.e(f6.I(t10, j11), j5Var.G(k(i11), x2Var2)));
                                continue;
                            } else {
                                f6.l(t10, I & 1048575, j5Var.G(k(i11), x2Var2));
                                B(t10, i11);
                            }
                            break;
                        case 18:
                            j5Var.F(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 19:
                            j5Var.N(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 20:
                            j5Var.I(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 21:
                            j5Var.K(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 22:
                            j5Var.H(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 23:
                            j5Var.x(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 24:
                            j5Var.w(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 25:
                            j5Var.v(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 26:
                            if (M(I)) {
                                j5Var.D(this.f129654n.b(t10, I & 1048575));
                                continue;
                            } else {
                                j5Var.t(this.f129654n.b(t10, I & 1048575));
                            }
                            break;
                        case 27:
                            j5Var.c(this.f129654n.b(t10, I & 1048575), k(i11), x2Var2);
                            continue;
                        case 28:
                            j5Var.C(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 29:
                            j5Var.B(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 30:
                            List<Integer> listB = this.f129654n.b(t10, I & 1048575);
                            j5Var.z(listB);
                            objM = m5.i(iY, listB, G(i11), objM, a6Var);
                            continue;
                        case 31:
                            j5Var.A(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 32:
                            j5Var.s(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 33:
                            j5Var.r(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 34:
                            j5Var.p(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 35:
                            j5Var.F(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 36:
                            j5Var.N(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 37:
                            j5Var.I(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 38:
                            j5Var.K(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 39:
                            j5Var.H(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 40:
                            j5Var.x(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 41:
                            j5Var.w(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 42:
                            j5Var.v(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 43:
                            j5Var.B(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 44:
                            List<Integer> listB2 = this.f129654n.b(t10, I & 1048575);
                            j5Var.z(listB2);
                            objM = m5.i(iY, listB2, G(i11), objM, a6Var);
                            continue;
                        case 45:
                            j5Var.A(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 46:
                            j5Var.s(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 47:
                            j5Var.r(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 48:
                            j5Var.p(this.f129654n.b(t10, I & 1048575));
                            continue;
                        case 49:
                            j5Var.b(this.f129654n.b(t10, I & 1048575), k(i11), x2Var2);
                            continue;
                        case 50:
                            Object objA = A(i11);
                            long jI = I(i11) & 1048575;
                            Object objI = f6.I(t10, jI);
                            if (objI == null) {
                                objI = this.f129657q.b();
                                f6.l(t10, jI, objI);
                            } else if (this.f129657q.h(objI)) {
                                Object objB = this.f129657q.b();
                                this.f129657q.c(objB, objI);
                                f6.l(t10, jI, objB);
                                objI = objB;
                            }
                            j5Var.u(this.f129657q.d(objI), this.f129657q.j(objA), x2Var2);
                            continue;
                        case 51:
                            f6.l(t10, I & 1048575, Double.valueOf(j5Var.d()));
                            C(t10, iY, i11);
                            continue;
                        case 52:
                            f6.l(t10, I & 1048575, Float.valueOf(j5Var.e()));
                            C(t10, iY, i11);
                            continue;
                        case 53:
                            f6.l(t10, I & 1048575, Long.valueOf(j5Var.J()));
                            C(t10, iY, i11);
                            continue;
                        case 54:
                            f6.l(t10, I & 1048575, Long.valueOf(j5Var.f()));
                            C(t10, iY, i11);
                            continue;
                        case 55:
                            f6.l(t10, I & 1048575, Integer.valueOf(j5Var.L()));
                            C(t10, iY, i11);
                            continue;
                        case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                            f6.l(t10, I & 1048575, Long.valueOf(j5Var.i()));
                            C(t10, iY, i11);
                            continue;
                        case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                            f6.l(t10, I & 1048575, Integer.valueOf(j5Var.a()));
                            C(t10, iY, i11);
                            continue;
                        case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                            f6.l(t10, I & 1048575, Boolean.valueOf(j5Var.k()));
                            C(t10, iY, i11);
                            continue;
                        case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                            s(t10, I, j5Var);
                            C(t10, iY, i11);
                            continue;
                        case 60:
                            if (v(t10, iY, i11)) {
                                long j12 = I & 1048575;
                                f6.l(t10, j12, k3.e(f6.I(t10, j12), j5Var.E(k(i11), x2Var2)));
                            } else {
                                f6.l(t10, I & 1048575, j5Var.E(k(i11), x2Var2));
                                B(t10, i11);
                            }
                            C(t10, iY, i11);
                            continue;
                        case 61:
                            f6.l(t10, I & 1048575, j5Var.n());
                            C(t10, iY, i11);
                            continue;
                        case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                            f6.l(t10, I & 1048575, Integer.valueOf(j5Var.g()));
                            C(t10, iY, i11);
                            continue;
                        case 63:
                            int iH2 = j5Var.h();
                            p3 p3VarG2 = G(i11);
                            if (p3VarG2 == null || p3VarG2.a(iH2)) {
                                f6.l(t10, I & 1048575, Integer.valueOf(iH2));
                                C(t10, iY, i11);
                            } else {
                                objM = m5.h(iY, iH2, objM, a6Var);
                                continue;
                            }
                            break;
                        case 64:
                            f6.l(t10, I & 1048575, Integer.valueOf(j5Var.j()));
                            C(t10, iY, i11);
                            continue;
                        case 65:
                            f6.l(t10, I & 1048575, Long.valueOf(j5Var.o()));
                            C(t10, iY, i11);
                            continue;
                        case 66:
                            f6.l(t10, I & 1048575, Integer.valueOf(j5Var.s()));
                            C(t10, iY, i11);
                            continue;
                        case 67:
                            f6.l(t10, I & 1048575, Long.valueOf(j5Var.q()));
                            C(t10, iY, i11);
                            continue;
                        case com.planner5d.library.engine.input.f.b.V /* 68 */:
                            f6.l(t10, I & 1048575, j5Var.G(k(i11), x2Var2));
                            C(t10, iY, i11);
                            continue;
                        default:
                            if (objM == null) {
                                try {
                                    objM = a6Var.r();
                                } catch (w3 unused) {
                                    a6Var.o();
                                    if (objM == null) {
                                        objM = a6Var.A(t10);
                                    }
                                    if (!a6Var.p((Object) objM, j5Var)) {
                                        for (int i16 = this.f129651k; i16 < this.f129652l; i16++) {
                                            objM = m(t10, this.f129650j[i16], objM, a6Var);
                                        }
                                        if (objM != null) {
                                            a6Var.x(t10, (Object) objM);
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            if (!a6Var.p((Object) objM, j5Var)) {
                                for (int i17 = this.f129651k; i17 < this.f129652l; i17++) {
                                    objM = m(t10, this.f129650j[i17], objM, a6Var);
                                }
                                if (objM != null) {
                                    a6Var.x(t10, (Object) objM);
                                    return;
                                }
                                return;
                            }
                            break;
                            break;
                    }
                    for (i10 = this.f129651k; i10 < this.f129652l; i10++) {
                        objM = m(t10, this.f129650j[i10], objM, a6Var);
                    }
                    if (objM != null) {
                        throw th;
                    }
                    a6Var.x(t10, (Object) objM);
                    throw th;
                }
                if (iY == Integer.MAX_VALUE) {
                    for (int i18 = this.f129651k; i18 < this.f129652l; i18++) {
                        objM = m(t10, this.f129650j[i18], objM, a6Var);
                    }
                    if (objM != null) {
                        a6Var.x(t10, (Object) objM);
                        return;
                    }
                    return;
                }
                Object objC = !this.f129646f ? null : y2Var.c(x2Var, this.f129645e, iY);
                if (objC != null) {
                    if (a3VarJ == null) {
                        a3VarJ = y2Var.j(t10);
                    }
                    x2Var2 = x2Var;
                    a3<i3.c> a3Var = a3VarJ;
                    j5 j5Var2 = j5Var;
                    objM = y2Var.d(j5Var2, objC, x2Var2, a3Var, objM, a6Var);
                    j5Var = j5Var2;
                    a3VarJ = a3Var;
                } else {
                    x2Var2 = x2Var;
                    a6Var.o();
                    if (objM == null) {
                        objM = a6Var.A(t10);
                    }
                    if (!a6Var.p((Object) objM, j5Var)) {
                        for (int i19 = this.f129651k; i19 < this.f129652l; i19++) {
                            objM = m(t10, this.f129650j[i19], objM, a6Var);
                        }
                        if (objM != null) {
                            a6Var.x(t10, (Object) objM);
                            return;
                        }
                        return;
                    }
                }
                x2Var = x2Var2;
            } catch (Throwable th2) {
                while (i10 < this.f129652l) {
                    objM = m(t10, this.f129650j[i10], objM, a6Var);
                }
                if (objM != null) {
                    throw th2;
                }
                a6Var.x(t10, (Object) objM);
                throw th2;
            }
        }
    }

    @Override // com.google.vr.sdk.deps.k5
    public final void h(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.f129641a.length; i10 += 3) {
            int I = I(i10);
            long j10 = 1048575 & I;
            int i11 = this.f129641a[i10];
            switch ((I & 267386880) >>> 20) {
                case 0:
                    if (u(t11, i10)) {
                        f6.h(t10, j10, f6.F(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 1:
                    if (u(t11, i10)) {
                        f6.i(t10, j10, f6.A(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 2:
                    if (u(t11, i10)) {
                        f6.k(t10, j10, f6.r(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 3:
                    if (u(t11, i10)) {
                        f6.k(t10, j10, f6.r(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 4:
                    if (u(t11, i10)) {
                        f6.j(t10, j10, f6.b(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 5:
                    if (u(t11, i10)) {
                        f6.k(t10, j10, f6.r(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 6:
                    if (u(t11, i10)) {
                        f6.j(t10, j10, f6.b(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 7:
                    if (u(t11, i10)) {
                        f6.m(t10, j10, f6.z(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 8:
                    if (u(t11, i10)) {
                        f6.l(t10, j10, f6.I(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 9:
                    t(t10, t11, i10);
                    break;
                case 10:
                    if (u(t11, i10)) {
                        f6.l(t10, j10, f6.I(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 11:
                    if (u(t11, i10)) {
                        f6.j(t10, j10, f6.b(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 12:
                    if (u(t11, i10)) {
                        f6.j(t10, j10, f6.b(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 13:
                    if (u(t11, i10)) {
                        f6.j(t10, j10, f6.b(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 14:
                    if (u(t11, i10)) {
                        f6.k(t10, j10, f6.r(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 15:
                    if (u(t11, i10)) {
                        f6.j(t10, j10, f6.b(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 16:
                    if (u(t11, i10)) {
                        f6.k(t10, j10, f6.r(t11, j10));
                        B(t10, i10);
                    }
                    break;
                case 17:
                    t(t10, t11, i10);
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
                    this.f129654n.c(t10, t11, j10);
                    break;
                case 50:
                    m5.n(this.f129657q, t10, t11, j10);
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
                    if (v(t11, i11, i10)) {
                        f6.l(t10, j10, f6.I(t11, j10));
                        C(t10, i11, i10);
                    }
                    break;
                case 60:
                    E(t10, t11, i10);
                    break;
                case 61:
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (v(t11, i11, i10)) {
                        f6.l(t10, j10, f6.I(t11, j10));
                        C(t10, i11, i10);
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    E(t10, t11, i10);
                    break;
            }
        }
        if (this.f129648h) {
            return;
        }
        m5.o(this.f129655o, t10, t11);
        if (this.f129646f) {
            m5.m(this.f129656p, t10, t11);
        }
    }

    @Override // com.google.vr.sdk.deps.k5
    public final T y() {
        return (T) this.f129653m.a(this.f129645e);
    }
}
