package com.google.firebase.messaging;

import androidx.collection.g3;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f123443a = 8192;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f123444b = 2147483639;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f123445c = 20;

    private c() {
    }

    private static byte[] a(Queue<byte[]> queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = queue.remove();
        if (bArrRemove.length == i10) {
            return bArrRemove;
        }
        int length = i10 - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, i10);
        while (length > 0) {
            byte[] bArrRemove2 = queue.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, i10 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    static byte[] b() {
        return new byte[8192];
    }

    public static InputStream c(InputStream inputStream, long j10) {
        return new a(inputStream, j10);
    }

    private static int d(long j10) {
        if (j10 > g3.f12256c) {
            return Integer.MAX_VALUE;
        }
        if (j10 < g3.f12261h) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static byte[] e(InputStream inputStream) throws IOException {
        return f(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] f(InputStream inputStream, Queue<byte[]> queue, int i10) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i10) * 2));
        while (i10 < f123444b) {
            int iMin2 = Math.min(iMin, f123444b - i10);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i11 = 0;
            while (i11 < iMin2) {
                int i12 = inputStream.read(bArr, i11, iMin2 - i11);
                if (i12 == -1) {
                    return a(queue, i10);
                }
                i11 += i12;
                i10 += i12;
            }
            iMin = d(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return a(queue, f123444b);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static final class a extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f123446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f123447b;

        a(InputStream inputStream, long j10) {
            super(inputStream);
            this.f123447b = -1L;
            this.f123446a = j10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f123446a);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i10) {
            ((FilterInputStream) this).in.mark(i10);
            this.f123447b = this.f123446a;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f123446a == 0) {
                return -1;
            }
            int i10 = ((FilterInputStream) this).in.read();
            if (i10 != -1) {
                this.f123446a--;
            }
            return i10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            try {
                if (!((FilterInputStream) this).in.markSupported()) {
                    throw new IOException("Mark not supported");
                }
                if (this.f123447b == -1) {
                    throw new IOException("Mark not set");
                }
                ((FilterInputStream) this).in.reset();
                this.f123446a = this.f123447b;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f123446a));
            this.f123446a -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            long j10 = this.f123446a;
            if (j10 == 0) {
                return -1;
            }
            int i12 = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
            if (i12 != -1) {
                this.f123446a -= (long) i12;
            }
            return i12;
        }
    }
}
