package rx.internal.util.unsafe;

import java.lang.reflect.Field;
import rx.internal.util.SuppressAnimalSniffer;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes14.dex */
@SuppressAnimalSniffer
public final class UnsafeAccess {
    private static final boolean DISABLED_BY_USER;
    public static final Unsafe UNSAFE;

    static {
        DISABLED_BY_USER = System.getProperty("rx.unsafe-disable") != null;
        Unsafe unsafe = null;
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (Unsafe) declaredField.get(null);
        } catch (Throwable unused) {
        }
        UNSAFE = unsafe;
    }

    private UnsafeAccess() {
        throw new IllegalStateException("No instances!");
    }

    public static long addressOf(Class<?> cls, String str) {
        try {
            return UNSAFE.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            InternalError internalError = new InternalError();
            internalError.initCause(e10);
            throw internalError;
        }
    }

    public static boolean compareAndSwapInt(Object obj, long j10, int i10, int i11) {
        return UNSAFE.compareAndSwapInt(obj, j10, i10, i11);
    }

    public static int getAndAddInt(Object obj, long j10, int i10) {
        while (true) {
            Unsafe unsafe = UNSAFE;
            int intVolatile = unsafe.getIntVolatile(obj, j10);
            Object obj2 = obj;
            long j11 = j10;
            if (unsafe.compareAndSwapInt(obj2, j11, intVolatile, intVolatile + i10)) {
                return intVolatile;
            }
            obj = obj2;
            j10 = j11;
        }
    }

    public static int getAndIncrementInt(Object obj, long j10) {
        while (true) {
            Unsafe unsafe = UNSAFE;
            int intVolatile = unsafe.getIntVolatile(obj, j10);
            Object obj2 = obj;
            long j11 = j10;
            if (unsafe.compareAndSwapInt(obj2, j11, intVolatile, intVolatile + 1)) {
                return intVolatile;
            }
            obj = obj2;
            j10 = j11;
        }
    }

    public static int getAndSetInt(Object obj, long j10, int i10) {
        while (true) {
            Unsafe unsafe = UNSAFE;
            int intVolatile = unsafe.getIntVolatile(obj, j10);
            Object obj2 = obj;
            long j11 = j10;
            int i11 = i10;
            if (unsafe.compareAndSwapInt(obj2, j11, intVolatile, i11)) {
                return intVolatile;
            }
            obj = obj2;
            j10 = j11;
            i10 = i11;
        }
    }

    public static boolean isUnsafeAvailable() {
        return (UNSAFE == null || DISABLED_BY_USER) ? false : true;
    }
}
