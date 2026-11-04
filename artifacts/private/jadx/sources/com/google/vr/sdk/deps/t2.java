package com.google.vr.sdk.deps;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class t2 extends j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f129578b = Logger.getLogger(t2.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f129579c = f6.p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    q6 f129580a;

    static class a extends t2 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f129581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f129582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f129583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f129584g;

        a(byte[] bArr, int i10, int i11) {
            super((byte) 0);
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f129581d = bArr;
            this.f129582e = i10;
            this.f129584g = i10;
            this.f129583f = i12;
        }

        @Override // com.google.vr.sdk.deps.t2
        public void C0() {
        }

        @Override // com.google.vr.sdk.deps.t2
        public final int D0() {
            return this.f129583f - this.f129584g;
        }

        public final int L0() {
            return this.f129584g - this.f129582e;
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void M(int i10) throws IOException {
            if (t2.f129579c && D0() >= 10) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f129581d;
                    int i11 = this.f129584g;
                    this.f129584g = i11 + 1;
                    f6.n(bArr, i11, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f129581d;
                int i12 = this.f129584g;
                this.f129584g = i12 + 1;
                f6.n(bArr2, i12, (byte) i10);
                return;
            }
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f129581d;
                    int i13 = this.f129584g;
                    this.f129584g = i13 + 1;
                    bArr3[i13] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f129584g), Integer.valueOf(this.f129583f), 1), e10);
                }
            }
            byte[] bArr4 = this.f129581d;
            int i14 = this.f129584g;
            this.f129584g = i14 + 1;
            bArr4[i14] = (byte) i10;
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void N(int i10, int i11) throws IOException {
            m(i10, 0);
            j(i11);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void P(int i10, k2 k2Var) throws IOException {
            m(1, 3);
            Z(2, i10);
            o(3, k2Var);
            m(1, 4);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void Q(int i10, t4 t4Var) throws IOException {
            m(1, 3);
            Z(2, i10);
            p(3, t4Var);
            m(1, 4);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void S(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f129581d, this.f129584g, i11);
                this.f129584g += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f129584g), Integer.valueOf(this.f129583f), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void Z(int i10, int i11) throws IOException {
            m(i10, 0);
            M(i11);
        }

        @Override // com.google.vr.sdk.deps.t2, com.google.vr.sdk.deps.j2
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            S(bArr, i10, i11);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void a0(int i10, long j10) throws IOException {
            m(i10, 1);
            b0(j10);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void b0(long j10) throws IOException {
            try {
                byte[] bArr = this.f129581d;
                int i10 = this.f129584g;
                int i11 = i10 + 1;
                this.f129584g = i11;
                bArr[i10] = (byte) j10;
                int i12 = i10 + 2;
                this.f129584g = i12;
                bArr[i11] = (byte) (j10 >> 8);
                int i13 = i10 + 3;
                this.f129584g = i13;
                bArr[i12] = (byte) (j10 >> 16);
                int i14 = i10 + 4;
                this.f129584g = i14;
                bArr[i13] = (byte) (j10 >> 24);
                int i15 = i10 + 5;
                this.f129584g = i15;
                bArr[i14] = (byte) (j10 >> 32);
                int i16 = i10 + 6;
                this.f129584g = i16;
                bArr[i15] = (byte) (j10 >> 40);
                int i17 = i10 + 7;
                this.f129584g = i17;
                bArr[i16] = (byte) (j10 >> 48);
                this.f129584g = i10 + 8;
                bArr[i17] = (byte) (j10 >> 56);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f129584g), Integer.valueOf(this.f129583f), 1), e10);
            }
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void c0(byte[] bArr, int i10, int i11) throws IOException {
            M(i11);
            S(bArr, 0, i11);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void g(byte b10) throws IOException {
            try {
                byte[] bArr = this.f129581d;
                int i10 = this.f129584g;
                this.f129584g = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f129584g), Integer.valueOf(this.f129583f), 1), e10);
            }
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void i0(int i10) throws IOException {
            try {
                byte[] bArr = this.f129581d;
                int i11 = this.f129584g;
                int i12 = i11 + 1;
                this.f129584g = i12;
                bArr[i11] = (byte) i10;
                int i13 = i11 + 2;
                this.f129584g = i13;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i11 + 3;
                this.f129584g = i14;
                bArr[i13] = (byte) (i10 >> 16);
                this.f129584g = i11 + 4;
                bArr[i14] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e10) {
                boolean z10 = true & true;
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f129584g), Integer.valueOf(this.f129583f), 1), e10);
            }
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void j(int i10) throws IOException {
            if (i10 >= 0) {
                M(i10);
            } else {
                t(i10);
            }
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void m(int i10, int i11) throws IOException {
            M((i10 << 3) | i11);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void n(int i10, long j10) throws IOException {
            m(i10, 0);
            t(j10);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void o(int i10, k2 k2Var) throws IOException {
            m(i10, 2);
            u(k2Var);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void o0(int i10, int i11) throws IOException {
            m(i10, 5);
            i0(i11);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void p(int i10, t4 t4Var) throws IOException {
            m(i10, 2);
            v(t4Var);
        }

        @Override // com.google.vr.sdk.deps.t2
        final void q(int i10, t4 t4Var, k5 k5Var) throws IOException {
            m(i10, 2);
            M(((b2) t4Var).d(k5Var));
            k5Var.f(t4Var, this.f129580a);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void r(int i10, String str) throws IOException {
            m(i10, 2);
            x(str);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void s(int i10, boolean z10) throws IOException {
            m(i10, 0);
            g(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void t(long j10) throws IOException {
            if (t2.f129579c && D0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f129581d;
                    int i10 = this.f129584g;
                    this.f129584g = i10 + 1;
                    f6.n(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f129581d;
                int i11 = this.f129584g;
                this.f129584g = i11 + 1;
                f6.n(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f129581d;
                    int i12 = this.f129584g;
                    this.f129584g = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f129584g), Integer.valueOf(this.f129583f), 1), e10);
                }
            }
            byte[] bArr4 = this.f129581d;
            int i13 = this.f129584g;
            this.f129584g = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void u(k2 k2Var) throws IOException {
            M(k2Var.v());
            k2Var.s(this);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void v(t4 t4Var) throws IOException {
            M(t4Var.w1());
            t4Var.a(this);
        }

        @Override // com.google.vr.sdk.deps.t2
        final void w(t4 t4Var, k5 k5Var) throws IOException {
            M(((b2) t4Var).d(k5Var));
            k5Var.f(t4Var, this.f129580a);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void x(String str) throws IOException {
            int i10 = this.f129584g;
            try {
                int iV0 = t2.v0(str.length() * 3);
                int iV1 = t2.v0(str.length());
                if (iV1 != iV0) {
                    M(i6.d(str));
                    this.f129584g = i6.e(str, this.f129581d, this.f129584g, D0());
                    return;
                }
                int i11 = i10 + iV1;
                this.f129584g = i11;
                int iE = i6.e(str, this.f129581d, i11, D0());
                this.f129584g = i10;
                M((iE - i10) - iV1);
                this.f129584g = iE;
            } catch (l6 e10) {
                this.f129584g = i10;
                y(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new c(e11);
            }
        }
    }

    static final class b extends a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ByteBuffer f129585h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f129586i;

        b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f129585h = byteBuffer;
            this.f129586i = byteBuffer.position();
        }

        @Override // com.google.vr.sdk.deps.t2.a, com.google.vr.sdk.deps.t2
        public final void C0() {
            this.f129585h.position(this.f129586i + L0());
        }
    }

    public static class c extends IOException {
        c() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        c(String str) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "));
        }

        c(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        c(String str, Throwable th2) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th2);
        }
    }

    static final class d extends t2 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ByteBuffer f129587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ByteBuffer f129588e;

        d(ByteBuffer byteBuffer) {
            super((byte) 0);
            this.f129587d = byteBuffer;
            this.f129588e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.position();
        }

        private final void L0(String str) throws IOException {
            try {
                i6.f(str, this.f129588e);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(e10);
            }
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void C0() {
            this.f129587d.position(this.f129588e.position());
        }

        @Override // com.google.vr.sdk.deps.t2
        public final int D0() {
            return this.f129588e.remaining();
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void M(int i10) throws IOException {
            while ((i10 & (-128)) != 0) {
                try {
                    this.f129588e.put((byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new c(e10);
                }
            }
            this.f129588e.put((byte) i10);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void N(int i10, int i11) throws IOException {
            m(i10, 0);
            j(i11);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void P(int i10, k2 k2Var) throws IOException {
            m(1, 3);
            Z(2, i10);
            o(3, k2Var);
            m(1, 4);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void Q(int i10, t4 t4Var) throws IOException {
            m(1, 3);
            Z(2, i10);
            p(3, t4Var);
            m(1, 4);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void S(byte[] bArr, int i10, int i11) throws IOException {
            try {
                this.f129588e.put(bArr, i10, i11);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(e10);
            } catch (BufferOverflowException e11) {
                throw new c(e11);
            }
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void Z(int i10, int i11) throws IOException {
            m(i10, 0);
            M(i11);
        }

        @Override // com.google.vr.sdk.deps.t2, com.google.vr.sdk.deps.j2
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            S(bArr, i10, i11);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void a0(int i10, long j10) throws IOException {
            m(i10, 1);
            b0(j10);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void b0(long j10) throws IOException {
            try {
                this.f129588e.putLong(j10);
            } catch (BufferOverflowException e10) {
                throw new c(e10);
            }
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void c0(byte[] bArr, int i10, int i11) throws IOException {
            M(i11);
            S(bArr, 0, i11);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void g(byte b10) throws IOException {
            try {
                this.f129588e.put(b10);
            } catch (BufferOverflowException e10) {
                throw new c(e10);
            }
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void i0(int i10) throws IOException {
            try {
                this.f129588e.putInt(i10);
            } catch (BufferOverflowException e10) {
                throw new c(e10);
            }
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void j(int i10) throws IOException {
            if (i10 >= 0) {
                M(i10);
            } else {
                t(i10);
            }
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void m(int i10, int i11) throws IOException {
            M((i10 << 3) | i11);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void n(int i10, long j10) throws IOException {
            m(i10, 0);
            t(j10);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void o(int i10, k2 k2Var) throws IOException {
            m(i10, 2);
            u(k2Var);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void o0(int i10, int i11) throws IOException {
            m(i10, 5);
            i0(i11);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void p(int i10, t4 t4Var) throws IOException {
            m(i10, 2);
            v(t4Var);
        }

        @Override // com.google.vr.sdk.deps.t2
        final void q(int i10, t4 t4Var, k5 k5Var) throws IOException {
            m(i10, 2);
            w(t4Var, k5Var);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void r(int i10, String str) throws IOException {
            m(i10, 2);
            x(str);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void s(int i10, boolean z10) throws IOException {
            m(i10, 0);
            g(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void t(long j10) throws IOException {
            while (((-128) & j10) != 0) {
                try {
                    this.f129588e.put((byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new c(e10);
                }
            }
            this.f129588e.put((byte) j10);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void u(k2 k2Var) throws IOException {
            M(k2Var.v());
            k2Var.s(this);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void v(t4 t4Var) throws IOException {
            M(t4Var.w1());
            t4Var.a(this);
        }

        @Override // com.google.vr.sdk.deps.t2
        final void w(t4 t4Var, k5 k5Var) throws IOException {
            M(((b2) t4Var).d(k5Var));
            k5Var.f(t4Var, this.f129580a);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void x(String str) throws IOException {
            int iPosition = this.f129588e.position();
            try {
                int iV0 = t2.v0(str.length() * 3);
                int iV1 = t2.v0(str.length());
                if (iV1 != iV0) {
                    M(i6.d(str));
                    L0(str);
                    return;
                }
                int iPosition2 = this.f129588e.position() + iV1;
                this.f129588e.position(iPosition2);
                L0(str);
                int iPosition3 = this.f129588e.position();
                this.f129588e.position(iPosition);
                M(iPosition3 - iPosition2);
                this.f129588e.position(iPosition3);
            } catch (l6 e10) {
                this.f129588e.position(iPosition);
                y(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new c(e11);
            }
        }
    }

    static final class e extends t2 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ByteBuffer f129589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ByteBuffer f129590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f129591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f129592g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f129593h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f129594i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f129595j;

        e(ByteBuffer byteBuffer) {
            super((byte) 0);
            this.f129589d = byteBuffer;
            this.f129590e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jC = f6.c(byteBuffer);
            this.f129591f = jC;
            long jPosition = ((long) byteBuffer.position()) + jC;
            this.f129592g = jPosition;
            long jLimit = jC + ((long) byteBuffer.limit());
            this.f129593h = jLimit;
            this.f129594i = jLimit - 10;
            this.f129595j = jPosition;
        }

        private final void L0(long j10) {
            this.f129590e.position((int) (j10 - this.f129591f));
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void C0() {
            this.f129589d.position((int) (this.f129595j - this.f129591f));
        }

        @Override // com.google.vr.sdk.deps.t2
        public final int D0() {
            return (int) (this.f129593h - this.f129595j);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void M(int i10) throws IOException {
            if (this.f129595j <= this.f129594i) {
                while ((i10 & (-128)) != 0) {
                    long j10 = this.f129595j;
                    this.f129595j = j10 + 1;
                    f6.f(j10, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                long j11 = this.f129595j;
                this.f129595j = 1 + j11;
                f6.f(j11, (byte) i10);
                return;
            }
            while (true) {
                long j12 = this.f129595j;
                if (j12 >= this.f129593h) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f129595j), Long.valueOf(this.f129593h), 1));
                }
                if ((i10 & (-128)) == 0) {
                    this.f129595j = 1 + j12;
                    f6.f(j12, (byte) i10);
                    return;
                } else {
                    this.f129595j = j12 + 1;
                    f6.f(j12, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
            }
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void N(int i10, int i11) throws IOException {
            m(i10, 0);
            j(i11);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void P(int i10, k2 k2Var) throws IOException {
            m(1, 3);
            Z(2, i10);
            o(3, k2Var);
            m(1, 4);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void Q(int i10, t4 t4Var) throws IOException {
            m(1, 3);
            Z(2, i10);
            p(3, t4Var);
            m(1, 4);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void S(byte[] bArr, int i10, int i11) throws IOException {
            if (bArr != null && i10 >= 0 && i11 >= 0 && bArr.length - i11 >= i10) {
                long j10 = i11;
                long j11 = this.f129593h - j10;
                long j12 = this.f129595j;
                if (j11 >= j12) {
                    f6.o(bArr, i10, j12, j10);
                    this.f129595j += j10;
                    return;
                }
            }
            if (bArr != null) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f129595j), Long.valueOf(this.f129593h), Integer.valueOf(i11)));
            }
            throw new NullPointerException("value");
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void Z(int i10, int i11) throws IOException {
            m(i10, 0);
            M(i11);
        }

        @Override // com.google.vr.sdk.deps.t2, com.google.vr.sdk.deps.j2
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            S(bArr, i10, i11);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void a0(int i10, long j10) throws IOException {
            m(i10, 1);
            b0(j10);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void b0(long j10) throws IOException {
            this.f129590e.putLong((int) (this.f129595j - this.f129591f), j10);
            this.f129595j += 8;
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void c0(byte[] bArr, int i10, int i11) throws IOException {
            M(i11);
            S(bArr, 0, i11);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void g(byte b10) throws IOException {
            long j10 = this.f129595j;
            if (j10 >= this.f129593h) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f129595j), Long.valueOf(this.f129593h), 1));
            }
            this.f129595j = 1 + j10;
            f6.f(j10, b10);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void i0(int i10) throws IOException {
            this.f129590e.putInt((int) (this.f129595j - this.f129591f), i10);
            this.f129595j += 4;
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void j(int i10) throws IOException {
            if (i10 >= 0) {
                M(i10);
            } else {
                t(i10);
            }
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void m(int i10, int i11) throws IOException {
            M((i10 << 3) | i11);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void n(int i10, long j10) throws IOException {
            m(i10, 0);
            t(j10);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void o(int i10, k2 k2Var) throws IOException {
            m(i10, 2);
            u(k2Var);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void o0(int i10, int i11) throws IOException {
            m(i10, 5);
            i0(i11);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void p(int i10, t4 t4Var) throws IOException {
            m(i10, 2);
            v(t4Var);
        }

        @Override // com.google.vr.sdk.deps.t2
        final void q(int i10, t4 t4Var, k5 k5Var) throws IOException {
            m(i10, 2);
            w(t4Var, k5Var);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void r(int i10, String str) throws IOException {
            m(i10, 2);
            x(str);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void s(int i10, boolean z10) throws IOException {
            m(i10, 0);
            g(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void t(long j10) throws IOException {
            if (this.f129595j <= this.f129594i) {
                while ((j10 & (-128)) != 0) {
                    long j11 = this.f129595j;
                    this.f129595j = j11 + 1;
                    f6.f(j11, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                long j12 = this.f129595j;
                this.f129595j = 1 + j12;
                f6.f(j12, (byte) j10);
                return;
            }
            while (true) {
                long j13 = this.f129595j;
                if (j13 >= this.f129593h) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f129595j), Long.valueOf(this.f129593h), 1));
                }
                if ((j10 & (-128)) == 0) {
                    this.f129595j = 1 + j13;
                    f6.f(j13, (byte) j10);
                    return;
                } else {
                    this.f129595j = j13 + 1;
                    f6.f(j13, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
            }
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void u(k2 k2Var) throws IOException {
            M(k2Var.v());
            k2Var.s(this);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void v(t4 t4Var) throws IOException {
            M(t4Var.w1());
            t4Var.a(this);
        }

        @Override // com.google.vr.sdk.deps.t2
        final void w(t4 t4Var, k5 k5Var) throws IOException {
            M(((b2) t4Var).d(k5Var));
            k5Var.f(t4Var, this.f129580a);
        }

        @Override // com.google.vr.sdk.deps.t2
        public final void x(String str) throws IOException {
            long j10 = this.f129595j;
            try {
                int iV0 = t2.v0(str.length() * 3);
                int iV1 = t2.v0(str.length());
                if (iV1 != iV0) {
                    int iD = i6.d(str);
                    M(iD);
                    L0(this.f129595j);
                    i6.f(str, this.f129590e);
                    this.f129595j += (long) iD;
                    return;
                }
                int i10 = ((int) (this.f129595j - this.f129591f)) + iV1;
                this.f129590e.position(i10);
                i6.f(str, this.f129590e);
                int iPosition = this.f129590e.position() - i10;
                M(iPosition);
                this.f129595j += (long) iPosition;
            } catch (l6 e10) {
                this.f129595j = j10;
                L0(j10);
                y(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new c(e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new c(e12);
            }
        }
    }

    private t2() {
    }

    public static int A() {
        return 4;
    }

    public static int A0(int i10, int i11) {
        return l0(i10) + v0(J0(i11));
    }

    public static int B(int i10, double d10) {
        return l0(i10) + 8;
    }

    public static int B0(int i10, long j10) {
        return l0(i10) + 8;
    }

    public static int C(int i10, float f10) {
        return l0(i10) + 4;
    }

    public static int D(int i10, b4 b4Var) {
        return (l0(1) << 1) + w0(2, i10) + c(3, b4Var);
    }

    static int E(int i10, t4 t4Var, k5 k5Var) {
        return l0(i10) + J(t4Var, k5Var);
    }

    public static int E0(int i10) {
        return q0(i10);
    }

    public static int F(int i10, String str) {
        return l0(i10) + K(str);
    }

    public static int F0(int i10, int i11) {
        return l0(i10) + 4;
    }

    public static int G(int i10, boolean z10) {
        return l0(i10) + 1;
    }

    @Deprecated
    public static int G0(int i10) {
        return v0(i10);
    }

    public static int H(k2 k2Var) {
        int iV = k2Var.v();
        return v0(iV) + iV;
    }

    public static int H0(int i10, int i11) {
        return l0(i10) + 4;
    }

    public static int I(t4 t4Var) {
        int iW1 = t4Var.w1();
        return v0(iW1) + iW1;
    }

    static int J(t4 t4Var, k5 k5Var) {
        int iD = ((b2) t4Var).d(k5Var);
        return v0(iD) + iD;
    }

    private static int J0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static int K(String str) {
        int length;
        try {
            length = i6.d(str);
        } catch (l6 unused) {
            length = str.getBytes(k3.f129468a).length;
        }
        return v0(length) + length;
    }

    public static int K0(int i10, int i11) {
        return l0(i10) + q0(i11);
    }

    public static int L(byte[] bArr) {
        int length = bArr.length;
        return v0(length) + length;
    }

    public static int T() {
        return 8;
    }

    public static int U(int i10, k2 k2Var) {
        int iL0 = l0(i10);
        int iV = k2Var.v();
        return iL0 + v0(iV) + iV;
    }

    public static int V(int i10, t4 t4Var) {
        return l0(i10) + I(t4Var);
    }

    @Deprecated
    static int W(int i10, t4 t4Var, k5 k5Var) {
        return (l0(i10) << 1) + ((b2) t4Var).d(k5Var);
    }

    @Deprecated
    public static int X(t4 t4Var) {
        return t4Var.w1();
    }

    public static int b() {
        return 4;
    }

    public static int c(int i10, b4 b4Var) {
        int iL0 = l0(i10);
        int iB = b4Var.b();
        return iL0 + v0(iB) + iB;
    }

    public static int d(b4 b4Var) {
        int iB = b4Var.b();
        return v0(iB) + iB;
    }

    public static int d0() {
        return 8;
    }

    public static t2 e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return f6.u() ? new e(byteBuffer) : new d(byteBuffer);
    }

    public static int e0(int i10, long j10) {
        return l0(i10) + n0(j10);
    }

    public static t2 f(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int f0(int i10, k2 k2Var) {
        return (l0(1) << 1) + w0(2, i10) + U(3, k2Var);
    }

    public static int g0(int i10, t4 t4Var) {
        return (l0(1) << 1) + w0(2, i10) + V(3, t4Var);
    }

    public static int h0(long j10) {
        return n0(j10);
    }

    public static int k0() {
        return 4;
    }

    public static int l0(int i10) {
        return v0(i10 << 3);
    }

    public static int m0(int i10, long j10) {
        return l0(i10) + n0(j10);
    }

    public static int n0(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int p0() {
        return 8;
    }

    public static int q0(int i10) {
        if (i10 >= 0) {
            return v0(i10);
        }
        return 10;
    }

    public static int r0(int i10, int i11) {
        return l0(i10) + q0(i11);
    }

    public static int s0(int i10, long j10) {
        return l0(i10) + n0(y0(j10));
    }

    public static int t0(long j10) {
        return n0(y0(j10));
    }

    public static int u0() {
        return 1;
    }

    public static int v0(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int w0(int i10, int i11) {
        return l0(i10) + v0(i11);
    }

    public static int x0(int i10, long j10) {
        return l0(i10) + 8;
    }

    private static long y0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int z0(int i10) {
        return v0(J0(i10));
    }

    public abstract void C0() throws IOException;

    public abstract int D0();

    public abstract void M(int i10) throws IOException;

    public abstract void N(int i10, int i11) throws IOException;

    public final void O(int i10, long j10) throws IOException {
        n(i10, y0(j10));
    }

    public abstract void P(int i10, k2 k2Var) throws IOException;

    public abstract void Q(int i10, t4 t4Var) throws IOException;

    public final void R(long j10) throws IOException {
        t(y0(j10));
    }

    public abstract void S(byte[] bArr, int i10, int i11) throws IOException;

    public final void Y(int i10) throws IOException {
        M(J0(i10));
    }

    public abstract void Z(int i10, int i11) throws IOException;

    @Override // com.google.vr.sdk.deps.j2
    public abstract void a(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void a0(int i10, long j10) throws IOException;

    public abstract void b0(long j10) throws IOException;

    abstract void c0(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void g(byte b10) throws IOException;

    public final void h(double d10) throws IOException {
        b0(Double.doubleToRawLongBits(d10));
    }

    public final void i(float f10) throws IOException {
        i0(Float.floatToRawIntBits(f10));
    }

    public abstract void i0(int i10) throws IOException;

    public abstract void j(int i10) throws IOException;

    public final void j0(int i10, int i11) throws IOException {
        Z(i10, J0(i11));
    }

    public final void k(int i10, double d10) throws IOException {
        a0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void l(int i10, float f10) throws IOException {
        o0(i10, Float.floatToRawIntBits(f10));
    }

    public abstract void m(int i10, int i11) throws IOException;

    public abstract void n(int i10, long j10) throws IOException;

    public abstract void o(int i10, k2 k2Var) throws IOException;

    public abstract void o0(int i10, int i11) throws IOException;

    public abstract void p(int i10, t4 t4Var) throws IOException;

    abstract void q(int i10, t4 t4Var, k5 k5Var) throws IOException;

    public abstract void r(int i10, String str) throws IOException;

    public abstract void s(int i10, boolean z10) throws IOException;

    public abstract void t(long j10) throws IOException;

    public abstract void u(k2 k2Var) throws IOException;

    public abstract void v(t4 t4Var) throws IOException;

    abstract void w(t4 t4Var, k5 k5Var) throws IOException;

    public abstract void x(String str) throws IOException;

    final void y(String str, l6 l6Var) throws IOException {
        f129578b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) l6Var);
        byte[] bytes = str.getBytes(k3.f129468a);
        try {
            M(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (c e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new c(e11);
        }
    }

    public final void z(boolean z10) throws IOException {
        g(z10 ? (byte) 1 : (byte) 0);
    }

    /* synthetic */ t2(byte b10) {
        this();
    }
}
