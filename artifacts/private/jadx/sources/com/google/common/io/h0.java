package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
final class h0 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f119008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharsetEncoder f119009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f119010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharBuffer f119011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteBuffer f119012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f119013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f119014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f119015h;

    /* JADX WARN: Illegal instructions before constructor call */
    h0(Reader reader, Charset charset, int bufferSize) {
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this(reader, charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction), bufferSize);
    }

    private static int a(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    private int b(byte[] b10, int off, int len) {
        int iMin = Math.min(len, this.f119012e.remaining());
        this.f119012e.get(b10, off, iMin);
        return iMin;
    }

    private static CharBuffer c(CharBuffer buf) {
        CharBuffer charBufferWrap = CharBuffer.wrap(Arrays.copyOf(buf.array(), buf.capacity() * 2));
        x.e(charBufferWrap, buf.position());
        x.c(charBufferWrap, buf.limit());
        return charBufferWrap;
    }

    private void d() throws IOException {
        if (a(this.f119011d) == 0) {
            if (this.f119011d.position() > 0) {
                x.b(this.f119011d.compact());
            } else {
                this.f119011d = c(this.f119011d);
            }
        }
        int iLimit = this.f119011d.limit();
        int i10 = this.f119008a.read(this.f119011d.array(), iLimit, a(this.f119011d));
        if (i10 == -1) {
            this.f119013f = true;
        } else {
            x.c(this.f119011d, iLimit + i10);
        }
    }

    private void e(boolean overflow) {
        x.b(this.f119012e);
        if (overflow && this.f119012e.remaining() == 0) {
            this.f119012e = ByteBuffer.allocate(this.f119012e.capacity() * 2);
        } else {
            this.f119014g = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f119008a.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f119010c) == 1) {
            return com.google.common.primitives.u.p(this.f119010c[0]);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] b10, int off, int len) throws IOException {
        CoderResult coderResultFlush;
        com.google.common.base.j0.f0(off, off + len, b10.length);
        if (len == 0) {
            return 0;
        }
        boolean z10 = this.f119013f;
        int iB = 0;
        while (true) {
            if (this.f119014g) {
                iB += b(b10, off + iB, len - iB);
                if (iB == len || this.f119015h) {
                    break;
                }
                this.f119014g = false;
                x.a(this.f119012e);
            }
            while (true) {
                if (this.f119015h) {
                    coderResultFlush = CoderResult.UNDERFLOW;
                } else {
                    coderResultFlush = z10 ? this.f119009b.flush(this.f119012e) : this.f119009b.encode(this.f119011d, this.f119012e, this.f119013f);
                }
                if (coderResultFlush.isOverflow()) {
                    e(true);
                    break;
                }
                if (coderResultFlush.isUnderflow()) {
                    if (z10) {
                        this.f119015h = true;
                        e(false);
                        break;
                    }
                    if (this.f119013f) {
                        z10 = true;
                    } else {
                        d();
                    }
                } else if (coderResultFlush.isError()) {
                    coderResultFlush.throwException();
                    return 0;
                }
            }
        }
        if (iB > 0) {
            return iB;
        }
        return -1;
    }

    h0(Reader reader, CharsetEncoder encoder, int bufferSize) {
        this.f119010c = new byte[1];
        this.f119008a = (Reader) com.google.common.base.j0.E(reader);
        this.f119009b = (CharsetEncoder) com.google.common.base.j0.E(encoder);
        com.google.common.base.j0.k(bufferSize > 0, "bufferSize must be positive: %s", bufferSize);
        encoder.reset();
        CharBuffer charBufferAllocate = CharBuffer.allocate(bufferSize);
        this.f119011d = charBufferAllocate;
        x.b(charBufferAllocate);
        this.f119012e = ByteBuffer.allocate(bufferSize);
    }
}
