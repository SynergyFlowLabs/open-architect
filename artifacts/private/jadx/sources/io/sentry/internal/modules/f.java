package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.y7;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class f extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ClassLoader f305637f;

    public f(@NotNull ILogger iLogger) {
        this(iLogger, f.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.d
    protected Map<String, String> b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream resourceAsStream = this.f305637f.getResourceAsStream(d.f305632e);
            try {
                if (resourceAsStream != null) {
                    Map<String, String> mapC = c(resourceAsStream);
                    resourceAsStream.close();
                    return mapC;
                }
                this.f305633a.c(y7.INFO, "%s file was not found.", d.f305632e);
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                    return treeMap;
                }
                return treeMap;
            } catch (Throwable th2) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e10) {
            this.f305633a.a(y7.INFO, "Access to resources failed.", e10);
        } catch (SecurityException e11) {
            this.f305633a.a(y7.INFO, "Access to resources denied.", e11);
        }
    }

    f(@NotNull ILogger iLogger, @Nullable ClassLoader classLoader) {
        super(iLogger);
        this.f305637f = io.sentry.util.c.a(classLoader);
    }
}
