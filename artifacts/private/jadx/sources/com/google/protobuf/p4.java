package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class p4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f126240f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p4 f126241g = new p4(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f126242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f126243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f126244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f126245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f126246e;

    private p4() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int minCapacity) {
        int[] iArr = this.f126243b;
        if (minCapacity > iArr.length) {
            int i10 = this.f126242a;
            int i11 = i10 + (i10 / 2);
            if (i11 >= minCapacity) {
                minCapacity = i11;
            }
            if (minCapacity < 8) {
                minCapacity = 8;
            }
            this.f126243b = Arrays.copyOf(iArr, minCapacity);
            this.f126244c = Arrays.copyOf(this.f126244c, minCapacity);
        }
    }

    public static p4 c() {
        return f126241g;
    }

    private static int f(int[] tags, int count) {
        int i10 = 17;
        for (int i11 = 0; i11 < count; i11++) {
            i10 = (i10 * 31) + tags[i11];
        }
        return i10;
    }

    private static int g(Object[] objects, int count) {
        int iHashCode = 17;
        for (int i10 = 0; i10 < count; i10++) {
            iHashCode = (iHashCode * 31) + objects[i10].hashCode();
        }
        return iHashCode;
    }

    private p4 j(final z input) throws IOException {
        int iZ;
        do {
            iZ = input.Z();
            if (iZ == 0) {
                break;
            }
        } while (i(iZ, input));
        return this;
    }

    static p4 n(p4 first, p4 second) {
        int i10 = first.f126242a + second.f126242a;
        int[] iArrCopyOf = Arrays.copyOf(first.f126243b, i10);
        System.arraycopy(second.f126243b, 0, iArrCopyOf, first.f126242a, second.f126242a);
        Object[] objArrCopyOf = Arrays.copyOf(first.f126244c, i10);
        System.arraycopy(second.f126244c, 0, objArrCopyOf, first.f126242a, second.f126242a);
        return new p4(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static p4 o() {
        return new p4();
    }

    private static boolean p(Object[] objects1, Object[] objects2, int count) {
        for (int i10 = 0; i10 < count; i10++) {
            if (!objects1[i10].equals(objects2[i10])) {
                return false;
            }
        }
        return true;
    }

    private static boolean s(int[] tags1, int[] tags2, int count) {
        for (int i10 = 0; i10 < count; i10++) {
            if (tags1[i10] != tags2[i10]) {
                return false;
            }
        }
        return true;
    }

    private static void v(int tag, Object object, z4 writer) throws IOException {
        int iA = x4.a(tag);
        int iB = x4.b(tag);
        if (iB == 0) {
            writer.F(iA, ((Long) object).longValue());
            return;
        }
        int i10 = 5 << 1;
        if (iB == 1) {
            writer.n(iA, ((Long) object).longValue());
            return;
        }
        if (iB == 2) {
            writer.N(iA, (u) object);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(t1.f());
            }
            writer.c(iA, ((Integer) object).intValue());
        } else if (writer.D() == z4.a.ASCENDING) {
            writer.r(iA);
            ((p4) object).x(writer);
            writer.t(iA);
        } else {
            writer.t(iA);
            ((p4) object).x(writer);
            writer.r(iA);
        }
    }

    void a() {
        if (!this.f126246e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iA1;
        int i10 = this.f126245d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f126242a; i12++) {
            int i13 = this.f126243b[i12];
            int iA = x4.a(i13);
            int iB = x4.b(i13);
            if (iB == 0) {
                iA1 = b0.a1(iA, ((Long) this.f126244c[i12]).longValue());
            } else if (iB == 1) {
                iA1 = b0.o0(iA, ((Long) this.f126244c[i12]).longValue());
            } else if (iB == 2) {
                iA1 = b0.g0(iA, (u) this.f126244c[i12]);
            } else if (iB == 3) {
                iA1 = (b0.X0(iA) * 2) + ((p4) this.f126244c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(t1.f());
                }
                iA1 = b0.m0(iA, ((Integer) this.f126244c[i12]).intValue());
            }
            i11 += iA1;
        }
        this.f126245d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f126245d;
        if (i10 != -1) {
            return i10;
        }
        int iK0 = 0;
        for (int i11 = 0; i11 < this.f126242a; i11++) {
            iK0 += b0.K0(x4.a(this.f126243b[i11]), (u) this.f126244c[i11]);
        }
        this.f126245d = iK0;
        return iK0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof p4)) {
            p4 p4Var = (p4) obj;
            int i10 = this.f126242a;
            if (i10 == p4Var.f126242a && s(this.f126243b, p4Var.f126243b, i10) && p(this.f126244c, p4Var.f126244c, this.f126242a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void h() {
        if (this.f126246e) {
            this.f126246e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f126242a;
        return ((((527 + i10) * 31) + f(this.f126243b, i10)) * 31) + g(this.f126244c, this.f126242a);
    }

    boolean i(final int tag, final z input) throws IOException {
        a();
        int iA = x4.a(tag);
        int iB = x4.b(tag);
        if (iB == 0) {
            r(tag, Long.valueOf(input.H()));
            return true;
        }
        if (iB == 1) {
            r(tag, Long.valueOf(input.C()));
            return true;
        }
        if (iB == 2) {
            r(tag, input.y());
            return true;
        }
        if (iB == 3) {
            p4 p4Var = new p4();
            p4Var.j(input);
            input.a(x4.c(iA, 4));
            r(tag, p4Var);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw t1.f();
        }
        r(tag, Integer.valueOf(input.B()));
        return true;
    }

    @x
    p4 k(p4 other) {
        if (other.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f126242a + other.f126242a;
        b(i10);
        System.arraycopy(other.f126243b, 0, this.f126243b, this.f126242a, other.f126242a);
        System.arraycopy(other.f126244c, 0, this.f126244c, this.f126242a, other.f126242a);
        this.f126242a = i10;
        return this;
    }

    p4 l(final int fieldNumber, final u value) {
        a();
        if (fieldNumber == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(x4.c(fieldNumber, 2), value);
        return this;
    }

    p4 m(int fieldNumber, int value) {
        a();
        if (fieldNumber == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(x4.c(fieldNumber, 0), Long.valueOf(value));
        return this;
    }

    final void q(StringBuilder buffer, int indent) {
        for (int i10 = 0; i10 < this.f126242a; i10++) {
            p2.d(buffer, indent, String.valueOf(x4.a(this.f126243b[i10])), this.f126244c[i10]);
        }
    }

    void r(int tag, Object value) {
        a();
        b(this.f126242a + 1);
        int[] iArr = this.f126243b;
        int i10 = this.f126242a;
        iArr[i10] = tag;
        this.f126244c[i10] = value;
        this.f126242a = i10 + 1;
    }

    public void t(b0 output) throws IOException {
        for (int i10 = 0; i10 < this.f126242a; i10++) {
            output.Y1(x4.a(this.f126243b[i10]), (u) this.f126244c[i10]);
        }
    }

    void u(z4 writer) throws IOException {
        if (writer.D() == z4.a.DESCENDING) {
            for (int i10 = this.f126242a - 1; i10 >= 0; i10--) {
                writer.b(x4.a(this.f126243b[i10]), this.f126244c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f126242a; i11++) {
            writer.b(x4.a(this.f126243b[i11]), this.f126244c[i11]);
        }
    }

    public void w(b0 output) throws IOException {
        for (int i10 = 0; i10 < this.f126242a; i10++) {
            int i11 = this.f126243b[i10];
            int iA = x4.a(i11);
            int iB = x4.b(i11);
            if (iB == 0) {
                output.f(iA, ((Long) this.f126244c[i10]).longValue());
            } else if (iB == 1) {
                output.n(iA, ((Long) this.f126244c[i10]).longValue());
            } else if (iB == 2) {
                output.N(iA, (u) this.f126244c[i10]);
            } else if (iB == 3) {
                output.g2(iA, 3);
                ((p4) this.f126244c[i10]).w(output);
                output.g2(iA, 4);
            } else {
                if (iB != 5) {
                    throw t1.f();
                }
                output.c(iA, ((Integer) this.f126244c[i10]).intValue());
            }
        }
    }

    public void x(z4 writer) throws IOException {
        if (this.f126242a == 0) {
            return;
        }
        if (writer.D() == z4.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f126242a; i10++) {
                v(this.f126243b[i10], this.f126244c[i10], writer);
            }
            return;
        }
        for (int i11 = this.f126242a - 1; i11 >= 0; i11--) {
            v(this.f126243b[i11], this.f126244c[i11], writer);
        }
    }

    private p4(int count, int[] tags, Object[] objects, boolean isMutable) {
        this.f126245d = -1;
        this.f126242a = count;
        this.f126243b = tags;
        this.f126244c = objects;
        this.f126246e = isMutable;
    }
}
