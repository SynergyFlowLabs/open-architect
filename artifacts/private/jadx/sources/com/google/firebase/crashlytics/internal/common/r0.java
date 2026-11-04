package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes5.dex */
class r0 {
    r0() {
    }

    private static void a(@androidx.annotation.p0 InputStream inputStream, @NonNull File file) throws Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        gZIPOutputStream2.finish();
                        i.g(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    i.g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static void b(File file, List<q0> list) {
        for (q0 q0Var : list) {
            InputStream inputStreamE = null;
            try {
                inputStreamE = q0Var.e();
                if (inputStreamE != null) {
                    a(inputStreamE, new File(file, q0Var.a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                i.g(null);
                throw th2;
            }
            i.g(inputStreamE);
        }
    }
}
