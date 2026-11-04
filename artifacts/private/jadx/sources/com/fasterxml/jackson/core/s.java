package com.fasterxml.jackson.core;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface s {
    int a(OutputStream outputStream) throws IOException;

    int b();

    char[] c();

    byte[] d();

    int e(byte[] bArr, int i10);

    int f(char[] cArr, int i10);

    int g(byte[] bArr, int i10);

    String getValue();

    int h(ByteBuffer byteBuffer) throws IOException;

    int i(char[] cArr, int i10);

    int j(OutputStream outputStream) throws IOException;

    int k(ByteBuffer byteBuffer) throws IOException;

    byte[] l();
}
