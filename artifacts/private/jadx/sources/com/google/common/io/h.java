package com.google.common.io;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f118998a = 8192;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f118999b = 524288;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f119000c = 2147483639;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f119001d = 20;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final OutputStream f119002e = new a();

    class a extends OutputStream {
        a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int b10) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] b10) {
            com.google.common.base.j0.E(b10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b10, int off, int len) {
            com.google.common.base.j0.E(b10);
            com.google.common.base.j0.f0(off, len + off, b10.length);
        }
    }

    private h() {
    }

    private static byte[] a(Queue<byte[]> bufs, int totalLen) {
        if (bufs.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = bufs.remove();
        if (bArrRemove.length == totalLen) {
            return bArrRemove;
        }
        int length = totalLen - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, totalLen);
        while (length > 0) {
            byte[] bArrRemove2 = bufs.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, totalLen - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    @z7.a
    public static long b(InputStream from, OutputStream to) throws IOException {
        com.google.common.base.j0.E(from);
        com.google.common.base.j0.E(to);
        byte[] bArrD = d();
        long j10 = 0;
        while (true) {
            int i10 = from.read(bArrD);
            if (i10 == -1) {
                return j10;
            }
            to.write(bArrD, 0, i10);
            j10 += (long) i10;
        }
    }

    @z7.a
    public static long c(ReadableByteChannel from, WritableByteChannel to) throws IOException {
        com.google.common.base.j0.E(from);
        com.google.common.base.j0.E(to);
        long jWrite = 0;
        if (!(from instanceof FileChannel)) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(d());
            while (from.read(byteBufferWrap) != -1) {
                x.b(byteBufferWrap);
                while (byteBufferWrap.hasRemaining()) {
                    jWrite += (long) to.write(byteBufferWrap);
                }
                x.a(byteBufferWrap);
            }
            return jWrite;
        }
        FileChannel fileChannel = (FileChannel) from;
        long jPosition = fileChannel.position();
        long j10 = jPosition;
        while (true) {
            WritableByteChannel writableByteChannel = to;
            long jTransferTo = fileChannel.transferTo(j10, PlaybackStateCompat.f9656l3, writableByteChannel);
            j10 += jTransferTo;
            fileChannel.position(j10);
            if (jTransferTo <= 0 && j10 >= fileChannel.size()) {
                return j10 - jPosition;
            }
            to = writableByteChannel;
        }
    }

    static byte[] d() {
        return new byte[8192];
    }

    @z7.a
    public static long e(InputStream in) throws IOException {
        byte[] bArrD = d();
        long j10 = 0;
        while (true) {
            long j11 = in.read(bArrD);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    public static InputStream f(InputStream in, long limit) {
        return new d(in, limit);
    }

    public static com.google.common.io.c g(ByteArrayInputStream byteArrayInputStream) {
        return new b((ByteArrayInputStream) com.google.common.base.j0.E(byteArrayInputStream));
    }

    public static com.google.common.io.c h(byte[] bytes) {
        return g(new ByteArrayInputStream(bytes));
    }

    public static com.google.common.io.c i(byte[] bytes, int start) {
        com.google.common.base.j0.d0(start, bytes.length);
        return g(new ByteArrayInputStream(bytes, start, bytes.length - start));
    }

    public static com.google.common.io.d j() {
        return l(new ByteArrayOutputStream());
    }

    public static com.google.common.io.d k(int size) {
        if (size >= 0) {
            return l(new ByteArrayOutputStream(size));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", Integer.valueOf(size)));
    }

    public static com.google.common.io.d l(ByteArrayOutputStream byteArrayOutputStream) {
        return new c((ByteArrayOutputStream) com.google.common.base.j0.E(byteArrayOutputStream));
    }

    public static OutputStream m() {
        return f119002e;
    }

    @z7.a
    public static int n(InputStream in, byte[] b10, int off, int len) throws IOException {
        com.google.common.base.j0.E(in);
        com.google.common.base.j0.E(b10);
        if (len < 0) {
            throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(len)));
        }
        com.google.common.base.j0.f0(off, off + len, b10.length);
        int i10 = 0;
        while (i10 < len) {
            int i11 = in.read(b10, off + i10, len - i10);
            if (i11 == -1) {
                break;
            }
            i10 += i11;
        }
        return i10;
    }

    @z7.a
    @f0
    public static <T> T o(InputStream input, e<T> processor) throws IOException {
        int i10;
        com.google.common.base.j0.E(input);
        com.google.common.base.j0.E(processor);
        byte[] bArrD = d();
        do {
            i10 = input.read(bArrD);
            if (i10 == -1) {
                break;
            }
        } while (processor.a(bArrD, 0, i10));
        return processor.getResult();
    }

    public static void p(InputStream in, byte[] b10) throws IOException {
        q(in, b10, 0, b10.length);
    }

    public static void q(InputStream in, byte[] b10, int off, int len) throws IOException {
        int iN = n(in, b10, off, len);
        if (iN == len) {
            return;
        }
        throw new EOFException("reached end of stream after reading " + iN + " bytes; " + len + " bytes expected");
    }

    public static void r(InputStream in, long n10) throws IOException {
        long jT = t(in, n10);
        if (jT >= n10) {
            return;
        }
        throw new EOFException("reached end of stream after skipping " + jT + " bytes; " + n10 + " bytes expected");
    }

    private static long s(InputStream in, long n10) throws IOException {
        int iAvailable = in.available();
        if (iAvailable == 0) {
            return 0L;
        }
        return in.skip(Math.min(iAvailable, n10));
    }

    static long t(InputStream in, long n10) throws IOException {
        byte[] bArr = null;
        long j10 = 0;
        while (j10 < n10) {
            long j11 = n10 - j10;
            long jS = s(in, j11);
            if (jS == 0) {
                int iMin = (int) Math.min(j11, PlaybackStateCompat.f9665p2);
                if (bArr == null) {
                    bArr = new byte[iMin];
                }
                jS = in.read(bArr, 0, iMin);
                if (jS == -1) {
                    break;
                }
            }
            j10 += jS;
        }
        return j10;
    }

    public static byte[] u(InputStream in) throws IOException {
        com.google.common.base.j0.E(in);
        return w(in, new ArrayDeque(20), 0);
    }

    static byte[] v(InputStream in, long expectedSize) throws IOException {
        com.google.common.base.j0.p(expectedSize >= 0, "expectedSize (%s) must be non-negative", expectedSize);
        if (expectedSize > 2147483639) {
            throw new OutOfMemoryError(expectedSize + " bytes is too large to fit in a byte array");
        }
        int i10 = (int) expectedSize;
        byte[] bArr = new byte[i10];
        int i11 = i10;
        while (i11 > 0) {
            int i12 = i10 - i11;
            int i13 = in.read(bArr, i12, i11);
            if (i13 == -1) {
                return Arrays.copyOf(bArr, i12);
            }
            i11 -= i13;
        }
        int i14 = in.read();
        if (i14 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) i14});
        return w(in, arrayDeque, i10 + 1);
    }

    private static byte[] w(InputStream in, Queue<byte[]> bufs, int totalLen) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(totalLen) * 2));
        while (totalLen < f119000c) {
            int iMin2 = Math.min(iMin, f119000c - totalLen);
            byte[] bArr = new byte[iMin2];
            bufs.add(bArr);
            int i10 = 0;
            while (i10 < iMin2) {
                int i11 = in.read(bArr, i10, iMin2 - i10);
                if (i11 == -1) {
                    return a(bufs, totalLen);
                }
                i10 += i11;
                totalLen += i11;
            }
            iMin = com.google.common.math.f.u(iMin, iMin < 4096 ? 4 : 2);
        }
        if (in.read() == -1) {
            return a(bufs, f119000c);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static class b implements com.google.common.io.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final DataInput f119003a;

        b(ByteArrayInputStream byteArrayInputStream) {
            this.f119003a = new DataInputStream(byteArrayInputStream);
        }

        @Override // com.google.common.io.c, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.f119003a.readBoolean();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataInput
        public byte readByte() {
            try {
                return this.f119003a.readByte();
            } catch (EOFException e10) {
                throw new IllegalStateException(e10);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.io.c, java.io.DataInput
        public char readChar() {
            try {
                return this.f119003a.readChar();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataInput
        public double readDouble() {
            try {
                return this.f119003a.readDouble();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataInput
        public float readFloat() {
            try {
                return this.f119003a.readFloat();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataInput
        public void readFully(byte[] b10) {
            try {
                this.f119003a.readFully(b10);
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataInput
        public int readInt() {
            try {
                return this.f119003a.readInt();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataInput
        @fj.a
        public String readLine() {
            try {
                return this.f119003a.readLine();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataInput
        public long readLong() {
            try {
                return this.f119003a.readLong();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataInput
        public short readShort() {
            try {
                return this.f119003a.readShort();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataInput
        public String readUTF() {
            try {
                return this.f119003a.readUTF();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.f119003a.readUnsignedByte();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.f119003a.readUnsignedShort();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataInput
        public int skipBytes(int n10) {
            try {
                return this.f119003a.skipBytes(n10);
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataInput
        public void readFully(byte[] b10, int off, int len) {
            try {
                this.f119003a.readFully(b10, off, len);
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    private static class c implements com.google.common.io.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final DataOutput f119004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ByteArrayOutputStream f119005b;

        c(ByteArrayOutputStream byteArrayOutputStream) {
            this.f119005b = byteArrayOutputStream;
            this.f119004a = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // com.google.common.io.d
        public byte[] H0() {
            return this.f119005b.toByteArray();
        }

        @Override // com.google.common.io.d, java.io.DataOutput
        public void write(int b10) {
            try {
                this.f119004a.write(b10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.d, java.io.DataOutput
        public void writeBoolean(boolean v10) {
            try {
                this.f119004a.writeBoolean(v10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.d, java.io.DataOutput
        public void writeByte(int v10) {
            try {
                this.f119004a.writeByte(v10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.d, java.io.DataOutput
        public void writeBytes(String s10) {
            try {
                this.f119004a.writeBytes(s10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.d, java.io.DataOutput
        public void writeChar(int v10) {
            try {
                this.f119004a.writeChar(v10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.d, java.io.DataOutput
        public void writeChars(String s10) {
            try {
                this.f119004a.writeChars(s10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.d, java.io.DataOutput
        public void writeDouble(double v10) {
            try {
                this.f119004a.writeDouble(v10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.d, java.io.DataOutput
        public void writeFloat(float v10) {
            try {
                this.f119004a.writeFloat(v10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.d, java.io.DataOutput
        public void writeInt(int v10) {
            try {
                this.f119004a.writeInt(v10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.d, java.io.DataOutput
        public void writeLong(long v10) {
            try {
                this.f119004a.writeLong(v10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.d, java.io.DataOutput
        public void writeShort(int v10) {
            try {
                this.f119004a.writeShort(v10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.d, java.io.DataOutput
        public void writeUTF(String s10) {
            try {
                this.f119004a.writeUTF(s10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.d, java.io.DataOutput
        public void write(byte[] b10) {
            try {
                this.f119004a.write(b10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.d, java.io.DataOutput
        public void write(byte[] b10, int off, int len) {
            try {
                this.f119004a.write(b10, off, len);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    private static final class d extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f119006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f119007b;

        d(InputStream in, long limit) {
            super(in);
            this.f119007b = -1L;
            com.google.common.base.j0.E(in);
            com.google.common.base.j0.e(limit >= 0, "limit must be non-negative");
            this.f119006a = limit;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f119006a);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int readLimit) {
            try {
                ((FilterInputStream) this).in.mark(readLimit);
                this.f119007b = this.f119006a;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f119006a == 0) {
                return -1;
            }
            int i10 = ((FilterInputStream) this).in.read();
            if (i10 != -1) {
                this.f119006a--;
            }
            return i10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            try {
                if (!((FilterInputStream) this).in.markSupported()) {
                    throw new IOException("Mark not supported");
                }
                if (this.f119007b == -1) {
                    throw new IOException("Mark not set");
                }
                ((FilterInputStream) this).in.reset();
                this.f119006a = this.f119007b;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long n10) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(n10, this.f119006a));
            this.f119006a -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] b10, int off, int len) throws IOException {
            long j10 = this.f119006a;
            if (j10 == 0) {
                return -1;
            }
            int i10 = ((FilterInputStream) this).in.read(b10, off, (int) Math.min(len, j10));
            if (i10 != -1) {
                this.f119006a -= (long) i10;
            }
            return i10;
        }
    }
}
