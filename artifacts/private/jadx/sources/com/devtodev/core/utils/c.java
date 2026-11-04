package com.devtodev.core.utils;

import android.content.Context;
import com.devtodev.core.utils.log.CoreLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f98349a;

    public static synchronized boolean a(Context context) {
        try {
            if (f98349a == null) {
                File file = new File(context.getFilesDir(), "devtodev_android");
                try {
                    if (!file.exists()) {
                        b(file);
                        return true;
                    }
                    f98349a = a(file);
                } catch (IOException unused) {
                    CoreLog.e("DevToDev", "Runtime exception in method 'isNewInstall'");
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void b(File file) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write("install".getBytes());
                    fileOutputStream2.close();
                } catch (Exception e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    CoreLog.e("DevToDev", "Exception on write installation file " + e.getMessage());
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v5, types: [byte[]] */
    private static String a(File file) throws Throwable {
        byte[] bArr;
        RandomAccessFile randomAccessFile = 0;
        byte[] bArr2 = null;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                RandomAccessFile randomAccessFile3 = new RandomAccessFile(file, "r");
                try {
                    bArr2 = new byte[(int) randomAccessFile3.length()];
                    randomAccessFile3.readFully(bArr2);
                    randomAccessFile3.close();
                    randomAccessFile = bArr2;
                } catch (Exception e10) {
                    e = e10;
                    bArr = bArr2;
                    randomAccessFile2 = randomAccessFile3;
                    CoreLog.e("DevToDev", "Exception on read installation file " + e.getMessage());
                    if (randomAccessFile2 != null) {
                        randomAccessFile2.close();
                    }
                    randomAccessFile = bArr;
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = randomAccessFile3;
                    if (randomAccessFile != 0) {
                        randomAccessFile.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
            bArr = null;
        }
        return new String((byte[]) randomAccessFile);
    }
}
