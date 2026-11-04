package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
@k
abstract class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f118747a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    a() {
    }

    @z7.a
    private r p(int bytes) {
        try {
            t(this.f118747a.array(), 0, bytes);
            x.a(this.f118747a);
            return this;
        } catch (Throwable th2) {
            x.a(this.f118747a);
            throw th2;
        }
    }

    protected abstract void q(byte b10);

    protected void r(ByteBuffer b10) {
        if (b10.hasArray()) {
            t(b10.array(), b10.arrayOffset() + b10.position(), b10.remaining());
            x.d(b10, b10.limit());
        } else {
            for (int iRemaining = b10.remaining(); iRemaining > 0; iRemaining--) {
                q(b10.get());
            }
        }
    }

    protected void s(byte[] b10) {
        t(b10, 0, b10.length);
    }

    protected void t(byte[] b10, int off, int len) {
        for (int i10 = off; i10 < off + len; i10++) {
            q(b10[i10]);
        }
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r b(int i10) {
        this.f118747a.putInt(i10);
        return p(4);
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r c(long l10) {
        this.f118747a.putLong(l10);
        return p(8);
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r e(short s10) {
        this.f118747a.putShort(s10);
        return p(2);
    }

    @Override // com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r g(byte b10) {
        q(b10);
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r h(byte[] bytes) {
        com.google.common.base.j0.E(bytes);
        s(bytes);
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r i(char c10) {
        this.f118747a.putChar(c10);
        return p(2);
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r k(byte[] bytes, int off, int len) {
        com.google.common.base.j0.f0(off, off + len, bytes.length);
        t(bytes, off, len);
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public r l(ByteBuffer bytes) {
        r(bytes);
        return this;
    }
}
