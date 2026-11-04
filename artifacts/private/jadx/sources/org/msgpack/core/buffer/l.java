package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import org.msgpack.core.p;

/* JADX INFO: loaded from: classes14.dex */
public class l extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f339220o = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ByteBuffer f339221n;

    l(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
        this.f339221n = ByteBuffer.wrap(bArr, i10, i11).slice();
    }

    private void L() {
        this.f339221n.position(0);
        this.f339221n.limit(this.f339218c);
    }

    @Override // org.msgpack.core.buffer.h
    public void A(int i10, short s10) {
        this.f339221n.putShort(i10, s10);
    }

    @Override // org.msgpack.core.buffer.h
    public ByteBuffer E() {
        return F(0, this.f339218c);
    }

    @Override // org.msgpack.core.buffer.h
    public ByteBuffer F(int i10, int i11) {
        try {
            this.f339221n.position(i10);
            this.f339221n.limit(i10 + i11);
            return this.f339221n.slice();
        } finally {
            L();
        }
    }

    @Override // org.msgpack.core.buffer.h
    public byte[] G() {
        int iC = C();
        byte[] bArr = new byte[iC];
        h(0, bArr, 0, iC);
        return bArr;
    }

    @Override // org.msgpack.core.buffer.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public l D(int i10, int i11) {
        if (i10 == 0 && i11 == C()) {
            return this;
        }
        int i12 = i10 + i11;
        p.d(i12 <= C());
        try {
            this.f339221n.position(i10);
            this.f339221n.limit(i12);
            return new l(this.f339216a, ((long) i10) + this.f339217b, i11, this.f339221n.slice());
        } finally {
            L();
        }
    }

    @Override // org.msgpack.core.buffer.h
    public void d(int i10, h hVar, int i11, int i12) {
        try {
            this.f339221n.position(i10);
            hVar.t(i11, this.f339221n, i12);
        } finally {
            L();
        }
    }

    @Override // org.msgpack.core.buffer.h
    public boolean e(int i10) {
        return this.f339221n.get(i10) != 0;
    }

    @Override // org.msgpack.core.buffer.h
    public byte f(int i10) {
        return this.f339221n.get(i10);
    }

    @Override // org.msgpack.core.buffer.h
    public void g(int i10, int i11, ByteBuffer byteBuffer) {
        try {
            this.f339221n.position(i10);
            this.f339221n.limit(i10 + i11);
            byteBuffer.put(this.f339221n);
        } finally {
            L();
        }
    }

    @Override // org.msgpack.core.buffer.h
    public void h(int i10, byte[] bArr, int i11, int i12) {
        try {
            this.f339221n.position(i10);
            this.f339221n.get(bArr, i11, i12);
            L();
        } catch (Throwable th2) {
            L();
            throw th2;
        }
    }

    @Override // org.msgpack.core.buffer.h
    public double i(int i10) {
        return this.f339221n.getDouble(i10);
    }

    @Override // org.msgpack.core.buffer.h
    public float j(int i10) {
        return this.f339221n.getFloat(i10);
    }

    @Override // org.msgpack.core.buffer.h
    public int k(int i10) {
        return this.f339221n.getInt(i10);
    }

    @Override // org.msgpack.core.buffer.h
    public long l(int i10) {
        return this.f339221n.getLong(i10);
    }

    @Override // org.msgpack.core.buffer.h
    public short m(int i10) {
        return this.f339221n.getShort(i10);
    }

    @Override // org.msgpack.core.buffer.h
    public void r(int i10, boolean z10) {
        this.f339221n.put(i10, z10 ? (byte) 1 : (byte) 0);
    }

    @Override // org.msgpack.core.buffer.h
    public void s(int i10, byte b10) {
        this.f339221n.put(i10, b10);
    }

    @Override // org.msgpack.core.buffer.h
    public void t(int i10, ByteBuffer byteBuffer, int i11) {
        if (byteBuffer.hasArray()) {
            u(i10, byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), i11);
            byteBuffer.position(byteBuffer.position() + i11);
            return;
        }
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i11);
            this.f339221n.position(i10);
            this.f339221n.put(byteBuffer);
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    @Override // org.msgpack.core.buffer.h
    public void u(int i10, byte[] bArr, int i11, int i12) {
        try {
            this.f339221n.position(i10);
            this.f339221n.put(bArr, i11, i12);
        } finally {
            L();
        }
    }

    @Override // org.msgpack.core.buffer.h
    public void v(int i10, double d10) {
        this.f339221n.putDouble(i10, d10);
    }

    @Override // org.msgpack.core.buffer.h
    public void w(int i10, float f10) {
        this.f339221n.putFloat(i10, f10);
    }

    @Override // org.msgpack.core.buffer.h
    public void x(int i10, int i11) {
        this.f339221n.putInt(i10, i11);
    }

    @Override // org.msgpack.core.buffer.h
    public void y(int i10, long j10) {
        this.f339221n.putLong(i10, j10);
    }

    @Override // org.msgpack.core.buffer.h
    public void z(int i10, h hVar, int i11, int i12) {
        u(i10, hVar.G(), i11, i12);
    }

    l(ByteBuffer byteBuffer) {
        super(byteBuffer);
        this.f339221n = byteBuffer.slice();
    }

    private l(Object obj, long j10, int i10, ByteBuffer byteBuffer) {
        super(obj, j10, i10);
        this.f339221n = byteBuffer;
    }
}
