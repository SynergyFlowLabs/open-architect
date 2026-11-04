package io.sentry.android.core;

import android.os.Build;
import io.sentry.ILogger;
import io.sentry.y7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    final ILogger f304551a;

    public u0(@NotNull ILogger iLogger) {
        this.f304551a = (ILogger) io.sentry.util.y.c(iLogger, "The ILogger object is required.");
    }

    @Nullable
    public String a() {
        return Build.TAGS;
    }

    @Nullable
    public String b() {
        return Build.MANUFACTURER;
    }

    @Nullable
    public String c() {
        return Build.MODEL;
    }

    public int d() {
        return Build.VERSION.SDK_INT;
    }

    @Nullable
    public String e() {
        return Build.VERSION.RELEASE;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    @Nullable
    public Boolean f() {
        boolean z10;
        try {
            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                z10 = true;
            } else {
                String str = Build.FINGERPRINT;
                if (str.startsWith("generic") || str.startsWith("unknown")) {
                    z10 = true;
                } else {
                    String str2 = Build.HARDWARE;
                    if (str2.contains("goldfish") || str2.contains("ranchu")) {
                        z10 = true;
                    } else {
                        String str3 = Build.MODEL;
                        if (str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
                            z10 = true;
                        } else {
                            String str4 = Build.PRODUCT;
                            if (str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains(io.sentry.protocol.e.c.f306224l)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z10);
        } catch (Throwable th2) {
            this.f304551a.a(y7.ERROR, "Error checking whether application is running in an emulator.", th2);
            return null;
        }
    }
}
