package androidx.media2.player;

import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.b0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"RestrictedApi"})
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f58338a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f58339b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b0("sPosixLockV14")
    @p0
    private static Object f58340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b0("sPosixLockV14")
    @p0
    private static Method f58341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0("sPosixLockV14")
    @p0
    private static Method f58342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b0("sPosixLockV14")
    @p0
    private static Method f58343f;

    @w0(21)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(FileDescriptor fileDescriptor) throws ErrnoException {
            Os.close(fileDescriptor);
        }

        @androidx.annotation.u
        static FileDescriptor b(FileDescriptor fileDescriptor) throws ErrnoException {
            return Os.dup(fileDescriptor);
        }

        @androidx.annotation.u
        static long c(FileDescriptor fileDescriptor, long j10, int i10) throws ErrnoException {
            return Os.lseek(fileDescriptor, j10, i10);
        }
    }

    private h() {
    }

    public static void a(FileDescriptor fileDescriptor) throws IOException {
        c(fileDescriptor);
    }

    @e.a({"PrivateApi"})
    private static FileDescriptor b(FileDescriptor fileDescriptor) throws IOException {
        Object obj;
        Method method;
        try {
            synchronized (f58339b) {
                try {
                    g();
                    obj = f58340c;
                    method = f58343f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return (FileDescriptor) method.invoke(obj, fileDescriptor);
        } catch (Exception e10) {
            throw new IOException("Failed to close the file descriptor", e10);
        }
    }

    @w0(21)
    private static void c(FileDescriptor fileDescriptor) throws IOException {
        try {
            a.a(fileDescriptor);
        } catch (Exception e10) {
            throw new IOException("Failed to close the file descriptor", e10);
        }
    }

    public static FileDescriptor d(FileDescriptor fileDescriptor) throws IOException {
        return f(fileDescriptor);
    }

    @e.a({"PrivateApi"})
    private static FileDescriptor e(FileDescriptor fileDescriptor) throws IOException {
        Object obj;
        Method method;
        try {
            synchronized (f58339b) {
                try {
                    g();
                    obj = f58340c;
                    method = f58342e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return (FileDescriptor) method.invoke(obj, fileDescriptor);
        } catch (Exception e10) {
            throw new IOException("Failed to dup the file descriptor", e10);
        }
    }

    @w0(21)
    private static FileDescriptor f(FileDescriptor fileDescriptor) throws IOException {
        try {
            return a.b(fileDescriptor);
        } catch (Exception e10) {
            throw new IOException("Failed to dup the file descriptor", e10);
        }
    }

    private static void g() throws Exception {
        synchronized (f58339b) {
            try {
                if (f58340c != null) {
                    return;
                }
                Class<?> cls = Class.forName("libcore.io.Posix");
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                f58341d = cls.getMethod("lseek", FileDescriptor.class, Long.TYPE, Integer.TYPE);
                f58342e = cls.getMethod("dup", FileDescriptor.class);
                f58343f = cls.getMethod("close", FileDescriptor.class);
                f58340c = declaredConstructor.newInstance(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void h(FileDescriptor fileDescriptor, long j10) throws IOException {
        j(fileDescriptor, j10);
    }

    @e.a({"PrivateApi"})
    private static void i(FileDescriptor fileDescriptor, long j10) throws IOException {
        Object obj;
        Method method;
        try {
            synchronized (f58339b) {
                try {
                    g();
                    obj = f58340c;
                    method = f58341d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            method.invoke(obj, fileDescriptor, Long.valueOf(j10), 0);
        } catch (Exception e10) {
            throw new IOException("Failed to seek the file descriptor", e10);
        }
    }

    @w0(21)
    private static void j(FileDescriptor fileDescriptor, long j10) throws IOException {
        try {
            a.c(fileDescriptor, j10, OsConstants.SEEK_SET);
        } catch (Exception e10) {
            throw new IOException("Failed to seek the file descriptor", e10);
        }
    }
}
