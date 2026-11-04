package b5;

import androidx.collection.g3;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f77555a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f77556b = -1;

    private b() {
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int b(InputStream inputStream, OutputStream outputStream) throws IOException {
        long jC = c(inputStream, outputStream);
        if (jC > g3.f12256c) {
            return -1;
        }
        return (int) jC;
    }

    public static long c(InputStream inputStream, OutputStream outputStream) throws IOException {
        return d(inputStream, outputStream, new byte[4096]);
    }

    public static long d(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static byte[] e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
