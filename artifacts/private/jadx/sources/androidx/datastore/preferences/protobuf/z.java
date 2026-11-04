package androidx.datastore.preferences.protobuf;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f50786f = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f50787g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile int f50788h = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f50789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f50790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f50791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    a0 f50792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f50793e;

    private static final class b extends z {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final byte[] f50794i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f50795j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f50796k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f50797l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f50798m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f50799n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f50800o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f50801p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f50802q;

        private void n0() {
            int i10 = this.f50796k + this.f50797l;
            this.f50796k = i10;
            int i11 = i10 - this.f50799n;
            int i12 = this.f50802q;
            if (i11 <= i12) {
                this.f50797l = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f50797l = i13;
            this.f50796k = i10 - i13;
        }

        private void o0() throws IOException {
            if (this.f50796k - this.f50798m >= 10) {
                p0();
            } else {
                q0();
            }
        }

        private void p0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f50794i;
                int i11 = this.f50798m;
                this.f50798m = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw t1.g();
        }

        private void q0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw t1.g();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int A() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int B() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long C() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public float D() throws IOException {
            return Float.intBitsToFloat(M());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends q2> T E(final int fieldNumber, final h3<T> parser, final v0 extensionRegistry) throws IOException {
            b();
            this.f50789a++;
            T tR = parser.r(this, extensionRegistry);
            a(a5.c(fieldNumber, 4));
            this.f50789a--;
            return tR;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void F(final int fieldNumber, final q2.a builder, final v0 extensionRegistry) throws IOException {
            b();
            this.f50789a++;
            builder.g3(this, extensionRegistry);
            a(a5.c(fieldNumber, 4));
            this.f50789a--;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int G() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long H() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends q2> T I(final h3<T> parser, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f50789a++;
            T tR = parser.r(this, extensionRegistry);
            int i10 = 2 & 0;
            a(0);
            this.f50789a--;
            if (g() != 0) {
                throw t1.n();
            }
            t(iU);
            return tR;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void J(final q2.a builder, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f50789a++;
            builder.g3(this, extensionRegistry);
            a(0);
            this.f50789a--;
            if (g() != 0) {
                throw t1.n();
            }
            t(iU);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte K() throws IOException {
            int i10 = this.f50798m;
            if (i10 == this.f50796k) {
                throw t1.n();
            }
            byte[] bArr = this.f50794i;
            this.f50798m = i10 + 1;
            return bArr[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] L(final int length) throws IOException {
            if (length > 0) {
                int i10 = this.f50796k;
                int i11 = this.f50798m;
                if (length <= i10 - i11) {
                    int i12 = length + i11;
                    this.f50798m = i12;
                    return Arrays.copyOfRange(this.f50794i, i11, i12);
                }
            }
            if (length > 0) {
                throw t1.n();
            }
            if (length == 0) {
                return s1.f50564e;
            }
            throw t1.h();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int M() throws IOException {
            int i10 = this.f50798m;
            if (this.f50796k - i10 < 4) {
                throw t1.n();
            }
            byte[] bArr = this.f50794i;
            this.f50798m = i10 + 4;
            return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long N() throws IOException {
            int i10 = this.f50798m;
            if (this.f50796k - i10 < 8) {
                throw t1.n();
            }
            byte[] bArr = this.f50794i;
            this.f50798m = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int O() throws IOException {
            int i10;
            int i11 = this.f50798m;
            int i12 = this.f50796k;
            if (i12 != i11) {
                byte[] bArr = this.f50794i;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f50798m = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
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
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
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
                    this.f50798m = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long R() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10 = this.f50798m;
            int i11 = this.f50796k;
            if (i11 != i10) {
                byte[] bArr = this.f50794i;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f50798m = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
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
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
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
                    this.f50798m = i13;
                    return j10;
                }
            }
            return S();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        long S() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw t1.g();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int T() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long U() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int V() throws IOException {
            return z.c(O());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long W() throws IOException {
            return z.d(R());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String X() throws IOException {
            int iO = O();
            if (iO > 0) {
                int i10 = this.f50796k;
                int i11 = this.f50798m;
                if (iO <= i10 - i11) {
                    String str = new String(this.f50794i, i11, iO, s1.f50561b);
                    this.f50798m += iO;
                    return str;
                }
            }
            if (iO == 0) {
                return "";
            }
            if (iO < 0) {
                throw t1.h();
            }
            throw t1.n();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String Y() throws IOException {
            int iO = O();
            if (iO > 0) {
                int i10 = this.f50796k;
                int i11 = this.f50798m;
                if (iO <= i10 - i11) {
                    String strH = x4.h(this.f50794i, i11, iO);
                    this.f50798m += iO;
                    return strH;
                }
            }
            if (iO == 0) {
                return "";
            }
            if (iO <= 0) {
                throw t1.h();
            }
            throw t1.n();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int Z() throws IOException {
            if (j()) {
                int i10 = 1 << 0;
                this.f50800o = 0;
                return 0;
            }
            int iO = O();
            this.f50800o = iO;
            if (a5.a(iO) != 0) {
                return this.f50800o;
            }
            throw t1.d();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void a(final int value) throws t1 {
            if (this.f50800o != value) {
                throw t1.c();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int a0() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long b0() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        @Deprecated
        public void c0(final int fieldNumber, final q2.a builder) throws IOException {
            F(fieldNumber, builder, v0.d());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void d0() {
            this.f50799n = this.f50798m;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void f(boolean enabled) {
            this.f50801p = enabled;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int g() {
            int i10 = this.f50802q;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - i();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int h() {
            return this.f50800o;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean h0(final int tag) throws IOException {
            int iB = a5.b(tag);
            if (iB == 0) {
                o0();
                return true;
            }
            if (iB == 1) {
                l0(8);
                return true;
            }
            if (iB == 2) {
                l0(O());
                return true;
            }
            if (iB == 3) {
                j0();
                a(a5.c(a5.a(tag), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw t1.f();
            }
            l0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int i() {
            return this.f50798m - this.f50799n;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean i0(final int tag, final b0 output) throws IOException {
            int iB = a5.b(tag);
            if (iB == 0) {
                long jH = H();
                output.h2(tag);
                output.i2(jH);
                return true;
            }
            if (iB == 1) {
                long jN = N();
                output.h2(tag);
                output.D1(jN);
                return true;
            }
            if (iB == 2) {
                u uVarY = y();
                output.h2(tag);
                output.z1(uVarY);
                return true;
            }
            if (iB == 3) {
                output.h2(tag);
                k0(output);
                int iC = a5.c(a5.a(tag), 4);
                a(iC);
                output.h2(iC);
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw t1.f();
            }
            int iM = M();
            output.h2(tag);
            output.C1(iM);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean j() throws IOException {
            return this.f50798m == this.f50796k;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void l0(final int length) throws IOException {
            if (length >= 0) {
                int i10 = this.f50796k;
                int i11 = this.f50798m;
                if (length <= i10 - i11) {
                    this.f50798m = i11 + length;
                    return;
                }
            }
            if (length >= 0) {
                throw t1.n();
            }
            throw t1.h();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void t(final int oldLimit) {
            this.f50802q = oldLimit;
            n0();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int u(int byteLimit) throws t1 {
            if (byteLimit < 0) {
                throw t1.h();
            }
            int i10 = byteLimit + i();
            if (i10 < 0) {
                throw t1.i();
            }
            int i11 = this.f50802q;
            if (i10 > i11) {
                throw t1.n();
            }
            this.f50802q = i10;
            n0();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean v() throws IOException {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] w() throws IOException {
            return L(O());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public ByteBuffer x() throws IOException {
            int iO = O();
            if (iO > 0) {
                int i10 = this.f50796k;
                int i11 = this.f50798m;
                if (iO <= i10 - i11) {
                    ByteBuffer byteBufferWrap = (this.f50795j || !this.f50801p) ? ByteBuffer.wrap(Arrays.copyOfRange(this.f50794i, i11, i11 + iO)) : ByteBuffer.wrap(this.f50794i, i11, iO).slice();
                    this.f50798m += iO;
                    return byteBufferWrap;
                }
            }
            if (iO == 0) {
                return s1.f50565f;
            }
            if (iO < 0) {
                throw t1.h();
            }
            throw t1.n();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public u y() throws IOException {
            int iO = O();
            if (iO > 0) {
                int i10 = this.f50796k;
                int i11 = this.f50798m;
                if (iO <= i10 - i11) {
                    u uVarG0 = (this.f50795j && this.f50801p) ? u.G0(this.f50794i, i11, iO) : u.B(this.f50794i, i11, iO);
                    this.f50798m += iO;
                    return uVarG0;
                }
            }
            return iO == 0 ? u.f50632f : u.F0(L(iO));
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public double z() throws IOException {
            return Double.longBitsToDouble(N());
        }

        private b(final byte[] buffer, final int offset, final int len, boolean immutable) {
            super();
            this.f50802q = Integer.MAX_VALUE;
            this.f50794i = buffer;
            this.f50796k = len + offset;
            this.f50798m = offset;
            this.f50799n = offset;
            this.f50795j = immutable;
        }
    }

    private static final class c extends z {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Iterable<ByteBuffer> f50803i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Iterator<ByteBuffer> f50804j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ByteBuffer f50805k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final boolean f50806l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f50807m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f50808n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f50809o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f50810p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f50811q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f50812r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f50813s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f50814t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private long f50815u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private long f50816v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private long f50817w;

        private long n0() {
            return this.f50817w - this.f50814t;
        }

        private void o0() throws t1 {
            if (!this.f50804j.hasNext()) {
                throw t1.n();
            }
            u0();
        }

        private void p0(byte[] bytes, int offset, final int length) throws IOException {
            if (length < 0 || length > r0()) {
                if (length > 0) {
                    throw t1.n();
                }
                if (length != 0) {
                    throw t1.h();
                }
                return;
            }
            int i10 = length;
            while (i10 > 0) {
                if (n0() == 0) {
                    o0();
                }
                int iMin = Math.min(i10, (int) n0());
                long j10 = iMin;
                w4.p(this.f50814t, bytes, (length - i10) + offset, j10);
                i10 -= iMin;
                this.f50814t += j10;
            }
        }

        private void q0() {
            int i10 = this.f50808n + this.f50809o;
            this.f50808n = i10;
            int i11 = i10 - this.f50813s;
            int i12 = this.f50810p;
            if (i11 <= i12) {
                this.f50809o = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f50809o = i13;
            this.f50808n = i10 - i13;
        }

        private int r0() {
            return (int) ((((long) (this.f50808n - this.f50812r)) - this.f50814t) + this.f50815u);
        }

        private void s0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw t1.g();
        }

        private ByteBuffer t0(int begin, int end) throws IOException {
            int iPosition = this.f50805k.position();
            int iLimit = this.f50805k.limit();
            ByteBuffer byteBuffer = this.f50805k;
            try {
                try {
                    byteBuffer.position(begin);
                    byteBuffer.limit(end);
                    ByteBuffer byteBufferSlice = this.f50805k.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw t1.n();
                }
            } catch (Throwable th2) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th2;
            }
        }

        private void u0() {
            ByteBuffer next = this.f50804j.next();
            this.f50805k = next;
            this.f50812r += (int) (this.f50814t - this.f50815u);
            long jPosition = next.position();
            this.f50814t = jPosition;
            this.f50815u = jPosition;
            this.f50817w = this.f50805k.limit();
            long jK = w4.k(this.f50805k);
            this.f50816v = jK;
            this.f50814t += jK;
            this.f50815u += jK;
            this.f50817w += jK;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int A() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int B() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long C() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public float D() throws IOException {
            return Float.intBitsToFloat(M());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends q2> T E(final int fieldNumber, final h3<T> parser, final v0 extensionRegistry) throws IOException {
            b();
            this.f50789a++;
            T tR = parser.r(this, extensionRegistry);
            a(a5.c(fieldNumber, 4));
            this.f50789a--;
            return tR;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void F(final int fieldNumber, final q2.a builder, final v0 extensionRegistry) throws IOException {
            b();
            this.f50789a++;
            builder.g3(this, extensionRegistry);
            a(a5.c(fieldNumber, 4));
            this.f50789a--;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int G() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long H() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends q2> T I(final h3<T> parser, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f50789a++;
            T tR = parser.r(this, extensionRegistry);
            a(0);
            this.f50789a--;
            if (g() != 0) {
                throw t1.n();
            }
            t(iU);
            return tR;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void J(final q2.a builder, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f50789a++;
            builder.g3(this, extensionRegistry);
            a(0);
            this.f50789a--;
            if (g() != 0) {
                throw t1.n();
            }
            t(iU);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte K() throws IOException {
            if (n0() == 0) {
                o0();
            }
            long j10 = this.f50814t;
            this.f50814t = 1 + j10;
            return w4.A(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] L(final int length) throws IOException {
            if (length >= 0) {
                long j10 = length;
                if (j10 <= n0()) {
                    byte[] bArr = new byte[length];
                    w4.p(this.f50814t, bArr, 0L, j10);
                    this.f50814t += j10;
                    return bArr;
                }
            }
            if (length >= 0 && length <= r0()) {
                byte[] bArr2 = new byte[length];
                p0(bArr2, 0, length);
                return bArr2;
            }
            if (length > 0) {
                throw t1.n();
            }
            if (length == 0) {
                return s1.f50564e;
            }
            throw t1.h();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int M() throws IOException {
            if (n0() < 4) {
                return ((K() & 255) << 24) | (K() & 255) | ((K() & 255) << 8) | ((K() & 255) << 16);
            }
            long j10 = this.f50814t;
            this.f50814t = 4 + j10;
            return (w4.A(j10) & 255) | ((w4.A(1 + j10) & 255) << 8) | ((w4.A(2 + j10) & 255) << 16) | ((w4.A(j10 + 3) & 255) << 24);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long N() throws IOException {
            if (n0() < 8) {
                return ((((long) K()) & 255) << 56) | (((long) K()) & 255) | ((((long) K()) & 255) << 8) | ((((long) K()) & 255) << 16) | ((((long) K()) & 255) << 24) | ((((long) K()) & 255) << 32) | ((((long) K()) & 255) << 40) | ((((long) K()) & 255) << 48);
            }
            long j10 = this.f50814t;
            this.f50814t = 8 + j10;
            return (((long) w4.A(j10)) & 255) | ((((long) w4.A(1 + j10)) & 255) << 8) | ((((long) w4.A(2 + j10)) & 255) << 16) | ((((long) w4.A(3 + j10)) & 255) << 24) | ((((long) w4.A(4 + j10)) & 255) << 32) | ((((long) w4.A(5 + j10)) & 255) << 40) | ((((long) w4.A(6 + j10)) & 255) << 48) | ((((long) w4.A(j10 + 7)) & 255) << 56);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int O() throws IOException {
            int i10;
            long j10 = this.f50814t;
            if (this.f50817w != j10) {
                long j11 = j10 + 1;
                byte bA = w4.A(j10);
                if (bA >= 0) {
                    this.f50814t++;
                    return bA;
                }
                if (this.f50817w - this.f50814t >= 10) {
                    long j12 = 2 + j10;
                    int iA = (w4.A(j11) << 7) ^ bA;
                    if (iA < 0) {
                        i10 = iA ^ (-128);
                    } else {
                        long j13 = 3 + j10;
                        int iA2 = (w4.A(j12) << com.google.common.base.c.f116463p) ^ iA;
                        if (iA2 >= 0) {
                            i10 = iA2 ^ 16256;
                        } else {
                            long j14 = 4 + j10;
                            int iA3 = iA2 ^ (w4.A(j13) << com.google.common.base.c.f116472y);
                            if (iA3 < 0) {
                                i10 = (-2080896) ^ iA3;
                            } else {
                                j13 = 5 + j10;
                                byte bA2 = w4.A(j14);
                                int i11 = (iA3 ^ (bA2 << com.google.common.base.c.F)) ^ 266354560;
                                if (bA2 < 0) {
                                    j14 = 6 + j10;
                                    if (w4.A(j13) < 0) {
                                        j13 = 7 + j10;
                                        if (w4.A(j14) < 0) {
                                            j14 = 8 + j10;
                                            if (w4.A(j13) < 0) {
                                                j13 = 9 + j10;
                                                if (w4.A(j14) < 0) {
                                                    long j15 = j10 + 10;
                                                    if (w4.A(j13) >= 0) {
                                                        i10 = i11;
                                                        j12 = j15;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i11;
                                }
                                i10 = i11;
                            }
                            j12 = j14;
                        }
                        j12 = j13;
                    }
                    this.f50814t = j12;
                    return i10;
                }
            }
            return (int) S();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long R() throws IOException {
            long j10;
            long j11;
            long j12;
            long j13 = this.f50814t;
            if (this.f50817w != j13) {
                long j14 = j13 + 1;
                byte bA = w4.A(j13);
                if (bA >= 0) {
                    this.f50814t++;
                    return bA;
                }
                if (this.f50817w - this.f50814t >= 10) {
                    long j15 = 2 + j13;
                    int iA = (w4.A(j14) << 7) ^ bA;
                    if (iA < 0) {
                        j10 = iA ^ (-128);
                    } else {
                        long j16 = 3 + j13;
                        int iA2 = (w4.A(j15) << com.google.common.base.c.f116463p) ^ iA;
                        if (iA2 >= 0) {
                            j10 = iA2 ^ 16256;
                            j15 = j16;
                        } else {
                            long j17 = 4 + j13;
                            int iA3 = iA2 ^ (w4.A(j16) << com.google.common.base.c.f116472y);
                            if (iA3 < 0) {
                                j10 = (-2080896) ^ iA3;
                                j15 = j17;
                            } else {
                                long j18 = 5 + j13;
                                long jA = (((long) w4.A(j17)) << 28) ^ ((long) iA3);
                                if (jA >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j19 = 6 + j13;
                                    long jA2 = jA ^ (((long) w4.A(j18)) << 35);
                                    if (jA2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j18 = 7 + j13;
                                        jA = jA2 ^ (((long) w4.A(j19)) << 42);
                                        if (jA >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j19 = 8 + j13;
                                            jA2 = jA ^ (((long) w4.A(j18)) << 49);
                                            if (jA2 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                j18 = 9 + j13;
                                                long jA3 = (jA2 ^ (((long) w4.A(j19)) << 56)) ^ 71499008037633920L;
                                                if (jA3 < 0) {
                                                    long j20 = j13 + 10;
                                                    if (w4.A(j18) >= 0) {
                                                        j15 = j20;
                                                        j10 = jA3;
                                                    }
                                                } else {
                                                    j10 = jA3;
                                                    j15 = j18;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ jA2;
                                    j15 = j19;
                                }
                                j10 = j12 ^ jA;
                                j15 = j18;
                            }
                        }
                    }
                    this.f50814t = j15;
                    return j10;
                }
            }
            return S();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        long S() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw t1.g();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int T() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long U() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int V() throws IOException {
            return z.c(O());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long W() throws IOException {
            return z.d(R());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String X() throws IOException {
            int iO = O();
            if (iO > 0) {
                long j10 = iO;
                long j11 = this.f50817w;
                long j12 = this.f50814t;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[iO];
                    w4.p(j12, bArr, 0L, j10);
                    String str = new String(bArr, s1.f50561b);
                    this.f50814t += j10;
                    return str;
                }
            }
            if (iO > 0 && iO <= r0()) {
                byte[] bArr2 = new byte[iO];
                p0(bArr2, 0, iO);
                return new String(bArr2, s1.f50561b);
            }
            if (iO == 0) {
                return "";
            }
            if (iO < 0) {
                throw t1.h();
            }
            throw t1.n();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String Y() throws IOException {
            int iO = O();
            if (iO > 0) {
                long j10 = iO;
                long j11 = this.f50817w;
                long j12 = this.f50814t;
                if (j10 <= j11 - j12) {
                    String strG = x4.g(this.f50805k, (int) (j12 - this.f50815u), iO);
                    this.f50814t += j10;
                    return strG;
                }
            }
            if (iO >= 0 && iO <= r0()) {
                byte[] bArr = new byte[iO];
                p0(bArr, 0, iO);
                return x4.h(bArr, 0, iO);
            }
            if (iO == 0) {
                return "";
            }
            if (iO <= 0) {
                throw t1.h();
            }
            throw t1.n();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int Z() throws IOException {
            if (j()) {
                this.f50811q = 0;
                return 0;
            }
            int iO = O();
            this.f50811q = iO;
            if (a5.a(iO) != 0) {
                return this.f50811q;
            }
            throw t1.d();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void a(final int value) throws t1 {
            if (this.f50811q != value) {
                throw t1.c();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int a0() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long b0() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        @Deprecated
        public void c0(final int fieldNumber, final q2.a builder) throws IOException {
            F(fieldNumber, builder, v0.d());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void d0() {
            this.f50813s = (int) ((((long) this.f50812r) + this.f50814t) - this.f50815u);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void f(boolean enabled) {
            this.f50807m = enabled;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int g() {
            int i10 = this.f50810p;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - i();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int h() {
            return this.f50811q;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean h0(final int tag) throws IOException {
            int iB = a5.b(tag);
            if (iB == 0) {
                s0();
                return true;
            }
            if (iB == 1) {
                l0(8);
                return true;
            }
            if (iB == 2) {
                l0(O());
                return true;
            }
            if (iB == 3) {
                j0();
                a(a5.c(a5.a(tag), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw t1.f();
            }
            l0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int i() {
            return (int) ((((long) (this.f50812r - this.f50813s)) + this.f50814t) - this.f50815u);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean i0(final int tag, final b0 output) throws IOException {
            int iB = a5.b(tag);
            if (iB == 0) {
                long jH = H();
                output.h2(tag);
                output.i2(jH);
                return true;
            }
            if (iB == 1) {
                long jN = N();
                output.h2(tag);
                output.D1(jN);
                return true;
            }
            if (iB == 2) {
                u uVarY = y();
                output.h2(tag);
                output.z1(uVarY);
                return true;
            }
            if (iB == 3) {
                output.h2(tag);
                k0(output);
                int iC = a5.c(a5.a(tag), 4);
                a(iC);
                output.h2(iC);
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw t1.f();
            }
            int iM = M();
            output.h2(tag);
            output.C1(iM);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean j() throws IOException {
            return (((long) this.f50812r) + this.f50814t) - this.f50815u == ((long) this.f50808n);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void l0(final int length) throws IOException {
            if (length < 0 || length > (((long) (this.f50808n - this.f50812r)) - this.f50814t) + this.f50815u) {
                if (length >= 0) {
                    throw t1.n();
                }
                throw t1.h();
            }
            while (length > 0) {
                if (n0() == 0) {
                    o0();
                }
                int iMin = Math.min(length, (int) n0());
                length -= iMin;
                this.f50814t += (long) iMin;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void t(final int oldLimit) {
            this.f50810p = oldLimit;
            q0();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int u(int byteLimit) throws t1 {
            if (byteLimit < 0) {
                throw t1.h();
            }
            int i10 = byteLimit + i();
            int i11 = this.f50810p;
            if (i10 > i11) {
                throw t1.n();
            }
            this.f50810p = i10;
            q0();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean v() throws IOException {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] w() throws IOException {
            return L(O());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public ByteBuffer x() throws IOException {
            int iO = O();
            if (iO > 0) {
                long j10 = iO;
                if (j10 <= n0()) {
                    if (this.f50806l || !this.f50807m) {
                        byte[] bArr = new byte[iO];
                        w4.p(this.f50814t, bArr, 0L, j10);
                        this.f50814t += j10;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j11 = this.f50814t + j10;
                    this.f50814t = j11;
                    long j12 = this.f50816v;
                    return t0((int) ((j11 - j12) - j10), (int) (j11 - j12));
                }
            }
            if (iO > 0 && iO <= r0()) {
                byte[] bArr2 = new byte[iO];
                p0(bArr2, 0, iO);
                return ByteBuffer.wrap(bArr2);
            }
            if (iO == 0) {
                return s1.f50565f;
            }
            if (iO < 0) {
                throw t1.h();
            }
            throw t1.n();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public u y() throws IOException {
            int iO = O();
            if (iO > 0) {
                long j10 = iO;
                long j11 = this.f50817w;
                long j12 = this.f50814t;
                if (j10 <= j11 - j12) {
                    if (this.f50806l && this.f50807m) {
                        int i10 = (int) (j12 - this.f50816v);
                        u uVarE0 = u.E0(t0(i10, iO + i10));
                        this.f50814t += j10;
                        return uVarE0;
                    }
                    byte[] bArr = new byte[iO];
                    w4.p(j12, bArr, 0L, j10);
                    this.f50814t += j10;
                    return u.F0(bArr);
                }
            }
            if (iO <= 0 || iO > r0()) {
                if (iO == 0) {
                    return u.f50632f;
                }
                if (iO < 0) {
                    throw t1.h();
                }
                throw t1.n();
            }
            if (!this.f50806l || !this.f50807m) {
                byte[] bArr2 = new byte[iO];
                p0(bArr2, 0, iO);
                return u.F0(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (iO > 0) {
                if (n0() == 0) {
                    o0();
                }
                int iMin = Math.min(iO, (int) n0());
                int i11 = (int) (this.f50814t - this.f50816v);
                arrayList.add(u.E0(t0(i11, i11 + iMin)));
                iO -= iMin;
                this.f50814t += (long) iMin;
            }
            return u.s(arrayList);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public double z() throws IOException {
            return Double.longBitsToDouble(N());
        }

        private c(Iterable<ByteBuffer> inputBufs, int size, boolean immutableFlag) {
            super();
            this.f50810p = Integer.MAX_VALUE;
            this.f50808n = size;
            this.f50803i = inputBufs;
            this.f50804j = inputBufs.iterator();
            this.f50806l = immutableFlag;
            this.f50812r = 0;
            this.f50813s = 0;
            if (size != 0) {
                u0();
                return;
            }
            this.f50805k = s1.f50565f;
            this.f50814t = 0L;
            this.f50815u = 0L;
            this.f50817w = 0L;
            this.f50816v = 0L;
        }
    }

    private static final class d extends z {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final InputStream f50818i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final byte[] f50819j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f50820k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f50821l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f50822m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f50823n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f50824o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f50825p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private a f50826q;

        private interface a {
            void a();
        }

        private class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f50827a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private ByteArrayOutputStream f50828b;

            private b() {
                this.f50827a = d.this.f50822m;
            }

            @Override // androidx.datastore.preferences.protobuf.z.d.a
            public void a() {
                if (this.f50828b == null) {
                    this.f50828b = new ByteArrayOutputStream();
                }
                this.f50828b.write(d.this.f50819j, this.f50827a, d.this.f50822m - this.f50827a);
                this.f50827a = 0;
            }

            ByteBuffer b() {
                ByteArrayOutputStream byteArrayOutputStream = this.f50828b;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(d.this.f50819j, this.f50827a, d.this.f50822m - this.f50827a);
                }
                byteArrayOutputStream.write(d.this.f50819j, this.f50827a, d.this.f50822m);
                return ByteBuffer.wrap(this.f50828b.toByteArray());
            }
        }

        private void A0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f50819j;
                int i11 = this.f50822m;
                this.f50822m = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw t1.g();
        }

        private void B0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw t1.g();
        }

        private boolean C0(int n10) throws IOException {
            int i10 = this.f50822m;
            if (i10 + n10 <= this.f50820k) {
                throw new IllegalStateException("refillBuffer() called when " + n10 + " bytes were already available in buffer");
            }
            int i11 = this.f50791c;
            int i12 = this.f50824o;
            if (n10 > (i11 - i12) - i10 || i12 + i10 + n10 > this.f50825p) {
                return false;
            }
            a aVar = this.f50826q;
            if (aVar != null) {
                aVar.a();
            }
            int i13 = this.f50822m;
            if (i13 > 0) {
                int i14 = this.f50820k;
                if (i14 > i13) {
                    byte[] bArr = this.f50819j;
                    System.arraycopy(bArr, i13, bArr, 0, i14 - i13);
                }
                this.f50824o += i13;
                this.f50820k -= i13;
                this.f50822m = 0;
            }
            InputStream inputStream = this.f50818i;
            byte[] bArr2 = this.f50819j;
            int i15 = this.f50820k;
            int iQ0 = q0(inputStream, bArr2, i15, Math.min(bArr2.length - i15, (this.f50791c - this.f50824o) - i15));
            if (iQ0 == 0 || iQ0 < -1 || iQ0 > this.f50819j.length) {
                throw new IllegalStateException(this.f50818i.getClass() + "#read(byte[]) returned invalid result: " + iQ0 + "\nThe InputStream implementation is buggy.");
            }
            if (iQ0 <= 0) {
                return false;
            }
            this.f50820k += iQ0;
            v0();
            if (this.f50820k >= n10) {
                return true;
            }
            return C0(n10);
        }

        private static int p0(InputStream input) throws IOException {
            try {
                return input.available();
            } catch (t1 e10) {
                e10.k();
                throw e10;
            }
        }

        private static int q0(InputStream input, byte[] data, int offset, int length) throws IOException {
            try {
                return input.read(data, offset, length);
            } catch (t1 e10) {
                e10.k();
                throw e10;
            }
        }

        private u r0(final int size) throws IOException {
            byte[] bArrT0 = t0(size);
            if (bArrT0 != null) {
                return u.A(bArrT0);
            }
            int i10 = this.f50822m;
            int i11 = this.f50820k;
            int length = i11 - i10;
            this.f50824o += i11;
            this.f50822m = 0;
            this.f50820k = 0;
            List<byte[]> listU0 = u0(size - length);
            byte[] bArr = new byte[size];
            System.arraycopy(this.f50819j, i10, bArr, 0, length);
            for (byte[] bArr2 : listU0) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return u.F0(bArr);
        }

        private byte[] s0(final int size, boolean ensureNoLeakedReferences) throws IOException {
            byte[] bArrT0 = t0(size);
            if (bArrT0 != null) {
                return ensureNoLeakedReferences ? (byte[]) bArrT0.clone() : bArrT0;
            }
            int i10 = this.f50822m;
            int i11 = this.f50820k;
            int length = i11 - i10;
            this.f50824o += i11;
            this.f50822m = 0;
            this.f50820k = 0;
            List<byte[]> listU0 = u0(size - length);
            byte[] bArr = new byte[size];
            System.arraycopy(this.f50819j, i10, bArr, 0, length);
            for (byte[] bArr2 : listU0) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] t0(final int size) throws IOException {
            if (size == 0) {
                return s1.f50564e;
            }
            if (size < 0) {
                throw t1.h();
            }
            int i10 = this.f50824o;
            int i11 = this.f50822m;
            int i12 = i10 + i11 + size;
            if (i12 - this.f50791c > 0) {
                throw t1.m();
            }
            int i13 = this.f50825p;
            if (i12 > i13) {
                l0((i13 - i10) - i11);
                throw t1.n();
            }
            int i14 = this.f50820k - i11;
            int i15 = size - i14;
            if (i15 >= 4096 && i15 > p0(this.f50818i)) {
                return null;
            }
            byte[] bArr = new byte[size];
            System.arraycopy(this.f50819j, this.f50822m, bArr, 0, i14);
            this.f50824o += this.f50820k;
            this.f50822m = 0;
            this.f50820k = 0;
            while (i14 < size) {
                int iQ0 = q0(this.f50818i, bArr, i14, size - i14);
                if (iQ0 == -1) {
                    throw t1.n();
                }
                this.f50824o += iQ0;
                i14 += iQ0;
            }
            return bArr;
        }

        private List<byte[]> u0(int sizeLeft) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (sizeLeft > 0) {
                int iMin = Math.min(sizeLeft, 4096);
                byte[] bArr = new byte[iMin];
                int i10 = 0;
                while (i10 < iMin) {
                    int i11 = this.f50818i.read(bArr, i10, iMin - i10);
                    if (i11 == -1) {
                        throw t1.n();
                    }
                    this.f50824o += i11;
                    i10 += i11;
                }
                sizeLeft -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void v0() {
            int i10 = this.f50820k + this.f50821l;
            this.f50820k = i10;
            int i11 = this.f50824o + i10;
            int i12 = this.f50825p;
            if (i11 <= i12) {
                this.f50821l = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f50821l = i13;
            this.f50820k = i10 - i13;
        }

        private void w0(int n10) throws IOException {
            if (C0(n10)) {
                return;
            }
            if (n10 <= (this.f50791c - this.f50824o) - this.f50822m) {
                throw t1.n();
            }
            throw t1.m();
        }

        private static long x0(InputStream input, long length) throws IOException {
            try {
                return input.skip(length);
            } catch (t1 e10) {
                e10.k();
                throw e10;
            }
        }

        private void y0(final int size) throws IOException {
            if (size < 0) {
                throw t1.h();
            }
            int i10 = this.f50824o;
            int i11 = this.f50822m;
            int i12 = i10 + i11 + size;
            int i13 = this.f50825p;
            if (i12 > i13) {
                l0((i13 - i10) - i11);
                throw t1.n();
            }
            int i14 = 0;
            if (this.f50826q == null) {
                this.f50824o = i10 + i11;
                int i15 = this.f50820k - i11;
                this.f50820k = 0;
                this.f50822m = 0;
                i14 = i15;
                while (i14 < size) {
                    try {
                        long j10 = size - i14;
                        long jX0 = x0(this.f50818i, j10);
                        if (jX0 < 0 || jX0 > j10) {
                            throw new IllegalStateException(this.f50818i.getClass() + "#skip returned invalid result: " + jX0 + "\nThe InputStream implementation is buggy.");
                        }
                        if (jX0 == 0) {
                            break;
                        } else {
                            i14 += (int) jX0;
                        }
                    } catch (Throwable th2) {
                        this.f50824o += i14;
                        v0();
                        throw th2;
                    }
                }
                this.f50824o += i14;
                v0();
            }
            if (i14 >= size) {
                return;
            }
            int i16 = this.f50820k;
            int i17 = i16 - this.f50822m;
            this.f50822m = i16;
            w0(1);
            while (true) {
                int i18 = size - i17;
                int i19 = this.f50820k;
                if (i18 <= i19) {
                    this.f50822m = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f50822m = i19;
                    w0(1);
                }
            }
        }

        private void z0() throws IOException {
            if (this.f50820k - this.f50822m >= 10) {
                A0();
            } else {
                B0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int A() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int B() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long C() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public float D() throws IOException {
            return Float.intBitsToFloat(M());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends q2> T E(final int fieldNumber, final h3<T> parser, final v0 extensionRegistry) throws IOException {
            b();
            this.f50789a++;
            T tR = parser.r(this, extensionRegistry);
            a(a5.c(fieldNumber, 4));
            this.f50789a--;
            return tR;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void F(final int fieldNumber, final q2.a builder, final v0 extensionRegistry) throws IOException {
            b();
            this.f50789a++;
            builder.g3(this, extensionRegistry);
            a(a5.c(fieldNumber, 4));
            this.f50789a--;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int G() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long H() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends q2> T I(final h3<T> parser, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f50789a++;
            T tR = parser.r(this, extensionRegistry);
            a(0);
            this.f50789a--;
            if (g() != 0) {
                throw t1.n();
            }
            t(iU);
            return tR;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void J(final q2.a builder, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f50789a++;
            builder.g3(this, extensionRegistry);
            a(0);
            this.f50789a--;
            if (g() != 0) {
                throw t1.n();
            }
            t(iU);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte K() throws IOException {
            if (this.f50822m == this.f50820k) {
                w0(1);
            }
            byte[] bArr = this.f50819j;
            int i10 = this.f50822m;
            this.f50822m = i10 + 1;
            return bArr[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] L(final int size) throws IOException {
            int i10 = this.f50822m;
            if (size > this.f50820k - i10 || size <= 0) {
                return s0(size, false);
            }
            int i11 = size + i10;
            this.f50822m = i11;
            return Arrays.copyOfRange(this.f50819j, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int M() throws IOException {
            int i10 = this.f50822m;
            if (this.f50820k - i10 < 4) {
                w0(4);
                i10 = this.f50822m;
            }
            byte[] bArr = this.f50819j;
            this.f50822m = i10 + 4;
            return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long N() throws IOException {
            int i10 = this.f50822m;
            if (this.f50820k - i10 < 8) {
                w0(8);
                i10 = this.f50822m;
            }
            byte[] bArr = this.f50819j;
            this.f50822m = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int O() throws IOException {
            int i10;
            int i11 = this.f50822m;
            int i12 = this.f50820k;
            if (i12 != i11) {
                byte[] bArr = this.f50819j;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f50822m = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
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
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
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
                    this.f50822m = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long R() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10 = this.f50822m;
            int i11 = this.f50820k;
            if (i11 != i10) {
                byte[] bArr = this.f50819j;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f50822m = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
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
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
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
                    this.f50822m = i13;
                    return j10;
                }
            }
            return S();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        long S() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw t1.g();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int T() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long U() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int V() throws IOException {
            return z.c(O());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long W() throws IOException {
            return z.d(R());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String X() throws IOException {
            int iO = O();
            if (iO > 0) {
                int i10 = this.f50820k;
                int i11 = this.f50822m;
                if (iO <= i10 - i11) {
                    String str = new String(this.f50819j, i11, iO, s1.f50561b);
                    this.f50822m += iO;
                    return str;
                }
            }
            if (iO == 0) {
                return "";
            }
            if (iO < 0) {
                throw t1.h();
            }
            if (iO > this.f50820k) {
                return new String(s0(iO, false), s1.f50561b);
            }
            w0(iO);
            String str2 = new String(this.f50819j, this.f50822m, iO, s1.f50561b);
            this.f50822m += iO;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String Y() throws IOException {
            byte[] bArrS0;
            int iO = O();
            int i10 = this.f50822m;
            int i11 = this.f50820k;
            if (iO <= i11 - i10 && iO > 0) {
                bArrS0 = this.f50819j;
                this.f50822m = i10 + iO;
            } else {
                if (iO == 0) {
                    return "";
                }
                if (iO < 0) {
                    throw t1.h();
                }
                i10 = 0;
                if (iO <= i11) {
                    w0(iO);
                    bArrS0 = this.f50819j;
                    this.f50822m = iO;
                } else {
                    bArrS0 = s0(iO, false);
                }
            }
            return x4.h(bArrS0, i10, iO);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int Z() throws IOException {
            if (j()) {
                this.f50823n = 0;
                return 0;
            }
            int iO = O();
            this.f50823n = iO;
            if (a5.a(iO) != 0) {
                return this.f50823n;
            }
            throw t1.d();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void a(final int value) throws t1 {
            if (this.f50823n != value) {
                throw t1.c();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int a0() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long b0() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        @Deprecated
        public void c0(final int fieldNumber, final q2.a builder) throws IOException {
            F(fieldNumber, builder, v0.d());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void d0() {
            this.f50824o = -this.f50822m;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void f(boolean enabled) {
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int g() {
            int i10 = this.f50825p;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - (this.f50824o + this.f50822m);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int h() {
            return this.f50823n;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean h0(final int tag) throws IOException {
            int iB = a5.b(tag);
            if (iB == 0) {
                z0();
                return true;
            }
            if (iB == 1) {
                l0(8);
                return true;
            }
            if (iB == 2) {
                l0(O());
                return true;
            }
            if (iB == 3) {
                j0();
                a(a5.c(a5.a(tag), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw t1.f();
            }
            l0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int i() {
            return this.f50824o + this.f50822m;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean i0(final int tag, final b0 output) throws IOException {
            int iB = a5.b(tag);
            if (iB == 0) {
                long jH = H();
                output.h2(tag);
                output.i2(jH);
                return true;
            }
            if (iB == 1) {
                long jN = N();
                output.h2(tag);
                output.D1(jN);
                return true;
            }
            if (iB == 2) {
                u uVarY = y();
                output.h2(tag);
                output.z1(uVarY);
                return true;
            }
            if (iB == 3) {
                output.h2(tag);
                k0(output);
                int iC = a5.c(a5.a(tag), 4);
                a(iC);
                output.h2(iC);
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw t1.f();
            }
            int iM = M();
            output.h2(tag);
            output.C1(iM);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean j() throws IOException {
            return this.f50822m == this.f50820k && !C0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void l0(final int size) throws IOException {
            int i10 = this.f50820k;
            int i11 = this.f50822m;
            if (size > i10 - i11 || size < 0) {
                y0(size);
            } else {
                this.f50822m = i11 + size;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void t(final int oldLimit) {
            this.f50825p = oldLimit;
            v0();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int u(int byteLimit) throws t1 {
            if (byteLimit < 0) {
                throw t1.h();
            }
            int i10 = byteLimit + this.f50824o + this.f50822m;
            if (i10 < 0) {
                throw t1.i();
            }
            int i11 = this.f50825p;
            if (i10 > i11) {
                throw t1.n();
            }
            this.f50825p = i10;
            v0();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean v() throws IOException {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] w() throws IOException {
            int iO = O();
            int i10 = this.f50820k;
            int i11 = this.f50822m;
            if (iO > i10 - i11 || iO <= 0) {
                if (iO >= 0) {
                    return s0(iO, false);
                }
                throw t1.h();
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f50819j, i11, i11 + iO);
            this.f50822m += iO;
            return bArrCopyOfRange;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public ByteBuffer x() throws IOException {
            int iO = O();
            int i10 = this.f50820k;
            int i11 = this.f50822m;
            if (iO <= i10 - i11 && iO > 0) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f50819j, i11, i11 + iO));
                this.f50822m += iO;
                return byteBufferWrap;
            }
            if (iO == 0) {
                return s1.f50565f;
            }
            if (iO >= 0) {
                return ByteBuffer.wrap(s0(iO, true));
            }
            throw t1.h();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public u y() throws IOException {
            int iO = O();
            int i10 = this.f50820k;
            int i11 = this.f50822m;
            if (iO <= i10 - i11 && iO > 0) {
                u uVarB = u.B(this.f50819j, i11, iO);
                this.f50822m += iO;
                return uVarB;
            }
            if (iO == 0) {
                return u.f50632f;
            }
            if (iO >= 0) {
                return r0(iO);
            }
            throw t1.h();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public double z() throws IOException {
            return Double.longBitsToDouble(N());
        }

        private d(final InputStream input, int bufferSize) {
            super();
            this.f50825p = Integer.MAX_VALUE;
            this.f50826q = null;
            s1.e(input, MetricTracker.Object.INPUT);
            this.f50818i = input;
            this.f50819j = new byte[bufferSize];
            this.f50820k = 0;
            this.f50822m = 0;
            this.f50824o = 0;
        }
    }

    private static final class e extends z {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ByteBuffer f50830i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f50831j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final long f50832k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f50833l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f50834m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f50835n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f50836o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f50837p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f50838q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f50839r;

        private int n0(long pos) {
            return (int) (pos - this.f50832k);
        }

        static boolean o0() {
            return w4.V();
        }

        private void p0() {
            long j10 = this.f50833l + ((long) this.f50836o);
            this.f50833l = j10;
            int i10 = (int) (j10 - this.f50835n);
            int i11 = this.f50839r;
            if (i10 <= i11) {
                this.f50836o = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f50836o = i12;
            this.f50833l = j10 - ((long) i12);
        }

        private int q0() {
            return (int) (this.f50833l - this.f50834m);
        }

        private void r0() throws IOException {
            if (q0() >= 10) {
                s0();
            } else {
                t0();
            }
        }

        private void s0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                long j10 = this.f50834m;
                this.f50834m = 1 + j10;
                if (w4.A(j10) >= 0) {
                    return;
                }
            }
            throw t1.g();
        }

        private void t0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw t1.g();
        }

        private ByteBuffer u0(long begin, long end) throws IOException {
            int iPosition = this.f50830i.position();
            int iLimit = this.f50830i.limit();
            ByteBuffer byteBuffer = this.f50830i;
            try {
                try {
                    byteBuffer.position(n0(begin));
                    byteBuffer.limit(n0(end));
                    ByteBuffer byteBufferSlice = this.f50830i.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException e10) {
                    t1 t1VarN = t1.n();
                    t1VarN.initCause(e10);
                    throw t1VarN;
                }
            } catch (Throwable th2) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th2;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int A() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int B() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long C() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public float D() throws IOException {
            return Float.intBitsToFloat(M());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends q2> T E(final int fieldNumber, final h3<T> parser, final v0 extensionRegistry) throws IOException {
            b();
            this.f50789a++;
            T tR = parser.r(this, extensionRegistry);
            a(a5.c(fieldNumber, 4));
            this.f50789a--;
            return tR;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void F(final int fieldNumber, final q2.a builder, final v0 extensionRegistry) throws IOException {
            b();
            this.f50789a++;
            builder.g3(this, extensionRegistry);
            a(a5.c(fieldNumber, 4));
            this.f50789a--;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int G() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long H() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends q2> T I(final h3<T> parser, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f50789a++;
            T tR = parser.r(this, extensionRegistry);
            a(0);
            this.f50789a--;
            if (g() != 0) {
                throw t1.n();
            }
            t(iU);
            return tR;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void J(final q2.a builder, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f50789a++;
            builder.g3(this, extensionRegistry);
            a(0);
            this.f50789a--;
            if (g() != 0) {
                throw t1.n();
            }
            t(iU);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte K() throws IOException {
            long j10 = this.f50834m;
            if (j10 == this.f50833l) {
                throw t1.n();
            }
            this.f50834m = 1 + j10;
            return w4.A(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] L(final int length) throws IOException {
            if (length < 0 || length > q0()) {
                if (length > 0) {
                    throw t1.n();
                }
                if (length == 0) {
                    return s1.f50564e;
                }
                throw t1.h();
            }
            byte[] bArr = new byte[length];
            long j10 = this.f50834m;
            long j11 = length;
            u0(j10, j10 + j11).get(bArr);
            this.f50834m += j11;
            return bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int M() throws IOException {
            long j10 = this.f50834m;
            if (this.f50833l - j10 < 4) {
                throw t1.n();
            }
            this.f50834m = 4 + j10;
            return (w4.A(j10) & 255) | ((w4.A(1 + j10) & 255) << 8) | ((w4.A(2 + j10) & 255) << 16) | ((w4.A(j10 + 3) & 255) << 24);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long N() throws IOException {
            long j10 = this.f50834m;
            if (this.f50833l - j10 < 8) {
                throw t1.n();
            }
            this.f50834m = 8 + j10;
            return ((((long) w4.A(j10 + 7)) & 255) << 56) | (((long) w4.A(j10)) & 255) | ((((long) w4.A(1 + j10)) & 255) << 8) | ((((long) w4.A(2 + j10)) & 255) << 16) | ((((long) w4.A(3 + j10)) & 255) << 24) | ((((long) w4.A(4 + j10)) & 255) << 32) | ((((long) w4.A(5 + j10)) & 255) << 40) | ((((long) w4.A(6 + j10)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
        
            if (androidx.datastore.preferences.protobuf.w4.A(r3) < 0) goto L34;
         */
        @Override // androidx.datastore.preferences.protobuf.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int O() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f50834m
                r9 = 6
                long r2 = r10.f50833l
                r9 = 2
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                r9 = 3
                if (r2 != 0) goto Le
                r9 = 1
                goto La4
            Le:
                r9 = 3
                r2 = 1
                long r2 = r2 + r0
                byte r4 = androidx.datastore.preferences.protobuf.w4.A(r0)
                r9 = 1
                if (r4 < 0) goto L1c
                r10.f50834m = r2
                return r4
            L1c:
                long r5 = r10.f50833l
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L27
                goto La4
            L27:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = androidx.datastore.preferences.protobuf.w4.A(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L37
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto Laf
            L37:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = androidx.datastore.preferences.protobuf.w4.A(r5)
                r9 = 2
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L48
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L46:
                r5 = r3
                goto Laf
            L48:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = androidx.datastore.preferences.protobuf.w4.A(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                r9 = 4
                if (r2 >= 0) goto L5b
                r9 = 1
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto Laf
            L5b:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = androidx.datastore.preferences.protobuf.w4.A(r5)
                int r6 = r5 << 28
                r9 = 0
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto Lad
                r5 = 6
                long r5 = r5 + r0
                byte r3 = androidx.datastore.preferences.protobuf.w4.A(r3)
                r9 = 0
                if (r3 >= 0) goto Lab
                r9 = 2
                r3 = 7
                r3 = 7
                r9 = 6
                long r3 = r3 + r0
                byte r5 = androidx.datastore.preferences.protobuf.w4.A(r5)
                r9 = 2
                if (r5 >= 0) goto Lad
                r5 = 8
                r5 = 8
                long r5 = r5 + r0
                byte r3 = androidx.datastore.preferences.protobuf.w4.A(r3)
                r9 = 5
                if (r3 >= 0) goto Lab
                long r3 = r0 + r7
                byte r5 = androidx.datastore.preferences.protobuf.w4.A(r5)
                r9 = 1
                if (r5 >= 0) goto Lad
                r5 = 10
                long r5 = r5 + r0
                r9 = 5
                byte r0 = androidx.datastore.preferences.protobuf.w4.A(r3)
                r9 = 7
                if (r0 >= 0) goto Lab
            La4:
                r9 = 5
                long r0 = r10.S()
                int r10 = (int) r0
                return r10
            Lab:
                r0 = r2
                goto Laf
            Lad:
                r0 = r2
                goto L46
            Laf:
                r10.f50834m = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.e.O():int");
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long R() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10;
            long j13 = this.f50834m;
            if (this.f50833l != j13) {
                long j14 = 1 + j13;
                byte bA = w4.A(j13);
                if (bA >= 0) {
                    this.f50834m = j14;
                    return bA;
                }
                if (this.f50833l - j14 >= 9) {
                    long j15 = 2 + j13;
                    int iA = (w4.A(j14) << 7) ^ bA;
                    if (iA >= 0) {
                        long j16 = 3 + j13;
                        int iA2 = iA ^ (w4.A(j15) << com.google.common.base.c.f116463p);
                        if (iA2 >= 0) {
                            j10 = iA2 ^ 16256;
                            j15 = j16;
                        } else {
                            j15 = 4 + j13;
                            int iA3 = iA2 ^ (w4.A(j16) << com.google.common.base.c.f116472y);
                            if (iA3 < 0) {
                                i10 = (-2080896) ^ iA3;
                            } else {
                                long j17 = 5 + j13;
                                long jA = ((long) iA3) ^ (((long) w4.A(j15)) << 28);
                                if (jA >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j18 = 6 + j13;
                                    long jA2 = jA ^ (((long) w4.A(j17)) << 35);
                                    if (jA2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j17 = 7 + j13;
                                        jA = jA2 ^ (((long) w4.A(j18)) << 42);
                                        if (jA >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j18 = 8 + j13;
                                            jA2 = jA ^ (((long) w4.A(j17)) << 49);
                                            if (jA2 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                long j19 = j13 + 9;
                                                long jA3 = (jA2 ^ (((long) w4.A(j18)) << 56)) ^ 71499008037633920L;
                                                if (jA3 < 0) {
                                                    long j20 = j13 + 10;
                                                    if (w4.A(j19) >= 0) {
                                                        j15 = j20;
                                                        j10 = jA3;
                                                    }
                                                } else {
                                                    j10 = jA3;
                                                    j15 = j19;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ jA2;
                                    j15 = j18;
                                }
                                j10 = j12 ^ jA;
                                j15 = j17;
                            }
                        }
                        this.f50834m = j15;
                        return j10;
                    }
                    i10 = iA ^ (-128);
                    j10 = i10;
                    this.f50834m = j15;
                    return j10;
                }
            }
            return S();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        long S() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw t1.g();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int T() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long U() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int V() throws IOException {
            return z.c(O());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long W() throws IOException {
            return z.d(R());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String X() throws IOException {
            int iO = O();
            if (iO <= 0 || iO > q0()) {
                if (iO == 0) {
                    return "";
                }
                if (iO < 0) {
                    throw t1.h();
                }
                throw t1.n();
            }
            byte[] bArr = new byte[iO];
            long j10 = iO;
            w4.p(this.f50834m, bArr, 0L, j10);
            String str = new String(bArr, s1.f50561b);
            this.f50834m += j10;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String Y() throws IOException {
            int iO = O();
            if (iO > 0 && iO <= q0()) {
                String strG = x4.g(this.f50830i, n0(this.f50834m), iO);
                this.f50834m += (long) iO;
                return strG;
            }
            if (iO == 0) {
                return "";
            }
            if (iO <= 0) {
                throw t1.h();
            }
            throw t1.n();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int Z() throws IOException {
            if (j()) {
                this.f50837p = 0;
                return 0;
            }
            int iO = O();
            this.f50837p = iO;
            if (a5.a(iO) != 0) {
                return this.f50837p;
            }
            throw t1.d();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void a(final int value) throws t1 {
            if (this.f50837p != value) {
                throw t1.c();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int a0() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long b0() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        @Deprecated
        public void c0(final int fieldNumber, final q2.a builder) throws IOException {
            F(fieldNumber, builder, v0.d());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void d0() {
            this.f50835n = this.f50834m;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void f(boolean enabled) {
            this.f50838q = enabled;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int g() {
            int i10 = this.f50839r;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - i();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int h() {
            return this.f50837p;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean h0(final int tag) throws IOException {
            int iB = a5.b(tag);
            if (iB == 0) {
                r0();
                return true;
            }
            if (iB == 1) {
                l0(8);
                return true;
            }
            if (iB == 2) {
                l0(O());
                return true;
            }
            if (iB == 3) {
                j0();
                a(a5.c(a5.a(tag), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw t1.f();
            }
            l0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int i() {
            return (int) (this.f50834m - this.f50835n);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean i0(final int tag, final b0 output) throws IOException {
            int iB = a5.b(tag);
            if (iB == 0) {
                long jH = H();
                output.h2(tag);
                output.i2(jH);
                return true;
            }
            if (iB == 1) {
                long jN = N();
                output.h2(tag);
                output.D1(jN);
                return true;
            }
            if (iB == 2) {
                u uVarY = y();
                output.h2(tag);
                output.z1(uVarY);
                return true;
            }
            if (iB == 3) {
                output.h2(tag);
                k0(output);
                int iC = a5.c(a5.a(tag), 4);
                a(iC);
                output.h2(iC);
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw t1.f();
            }
            int iM = M();
            output.h2(tag);
            output.C1(iM);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean j() throws IOException {
            return this.f50834m == this.f50833l;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void l0(final int length) throws IOException {
            if (length >= 0 && length <= q0()) {
                this.f50834m += (long) length;
            } else {
                if (length >= 0) {
                    throw t1.n();
                }
                throw t1.h();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void t(final int oldLimit) {
            this.f50839r = oldLimit;
            p0();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int u(int byteLimit) throws t1 {
            if (byteLimit < 0) {
                throw t1.h();
            }
            int i10 = byteLimit + i();
            int i11 = this.f50839r;
            if (i10 > i11) {
                throw t1.n();
            }
            this.f50839r = i10;
            p0();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean v() throws IOException {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] w() throws IOException {
            return L(O());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public ByteBuffer x() throws IOException {
            int iO = O();
            if (iO <= 0 || iO > q0()) {
                if (iO == 0) {
                    return s1.f50565f;
                }
                if (iO < 0) {
                    throw t1.h();
                }
                throw t1.n();
            }
            if (this.f50831j || !this.f50838q) {
                byte[] bArr = new byte[iO];
                long j10 = iO;
                w4.p(this.f50834m, bArr, 0L, j10);
                this.f50834m += j10;
                return ByteBuffer.wrap(bArr);
            }
            long j11 = this.f50834m;
            long j12 = iO;
            ByteBuffer byteBufferU0 = u0(j11, j11 + j12);
            this.f50834m += j12;
            return byteBufferU0;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public u y() throws IOException {
            int iO = O();
            if (iO <= 0 || iO > q0()) {
                if (iO == 0) {
                    return u.f50632f;
                }
                if (iO < 0) {
                    throw t1.h();
                }
                throw t1.n();
            }
            if (this.f50831j && this.f50838q) {
                long j10 = this.f50834m;
                long j11 = iO;
                ByteBuffer byteBufferU0 = u0(j10, j10 + j11);
                this.f50834m += j11;
                return u.E0(byteBufferU0);
            }
            byte[] bArr = new byte[iO];
            long j12 = iO;
            w4.p(this.f50834m, bArr, 0L, j12);
            this.f50834m += j12;
            return u.F0(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public double z() throws IOException {
            return Double.longBitsToDouble(N());
        }

        private e(ByteBuffer buffer, boolean immutable) {
            super();
            this.f50839r = Integer.MAX_VALUE;
            this.f50830i = buffer;
            long jK = w4.k(buffer);
            this.f50832k = jK;
            this.f50833l = ((long) buffer.limit()) + jK;
            long jPosition = jK + ((long) buffer.position());
            this.f50834m = jPosition;
            this.f50835n = jPosition;
            this.f50831j = immutable;
        }
    }

    public static int P(final int firstByte, final InputStream input) throws IOException {
        if ((firstByte & 128) == 0) {
            return firstByte;
        }
        int i10 = firstByte & 127;
        int i11 = 7;
        while (i11 < 32) {
            int i12 = input.read();
            if (i12 == -1) {
                throw t1.n();
            }
            i10 |= (i12 & 127) << i11;
            if ((i12 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        while (i11 < 64) {
            int i13 = input.read();
            if (i13 == -1) {
                throw t1.n();
            }
            if ((i13 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        throw t1.g();
    }

    static int Q(final InputStream input) throws IOException {
        int i10 = input.read();
        if (i10 != -1) {
            return P(i10, input);
        }
        throw t1.n();
    }

    public static int c(final int n10) {
        return (-(n10 & 1)) ^ (n10 >>> 1);
    }

    public static long d(final long n10) {
        return (-(n10 & 1)) ^ (n10 >>> 1);
    }

    public static z k(final InputStream input) {
        return l(input, 4096);
    }

    public static z l(final InputStream input, int bufferSize) {
        if (bufferSize > 0) {
            return input == null ? q(s1.f50564e) : new d(input, bufferSize);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static z m(final Iterable<ByteBuffer> input) {
        return !e.o0() ? k(new u1(input)) : n(input, false);
    }

    static z n(final Iterable<ByteBuffer> bufs, final boolean bufferIsImmutable) {
        int i10 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : bufs) {
            iRemaining += byteBuffer.remaining();
            i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
        }
        return i10 == 2 ? new c(bufs, iRemaining, bufferIsImmutable) : k(new u1(bufs));
    }

    public static z o(ByteBuffer buf) {
        return p(buf, false);
    }

    static z p(ByteBuffer buf, boolean bufferIsImmutable) {
        if (buf.hasArray()) {
            return s(buf.array(), buf.arrayOffset() + buf.position(), buf.remaining(), bufferIsImmutable);
        }
        if (buf.isDirect() && e.o0()) {
            return new e(buf, bufferIsImmutable);
        }
        int iRemaining = buf.remaining();
        byte[] bArr = new byte[iRemaining];
        buf.duplicate().get(bArr);
        return s(bArr, 0, iRemaining, true);
    }

    public static z q(final byte[] buf) {
        return r(buf, 0, buf.length);
    }

    public static z r(final byte[] buf, final int off, final int len) {
        return s(buf, off, len, false);
    }

    static z s(final byte[] buf, final int off, final int len, final boolean bufferIsImmutable) {
        b bVar = new b(buf, off, len, bufferIsImmutable);
        try {
            bVar.u(len);
            return bVar;
        } catch (t1 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int A() throws IOException;

    public abstract int B() throws IOException;

    public abstract long C() throws IOException;

    public abstract float D() throws IOException;

    public abstract <T extends q2> T E(final int fieldNumber, final h3<T> parser, final v0 extensionRegistry) throws IOException;

    public abstract void F(final int fieldNumber, final q2.a builder, final v0 extensionRegistry) throws IOException;

    public abstract int G() throws IOException;

    public abstract long H() throws IOException;

    public abstract <T extends q2> T I(final h3<T> parser, final v0 extensionRegistry) throws IOException;

    public abstract void J(final q2.a builder, final v0 extensionRegistry) throws IOException;

    public abstract byte K() throws IOException;

    public abstract byte[] L(final int size) throws IOException;

    public abstract int M() throws IOException;

    public abstract long N() throws IOException;

    public abstract int O() throws IOException;

    public abstract long R() throws IOException;

    abstract long S() throws IOException;

    public abstract int T() throws IOException;

    public abstract long U() throws IOException;

    public abstract int V() throws IOException;

    public abstract long W() throws IOException;

    public abstract String X() throws IOException;

    public abstract String Y() throws IOException;

    public abstract int Z() throws IOException;

    public abstract void a(final int value) throws t1;

    public abstract int a0() throws IOException;

    public void b() throws t1 {
        if (this.f50789a >= this.f50790b) {
            throw t1.j();
        }
    }

    public abstract long b0() throws IOException;

    @Deprecated
    public abstract void c0(final int fieldNumber, final q2.a builder) throws IOException;

    public abstract void d0();

    final void e() {
        this.f50793e = true;
    }

    public final int e0(final int limit) {
        if (limit >= 0) {
            int i10 = this.f50790b;
            this.f50790b = limit;
            return i10;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + limit);
    }

    public abstract void f(boolean enabled);

    public final int f0(final int limit) {
        if (limit >= 0) {
            int i10 = this.f50791c;
            this.f50791c = limit;
            return i10;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + limit);
    }

    public abstract int g();

    final boolean g0() {
        return this.f50793e;
    }

    public abstract int h();

    public abstract boolean h0(final int tag) throws IOException;

    public abstract int i();

    @Deprecated
    public abstract boolean i0(final int tag, final b0 output) throws IOException;

    public abstract boolean j() throws IOException;

    public void j0() throws IOException {
        boolean zH0;
        do {
            int iZ = Z();
            if (iZ == 0) {
                return;
            }
            b();
            this.f50789a++;
            zH0 = h0(iZ);
            this.f50789a--;
        } while (zH0);
    }

    public void k0(b0 output) throws IOException {
        boolean zI0;
        do {
            int iZ = Z();
            if (iZ == 0) {
                return;
            }
            b();
            this.f50789a++;
            zI0 = i0(iZ, output);
            this.f50789a--;
        } while (zI0);
    }

    public abstract void l0(final int size) throws IOException;

    final void m0() {
        this.f50793e = false;
    }

    public abstract void t(final int oldLimit);

    public abstract int u(int byteLimit) throws t1;

    public abstract boolean v() throws IOException;

    public abstract byte[] w() throws IOException;

    public abstract ByteBuffer x() throws IOException;

    public abstract u y() throws IOException;

    public abstract double z() throws IOException;

    private z() {
        this.f50790b = f50788h;
        this.f50791c = Integer.MAX_VALUE;
        this.f50793e = false;
    }
}
