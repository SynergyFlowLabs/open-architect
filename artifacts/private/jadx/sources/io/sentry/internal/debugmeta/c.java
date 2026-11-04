package io.sentry.internal.debugmeta;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.ILogger;
import io.sentry.util.e;
import io.sentry.y7;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ILogger f305616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ClassLoader f305617b;

    public c(@NotNull ILogger iLogger) {
        this(iLogger, c.class.getClassLoader());
    }

    @Override // io.sentry.internal.debugmeta.a
    @Nullable
    public List<Properties> a() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f305617b.getResources(e.f306952a);
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(urlNextElement);
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStreamOpenStream);
                        arrayList.add(properties);
                        this.f305616a.c(y7.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (Throwable th2) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (RuntimeException e10) {
                    this.f305616a.b(y7.ERROR, e10, "%s file is malformed.", urlNextElement);
                }
            }
        } catch (IOException e11) {
            this.f305616a.b(y7.ERROR, e11, "Failed to load %s", e.f306952a);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        this.f305616a.c(y7.INFO, "No %s file was found.", e.f306952a);
        return null;
    }

    c(@NotNull ILogger iLogger, @Nullable ClassLoader classLoader) {
        this.f305616a = iLogger;
        this.f305617b = io.sentry.util.c.a(classLoader);
    }
}
