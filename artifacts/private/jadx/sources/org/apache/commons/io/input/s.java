package org.apache.commons.io.input;

import java.io.DataInput;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public class s extends o implements DataInput {
    public s(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException {
        return readByte() != 0;
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        return (byte) ((FilterInputStream) this).in.read();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException {
        return (char) readShort();
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException {
        return org.apache.commons.io.e.b(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException {
        return org.apache.commons.io.e.d(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        return org.apache.commons.io.e.f(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public String readLine() throws IOException {
        throw new UnsupportedOperationException("Operation not supported: readLine()");
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        return org.apache.commons.io.e.h(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        return org.apache.commons.io.e.j(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException {
        throw new UnsupportedOperationException("Operation not supported: readUTF()");
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException {
        return ((FilterInputStream) this).in.read();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        return org.apache.commons.io.e.n(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public int skipBytes(int i10) throws IOException {
        return (int) ((FilterInputStream) this).in.skip(i10);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i11;
        while (i12 > 0) {
            int i13 = read(bArr, (i10 + i11) - i12, i12);
            if (-1 == i13) {
                throw new EOFException();
            }
            i12 -= i13;
        }
    }
}
