package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import org.msgpack.core.p;

/* JADX INFO: loaded from: classes14.dex */
public class i extends h {
    i(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
    }

    @Override // org.msgpack.core.buffer.h
    public void A(int i10, short s10) {
        h.f339208f.putShort(this.f339216a, this.f339217b + ((long) i10), s10);
    }

    @Override // org.msgpack.core.buffer.h
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public i D(int i10, int i11) {
        if (i10 == 0 && i11 == C()) {
            return this;
        }
        p.d(i10 + i11 <= C());
        return new i(this.f339216a, this.f339217b + ((long) i10), i11);
    }

    @Override // org.msgpack.core.buffer.h
    public double i(int i10) {
        return h.f339208f.getDouble(this.f339216a, this.f339217b + ((long) i10));
    }

    @Override // org.msgpack.core.buffer.h
    public float j(int i10) {
        return h.f339208f.getFloat(this.f339216a, this.f339217b + ((long) i10));
    }

    @Override // org.msgpack.core.buffer.h
    public int k(int i10) {
        return h.f339208f.getInt(this.f339216a, this.f339217b + ((long) i10));
    }

    @Override // org.msgpack.core.buffer.h
    public long l(int i10) {
        return h.f339208f.getLong(this.f339216a, this.f339217b + ((long) i10));
    }

    @Override // org.msgpack.core.buffer.h
    public short m(int i10) {
        return h.f339208f.getShort(this.f339216a, this.f339217b + ((long) i10));
    }

    @Override // org.msgpack.core.buffer.h
    public void v(int i10, double d10) {
        h.f339208f.putDouble(this.f339216a, this.f339217b + ((long) i10), d10);
    }

    @Override // org.msgpack.core.buffer.h
    public void x(int i10, int i11) {
        h.f339208f.putInt(this.f339216a, this.f339217b + ((long) i10), i11);
    }

    @Override // org.msgpack.core.buffer.h
    public void y(int i10, long j10) {
        h.f339208f.putLong(this.f339216a, this.f339217b + ((long) i10), j10);
    }

    i(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    private i(Object obj, long j10, int i10) {
        super(obj, j10, i10);
    }
}
