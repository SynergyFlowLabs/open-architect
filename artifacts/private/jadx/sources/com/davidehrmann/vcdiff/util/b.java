package com.davidehrmann.vcdiff.util;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.slf4j.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final org.slf4j.c f97999a = e.k(b.class);

    public static class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f98000a = -2989212562402509511L;

        protected a() {
        }
    }

    /* JADX INFO: renamed from: com.davidehrmann.vcdiff.util.b$b, reason: collision with other inner class name */
    public static class C0884b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f98001a = 2648357489942607161L;

        protected C0884b(String str) {
            super((String) com.davidehrmann.vcdiff.util.a.a(str));
        }
    }

    private b() {
    }

    public static int a(int i10) {
        int i11 = 0;
        for (int i12 = 28; i12 >= 0; i12 -= 7) {
            if ((i10 >> i12) != 0 || i12 == 0) {
                i11++;
            }
        }
        return i11;
    }

    public static int b(long j10) {
        int i10 = 0;
        for (int i11 = 63; i11 >= 0; i11 -= 7) {
            if ((j10 >> i11) != 0 || i11 == 0) {
                i10++;
            }
        }
        return i10;
    }

    public static int c(ByteBuffer byteBuffer) throws a, C0884b {
        int iPosition = byteBuffer.position();
        int i10 = 0;
        while (byteBuffer.hasRemaining()) {
            if (byteBuffer.position() - iPosition >= 5) {
                throw new C0884b("Data too long for a 32-bit int");
            }
            byte b10 = byteBuffer.get();
            int i11 = i10 + (b10 & 127);
            if ((b10 & 128) == 0) {
                return i11;
            }
            if (i11 > 16777215) {
                throw new C0884b("Value too large to fit in an int");
            }
            i10 = i11 << 7;
        }
        throw new a();
    }

    public static long d(ByteBuffer byteBuffer) throws a, C0884b {
        int iPosition = byteBuffer.position();
        long j10 = 0;
        while (byteBuffer.hasRemaining()) {
            if (byteBuffer.position() - iPosition >= 10) {
                throw new C0884b("Data too long for a 64-bit int");
            }
            byte b10 = byteBuffer.get();
            long j11 = j10 + ((long) (b10 & 127));
            if ((b10 & 128) == 0) {
                if (j11 < 0) {
                    new Exception().printStackTrace();
                }
                return j11;
            }
            if (j11 > 72057594037927935L) {
                throw new C0884b("Value too large to fit in an int");
            }
            j10 = j11 << 7;
        }
        throw new a();
    }

    public static void e(ByteBuffer byteBuffer, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(String.format("Value (%d) was negative", Integer.valueOf(i10)));
        }
        int i11 = 28;
        while (i11 >= 0) {
            int i12 = i10 >> i11;
            if (i12 != 0 || i11 == 0) {
                byteBuffer.put((byte) ((i12 & 127) | (i11 == 0 ? 0 : 128)));
            }
            i11 -= 7;
        }
    }

    public static void f(ByteBuffer byteBuffer, long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(String.format("Value (%d) was negative", Long.valueOf(j10)));
        }
        int i10 = 63;
        while (i10 >= 0) {
            long j11 = j10 >> i10;
            if (j11 != 0 || i10 == 0) {
                byteBuffer.put((byte) ((j11 & 127) | ((long) (i10 == 0 ? 0 : 128))));
            }
            i10 -= 7;
        }
    }

    public static void g(OutputStream outputStream, int i10) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException(String.format("Value (%d) was negative", Integer.valueOf(i10)));
        }
        int i11 = 28;
        while (i11 >= 0) {
            int i12 = i10 >> i11;
            if (i12 != 0 || i11 == 0) {
                outputStream.write((byte) ((i12 & 127) | (i11 == 0 ? 0 : 128)));
            }
            i11 -= 7;
        }
    }

    public static void h(OutputStream outputStream, long j10) throws IOException {
        if (j10 < 0) {
            throw new IllegalArgumentException(String.format("Value (%d) was negative", Long.valueOf(j10)));
        }
        int i10 = 63;
        while (i10 >= 0) {
            long j11 = j10 >> i10;
            if (j11 != 0 || i10 == 0) {
                outputStream.write((byte) ((j11 & 127) | ((long) (i10 == 0 ? 0 : 128))));
            }
            i10 -= 7;
        }
    }
}
