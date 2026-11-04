package com.google.common.io;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public final class b0 extends FilterInputStream implements DataInput {
    public b0(InputStream in) {
        super((InputStream) com.google.common.base.j0.E(in));
    }

    private byte a() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (-1 != i10) {
            return (byte) i10;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @z7.a
    public boolean readBoolean() throws IOException {
        return readUnsignedByte() != 0;
    }

    @Override // java.io.DataInput
    @z7.a
    public byte readByte() throws IOException {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    @z7.a
    public char readChar() throws IOException {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @z7.a
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    @z7.a
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] b10) throws IOException {
        h.p(this, b10);
    }

    @Override // java.io.DataInput
    @z7.a
    public int readInt() throws IOException {
        byte bA = a();
        byte bA2 = a();
        return com.google.common.primitives.l.l(a(), a(), bA2, bA);
    }

    @Override // java.io.DataInput
    @z7.a
    @z7.e("Always throws UnsupportedOperationException")
    public String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    @z7.a
    public long readLong() throws IOException {
        byte bA = a();
        byte bA2 = a();
        byte bA3 = a();
        byte bA4 = a();
        byte bA5 = a();
        byte bA6 = a();
        return com.google.common.primitives.n.k(a(), a(), bA6, bA5, bA4, bA3, bA2, bA);
    }

    @Override // java.io.DataInput
    @z7.a
    public short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @z7.a
    public String readUTF() throws IOException {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    @z7.a
    public int readUnsignedByte() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 >= 0) {
            return i10;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @z7.a
    public int readUnsignedShort() throws IOException {
        return com.google.common.primitives.l.l((byte) 0, (byte) 0, a(), a());
    }

    @Override // java.io.DataInput
    public int skipBytes(int n10) throws IOException {
        return (int) ((FilterInputStream) this).in.skip(n10);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] b10, int off, int len) throws IOException {
        h.q(this, b10, off, len);
    }
}
