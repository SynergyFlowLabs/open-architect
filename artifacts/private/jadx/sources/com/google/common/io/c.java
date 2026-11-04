package com.google.common.io;

import java.io.DataInput;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public interface c extends DataInput {
    @Override // java.io.DataInput
    @z7.a
    boolean readBoolean();

    @Override // java.io.DataInput
    @z7.a
    byte readByte();

    @Override // java.io.DataInput
    @z7.a
    char readChar();

    @Override // java.io.DataInput
    @z7.a
    double readDouble();

    @Override // java.io.DataInput
    @z7.a
    float readFloat();

    @Override // java.io.DataInput
    void readFully(byte[] b10);

    @Override // java.io.DataInput
    void readFully(byte[] b10, int off, int len);

    @Override // java.io.DataInput
    @z7.a
    int readInt();

    @Override // java.io.DataInput
    @z7.a
    @fj.a
    String readLine();

    @Override // java.io.DataInput
    @z7.a
    long readLong();

    @Override // java.io.DataInput
    @z7.a
    short readShort();

    @Override // java.io.DataInput
    @z7.a
    String readUTF();

    @Override // java.io.DataInput
    @z7.a
    int readUnsignedByte();

    @Override // java.io.DataInput
    @z7.a
    int readUnsignedShort();

    @Override // java.io.DataInput
    int skipBytes(int n10);
}
