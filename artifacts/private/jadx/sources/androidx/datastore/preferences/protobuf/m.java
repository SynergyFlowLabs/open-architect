package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@y
abstract class m implements o3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f50452c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f50453d = 7;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50454a;

        static {
            int[] iArr = new int[a5.b.values().length];
            f50454a = iArr;
            try {
                iArr[a5.b.f49974j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50454a[a5.b.f49978n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50454a[a5.b.f49967c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50454a[a5.b.f49980s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50454a[a5.b.f49973i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50454a[a5.b.f49972h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50454a[a5.b.f49968d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50454a[a5.b.f49971g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f50454a[a5.b.f49969e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f50454a[a5.b.f49977m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f50454a[a5.b.f49981t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f50454a[a5.b.f49982v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f50454a[a5.b.f49983w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f50454a[a5.b.X.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f50454a[a5.b.f49975k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f50454a[a5.b.f49979o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f50454a[a5.b.f49970f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private static final class b extends m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f50455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final byte[] f50456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f50457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f50458h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f50459i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f50460j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f50461k;

        public b(ByteBuffer bytebuf, boolean bufferIsImmutable) {
            super(null);
            this.f50455e = bufferIsImmutable;
            this.f50456f = bytebuf.array();
            int iArrayOffset = bytebuf.arrayOffset() + bytebuf.position();
            this.f50457g = iArrayOffset;
            this.f50458h = iArrayOffset;
            this.f50459i = bytebuf.arrayOffset() + bytebuf.limit();
        }

        private boolean X() {
            return this.f50457g == this.f50459i;
        }

        private byte Y() throws IOException {
            int i10 = this.f50457g;
            if (i10 == this.f50459i) {
                throw t1.n();
            }
            byte[] bArr = this.f50456f;
            this.f50457g = i10 + 1;
            return bArr[i10];
        }

        private Object Z(a5.b fieldType, Class<?> messageType, v0 extensionRegistry) throws IOException {
            switch (a.f50454a[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(w());
                case 2:
                    return g();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(d());
                case 5:
                    return Integer.valueOf(F());
                case 6:
                    return Long.valueOf(u());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(B());
                case 9:
                    return Long.valueOf(t());
                case 10:
                    return L(messageType, extensionRegistry);
                case 11:
                    return Integer.valueOf(I());
                case 12:
                    return Long.valueOf(b());
                case 13:
                    return Integer.valueOf(e());
                case 14:
                    return Long.valueOf(G());
                case 15:
                    return J();
                case 16:
                    return Integer.valueOf(c());
                case 17:
                    return Long.valueOf(i());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T a0(r3<T> schema, v0 extensionRegistry) throws IOException {
            T tG = schema.g();
            T(tG, schema, extensionRegistry);
            schema.e(tG);
            return tG;
        }

        private int b0() throws IOException {
            l0(4);
            return c0();
        }

        private int c0() {
            int i10 = this.f50457g;
            byte[] bArr = this.f50456f;
            this.f50457g = i10 + 4;
            return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24);
        }

        private long d0() throws IOException {
            l0(8);
            return e0();
        }

        private long e0() {
            int i10 = this.f50457g;
            byte[] bArr = this.f50456f;
            this.f50457g = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        private <T> T f0(r3<T> schema, v0 extensionRegistry) throws IOException {
            T tG = schema.g();
            O(tG, schema, extensionRegistry);
            schema.e(tG);
            return tG;
        }

        private int i0() throws IOException {
            int i10;
            int i11 = this.f50457g;
            int i12 = this.f50459i;
            if (i12 == i11) {
                throw t1.n();
            }
            byte[] bArr = this.f50456f;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f50457g = i13;
                return b10;
            }
            if (i12 - i13 < 9) {
                return (int) k0();
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
                                                throw t1.g();
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
            this.f50457g = i14;
            return i10;
        }

        private long k0() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bY = Y();
                j10 |= ((long) (bY & 127)) << i10;
                if ((bY & 128) == 0) {
                    return j10;
                }
            }
            throw t1.g();
        }

        private void l0(int size) throws IOException {
            if (size < 0 || size > this.f50459i - this.f50457g) {
                throw t1.n();
            }
        }

        private void m0(int expectedPosition) throws IOException {
            if (this.f50457g != expectedPosition) {
                throw t1.n();
            }
        }

        private void n0(int requiredWireType) throws IOException {
            if (a5.b(this.f50460j) != requiredWireType) {
                throw t1.f();
            }
        }

        private void o0(final int size) throws IOException {
            l0(size);
            this.f50457g += size;
        }

        private void p0() throws IOException {
            int i10 = this.f50461k;
            this.f50461k = a5.c(a5.a(this.f50460j), 4);
            while (m() != Integer.MAX_VALUE && q()) {
            }
            if (this.f50460j != this.f50461k) {
                throw t1.i();
            }
            this.f50461k = i10;
        }

        private void q0() throws IOException {
            int i10 = this.f50459i;
            int i11 = this.f50457g;
            if (i10 - i11 >= 10) {
                byte[] bArr = this.f50456f;
                int i12 = 0;
                while (i12 < 10) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        this.f50457g = i13;
                        return;
                    } else {
                        i12++;
                        i11 = i13;
                    }
                }
            }
            r0();
        }

        private void r0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (Y() >= 0) {
                    return;
                }
            }
            throw t1.g();
        }

        private void s0(int bytes) throws IOException {
            l0(bytes);
            if ((bytes & 3) != 0) {
                throw t1.i();
            }
        }

        private void t0(int bytes) throws IOException {
            l0(bytes);
            if ((bytes & 7) != 0) {
                throw t1.i();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void A(List<String> target) throws IOException {
            h0(target, true);
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public int B() throws IOException {
            n0(0);
            return i0();
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void C(List<Long> target) throws IOException {
            int i10;
            int i11;
            if (!(target instanceof h2)) {
                int iB = a5.b(this.f50460j);
                if (iB == 1) {
                    do {
                        target.add(Long.valueOf(u()));
                        if (X()) {
                            return;
                        } else {
                            i10 = this.f50457g;
                        }
                    } while (i0() == this.f50460j);
                    this.f50457g = i10;
                    return;
                }
                if (iB != 2) {
                    throw t1.f();
                }
                int iI0 = i0();
                t0(iI0);
                int i12 = this.f50457g + iI0;
                while (this.f50457g < i12) {
                    target.add(Long.valueOf(e0()));
                }
                return;
            }
            h2 h2Var = (h2) target;
            int iB2 = a5.b(this.f50460j);
            if (iB2 == 1) {
                do {
                    h2Var.M0(u());
                    if (X()) {
                        return;
                    } else {
                        i11 = this.f50457g;
                    }
                } while (i0() == this.f50460j);
                this.f50457g = i11;
                return;
            }
            if (iB2 != 2) {
                throw t1.f();
            }
            int iI1 = i0();
            t0(iI1);
            int i13 = this.f50457g + iI1;
            while (this.f50457g < i13) {
                h2Var.M0(e0());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void D(List<Integer> target) throws IOException {
            int i10;
            int i11;
            if (!(target instanceof r1)) {
                int iB = a5.b(this.f50460j);
                if (iB != 0) {
                    if (iB != 2) {
                        throw t1.f();
                    }
                    int iI0 = this.f50457g + i0();
                    while (this.f50457g < iI0) {
                        target.add(Integer.valueOf(i0()));
                    }
                    return;
                }
                do {
                    target.add(Integer.valueOf(c()));
                    if (X()) {
                        return;
                    } else {
                        i10 = this.f50457g;
                    }
                } while (i0() == this.f50460j);
                this.f50457g = i10;
                return;
            }
            r1 r1Var = (r1) target;
            int iB2 = a5.b(this.f50460j);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw t1.f();
                }
                int iI1 = this.f50457g + i0();
                while (this.f50457g < iI1) {
                    r1Var.w1(i0());
                }
                return;
            }
            do {
                r1Var.w1(c());
                if (X()) {
                    return;
                } else {
                    i11 = this.f50457g;
                }
            } while (i0() == this.f50460j);
            this.f50457g = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public int E() {
            return this.f50460j;
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public int F() throws IOException {
            n0(5);
            return b0();
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public long G() throws IOException {
            n0(0);
            return z.d(j0());
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public String H() throws IOException {
            return g0(false);
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public int I() throws IOException {
            n0(5);
            return b0();
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public String J() throws IOException {
            return g0(true);
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        @Deprecated
        public <T> T K(r3<T> r3Var, v0 v0Var) throws IOException {
            n0(3);
            return (T) a0(r3Var, v0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public <T> T L(Class<T> cls, v0 v0Var) throws IOException {
            n0(2);
            return (T) f0(k3.a().i(cls), v0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        @Deprecated
        public <T> void M(List<T> target, Class<T> targetType, v0 extensionRegistry) throws IOException {
            U(target, k3.a().i(targetType), extensionRegistry);
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public <T> T N(r3<T> r3Var, v0 v0Var) throws IOException {
            n0(2);
            return (T) f0(r3Var, v0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public <T> void O(T target, r3<T> schema, v0 extensionRegistry) throws IOException {
            int iI0 = i0();
            l0(iI0);
            int i10 = this.f50459i;
            int i11 = this.f50457g + iI0;
            this.f50459i = i11;
            try {
                schema.i(target, this, extensionRegistry);
                if (this.f50457g != i11) {
                    throw t1.i();
                }
                this.f50459i = i10;
            } catch (Throwable th2) {
                this.f50459i = i10;
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.o3
        public <T> void P(List<T> target, r3<T> schema, v0 extensionRegistry) throws IOException {
            int i10;
            if (a5.b(this.f50460j) != 2) {
                throw t1.f();
            }
            int i11 = this.f50460j;
            do {
                target.add(f0(schema, extensionRegistry));
                if (X()) {
                    return;
                } else {
                    i10 = this.f50457g;
                }
            } while (i0() == i11);
            this.f50457g = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        @Deprecated
        public <T> T Q(Class<T> cls, v0 v0Var) throws IOException {
            n0(3);
            return (T) a0(k3.a().i(cls), v0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public <T> void R(List<T> target, Class<T> targetType, v0 extensionRegistry) throws IOException {
            P(target, k3.a().i(targetType), extensionRegistry);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.o3
        public <K, V> void S(Map<K, V> target, j2.b<K, V> metadata, v0 extensionRegistry) throws IOException {
            n0(2);
            int iI0 = i0();
            l0(iI0);
            int i10 = this.f50459i;
            this.f50459i = this.f50457g + iI0;
            try {
                Object objZ = metadata.f50396b;
                Object objZ2 = metadata.f50398d;
                while (true) {
                    int iM = m();
                    if (iM == Integer.MAX_VALUE) {
                        target.put(objZ, objZ2);
                        this.f50459i = i10;
                        return;
                    } else if (iM == 1) {
                        objZ = Z(metadata.f50395a, null, null);
                    } else if (iM != 2) {
                        try {
                            if (!q()) {
                                throw new t1("Unable to parse map entry.");
                            }
                        } catch (t1.a unused) {
                            if (!q()) {
                                throw new t1("Unable to parse map entry.");
                            }
                        }
                    } else {
                        objZ2 = Z(metadata.f50397c, metadata.f50398d.getClass(), extensionRegistry);
                    }
                }
            } catch (Throwable th2) {
                this.f50459i = i10;
                throw th2;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public <T> void T(T target, r3<T> schema, v0 extensionRegistry) throws IOException {
            int i10 = this.f50461k;
            this.f50461k = a5.c(a5.a(this.f50460j), 4);
            try {
                schema.i(target, this, extensionRegistry);
                if (this.f50460j != this.f50461k) {
                    throw t1.i();
                }
                this.f50461k = i10;
            } catch (Throwable th2) {
                this.f50461k = i10;
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.o3
        @Deprecated
        public <T> void U(List<T> target, r3<T> schema, v0 extensionRegistry) throws IOException {
            int i10;
            if (a5.b(this.f50460j) != 3) {
                throw t1.f();
            }
            int i11 = this.f50460j;
            do {
                target.add(a0(schema, extensionRegistry));
                if (X()) {
                    return;
                } else {
                    i10 = this.f50457g;
                }
            } while (i0() == i11);
            this.f50457g = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public int V() {
            return this.f50457g - this.f50458h;
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void a(List<Long> target) throws IOException {
            int i10;
            int i11;
            if (!(target instanceof h2)) {
                int iB = a5.b(this.f50460j);
                if (iB != 0) {
                    if (iB != 2) {
                        throw t1.f();
                    }
                    int iI0 = this.f50457g + i0();
                    while (this.f50457g < iI0) {
                        target.add(Long.valueOf(z.d(j0())));
                    }
                    return;
                }
                do {
                    target.add(Long.valueOf(G()));
                    if (X()) {
                        return;
                    } else {
                        i10 = this.f50457g;
                    }
                } while (i0() == this.f50460j);
                this.f50457g = i10;
                return;
            }
            h2 h2Var = (h2) target;
            int iB2 = a5.b(this.f50460j);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw t1.f();
                }
                int iI1 = this.f50457g + i0();
                while (this.f50457g < iI1) {
                    h2Var.M0(z.d(j0()));
                }
                return;
            }
            do {
                h2Var.M0(G());
                if (X()) {
                    return;
                } else {
                    i11 = this.f50457g;
                }
            } while (i0() == this.f50460j);
            this.f50457g = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public long b() throws IOException {
            n0(1);
            return d0();
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public int c() throws IOException {
            n0(0);
            return i0();
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public int d() throws IOException {
            n0(0);
            return i0();
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public int e() throws IOException {
            n0(0);
            return z.c(i0());
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void f(List<Boolean> target) throws IOException {
            int i10;
            int i11;
            if (!(target instanceof q)) {
                int iB = a5.b(this.f50460j);
                if (iB != 0) {
                    if (iB != 2) {
                        throw t1.f();
                    }
                    int iI0 = this.f50457g + i0();
                    while (this.f50457g < iI0) {
                        target.add(Boolean.valueOf(i0() != 0));
                    }
                    m0(iI0);
                    return;
                }
                do {
                    target.add(Boolean.valueOf(w()));
                    if (X()) {
                        return;
                    } else {
                        i10 = this.f50457g;
                    }
                } while (i0() == this.f50460j);
                this.f50457g = i10;
                return;
            }
            q qVar = (q) target;
            int iB2 = a5.b(this.f50460j);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw t1.f();
                }
                int iI1 = this.f50457g + i0();
                while (this.f50457g < iI1) {
                    qVar.y0(i0() != 0);
                }
                m0(iI1);
                return;
            }
            do {
                qVar.y0(w());
                if (X()) {
                    return;
                } else {
                    i11 = this.f50457g;
                }
            } while (i0() == this.f50460j);
            this.f50457g = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public u g() throws IOException {
            n0(2);
            int iI0 = i0();
            if (iI0 == 0) {
                return u.f50632f;
            }
            l0(iI0);
            u uVarG0 = this.f50455e ? u.G0(this.f50456f, this.f50457g, iI0) : u.B(this.f50456f, this.f50457g, iI0);
            this.f50457g += iI0;
            return uVarG0;
        }

        public String g0(boolean requireUtf8) throws IOException {
            n0(2);
            int iI0 = i0();
            if (iI0 == 0) {
                return "";
            }
            l0(iI0);
            if (requireUtf8) {
                byte[] bArr = this.f50456f;
                int i10 = this.f50457g;
                if (!x4.u(bArr, i10, i10 + iI0)) {
                    throw t1.e();
                }
            }
            String str = new String(this.f50456f, this.f50457g, iI0, s1.f50561b);
            this.f50457g += iI0;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void h(List<Integer> target) throws IOException {
            int i10;
            int i11;
            if (target instanceof r1) {
                r1 r1Var = (r1) target;
                int iB = a5.b(this.f50460j);
                if (iB == 0) {
                    do {
                        r1Var.w1(e());
                        if (!X()) {
                            i11 = this.f50457g;
                        }
                    } while (i0() == this.f50460j);
                    this.f50457g = i11;
                    return;
                }
                if (iB != 2) {
                    throw t1.f();
                }
                int iI0 = this.f50457g + i0();
                while (this.f50457g < iI0) {
                    r1Var.w1(z.c(i0()));
                }
            } else {
                int iB2 = a5.b(this.f50460j);
                if (iB2 == 0) {
                    do {
                        target.add(Integer.valueOf(e()));
                        if (!X()) {
                            i10 = this.f50457g;
                        }
                    } while (i0() == this.f50460j);
                    this.f50457g = i10;
                    return;
                }
                if (iB2 != 2) {
                    throw t1.f();
                }
                int iI1 = this.f50457g + i0();
                while (this.f50457g < iI1) {
                    target.add(Integer.valueOf(z.c(i0())));
                }
            }
        }

        public void h0(List<String> target, boolean requireUtf8) throws IOException {
            int i10;
            int i11;
            if (a5.b(this.f50460j) != 2) {
                throw t1.f();
            }
            if (!(target instanceof b2) || requireUtf8) {
                do {
                    target.add(g0(requireUtf8));
                    if (X()) {
                        return;
                    } else {
                        i10 = this.f50457g;
                    }
                } while (i0() == this.f50460j);
                this.f50457g = i10;
                return;
            }
            b2 b2Var = (b2) target;
            do {
                b2Var.O2(g());
                if (X()) {
                    return;
                } else {
                    i11 = this.f50457g;
                }
            } while (i0() == this.f50460j);
            this.f50457g = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public long i() throws IOException {
            n0(0);
            return j0();
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void j(List<Long> target) throws IOException {
            int i10;
            int i11;
            if (!(target instanceof h2)) {
                int iB = a5.b(this.f50460j);
                if (iB == 1) {
                    do {
                        target.add(Long.valueOf(b()));
                        if (X()) {
                            return;
                        } else {
                            i10 = this.f50457g;
                        }
                    } while (i0() == this.f50460j);
                    this.f50457g = i10;
                    return;
                }
                if (iB != 2) {
                    throw t1.f();
                }
                int iI0 = i0();
                t0(iI0);
                int i12 = this.f50457g + iI0;
                while (this.f50457g < i12) {
                    target.add(Long.valueOf(e0()));
                }
                return;
            }
            h2 h2Var = (h2) target;
            int iB2 = a5.b(this.f50460j);
            if (iB2 == 1) {
                do {
                    h2Var.M0(b());
                    if (X()) {
                        return;
                    } else {
                        i11 = this.f50457g;
                    }
                } while (i0() == this.f50460j);
                this.f50457g = i11;
                return;
            }
            if (iB2 != 2) {
                throw t1.f();
            }
            int iI1 = i0();
            t0(iI1);
            int i13 = this.f50457g + iI1;
            while (this.f50457g < i13) {
                h2Var.M0(e0());
            }
        }

        public long j0() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10 = this.f50457g;
            int i11 = this.f50459i;
            if (i11 == i10) {
                throw t1.n();
            }
            byte[] bArr = this.f50456f;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f50457g = i12;
                return b10;
            }
            if (i11 - i12 < 9) {
                return k0();
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
                                                throw t1.g();
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
            this.f50457g = i13;
            return j10;
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void k(List<Integer> target) throws IOException {
            int i10;
            int i11;
            if (!(target instanceof r1)) {
                int iB = a5.b(this.f50460j);
                if (iB == 0) {
                    do {
                        target.add(Integer.valueOf(B()));
                        if (X()) {
                            return;
                        } else {
                            i10 = this.f50457g;
                        }
                    } while (i0() == this.f50460j);
                    this.f50457g = i10;
                    return;
                }
                if (iB != 2) {
                    throw t1.f();
                }
                int iI0 = this.f50457g + i0();
                while (this.f50457g < iI0) {
                    target.add(Integer.valueOf(i0()));
                }
                m0(iI0);
                return;
            }
            r1 r1Var = (r1) target;
            int iB2 = a5.b(this.f50460j);
            if (iB2 == 0) {
                do {
                    r1Var.w1(B());
                    if (X()) {
                        return;
                    } else {
                        i11 = this.f50457g;
                    }
                } while (i0() == this.f50460j);
                this.f50457g = i11;
                return;
            }
            if (iB2 != 2) {
                throw t1.f();
            }
            int iI1 = this.f50457g + i0();
            while (this.f50457g < iI1) {
                r1Var.w1(i0());
            }
            m0(iI1);
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void l(List<Integer> target) throws IOException {
            int i10;
            int i11;
            if (target instanceof r1) {
                r1 r1Var = (r1) target;
                int iB = a5.b(this.f50460j);
                if (iB != 2) {
                    if (iB != 5) {
                        throw t1.f();
                    }
                    do {
                        r1Var.w1(F());
                        if (!X()) {
                            i11 = this.f50457g;
                        }
                    } while (i0() == this.f50460j);
                    this.f50457g = i11;
                    return;
                }
                int iI0 = i0();
                s0(iI0);
                int i12 = this.f50457g + iI0;
                while (this.f50457g < i12) {
                    r1Var.w1(c0());
                }
            } else {
                int iB2 = a5.b(this.f50460j);
                if (iB2 != 2) {
                    if (iB2 != 5) {
                        throw t1.f();
                    }
                    do {
                        target.add(Integer.valueOf(F()));
                        if (!X()) {
                            i10 = this.f50457g;
                        }
                    } while (i0() == this.f50460j);
                    this.f50457g = i10;
                    return;
                }
                int iI1 = i0();
                s0(iI1);
                int i13 = this.f50457g + iI1;
                while (this.f50457g < i13) {
                    target.add(Integer.valueOf(c0()));
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public int m() throws IOException {
            if (X()) {
                return Integer.MAX_VALUE;
            }
            int iI0 = i0();
            this.f50460j = iI0;
            if (iI0 == this.f50461k) {
                return Integer.MAX_VALUE;
            }
            return a5.a(iI0);
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void n(List<String> target) throws IOException {
            h0(target, false);
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void o(List<Float> target) throws IOException {
            int i10;
            int i11;
            if (target instanceof h1) {
                h1 h1Var = (h1) target;
                int iB = a5.b(this.f50460j);
                if (iB != 2) {
                    if (iB != 5) {
                        throw t1.f();
                    }
                    do {
                        h1Var.b1(readFloat());
                        if (!X()) {
                            i11 = this.f50457g;
                        }
                    } while (i0() == this.f50460j);
                    this.f50457g = i11;
                    return;
                }
                int iI0 = i0();
                s0(iI0);
                int i12 = this.f50457g + iI0;
                while (this.f50457g < i12) {
                    h1Var.b1(Float.intBitsToFloat(c0()));
                }
            } else {
                int iB2 = a5.b(this.f50460j);
                if (iB2 != 2) {
                    if (iB2 != 5) {
                        throw t1.f();
                    }
                    do {
                        target.add(Float.valueOf(readFloat()));
                        if (!X()) {
                            i10 = this.f50457g;
                        }
                    } while (i0() == this.f50460j);
                    this.f50457g = i10;
                    return;
                }
                int iI1 = i0();
                s0(iI1);
                int i13 = this.f50457g + iI1;
                while (this.f50457g < i13) {
                    target.add(Float.valueOf(Float.intBitsToFloat(c0())));
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public boolean q() throws IOException {
            int i10;
            if (X() || (i10 = this.f50460j) == this.f50461k) {
                return false;
            }
            int iB = a5.b(i10);
            if (iB == 0) {
                q0();
                return true;
            }
            if (iB == 1) {
                o0(8);
                return true;
            }
            if (iB == 2) {
                o0(i0());
                return true;
            }
            if (iB == 3) {
                p0();
                return true;
            }
            if (iB != 5) {
                throw t1.f();
            }
            o0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void r(List<u> target) throws IOException {
            int i10;
            if (a5.b(this.f50460j) != 2) {
                throw t1.f();
            }
            do {
                target.add(g());
                if (X()) {
                    return;
                } else {
                    i10 = this.f50457g;
                }
            } while (i0() == this.f50460j);
            this.f50457g = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public double readDouble() throws IOException {
            n0(1);
            return Double.longBitsToDouble(d0());
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public float readFloat() throws IOException {
            n0(5);
            return Float.intBitsToFloat(b0());
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void s(List<Double> target) throws IOException {
            int i10;
            int i11;
            if (target instanceof f0) {
                f0 f0Var = (f0) target;
                int iB = a5.b(this.f50460j);
                if (iB == 1) {
                    do {
                        f0Var.R0(readDouble());
                        if (!X()) {
                            i11 = this.f50457g;
                        }
                    } while (i0() == this.f50460j);
                    this.f50457g = i11;
                    return;
                }
                if (iB != 2) {
                    throw t1.f();
                }
                int iI0 = i0();
                t0(iI0);
                int i12 = this.f50457g + iI0;
                while (this.f50457g < i12) {
                    f0Var.R0(Double.longBitsToDouble(e0()));
                }
            } else {
                int iB2 = a5.b(this.f50460j);
                if (iB2 == 1) {
                    do {
                        target.add(Double.valueOf(readDouble()));
                        if (!X()) {
                            i10 = this.f50457g;
                        }
                    } while (i0() == this.f50460j);
                    this.f50457g = i10;
                    return;
                }
                if (iB2 != 2) {
                    throw t1.f();
                }
                int iI1 = i0();
                t0(iI1);
                int i13 = this.f50457g + iI1;
                while (this.f50457g < i13) {
                    target.add(Double.valueOf(Double.longBitsToDouble(e0())));
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public long t() throws IOException {
            n0(0);
            return j0();
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public long u() throws IOException {
            n0(1);
            return d0();
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void v(List<Integer> target) throws IOException {
            int i10;
            int i11;
            if (target instanceof r1) {
                r1 r1Var = (r1) target;
                int iB = a5.b(this.f50460j);
                if (iB != 2) {
                    if (iB != 5) {
                        throw t1.f();
                    }
                    do {
                        r1Var.w1(I());
                        if (!X()) {
                            i11 = this.f50457g;
                        }
                    } while (i0() == this.f50460j);
                    this.f50457g = i11;
                    return;
                }
                int iI0 = i0();
                s0(iI0);
                int i12 = this.f50457g + iI0;
                while (this.f50457g < i12) {
                    r1Var.w1(c0());
                }
            } else {
                int iB2 = a5.b(this.f50460j);
                if (iB2 != 2) {
                    if (iB2 != 5) {
                        throw t1.f();
                    }
                    do {
                        target.add(Integer.valueOf(I()));
                        if (!X()) {
                            i10 = this.f50457g;
                        }
                    } while (i0() == this.f50460j);
                    this.f50457g = i10;
                    return;
                }
                int iI1 = i0();
                s0(iI1);
                int i13 = this.f50457g + iI1;
                while (this.f50457g < i13) {
                    target.add(Integer.valueOf(c0()));
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public boolean w() throws IOException {
            n0(0);
            return i0() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void x(List<Long> target) throws IOException {
            int i10;
            int i11;
            if (!(target instanceof h2)) {
                int iB = a5.b(this.f50460j);
                if (iB == 0) {
                    do {
                        target.add(Long.valueOf(i()));
                        if (!X()) {
                            i10 = this.f50457g;
                        }
                    } while (i0() == this.f50460j);
                    this.f50457g = i10;
                    return;
                }
                if (iB != 2) {
                    throw t1.f();
                }
                int iI0 = this.f50457g + i0();
                while (this.f50457g < iI0) {
                    target.add(Long.valueOf(j0()));
                }
                m0(iI0);
                return;
            }
            h2 h2Var = (h2) target;
            int iB2 = a5.b(this.f50460j);
            if (iB2 == 0) {
                do {
                    h2Var.M0(i());
                    if (!X()) {
                        i11 = this.f50457g;
                    }
                } while (i0() == this.f50460j);
                this.f50457g = i11;
                return;
            }
            if (iB2 != 2) {
                throw t1.f();
            }
            int iI1 = this.f50457g + i0();
            while (this.f50457g < iI1) {
                h2Var.M0(j0());
            }
            m0(iI1);
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void y(List<Long> target) throws IOException {
            int i10;
            int i11;
            if (!(target instanceof h2)) {
                int iB = a5.b(this.f50460j);
                if (iB == 0) {
                    do {
                        target.add(Long.valueOf(t()));
                        if (X()) {
                            return;
                        } else {
                            i10 = this.f50457g;
                        }
                    } while (i0() == this.f50460j);
                    this.f50457g = i10;
                    return;
                }
                if (iB != 2) {
                    throw t1.f();
                }
                int iI0 = this.f50457g + i0();
                while (this.f50457g < iI0) {
                    target.add(Long.valueOf(j0()));
                }
                m0(iI0);
                return;
            }
            h2 h2Var = (h2) target;
            int iB2 = a5.b(this.f50460j);
            if (iB2 == 0) {
                do {
                    h2Var.M0(t());
                    if (X()) {
                        return;
                    } else {
                        i11 = this.f50457g;
                    }
                } while (i0() == this.f50460j);
                this.f50457g = i11;
                return;
            }
            if (iB2 != 2) {
                throw t1.f();
            }
            int iI1 = this.f50457g + i0();
            while (this.f50457g < iI1) {
                h2Var.M0(j0());
            }
            m0(iI1);
        }

        @Override // androidx.datastore.preferences.protobuf.o3
        public void z(List<Integer> target) throws IOException {
            int i10;
            int i11;
            if (!(target instanceof r1)) {
                int iB = a5.b(this.f50460j);
                if (iB != 0) {
                    if (iB != 2) {
                        throw t1.f();
                    }
                    int iI0 = this.f50457g + i0();
                    while (this.f50457g < iI0) {
                        target.add(Integer.valueOf(i0()));
                    }
                    return;
                }
                do {
                    target.add(Integer.valueOf(d()));
                    if (X()) {
                        return;
                    } else {
                        i10 = this.f50457g;
                    }
                } while (i0() == this.f50460j);
                this.f50457g = i10;
                return;
            }
            r1 r1Var = (r1) target;
            int iB2 = a5.b(this.f50460j);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw t1.f();
                }
                int iI1 = this.f50457g + i0();
                while (this.f50457g < iI1) {
                    r1Var.w1(i0());
                }
                return;
            }
            do {
                r1Var.w1(d());
                if (X()) {
                    return;
                } else {
                    i11 = this.f50457g;
                }
            } while (i0() == this.f50460j);
            this.f50457g = i11;
        }
    }

    /* synthetic */ m(a aVar) {
        this();
    }

    public static m W(ByteBuffer buffer, boolean bufferIsImmutable) {
        if (buffer.hasArray()) {
            return new b(buffer, bufferIsImmutable);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    public abstract int V();

    @Override // androidx.datastore.preferences.protobuf.o3
    public boolean p() {
        return false;
    }

    private m() {
    }
}
