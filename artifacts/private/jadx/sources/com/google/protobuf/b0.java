package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b0 extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f125762c = Logger.getLogger(b0.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f125763d = t4.U();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f125764e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f125765f = 4096;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c0 f125766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f125767b;

    private static abstract class b extends b0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final byte[] f125768g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f125769h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f125770i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f125771j;

        b(int bufferSize) {
            super();
            if (bufferSize < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(bufferSize, 20)];
            this.f125768g = bArr;
            this.f125769h = bArr.length;
        }

        @Override // com.google.protobuf.b0
        public final int f1() {
            return this.f125771j;
        }

        final void j2(byte value) {
            byte[] bArr = this.f125768g;
            int i10 = this.f125770i;
            this.f125770i = i10 + 1;
            bArr[i10] = value;
            this.f125771j++;
        }

        final void k2(int value) {
            byte[] bArr = this.f125768g;
            int i10 = this.f125770i;
            int i11 = i10 + 1;
            this.f125770i = i11;
            bArr[i10] = (byte) (value & 255);
            int i12 = i10 + 2;
            this.f125770i = i12;
            bArr[i11] = (byte) ((value >> 8) & 255);
            int i13 = i10 + 3;
            this.f125770i = i13;
            bArr[i12] = (byte) ((value >> 16) & 255);
            this.f125770i = i10 + 4;
            bArr[i13] = (byte) ((value >> 24) & 255);
            this.f125771j += 4;
        }

        final void l2(long value) {
            byte[] bArr = this.f125768g;
            int i10 = this.f125770i;
            int i11 = i10 + 1;
            this.f125770i = i11;
            bArr[i10] = (byte) (value & 255);
            int i12 = i10 + 2;
            this.f125770i = i12;
            bArr[i11] = (byte) ((value >> 8) & 255);
            int i13 = i10 + 3;
            this.f125770i = i13;
            bArr[i12] = (byte) ((value >> 16) & 255);
            int i14 = i10 + 4;
            this.f125770i = i14;
            bArr[i13] = (byte) (255 & (value >> 24));
            int i15 = i10 + 5;
            this.f125770i = i15;
            bArr[i14] = (byte) (((int) (value >> 32)) & 255);
            int i16 = i10 + 6;
            this.f125770i = i16;
            bArr[i15] = (byte) (((int) (value >> 40)) & 255);
            int i17 = i10 + 7;
            this.f125770i = i17;
            bArr[i16] = (byte) (((int) (value >> 48)) & 255);
            this.f125770i = i10 + 8;
            bArr[i17] = (byte) (((int) (value >> 56)) & 255);
            this.f125771j += 8;
        }

        final void m2(final int value) {
            if (value >= 0) {
                o2(value);
            } else {
                p2(value);
            }
        }

        final void n2(final int fieldNumber, final int wireType) {
            o2(x4.c(fieldNumber, wireType));
        }

        final void o2(int value) {
            if (!b0.f125763d) {
                while ((value & (-128)) != 0) {
                    byte[] bArr = this.f125768g;
                    int i10 = this.f125770i;
                    this.f125770i = i10 + 1;
                    bArr[i10] = (byte) ((value & 127) | 128);
                    this.f125771j++;
                    value >>>= 7;
                }
                byte[] bArr2 = this.f125768g;
                int i11 = this.f125770i;
                this.f125770i = i11 + 1;
                bArr2[i11] = (byte) value;
                this.f125771j++;
                return;
            }
            long j10 = this.f125770i;
            while ((value & (-128)) != 0) {
                byte[] bArr3 = this.f125768g;
                int i12 = this.f125770i;
                this.f125770i = i12 + 1;
                t4.g0(bArr3, i12, (byte) ((value & 127) | 128));
                value >>>= 7;
            }
            byte[] bArr4 = this.f125768g;
            int i13 = this.f125770i;
            this.f125770i = i13 + 1;
            t4.g0(bArr4, i13, (byte) value);
            this.f125771j += (int) (((long) this.f125770i) - j10);
        }

        final void p2(long value) {
            if (!b0.f125763d) {
                while ((value & (-128)) != 0) {
                    byte[] bArr = this.f125768g;
                    int i10 = this.f125770i;
                    this.f125770i = i10 + 1;
                    bArr[i10] = (byte) ((((int) value) & 127) | 128);
                    this.f125771j++;
                    value >>>= 7;
                }
                byte[] bArr2 = this.f125768g;
                int i11 = this.f125770i;
                this.f125770i = i11 + 1;
                bArr2[i11] = (byte) value;
                this.f125771j++;
                return;
            }
            long j10 = this.f125770i;
            while ((value & (-128)) != 0) {
                byte[] bArr3 = this.f125768g;
                int i12 = this.f125770i;
                this.f125770i = i12 + 1;
                t4.g0(bArr3, i12, (byte) ((((int) value) & 127) | 128));
                value >>>= 7;
            }
            byte[] bArr4 = this.f125768g;
            int i13 = this.f125770i;
            this.f125770i = i13 + 1;
            t4.g0(bArr4, i13, (byte) value);
            this.f125771j += (int) (((long) this.f125770i) - j10);
        }

        @Override // com.google.protobuf.b0
        public final int r1() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class c extends b0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f125772g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f125773h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f125774i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f125775j;

        c(byte[] buffer, int offset, int length) {
            super();
            if (buffer == null) {
                throw new NullPointerException("buffer");
            }
            int i10 = offset + length;
            if ((offset | length | (buffer.length - i10)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(buffer.length), Integer.valueOf(offset), Integer.valueOf(length)));
            }
            this.f125772g = buffer;
            this.f125773h = offset;
            this.f125775j = offset;
            this.f125774i = i10;
        }

        @Override // com.google.protobuf.b0
        public final void C1(int value) throws IOException {
            try {
                byte[] bArr = this.f125772g;
                int i10 = this.f125775j;
                int i11 = i10 + 1;
                this.f125775j = i11;
                bArr[i10] = (byte) (value & 255);
                int i12 = i10 + 2;
                this.f125775j = i12;
                bArr[i11] = (byte) ((value >> 8) & 255);
                int i13 = i10 + 3;
                this.f125775j = i13;
                bArr[i12] = (byte) ((value >> 16) & 255);
                this.f125775j = i10 + 4;
                bArr[i13] = (byte) ((value >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f125775j), Integer.valueOf(this.f125774i), 1), e10);
            }
        }

        @Override // com.google.protobuf.b0
        public final void D1(long value) throws IOException {
            try {
                byte[] bArr = this.f125772g;
                int i10 = this.f125775j;
                int i11 = i10 + 1;
                this.f125775j = i11;
                bArr[i10] = (byte) (((int) value) & 255);
                int i12 = i10 + 2;
                this.f125775j = i12;
                bArr[i11] = (byte) (((int) (value >> 8)) & 255);
                int i13 = i10 + 3;
                this.f125775j = i13;
                bArr[i12] = (byte) (((int) (value >> 16)) & 255);
                int i14 = i10 + 4;
                this.f125775j = i14;
                bArr[i13] = (byte) (((int) (value >> 24)) & 255);
                int i15 = i10 + 5;
                this.f125775j = i15;
                bArr[i14] = (byte) (((int) (value >> 32)) & 255);
                int i16 = i10 + 6;
                this.f125775j = i16;
                bArr[i15] = (byte) (((int) (value >> 40)) & 255);
                int i17 = i10 + 7;
                this.f125775j = i17;
                bArr[i16] = (byte) (((int) (value >> 48)) & 255);
                this.f125775j = i10 + 8;
                bArr[i17] = (byte) (((int) (value >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f125775j), Integer.valueOf(this.f125774i), 1), e10);
            }
        }

        @Override // com.google.protobuf.b0
        public final void J1(int value) throws IOException {
            if (value >= 0) {
                h2(value);
            } else {
                i2(value);
            }
        }

        @Override // com.google.protobuf.b0
        public final void L1(final int fieldNumber, final n2 value) throws IOException {
            g2(fieldNumber, 2);
            N1(value);
        }

        @Override // com.google.protobuf.b0
        final void M1(final int fieldNumber, final n2 value, o3 schema) throws IOException {
            g2(fieldNumber, 2);
            h2(((com.google.protobuf.a) value).I3(schema));
            schema.h(value, this.f125766a);
        }

        @Override // com.google.protobuf.b0
        public final void N(final int fieldNumber, final u value) throws IOException {
            g2(fieldNumber, 2);
            z1(value);
        }

        @Override // com.google.protobuf.b0
        public final void N1(final n2 value) throws IOException {
            h2(value.w1());
            value.Nb(this);
        }

        @Override // com.google.protobuf.b0
        final void O1(final n2 value, o3 schema) throws IOException {
            h2(((com.google.protobuf.a) value).I3(schema));
            schema.h(value, this.f125766a);
        }

        @Override // com.google.protobuf.b0
        public final void P1(final int fieldNumber, final n2 value) throws IOException {
            g2(1, 3);
            l(2, fieldNumber);
            L1(3, value);
            g2(1, 4);
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public final void T(byte value) throws IOException {
            try {
                byte[] bArr = this.f125772g;
                int i10 = this.f125775j;
                this.f125775j = i10 + 1;
                bArr[i10] = value;
            } catch (IndexOutOfBoundsException e10) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f125775j), Integer.valueOf(this.f125774i), 1), e10);
            }
        }

        @Override // com.google.protobuf.b0
        public final void T1(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                V(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = value.duplicate();
            v1.a(byteBufferDuplicate);
            U(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public final void U(ByteBuffer value) throws IOException {
            int iRemaining = value.remaining();
            try {
                value.get(this.f125772g, this.f125775j, iRemaining);
                this.f125775j += iRemaining;
            } catch (IndexOutOfBoundsException e10) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f125775j), Integer.valueOf(this.f125774i), Integer.valueOf(iRemaining)), e10);
            }
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public final void V(byte[] value, int offset, int length) throws IOException {
            try {
                System.arraycopy(value, offset, this.f125772g, this.f125775j, length);
                this.f125775j += length;
            } catch (IndexOutOfBoundsException e10) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f125775j), Integer.valueOf(this.f125774i), Integer.valueOf(length)), e10);
            }
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public final void W(ByteBuffer value) throws IOException {
            U(value);
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public final void X(byte[] value, int offset, int length) throws IOException {
            V(value, offset, length);
        }

        @Override // com.google.protobuf.b0
        public final void Y1(final int fieldNumber, final u value) throws IOException {
            g2(1, 3);
            l(2, fieldNumber);
            N(3, value);
            g2(1, 4);
        }

        @Override // com.google.protobuf.b0
        public final void c(final int fieldNumber, final int value) throws IOException {
            g2(fieldNumber, 5);
            C1(value);
        }

        @Override // com.google.protobuf.b0
        public final void e(final int fieldNumber, final String value) throws IOException {
            g2(fieldNumber, 2);
            f2(value);
        }

        @Override // com.google.protobuf.b0
        public void e1() {
        }

        @Override // com.google.protobuf.b0
        public final void f(final int fieldNumber, final long value) throws IOException {
            g2(fieldNumber, 0);
            i2(value);
        }

        @Override // com.google.protobuf.b0
        public final int f1() {
            return this.f125775j - this.f125773h;
        }

        @Override // com.google.protobuf.b0
        public final void f2(String value) throws IOException {
            int i10 = this.f125775j;
            try {
                int iZ0 = b0.Z0(value.length() * 3);
                int iZ1 = b0.Z0(value.length());
                if (iZ1 != iZ0) {
                    h2(u4.k(value));
                    this.f125775j = u4.i(value, this.f125772g, this.f125775j, r1());
                    return;
                }
                int i11 = i10 + iZ1;
                this.f125775j = i11;
                int i12 = u4.i(value, this.f125772g, i11, r1());
                this.f125775j = i10;
                h2((i12 - i10) - iZ1);
                this.f125775j = i12;
            } catch (u4.d e10) {
                this.f125775j = i10;
                g1(value, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new f(e11);
            }
        }

        @Override // com.google.protobuf.b0
        public final void g2(final int fieldNumber, final int wireType) throws IOException {
            h2(x4.c(fieldNumber, wireType));
        }

        @Override // com.google.protobuf.b0
        public final void h(final int fieldNumber, final int value) throws IOException {
            g2(fieldNumber, 0);
            J1(value);
        }

        @Override // com.google.protobuf.b0
        public final void h2(int value) throws IOException {
            while ((value & (-128)) != 0) {
                try {
                    byte[] bArr = this.f125772g;
                    int i10 = this.f125775j;
                    this.f125775j = i10 + 1;
                    bArr[i10] = (byte) ((value & 127) | 128);
                    value >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f125775j), Integer.valueOf(this.f125774i), 1), e10);
                }
            }
            byte[] bArr2 = this.f125772g;
            int i11 = this.f125775j;
            this.f125775j = i11 + 1;
            bArr2[i11] = (byte) value;
        }

        @Override // com.google.protobuf.b0
        public final void i2(long value) throws IOException {
            if (b0.f125763d && r1() >= 10) {
                while ((value & (-128)) != 0) {
                    byte[] bArr = this.f125772g;
                    int i10 = this.f125775j;
                    this.f125775j = i10 + 1;
                    t4.g0(bArr, i10, (byte) ((((int) value) & 127) | 128));
                    value >>>= 7;
                }
                byte[] bArr2 = this.f125772g;
                int i11 = this.f125775j;
                this.f125775j = i11 + 1;
                t4.g0(bArr2, i11, (byte) value);
                return;
            }
            while ((value & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f125772g;
                    int i12 = this.f125775j;
                    this.f125775j = i12 + 1;
                    bArr3[i12] = (byte) ((((int) value) & 127) | 128);
                    value >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f125775j), Integer.valueOf(this.f125774i), 1), e10);
                }
            }
            byte[] bArr4 = this.f125772g;
            int i13 = this.f125775j;
            this.f125775j = i13 + 1;
            bArr4[i13] = (byte) value;
        }

        @Override // com.google.protobuf.b0
        public final void l(final int fieldNumber, final int value) throws IOException {
            g2(fieldNumber, 0);
            h2(value);
        }

        @Override // com.google.protobuf.b0
        public final void n(final int fieldNumber, final long value) throws IOException {
            g2(fieldNumber, 1);
            D1(value);
        }

        @Override // com.google.protobuf.b0
        public final void p(int i10, boolean z10) throws IOException {
            g2(i10, 0);
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.b0
        public final int r1() {
            return this.f125774i - this.f125775j;
        }

        @Override // com.google.protobuf.b0
        public final void u1(final int fieldNumber, final byte[] value) throws IOException {
            v1(fieldNumber, value, 0, value.length);
        }

        @Override // com.google.protobuf.b0
        public final void v1(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            g2(fieldNumber, 2);
            x1(value, offset, length);
        }

        @Override // com.google.protobuf.b0
        public final void x1(final byte[] value, int offset, int length) throws IOException {
            h2(length);
            V(value, offset, length);
        }

        @Override // com.google.protobuf.b0
        public final void y1(final int fieldNumber, final ByteBuffer value) throws IOException {
            g2(fieldNumber, 2);
            h2(value.capacity());
            T1(value);
        }

        @Override // com.google.protobuf.b0
        public final void z1(final u value) throws IOException {
            h2(value.size());
            value.G0(this);
        }
    }

    private static final class d extends b {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final t f125776k;

        d(t out, int bufferSize) {
            super(bufferSize);
            if (out == null) {
                throw new NullPointerException("out");
            }
            this.f125776k = out;
        }

        private void q2() throws IOException {
            this.f125776k.V(this.f125768g, 0, this.f125770i);
            this.f125770i = 0;
        }

        private void r2(int requiredSize) throws IOException {
            if (this.f125769h - this.f125770i < requiredSize) {
                q2();
            }
        }

        @Override // com.google.protobuf.b0
        public void C1(final int value) throws IOException {
            r2(4);
            k2(value);
        }

        @Override // com.google.protobuf.b0
        public void D1(final long value) throws IOException {
            r2(8);
            l2(value);
        }

        @Override // com.google.protobuf.b0
        public void J1(int value) throws IOException {
            if (value >= 0) {
                h2(value);
            } else {
                i2(value);
            }
        }

        @Override // com.google.protobuf.b0
        public void L1(final int fieldNumber, final n2 value) throws IOException {
            g2(fieldNumber, 2);
            N1(value);
        }

        @Override // com.google.protobuf.b0
        void M1(final int fieldNumber, final n2 value, o3 schema) throws IOException {
            g2(fieldNumber, 2);
            O1(value, schema);
        }

        @Override // com.google.protobuf.b0
        public void N(final int fieldNumber, final u value) throws IOException {
            g2(fieldNumber, 2);
            z1(value);
        }

        @Override // com.google.protobuf.b0
        public void N1(final n2 value) throws IOException {
            h2(value.w1());
            value.Nb(this);
        }

        @Override // com.google.protobuf.b0
        void O1(final n2 value, o3 schema) throws IOException {
            h2(((com.google.protobuf.a) value).I3(schema));
            schema.h(value, this.f125766a);
        }

        @Override // com.google.protobuf.b0
        public void P1(final int fieldNumber, final n2 value) throws IOException {
            g2(1, 3);
            l(2, fieldNumber);
            L1(3, value);
            g2(1, 4);
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void T(byte value) throws IOException {
            if (this.f125770i == this.f125769h) {
                q2();
            }
            j2(value);
        }

        @Override // com.google.protobuf.b0
        public void T1(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                V(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = value.duplicate();
            v1.a(byteBufferDuplicate);
            U(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void U(ByteBuffer value) throws IOException {
            e1();
            int iRemaining = value.remaining();
            this.f125776k.U(value);
            this.f125771j += iRemaining;
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void V(byte[] value, int offset, int length) throws IOException {
            e1();
            this.f125776k.V(value, offset, length);
            this.f125771j += length;
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void W(ByteBuffer value) throws IOException {
            e1();
            int iRemaining = value.remaining();
            this.f125776k.W(value);
            this.f125771j += iRemaining;
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void X(byte[] value, int offset, int length) throws IOException {
            e1();
            this.f125776k.X(value, offset, length);
            this.f125771j += length;
        }

        @Override // com.google.protobuf.b0
        public void Y1(final int fieldNumber, final u value) throws IOException {
            g2(1, 3);
            l(2, fieldNumber);
            N(3, value);
            g2(1, 4);
        }

        @Override // com.google.protobuf.b0
        public void c(final int fieldNumber, final int value) throws IOException {
            r2(14);
            n2(fieldNumber, 5);
            k2(value);
        }

        @Override // com.google.protobuf.b0
        public void e(final int fieldNumber, final String value) throws IOException {
            g2(fieldNumber, 2);
            f2(value);
        }

        @Override // com.google.protobuf.b0
        public void e1() throws IOException {
            if (this.f125770i > 0) {
                q2();
            }
        }

        @Override // com.google.protobuf.b0
        public void f(final int fieldNumber, final long value) throws IOException {
            r2(20);
            n2(fieldNumber, 0);
            p2(value);
        }

        @Override // com.google.protobuf.b0
        public void f2(String value) throws IOException {
            int length = value.length() * 3;
            int iZ0 = b0.Z0(length);
            int i10 = iZ0 + length;
            int i11 = this.f125769h;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int i12 = u4.i(value, bArr, 0, length);
                h2(i12);
                X(bArr, 0, i12);
                return;
            }
            if (i10 > i11 - this.f125770i) {
                q2();
            }
            int i13 = this.f125770i;
            try {
                int iZ1 = b0.Z0(value.length());
                if (iZ1 != iZ0) {
                    int iK = u4.k(value);
                    o2(iK);
                    this.f125770i = u4.i(value, this.f125768g, this.f125770i, iK);
                    this.f125771j += iK;
                    return;
                }
                int i14 = i13 + iZ1;
                this.f125770i = i14;
                int i15 = u4.i(value, this.f125768g, i14, this.f125769h - i14);
                this.f125770i = i13;
                int i16 = (i15 - i13) - iZ1;
                o2(i16);
                this.f125770i = i15;
                this.f125771j += i16;
            } catch (u4.d e10) {
                this.f125771j -= this.f125770i - i13;
                this.f125770i = i13;
                g1(value, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new f(e11);
            }
        }

        @Override // com.google.protobuf.b0
        public void g2(final int fieldNumber, final int wireType) throws IOException {
            h2(x4.c(fieldNumber, wireType));
        }

        @Override // com.google.protobuf.b0
        public void h(final int fieldNumber, final int value) throws IOException {
            r2(20);
            n2(fieldNumber, 0);
            m2(value);
        }

        @Override // com.google.protobuf.b0
        public void h2(int value) throws IOException {
            r2(5);
            o2(value);
        }

        @Override // com.google.protobuf.b0
        public void i2(long value) throws IOException {
            r2(10);
            p2(value);
        }

        @Override // com.google.protobuf.b0
        public void l(final int fieldNumber, final int value) throws IOException {
            r2(20);
            n2(fieldNumber, 0);
            o2(value);
        }

        @Override // com.google.protobuf.b0
        public void n(final int fieldNumber, final long value) throws IOException {
            r2(18);
            n2(fieldNumber, 1);
            l2(value);
        }

        @Override // com.google.protobuf.b0
        public void p(int i10, boolean z10) throws IOException {
            r2(11);
            n2(i10, 0);
            j2(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.b0
        public void u1(final int fieldNumber, final byte[] value) throws IOException {
            v1(fieldNumber, value, 0, value.length);
        }

        @Override // com.google.protobuf.b0
        public void v1(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            g2(fieldNumber, 2);
            x1(value, offset, length);
        }

        @Override // com.google.protobuf.b0
        public void x1(final byte[] value, int offset, int length) throws IOException {
            h2(length);
            V(value, offset, length);
        }

        @Override // com.google.protobuf.b0
        public void y1(final int fieldNumber, final ByteBuffer value) throws IOException {
            g2(fieldNumber, 2);
            h2(value.capacity());
            T1(value);
        }

        @Override // com.google.protobuf.b0
        public void z1(final u value) throws IOException {
            h2(value.size());
            value.G0(this);
        }
    }

    private static final class e extends c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final ByteBuffer f125777k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f125778l;

        e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f125777k = byteBuffer;
            this.f125778l = byteBuffer.position();
        }

        @Override // com.google.protobuf.b0.c, com.google.protobuf.b0
        public void e1() {
            v1.e(this.f125777k, this.f125778l + f1());
        }
    }

    public static class f extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f125779a = -6947486886997889499L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f125780b = "CodedOutputStream was writing to a flat byte array and ran out of space.";

        f() {
            super(f125780b);
        }

        f(String explanationMessage) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + explanationMessage);
        }

        f(Throwable cause) {
            super(f125780b, cause);
        }

        f(String explanationMessage, Throwable cause) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + explanationMessage, cause);
        }
    }

    private static final class g extends b {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final OutputStream f125781k;

        g(OutputStream out, int bufferSize) {
            super(bufferSize);
            if (out == null) {
                throw new NullPointerException("out");
            }
            this.f125781k = out;
        }

        private void q2() throws IOException {
            this.f125781k.write(this.f125768g, 0, this.f125770i);
            this.f125770i = 0;
        }

        private void r2(int requiredSize) throws IOException {
            if (this.f125769h - this.f125770i < requiredSize) {
                q2();
            }
        }

        @Override // com.google.protobuf.b0
        public void C1(final int value) throws IOException {
            r2(4);
            k2(value);
        }

        @Override // com.google.protobuf.b0
        public void D1(final long value) throws IOException {
            r2(8);
            l2(value);
        }

        @Override // com.google.protobuf.b0
        public void J1(int value) throws IOException {
            if (value >= 0) {
                h2(value);
            } else {
                i2(value);
            }
        }

        @Override // com.google.protobuf.b0
        public void L1(final int fieldNumber, final n2 value) throws IOException {
            g2(fieldNumber, 2);
            N1(value);
        }

        @Override // com.google.protobuf.b0
        void M1(final int fieldNumber, final n2 value, o3 schema) throws IOException {
            g2(fieldNumber, 2);
            O1(value, schema);
        }

        @Override // com.google.protobuf.b0
        public void N(final int fieldNumber, final u value) throws IOException {
            g2(fieldNumber, 2);
            z1(value);
        }

        @Override // com.google.protobuf.b0
        public void N1(final n2 value) throws IOException {
            h2(value.w1());
            value.Nb(this);
        }

        @Override // com.google.protobuf.b0
        void O1(final n2 value, o3 schema) throws IOException {
            h2(((com.google.protobuf.a) value).I3(schema));
            schema.h(value, this.f125766a);
        }

        @Override // com.google.protobuf.b0
        public void P1(final int fieldNumber, final n2 value) throws IOException {
            g2(1, 3);
            l(2, fieldNumber);
            L1(3, value);
            g2(1, 4);
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void T(byte value) throws IOException {
            if (this.f125770i == this.f125769h) {
                q2();
            }
            j2(value);
        }

        @Override // com.google.protobuf.b0
        public void T1(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                V(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = value.duplicate();
            v1.a(byteBufferDuplicate);
            U(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void U(ByteBuffer value) throws IOException {
            int iRemaining = value.remaining();
            int i10 = this.f125769h;
            int i11 = this.f125770i;
            if (i10 - i11 >= iRemaining) {
                value.get(this.f125768g, i11, iRemaining);
                this.f125770i += iRemaining;
                this.f125771j += iRemaining;
                return;
            }
            int i12 = i10 - i11;
            value.get(this.f125768g, i11, i12);
            int i13 = iRemaining - i12;
            this.f125770i = this.f125769h;
            this.f125771j += i12;
            q2();
            while (true) {
                int i14 = this.f125769h;
                if (i13 <= i14) {
                    value.get(this.f125768g, 0, i13);
                    this.f125770i = i13;
                    this.f125771j += i13;
                    return;
                } else {
                    value.get(this.f125768g, 0, i14);
                    this.f125781k.write(this.f125768g, 0, this.f125769h);
                    int i15 = this.f125769h;
                    i13 -= i15;
                    this.f125771j += i15;
                }
            }
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void V(byte[] value, int offset, int length) throws IOException {
            int i10 = this.f125769h;
            int i11 = this.f125770i;
            if (i10 - i11 >= length) {
                System.arraycopy(value, offset, this.f125768g, i11, length);
                this.f125770i += length;
                this.f125771j += length;
                return;
            }
            int i12 = i10 - i11;
            System.arraycopy(value, offset, this.f125768g, i11, i12);
            int i13 = offset + i12;
            int i14 = length - i12;
            this.f125770i = this.f125769h;
            this.f125771j += i12;
            q2();
            if (i14 <= this.f125769h) {
                System.arraycopy(value, i13, this.f125768g, 0, i14);
                this.f125770i = i14;
            } else {
                this.f125781k.write(value, i13, i14);
            }
            this.f125771j += i14;
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void W(ByteBuffer value) throws IOException {
            U(value);
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void X(byte[] value, int offset, int length) throws IOException {
            V(value, offset, length);
        }

        @Override // com.google.protobuf.b0
        public void Y1(final int fieldNumber, final u value) throws IOException {
            g2(1, 3);
            l(2, fieldNumber);
            N(3, value);
            g2(1, 4);
        }

        @Override // com.google.protobuf.b0
        public void c(final int fieldNumber, final int value) throws IOException {
            r2(14);
            n2(fieldNumber, 5);
            k2(value);
        }

        @Override // com.google.protobuf.b0
        public void e(final int fieldNumber, final String value) throws IOException {
            g2(fieldNumber, 2);
            f2(value);
        }

        @Override // com.google.protobuf.b0
        public void e1() throws IOException {
            if (this.f125770i > 0) {
                q2();
            }
        }

        @Override // com.google.protobuf.b0
        public void f(final int fieldNumber, final long value) throws IOException {
            r2(20);
            n2(fieldNumber, 0);
            p2(value);
        }

        @Override // com.google.protobuf.b0
        public void f2(String value) throws IOException {
            int iK;
            try {
                int length = value.length() * 3;
                int iZ0 = b0.Z0(length);
                int i10 = iZ0 + length;
                int i11 = this.f125769h;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int i12 = u4.i(value, bArr, 0, length);
                    h2(i12);
                    X(bArr, 0, i12);
                    return;
                }
                if (i10 > i11 - this.f125770i) {
                    q2();
                }
                int iZ1 = b0.Z0(value.length());
                int i13 = this.f125770i;
                try {
                    if (iZ1 == iZ0) {
                        int i14 = i13 + iZ1;
                        this.f125770i = i14;
                        int i15 = u4.i(value, this.f125768g, i14, this.f125769h - i14);
                        this.f125770i = i13;
                        iK = (i15 - i13) - iZ1;
                        o2(iK);
                        this.f125770i = i15;
                    } else {
                        iK = u4.k(value);
                        o2(iK);
                        this.f125770i = u4.i(value, this.f125768g, this.f125770i, iK);
                    }
                    this.f125771j += iK;
                } catch (u4.d e10) {
                    this.f125771j -= this.f125770i - i13;
                    this.f125770i = i13;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new f(e11);
                }
            } catch (u4.d e12) {
                g1(value, e12);
            }
        }

        @Override // com.google.protobuf.b0
        public void g2(final int fieldNumber, final int wireType) throws IOException {
            h2(x4.c(fieldNumber, wireType));
        }

        @Override // com.google.protobuf.b0
        public void h(final int fieldNumber, final int value) throws IOException {
            r2(20);
            n2(fieldNumber, 0);
            m2(value);
        }

        @Override // com.google.protobuf.b0
        public void h2(int value) throws IOException {
            r2(5);
            o2(value);
        }

        @Override // com.google.protobuf.b0
        public void i2(long value) throws IOException {
            r2(10);
            p2(value);
        }

        @Override // com.google.protobuf.b0
        public void l(final int fieldNumber, final int value) throws IOException {
            r2(20);
            n2(fieldNumber, 0);
            o2(value);
        }

        @Override // com.google.protobuf.b0
        public void n(final int fieldNumber, final long value) throws IOException {
            r2(18);
            n2(fieldNumber, 1);
            l2(value);
        }

        @Override // com.google.protobuf.b0
        public void p(int i10, boolean z10) throws IOException {
            r2(11);
            n2(i10, 0);
            j2(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.b0
        public void u1(final int fieldNumber, final byte[] value) throws IOException {
            v1(fieldNumber, value, 0, value.length);
        }

        @Override // com.google.protobuf.b0
        public void v1(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            g2(fieldNumber, 2);
            x1(value, offset, length);
        }

        @Override // com.google.protobuf.b0
        public void x1(final byte[] value, int offset, int length) throws IOException {
            h2(length);
            V(value, offset, length);
        }

        @Override // com.google.protobuf.b0
        public void y1(final int fieldNumber, final ByteBuffer value) throws IOException {
            g2(fieldNumber, 2);
            h2(value.capacity());
            T1(value);
        }

        @Override // com.google.protobuf.b0
        public void z1(final u value) throws IOException {
            h2(value.size());
            value.G0(this);
        }
    }

    private static final class h extends b0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ByteBuffer f125782g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ByteBuffer f125783h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f125784i;

        h(ByteBuffer buffer) {
            super();
            this.f125782g = buffer;
            this.f125783h = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f125784i = buffer.position();
        }

        private void j2(String value) throws IOException {
            try {
                u4.j(value, this.f125783h);
            } catch (IndexOutOfBoundsException e10) {
                throw new f(e10);
            }
        }

        @Override // com.google.protobuf.b0
        public void C1(int value) throws IOException {
            try {
                this.f125783h.putInt(value);
            } catch (BufferOverflowException e10) {
                throw new f(e10);
            }
        }

        @Override // com.google.protobuf.b0
        public void D1(long value) throws IOException {
            try {
                this.f125783h.putLong(value);
            } catch (BufferOverflowException e10) {
                throw new f(e10);
            }
        }

        @Override // com.google.protobuf.b0
        public void J1(int value) throws IOException {
            if (value >= 0) {
                h2(value);
            } else {
                i2(value);
            }
        }

        @Override // com.google.protobuf.b0
        public void L1(final int fieldNumber, final n2 value) throws IOException {
            g2(fieldNumber, 2);
            N1(value);
        }

        @Override // com.google.protobuf.b0
        void M1(final int fieldNumber, final n2 value, o3 schema) throws IOException {
            g2(fieldNumber, 2);
            O1(value, schema);
        }

        @Override // com.google.protobuf.b0
        public void N(final int fieldNumber, final u value) throws IOException {
            g2(fieldNumber, 2);
            z1(value);
        }

        @Override // com.google.protobuf.b0
        public void N1(final n2 value) throws IOException {
            h2(value.w1());
            value.Nb(this);
        }

        @Override // com.google.protobuf.b0
        void O1(final n2 value, o3 schema) throws IOException {
            h2(((com.google.protobuf.a) value).I3(schema));
            schema.h(value, this.f125766a);
        }

        @Override // com.google.protobuf.b0
        public void P1(final int fieldNumber, final n2 value) throws IOException {
            g2(1, 3);
            l(2, fieldNumber);
            L1(3, value);
            g2(1, 4);
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void T(byte value) throws IOException {
            try {
                this.f125783h.put(value);
            } catch (BufferOverflowException e10) {
                throw new f(e10);
            }
        }

        @Override // com.google.protobuf.b0
        public void T1(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                V(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = value.duplicate();
            v1.a(byteBufferDuplicate);
            U(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void U(ByteBuffer value) throws IOException {
            try {
                this.f125783h.put(value);
            } catch (BufferOverflowException e10) {
                throw new f(e10);
            }
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void V(byte[] value, int offset, int length) throws IOException {
            try {
                this.f125783h.put(value, offset, length);
            } catch (IndexOutOfBoundsException e10) {
                throw new f(e10);
            } catch (BufferOverflowException e11) {
                throw new f(e11);
            }
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void W(ByteBuffer value) throws IOException {
            U(value);
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void X(byte[] value, int offset, int length) throws IOException {
            V(value, offset, length);
        }

        @Override // com.google.protobuf.b0
        public void Y1(final int fieldNumber, final u value) throws IOException {
            g2(1, 3);
            l(2, fieldNumber);
            N(3, value);
            g2(1, 4);
        }

        @Override // com.google.protobuf.b0
        public void c(final int fieldNumber, final int value) throws IOException {
            g2(fieldNumber, 5);
            C1(value);
        }

        @Override // com.google.protobuf.b0
        public void e(final int fieldNumber, final String value) throws IOException {
            g2(fieldNumber, 2);
            f2(value);
        }

        @Override // com.google.protobuf.b0
        public void e1() {
            v1.e(this.f125782g, this.f125783h.position());
        }

        @Override // com.google.protobuf.b0
        public void f(final int fieldNumber, final long value) throws IOException {
            g2(fieldNumber, 0);
            i2(value);
        }

        @Override // com.google.protobuf.b0
        public int f1() {
            return this.f125783h.position() - this.f125784i;
        }

        @Override // com.google.protobuf.b0
        public void f2(String value) throws IOException {
            int iPosition = this.f125783h.position();
            try {
                int iZ0 = b0.Z0(value.length() * 3);
                int iZ1 = b0.Z0(value.length());
                if (iZ1 != iZ0) {
                    h2(u4.k(value));
                    j2(value);
                    return;
                }
                int iPosition2 = this.f125783h.position() + iZ1;
                v1.e(this.f125783h, iPosition2);
                j2(value);
                int iPosition3 = this.f125783h.position();
                v1.e(this.f125783h, iPosition);
                h2(iPosition3 - iPosition2);
                v1.e(this.f125783h, iPosition3);
            } catch (u4.d e10) {
                v1.e(this.f125783h, iPosition);
                g1(value, e10);
            } catch (IllegalArgumentException e11) {
                throw new f(e11);
            }
        }

        @Override // com.google.protobuf.b0
        public void g2(final int fieldNumber, final int wireType) throws IOException {
            h2(x4.c(fieldNumber, wireType));
        }

        @Override // com.google.protobuf.b0
        public void h(final int fieldNumber, final int value) throws IOException {
            g2(fieldNumber, 0);
            J1(value);
        }

        @Override // com.google.protobuf.b0
        public void h2(int value) throws IOException {
            while ((value & (-128)) != 0) {
                try {
                    this.f125783h.put((byte) ((value & 127) | 128));
                    value >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new f(e10);
                }
            }
            this.f125783h.put((byte) value);
        }

        @Override // com.google.protobuf.b0
        public void i2(long value) throws IOException {
            while (((-128) & value) != 0) {
                try {
                    this.f125783h.put((byte) ((((int) value) & 127) | 128));
                    value >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new f(e10);
                }
            }
            this.f125783h.put((byte) value);
        }

        @Override // com.google.protobuf.b0
        public void l(final int fieldNumber, final int value) throws IOException {
            g2(fieldNumber, 0);
            h2(value);
        }

        @Override // com.google.protobuf.b0
        public void n(final int fieldNumber, final long value) throws IOException {
            g2(fieldNumber, 1);
            D1(value);
        }

        @Override // com.google.protobuf.b0
        public void p(int i10, boolean z10) throws IOException {
            g2(i10, 0);
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.b0
        public int r1() {
            return this.f125783h.remaining();
        }

        @Override // com.google.protobuf.b0
        public void u1(final int fieldNumber, final byte[] value) throws IOException {
            v1(fieldNumber, value, 0, value.length);
        }

        @Override // com.google.protobuf.b0
        public void v1(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            g2(fieldNumber, 2);
            x1(value, offset, length);
        }

        @Override // com.google.protobuf.b0
        public void x1(final byte[] value, int offset, int length) throws IOException {
            h2(length);
            V(value, offset, length);
        }

        @Override // com.google.protobuf.b0
        public void y1(final int fieldNumber, final ByteBuffer value) throws IOException {
            g2(fieldNumber, 2);
            h2(value.capacity());
            T1(value);
        }

        @Override // com.google.protobuf.b0
        public void z1(final u value) throws IOException {
            h2(value.size());
            value.G0(this);
        }
    }

    private static final class i extends b0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ByteBuffer f125785g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ByteBuffer f125786h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f125787i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f125788j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final long f125789k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final long f125790l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f125791m;

        i(ByteBuffer buffer) {
            super();
            this.f125785g = buffer;
            this.f125786h = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jK = t4.k(buffer);
            this.f125787i = jK;
            long jPosition = ((long) buffer.position()) + jK;
            this.f125788j = jPosition;
            long jLimit = jK + ((long) buffer.limit());
            this.f125789k = jLimit;
            this.f125790l = jLimit - 10;
            this.f125791m = jPosition;
        }

        private int j2(long pos) {
            return (int) (pos - this.f125787i);
        }

        static boolean k2() {
            return t4.V();
        }

        private void l2(long pos) {
            v1.e(this.f125786h, j2(pos));
        }

        @Override // com.google.protobuf.b0
        public void C1(int value) throws IOException {
            this.f125786h.putInt(j2(this.f125791m), value);
            this.f125791m += 4;
        }

        @Override // com.google.protobuf.b0
        public void D1(long value) throws IOException {
            this.f125786h.putLong(j2(this.f125791m), value);
            this.f125791m += 8;
        }

        @Override // com.google.protobuf.b0
        public void J1(int value) throws IOException {
            if (value >= 0) {
                h2(value);
            } else {
                i2(value);
            }
        }

        @Override // com.google.protobuf.b0
        public void L1(int fieldNumber, n2 value) throws IOException {
            g2(fieldNumber, 2);
            N1(value);
        }

        @Override // com.google.protobuf.b0
        void M1(int fieldNumber, n2 value, o3 schema) throws IOException {
            g2(fieldNumber, 2);
            O1(value, schema);
        }

        @Override // com.google.protobuf.b0
        public void N(int fieldNumber, u value) throws IOException {
            g2(fieldNumber, 2);
            z1(value);
        }

        @Override // com.google.protobuf.b0
        public void N1(n2 value) throws IOException {
            h2(value.w1());
            value.Nb(this);
        }

        @Override // com.google.protobuf.b0
        void O1(n2 value, o3 schema) throws IOException {
            h2(((com.google.protobuf.a) value).I3(schema));
            schema.h(value, this.f125766a);
        }

        @Override // com.google.protobuf.b0
        public void P1(int fieldNumber, n2 value) throws IOException {
            g2(1, 3);
            l(2, fieldNumber);
            L1(3, value);
            g2(1, 4);
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void T(byte value) throws IOException {
            long j10 = this.f125791m;
            if (j10 >= this.f125789k) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f125791m), Long.valueOf(this.f125789k), 1));
            }
            this.f125791m = 1 + j10;
            t4.e0(j10, value);
        }

        @Override // com.google.protobuf.b0
        public void T1(ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                V(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = value.duplicate();
            v1.a(byteBufferDuplicate);
            U(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void U(ByteBuffer value) throws IOException {
            try {
                int iRemaining = value.remaining();
                l2(this.f125791m);
                this.f125786h.put(value);
                this.f125791m += (long) iRemaining;
            } catch (BufferOverflowException e10) {
                throw new f(e10);
            }
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void V(byte[] value, int offset, int length) throws IOException {
            if (value != null && offset >= 0 && length >= 0 && value.length - length >= offset) {
                long j10 = length;
                long j11 = this.f125789k - j10;
                long j12 = this.f125791m;
                if (j11 >= j12) {
                    t4.q(value, offset, j12, j10);
                    this.f125791m += j10;
                    return;
                }
            }
            if (value != null) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f125791m), Long.valueOf(this.f125789k), Integer.valueOf(length)));
            }
            throw new NullPointerException("value");
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void W(ByteBuffer value) throws IOException {
            U(value);
        }

        @Override // com.google.protobuf.b0, com.google.protobuf.t
        public void X(byte[] value, int offset, int length) throws IOException {
            V(value, offset, length);
        }

        @Override // com.google.protobuf.b0
        public void Y1(int fieldNumber, u value) throws IOException {
            g2(1, 3);
            l(2, fieldNumber);
            N(3, value);
            g2(1, 4);
        }

        @Override // com.google.protobuf.b0
        public void c(int fieldNumber, int value) throws IOException {
            g2(fieldNumber, 5);
            C1(value);
        }

        @Override // com.google.protobuf.b0
        public void e(int fieldNumber, String value) throws IOException {
            g2(fieldNumber, 2);
            f2(value);
        }

        @Override // com.google.protobuf.b0
        public void e1() {
            v1.e(this.f125785g, j2(this.f125791m));
        }

        @Override // com.google.protobuf.b0
        public void f(int fieldNumber, long value) throws IOException {
            g2(fieldNumber, 0);
            i2(value);
        }

        @Override // com.google.protobuf.b0
        public int f1() {
            return (int) (this.f125791m - this.f125788j);
        }

        @Override // com.google.protobuf.b0
        public void f2(String value) throws IOException {
            long j10 = this.f125791m;
            try {
                int iZ0 = b0.Z0(value.length() * 3);
                int iZ1 = b0.Z0(value.length());
                if (iZ1 != iZ0) {
                    int iK = u4.k(value);
                    h2(iK);
                    l2(this.f125791m);
                    u4.j(value, this.f125786h);
                    this.f125791m += (long) iK;
                    return;
                }
                int iJ2 = j2(this.f125791m) + iZ1;
                v1.e(this.f125786h, iJ2);
                u4.j(value, this.f125786h);
                int iPosition = this.f125786h.position() - iJ2;
                h2(iPosition);
                this.f125791m += (long) iPosition;
            } catch (u4.d e10) {
                this.f125791m = j10;
                l2(j10);
                g1(value, e10);
            } catch (IllegalArgumentException e11) {
                throw new f(e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new f(e12);
            }
        }

        @Override // com.google.protobuf.b0
        public void g2(int fieldNumber, int wireType) throws IOException {
            h2(x4.c(fieldNumber, wireType));
        }

        @Override // com.google.protobuf.b0
        public void h(int fieldNumber, int value) throws IOException {
            g2(fieldNumber, 0);
            J1(value);
        }

        @Override // com.google.protobuf.b0
        public void h2(int value) throws IOException {
            if (this.f125791m <= this.f125790l) {
                while ((value & (-128)) != 0) {
                    long j10 = this.f125791m;
                    this.f125791m = j10 + 1;
                    t4.e0(j10, (byte) ((value & 127) | 128));
                    value >>>= 7;
                }
                long j11 = this.f125791m;
                this.f125791m = 1 + j11;
                t4.e0(j11, (byte) value);
                return;
            }
            while (true) {
                long j12 = this.f125791m;
                if (j12 >= this.f125789k) {
                    throw new f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f125791m), Long.valueOf(this.f125789k), 1));
                }
                if ((value & (-128)) == 0) {
                    this.f125791m = 1 + j12;
                    t4.e0(j12, (byte) value);
                    return;
                } else {
                    this.f125791m = j12 + 1;
                    t4.e0(j12, (byte) ((value & 127) | 128));
                    value >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.b0
        public void i2(long value) throws IOException {
            if (this.f125791m <= this.f125790l) {
                while ((value & (-128)) != 0) {
                    long j10 = this.f125791m;
                    this.f125791m = j10 + 1;
                    t4.e0(j10, (byte) ((((int) value) & 127) | 128));
                    value >>>= 7;
                }
                long j11 = this.f125791m;
                this.f125791m = 1 + j11;
                t4.e0(j11, (byte) value);
                return;
            }
            while (true) {
                long j12 = this.f125791m;
                if (j12 >= this.f125789k) {
                    throw new f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f125791m), Long.valueOf(this.f125789k), 1));
                }
                if ((value & (-128)) == 0) {
                    this.f125791m = 1 + j12;
                    t4.e0(j12, (byte) value);
                    return;
                } else {
                    this.f125791m = j12 + 1;
                    t4.e0(j12, (byte) ((((int) value) & 127) | 128));
                    value >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.b0
        public void l(int fieldNumber, int value) throws IOException {
            g2(fieldNumber, 0);
            h2(value);
        }

        @Override // com.google.protobuf.b0
        public void n(int fieldNumber, long value) throws IOException {
            g2(fieldNumber, 1);
            D1(value);
        }

        @Override // com.google.protobuf.b0
        public void p(int i10, boolean z10) throws IOException {
            g2(i10, 0);
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.b0
        public int r1() {
            return (int) (this.f125789k - this.f125791m);
        }

        @Override // com.google.protobuf.b0
        public void u1(int fieldNumber, byte[] value) throws IOException {
            v1(fieldNumber, value, 0, value.length);
        }

        @Override // com.google.protobuf.b0
        public void v1(int fieldNumber, byte[] value, int offset, int length) throws IOException {
            g2(fieldNumber, 2);
            x1(value, offset, length);
        }

        @Override // com.google.protobuf.b0
        public void x1(byte[] value, int offset, int length) throws IOException {
            h2(length);
            V(value, offset, length);
        }

        @Override // com.google.protobuf.b0
        public void y1(int fieldNumber, ByteBuffer value) throws IOException {
            g2(fieldNumber, 2);
            h2(value.capacity());
            T1(value);
        }

        @Override // com.google.protobuf.b0
        public void z1(u value) throws IOException {
            h2(value.size());
            value.G0(this);
        }
    }

    public static int A0(final int fieldNumber, final y1 value) {
        return (X0(1) * 2) + Y0(2, fieldNumber) + B0(3, value);
    }

    public static int B0(final int fieldNumber, final y1 value) {
        return X0(fieldNumber) + C0(value);
    }

    public static int C0(final y1 value) {
        return D0(value.f());
    }

    static int D0(int fieldLength) {
        return Z0(fieldLength) + fieldLength;
    }

    public static int E0(final int fieldNumber, final n2 value) {
        return (X0(1) * 2) + Y0(2, fieldNumber) + F0(3, value);
    }

    public static int F0(final int fieldNumber, final n2 value) {
        return X0(fieldNumber) + H0(value);
    }

    static int G0(final int fieldNumber, final n2 value, final o3 schema) {
        return X0(fieldNumber) + I0(value, schema);
    }

    public static int H0(final n2 value) {
        return D0(value.w1());
    }

    static int I0(final n2 value, final o3 schema) {
        return D0(((com.google.protobuf.a) value).I3(schema));
    }

    static int J0(int dataLength) {
        if (dataLength > 4096) {
            return 4096;
        }
        return dataLength;
    }

    public static int K0(final int fieldNumber, final u value) {
        return (X0(1) * 2) + Y0(2, fieldNumber) + g0(3, value);
    }

    @m1(imports = {"com.google.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt32SizeNoTag(value)")
    @Deprecated
    public static int L0(final int value) {
        return Z0(value);
    }

    @m1(imports = {"com.google.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt64SizeNoTag(value)")
    @Deprecated
    public static int M0(long value) {
        return b1(value);
    }

    public static int N0(final int fieldNumber, final int value) {
        return X0(fieldNumber) + O0(value);
    }

    public static int O0(final int unused) {
        return 4;
    }

    public static int P0(final int fieldNumber, final long value) {
        return X0(fieldNumber) + Q0(value);
    }

    public static int Q0(final long unused) {
        return 8;
    }

    public static int R0(final int fieldNumber, final int value) {
        return X0(fieldNumber) + S0(value);
    }

    public static int S0(final int value) {
        return Z0(c1(value));
    }

    public static int T0(final int fieldNumber, final long value) {
        return X0(fieldNumber) + U0(value);
    }

    public static int U0(final long value) {
        return b1(d1(value));
    }

    public static int V0(final int fieldNumber, final String value) {
        return X0(fieldNumber) + W0(value);
    }

    public static int W0(final String value) {
        int length;
        try {
            length = u4.k(value);
        } catch (u4.d unused) {
            length = value.getBytes(s1.f126324b).length;
        }
        return D0(length);
    }

    public static int X0(final int fieldNumber) {
        return Z0(x4.c(fieldNumber, 0));
    }

    public static int Y0(final int fieldNumber, final int value) {
        return X0(fieldNumber) + Z0(value);
    }

    public static int Z0(final int value) {
        if ((value & (-128)) == 0) {
            return 1;
        }
        if ((value & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & value) == 0) {
            return 3;
        }
        return (value & (-268435456)) == 0 ? 4 : 5;
    }

    public static int a0(final int fieldNumber, final boolean value) {
        return X0(fieldNumber) + b0(value);
    }

    public static int a1(final int fieldNumber, final long value) {
        return X0(fieldNumber) + b1(value);
    }

    public static int b0(final boolean unused) {
        return 1;
    }

    public static int b1(long value) {
        int i10;
        if (((-128) & value) == 0) {
            return 1;
        }
        if (value < 0) {
            return 10;
        }
        if (((-34359738368L) & value) != 0) {
            value >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & value) != 0) {
            i10 += 2;
            value >>>= 14;
        }
        return (value & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int c0(final int fieldNumber, final byte[] value) {
        return X0(fieldNumber) + d0(value);
    }

    public static int c1(final int n10) {
        return (n10 >> 31) ^ (n10 << 1);
    }

    public static int d0(final byte[] value) {
        return D0(value.length);
    }

    public static long d1(final long n10) {
        return (n10 >> 63) ^ (n10 << 1);
    }

    public static int e0(final int fieldNumber, final ByteBuffer value) {
        return X0(fieldNumber) + f0(value);
    }

    public static int f0(final ByteBuffer value) {
        return D0(value.capacity());
    }

    public static int g0(final int fieldNumber, final u value) {
        return X0(fieldNumber) + h0(value);
    }

    public static int h0(final u value) {
        return D0(value.size());
    }

    public static int i0(final int fieldNumber, final double value) {
        return X0(fieldNumber) + j0(value);
    }

    static b0 i1(t byteOutput, int bufferSize) {
        if (bufferSize >= 0) {
            return new d(byteOutput, bufferSize);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }

    public static int j0(final double unused) {
        return 8;
    }

    public static b0 j1(final OutputStream output) {
        return k1(output, 4096);
    }

    public static int k0(final int fieldNumber, final int value) {
        return X0(fieldNumber) + l0(value);
    }

    public static b0 k1(final OutputStream output, final int bufferSize) {
        return new g(output, bufferSize);
    }

    public static int l0(final int value) {
        return x0(value);
    }

    public static b0 l1(ByteBuffer buffer) {
        if (buffer.hasArray()) {
            return new e(buffer);
        }
        if (!buffer.isDirect() || buffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return i.k2() ? q1(buffer) : p1(buffer);
    }

    public static int m0(final int fieldNumber, final int value) {
        return X0(fieldNumber) + n0(value);
    }

    @Deprecated
    public static b0 m1(ByteBuffer byteBuffer, int unused) {
        return l1(byteBuffer);
    }

    public static int n0(final int unused) {
        return 4;
    }

    public static b0 n1(final byte[] flatArray) {
        return o1(flatArray, 0, flatArray.length);
    }

    public static int o0(final int fieldNumber, final long value) {
        return X0(fieldNumber) + p0(value);
    }

    public static b0 o1(final byte[] flatArray, final int offset, final int length) {
        return new c(flatArray, offset, length);
    }

    public static int p0(final long unused) {
        return 8;
    }

    static b0 p1(ByteBuffer buffer) {
        return new h(buffer);
    }

    public static int q0(final int fieldNumber, final float value) {
        return X0(fieldNumber) + r0(value);
    }

    static b0 q1(ByteBuffer buffer) {
        return new i(buffer);
    }

    public static int r0(final float unused) {
        return 4;
    }

    @Deprecated
    public static int s0(final int fieldNumber, final n2 value) {
        return (X0(fieldNumber) * 2) + value.w1();
    }

    @Deprecated
    static int t0(final int fieldNumber, final n2 value, o3 schema) {
        return (X0(fieldNumber) * 2) + v0(value, schema);
    }

    @m1(replacement = "value.getSerializedSize()")
    @Deprecated
    public static int u0(final n2 value) {
        return value.w1();
    }

    @Deprecated
    static int v0(final n2 value, o3 schema) {
        return ((com.google.protobuf.a) value).I3(schema);
    }

    public static int w0(final int fieldNumber, final int value) {
        return X0(fieldNumber) + x0(value);
    }

    public static int x0(final int value) {
        if (value >= 0) {
            return Z0(value);
        }
        return 10;
    }

    public static int y0(final int fieldNumber, final long value) {
        return X0(fieldNumber) + z0(value);
    }

    public static int z0(final long value) {
        return b1(value);
    }

    public final void A1(final double value) throws IOException {
        D1(Double.doubleToRawLongBits(value));
    }

    public final void B(final int fieldNumber, final double value) throws IOException {
        n(fieldNumber, Double.doubleToRawLongBits(value));
    }

    public final void B1(final int value) throws IOException {
        J1(value);
    }

    public abstract void C1(int value) throws IOException;

    public abstract void D1(long value) throws IOException;

    public final void E1(final float value) throws IOException {
        C1(Float.floatToRawIntBits(value));
    }

    public final void F(final int fieldNumber, final long value) throws IOException {
        f(fieldNumber, value);
    }

    @Deprecated
    public final void F1(final int fieldNumber, final n2 value) throws IOException {
        g2(fieldNumber, 3);
        H1(value);
        g2(fieldNumber, 4);
    }

    @Deprecated
    final void G1(final int fieldNumber, final n2 value, o3 schema) throws IOException {
        g2(fieldNumber, 3);
        I1(value, schema);
        g2(fieldNumber, 4);
    }

    @Deprecated
    public final void H1(final n2 value) throws IOException {
        value.Nb(this);
    }

    @Deprecated
    final void I1(final n2 value, o3 schema) throws IOException {
        schema.h(value, this.f125766a);
    }

    public final void J(final int fieldNumber, final float value) throws IOException {
        c(fieldNumber, Float.floatToRawIntBits(value));
    }

    public abstract void J1(final int value) throws IOException;

    public final void K(final int fieldNumber, final int value) throws IOException {
        h(fieldNumber, value);
    }

    public final void K1(final long value) throws IOException {
        i2(value);
    }

    public abstract void L1(final int fieldNumber, final n2 value) throws IOException;

    public final void M(final int fieldNumber, final int value) throws IOException {
        l(fieldNumber, c1(value));
    }

    abstract void M1(final int fieldNumber, final n2 value, o3 schema) throws IOException;

    public abstract void N(int fieldNumber, u value) throws IOException;

    public abstract void N1(final n2 value) throws IOException;

    abstract void O1(final n2 value, o3 schema) throws IOException;

    public abstract void P1(final int fieldNumber, final n2 value) throws IOException;

    public final void Q1(final byte value) throws IOException {
        T(value);
    }

    public final void R1(final int value) throws IOException {
        T((byte) value);
    }

    public final void S1(final u value) throws IOException {
        value.G0(this);
    }

    @Override // com.google.protobuf.t
    public abstract void T(byte value) throws IOException;

    public abstract void T1(final ByteBuffer value) throws IOException;

    @Override // com.google.protobuf.t
    public abstract void U(ByteBuffer value) throws IOException;

    public final void U1(final byte[] value) throws IOException {
        V(value, 0, value.length);
    }

    @Override // com.google.protobuf.t
    public abstract void V(byte[] value, int offset, int length) throws IOException;

    public final void V1(final byte[] value, int offset, int length) throws IOException {
        V(value, offset, length);
    }

    @Override // com.google.protobuf.t
    public abstract void W(ByteBuffer value) throws IOException;

    @m1(replacement = "this.writeFixed32NoTag(value)")
    @Deprecated
    public final void W1(final int value) throws IOException {
        C1(value);
    }

    @Override // com.google.protobuf.t
    public abstract void X(byte[] value, int offset, int length) throws IOException;

    @m1(replacement = "this.writeFixed64NoTag(value)")
    @Deprecated
    public final void X1(final long value) throws IOException {
        D1(value);
    }

    public abstract void Y1(final int fieldNumber, final u value) throws IOException;

    public final void Z() {
        if (r1() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @m1(replacement = "this.writeUInt32NoTag(value)")
    @Deprecated
    public final void Z1(int value) throws IOException {
        h2(value);
    }

    @m1(replacement = "this.writeUInt64NoTag(value)")
    @Deprecated
    public final void a2(long value) throws IOException {
        i2(value);
    }

    public final void b2(final int value) throws IOException {
        C1(value);
    }

    public abstract void c(int fieldNumber, int value) throws IOException;

    public final void c2(final long value) throws IOException {
        D1(value);
    }

    public final void d2(final int value) throws IOException {
        h2(c1(value));
    }

    public abstract void e(int fieldNumber, String value) throws IOException;

    public abstract void e1() throws IOException;

    public final void e2(final long value) throws IOException {
        i2(d1(value));
    }

    public abstract void f(int fieldNumber, long value) throws IOException;

    public abstract int f1();

    public abstract void f2(String value) throws IOException;

    final void g1(String value, u4.d cause) throws IOException {
        f125762c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) cause);
        byte[] bytes = value.getBytes(s1.f126324b);
        try {
            h2(bytes.length);
            X(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new f(e10);
        }
    }

    public abstract void g2(int fieldNumber, int wireType) throws IOException;

    public abstract void h(int fieldNumber, int value) throws IOException;

    boolean h1() {
        return this.f125767b;
    }

    public abstract void h2(int value) throws IOException;

    public abstract void i2(long value) throws IOException;

    public final void k(final int fieldNumber, final long value) throws IOException {
        f(fieldNumber, d1(value));
    }

    public abstract void l(int fieldNumber, int value) throws IOException;

    public abstract void n(int fieldNumber, long value) throws IOException;

    public abstract void p(int fieldNumber, boolean value) throws IOException;

    public final void q(final int fieldNumber, final int value) throws IOException {
        c(fieldNumber, value);
    }

    public abstract int r1();

    public void s1() {
        this.f125767b = true;
    }

    public final void t1(boolean z10) throws IOException {
        T(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void u1(int fieldNumber, byte[] value) throws IOException;

    public abstract void v1(int fieldNumber, byte[] value, int offset, int length) throws IOException;

    public final void w1(final byte[] value) throws IOException {
        x1(value, 0, value.length);
    }

    abstract void x1(final byte[] value, final int offset, final int length) throws IOException;

    public final void y(final int fieldNumber, final long value) throws IOException {
        n(fieldNumber, value);
    }

    public abstract void y1(int fieldNumber, ByteBuffer value) throws IOException;

    public abstract void z1(final u value) throws IOException;

    private b0() {
    }
}
