package com.badlogic.gdx.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f95486a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f95487b = new byte[0];

    public static class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized byte[] toByteArray() {
            int i10 = ((ByteArrayOutputStream) this).count;
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            if (i10 == bArr.length) {
                return bArr;
            }
            return super.toByteArray();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void b(InputStream inputStream, OutputStream outputStream) throws IOException {
        d(inputStream, outputStream, new byte[4096]);
    }

    public static void c(InputStream inputStream, OutputStream outputStream, int i10) throws IOException {
        d(inputStream, outputStream, new byte[i10]);
    }

    public static void d(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            }
            boolean z10 = false & false;
            outputStream.write(bArr, 0, i10);
        }
    }

    public static byte[] e(InputStream inputStream) throws IOException {
        return f(inputStream, inputStream.available());
    }

    public static byte[] f(InputStream inputStream, int i10) throws IOException {
        a aVar = new a(Math.max(0, i10));
        b(inputStream, aVar);
        return aVar.toByteArray();
    }

    public static String g(InputStream inputStream) throws IOException {
        return i(inputStream, inputStream.available(), null);
    }

    public static String h(InputStream inputStream, int i10) throws IOException {
        return i(inputStream, i10, null);
    }

    public static String i(InputStream inputStream, int i10, String str) throws IOException {
        InputStreamReader inputStreamReader = str == null ? new InputStreamReader(inputStream) : new InputStreamReader(inputStream, str);
        StringWriter stringWriter = new StringWriter(Math.max(0, i10));
        char[] cArr = new char[4096];
        while (true) {
            int i11 = inputStreamReader.read(cArr);
            if (i11 == -1) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, i11);
        }
    }
}
