package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.ILogger;
import io.sentry.android.core.u0;
import io.sentry.y7;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Charset f304332g = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f304333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final u0 f304334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ILogger f304335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String[] f304336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String[] f304337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Runtime f304338f;

    public s(@NotNull Context context, @NotNull u0 u0Var, @NotNull ILogger iLogger) {
        this(context, u0Var, iLogger, new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    private boolean a() {
        String strA = this.f304334b.a();
        return strA != null && strA.contains("test-keys");
    }

    private boolean b() {
        for (String str : this.f304336d) {
            try {
                if (new File(str).exists()) {
                    return true;
                }
            } catch (RuntimeException e10) {
                this.f304335c.b(y7.ERROR, e10, "Error when trying to check if root file %s exists.", str);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    private boolean c() {
        Process process = null;
        try {
            try {
                try {
                    Process processExec = this.f304338f.exec(new String[]{"/system/xbin/which", androidx.media3.exoplayer.upstream.f.f65986z});
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), f304332g));
                    try {
                        boolean z10 = bufferedReader.readLine() != null;
                        bufferedReader.close();
                        processExec.destroy();
                        return z10;
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException unused) {
                    this.f304335c.c(y7.DEBUG, "SU isn't found on this Device.", new Object[0]);
                    if (0 != 0) {
                        process.destroy();
                    }
                    return false;
                }
            } catch (Throwable th4) {
                this.f304335c.a(y7.DEBUG, "Error when trying to check if SU exists.", th4);
                if (0 != 0) {
                    process.destroy();
                }
                return false;
            }
        } catch (Throwable th5) {
            if (0 != 0) {
                process.destroy();
            }
            throw th5;
        }
    }

    @e.a({"NewApi"})
    private boolean d(@NotNull ILogger iLogger) {
        u0 u0Var = new u0(iLogger);
        PackageManager packageManager = this.f304333a.getPackageManager();
        if (packageManager != null) {
            for (String str : this.f304337e) {
                try {
                    if (u0Var.d() >= 33) {
                        packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                        return true;
                    }
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    public boolean e() {
        return a() || b() || c() || d(this.f304335c);
    }

    s(@NotNull Context context, @NotNull u0 u0Var, @NotNull ILogger iLogger, @NotNull String[] strArr, @NotNull String[] strArr2, @NotNull Runtime runtime) {
        this.f304333a = (Context) io.sentry.util.y.c(context, "The application context is required.");
        this.f304334b = (u0) io.sentry.util.y.c(u0Var, "The BuildInfoProvider is required.");
        this.f304335c = (ILogger) io.sentry.util.y.c(iLogger, "The Logger is required.");
        this.f304336d = (String[]) io.sentry.util.y.c(strArr, "The root Files are required.");
        this.f304337e = (String[]) io.sentry.util.y.c(strArr2, "The root packages are required.");
        this.f304338f = (Runtime) io.sentry.util.y.c(runtime, "The Runtime is required.");
    }
}
