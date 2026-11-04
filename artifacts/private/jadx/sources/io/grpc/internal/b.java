package io.grpc.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b implements i2 {
    @Override // io.grpc.internal.i2
    public boolean D0() {
        return false;
    }

    protected final void a(int i10) {
        if (q0() < i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // io.grpc.internal.i2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.grpc.internal.i2
    public boolean dc() {
        return false;
    }

    @Override // io.grpc.internal.i2
    public ByteBuffer k1() {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.i2
    public byte[] ka() {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.i2
    public int l8() {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.i2
    public boolean markSupported() {
        return false;
    }

    @Override // io.grpc.internal.i2
    public final int readInt() {
        a(4);
        return readUnsignedByte() | (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8);
    }

    @Override // io.grpc.internal.i2
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.i2
    public void u7() {
    }
}
