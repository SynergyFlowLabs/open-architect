package io.sentry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class f4 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f305427c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f305428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i1 f305429b;

    f4(@NotNull n8 n8Var, @NotNull i1 i1Var) {
        this.f305428a = n8Var;
        this.f305429b = i1Var;
    }

    @Nullable
    private Date a(@NotNull File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f305427c));
            try {
                String line = bufferedReader.readLine();
                this.f305428a.getLogger().c(y7.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateF = p.f(line);
                bufferedReader.close();
                return dateF;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            this.f305428a.getLogger().a(y7.ERROR, "Error reading the crash marker file.", e10);
            return null;
        } catch (IllegalArgumentException e11) {
            this.f305428a.getLogger().b(y7.ERROR, e11, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f305428a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f305428a.getLogger().c(y7.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!this.f305428a.isEnableAutoSessionTracking()) {
            this.f305428a.getLogger().c(y7.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = this.f305428a.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.f) && !((io.sentry.cache.f) envelopeDiskCache).O()) {
            this.f305428a.getLogger().c(y7.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        File fileJ = io.sentry.cache.f.J(cacheDirPath);
        n1 serializer = this.f305428a.getSerializer();
        if (fileJ.exists()) {
            this.f305428a.getLogger().c(y7.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileJ), f305427c));
                try {
                    k9 k9Var = (k9) serializer.c(bufferedReader, k9.class);
                    if (k9Var == null) {
                        this.f305428a.getLogger().c(y7.ERROR, "Stream from path %s resulted in a null envelope.", fileJ.getAbsolutePath());
                    } else {
                        File file = new File(this.f305428a.getCacheDirPath(), io.sentry.cache.f.f305182o);
                        Date date = null;
                        if (file.exists()) {
                            this.f305428a.getLogger().c(y7.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date dateA = a(file);
                            if (!file.delete()) {
                                this.f305428a.getLogger().c(y7.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                            }
                            k9Var.v(k9.c.Crashed, null, true);
                            date = dateA;
                        }
                        if (k9Var.f() == null) {
                            k9Var.d(date);
                        }
                        this.f305429b.k0(g6.c(serializer, k9Var, this.f305428a.getSdkVersion()));
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                this.f305428a.getLogger().a(y7.ERROR, "Error processing previous session.", th4);
            }
            if (fileJ.delete()) {
                return;
            }
            this.f305428a.getLogger().c(y7.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
