package com.google.api.client.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f116083a = 4096;

    private i() {
    }

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        h0.d(inputStream);
        h0.d(outputStream);
        byte[] bArr = new byte[4096];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static InputStream b(InputStream inputStream, long j10) {
        return new a(inputStream, j10);
    }

    public static int c(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        h0.d(inputStream);
        h0.d(bArr);
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i12 = 0;
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, i10 + i12, i11 - i12);
            if (i13 == -1) {
                break;
            }
            i12 += i13;
        }
        return i12;
    }

    private static final class a extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f116084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f116085b;

        a(InputStream inputStream, long j10) {
            super(inputStream);
            this.f116085b = -1L;
            h0.d(inputStream);
            h0.b(j10 >= 0, "limit must be non-negative");
            this.f116084a = j10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f116084a);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i10) {
            ((FilterInputStream) this).in.mark(i10);
            this.f116085b = this.f116084a;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f116084a == 0) {
                return -1;
            }
            int i10 = ((FilterInputStream) this).in.read();
            if (i10 != -1) {
                this.f116084a--;
            }
            return i10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            try {
                if (!((FilterInputStream) this).in.markSupported()) {
                    throw new IOException("Mark not supported");
                }
                if (this.f116085b == -1) {
                    throw new IOException("Mark not set");
                }
                ((FilterInputStream) this).in.reset();
                this.f116084a = this.f116085b;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f116084a));
            this.f116084a -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            long j10 = this.f116084a;
            if (j10 == 0) {
                return -1;
            }
            int i12 = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
            if (i12 != -1) {
                this.f116084a -= (long) i12;
            }
            return i12;
        }
    }
}
