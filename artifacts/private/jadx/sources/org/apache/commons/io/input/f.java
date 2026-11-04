package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: classes14.dex */
public class f extends InputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f336605f = 2048;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f336606g = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetEncoder f336607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharBuffer f336608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ByteBuffer f336609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f336610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f336611e;

    public f(CharSequence charSequence, Charset charset, int i10) {
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        this.f336607a = charsetEncoderOnUnmappableCharacter;
        float fMaxBytesPerChar = charsetEncoderOnUnmappableCharacter.maxBytesPerChar();
        if (i10 < fMaxBytesPerChar) {
            throw new IllegalArgumentException("Buffer size " + i10 + " is less than maxBytesPerChar " + fMaxBytesPerChar);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        this.f336609c = byteBufferAllocate;
        byteBufferAllocate.flip();
        this.f336608b = CharBuffer.wrap(charSequence);
        this.f336610d = -1;
        this.f336611e = -1;
    }

    private void a() throws CharacterCodingException {
        this.f336609c.compact();
        CoderResult coderResultEncode = this.f336607a.encode(this.f336608b, this.f336609c, true);
        if (coderResultEncode.isError()) {
            coderResultEncode.throwException();
        }
        this.f336609c.flip();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f336609c.remaining() + this.f336608b.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        this.f336610d = this.f336608b.position();
        this.f336611e = this.f336609c.position();
        this.f336608b.mark();
        this.f336609c.mark();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Byte array is null");
        }
        if (i11 < 0 || i10 + i11 > bArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + bArr.length + ", offset=" + i10 + ", length=" + i11);
        }
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (!this.f336609c.hasRemaining() && !this.f336608b.hasRemaining()) {
            return -1;
        }
        while (i11 > 0) {
            if (!this.f336609c.hasRemaining()) {
                a();
                if (!this.f336609c.hasRemaining() && !this.f336608b.hasRemaining()) {
                    break;
                }
            } else {
                int iMin = Math.min(this.f336609c.remaining(), i11);
                this.f336609c.get(bArr, i10, iMin);
                i10 += iMin;
                i11 -= iMin;
                i12 += iMin;
            }
        }
        if (i12 != 0 || this.f336608b.hasRemaining()) {
            return i12;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            if (this.f336610d != -1) {
                if (this.f336608b.position() != 0) {
                    this.f336607a.reset();
                    this.f336608b.rewind();
                    this.f336609c.rewind();
                    this.f336609c.limit(0);
                    while (this.f336608b.position() < this.f336610d) {
                        this.f336609c.rewind();
                        this.f336609c.limit(0);
                        a();
                    }
                }
                if (this.f336608b.position() != this.f336610d) {
                    throw new IllegalStateException("Unexpected CharBuffer postion: actual=" + this.f336608b.position() + " expected=" + this.f336610d);
                }
                this.f336609c.position(this.f336611e);
                this.f336610d = -1;
                this.f336611e = -1;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        long j11 = 0;
        while (j10 > 0 && available() > 0) {
            read();
            j10--;
            j11++;
        }
        return j11;
    }

    public f(CharSequence charSequence, String str, int i10) {
        this(charSequence, Charset.forName(str), i10);
    }

    public f(CharSequence charSequence, Charset charset) {
        this(charSequence, charset, 2048);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (!this.f336609c.hasRemaining()) {
            a();
            if (!this.f336609c.hasRemaining() && !this.f336608b.hasRemaining()) {
                return -1;
            }
        }
        return this.f336609c.get() & 255;
    }

    public f(CharSequence charSequence, String str) {
        this(charSequence, str, 2048);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
