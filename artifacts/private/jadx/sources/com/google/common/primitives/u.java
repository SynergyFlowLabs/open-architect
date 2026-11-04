package com.google.common.primitives;

import com.google.common.base.j0;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@f
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte f119785a = -128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte f119786b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f119787c = 255;

    @com.google.common.annotations.e
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final String f119788a = a.class.getName() + "$UnsafeComparator";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Comparator<byte[]> f119789b = a();

        /* JADX INFO: renamed from: com.google.common.primitives.u$a$a, reason: collision with other inner class name */
        enum EnumC1110a implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public int compare(byte[] left, byte[] right) {
                int iMin = Math.min(left.length, right.length);
                for (int i10 = 0; i10 < iMin; i10++) {
                    int iB = u.b(left[i10], right[i10]);
                    if (iB != 0) {
                        return iB;
                    }
                }
                return left.length - right.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        @com.google.common.annotations.e
        enum b implements Comparator<byte[]> {
            INSTANCE;


            /* JADX INFO: renamed from: b, reason: collision with root package name */
            static final boolean f119793b = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            static final Unsafe f119794c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            static final int f119795d;

            /* JADX INFO: renamed from: com.google.common.primitives.u$a$b$a, reason: collision with other inner class name */
            class C1111a implements PrivilegedExceptionAction<Unsafe> {
                C1111a() {
                }

                @Override // java.security.PrivilegedExceptionAction
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Unsafe run() throws Exception {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }
            }

            static {
                Unsafe unsafeN = n();
                f119794c = unsafeN;
                int iArrayBaseOffset = unsafeN.arrayBaseOffset(byte[].class);
                f119795d = iArrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || iArrayBaseOffset % 8 != 0 || unsafeN.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            private static Unsafe n() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (SecurityException unused) {
                        return (Unsafe) AccessController.doPrivileged(new C1111a());
                    }
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public int compare(byte[] left, byte[] right) {
                int iMin = Math.min(left.length, right.length);
                int i10 = iMin & (-8);
                int i11 = 0;
                while (i11 < i10) {
                    Unsafe unsafe = f119794c;
                    int i12 = f119795d;
                    long j10 = i11;
                    long j11 = unsafe.getLong(left, ((long) i12) + j10);
                    long j12 = unsafe.getLong(right, ((long) i12) + j10);
                    if (j11 != j12) {
                        if (f119793b) {
                            return Long.compareUnsigned(j11, j12);
                        }
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11 ^ j12) & (-8);
                        return ((int) ((j11 >>> iNumberOfTrailingZeros) & 255)) - ((int) (255 & (j12 >>> iNumberOfTrailingZeros)));
                    }
                    i11 += 8;
                }
                while (i11 < iMin) {
                    int iB = u.b(left[i11], right[i11]);
                    if (iB != 0) {
                        return iB;
                    }
                    i11++;
                }
                return left.length - right.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        a() {
        }

        static Comparator<byte[]> a() {
            try {
                Object[] enumConstants = Class.forName(f119788a).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return u.f();
            }
        }
    }

    private u() {
    }

    @z7.a
    public static byte a(long value) {
        j0.p((value >> 8) == 0, "out of range: %s", value);
        return (byte) value;
    }

    public static int b(byte a10, byte b10) {
        return p(a10) - p(b10);
    }

    private static byte c(byte b10) {
        return (byte) (b10 ^ 128);
    }

    public static String d(String separator, byte... array) {
        j0.E(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * (separator.length() + 3));
        sb2.append(p(array[0]));
        for (int i10 = 1; i10 < array.length; i10++) {
            sb2.append(separator);
            sb2.append(q(array[i10]));
        }
        return sb2.toString();
    }

    public static Comparator<byte[]> e() {
        return a.f119789b;
    }

    @com.google.common.annotations.e
    static Comparator<byte[]> f() {
        return a.EnumC1110a.INSTANCE;
    }

    public static byte g(byte... array) {
        j0.d(array.length > 0);
        int iP = p(array[0]);
        for (int i10 = 1; i10 < array.length; i10++) {
            int iP2 = p(array[i10]);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return (byte) iP;
    }

    public static byte h(byte... array) {
        j0.d(array.length > 0);
        int iP = p(array[0]);
        for (int i10 = 1; i10 < array.length; i10++) {
            int iP2 = p(array[i10]);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return (byte) iP;
    }

    @z7.a
    public static byte i(String string) {
        return j(string, 10);
    }

    @z7.a
    public static byte j(String string, int radix) {
        int i10 = Integer.parseInt((String) j0.E(string), radix);
        if ((i10 >> 8) == 0) {
            return (byte) i10;
        }
        throw new NumberFormatException("out of range: " + i10);
    }

    public static byte k(long value) {
        if (value > p((byte) -1)) {
            return (byte) -1;
        }
        if (value < 0) {
            return (byte) 0;
        }
        return (byte) value;
    }

    public static void l(byte[] array) {
        j0.E(array);
        m(array, 0, array.length);
    }

    public static void m(byte[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        for (int i10 = fromIndex; i10 < toIndex; i10++) {
            array[i10] = c(array[i10]);
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = c(array[fromIndex]);
            fromIndex++;
        }
    }

    public static void n(byte[] array) {
        j0.E(array);
        o(array, 0, array.length);
    }

    public static void o(byte[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        for (int i10 = fromIndex; i10 < toIndex; i10++) {
            array[i10] = (byte) (array[i10] ^ 127);
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = (byte) (array[fromIndex] ^ 127);
            fromIndex++;
        }
    }

    public static int p(byte value) {
        return value & 255;
    }

    public static String q(byte x10) {
        return r(x10, 10);
    }

    public static String r(byte x10, int radix) {
        j0.k(radix >= 2 && radix <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", radix);
        return Integer.toString(p(x10), radix);
    }
}
