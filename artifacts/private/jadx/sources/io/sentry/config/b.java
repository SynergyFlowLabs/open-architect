package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.y7;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f305290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ClassLoader f305291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ILogger f305292c;

    public b(@NotNull String str, @Nullable ClassLoader classLoader, @NotNull ILogger iLogger) {
        this.f305290a = str;
        this.f305291b = io.sentry.util.c.a(classLoader);
        this.f305292c = iLogger;
    }

    @Override // io.sentry.config.f
    @Nullable
    public Properties a() {
        try {
            InputStream resourceAsStream = this.f305291b.getResourceAsStream(this.f305290a);
            if (resourceAsStream == null) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return null;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e10) {
            this.f305292c.b(y7.ERROR, e10, "Failed to load Sentry configuration from classpath resource: %s", this.f305290a);
            return null;
        }
    }

    public b(@NotNull ILogger iLogger) {
        this("sentry.properties", b.class.getClassLoader(), iLogger);
    }
}
