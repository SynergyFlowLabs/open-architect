package com.badlogic.gdx.utils.compression;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    static class a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f95258o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f95259p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f95260q = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f95261a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f95262b = 10;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f95263c = 8388608;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f95264d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f95265e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f95266f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f95267g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f95268h = 128;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f95269i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f95270j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f95271k = 2;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f95272l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f95273m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f95274n;

        a() {
            int i10 = 3 | 3;
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        a aVar = new a();
        boolean z10 = aVar.f95270j;
        com.badlogic.gdx.utils.compression.lzma.c cVar = new com.badlogic.gdx.utils.compression.lzma.c();
        if (!cVar.w(aVar.f95271k)) {
            throw new RuntimeException("Incorrect compression mode");
        }
        if (!cVar.x(aVar.f95263c)) {
            throw new RuntimeException("Incorrect dictionary size");
        }
        if (!cVar.B(aVar.f95268h)) {
            throw new RuntimeException("Incorrect -fb value");
        }
        if (!cVar.A(aVar.f95272l)) {
            throw new RuntimeException("Incorrect -mf value");
        }
        if (!cVar.z(aVar.f95265e, aVar.f95266f, aVar.f95267g)) {
            throw new RuntimeException("Incorrect -lc or -lp or -pb value");
        }
        cVar.y(z10);
        cVar.F(outputStream);
        long j10 = -1;
        if (!z10) {
            long jAvailable = inputStream.available();
            if (jAvailable != 0) {
                j10 = jAvailable;
            }
        }
        for (int i10 = 0; i10 < 8; i10++) {
            outputStream.write(((int) (j10 >>> (i10 * 8))) & 255);
        }
        cVar.d(inputStream, outputStream, -1L, -1L, null);
    }

    public static void b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[5];
        if (inputStream.read(bArr, 0, 5) != 5) {
            throw new RuntimeException("input .lzma file is too short");
        }
        com.badlogic.gdx.utils.compression.lzma.b bVar = new com.badlogic.gdx.utils.compression.lzma.b();
        if (!bVar.c(bArr)) {
            throw new RuntimeException("Incorrect stream properties");
        }
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = inputStream.read();
            if (i11 < 0) {
                throw new RuntimeException("Can't read stream size");
            }
            j10 |= ((long) i11) << (i10 * 8);
        }
        if (!bVar.a(inputStream, outputStream, j10)) {
            throw new RuntimeException("Error in data stream");
        }
    }
}
