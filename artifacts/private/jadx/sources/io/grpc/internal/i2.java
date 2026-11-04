package io.grpc.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public interface i2 extends Closeable {
    boolean D0();

    void Ee(OutputStream outputStream, int i10) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean dc();

    void e7(byte[] bArr, int i10, int i11);

    void g5(ByteBuffer byteBuffer);

    @fj.h
    ByteBuffer k1();

    byte[] ka();

    i2 l2(int i10);

    int l8();

    boolean markSupported();

    int q0();

    int readInt();

    int readUnsignedByte();

    void reset();

    void skipBytes(int i10);

    void u7();

    default void x4() {
    }
}
