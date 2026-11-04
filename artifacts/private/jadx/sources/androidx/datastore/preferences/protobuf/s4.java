package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class s4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f50586f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final s4 f50587g = new s4(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f50589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f50590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f50592e;

    private s4() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int minCapacity) {
        int[] iArr = this.f50589b;
        if (minCapacity > iArr.length) {
            int i10 = this.f50588a;
            int i11 = i10 + (i10 / 2);
            if (i11 >= minCapacity) {
                minCapacity = i11;
            }
            if (minCapacity < 8) {
                minCapacity = 8;
            }
            this.f50589b = Arrays.copyOf(iArr, minCapacity);
            this.f50590c = Arrays.copyOf(this.f50590c, minCapacity);
        }
    }

    public static s4 c() {
        return f50587g;
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

    private s4 j(final z input) throws IOException {
        int iZ;
        do {
            iZ = input.Z();
            if (iZ == 0) {
                break;
            }
        } while (i(iZ, input));
        return this;
    }

    static s4 n(s4 first, s4 second) {
        int i10 = first.f50588a + second.f50588a;
        int[] iArrCopyOf = Arrays.copyOf(first.f50589b, i10);
        System.arraycopy(second.f50589b, 0, iArrCopyOf, first.f50588a, second.f50588a);
        Object[] objArrCopyOf = Arrays.copyOf(first.f50590c, i10);
        System.arraycopy(second.f50590c, 0, objArrCopyOf, first.f50588a, second.f50588a);
        boolean z10 = false & true;
        return new s4(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static s4 o() {
        return new s4();
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

    private static void v(int tag, Object object, c5 writer) throws IOException {
        int iA = a5.a(tag);
        int iB = a5.b(tag);
        if (iB == 0) {
            writer.F(iA, ((Long) object).longValue());
            return;
        }
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
        } else if (writer.D() == c5.a.ASCENDING) {
            writer.r(iA);
            ((s4) object).x(writer);
            writer.t(iA);
        } else {
            writer.t(iA);
            ((s4) object).x(writer);
            writer.r(iA);
        }
    }

    void a() {
        if (!this.f50592e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iA1;
        int i10 = this.f50591d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f50588a; i12++) {
            int i13 = this.f50589b[i12];
            int iA = a5.a(i13);
            int iB = a5.b(i13);
            if (iB == 0) {
                iA1 = b0.a1(iA, ((Long) this.f50590c[i12]).longValue());
            } else if (iB == 1) {
                iA1 = b0.o0(iA, ((Long) this.f50590c[i12]).longValue());
            } else if (iB != 2) {
                int i14 = 0 >> 3;
                if (iB == 3) {
                    iA1 = (b0.X0(iA) * 2) + ((s4) this.f50590c[i12]).d();
                } else {
                    if (iB != 5) {
                        throw new IllegalStateException(t1.f());
                    }
                    iA1 = b0.m0(iA, ((Integer) this.f50590c[i12]).intValue());
                }
            } else {
                iA1 = b0.g0(iA, (u) this.f50590c[i12]);
            }
            i11 += iA1;
        }
        this.f50591d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f50591d;
        if (i10 != -1) {
            return i10;
        }
        int iK0 = 0;
        for (int i11 = 0; i11 < this.f50588a; i11++) {
            iK0 += b0.K0(a5.a(this.f50589b[i11]), (u) this.f50590c[i11]);
        }
        this.f50591d = iK0;
        return iK0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof s4)) {
            s4 s4Var = (s4) obj;
            int i10 = this.f50588a;
            return i10 == s4Var.f50588a && s(this.f50589b, s4Var.f50589b, i10) && p(this.f50590c, s4Var.f50590c, this.f50588a);
        }
        return false;
    }

    public void h() {
        if (this.f50592e) {
            this.f50592e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f50588a;
        return ((((527 + i10) * 31) + f(this.f50589b, i10)) * 31) + g(this.f50590c, this.f50588a);
    }

    boolean i(final int tag, final z input) throws IOException {
        a();
        int iA = a5.a(tag);
        int iB = a5.b(tag);
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
            s4 s4Var = new s4();
            s4Var.j(input);
            input.a(a5.c(iA, 4));
            r(tag, s4Var);
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
    s4 k(s4 other) {
        if (other.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f50588a + other.f50588a;
        b(i10);
        System.arraycopy(other.f50589b, 0, this.f50589b, this.f50588a, other.f50588a);
        System.arraycopy(other.f50590c, 0, this.f50590c, this.f50588a, other.f50588a);
        this.f50588a = i10;
        return this;
    }

    s4 l(final int fieldNumber, final u value) {
        a();
        if (fieldNumber == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(a5.c(fieldNumber, 2), value);
        return this;
    }

    s4 m(int fieldNumber, int value) {
        a();
        if (fieldNumber == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(a5.c(fieldNumber, 0), Long.valueOf(value));
        return this;
    }

    final void q(StringBuilder buffer, int indent) {
        for (int i10 = 0; i10 < this.f50588a; i10++) {
            s2.d(buffer, indent, String.valueOf(a5.a(this.f50589b[i10])), this.f50590c[i10]);
        }
    }

    void r(int tag, Object value) {
        a();
        b(this.f50588a + 1);
        int[] iArr = this.f50589b;
        int i10 = this.f50588a;
        iArr[i10] = tag;
        this.f50590c[i10] = value;
        this.f50588a = i10 + 1;
    }

    public void t(b0 output) throws IOException {
        for (int i10 = 0; i10 < this.f50588a; i10++) {
            output.Y1(a5.a(this.f50589b[i10]), (u) this.f50590c[i10]);
        }
    }

    void u(c5 writer) throws IOException {
        if (writer.D() == c5.a.DESCENDING) {
            for (int i10 = this.f50588a - 1; i10 >= 0; i10--) {
                writer.b(a5.a(this.f50589b[i10]), this.f50590c[i10]);
            }
        } else {
            for (int i11 = 0; i11 < this.f50588a; i11++) {
                writer.b(a5.a(this.f50589b[i11]), this.f50590c[i11]);
            }
        }
    }

    public void w(b0 output) throws IOException {
        for (int i10 = 0; i10 < this.f50588a; i10++) {
            int i11 = this.f50589b[i10];
            int iA = a5.a(i11);
            int iB = a5.b(i11);
            if (iB == 0) {
                output.f(iA, ((Long) this.f50590c[i10]).longValue());
            } else if (iB == 1) {
                output.n(iA, ((Long) this.f50590c[i10]).longValue());
            } else if (iB == 2) {
                output.N(iA, (u) this.f50590c[i10]);
            } else if (iB == 3) {
                output.g2(iA, 3);
                ((s4) this.f50590c[i10]).w(output);
                output.g2(iA, 4);
            } else {
                if (iB != 5) {
                    throw t1.f();
                }
                output.c(iA, ((Integer) this.f50590c[i10]).intValue());
            }
        }
    }

    public void x(c5 writer) throws IOException {
        if (this.f50588a == 0) {
            return;
        }
        if (writer.D() == c5.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f50588a; i10++) {
                v(this.f50589b[i10], this.f50590c[i10], writer);
            }
            return;
        }
        for (int i11 = this.f50588a - 1; i11 >= 0; i11--) {
            v(this.f50589b[i11], this.f50590c[i11], writer);
        }
    }

    private s4(int count, int[] tags, Object[] objects, boolean isMutable) {
        this.f50591d = -1;
        this.f50588a = count;
        this.f50589b = tags;
        this.f50590c = objects;
        this.f50592e = isMutable;
    }
}
