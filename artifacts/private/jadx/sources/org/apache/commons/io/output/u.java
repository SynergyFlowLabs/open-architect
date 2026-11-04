package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: classes14.dex */
public class u extends OutputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f336781f = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f336782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f336783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f336784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ByteBuffer f336785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CharBuffer f336786e;

    public u(Writer writer, CharsetDecoder charsetDecoder) {
        this(writer, charsetDecoder, 1024, false);
    }

    private static void a(Charset charset) {
        if ("UTF-16".equals(charset.name())) {
            byte[] bytes = "vés".getBytes(charset);
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            CharBuffer charBufferAllocate = CharBuffer.allocate(3);
            int length = bytes.length;
            int i10 = 0;
            while (i10 < length) {
                byteBufferAllocate.put(bytes[i10]);
                byteBufferAllocate.flip();
                try {
                    charsetDecoderNewDecoder.decode(byteBufferAllocate, charBufferAllocate, i10 == length + (-1));
                    byteBufferAllocate.compact();
                    i10++;
                } catch (IllegalArgumentException unused) {
                    throw new UnsupportedOperationException("UTF-16 requested when runninng on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
                }
            }
            charBufferAllocate.rewind();
            if (!"vés".equals(charBufferAllocate.toString())) {
                throw new UnsupportedOperationException("UTF-16 requested when runninng on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
            }
        }
    }

    private void b() throws IOException {
        if (this.f336786e.position() > 0) {
            this.f336782a.write(this.f336786e.array(), 0, this.f336786e.position());
            this.f336786e.rewind();
        }
    }

    private void c(boolean z10) throws IOException {
        CoderResult coderResultDecode;
        this.f336785d.flip();
        while (true) {
            coderResultDecode = this.f336783b.decode(this.f336785d, this.f336786e, z10);
            if (!coderResultDecode.isOverflow()) {
                break;
            } else {
                b();
            }
        }
        if (!coderResultDecode.isUnderflow()) {
            throw new IOException("Unexpected coder result");
        }
        this.f336785d.compact();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        c(true);
        b();
        this.f336782a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        b();
        this.f336782a.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        while (i11 > 0) {
            int iMin = Math.min(i11, this.f336785d.remaining());
            this.f336785d.put(bArr, i10, iMin);
            c(false);
            i11 -= iMin;
            i10 += iMin;
        }
        if (this.f336784c) {
            b();
        }
    }

    public u(Writer writer, CharsetDecoder charsetDecoder, int i10, boolean z10) {
        this.f336785d = ByteBuffer.allocate(128);
        a(charsetDecoder.charset());
        this.f336782a = writer;
        this.f336783b = charsetDecoder;
        this.f336784c = z10;
        this.f336786e = CharBuffer.allocate(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u(Writer writer, Charset charset, int i10, boolean z10) {
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this(writer, charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).replaceWith(com.planner5d.library.model.payments.a.f222474i), i10, z10);
    }

    public u(Writer writer, Charset charset) {
        this(writer, charset, 1024, false);
    }

    public u(Writer writer, String str, int i10, boolean z10) {
        this(writer, Charset.forName(str), i10, z10);
    }

    public u(Writer writer, String str) {
        this(writer, str, 1024, false);
    }

    @Deprecated
    public u(Writer writer) {
        this(writer, Charset.defaultCharset(), 1024, false);
    }
}
