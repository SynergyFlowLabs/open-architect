package com.google.common.hash;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@k
@z7.j
abstract class e extends c {

    private final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f118761a;

        a(int expectedInputSize) {
            this.f118761a = new b(expectedInputSize);
        }

        @Override // com.google.common.hash.r
        public p n() {
            return e.this.k(this.f118761a.a(), 0, this.f118761a.b());
        }

        @Override // com.google.common.hash.r, com.google.common.hash.i0
        public r g(byte b10) throws IOException {
            this.f118761a.write(b10);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
        public r k(byte[] bytes, int off, int len) throws IOException {
            this.f118761a.write(bytes, off, len);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
        public r l(ByteBuffer bytes) {
            this.f118761a.c(bytes);
            return this;
        }
    }

    private static final class b extends ByteArrayOutputStream {
        b(int expectedInputSize) {
            super(expectedInputSize);
        }

        byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        int b() {
            return ((ByteArrayOutputStream) this).count;
        }

        void c(ByteBuffer input) {
            int iRemaining = input.remaining();
            int i10 = ((ByteArrayOutputStream) this).count;
            int i11 = i10 + iRemaining;
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            if (i11 > bArr.length) {
                ((ByteArrayOutputStream) this).buf = Arrays.copyOf(bArr, i10 + iRemaining);
            }
            input.get(((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count, iRemaining);
            ((ByteArrayOutputStream) this).count += iRemaining;
        }
    }

    e() {
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public r a(int expectedInputSize) {
        com.google.common.base.j0.d(expectedInputSize >= 0);
        return new a(expectedInputSize);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p c(int input) {
        return b(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(input).array());
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p e(long input) {
        return b(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(input).array());
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p f(CharSequence input, Charset charset) {
        return b(input.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p g(CharSequence input) {
        int length = input.length();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length * 2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i10 = 0; i10 < length; i10++) {
            byteBufferOrder.putChar(input.charAt(i10));
        }
        return b(byteBufferOrder.array());
    }

    @Override // com.google.common.hash.q
    public r i() {
        return a(32);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p j(ByteBuffer input) {
        return a(input.remaining()).l(input).n();
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public abstract p k(byte[] input, int off, int len);
}
