package androidx.datastore.preferences.protobuf;

import com.appsflyer.AppsFlyerProperties;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes2.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f50554a = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f50555b = 16384;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f50556c = 0.5f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<SoftReference<byte[]>> f50557d = new ThreadLocal<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Class<?> f50558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f50559f;

    static {
        Class<?> clsF = f("java.io.FileOutputStream");
        f50558e = clsF;
        f50559f = c(clsF);
    }

    private s() {
    }

    static void a() {
        f50557d.set(null);
    }

    private static byte[] b() {
        SoftReference<byte[]> softReference = f50557d.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    private static long c(Class<?> clazz) {
        if (clazz != null) {
            try {
                if (w4.U()) {
                    return w4.Z(clazz.getDeclaredField(AppsFlyerProperties.CHANNEL));
                }
            } catch (Throwable unused) {
            }
        }
        return -1L;
    }

    private static byte[] d(int requestedSize) {
        int iMax = Math.max(requestedSize, 1024);
        byte[] bArrB = b();
        if (bArrB != null && !e(iMax, bArrB.length)) {
            return bArrB;
        }
        byte[] bArr = new byte[iMax];
        if (iMax <= 16384) {
            g(bArr);
        }
        return bArr;
    }

    private static boolean e(int requestedSize, int bufferLength) {
        return bufferLength < requestedSize && ((float) bufferLength) < ((float) requestedSize) * 0.5f;
    }

    private static Class<?> f(String className) {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static void g(byte[] value) {
        f50557d.set(new SoftReference<>(value));
    }

    static void h(ByteBuffer buffer, OutputStream output) throws IOException {
        int iPosition = buffer.position();
        try {
            if (buffer.hasArray()) {
                output.write(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
            } else if (!i(buffer, output)) {
                byte[] bArrD = d(buffer.remaining());
                while (buffer.hasRemaining()) {
                    int iMin = Math.min(buffer.remaining(), bArrD.length);
                    buffer.get(bArrD, 0, iMin);
                    output.write(bArrD, 0, iMin);
                }
            }
            v1.e(buffer, iPosition);
        } catch (Throwable th2) {
            v1.e(buffer, iPosition);
            throw th2;
        }
    }

    private static boolean i(ByteBuffer buffer, OutputStream output) throws IOException {
        WritableByteChannel writableByteChannel;
        long j10 = f50559f;
        if (j10 < 0 || !f50558e.isInstance(output)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) w4.Q(output, j10);
        } catch (ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(buffer);
        return true;
    }
}
