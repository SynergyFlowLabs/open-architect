package io.sentry;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final URL f306582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f306583b;

    public q4(@NotNull String str, @NotNull Map<String, String> map) {
        io.sentry.util.y.c(str, "url is required");
        io.sentry.util.y.c(map, "headers is required");
        try {
            this.f306582a = URI.create(str).toURL();
            this.f306583b = map;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e10);
        }
    }

    @NotNull
    public Map<String, String> a() {
        return this.f306583b;
    }

    @NotNull
    public URL b() {
        return this.f306582a;
    }
}
