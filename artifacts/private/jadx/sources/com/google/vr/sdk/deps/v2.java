package com.google.vr.sdk.deps;

import com.google.vr.sdk.deps.t4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class v2<ContainingType extends t4, Type> implements j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f129624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f129625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f129626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f129627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f129628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f129629f;

    private v2() {
    }

    private byte O() throws IOException {
        int i10 = this.f129626c;
        if (i10 == this.f129627d) {
            throw v3.a();
        }
        byte[] bArr = this.f129625b;
        this.f129626c = i10 + 1;
        return bArr[i10];
    }

    private int P() throws IOException {
        b0(4);
        return R();
    }

    private long Q() throws IOException {
        b0(8);
        return S();
    }

    private int R() {
        int i10 = this.f129626c;
        byte[] bArr = this.f129625b;
        this.f129626c = i10 + 4;
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24);
    }

    private long S() {
        int i10 = this.f129626c;
        byte[] bArr = this.f129625b;
        this.f129626c = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    private void T() throws IOException {
        int i10 = this.f129627d;
        int i11 = this.f129626c;
        if (i10 - i11 >= 10) {
            byte[] bArr = this.f129625b;
            int i12 = 0;
            while (i12 < 10) {
                int i13 = i11 + 1;
                if (bArr[i11] >= 0) {
                    this.f129626c = i13;
                    return;
                } else {
                    i12++;
                    i11 = i13;
                }
            }
        }
        U();
    }

    private void U() throws IOException {
        for (int i10 = 0; i10 < 10; i10++) {
            if (O() >= 0) {
                return;
            }
        }
        throw v3.c();
    }

    private void V() throws IOException {
        int i10 = this.f129629f;
        this.f129629f = ((this.f129628e >>> 3) << 3) | 4;
        while (y() != Integer.MAX_VALUE && c()) {
        }
        if (this.f129628e != this.f129629f) {
            throw v3.g();
        }
        this.f129629f = i10;
    }

    public static v2 W(ByteBuffer byteBuffer, boolean z10) {
        if (!byteBuffer.hasArray()) {
            throw new IllegalArgumentException("Direct buffers not yet supported");
        }
        int i10 = 5 >> 1;
        return new v2(byteBuffer, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object X(o6 o6Var, Class<?> cls, x2 x2Var) throws IOException {
        switch (o6Var.ordinal()) {
            case 0:
                return Double.valueOf(d());
            case 1:
                return Float.valueOf(e());
            case 2:
                return Long.valueOf(J());
            case 3:
                return Long.valueOf(f());
            case 4:
                return Integer.valueOf(L());
            case 5:
                return Long.valueOf(i());
            case 6:
                return Integer.valueOf(a());
            case 7:
                return Boolean.valueOf(k());
            case 8:
                return m();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return M(cls, x2Var);
            case 11:
                return n();
            case 12:
                return Integer.valueOf(g());
            case 13:
                return Integer.valueOf(h());
            case 14:
                return Integer.valueOf(j());
            case 15:
                return Long.valueOf(o());
            case 16:
                return Integer.valueOf(s());
            case 17:
                return Long.valueOf(q());
        }
    }

    private void Z(int i10) throws IOException {
        b0(i10);
        this.f129626c += i10;
    }

    private void b0(int i10) throws IOException {
        if (i10 < 0 || i10 > this.f129627d - this.f129626c) {
            throw v3.a();
        }
    }

    private <T> T c0(k5<T> k5Var, x2 x2Var) throws IOException {
        int iM0 = m0();
        b0(iM0);
        int i10 = this.f129627d;
        int i11 = this.f129626c + iM0;
        this.f129627d = i11;
        try {
            T tY = k5Var.y();
            k5Var.g(tY, this, x2Var);
            k5Var.a(tY);
            if (this.f129626c != i11) {
                throw v3.g();
            }
            this.f129627d = i10;
            return tY;
        } catch (Throwable th2) {
            this.f129627d = i10;
            throw th2;
        }
    }

    private void d0(int i10) throws IOException {
        if ((this.f129628e & 7) != i10) {
            throw v3.e();
        }
    }

    private <T> T e0(k5<T> k5Var, x2 x2Var) throws IOException {
        int i10 = this.f129629f;
        this.f129629f = ((this.f129628e >>> 3) << 3) | 4;
        try {
            T tY = k5Var.y();
            k5Var.g(tY, this, x2Var);
            k5Var.a(tY);
            if (this.f129628e != this.f129629f) {
                throw v3.g();
            }
            this.f129629f = i10;
            return tY;
        } catch (Throwable th2) {
            this.f129629f = i10;
            throw th2;
        }
    }

    private void f0(int i10) throws IOException {
        b0(i10);
        if ((i10 & 7) != 0) {
            throw v3.g();
        }
    }

    private void g0(int i10) throws IOException {
        b0(i10);
        if ((i10 & 3) != 0) {
            throw v3.g();
        }
    }

    private void h0(int i10) throws IOException {
        if (this.f129626c != i10) {
            throw v3.a();
        }
    }

    public static int i0() {
        throw new NoSuchMethodError();
    }

    public static t4 j0() {
        throw new NoSuchMethodError();
    }

    private boolean l0() {
        return this.f129626c == this.f129627d;
    }

    private int m0() throws IOException {
        int i10;
        int i11 = this.f129626c;
        int i12 = this.f129627d;
        if (i12 == i11) {
            throw v3.a();
        }
        byte[] bArr = this.f129625b;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            this.f129626c = i13;
            return b10;
        }
        if (i12 - i13 < 9) {
            return (int) n0();
        }
        int i14 = i11 + 2;
        int i15 = (bArr[i13] << 7) ^ b10;
        if (i15 < 0) {
            i10 = i15 ^ (-128);
        } else {
            int i16 = i11 + 3;
            int i17 = (bArr[i14] << com.google.common.base.c.f116463p) ^ i15;
            if (i17 >= 0) {
                i10 = i17 ^ 16256;
            } else {
                int i18 = i11 + 4;
                int i19 = i17 ^ (bArr[i16] << com.google.common.base.c.f116472y);
                if (i19 < 0) {
                    i10 = (-2080896) ^ i19;
                } else {
                    i16 = i11 + 5;
                    byte b11 = bArr[i18];
                    int i20 = (i19 ^ (b11 << com.google.common.base.c.F)) ^ 266354560;
                    if (b11 < 0) {
                        i18 = i11 + 6;
                        if (bArr[i16] < 0) {
                            i16 = i11 + 7;
                            if (bArr[i18] < 0) {
                                i18 = i11 + 8;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 9;
                                    if (bArr[i18] < 0) {
                                        int i21 = i11 + 10;
                                        if (bArr[i16] < 0) {
                                            throw v3.c();
                                        }
                                        i14 = i21;
                                        i10 = i20;
                                    }
                                }
                            }
                        }
                        i10 = i20;
                    }
                    i10 = i20;
                }
                i14 = i18;
            }
            i14 = i16;
        }
        this.f129626c = i14;
        return i10;
    }

    private long n0() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bO = O();
            j10 |= ((long) (bO & 127)) << i10;
            if ((bO & 128) == 0) {
                return j10;
            }
        }
        throw v3.c();
    }

    @Override // com.google.vr.sdk.deps.j5
    public void A(List<Integer> list) throws IOException {
        int i10;
        int i11;
        if (list instanceof j3) {
            j3 j3Var = (j3) list;
            int i12 = this.f129628e & 7;
            if (i12 != 2) {
                if (i12 != 5) {
                    throw v3.e();
                }
                do {
                    j3Var.k(j());
                    if (!l0()) {
                        i11 = this.f129626c;
                    }
                } while (m0() == this.f129628e);
                this.f129626c = i11;
                return;
            }
            int iM0 = m0();
            g0(iM0);
            int i13 = this.f129626c + iM0;
            while (this.f129626c < i13) {
                j3Var.k(R());
            }
        } else {
            int i14 = this.f129628e & 7;
            if (i14 != 2) {
                if (i14 != 5) {
                    throw v3.e();
                }
                do {
                    list.add(Integer.valueOf(j()));
                    if (!l0()) {
                        i10 = this.f129626c;
                    }
                } while (m0() == this.f129628e);
                this.f129626c = i10;
                return;
            }
            int iM1 = m0();
            g0(iM1);
            int i15 = this.f129626c + iM1;
            while (this.f129626c < i15) {
                list.add(Integer.valueOf(R()));
            }
        }
    }

    @Override // com.google.vr.sdk.deps.j5
    public void B(List<Integer> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof j3)) {
            int i12 = this.f129628e & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw v3.e();
                }
                int iM0 = this.f129626c + m0();
                while (this.f129626c < iM0) {
                    list.add(Integer.valueOf(m0()));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(g()));
                if (l0()) {
                    return;
                } else {
                    i10 = this.f129626c;
                }
            } while (m0() == this.f129628e);
            this.f129626c = i10;
            return;
        }
        j3 j3Var = (j3) list;
        int i13 = this.f129628e & 7;
        if (i13 != 0) {
            if (i13 != 2) {
                throw v3.e();
            }
            int iM1 = this.f129626c + m0();
            while (this.f129626c < iM1) {
                j3Var.k(m0());
            }
            return;
        }
        do {
            j3Var.k(g());
            if (l0()) {
                return;
            } else {
                i11 = this.f129626c;
            }
        } while (m0() == this.f129628e);
        this.f129626c = i11;
    }

    @Override // com.google.vr.sdk.deps.j5
    public void C(List<k2> list) throws IOException {
        int i10;
        if ((this.f129628e & 7) != 2) {
            throw v3.e();
        }
        do {
            list.add(n());
            if (l0()) {
                return;
            } else {
                i10 = this.f129626c;
            }
        } while (m0() == this.f129628e);
        this.f129626c = i10;
    }

    @Override // com.google.vr.sdk.deps.j5
    public void D(List<String> list) throws IOException {
        a0(list, true);
    }

    @Override // com.google.vr.sdk.deps.j5
    public <T> T E(k5<T> k5Var, x2 x2Var) throws IOException {
        d0(2);
        return (T) c0(k5Var, x2Var);
    }

    @Override // com.google.vr.sdk.deps.j5
    public void F(List<Double> list) throws IOException {
        int i10;
        int i11;
        if (list instanceof u2) {
            u2 u2Var = (u2) list;
            int i12 = this.f129628e & 7;
            if (i12 == 1) {
                do {
                    u2Var.d(d());
                    if (!l0()) {
                        i11 = this.f129626c;
                    }
                } while (m0() == this.f129628e);
                this.f129626c = i11;
                return;
            }
            if (i12 != 2) {
                throw v3.e();
            }
            int iM0 = m0();
            f0(iM0);
            int i13 = this.f129626c + iM0;
            while (this.f129626c < i13) {
                u2Var.d(Double.longBitsToDouble(S()));
            }
        } else {
            int i14 = this.f129628e & 7;
            if (i14 == 1) {
                do {
                    list.add(Double.valueOf(d()));
                    if (!l0()) {
                        i10 = this.f129626c;
                    }
                } while (m0() == this.f129628e);
                this.f129626c = i10;
                return;
            }
            if (i14 != 2) {
                throw v3.e();
            }
            int iM1 = m0();
            f0(iM1);
            int i15 = this.f129626c + iM1;
            while (this.f129626c < i15) {
                list.add(Double.valueOf(Double.longBitsToDouble(S())));
            }
        }
    }

    @Override // com.google.vr.sdk.deps.j5
    public <T> T G(k5<T> k5Var, x2 x2Var) throws IOException {
        d0(3);
        return (T) e0(k5Var, x2Var);
    }

    @Override // com.google.vr.sdk.deps.j5
    public void H(List<Integer> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof j3)) {
            int i12 = this.f129628e & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(L()));
                    if (l0()) {
                        return;
                    } else {
                        i10 = this.f129626c;
                    }
                } while (m0() == this.f129628e);
                this.f129626c = i10;
                return;
            }
            if (i12 != 2) {
                throw v3.e();
            }
            int iM0 = this.f129626c + m0();
            while (this.f129626c < iM0) {
                list.add(Integer.valueOf(m0()));
            }
            h0(iM0);
            return;
        }
        j3 j3Var = (j3) list;
        int i13 = this.f129628e & 7;
        if (i13 == 0) {
            do {
                j3Var.k(L());
                if (l0()) {
                    return;
                } else {
                    i11 = this.f129626c;
                }
            } while (m0() == this.f129628e);
            this.f129626c = i11;
            return;
        }
        if (i13 != 2) {
            throw v3.e();
        }
        int iM1 = this.f129626c + m0();
        while (this.f129626c < iM1) {
            j3Var.k(m0());
        }
        h0(iM1);
    }

    @Override // com.google.vr.sdk.deps.j5
    public void I(List<Long> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof i4)) {
            int i12 = this.f129628e & 7;
            if (i12 == 0) {
                do {
                    list.add(Long.valueOf(J()));
                    if (!l0()) {
                        i10 = this.f129626c;
                    }
                } while (m0() == this.f129628e);
                this.f129626c = i10;
                return;
            }
            if (i12 != 2) {
                throw v3.e();
            }
            int iM0 = this.f129626c + m0();
            while (this.f129626c < iM0) {
                list.add(Long.valueOf(k0()));
            }
            h0(iM0);
            return;
        }
        i4 i4Var = (i4) list;
        int i13 = this.f129628e & 7;
        if (i13 == 0) {
            do {
                i4Var.i(J());
                if (!l0()) {
                    i11 = this.f129626c;
                }
            } while (m0() == this.f129628e);
            this.f129626c = i11;
            return;
        }
        if (i13 != 2) {
            throw v3.e();
        }
        int iM1 = this.f129626c + m0();
        while (this.f129626c < iM1) {
            i4Var.i(k0());
        }
        h0(iM1);
    }

    @Override // com.google.vr.sdk.deps.j5
    public long J() throws IOException {
        d0(0);
        return k0();
    }

    @Override // com.google.vr.sdk.deps.j5
    public void K(List<Long> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof i4)) {
            int i12 = this.f129628e & 7;
            if (i12 == 0) {
                do {
                    list.add(Long.valueOf(f()));
                    if (!l0()) {
                        i10 = this.f129626c;
                    }
                } while (m0() == this.f129628e);
                this.f129626c = i10;
                return;
            }
            if (i12 != 2) {
                throw v3.e();
            }
            int iM0 = this.f129626c + m0();
            while (this.f129626c < iM0) {
                list.add(Long.valueOf(k0()));
            }
            h0(iM0);
            return;
        }
        i4 i4Var = (i4) list;
        int i13 = this.f129628e & 7;
        if (i13 == 0) {
            do {
                i4Var.i(f());
                if (!l0()) {
                    i11 = this.f129626c;
                }
            } while (m0() == this.f129628e);
            this.f129626c = i11;
            return;
        }
        if (i13 != 2) {
            throw v3.e();
        }
        int iM1 = this.f129626c + m0();
        while (this.f129626c < iM1) {
            i4Var.i(k0());
        }
        h0(iM1);
    }

    @Override // com.google.vr.sdk.deps.j5
    public int L() throws IOException {
        d0(0);
        return m0();
    }

    @Override // com.google.vr.sdk.deps.j5
    public <T> T M(Class<T> cls, x2 x2Var) throws IOException {
        d0(2);
        return (T) c0(f5.a().b(cls), x2Var);
    }

    @Override // com.google.vr.sdk.deps.j5
    public void N(List<Float> list) throws IOException {
        int i10;
        int i11;
        if (list instanceof f3) {
            f3 f3Var = (f3) list;
            int i12 = this.f129628e & 7;
            if (i12 != 2) {
                if (i12 != 5) {
                    throw v3.e();
                }
                do {
                    f3Var.d(e());
                    if (!l0()) {
                        i11 = this.f129626c;
                    }
                } while (m0() == this.f129628e);
                this.f129626c = i11;
                return;
            }
            int iM0 = m0();
            g0(iM0);
            int i13 = this.f129626c + iM0;
            while (this.f129626c < i13) {
                f3Var.d(Float.intBitsToFloat(R()));
            }
        } else {
            int i14 = this.f129628e & 7;
            if (i14 != 2) {
                if (i14 != 5) {
                    throw v3.e();
                }
                do {
                    list.add(Float.valueOf(e()));
                    if (!l0()) {
                        i10 = this.f129626c;
                    }
                } while (m0() == this.f129628e);
                this.f129626c = i10;
                return;
            }
            int iM1 = m0();
            g0(iM1);
            int i15 = this.f129626c + iM1;
            while (this.f129626c < i15) {
                list.add(Float.valueOf(Float.intBitsToFloat(R())));
            }
        }
    }

    public String Y(boolean z10) throws IOException {
        d0(2);
        int iM0 = m0();
        if (iM0 == 0) {
            return "";
        }
        b0(iM0);
        if (z10) {
            byte[] bArr = this.f129625b;
            int i10 = this.f129626c;
            if (!i6.h(bArr, i10, i10 + iM0)) {
                throw v3.h();
            }
        }
        String str = new String(this.f129625b, this.f129626c, iM0, k3.f129468a);
        this.f129626c += iM0;
        return str;
    }

    @Override // com.google.vr.sdk.deps.j5
    public int a() throws IOException {
        d0(5);
        return P();
    }

    public void a0(List<String> list, boolean z10) throws IOException {
        int i10;
        int i11;
        if ((this.f129628e & 7) != 2) {
            throw v3.e();
        }
        if (!(list instanceof d4) || z10) {
            do {
                list.add(Y(z10));
                if (!l0()) {
                    i10 = this.f129626c;
                }
            } while (m0() == this.f129628e);
            this.f129626c = i10;
            return;
        }
        d4 d4Var = (d4) list;
        do {
            d4Var.t2(n());
            if (!l0()) {
                i11 = this.f129626c;
            }
        } while (m0() == this.f129628e);
        this.f129626c = i11;
    }

    @Override // com.google.vr.sdk.deps.j5
    public int b() {
        return this.f129628e;
    }

    @Override // com.google.vr.sdk.deps.j5
    public boolean c() throws IOException {
        int i10;
        if (!l0() && (i10 = this.f129628e) != this.f129629f) {
            int i11 = i10 & 7;
            if (i11 == 0) {
                T();
                return true;
            }
            if (i11 == 1) {
                Z(8);
                return true;
            }
            if (i11 == 2) {
                Z(m0());
                return true;
            }
            if (i11 == 3) {
                V();
                return true;
            }
            if (i11 != 5) {
                throw v3.e();
            }
            Z(4);
            return true;
        }
        return false;
    }

    @Override // com.google.vr.sdk.deps.j5
    public double d() throws IOException {
        d0(1);
        return Double.longBitsToDouble(Q());
    }

    @Override // com.google.vr.sdk.deps.j5
    public float e() throws IOException {
        d0(5);
        return Float.intBitsToFloat(P());
    }

    @Override // com.google.vr.sdk.deps.j5
    public long f() throws IOException {
        d0(0);
        return k0();
    }

    @Override // com.google.vr.sdk.deps.j5
    public int g() throws IOException {
        d0(0);
        return m0();
    }

    @Override // com.google.vr.sdk.deps.j5
    public int h() throws IOException {
        d0(0);
        return m0();
    }

    @Override // com.google.vr.sdk.deps.j5
    public long i() throws IOException {
        d0(1);
        return Q();
    }

    @Override // com.google.vr.sdk.deps.j5
    public int j() throws IOException {
        d0(5);
        return P();
    }

    @Override // com.google.vr.sdk.deps.j5
    public boolean k() throws IOException {
        d0(0);
        return m0() != 0;
    }

    public long k0() throws IOException {
        long j10;
        long j11;
        long j12;
        int i10 = this.f129626c;
        int i11 = this.f129627d;
        if (i11 == i10) {
            throw v3.a();
        }
        byte[] bArr = this.f129625b;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            this.f129626c = i12;
            return b10;
        }
        if (i11 - i12 < 9) {
            return n0();
        }
        int i13 = i10 + 2;
        int i14 = (bArr[i12] << 7) ^ b10;
        if (i14 < 0) {
            j10 = i14 ^ (-128);
        } else {
            int i15 = i10 + 3;
            int i16 = (bArr[i13] << com.google.common.base.c.f116463p) ^ i14;
            if (i16 >= 0) {
                j10 = i16 ^ 16256;
                i13 = i15;
            } else {
                int i17 = i10 + 4;
                int i18 = i16 ^ (bArr[i15] << com.google.common.base.c.f116472y);
                if (i18 < 0) {
                    long j13 = (-2080896) ^ i18;
                    i13 = i17;
                    j10 = j13;
                } else {
                    long j14 = i18;
                    i13 = i10 + 5;
                    long j15 = j14 ^ (((long) bArr[i17]) << 28);
                    if (j15 >= 0) {
                        j12 = 266354560;
                    } else {
                        int i19 = i10 + 6;
                        long j16 = j15 ^ (((long) bArr[i13]) << 35);
                        if (j16 < 0) {
                            j11 = -34093383808L;
                        } else {
                            i13 = i10 + 7;
                            j15 = j16 ^ (((long) bArr[i19]) << 42);
                            if (j15 >= 0) {
                                j12 = 4363953127296L;
                            } else {
                                i19 = i10 + 8;
                                j16 = j15 ^ (((long) bArr[i13]) << 49);
                                if (j16 < 0) {
                                    j11 = -558586000294016L;
                                } else {
                                    i13 = i10 + 9;
                                    long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                    if (j17 < 0) {
                                        int i20 = i10 + 10;
                                        if (bArr[i13] < 0) {
                                            throw v3.c();
                                        }
                                        i13 = i20;
                                    }
                                    j10 = j17;
                                }
                            }
                        }
                        j10 = j16 ^ j11;
                        i13 = i19;
                    }
                    j10 = j15 ^ j12;
                }
            }
        }
        this.f129626c = i13;
        return j10;
    }

    @Override // com.google.vr.sdk.deps.j5
    public String l() throws IOException {
        return Y(false);
    }

    @Override // com.google.vr.sdk.deps.j5
    public String m() throws IOException {
        return Y(true);
    }

    @Override // com.google.vr.sdk.deps.j5
    public k2 n() throws IOException {
        d0(2);
        int iM0 = m0();
        if (iM0 == 0) {
            return k2.f129465b;
        }
        b0(iM0);
        k2 k2VarB = this.f129624a ? k2.B(this.f129625b, this.f129626c, iM0) : k2.n(this.f129625b, this.f129626c, iM0);
        this.f129626c += iM0;
        return k2VarB;
    }

    @Override // com.google.vr.sdk.deps.j5
    public long o() throws IOException {
        d0(1);
        return Q();
    }

    @Override // com.google.vr.sdk.deps.j5
    public void p(List<Long> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof i4)) {
            int i12 = this.f129628e & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw v3.e();
                }
                int iM0 = this.f129626c + m0();
                while (this.f129626c < iM0) {
                    list.add(Long.valueOf(x5.k(k0())));
                }
                return;
            }
            do {
                list.add(Long.valueOf(q()));
                if (l0()) {
                    return;
                } else {
                    i10 = this.f129626c;
                }
            } while (m0() == this.f129628e);
            this.f129626c = i10;
            return;
        }
        i4 i4Var = (i4) list;
        int i13 = this.f129628e & 7;
        if (i13 != 0) {
            if (i13 != 2) {
                throw v3.e();
            }
            int iM1 = this.f129626c + m0();
            while (this.f129626c < iM1) {
                i4Var.i(x5.k(k0()));
            }
            return;
        }
        do {
            i4Var.i(q());
            if (l0()) {
                return;
            } else {
                i11 = this.f129626c;
            }
        } while (m0() == this.f129628e);
        this.f129626c = i11;
    }

    @Override // com.google.vr.sdk.deps.j5
    public long q() throws IOException {
        d0(0);
        return x5.k(k0());
    }

    @Override // com.google.vr.sdk.deps.j5
    public void r(List<Integer> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof j3)) {
            int i12 = this.f129628e & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw v3.e();
                }
                int iM0 = this.f129626c + m0();
                while (this.f129626c < iM0) {
                    list.add(Integer.valueOf(x5.z(m0())));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(s()));
                if (l0()) {
                    return;
                } else {
                    i10 = this.f129626c;
                }
            } while (m0() == this.f129628e);
            this.f129626c = i10;
            return;
        }
        j3 j3Var = (j3) list;
        int i13 = this.f129628e & 7;
        if (i13 != 0) {
            if (i13 != 2) {
                throw v3.e();
            }
            int iM1 = this.f129626c + m0();
            while (this.f129626c < iM1) {
                j3Var.k(x5.z(m0()));
            }
            return;
        }
        do {
            j3Var.k(s());
            if (l0()) {
                return;
            } else {
                i11 = this.f129626c;
            }
        } while (m0() == this.f129628e);
        this.f129626c = i11;
    }

    @Override // com.google.vr.sdk.deps.j5
    public int s() throws IOException {
        d0(0);
        return x5.z(m0());
    }

    @Override // com.google.vr.sdk.deps.j5
    public void t(List<String> list) throws IOException {
        a0(list, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.vr.sdk.deps.j5
    public <K, V> void u(Map<K, V> map, n4<K, V> n4Var, x2 x2Var) throws IOException {
        d0(2);
        int iM0 = m0();
        b0(iM0);
        int i10 = this.f129627d;
        this.f129627d = this.f129626c + iM0;
        try {
            Object objX = n4Var.f129491b;
            Object objX2 = n4Var.f129493d;
            while (true) {
                int iY = y();
                if (iY == Integer.MAX_VALUE) {
                    map.put(objX, objX2);
                    this.f129627d = i10;
                    return;
                } else if (iY == 1) {
                    objX = X(n4Var.f129490a, null, null);
                } else if (iY != 2) {
                    try {
                        if (!c()) {
                            throw new v3("Unable to parse map entry.");
                        }
                    } catch (w3 unused) {
                        if (!c()) {
                            throw new v3("Unable to parse map entry.");
                        }
                    }
                } else {
                    objX2 = X(n4Var.f129492c, n4Var.f129493d.getClass(), x2Var);
                }
            }
        } catch (Throwable th2) {
            this.f129627d = i10;
            throw th2;
        }
    }

    @Override // com.google.vr.sdk.deps.j5
    public void v(List<Boolean> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof i2)) {
            int i12 = this.f129628e & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw v3.e();
                }
                int iM0 = this.f129626c + m0();
                while (this.f129626c < iM0) {
                    list.add(Boolean.valueOf(m0() != 0));
                }
                h0(iM0);
                return;
            }
            do {
                list.add(Boolean.valueOf(k()));
                if (l0()) {
                    return;
                } else {
                    i10 = this.f129626c;
                }
            } while (m0() == this.f129628e);
            this.f129626c = i10;
            return;
        }
        i2 i2Var = (i2) list;
        int i13 = this.f129628e & 7;
        if (i13 != 0) {
            if (i13 != 2) {
                throw v3.e();
            }
            int iM1 = this.f129626c + m0();
            while (this.f129626c < iM1) {
                i2Var.i(m0() != 0);
            }
            h0(iM1);
            return;
        }
        do {
            i2Var.i(k());
            if (l0()) {
                return;
            } else {
                i11 = this.f129626c;
            }
        } while (m0() == this.f129628e);
        this.f129626c = i11;
    }

    @Override // com.google.vr.sdk.deps.j5
    public void w(List<Integer> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof j3)) {
            int i12 = this.f129628e & 7;
            if (i12 == 2) {
                int iM0 = m0();
                g0(iM0);
                int i13 = this.f129626c + iM0;
                while (this.f129626c < i13) {
                    list.add(Integer.valueOf(R()));
                }
                return;
            }
            if (i12 != 5) {
                throw v3.e();
            }
            do {
                list.add(Integer.valueOf(a()));
                if (l0()) {
                    return;
                } else {
                    i10 = this.f129626c;
                }
            } while (m0() == this.f129628e);
            this.f129626c = i10;
            return;
        }
        j3 j3Var = (j3) list;
        int i14 = this.f129628e & 7;
        if (i14 == 2) {
            int iM1 = m0();
            g0(iM1);
            int i15 = this.f129626c + iM1;
            while (this.f129626c < i15) {
                j3Var.k(R());
            }
            return;
        }
        if (i14 != 5) {
            throw v3.e();
        }
        do {
            j3Var.k(a());
            if (l0()) {
                return;
            } else {
                i11 = this.f129626c;
            }
        } while (m0() == this.f129628e);
        this.f129626c = i11;
    }

    @Override // com.google.vr.sdk.deps.j5
    public void x(List<Long> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof i4)) {
            int i12 = this.f129628e & 7;
            if (i12 == 1) {
                do {
                    list.add(Long.valueOf(i()));
                    if (l0()) {
                        return;
                    } else {
                        i10 = this.f129626c;
                    }
                } while (m0() == this.f129628e);
                this.f129626c = i10;
                return;
            }
            if (i12 != 2) {
                throw v3.e();
            }
            int iM0 = m0();
            f0(iM0);
            int i13 = this.f129626c + iM0;
            while (this.f129626c < i13) {
                list.add(Long.valueOf(S()));
            }
            return;
        }
        i4 i4Var = (i4) list;
        int i14 = this.f129628e & 7;
        if (i14 == 1) {
            do {
                i4Var.i(i());
                if (l0()) {
                    return;
                } else {
                    i11 = this.f129626c;
                }
            } while (m0() == this.f129628e);
            this.f129626c = i11;
            return;
        }
        if (i14 != 2) {
            throw v3.e();
        }
        int iM1 = m0();
        f0(iM1);
        int i15 = this.f129626c + iM1;
        while (this.f129626c < i15) {
            i4Var.i(S());
        }
    }

    @Override // com.google.vr.sdk.deps.j5
    public int y() throws IOException {
        if (l0()) {
            return Integer.MAX_VALUE;
        }
        int iM0 = m0();
        this.f129628e = iM0;
        if (iM0 == this.f129629f) {
            return Integer.MAX_VALUE;
        }
        return iM0 >>> 3;
    }

    @Override // com.google.vr.sdk.deps.j5
    public void z(List<Integer> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof j3)) {
            int i12 = this.f129628e & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw v3.e();
                }
                int iM0 = this.f129626c + m0();
                while (this.f129626c < iM0) {
                    list.add(Integer.valueOf(m0()));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(h()));
                if (l0()) {
                    return;
                } else {
                    i10 = this.f129626c;
                }
            } while (m0() == this.f129628e);
            this.f129626c = i10;
            return;
        }
        j3 j3Var = (j3) list;
        int i13 = this.f129628e & 7;
        if (i13 != 0) {
            if (i13 != 2) {
                throw v3.e();
            }
            int iM1 = this.f129626c + m0();
            while (this.f129626c < iM1) {
                j3Var.k(m0());
            }
            return;
        }
        do {
            j3Var.k(h());
            if (l0()) {
                return;
            } else {
                i11 = this.f129626c;
            }
        } while (m0() == this.f129628e);
        this.f129626c = i11;
    }

    public v2(ByteBuffer byteBuffer, boolean z10) {
        this();
        this.f129624a = z10;
        this.f129625b = byteBuffer.array();
        this.f129626c = byteBuffer.arrayOffset() + byteBuffer.position();
        this.f129627d = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.vr.sdk.deps.j5
    public <T> void b(List<T> list, k5<T> k5Var, x2 x2Var) throws IOException {
        int i10;
        int i11 = this.f129628e;
        if ((i11 & 7) != 3) {
            throw v3.e();
        }
        do {
            list.add(e0(k5Var, x2Var));
            if (l0()) {
                return;
            } else {
                i10 = this.f129626c;
            }
        } while (m0() == i11);
        this.f129626c = i10;
    }

    @Override // com.google.vr.sdk.deps.j5
    public void s(List<Long> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof i4)) {
            int i12 = this.f129628e & 7;
            if (i12 == 1) {
                do {
                    list.add(Long.valueOf(o()));
                    if (l0()) {
                        return;
                    } else {
                        i10 = this.f129626c;
                    }
                } while (m0() == this.f129628e);
                this.f129626c = i10;
                return;
            }
            if (i12 != 2) {
                throw v3.e();
            }
            int iM0 = m0();
            f0(iM0);
            int i13 = this.f129626c + iM0;
            while (this.f129626c < i13) {
                list.add(Long.valueOf(S()));
            }
            return;
        }
        i4 i4Var = (i4) list;
        int i14 = this.f129628e & 7;
        if (i14 == 1) {
            do {
                i4Var.i(o());
                if (l0()) {
                    return;
                } else {
                    i11 = this.f129626c;
                }
            } while (m0() == this.f129628e);
            this.f129626c = i11;
            return;
        }
        if (i14 == 2) {
            int iM1 = m0();
            f0(iM1);
            int i15 = this.f129626c + iM1;
            while (this.f129626c < i15) {
                i4Var.i(S());
            }
            return;
        }
        throw v3.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.vr.sdk.deps.j5
    public <T> void c(List<T> list, k5<T> k5Var, x2 x2Var) throws IOException {
        int i10;
        int i11 = this.f129628e;
        if ((i11 & 7) == 2) {
            do {
                list.add(c0(k5Var, x2Var));
                if (l0()) {
                    return;
                } else {
                    i10 = this.f129626c;
                }
            } while (m0() == i11);
            this.f129626c = i10;
            return;
        }
        throw v3.e();
    }
}
