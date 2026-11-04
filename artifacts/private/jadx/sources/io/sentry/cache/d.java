package io.sentry.cache;

import io.sentry.a2;
import io.sentry.n8;
import io.sentry.y7;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f305176a = Charset.forName("UTF-8");

    d() {
    }

    static void a(@NotNull n8 n8Var, @NotNull String str, @NotNull String str2) {
        File fileB = b(n8Var, str);
        if (fileB == null) {
            n8Var.getLogger().c(y7.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileB, str2);
        n8Var.getLogger().c(y7.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        n8Var.getLogger().c(y7.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    @Nullable
    static File b(@NotNull n8 n8Var, @NotNull String str) {
        String cacheDirPath = n8Var.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    @Nullable
    static <T, R> T c(@NotNull n8 n8Var, @NotNull String str, @NotNull String str2, @NotNull Class<T> cls, @Nullable a2<R> a2Var) {
        File fileB = b(n8Var, str);
        if (fileB == null) {
            n8Var.getLogger().c(y7.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileB, str2);
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f305176a));
                try {
                    T t10 = a2Var == null ? (T) n8Var.getSerializer().c(bufferedReader, cls) : (T) n8Var.getSerializer().d(bufferedReader, cls, a2Var);
                    bufferedReader.close();
                    return t10;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                n8Var.getLogger().b(y7.ERROR, th4, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            n8Var.getLogger().c(y7.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    static <T> void d(@NotNull n8 n8Var, @NotNull T t10, @NotNull String str, @NotNull String str2) {
        File fileB = b(n8Var, str);
        if (fileB == null) {
            n8Var.getLogger().c(y7.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileB, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f305176a));
                try {
                    n8Var.getSerializer().a(t10, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            n8Var.getLogger().b(y7.ERROR, th6, "Error persisting entity: %s", str2);
        }
    }
}
