package com.google.common.hash;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
@k
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f118916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f118917b = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f118918a = new a("INSTANCE", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ b[] f118919b = k();

        final enum a extends b {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.hash.y.c
            public long b(byte[] source, int offset) {
                return com.google.common.primitives.n.k(source[offset + 7], source[offset + 6], source[offset + 5], source[offset + 4], source[offset + 3], source[offset + 2], source[offset + 1], source[offset]);
            }

            @Override // com.google.common.hash.y.c
            public void c(byte[] sink, int offset, long value) {
                long j10 = 255;
                for (int i10 = 0; i10 < 8; i10++) {
                    sink[offset + i10] = (byte) ((value & j10) >> (i10 * 8));
                    j10 <<= 8;
                }
            }
        }

        private b(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ b[] k() {
            return new b[]{f118918a};
        }

        public static b valueOf(String name) {
            return (b) Enum.valueOf(b.class, name);
        }

        public static b[] values() {
            return (b[]) f118919b.clone();
        }
    }

    private interface c {
        long b(byte[] array, int offset);

        void c(byte[] array, int offset, long value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class d implements c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Unsafe f118922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f118923d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f118920a = new a("UNSAFE_LITTLE_ENDIAN", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f118921b = new b("UNSAFE_BIG_ENDIAN", 1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ d[] f118924e = l();

        final enum a extends d {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.hash.y.c
            public long b(byte[] array, int offset) {
                return d.f118922c.getLong(array, ((long) offset) + ((long) d.f118923d));
            }

            @Override // com.google.common.hash.y.c
            public void c(byte[] array, int offset, long value) {
                d.f118922c.putLong(array, ((long) offset) + ((long) d.f118923d), value);
            }
        }

        final enum b extends d {
            b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.hash.y.c
            public long b(byte[] array, int offset) {
                return Long.reverseBytes(d.f118922c.getLong(array, ((long) offset) + ((long) d.f118923d)));
            }

            @Override // com.google.common.hash.y.c
            public void c(byte[] array, int offset, long value) {
                d.f118922c.putLong(array, ((long) offset) + ((long) d.f118923d), Long.reverseBytes(value));
            }
        }

        static {
            Unsafe unsafeP = p();
            f118922c = unsafeP;
            f118923d = unsafeP.arrayBaseOffset(byte[].class);
            if (unsafeP.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
            }
        }

        private d(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ d[] l() {
            return new d[]{f118920a, f118921b};
        }

        private static Unsafe p() {
            try {
                try {
                    return Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.common.hash.z
                        @Override // java.security.PrivilegedExceptionAction
                        public final Object run() {
                            return y.d.q();
                        }
                    });
                }
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unsafe q() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        public static d valueOf(String name) {
            return (d) Enum.valueOf(d.class, name);
        }

        public static d[] values() {
            return (d[]) f118924e.clone();
        }
    }

    static {
        c cVar = b.f118918a;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                cVar = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? d.f118920a : d.f118921b;
            }
        } catch (Throwable unused) {
        }
        f118916a = cVar;
    }

    private y() {
    }

    static int a(byte[] source, int offset) {
        return ((source[offset + 3] & 255) << 24) | (source[offset] & 255) | ((source[offset + 1] & 255) << 8) | ((source[offset + 2] & 255) << 16);
    }

    static long b(byte[] input, int offset) {
        return f118916a.b(input, offset);
    }

    static long c(byte[] input, int offset, int length) {
        int iMin = Math.min(length, 8);
        long j10 = 0;
        for (int i10 = 0; i10 < iMin; i10++) {
            j10 |= (((long) input[offset + i10]) & 255) << (i10 * 8);
        }
        return j10;
    }

    static void d(byte[] sink, int offset, long value) {
        f118916a.c(sink, offset, value);
    }

    static boolean e() {
        return f118916a instanceof d;
    }
}
