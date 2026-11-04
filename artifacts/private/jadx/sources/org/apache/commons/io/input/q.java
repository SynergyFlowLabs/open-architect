package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: classes14.dex */
public class q extends InputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f336634g = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f336635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharsetEncoder f336636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharBuffer f336637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ByteBuffer f336638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CoderResult f336639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f336640f;

    public q(Reader reader, CharsetEncoder charsetEncoder) {
        this(reader, charsetEncoder, 1024);
    }

    private void a() throws IOException {
        CoderResult coderResult;
        if (!this.f336640f && ((coderResult = this.f336639e) == null || coderResult.isUnderflow())) {
            this.f336637c.compact();
            int iPosition = this.f336637c.position();
            int i10 = this.f336635a.read(this.f336637c.array(), iPosition, this.f336637c.remaining());
            if (i10 == -1) {
                this.f336640f = true;
            } else {
                this.f336637c.position(iPosition + i10);
            }
            this.f336637c.flip();
        }
        this.f336638d.compact();
        this.f336639e = this.f336636b.encode(this.f336637c, this.f336638d, this.f336640f);
        this.f336638d.flip();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f336635a.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Byte array must not be null");
        }
        if (i11 < 0 || i10 < 0 || i10 + i11 > bArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + bArr.length + ", offset=" + i10 + ", length=" + i11);
        }
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        while (i11 > 0) {
            if (!this.f336638d.hasRemaining()) {
                a();
                if (this.f336640f && !this.f336638d.hasRemaining()) {
                    break;
                }
            } else {
                int iMin = Math.min(this.f336638d.remaining(), i11);
                this.f336638d.get(bArr, i10, iMin);
                i10 += iMin;
                i11 -= iMin;
                i12 += iMin;
            }
        }
        if (i12 == 0 && this.f336640f) {
            return -1;
        }
        return i12;
    }

    public q(Reader reader, CharsetEncoder charsetEncoder, int i10) {
        this.f336635a = reader;
        this.f336636b = charsetEncoder;
        CharBuffer charBufferAllocate = CharBuffer.allocate(i10);
        this.f336637c = charBufferAllocate;
        charBufferAllocate.flip();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(128);
        this.f336638d = byteBufferAllocate;
        byteBufferAllocate.flip();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(Reader reader, Charset charset, int i10) {
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this(reader, charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction), i10);
    }

    public q(Reader reader, Charset charset) {
        this(reader, charset, 1024);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public q(Reader reader, String str, int i10) {
        this(reader, Charset.forName(str), i10);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (!this.f336638d.hasRemaining()) {
            a();
            if (this.f336640f && !this.f336638d.hasRemaining()) {
                return -1;
            }
        }
        return this.f336638d.get() & 255;
    }

    public q(Reader reader, String str) {
        this(reader, str, 1024);
    }

    @Deprecated
    public q(Reader reader) {
        this(reader, Charset.defaultCharset());
    }
}
