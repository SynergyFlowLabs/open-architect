package io.grpc.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes13.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i2 f289302a = new c(new byte[0]);

    class a extends s0 {
        a(i2 i2Var) {
            super(i2Var);
        }

        @Override // io.grpc.internal.s0, io.grpc.internal.i2, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    private static class c extends io.grpc.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f289304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f289305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final byte[] f289306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f289307d;

        c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // io.grpc.internal.i2
        public void Ee(OutputStream outputStream, int i10) throws IOException {
            a(i10);
            outputStream.write(this.f289306c, this.f289304a, i10);
            this.f289304a += i10;
        }

        @Override // io.grpc.internal.i2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c l2(int i10) {
            a(i10);
            int i11 = this.f289304a;
            this.f289304a = i11 + i10;
            return new c(this.f289306c, i11, i10);
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public boolean dc() {
            return true;
        }

        @Override // io.grpc.internal.i2
        public void e7(byte[] bArr, int i10, int i11) {
            System.arraycopy(this.f289306c, this.f289304a, bArr, i10, i11);
            this.f289304a += i11;
        }

        @Override // io.grpc.internal.i2
        public void g5(ByteBuffer byteBuffer) {
            com.google.common.base.j0.F(byteBuffer, "dest");
            int iRemaining = byteBuffer.remaining();
            a(iRemaining);
            byteBuffer.put(this.f289306c, this.f289304a, iRemaining);
            this.f289304a += iRemaining;
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public byte[] ka() {
            return this.f289306c;
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public int l8() {
            return this.f289304a;
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public boolean markSupported() {
            return true;
        }

        @Override // io.grpc.internal.i2
        public int q0() {
            return this.f289305b - this.f289304a;
        }

        @Override // io.grpc.internal.i2
        public int readUnsignedByte() {
            a(1);
            byte[] bArr = this.f289306c;
            int i10 = this.f289304a;
            this.f289304a = i10 + 1;
            return bArr[i10] & 255;
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public void reset() {
            int i10 = this.f289307d;
            if (i10 == -1) {
                throw new InvalidMarkException();
            }
            this.f289304a = i10;
        }

        @Override // io.grpc.internal.i2
        public void skipBytes(int i10) {
            a(i10);
            this.f289304a += i10;
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public void u7() {
            this.f289307d = this.f289304a;
        }

        c(byte[] bArr, int i10, int i11) {
            this.f289307d = -1;
            com.google.common.base.j0.e(i10 >= 0, "offset must be >= 0");
            com.google.common.base.j0.e(i11 >= 0, "length must be >= 0");
            int i12 = i11 + i10;
            com.google.common.base.j0.e(i12 <= bArr.length, "offset + length exceeds array boundary");
            this.f289306c = (byte[]) com.google.common.base.j0.F(bArr, "bytes");
            this.f289304a = i10;
            this.f289305b = i12;
        }
    }

    private static class d extends io.grpc.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ByteBuffer f289308a;

        d(ByteBuffer byteBuffer) {
            this.f289308a = (ByteBuffer) com.google.common.base.j0.F(byteBuffer, "bytes");
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public boolean D0() {
            return true;
        }

        @Override // io.grpc.internal.i2
        public void Ee(OutputStream outputStream, int i10) throws IOException {
            a(i10);
            if (dc()) {
                outputStream.write(ka(), l8(), i10);
                ByteBuffer byteBuffer = this.f289308a;
                byteBuffer.position(byteBuffer.position() + i10);
            } else {
                byte[] bArr = new byte[i10];
                this.f289308a.get(bArr);
                outputStream.write(bArr);
            }
        }

        @Override // io.grpc.internal.i2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d l2(int i10) {
            a(i10);
            ByteBuffer byteBufferDuplicate = this.f289308a.duplicate();
            byteBufferDuplicate.limit(this.f289308a.position() + i10);
            ByteBuffer byteBuffer = this.f289308a;
            byteBuffer.position(byteBuffer.position() + i10);
            return new d(byteBufferDuplicate);
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public boolean dc() {
            return this.f289308a.hasArray();
        }

        @Override // io.grpc.internal.i2
        public void e7(byte[] bArr, int i10, int i11) {
            a(i11);
            this.f289308a.get(bArr, i10, i11);
        }

        @Override // io.grpc.internal.i2
        public void g5(ByteBuffer byteBuffer) {
            com.google.common.base.j0.F(byteBuffer, "dest");
            int iRemaining = byteBuffer.remaining();
            a(iRemaining);
            int iLimit = this.f289308a.limit();
            ByteBuffer byteBuffer2 = this.f289308a;
            byteBuffer2.limit(byteBuffer2.position() + iRemaining);
            byteBuffer.put(this.f289308a);
            this.f289308a.limit(iLimit);
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public ByteBuffer k1() {
            return this.f289308a.slice();
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public byte[] ka() {
            return this.f289308a.array();
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public int l8() {
            return this.f289308a.arrayOffset() + this.f289308a.position();
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public boolean markSupported() {
            return true;
        }

        @Override // io.grpc.internal.i2
        public int q0() {
            return this.f289308a.remaining();
        }

        @Override // io.grpc.internal.i2
        public int readUnsignedByte() {
            a(1);
            return this.f289308a.get() & 255;
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public void reset() {
            this.f289308a.reset();
        }

        @Override // io.grpc.internal.i2
        public void skipBytes(int i10) {
            a(i10);
            ByteBuffer byteBuffer = this.f289308a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public void u7() {
            this.f289308a.mark();
        }
    }

    private j2() {
    }

    public static i2 a() {
        return f289302a;
    }

    public static i2 b(i2 i2Var) {
        return new a(i2Var);
    }

    public static InputStream c(i2 i2Var, boolean z10) {
        if (!z10) {
            i2Var = b(i2Var);
        }
        return new b(i2Var);
    }

    public static byte[] d(i2 i2Var) {
        com.google.common.base.j0.F(i2Var, "buffer");
        int iQ0 = i2Var.q0();
        byte[] bArr = new byte[iQ0];
        i2Var.e7(bArr, 0, iQ0);
        return bArr;
    }

    public static String e(i2 i2Var, Charset charset) {
        com.google.common.base.j0.F(charset, hi.c.C1916c.f285814c);
        return new String(d(i2Var), charset);
    }

    public static String f(i2 i2Var) {
        return e(i2Var, com.google.common.base.f.f116532c);
    }

    public static i2 g(ByteBuffer byteBuffer) {
        return new d(byteBuffer);
    }

    public static i2 h(byte[] bArr) {
        int i10 = 1 << 0;
        return new c(bArr, 0, bArr.length);
    }

    public static i2 i(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    private static final class b extends InputStream implements io.grpc.n1, io.grpc.p0, io.grpc.b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private i2 f289303a;

        public b(i2 i2Var) {
            this.f289303a = (i2) com.google.common.base.j0.F(i2Var, "buffer");
        }

        @Override // io.grpc.p0
        public boolean D0() {
            return this.f289303a.D0();
        }

        @Override // java.io.InputStream, io.grpc.n1
        public int available() throws IOException {
            return this.f289303a.q0();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f289303a.close();
        }

        @Override // io.grpc.b0
        public InputStream detach() {
            i2 i2Var = this.f289303a;
            this.f289303a = i2Var.l2(0);
            return new b(i2Var);
        }

        @Override // io.grpc.p0
        @fj.h
        public ByteBuffer k1() {
            return this.f289303a.k1();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f289303a.u7();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f289303a.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f289303a.q0() == 0) {
                return -1;
            }
            return this.f289303a.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            this.f289303a.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j10) throws IOException {
            int iMin = (int) Math.min(this.f289303a.q0(), j10);
            this.f289303a.skipBytes(iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (this.f289303a.q0() == 0) {
                return -1;
            }
            int iMin = Math.min(this.f289303a.q0(), i11);
            this.f289303a.e7(bArr, i10, iMin);
            return iMin;
        }
    }
}
