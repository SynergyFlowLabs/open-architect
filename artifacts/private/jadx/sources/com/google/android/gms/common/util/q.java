package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.gms.common.internal.a0
@g6.a
@Deprecated
public final class q {
    private q() {
    }

    @g6.a
    public static void a(@fj.h ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @g6.a
    public static void b(@fj.h Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @g6.a
    @Deprecated
    public static long c(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) throws IOException {
        return d(inputStream, outputStream, false, 1024);
    }

    @g6.a
    @Deprecated
    public static long d(@NonNull InputStream inputStream, @NonNull OutputStream outputStream, boolean z10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        long j10 = 0;
        while (true) {
            try {
                int i11 = inputStream.read(bArr, 0, i10);
                if (i11 == -1) {
                    break;
                }
                j10 += (long) i11;
                outputStream.write(bArr, 0, i11);
            } catch (Throwable th2) {
                if (z10) {
                    b(inputStream);
                    b(outputStream);
                }
                throw th2;
            }
        }
        if (z10) {
            b(inputStream);
            b(outputStream);
        }
        return j10;
    }

    @g6.a
    public static boolean e(@NonNull byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    @g6.a
    @Deprecated
    public static byte[] f(@NonNull InputStream inputStream) throws IOException {
        return g(inputStream, true);
    }

    @NonNull
    @g6.a
    @Deprecated
    public static byte[] g(@NonNull InputStream inputStream, boolean z10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d(inputStream, byteArrayOutputStream, z10, 1024);
        return byteArrayOutputStream.toByteArray();
    }

    @NonNull
    @g6.a
    @Deprecated
    public static byte[] h(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.google.android.gms.common.internal.w.r(inputStream);
        com.google.android.gms.common.internal.w.r(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }
}
