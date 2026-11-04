package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
@k
abstract class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f118774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f118775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f118776c;

    protected f(int chunkSize) {
        this(chunkSize, chunkSize);
    }

    private void q() {
        x.b(this.f118774a);
        while (this.f118774a.remaining() >= this.f118776c) {
            s(this.f118774a);
        }
        this.f118774a.compact();
    }

    private void r() {
        if (this.f118774a.remaining() < 8) {
            q();
        }
    }

    @z7.a
    private r u(ByteBuffer readBuffer) {
        if (readBuffer.remaining() <= this.f118774a.remaining()) {
            this.f118774a.put(readBuffer);
            r();
            return this;
        }
        int iPosition = this.f118775b - this.f118774a.position();
        for (int i10 = 0; i10 < iPosition; i10++) {
            this.f118774a.put(readBuffer.get());
        }
        q();
        while (readBuffer.remaining() >= this.f118776c) {
            s(readBuffer);
        }
        this.f118774a.put(readBuffer);
        return this;
    }

    @Override // com.google.common.hash.r
    public final p n() {
        q();
        x.b(this.f118774a);
        if (this.f118774a.remaining() > 0) {
            t(this.f118774a);
            ByteBuffer byteBuffer = this.f118774a;
            x.d(byteBuffer, byteBuffer.limit());
        }
        return p();
    }

    protected abstract p p();

    protected abstract void s(ByteBuffer bb2);

    protected void t(ByteBuffer bb2) {
        x.d(bb2, bb2.limit());
        x.c(bb2, this.f118776c + 7);
        while (true) {
            int iPosition = bb2.position();
            int i10 = this.f118776c;
            if (iPosition >= i10) {
                x.c(bb2, i10);
                x.b(bb2);
                s(bb2);
                return;
            }
            bb2.putLong(0L);
        }
    }

    protected f(int chunkSize, int bufferSize) {
        com.google.common.base.j0.d(bufferSize % chunkSize == 0);
        this.f118774a = ByteBuffer.allocate(bufferSize + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f118775b = bufferSize;
        this.f118776c = chunkSize;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public final r b(int i10) {
        this.f118774a.putInt(i10);
        r();
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public final r c(long l10) {
        this.f118774a.putLong(l10);
        r();
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public final r e(short s10) {
        this.f118774a.putShort(s10);
        r();
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public final r g(byte b10) {
        this.f118774a.put(b10);
        r();
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public final r i(char c10) {
        this.f118774a.putChar(c10);
        r();
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public final r k(byte[] bytes, int off, int len) {
        return u(ByteBuffer.wrap(bytes, off, len).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
    @z7.a
    public final r l(ByteBuffer readBuffer) {
        ByteOrder byteOrderOrder = readBuffer.order();
        try {
            readBuffer.order(ByteOrder.LITTLE_ENDIAN);
            r rVarU = u(readBuffer);
            readBuffer.order(byteOrderOrder);
            return rVarU;
        } catch (Throwable th2) {
            readBuffer.order(byteOrderOrder);
            throw th2;
        }
    }
}
