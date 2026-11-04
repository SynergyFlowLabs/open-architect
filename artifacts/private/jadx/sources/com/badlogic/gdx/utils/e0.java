package com.badlogic.gdx.utils;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class e0 extends FilterInputStream implements DataInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DataInputStream f95485a;

    public e0(InputStream inputStream) {
        super(inputStream);
        this.f95485a = new DataInputStream(inputStream);
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException {
        return this.f95485a.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        return this.f95485a.readByte();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException {
        return this.f95485a.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        this.f95485a.readFully(bArr);
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        int[] iArr = new int[4];
        for (int i10 = 3; i10 >= 0; i10--) {
            iArr[i10] = this.f95485a.read();
        }
        return ((iArr[0] & 255) << 24) | ((iArr[1] & 255) << 16) | ((iArr[2] & 255) << 8) | (iArr[3] & 255);
    }

    @Override // java.io.DataInput
    public final String readLine() throws IOException {
        return this.f95485a.readLine();
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        int[] iArr = new int[8];
        for (int i10 = 7; i10 >= 0; i10--) {
            iArr[i10] = this.f95485a.read();
        }
        int i11 = 1 | 6;
        return ((long) (iArr[7] & 255)) | (((long) (iArr[0] & 255)) << 56) | (((long) (iArr[1] & 255)) << 48) | (((long) (iArr[2] & 255)) << 40) | (((long) (iArr[3] & 255)) << 32) | (((long) (iArr[4] & 255)) << 24) | (((long) (iArr[5] & 255)) << 16) | (((long) (iArr[6] & 255)) << 8);
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        return (short) ((this.f95485a.read() << 8) | (this.f95485a.read() & 255));
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException {
        return this.f95485a.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException {
        return this.f95485a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        return ((this.f95485a.read() & 255) << 8) | (this.f95485a.read() & 255);
    }

    @Override // java.io.DataInput
    public int skipBytes(int i10) throws IOException {
        return this.f95485a.skipBytes(i10);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f95485a.readFully(bArr, i10, i11);
    }
}
