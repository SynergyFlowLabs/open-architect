package io.sentry.config;

import io.sentry.util.h0;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f305294a = "SENTRY";

    d() {
    }

    @NotNull
    private String h(@NotNull String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.g
    @NotNull
    public Map<String, String> e(@NotNull String str) {
        String strJ;
        String str2 = h(str) + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str2) && (strJ = h0.j(entry.getValue(), "\"")) != null) {
                concurrentHashMap.put(key.substring(str2.length()).toLowerCase(Locale.ROOT), strJ);
            }
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.g
    @Nullable
    public String getProperty(@NotNull String str) {
        return h0.j(System.getenv(h(str)), "\"");
    }
}
