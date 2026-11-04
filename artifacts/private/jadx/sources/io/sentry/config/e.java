package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.y7;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f305295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ILogger f305296b;

    public e(@NotNull String str, @NotNull ILogger iLogger) {
        this.f305295a = str;
        this.f305296b = iLogger;
    }

    @Override // io.sentry.config.f
    @Nullable
    public Properties a() {
        try {
            File file = new File(this.f305295a);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            this.f305296b.b(y7.ERROR, e10, "Failed to load Sentry configuration from file: %s", this.f305295a);
            return null;
        }
    }
}
