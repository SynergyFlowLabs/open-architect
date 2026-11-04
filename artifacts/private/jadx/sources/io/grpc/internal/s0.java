package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class s0 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i2 f289787a;

    protected s0(i2 i2Var) {
        this.f289787a = (i2) com.google.common.base.j0.F(i2Var, "buf");
    }

    @Override // io.grpc.internal.i2
    public boolean D0() {
        return this.f289787a.D0();
    }

    @Override // io.grpc.internal.i2
    public void Ee(OutputStream outputStream, int i10) throws IOException {
        this.f289787a.Ee(outputStream, i10);
    }

    @Override // io.grpc.internal.i2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f289787a.close();
    }

    @Override // io.grpc.internal.i2
    public boolean dc() {
        return this.f289787a.dc();
    }

    @Override // io.grpc.internal.i2
    public void e7(byte[] bArr, int i10, int i11) {
        this.f289787a.e7(bArr, i10, i11);
    }

    @Override // io.grpc.internal.i2
    public void g5(ByteBuffer byteBuffer) {
        this.f289787a.g5(byteBuffer);
    }

    @Override // io.grpc.internal.i2
    @fj.h
    public ByteBuffer k1() {
        return this.f289787a.k1();
    }

    @Override // io.grpc.internal.i2
    public byte[] ka() {
        return this.f289787a.ka();
    }

    @Override // io.grpc.internal.i2
    public i2 l2(int i10) {
        return this.f289787a.l2(i10);
    }

    @Override // io.grpc.internal.i2
    public int l8() {
        return this.f289787a.l8();
    }

    @Override // io.grpc.internal.i2
    public boolean markSupported() {
        return this.f289787a.markSupported();
    }

    @Override // io.grpc.internal.i2
    public int q0() {
        return this.f289787a.q0();
    }

    @Override // io.grpc.internal.i2
    public int readInt() {
        return this.f289787a.readInt();
    }

    @Override // io.grpc.internal.i2
    public int readUnsignedByte() {
        return this.f289787a.readUnsignedByte();
    }

    @Override // io.grpc.internal.i2
    public void reset() {
        this.f289787a.reset();
    }

    @Override // io.grpc.internal.i2
    public void skipBytes(int i10) {
        this.f289787a.skipBytes(i10);
    }

    public String toString() {
        return com.google.common.base.b0.c(this).f("delegate", this.f289787a).toString();
    }

    @Override // io.grpc.internal.i2
    public void u7() {
        this.f289787a.u7();
    }

    @Override // io.grpc.internal.i2
    public void x4() {
        this.f289787a.x4();
    }
}
