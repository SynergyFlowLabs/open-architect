package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f125242a;

    static class a {
        a() {
        }

        static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws IllegalArgumentException {
            if (f(b11) || (((b10 << com.google.common.base.c.F) + (b11 + 112)) >> 30) != 0 || f(b12) || f(b13)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int iK = ((b10 & 7) << 18) | (k(b11) << 12) | (k(b12) << 6) | k(b13);
            cArr[i10] = e(iK);
            cArr[i10 + 1] = j(iK);
        }

        static void b(byte b10, char[] cArr, int i10) {
            cArr[i10] = (char) b10;
        }

        static void c(byte b10, byte b11, byte b12, char[] cArr, int i10) throws IllegalArgumentException {
            if (f(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || f(b12)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i10] = (char) (((b10 & com.google.common.base.c.f116464q) << 12) | (k(b11) << 6) | k(b12));
        }

        static void d(byte b10, byte b11, char[] cArr, int i10) throws IllegalArgumentException {
            if (b10 < -62 || f(b11)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i10] = (char) (((b10 & com.google.common.base.c.I) << 6) | k(b11));
        }

        private static char e(int i10) {
            return (char) ((i10 >>> 10) + 55232);
        }

        private static boolean f(byte b10) {
            return b10 > -65;
        }

        static boolean g(byte b10) {
            return b10 >= 0;
        }

        static boolean h(byte b10) {
            return b10 < -16;
        }

        static boolean i(byte b10) {
            return b10 < -32;
        }

        private static char j(int i10) {
            return (char) ((i10 & 1023) + 56320);
        }

        private static int k(byte b10) {
            return b10 & 63;
        }
    }

    static class b extends IllegalArgumentException {
        b(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    public static f d() {
        if (f125242a == null) {
            f125242a = new i();
        }
        return f125242a;
    }

    public static void e(f fVar) {
        f125242a = fVar;
    }

    public abstract String a(ByteBuffer byteBuffer, int i10, int i11);

    public abstract void b(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int c(CharSequence charSequence);
}
