package io.sentry.android.core;

import android.content.Context;
import io.sentry.e9;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @lm.n
    @Nullable
    static String f304385a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @lm.n
    static final String f304386b = "INSTALLATION";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f304387c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    protected static final io.sentry.util.a f304388d = new io.sentry.util.a();

    private m1() {
    }

    public static String a(@NotNull Context context) throws RuntimeException {
        io.sentry.m1 m1VarA = f304388d.a();
        try {
            if (f304385a == null) {
                File file = new File(context.getFilesDir(), f304386b);
                try {
                    if (!file.exists()) {
                        String strC = c(file);
                        f304385a = strC;
                        if (m1VarA != null) {
                            m1VarA.close();
                        }
                        return strC;
                    }
                    f304385a = b(file);
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            String str = f304385a;
            if (m1VarA != null) {
                m1VarA.close();
            }
            return str;
        } catch (Throwable th3) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @lm.n
    @NotNull
    static String b(@NotNull File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, f304387c);
            randomAccessFile.close();
            return str;
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @lm.n
    @NotNull
    static String c(@NotNull File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String strA = e9.a();
            fileOutputStream.write(strA.getBytes(f304387c));
            fileOutputStream.flush();
            fileOutputStream.close();
            return strA;
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
