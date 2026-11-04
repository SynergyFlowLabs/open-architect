package org.msgpack.core;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.g3;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.msgpack.value.x;

/* JADX INFO: loaded from: classes14.dex */
public class j implements Closeable, Flushable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f339303i = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f339304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f339305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f339306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected org.msgpack.core.buffer.k f339307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.msgpack.core.buffer.h f339308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f339309f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f339310g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CharsetEncoder f339311h;

    protected j(org.msgpack.core.buffer.k kVar, h.b bVar) {
        this.f339307d = (org.msgpack.core.buffer.k) p.j(kVar, "MessageBufferOutput is null");
        this.f339304a = bVar.d();
        this.f339305b = bVar.b();
        this.f339306c = bVar.e();
    }

    private void R(String str) throws IOException {
        byte[] bytes = str.getBytes(h.f339262a);
        H(bytes.length);
        a(bytes);
    }

    private void X() {
        if (this.f339311h == null) {
            CharsetEncoder charsetEncoderNewEncoder = h.f339262a.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.f339311h = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        }
        this.f339311h.reset();
    }

    private int c(int i10, String str) {
        X();
        org.msgpack.core.buffer.h hVar = this.f339308e;
        ByteBuffer byteBufferF = hVar.F(i10, hVar.C() - i10);
        int iPosition = byteBufferF.position();
        CoderResult coderResultEncode = this.f339311h.encode(CharBuffer.wrap(str), byteBufferF, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e10) {
                throw new l(e10);
            }
        }
        if (coderResultEncode.isUnderflow() && !coderResultEncode.isOverflow() && this.f339311h.flush(byteBufferF).isUnderflow()) {
            return byteBufferF.position() - iPosition;
        }
        return -1;
    }

    private void d(int i10) throws IOException {
        org.msgpack.core.buffer.h hVar = this.f339308e;
        if (hVar == null) {
            this.f339308e = this.f339307d.c4(i10);
            return;
        }
        if (this.f339309f + i10 >= hVar.C()) {
            e();
            this.f339308e = this.f339307d.c4(i10);
        }
    }

    private void d0(byte b10, byte b11) throws IOException {
        d(2);
        org.msgpack.core.buffer.h hVar = this.f339308e;
        int i10 = this.f339309f;
        this.f339309f = i10 + 1;
        hVar.s(i10, b10);
        org.msgpack.core.buffer.h hVar2 = this.f339308e;
        int i11 = this.f339309f;
        this.f339309f = i11 + 1;
        hVar2.s(i11, b11);
    }

    private void e() throws IOException {
        this.f339307d.P9(this.f339309f);
        this.f339308e = null;
        this.f339310g += (long) this.f339309f;
        this.f339309f = 0;
    }

    private void f0(byte b10, double d10) throws IOException {
        d(9);
        org.msgpack.core.buffer.h hVar = this.f339308e;
        int i10 = this.f339309f;
        this.f339309f = i10 + 1;
        hVar.s(i10, b10);
        this.f339308e.v(this.f339309f, d10);
        this.f339309f += 8;
    }

    private void g0(byte b10, float f10) throws IOException {
        d(5);
        org.msgpack.core.buffer.h hVar = this.f339308e;
        int i10 = this.f339309f;
        this.f339309f = i10 + 1;
        hVar.s(i10, b10);
        this.f339308e.w(this.f339309f, f10);
        this.f339309f += 4;
    }

    private void j0(byte b10, int i10) throws IOException {
        d(5);
        org.msgpack.core.buffer.h hVar = this.f339308e;
        int i11 = this.f339309f;
        this.f339309f = i11 + 1;
        hVar.s(i11, b10);
        this.f339308e.x(this.f339309f, i10);
        this.f339309f += 4;
    }

    private void k0(byte b10, long j10) throws IOException {
        d(9);
        org.msgpack.core.buffer.h hVar = this.f339308e;
        int i10 = this.f339309f;
        this.f339309f = i10 + 1;
        hVar.s(i10, b10);
        this.f339308e.y(this.f339309f, j10);
        this.f339309f += 8;
    }

    private void m6(byte b10) throws IOException {
        d(1);
        org.msgpack.core.buffer.h hVar = this.f339308e;
        int i10 = this.f339309f;
        this.f339309f = i10 + 1;
        hVar.s(i10, b10);
    }

    private void o0(byte b10, short s10) throws IOException {
        d(3);
        org.msgpack.core.buffer.h hVar = this.f339308e;
        int i10 = this.f339309f;
        this.f339309f = i10 + 1;
        hVar.s(i10, b10);
        this.f339308e.A(this.f339309f, s10);
        this.f339309f += 2;
    }

    private void oc(short s10) throws IOException {
        d(2);
        this.f339308e.A(this.f339309f, s10);
        this.f339309f += 2;
    }

    private void writeInt(int i10) throws IOException {
        d(4);
        this.f339308e.x(this.f339309f, i10);
        this.f339309f += 4;
    }

    private void writeLong(long j10) throws IOException {
        d(8);
        this.f339308e.y(this.f339309f, j10);
        this.f339309f += 8;
    }

    public j E() throws IOException {
        m6(h.a.f339269e);
        return this;
    }

    public j H(int i10) throws IOException {
        if (i10 < 32) {
            m6((byte) (i10 | (-96)));
            return this;
        }
        if (this.f339306c && i10 < 256) {
            d0(h.a.D, (byte) i10);
            return this;
        }
        if (i10 < 65536) {
            o0(h.a.E, (short) i10);
            return this;
        }
        j0(h.a.F, i10);
        return this;
    }

    public j I(short s10) throws IOException {
        if (s10 < -32) {
            if (s10 < -128) {
                o0(h.a.f339286v, s10);
                return this;
            }
            d0(h.a.f339285u, (byte) s10);
            return this;
        }
        if (s10 < 128) {
            m6((byte) s10);
            return this;
        }
        if (s10 < 256) {
            d0(h.a.f339281q, (byte) s10);
            return this;
        }
        o0(h.a.f339282r, s10);
        return this;
    }

    public j N(String str) throws IOException {
        if (str.length() <= 0) {
            H(0);
            return this;
        }
        if (str.length() < this.f339304a) {
            R(str);
            return this;
        }
        if (str.length() < 256) {
            d((str.length() * 6) + 3);
            int iC = c(this.f339309f + 2, str);
            if (iC >= 0) {
                if (this.f339306c && iC < 256) {
                    org.msgpack.core.buffer.h hVar = this.f339308e;
                    int i10 = this.f339309f;
                    this.f339309f = i10 + 1;
                    hVar.s(i10, h.a.D);
                    org.msgpack.core.buffer.h hVar2 = this.f339308e;
                    int i11 = this.f339309f;
                    this.f339309f = i11 + 1;
                    hVar2.s(i11, (byte) iC);
                    this.f339309f += iC;
                    return this;
                }
                if (iC >= 65536) {
                    throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                }
                org.msgpack.core.buffer.h hVar3 = this.f339308e;
                int i12 = this.f339309f;
                hVar3.z(i12 + 3, hVar3, i12 + 2, iC);
                org.msgpack.core.buffer.h hVar4 = this.f339308e;
                int i13 = this.f339309f;
                this.f339309f = i13 + 1;
                hVar4.s(i13, h.a.E);
                this.f339308e.A(this.f339309f, (short) iC);
                this.f339309f = this.f339309f + 2 + iC;
                return this;
            }
        } else if (str.length() < 65536) {
            d((str.length() * 6) + 5);
            int iC2 = c(this.f339309f + 3, str);
            if (iC2 >= 0) {
                if (iC2 < 65536) {
                    org.msgpack.core.buffer.h hVar5 = this.f339308e;
                    int i14 = this.f339309f;
                    this.f339309f = i14 + 1;
                    hVar5.s(i14, h.a.E);
                    this.f339308e.A(this.f339309f, (short) iC2);
                    this.f339309f = this.f339309f + 2 + iC2;
                    return this;
                }
                if (iC2 >= 4294967296L) {
                    throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                }
                org.msgpack.core.buffer.h hVar6 = this.f339308e;
                int i15 = this.f339309f;
                hVar6.z(i15 + 5, hVar6, i15 + 3, iC2);
                org.msgpack.core.buffer.h hVar7 = this.f339308e;
                int i16 = this.f339309f;
                this.f339309f = i16 + 1;
                hVar7.s(i16, h.a.F);
                this.f339308e.x(this.f339309f, iC2);
                this.f339309f = this.f339309f + 4 + iC2;
                return this;
            }
        }
        R(str);
        return this;
    }

    public j T(x xVar) throws IOException {
        xVar.N(this);
        return this;
    }

    public org.msgpack.core.buffer.k Y(org.msgpack.core.buffer.k kVar) throws IOException {
        org.msgpack.core.buffer.k kVar2 = (org.msgpack.core.buffer.k) p.j(kVar, "MessageBufferOutput is null");
        flush();
        org.msgpack.core.buffer.k kVar3 = this.f339307d;
        this.f339307d = kVar2;
        this.f339310g = 0L;
        return kVar3;
    }

    public j a(byte[] bArr) throws IOException {
        return b(bArr, 0, bArr.length);
    }

    public j b(byte[] bArr, int i10, int i11) throws IOException {
        org.msgpack.core.buffer.h hVar = this.f339308e;
        if (hVar != null) {
            int iC = hVar.C();
            int i12 = this.f339309f;
            if (iC - i12 >= i11 && i11 <= this.f339305b) {
                this.f339308e.u(i12, bArr, i10, i11);
                this.f339309f += i11;
                return this;
            }
        }
        flush();
        this.f339307d.P0(bArr, i10, i11);
        this.f339310g += (long) i11;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f339307d.close();
        } catch (Throwable th2) {
            this.f339307d.close();
            throw th2;
        }
    }

    public long f() {
        return this.f339310g + ((long) this.f339309f);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f339309f > 0) {
            e();
        }
        this.f339307d.flush();
    }

    public j g(int i10) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("array size must be >= 0");
        }
        if (i10 < 16) {
            m6((byte) (i10 | (-112)));
            return this;
        }
        if (i10 < 65536) {
            o0(h.a.G, (short) i10);
            return this;
        }
        j0(h.a.H, i10);
        return this;
    }

    public j h(BigInteger bigInteger) throws IOException {
        if (bigInteger.bitLength() <= 63) {
            x(bigInteger.longValue());
            return this;
        }
        if (bigInteger.bitLength() != 64 || bigInteger.signum() != 1) {
            throw new IllegalArgumentException("MessagePack cannot serialize BigInteger larger than 2^64-1");
        }
        k0(h.a.f339284t, bigInteger.longValue());
        return this;
    }

    public j j(int i10) throws IOException {
        if (i10 < 256) {
            d0(h.a.f339273i, (byte) i10);
            return this;
        }
        if (i10 < 65536) {
            o0(h.a.f339274j, (short) i10);
            return this;
        }
        j0(h.a.f339275k, i10);
        return this;
    }

    public j l(boolean z10) throws IOException {
        m6(z10 ? h.a.f339272h : h.a.f339271g);
        return this;
    }

    public j m(byte b10) throws IOException {
        if (b10 < -32) {
            d0(h.a.f339285u, b10);
            return this;
        }
        m6(b10);
        return this;
    }

    public j o(double d10) throws IOException {
        f0(h.a.f339280p, d10);
        return this;
    }

    public j q(byte b10, int i10) throws IOException {
        if (i10 >= 256) {
            if (i10 < 65536) {
                o0(h.a.f339277m, (short) i10);
                m6(b10);
                return this;
            }
            j0(h.a.f339278n, i10);
            m6(b10);
            return this;
        }
        if (i10 <= 0 || ((i10 - 1) & i10) != 0) {
            d0(h.a.f339276l, (byte) i10);
            m6(b10);
            return this;
        }
        if (i10 == 1) {
            d0(h.a.f339289y, b10);
            return this;
        }
        if (i10 == 2) {
            d0(h.a.f339290z, b10);
            return this;
        }
        if (i10 == 4) {
            d0(h.a.A, b10);
            return this;
        }
        if (i10 == 8) {
            d0(h.a.B, b10);
            return this;
        }
        if (i10 == 16) {
            d0(h.a.C, b10);
            return this;
        }
        d0(h.a.f339276l, (byte) i10);
        m6(b10);
        return this;
    }

    public j r(float f10) throws IOException {
        g0(h.a.f339279o, f10);
        return this;
    }

    public j r0(byte[] bArr) throws IOException {
        return w0(bArr, 0, bArr.length);
    }

    public j t(int i10) throws IOException {
        if (i10 < -32) {
            if (i10 < -32768) {
                j0(h.a.f339287w, i10);
                return this;
            }
            if (i10 < -128) {
                o0(h.a.f339286v, (short) i10);
                return this;
            }
            d0(h.a.f339285u, (byte) i10);
            return this;
        }
        if (i10 < 128) {
            m6((byte) i10);
            return this;
        }
        if (i10 < 256) {
            d0(h.a.f339281q, (byte) i10);
            return this;
        }
        if (i10 < 65536) {
            o0(h.a.f339282r, (short) i10);
            return this;
        }
        j0(h.a.f339283s, i10);
        return this;
    }

    public j w0(byte[] bArr, int i10, int i11) throws IOException {
        org.msgpack.core.buffer.h hVar = this.f339308e;
        if (hVar != null) {
            int iC = hVar.C();
            int i12 = this.f339309f;
            if (iC - i12 >= i11 && i11 <= this.f339305b) {
                this.f339308e.u(i12, bArr, i10, i11);
                this.f339309f += i11;
                return this;
            }
        }
        flush();
        this.f339307d.write(bArr, i10, i11);
        this.f339310g += (long) i11;
        return this;
    }

    public j x(long j10) throws IOException {
        if (j10 < -32) {
            if (j10 < -32768) {
                if (j10 < g3.f12261h) {
                    k0(h.a.f339288x, j10);
                    return this;
                }
                j0(h.a.f339287w, (int) j10);
                return this;
            }
            if (j10 < -128) {
                o0(h.a.f339286v, (short) j10);
                return this;
            }
            d0(h.a.f339285u, (byte) j10);
            return this;
        }
        if (j10 < 128) {
            m6((byte) j10);
            return this;
        }
        if (j10 < PlaybackStateCompat.f9653i3) {
            if (j10 < 256) {
                d0(h.a.f339281q, (byte) j10);
                return this;
            }
            o0(h.a.f339282r, (short) j10);
            return this;
        }
        if (j10 < 4294967296L) {
            j0(h.a.f339283s, (int) j10);
            return this;
        }
        k0(h.a.f339284t, j10);
        return this;
    }

    public j y(int i10) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("map size must be >= 0");
        }
        if (i10 < 16) {
            m6((byte) (i10 | (-128)));
            return this;
        }
        if (i10 < 65536) {
            o0(h.a.I, (short) i10);
            return this;
        }
        j0(h.a.J, i10);
        return this;
    }
}
