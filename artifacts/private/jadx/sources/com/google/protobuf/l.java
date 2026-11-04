package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@y
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f126027a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile int f126028b = 100;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126029a;

        static {
            int[] iArr = new int[x4.b.values().length];
            f126029a = iArr;
            try {
                iArr[x4.b.f126482c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126029a[x4.b.f126483d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126029a[x4.b.f126484e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126029a[x4.b.f126485f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126029a[x4.b.f126486g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126029a[x4.b.f126494o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126029a[x4.b.f126487h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f126029a[x4.b.f126497v.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f126029a[x4.b.f126488i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f126029a[x4.b.f126496t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f126029a[x4.b.f126489j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f126029a[x4.b.f126498w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f126029a[x4.b.X.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f126029a[x4.b.f126495s.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f126029a[x4.b.f126493n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f126029a[x4.b.f126490k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f126029a[x4.b.f126491l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f126029a[x4.b.f126492m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private l() {
    }

    static int A(byte[] data, int position, s1.k<?> list, b registers) throws IOException {
        e2 e2Var = (e2) list;
        int iJ = J(data, position, registers);
        int i10 = registers.f126030a + iJ;
        while (iJ < i10) {
            iJ = M(data, iJ, registers);
            e2Var.M0(registers.f126031b);
        }
        if (iJ == i10) {
            return iJ;
        }
        throw t1.n();
    }

    static int B(int tag, byte[] data, int position, int limit, s1.k<?> list, b registers) {
        r1 r1Var = (r1) list;
        int iJ = J(data, position, registers);
        r1Var.w1(z.c(registers.f126030a));
        while (iJ < limit) {
            int iJ2 = J(data, iJ, registers);
            if (tag != registers.f126030a) {
                break;
            }
            iJ = J(data, iJ2, registers);
            r1Var.w1(z.c(registers.f126030a));
        }
        return iJ;
    }

    static int C(int tag, byte[] data, int position, int limit, s1.k<?> list, b registers) {
        e2 e2Var = (e2) list;
        int iM = M(data, position, registers);
        e2Var.M0(z.d(registers.f126031b));
        while (iM < limit) {
            int iJ = J(data, iM, registers);
            if (tag != registers.f126030a) {
                break;
            }
            iM = M(data, iJ, registers);
            e2Var.M0(z.d(registers.f126031b));
        }
        return iM;
    }

    static int D(byte[] data, int position, b registers) throws t1 {
        int iJ = J(data, position, registers);
        int i10 = registers.f126030a;
        if (i10 < 0) {
            throw t1.h();
        }
        if (i10 == 0) {
            registers.f126032c = "";
            return iJ;
        }
        registers.f126032c = new String(data, iJ, i10, s1.f126324b);
        return iJ + i10;
    }

    static int E(int tag, byte[] data, int position, int limit, s1.k<?> list, b registers) throws t1 {
        int iJ = J(data, position, registers);
        int i10 = registers.f126030a;
        if (i10 < 0) {
            throw t1.h();
        }
        if (i10 == 0) {
            list.add("");
        } else {
            list.add(new String(data, iJ, i10, s1.f126324b));
            iJ += i10;
        }
        while (iJ < limit) {
            int iJ2 = J(data, iJ, registers);
            if (tag != registers.f126030a) {
                break;
            }
            iJ = J(data, iJ2, registers);
            int i11 = registers.f126030a;
            if (i11 < 0) {
                throw t1.h();
            }
            if (i11 == 0) {
                list.add("");
            } else {
                list.add(new String(data, iJ, i11, s1.f126324b));
                iJ += i11;
            }
        }
        return iJ;
    }

    static int F(int tag, byte[] data, int position, int limit, s1.k<?> list, b registers) throws t1 {
        int iJ = J(data, position, registers);
        int i10 = registers.f126030a;
        if (i10 < 0) {
            throw t1.h();
        }
        if (i10 == 0) {
            list.add("");
        } else {
            int i11 = iJ + i10;
            if (!u4.u(data, iJ, i11)) {
                throw t1.e();
            }
            list.add(new String(data, iJ, i10, s1.f126324b));
            iJ = i11;
        }
        while (iJ < limit) {
            int iJ2 = J(data, iJ, registers);
            if (tag != registers.f126030a) {
                break;
            }
            iJ = J(data, iJ2, registers);
            int i12 = registers.f126030a;
            if (i12 < 0) {
                throw t1.h();
            }
            if (i12 == 0) {
                list.add("");
            } else {
                int i13 = iJ + i12;
                if (!u4.u(data, iJ, i13)) {
                    throw t1.e();
                }
                list.add(new String(data, iJ, i12, s1.f126324b));
                iJ = i13;
            }
        }
        return iJ;
    }

    static int G(byte[] data, int position, b registers) throws t1 {
        int iJ = J(data, position, registers);
        int i10 = registers.f126030a;
        if (i10 < 0) {
            throw t1.h();
        }
        if (i10 == 0) {
            registers.f126032c = "";
            return iJ;
        }
        registers.f126032c = u4.h(data, iJ, i10);
        return iJ + i10;
    }

    static int H(int tag, byte[] data, int position, int limit, p4 unknownFields, b registers) throws t1 {
        if (x4.a(tag) == 0) {
            throw t1.d();
        }
        int iB = x4.b(tag);
        if (iB == 0) {
            int iM = M(data, position, registers);
            unknownFields.r(tag, Long.valueOf(registers.f126031b));
            return iM;
        }
        if (iB == 1) {
            unknownFields.r(tag, Long.valueOf(k(data, position)));
            return position + 8;
        }
        if (iB == 2) {
            int iJ = J(data, position, registers);
            int i10 = registers.f126030a;
            if (i10 < 0) {
                throw t1.h();
            }
            if (i10 > data.length - iJ) {
                throw t1.n();
            }
            if (i10 == 0) {
                unknownFields.r(tag, u.f126379f);
            } else {
                unknownFields.r(tag, u.B(data, iJ, i10));
            }
            return iJ + i10;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw t1.d();
            }
            unknownFields.r(tag, Integer.valueOf(i(data, position)));
            return position + 4;
        }
        p4 p4VarO = p4.o();
        int i11 = (tag & (-8)) | 4;
        int i12 = registers.f126034e + 1;
        registers.f126034e = i12;
        a(i12);
        int i13 = 0;
        while (position < limit) {
            int iJ2 = J(data, position, registers);
            i13 = registers.f126030a;
            if (i13 == i11) {
                position = iJ2;
                break;
            }
            position = H(i13, data, iJ2, limit, p4VarO, registers);
        }
        registers.f126034e--;
        if (position > limit || i13 != i11) {
            throw t1.i();
        }
        unknownFields.r(tag, p4VarO);
        return position;
    }

    static int I(int firstByte, byte[] data, int position, b registers) {
        int i10 = firstByte & 127;
        int i11 = position + 1;
        byte b10 = data[position];
        if (b10 >= 0) {
            registers.f126030a = i10 | (b10 << 7);
            return i11;
        }
        int i12 = i10 | ((b10 & 127) << 7);
        int i13 = position + 2;
        byte b11 = data[i11];
        if (b11 >= 0) {
            registers.f126030a = i12 | (b11 << com.google.common.base.c.f116463p);
            return i13;
        }
        int i14 = i12 | ((b11 & 127) << 14);
        int i15 = position + 3;
        byte b12 = data[i13];
        if (b12 >= 0) {
            registers.f126030a = i14 | (b12 << com.google.common.base.c.f116472y);
            return i15;
        }
        int i16 = i14 | ((b12 & 127) << 21);
        int i17 = position + 4;
        byte b13 = data[i15];
        if (b13 >= 0) {
            registers.f126030a = i16 | (b13 << com.google.common.base.c.F);
            return i17;
        }
        int i18 = i16 | ((b13 & 127) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (data[i17] >= 0) {
                registers.f126030a = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    static int J(byte[] data, int position, b registers) {
        int i10 = position + 1;
        byte b10 = data[position];
        if (b10 < 0) {
            return I(b10, data, i10, registers);
        }
        registers.f126030a = b10;
        return i10;
    }

    static int K(int tag, byte[] data, int position, int limit, s1.k<?> list, b registers) {
        r1 r1Var = (r1) list;
        int iJ = J(data, position, registers);
        r1Var.w1(registers.f126030a);
        while (iJ < limit) {
            int iJ2 = J(data, iJ, registers);
            if (tag != registers.f126030a) {
                break;
            }
            iJ = J(data, iJ2, registers);
            r1Var.w1(registers.f126030a);
        }
        return iJ;
    }

    static int L(long firstByte, byte[] data, int position, b registers) {
        int i10 = position + 1;
        byte b10 = data[position];
        long j10 = (firstByte & 127) | (((long) (b10 & 127)) << 7);
        int i11 = 7;
        while (b10 < 0) {
            int i12 = i10 + 1;
            byte b11 = data[i10];
            i11 += 7;
            j10 |= ((long) (b11 & 127)) << i11;
            i10 = i12;
            b10 = b11;
        }
        registers.f126031b = j10;
        return i10;
    }

    static int M(byte[] data, int position, b registers) {
        int i10 = position + 1;
        long j10 = data[position];
        if (j10 < 0) {
            return L(j10, data, i10, registers);
        }
        registers.f126031b = j10;
        return i10;
    }

    static int N(int tag, byte[] data, int position, int limit, s1.k<?> list, b registers) {
        e2 e2Var = (e2) list;
        int iM = M(data, position, registers);
        e2Var.M0(registers.f126031b);
        while (iM < limit) {
            int iJ = J(data, iM, registers);
            if (tag != registers.f126030a) {
                break;
            }
            iM = M(data, iJ, registers);
            e2Var.M0(registers.f126031b);
        }
        return iM;
    }

    static int O(Object msg, o3 schema, byte[] data, int position, int limit, int endGroup, b registers) throws IOException {
        int i10 = registers.f126034e + 1;
        registers.f126034e = i10;
        a(i10);
        int iF0 = ((q2) schema).f0(msg, data, position, limit, endGroup, registers);
        registers.f126034e--;
        registers.f126032c = msg;
        return iF0;
    }

    static int P(Object msg, o3 schema, byte[] data, int position, int limit, b registers) throws IOException {
        int I = position + 1;
        int i10 = data[position];
        if (i10 < 0) {
            I = I(i10, data, I, registers);
            i10 = registers.f126030a;
        }
        int i11 = I;
        if (i10 < 0 || i10 > limit - i11) {
            throw t1.n();
        }
        int i12 = registers.f126034e + 1;
        registers.f126034e = i12;
        a(i12);
        int i13 = i11 + i10;
        schema.i(msg, data, i11, i13, registers);
        registers.f126034e--;
        registers.f126032c = msg;
        return i13;
    }

    public static void Q(int limit) {
        f126028b = limit;
    }

    static int R(int tag, byte[] data, int position, int limit, b registers) throws t1 {
        if (x4.a(tag) == 0) {
            throw t1.d();
        }
        int iB = x4.b(tag);
        if (iB == 0) {
            return M(data, position, registers);
        }
        int i10 = 2 | 1;
        if (iB == 1) {
            return position + 8;
        }
        if (iB == 2) {
            return J(data, position, registers) + registers.f126030a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return position + 4;
            }
            throw t1.d();
        }
        int i11 = (tag & (-8)) | 4;
        int i12 = 0;
        int i13 = 0 << 0;
        while (position < limit) {
            position = J(data, position, registers);
            i12 = registers.f126030a;
            if (i12 == i11) {
                break;
            }
            position = R(i12, data, position, limit, registers);
        }
        if (position > limit || i12 != i11) {
            throw t1.i();
        }
        return position;
    }

    private static void a(int depth) throws t1 {
        if (depth >= f126028b) {
            throw t1.j();
        }
    }

    static int b(int tag, byte[] data, int position, int limit, s1.k<?> list, b registers) {
        q qVar = (q) list;
        int iM = M(data, position, registers);
        qVar.y0(registers.f126031b != 0);
        while (iM < limit) {
            int iJ = J(data, iM, registers);
            if (tag != registers.f126030a) {
                break;
            }
            iM = M(data, iJ, registers);
            qVar.y0(registers.f126031b != 0);
        }
        return iM;
    }

    static int c(byte[] data, int position, b registers) throws t1 {
        int iJ = J(data, position, registers);
        int i10 = registers.f126030a;
        if (i10 < 0) {
            throw t1.h();
        }
        if (i10 > data.length - iJ) {
            throw t1.n();
        }
        if (i10 == 0) {
            registers.f126032c = u.f126379f;
            return iJ;
        }
        registers.f126032c = u.B(data, iJ, i10);
        return iJ + i10;
    }

    static int d(int tag, byte[] data, int position, int limit, s1.k<?> list, b registers) throws t1 {
        int iJ = J(data, position, registers);
        int i10 = registers.f126030a;
        if (i10 < 0) {
            throw t1.h();
        }
        if (i10 > data.length - iJ) {
            throw t1.n();
        }
        if (i10 == 0) {
            list.add(u.f126379f);
        } else {
            list.add(u.B(data, iJ, i10));
            iJ += i10;
        }
        while (iJ < limit) {
            int iJ2 = J(data, iJ, registers);
            if (tag != registers.f126030a) {
                break;
            }
            iJ = J(data, iJ2, registers);
            int i11 = registers.f126030a;
            if (i11 < 0) {
                throw t1.h();
            }
            if (i11 > data.length - iJ) {
                throw t1.n();
            }
            if (i11 == 0) {
                list.add(u.f126379f);
            } else {
                list.add(u.B(data, iJ, i11));
                iJ += i11;
            }
        }
        return iJ;
    }

    static double e(byte[] data, int position) {
        return Double.longBitsToDouble(k(data, position));
    }

    static int f(int tag, byte[] data, int position, int limit, s1.k<?> list, b registers) {
        f0 f0Var = (f0) list;
        f0Var.R0(e(data, position));
        int i10 = position + 8;
        while (i10 < limit) {
            int iJ = J(data, i10, registers);
            if (tag != registers.f126030a) {
                break;
            }
            f0Var.R0(e(data, iJ));
            i10 = iJ + 8;
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int g(int tag, byte[] data, int position, int limit, l1.e<?, ?> message, l1.h<?, ?> extension, o4<p4, p4> unknownFieldSchema, b registers) throws IOException {
        int i10;
        int i11;
        f1<l1.g> f1Var = message.extensions;
        int i12 = tag >>> 3;
        if (extension.f126052d.F() && extension.f126052d.K()) {
            switch (a.f126029a[extension.b().ordinal()]) {
                case 1:
                    f0 f0Var = new f0();
                    int iT = t(data, position, f0Var, registers);
                    f1Var.P(extension.f126052d, f0Var);
                    return iT;
                case 2:
                    h1 h1Var = new h1();
                    int iW = w(data, position, h1Var, registers);
                    f1Var.P(extension.f126052d, h1Var);
                    return iW;
                case 3:
                case 4:
                    e2 e2Var = new e2();
                    int iA = A(data, position, e2Var, registers);
                    f1Var.P(extension.f126052d, e2Var);
                    return iA;
                case 5:
                case 6:
                    r1 r1Var = new r1();
                    int iZ = z(data, position, r1Var, registers);
                    f1Var.P(extension.f126052d, r1Var);
                    return iZ;
                case 7:
                case 8:
                    e2 e2Var2 = new e2();
                    int iV = v(data, position, e2Var2, registers);
                    f1Var.P(extension.f126052d, e2Var2);
                    return iV;
                case 9:
                case 10:
                    r1 r1Var2 = new r1();
                    int iU = u(data, position, r1Var2, registers);
                    f1Var.P(extension.f126052d, r1Var2);
                    return iU;
                case 11:
                    q qVar = new q();
                    int iS = s(data, position, qVar, registers);
                    f1Var.P(extension.f126052d, qVar);
                    return iS;
                case 12:
                    r1 r1Var3 = new r1();
                    int iX = x(data, position, r1Var3, registers);
                    f1Var.P(extension.f126052d, r1Var3);
                    return iX;
                case 13:
                    e2 e2Var3 = new e2();
                    int iY = y(data, position, e2Var3, registers);
                    f1Var.P(extension.f126052d, e2Var3);
                    return iY;
                case 14:
                    r1 r1Var4 = new r1();
                    int iZ2 = z(data, position, r1Var4, registers);
                    q3.B(message, i12, r1Var4, extension.f126052d.A(), null, unknownFieldSchema);
                    f1Var.P(extension.f126052d, r1Var4);
                    return iZ2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + extension.f126052d.u());
            }
        }
        Object objValueOf = null;
        if (extension.b() == x4.b.f126495s) {
            position = J(data, position, registers);
            if (extension.f126052d.A().a(registers.f126030a) == null) {
                q3.O(message, i12, registers.f126030a, null, unknownFieldSchema);
                return position;
            }
            objValueOf = Integer.valueOf(registers.f126030a);
        } else {
            switch (a.f126029a[extension.b().ordinal()]) {
                case 1:
                    i10 = position;
                    objValueOf = Double.valueOf(e(data, i10));
                    position = i10 + 8;
                    break;
                case 2:
                    i11 = position;
                    objValueOf = Float.valueOf(m(data, i11));
                    position = i11 + 4;
                    break;
                case 3:
                case 4:
                    position = M(data, position, registers);
                    objValueOf = Long.valueOf(registers.f126031b);
                    break;
                case 5:
                case 6:
                    position = J(data, position, registers);
                    objValueOf = Integer.valueOf(registers.f126030a);
                    break;
                case 7:
                case 8:
                    i10 = position;
                    objValueOf = Long.valueOf(k(data, i10));
                    position = i10 + 8;
                    break;
                case 9:
                case 10:
                    i11 = position;
                    objValueOf = Integer.valueOf(i(data, i11));
                    position = i11 + 4;
                    break;
                case 11:
                    position = M(data, position, registers);
                    objValueOf = Boolean.valueOf(registers.f126031b != 0);
                    break;
                case 12:
                    position = J(data, position, registers);
                    objValueOf = Integer.valueOf(z.c(registers.f126030a));
                    break;
                case 13:
                    position = M(data, position, registers);
                    objValueOf = Long.valueOf(z.d(registers.f126031b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    position = c(data, position, registers);
                    objValueOf = registers.f126032c;
                    break;
                case 16:
                    position = D(data, position, registers);
                    objValueOf = registers.f126032c;
                    break;
                case 17:
                    int i13 = (i12 << 3) | 4;
                    o3 o3VarI = i3.a().i(extension.c().getClass());
                    if (extension.f()) {
                        int iO = o(o3VarI, data, position, limit, i13, registers);
                        f1Var.h(extension.f126052d, registers.f126032c);
                        return iO;
                    }
                    Object objU = f1Var.u(extension.f126052d);
                    if (objU == null) {
                        objU = o3VarI.g();
                        f1Var.P(extension.f126052d, objU);
                    }
                    return O(objU, o3VarI, data, position, limit, i13, registers);
                case 18:
                    o3 o3VarI2 = i3.a().i(extension.c().getClass());
                    if (extension.f()) {
                        int iQ = q(o3VarI2, data, position, limit, registers);
                        f1Var.h(extension.f126052d, registers.f126032c);
                        return iQ;
                    }
                    Object objU2 = f1Var.u(extension.f126052d);
                    if (objU2 == null) {
                        objU2 = o3VarI2.g();
                        f1Var.P(extension.f126052d, objU2);
                    }
                    return P(objU2, o3VarI2, data, position, limit, registers);
            }
        }
        if (extension.f()) {
            f1Var.h(extension.f126052d, objValueOf);
            return position;
        }
        f1Var.P(extension.f126052d, objValueOf);
        return position;
    }

    static int h(int tag, byte[] data, int position, int limit, Object message, n2 defaultInstance, o4<p4, p4> unknownFieldSchema, b registers) throws IOException {
        l1.h hVarC = registers.f126033d.c(defaultInstance, tag >>> 3);
        if (hVarC == null) {
            return H(tag, data, position, limit, q2.x(message), registers);
        }
        l1.e eVar = (l1.e) message;
        eVar.am();
        return g(tag, data, position, limit, eVar, hVarC, unknownFieldSchema, registers);
    }

    static int i(byte[] data, int position) {
        return ((data[position + 3] & 255) << 24) | (data[position] & 255) | ((data[position + 1] & 255) << 8) | ((data[position + 2] & 255) << 16);
    }

    static int j(int tag, byte[] data, int position, int limit, s1.k<?> list, b registers) {
        r1 r1Var = (r1) list;
        r1Var.w1(i(data, position));
        int i10 = position + 4;
        while (i10 < limit) {
            int iJ = J(data, i10, registers);
            if (tag != registers.f126030a) {
                break;
            }
            r1Var.w1(i(data, iJ));
            i10 = iJ + 4;
        }
        return i10;
    }

    static long k(byte[] data, int position) {
        return ((((long) data[position + 7]) & 255) << 56) | (((long) data[position]) & 255) | ((((long) data[position + 1]) & 255) << 8) | ((((long) data[position + 2]) & 255) << 16) | ((((long) data[position + 3]) & 255) << 24) | ((((long) data[position + 4]) & 255) << 32) | ((((long) data[position + 5]) & 255) << 40) | ((((long) data[position + 6]) & 255) << 48);
    }

    static int l(int tag, byte[] data, int position, int limit, s1.k<?> list, b registers) {
        e2 e2Var = (e2) list;
        e2Var.M0(k(data, position));
        int i10 = position + 8;
        while (i10 < limit) {
            int iJ = J(data, i10, registers);
            if (tag != registers.f126030a) {
                break;
            }
            e2Var.M0(k(data, iJ));
            i10 = iJ + 8;
        }
        return i10;
    }

    static float m(byte[] data, int position) {
        return Float.intBitsToFloat(i(data, position));
    }

    static int n(int tag, byte[] data, int position, int limit, s1.k<?> list, b registers) {
        h1 h1Var = (h1) list;
        h1Var.b1(m(data, position));
        int i10 = position + 4;
        while (i10 < limit) {
            int iJ = J(data, i10, registers);
            if (tag != registers.f126030a) {
                break;
            }
            h1Var.b1(m(data, iJ));
            i10 = iJ + 4;
        }
        return i10;
    }

    static int o(o3 schema, byte[] data, int position, int limit, int endGroup, b registers) throws IOException {
        Object objG = schema.g();
        int iO = O(objG, schema, data, position, limit, endGroup, registers);
        schema.e(objG);
        registers.f126032c = objG;
        return iO;
    }

    static int p(o3 schema, int tag, byte[] data, int position, int limit, s1.k<?> list, b registers) throws IOException {
        int i10 = (tag & (-8)) | 4;
        int iO = o(schema, data, position, limit, i10, registers);
        list.add(registers.f126032c);
        while (iO < limit) {
            int iJ = J(data, iO, registers);
            if (tag != registers.f126030a) {
                break;
            }
            iO = o(schema, data, iJ, limit, i10, registers);
            list.add(registers.f126032c);
        }
        return iO;
    }

    static int q(o3 schema, byte[] data, int position, int limit, b registers) throws IOException {
        Object objG = schema.g();
        int iP = P(objG, schema, data, position, limit, registers);
        schema.e(objG);
        registers.f126032c = objG;
        return iP;
    }

    static int r(o3<?> schema, int tag, byte[] data, int position, int limit, s1.k<?> list, b registers) throws IOException {
        int iQ = q(schema, data, position, limit, registers);
        list.add(registers.f126032c);
        while (iQ < limit) {
            int iJ = J(data, iQ, registers);
            if (tag != registers.f126030a) {
                break;
            }
            iQ = q(schema, data, iJ, limit, registers);
            list.add(registers.f126032c);
        }
        return iQ;
    }

    static int s(byte[] data, int position, s1.k<?> list, b registers) throws IOException {
        q qVar = (q) list;
        int iJ = J(data, position, registers);
        int i10 = registers.f126030a + iJ;
        while (iJ < i10) {
            iJ = M(data, iJ, registers);
            qVar.y0(registers.f126031b != 0);
        }
        if (iJ == i10) {
            return iJ;
        }
        throw t1.n();
    }

    static int t(byte[] data, int position, s1.k<?> list, b registers) throws IOException {
        f0 f0Var = (f0) list;
        int iJ = J(data, position, registers);
        int i10 = registers.f126030a + iJ;
        while (iJ < i10) {
            f0Var.R0(e(data, iJ));
            iJ += 8;
        }
        if (iJ == i10) {
            return iJ;
        }
        throw t1.n();
    }

    static int u(byte[] data, int position, s1.k<?> list, b registers) throws IOException {
        r1 r1Var = (r1) list;
        int iJ = J(data, position, registers);
        int i10 = registers.f126030a + iJ;
        while (iJ < i10) {
            r1Var.w1(i(data, iJ));
            iJ += 4;
        }
        if (iJ == i10) {
            return iJ;
        }
        throw t1.n();
    }

    static int v(byte[] data, int position, s1.k<?> list, b registers) throws IOException {
        e2 e2Var = (e2) list;
        int iJ = J(data, position, registers);
        int i10 = registers.f126030a + iJ;
        while (iJ < i10) {
            e2Var.M0(k(data, iJ));
            iJ += 8;
        }
        if (iJ == i10) {
            return iJ;
        }
        throw t1.n();
    }

    static int w(byte[] data, int position, s1.k<?> list, b registers) throws IOException {
        h1 h1Var = (h1) list;
        int iJ = J(data, position, registers);
        int i10 = registers.f126030a + iJ;
        while (iJ < i10) {
            h1Var.b1(m(data, iJ));
            iJ += 4;
        }
        if (iJ == i10) {
            return iJ;
        }
        throw t1.n();
    }

    static int x(byte[] data, int position, s1.k<?> list, b registers) throws IOException {
        r1 r1Var = (r1) list;
        int iJ = J(data, position, registers);
        int i10 = registers.f126030a + iJ;
        while (iJ < i10) {
            iJ = J(data, iJ, registers);
            r1Var.w1(z.c(registers.f126030a));
        }
        if (iJ == i10) {
            return iJ;
        }
        throw t1.n();
    }

    static int y(byte[] data, int position, s1.k<?> list, b registers) throws IOException {
        e2 e2Var = (e2) list;
        int iJ = J(data, position, registers);
        int i10 = registers.f126030a + iJ;
        while (iJ < i10) {
            iJ = M(data, iJ, registers);
            e2Var.M0(z.d(registers.f126031b));
        }
        if (iJ == i10) {
            return iJ;
        }
        throw t1.n();
    }

    static int z(byte[] data, int position, s1.k<?> list, b registers) throws IOException {
        r1 r1Var = (r1) list;
        int iJ = J(data, position, registers);
        int i10 = registers.f126030a + iJ;
        while (iJ < i10) {
            iJ = J(data, iJ, registers);
            r1Var.w1(registers.f126030a);
        }
        if (iJ == i10) {
            return iJ;
        }
        throw t1.n();
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f126030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f126031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f126032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v0 f126033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f126034e;

        b() {
            this.f126033d = v0.d();
        }

        b(v0 extensionRegistry) {
            extensionRegistry.getClass();
            this.f126033d = extensionRegistry;
        }
    }
}
