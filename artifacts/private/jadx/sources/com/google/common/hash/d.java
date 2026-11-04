package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
@k
abstract class d implements r {
    d() {
    }

    @Override // com.google.common.hash.r
    @z7.a
    public <T> r o(@h0 T instance, n<? super T> funnel) {
        funnel.e2(instance, this);
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public final r a(float f10) {
        return b(Float.floatToRawIntBits(f10));
    }

    @Override // com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r b(int i10) {
        g((byte) i10);
        g((byte) (i10 >>> 8));
        g((byte) (i10 >>> 16));
        g((byte) (i10 >>> 24));
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r c(long l10) {
        for (int i10 = 0; i10 < 64; i10 += 8) {
            g((byte) (l10 >>> i10));
        }
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public final r d(double d10) {
        return c(Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r e(short s10) {
        g((byte) s10);
        g((byte) (s10 >>> 8));
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public final r f(boolean z10) {
        return g(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r h(byte[] bytes) {
        return k(bytes, 0, bytes.length);
    }

    @Override // com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r i(char c10) {
        g((byte) c10);
        g((byte) (c10 >>> '\b'));
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r j(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            i(charSequence.charAt(i10));
        }
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r k(byte[] bytes, int off, int len) {
        com.google.common.base.j0.f0(off, off + len, bytes.length);
        for (int i10 = 0; i10 < len; i10++) {
            g(bytes[off + i10]);
        }
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r l(ByteBuffer b10) {
        if (b10.hasArray()) {
            k(b10.array(), b10.arrayOffset() + b10.position(), b10.remaining());
            x.d(b10, b10.limit());
            return this;
        }
        for (int iRemaining = b10.remaining(); iRemaining > 0; iRemaining--) {
            g(b10.get());
        }
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r m(CharSequence charSequence, Charset charset) {
        return h(charSequence.toString().getBytes(charset));
    }
}
