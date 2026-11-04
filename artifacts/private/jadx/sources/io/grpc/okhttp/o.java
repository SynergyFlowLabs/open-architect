package io.grpc.okhttp;

import io.grpc.internal.i2;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
class o extends io.grpc.internal.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final okio.l f290766a;

    o(okio.l lVar) {
        this.f290766a = lVar;
    }

    private void b() throws EOFException {
    }

    @Override // io.grpc.internal.i2
    public void Ee(OutputStream outputStream, int i10) throws IOException {
        this.f290766a.c2(outputStream, i10);
    }

    @Override // io.grpc.internal.b, io.grpc.internal.i2, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f290766a.c();
    }

    @Override // io.grpc.internal.i2
    public void e7(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            int i12 = this.f290766a.read(bArr, i10, i11);
            if (i12 == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i11 + " bytes");
            }
            i11 -= i12;
            i10 += i12;
        }
    }

    @Override // io.grpc.internal.i2
    public void g5(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.i2
    public i2 l2(int i10) {
        okio.l lVar = new okio.l();
        lVar.Ga(this.f290766a, i10);
        return new o(lVar);
    }

    @Override // io.grpc.internal.i2
    public int q0() {
        return (int) this.f290766a.size();
    }

    @Override // io.grpc.internal.i2
    public int readUnsignedByte() {
        try {
            b();
            return this.f290766a.readByte() & 255;
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // io.grpc.internal.i2
    public void skipBytes(int i10) {
        try {
            this.f290766a.skip(i10);
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }
}
