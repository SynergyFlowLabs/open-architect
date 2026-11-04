package com.google.vr.sdk.deps;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class s2 implements j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x5 f129570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f129571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f129572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f129573d = 0;

    private s2(x5 x5Var) {
        x5 x5Var2 = (x5) k3.f(x5Var, MetricTracker.Object.INPUT);
        this.f129570a = x5Var2;
        x5Var2.f129688c = this;
    }

    private final void O(int i10) throws IOException {
        if (this.f129570a.S() != i10) {
            throw v3.a();
        }
    }

    public static s2 d(x5 x5Var) {
        s2 s2Var = x5Var.f129688c;
        return s2Var != null ? s2Var : new s2(x5Var);
    }

    private final void f(int i10) throws IOException {
        if ((this.f129571b & 7) != i10) {
            throw v3.e();
        }
    }

    private final <T> T n(k5<T> k5Var, x2 x2Var) throws IOException {
        int i10 = this.f129572c;
        this.f129572c = ((this.f129571b >>> 3) << 3) | 4;
        try {
            T tY = k5Var.y();
            k5Var.g(tY, this, x2Var);
            k5Var.a(tY);
            if (this.f129571b != this.f129572c) {
                throw v3.g();
            }
            this.f129572c = i10;
            return tY;
        } catch (Throwable th2) {
            this.f129572c = i10;
            throw th2;
        }
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void A(List<Integer> list) throws IOException {
        int iS;
        int iS2;
        int i10 = 7 >> 2;
        if (!(list instanceof j3)) {
            int i11 = this.f129571b & 7;
            if (i11 == 2) {
                int iK = this.f129570a.K();
                m(iK);
                int iS3 = this.f129570a.S() + iK;
                do {
                    list.add(Integer.valueOf(this.f129570a.M()));
                } while (this.f129570a.S() < iS3);
                return;
            }
            if (i11 != 5) {
                throw v3.e();
            }
            do {
                list.add(Integer.valueOf(this.f129570a.M()));
                if (this.f129570a.R()) {
                    return;
                } else {
                    iS = this.f129570a.s();
                }
            } while (iS == this.f129571b);
            this.f129573d = iS;
            return;
        }
        j3 j3Var = (j3) list;
        int i12 = this.f129571b & 7;
        if (i12 == 2) {
            int iK2 = this.f129570a.K();
            m(iK2);
            int iS4 = this.f129570a.S() + iK2;
            do {
                j3Var.k(this.f129570a.M());
            } while (this.f129570a.S() < iS4);
            return;
        }
        if (i12 != 5) {
            throw v3.e();
        }
        do {
            j3Var.k(this.f129570a.M());
            if (this.f129570a.R()) {
                return;
            } else {
                iS2 = this.f129570a.s();
            }
        } while (iS2 == this.f129571b);
        this.f129573d = iS2;
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void B(List<Integer> list) throws IOException {
        int iS;
        int iS2;
        if (!(list instanceof j3)) {
            int i10 = this.f129571b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f129570a.K()));
                    if (this.f129570a.R()) {
                        return;
                    } else {
                        iS = this.f129570a.s();
                    }
                } while (iS == this.f129571b);
                this.f129573d = iS;
                return;
            }
            if (i10 != 2) {
                throw v3.e();
            }
            int iS3 = this.f129570a.S() + this.f129570a.K();
            do {
                list.add(Integer.valueOf(this.f129570a.K()));
            } while (this.f129570a.S() < iS3);
            O(iS3);
            return;
        }
        j3 j3Var = (j3) list;
        int i11 = this.f129571b & 7;
        if (i11 == 0) {
            do {
                j3Var.k(this.f129570a.K());
                if (this.f129570a.R()) {
                    return;
                } else {
                    iS2 = this.f129570a.s();
                }
            } while (iS2 == this.f129571b);
            this.f129573d = iS2;
            return;
        }
        if (i11 != 2) {
            throw v3.e();
        }
        int iS4 = this.f129570a.S() + this.f129570a.K();
        do {
            j3Var.k(this.f129570a.K());
        } while (this.f129570a.S() < iS4);
        O(iS4);
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void C(List<k2> list) throws IOException {
        int iS;
        if ((this.f129571b & 7) != 2) {
            throw v3.e();
        }
        do {
            list.add(n());
            if (this.f129570a.R()) {
                return;
            } else {
                iS = this.f129570a.s();
            }
        } while (iS == this.f129571b);
        this.f129573d = iS;
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void D(List<String> list) throws IOException {
        i(list, true);
    }

    @Override // com.google.vr.sdk.deps.j5
    public final <T> T E(k5<T> k5Var, x2 x2Var) throws IOException {
        f(2);
        return (T) l(k5Var, x2Var);
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void F(List<Double> list) throws IOException {
        int iS;
        int iS2;
        if (!(list instanceof u2)) {
            int i10 = this.f129571b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(this.f129570a.u()));
                    if (this.f129570a.R()) {
                        return;
                    } else {
                        iS = this.f129570a.s();
                    }
                } while (iS == this.f129571b);
                this.f129573d = iS;
                return;
            }
            if (i10 != 2) {
                throw v3.e();
            }
            int iK = this.f129570a.K();
            k(iK);
            int iS3 = this.f129570a.S() + iK;
            do {
                list.add(Double.valueOf(this.f129570a.u()));
            } while (this.f129570a.S() < iS3);
            return;
        }
        u2 u2Var = (u2) list;
        int i11 = this.f129571b & 7;
        if (i11 == 1) {
            do {
                u2Var.d(this.f129570a.u());
                if (this.f129570a.R()) {
                    return;
                } else {
                    iS2 = this.f129570a.s();
                }
            } while (iS2 == this.f129571b);
            this.f129573d = iS2;
            return;
        }
        if (i11 != 2) {
            throw v3.e();
        }
        int iK2 = this.f129570a.K();
        k(iK2);
        int iS4 = this.f129570a.S() + iK2;
        do {
            u2Var.d(this.f129570a.u());
        } while (this.f129570a.S() < iS4);
    }

    @Override // com.google.vr.sdk.deps.j5
    public final <T> T G(k5<T> k5Var, x2 x2Var) throws IOException {
        f(3);
        return (T) n(k5Var, x2Var);
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void H(List<Integer> list) throws IOException {
        int iS;
        int iS2;
        if (!(list instanceof j3)) {
            int i10 = this.f129571b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f129570a.D()));
                    if (this.f129570a.R()) {
                        return;
                    } else {
                        iS = this.f129570a.s();
                    }
                } while (iS == this.f129571b);
                this.f129573d = iS;
                return;
            }
            if (i10 != 2) {
                throw v3.e();
            }
            int iS3 = this.f129570a.S() + this.f129570a.K();
            do {
                list.add(Integer.valueOf(this.f129570a.D()));
            } while (this.f129570a.S() < iS3);
            O(iS3);
            return;
        }
        j3 j3Var = (j3) list;
        int i11 = this.f129571b & 7;
        if (i11 == 0) {
            do {
                j3Var.k(this.f129570a.D());
                if (this.f129570a.R()) {
                    return;
                } else {
                    iS2 = this.f129570a.s();
                }
            } while (iS2 == this.f129571b);
            this.f129573d = iS2;
            return;
        }
        if (i11 != 2) {
            throw v3.e();
        }
        int iS4 = this.f129570a.S() + this.f129570a.K();
        do {
            j3Var.k(this.f129570a.D());
        } while (this.f129570a.S() < iS4);
        O(iS4);
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void I(List<Long> list) throws IOException {
        int iS;
        int iS2;
        if (!(list instanceof i4)) {
            int i10 = this.f129571b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f129570a.B()));
                    if (this.f129570a.R()) {
                        return;
                    } else {
                        iS = this.f129570a.s();
                    }
                } while (iS == this.f129571b);
                this.f129573d = iS;
                return;
            }
            if (i10 != 2) {
                throw v3.e();
            }
            int iS3 = this.f129570a.S() + this.f129570a.K();
            do {
                list.add(Long.valueOf(this.f129570a.B()));
            } while (this.f129570a.S() < iS3);
            O(iS3);
            return;
        }
        i4 i4Var = (i4) list;
        int i11 = this.f129571b & 7;
        if (i11 == 0) {
            do {
                i4Var.i(this.f129570a.B());
                if (this.f129570a.R()) {
                    return;
                } else {
                    iS2 = this.f129570a.s();
                }
            } while (iS2 == this.f129571b);
            this.f129573d = iS2;
            return;
        }
        if (i11 != 2) {
            throw v3.e();
        }
        int iS4 = this.f129570a.S() + this.f129570a.K();
        do {
            i4Var.i(this.f129570a.B());
        } while (this.f129570a.S() < iS4);
        O(iS4);
    }

    @Override // com.google.vr.sdk.deps.j5
    public final long J() throws IOException {
        f(0);
        return this.f129570a.B();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void K(List<Long> list) throws IOException {
        int iS;
        int iS2;
        if (!(list instanceof i4)) {
            int i10 = this.f129571b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f129570a.A()));
                    if (this.f129570a.R()) {
                        return;
                    } else {
                        iS = this.f129570a.s();
                    }
                } while (iS == this.f129571b);
                this.f129573d = iS;
                return;
            }
            if (i10 != 2) {
                throw v3.e();
            }
            int iS3 = this.f129570a.S() + this.f129570a.K();
            do {
                list.add(Long.valueOf(this.f129570a.A()));
            } while (this.f129570a.S() < iS3);
            O(iS3);
            return;
        }
        i4 i4Var = (i4) list;
        int i11 = this.f129571b & 7;
        if (i11 == 0) {
            do {
                i4Var.i(this.f129570a.A());
                if (this.f129570a.R()) {
                    return;
                } else {
                    iS2 = this.f129570a.s();
                }
            } while (iS2 == this.f129571b);
            this.f129573d = iS2;
            return;
        }
        if (i11 != 2) {
            throw v3.e();
        }
        int iS4 = this.f129570a.S() + this.f129570a.K();
        do {
            i4Var.i(this.f129570a.A());
        } while (this.f129570a.S() < iS4);
        O(iS4);
    }

    @Override // com.google.vr.sdk.deps.j5
    public final int L() throws IOException {
        f(0);
        return this.f129570a.D();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final <T> T M(Class<T> cls, x2 x2Var) throws IOException {
        f(2);
        return (T) l(f5.a().b(cls), x2Var);
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void N(List<Float> list) throws IOException {
        int iS;
        int iS2;
        if (!(list instanceof f3)) {
            int i10 = this.f129571b & 7;
            if (i10 == 2) {
                int iK = this.f129570a.K();
                m(iK);
                int iS3 = this.f129570a.S() + iK;
                do {
                    list.add(Float.valueOf(this.f129570a.w()));
                } while (this.f129570a.S() < iS3);
                return;
            }
            if (i10 != 5) {
                throw v3.e();
            }
            do {
                list.add(Float.valueOf(this.f129570a.w()));
                if (this.f129570a.R()) {
                    return;
                } else {
                    iS = this.f129570a.s();
                }
            } while (iS == this.f129571b);
            this.f129573d = iS;
            return;
        }
        f3 f3Var = (f3) list;
        int i11 = this.f129571b & 7;
        if (i11 == 2) {
            int iK2 = this.f129570a.K();
            m(iK2);
            int iS4 = this.f129570a.S() + iK2;
            do {
                f3Var.d(this.f129570a.w());
            } while (this.f129570a.S() < iS4);
            return;
        }
        if (i11 != 5) {
            throw v3.e();
        }
        do {
            f3Var.d(this.f129570a.w());
            if (this.f129570a.R()) {
                return;
            } else {
                iS2 = this.f129570a.s();
            }
        } while (iS2 == this.f129571b);
        this.f129573d = iS2;
    }

    @Override // com.google.vr.sdk.deps.j5
    public final int a() throws IOException {
        f(5);
        return this.f129570a.F();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final int b() {
        return this.f129571b;
    }

    @Override // com.google.vr.sdk.deps.j5
    public final boolean c() throws IOException {
        int i10;
        if (!this.f129570a.R() && (i10 = this.f129571b) != this.f129572c) {
            return this.f129570a.q(i10);
        }
        return false;
    }

    @Override // com.google.vr.sdk.deps.j5
    public final float e() throws IOException {
        f(5);
        return this.f129570a.w();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final int g() throws IOException {
        f(0);
        return this.f129570a.K();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final int h() throws IOException {
        f(0);
        return this.f129570a.L();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final long i() throws IOException {
        f(1);
        return this.f129570a.E();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final int j() throws IOException {
        f(5);
        return this.f129570a.M();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final boolean k() throws IOException {
        f(0);
        return this.f129570a.G();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final String l() throws IOException {
        f(2);
        return this.f129570a.H();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final String m() throws IOException {
        f(2);
        return this.f129570a.I();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final long o() throws IOException {
        f(1);
        return this.f129570a.N();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void p(List<Long> list) throws IOException {
        int iS;
        int iS2;
        if (!(list instanceof i4)) {
            int i10 = this.f129571b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f129570a.P()));
                    if (this.f129570a.R()) {
                        return;
                    } else {
                        iS = this.f129570a.s();
                    }
                } while (iS == this.f129571b);
                this.f129573d = iS;
                return;
            }
            if (i10 != 2) {
                throw v3.e();
            }
            int iS3 = this.f129570a.S() + this.f129570a.K();
            do {
                list.add(Long.valueOf(this.f129570a.P()));
            } while (this.f129570a.S() < iS3);
            O(iS3);
            return;
        }
        i4 i4Var = (i4) list;
        int i11 = this.f129571b & 7;
        if (i11 == 0) {
            do {
                i4Var.i(this.f129570a.P());
                if (this.f129570a.R()) {
                    return;
                } else {
                    iS2 = this.f129570a.s();
                }
            } while (iS2 == this.f129571b);
            this.f129573d = iS2;
            return;
        }
        if (i11 != 2) {
            throw v3.e();
        }
        int iS4 = this.f129570a.S() + this.f129570a.K();
        do {
            i4Var.i(this.f129570a.P());
        } while (this.f129570a.S() < iS4);
        O(iS4);
    }

    @Override // com.google.vr.sdk.deps.j5
    public final long q() throws IOException {
        f(0);
        return this.f129570a.P();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void r(List<Integer> list) throws IOException {
        int iS;
        int iS2;
        if (!(list instanceof j3)) {
            int i10 = this.f129571b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f129570a.O()));
                    if (!this.f129570a.R()) {
                        iS = this.f129570a.s();
                    }
                } while (iS == this.f129571b);
                this.f129573d = iS;
                return;
            }
            if (i10 != 2) {
                throw v3.e();
            }
            int iS3 = this.f129570a.S() + this.f129570a.K();
            do {
                list.add(Integer.valueOf(this.f129570a.O()));
            } while (this.f129570a.S() < iS3);
            O(iS3);
            return;
        }
        j3 j3Var = (j3) list;
        int i11 = this.f129571b & 7;
        if (i11 == 0) {
            do {
                j3Var.k(this.f129570a.O());
                if (!this.f129570a.R()) {
                    iS2 = this.f129570a.s();
                }
            } while (iS2 == this.f129571b);
            this.f129573d = iS2;
            return;
        }
        if (i11 != 2) {
            throw v3.e();
        }
        int iS4 = this.f129570a.S() + this.f129570a.K();
        do {
            j3Var.k(this.f129570a.O());
        } while (this.f129570a.S() < iS4);
        O(iS4);
    }

    @Override // com.google.vr.sdk.deps.j5
    public final int s() throws IOException {
        f(0);
        return this.f129570a.O();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void t(List<String> list) throws IOException {
        i(list, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.vr.sdk.deps.j5
    public final <K, V> void u(Map<K, V> map, n4<K, V> n4Var, x2 x2Var) throws IOException {
        f(2);
        int iT = this.f129570a.t(this.f129570a.K());
        Object objE = n4Var.f129491b;
        Object objE2 = n4Var.f129493d;
        while (true) {
            try {
                int iY = y();
                if (iY == Integer.MAX_VALUE || this.f129570a.R()) {
                    break;
                }
                if (iY == 1) {
                    objE = e(n4Var.f129490a, null, null);
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
                    objE2 = e(n4Var.f129492c, n4Var.f129493d.getClass(), x2Var);
                }
            } catch (Throwable th2) {
                this.f129570a.v(iT);
                throw th2;
            }
        }
        map.put(objE, objE2);
        this.f129570a.v(iT);
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void v(List<Boolean> list) throws IOException {
        int iS;
        int iS2;
        if (!(list instanceof i2)) {
            int i10 = this.f129571b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f129570a.G()));
                    if (this.f129570a.R()) {
                        return;
                    } else {
                        iS = this.f129570a.s();
                    }
                } while (iS == this.f129571b);
                this.f129573d = iS;
                return;
            }
            if (i10 != 2) {
                throw v3.e();
            }
            int iS3 = this.f129570a.S() + this.f129570a.K();
            do {
                list.add(Boolean.valueOf(this.f129570a.G()));
            } while (this.f129570a.S() < iS3);
            O(iS3);
            return;
        }
        i2 i2Var = (i2) list;
        int i11 = this.f129571b & 7;
        if (i11 == 0) {
            do {
                i2Var.i(this.f129570a.G());
                if (this.f129570a.R()) {
                    return;
                } else {
                    iS2 = this.f129570a.s();
                }
            } while (iS2 == this.f129571b);
            this.f129573d = iS2;
            return;
        }
        if (i11 != 2) {
            throw v3.e();
        }
        int iS4 = this.f129570a.S() + this.f129570a.K();
        do {
            i2Var.i(this.f129570a.G());
        } while (this.f129570a.S() < iS4);
        O(iS4);
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void w(List<Integer> list) throws IOException {
        int iS;
        int iS2;
        if (!(list instanceof j3)) {
            int i10 = this.f129571b & 7;
            if (i10 == 2) {
                int iK = this.f129570a.K();
                m(iK);
                int iS3 = this.f129570a.S() + iK;
                do {
                    list.add(Integer.valueOf(this.f129570a.F()));
                } while (this.f129570a.S() < iS3);
                return;
            }
            if (i10 != 5) {
                throw v3.e();
            }
            do {
                list.add(Integer.valueOf(this.f129570a.F()));
                if (this.f129570a.R()) {
                    return;
                } else {
                    iS = this.f129570a.s();
                }
            } while (iS == this.f129571b);
            this.f129573d = iS;
            return;
        }
        j3 j3Var = (j3) list;
        int i11 = this.f129571b & 7;
        if (i11 == 2) {
            int iK2 = this.f129570a.K();
            m(iK2);
            int iS4 = this.f129570a.S() + iK2;
            do {
                j3Var.k(this.f129570a.F());
            } while (this.f129570a.S() < iS4);
            return;
        }
        if (i11 != 5) {
            throw v3.e();
        }
        do {
            j3Var.k(this.f129570a.F());
            if (this.f129570a.R()) {
                return;
            } else {
                iS2 = this.f129570a.s();
            }
        } while (iS2 == this.f129571b);
        this.f129573d = iS2;
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void x(List<Long> list) throws IOException {
        int iS;
        int iS2;
        if (!(list instanceof i4)) {
            int i10 = this.f129571b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f129570a.E()));
                    if (this.f129570a.R()) {
                        return;
                    } else {
                        iS = this.f129570a.s();
                    }
                } while (iS == this.f129571b);
                this.f129573d = iS;
                return;
            }
            if (i10 != 2) {
                throw v3.e();
            }
            int iK = this.f129570a.K();
            k(iK);
            int iS3 = this.f129570a.S() + iK;
            do {
                list.add(Long.valueOf(this.f129570a.E()));
            } while (this.f129570a.S() < iS3);
            return;
        }
        i4 i4Var = (i4) list;
        int i11 = this.f129571b & 7;
        if (i11 == 1) {
            do {
                i4Var.i(this.f129570a.E());
                if (this.f129570a.R()) {
                    return;
                } else {
                    iS2 = this.f129570a.s();
                }
            } while (iS2 == this.f129571b);
            this.f129573d = iS2;
            return;
        }
        if (i11 != 2) {
            throw v3.e();
        }
        int iK2 = this.f129570a.K();
        k(iK2);
        int iS4 = this.f129570a.S() + iK2;
        do {
            i4Var.i(this.f129570a.E());
        } while (this.f129570a.S() < iS4);
    }

    @Override // com.google.vr.sdk.deps.j5
    public final int y() throws IOException {
        int i10 = this.f129573d;
        if (i10 != 0) {
            this.f129571b = i10;
            this.f129573d = 0;
        } else {
            this.f129571b = this.f129570a.s();
        }
        int i11 = this.f129571b;
        if (i11 == 0 || i11 == this.f129572c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void z(List<Integer> list) throws IOException {
        int iS;
        int iS2;
        if (!(list instanceof j3)) {
            int i10 = this.f129571b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f129570a.L()));
                    if (this.f129570a.R()) {
                        return;
                    } else {
                        iS = this.f129570a.s();
                    }
                } while (iS == this.f129571b);
                this.f129573d = iS;
                return;
            }
            if (i10 != 2) {
                throw v3.e();
            }
            int iS3 = this.f129570a.S() + this.f129570a.K();
            do {
                list.add(Integer.valueOf(this.f129570a.L()));
            } while (this.f129570a.S() < iS3);
            O(iS3);
            return;
        }
        j3 j3Var = (j3) list;
        int i11 = this.f129571b & 7;
        if (i11 == 0) {
            do {
                j3Var.k(this.f129570a.L());
                if (this.f129570a.R()) {
                    return;
                } else {
                    iS2 = this.f129570a.s();
                }
            } while (iS2 == this.f129571b);
            this.f129573d = iS2;
            return;
        }
        if (i11 != 2) {
            throw v3.e();
        }
        int iS4 = this.f129570a.S() + this.f129570a.K();
        do {
            j3Var.k(this.f129570a.L());
        } while (this.f129570a.S() < iS4);
        O(iS4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.vr.sdk.deps.j5
    public final <T> void b(List<T> list, k5<T> k5Var, x2 x2Var) throws IOException {
        int iS;
        int i10 = this.f129571b;
        if ((i10 & 7) != 3) {
            throw v3.e();
        }
        do {
            list.add(n(k5Var, x2Var));
            if (!this.f129570a.R() && this.f129573d == 0) {
                iS = this.f129570a.s();
            }
        } while (iS == i10);
        this.f129573d = iS;
    }

    private final Object e(o6 o6Var, Class<?> cls, x2 x2Var) throws IOException {
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

    private final void i(List<String> list, boolean z10) throws IOException {
        int iS;
        int iS2;
        if ((this.f129571b & 7) != 2) {
            throw v3.e();
        }
        if ((list instanceof d4) && !z10) {
            d4 d4Var = (d4) list;
            do {
                d4Var.t2(n());
                if (this.f129570a.R()) {
                    return;
                } else {
                    iS2 = this.f129570a.s();
                }
            } while (iS2 == this.f129571b);
            this.f129573d = iS2;
            return;
        }
        do {
            list.add(z10 ? m() : l());
            if (this.f129570a.R()) {
                return;
            } else {
                iS = this.f129570a.s();
            }
        } while (iS == this.f129571b);
        this.f129573d = iS;
    }

    private static void k(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw v3.g();
        }
    }

    private final <T> T l(k5<T> k5Var, x2 x2Var) throws IOException {
        int iK = this.f129570a.K();
        x5 x5Var = this.f129570a;
        if (x5Var.f129686a < x5Var.f129687b) {
            int iT = x5Var.t(iK);
            T tY = k5Var.y();
            this.f129570a.f129686a++;
            k5Var.g(tY, this, x2Var);
            k5Var.a(tY);
            this.f129570a.p(0);
            x5 x5Var2 = this.f129570a;
            x5Var2.f129686a--;
            x5Var2.v(iT);
            return tY;
        }
        throw v3.f();
    }

    private static void m(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw v3.g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.vr.sdk.deps.j5
    public final <T> void c(List<T> list, k5<T> k5Var, x2 x2Var) throws IOException {
        int iS;
        int i10 = this.f129571b;
        if ((i10 & 7) != 2) {
            throw v3.e();
        }
        do {
            list.add(l(k5Var, x2Var));
            if (this.f129570a.R() || this.f129573d != 0) {
                return;
            } else {
                iS = this.f129570a.s();
            }
        } while (iS == i10);
        this.f129573d = iS;
    }

    @Override // com.google.vr.sdk.deps.j5
    public final double d() throws IOException {
        f(1);
        return this.f129570a.u();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final long f() throws IOException {
        f(0);
        return this.f129570a.A();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final void s(List<Long> list) throws IOException {
        int iS;
        int iS2;
        if (list instanceof i4) {
            i4 i4Var = (i4) list;
            int i10 = this.f129571b & 7;
            if (i10 == 1) {
                do {
                    i4Var.i(this.f129570a.N());
                    if (this.f129570a.R()) {
                        return;
                    } else {
                        iS2 = this.f129570a.s();
                    }
                } while (iS2 == this.f129571b);
                this.f129573d = iS2;
                return;
            }
            if (i10 != 2) {
                throw v3.e();
            }
            int iK = this.f129570a.K();
            k(iK);
            int iS3 = this.f129570a.S() + iK;
            do {
                i4Var.i(this.f129570a.N());
            } while (this.f129570a.S() < iS3);
            return;
        }
        int i11 = this.f129571b & 7;
        if (i11 == 1) {
            do {
                list.add(Long.valueOf(this.f129570a.N()));
                if (this.f129570a.R()) {
                    return;
                } else {
                    iS = this.f129570a.s();
                }
            } while (iS == this.f129571b);
            this.f129573d = iS;
            return;
        }
        if (i11 == 2) {
            int iK2 = this.f129570a.K();
            k(iK2);
            int iS4 = this.f129570a.S() + iK2;
            do {
                list.add(Long.valueOf(this.f129570a.N()));
            } while (this.f129570a.S() < iS4);
            return;
        }
        throw v3.e();
    }

    @Override // com.google.vr.sdk.deps.j5
    public final k2 n() throws IOException {
        f(2);
        return this.f129570a.J();
    }
}
